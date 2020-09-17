function editPlayer() {
    let elements = document.getElementById("editPlayer").elements;
    let obj = {};
    for(let i = 0 ; i < elements.length - 1 ; i++) {
        let item = elements.item(i);
        obj[item.name] = item.value;
    }
    let playerId = obj.pid;
    const req = new XMLHttpRequest();
    req.open("PUT", "http://34.89.6.97:8080/updatePlayer?id=" + playerId);
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({ name: obj.name, position: obj.position, age: obj.age } ));
}
