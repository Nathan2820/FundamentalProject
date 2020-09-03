function submitPlayer() {
    let elements = document.getElementById("playerForm").elements;
    let obj = {};
    for(let i = 0 ; i < elements.length - 1 ; i++){
        let item = elements.item(i);
        obj[item.name] = item.value;
    }
    const req = new XMLHttpRequest();
    req.open("POST", "http://localhost:8080/createPlayer");
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-type", "application/json;charset=UTF-8");
    //alert("The tid is " + obj.tid);
    req.send(JSON.stringify({ name: obj.name, position: obj.position, age: obj.age, team:{ tid: Number(obj.tid)} }));
}