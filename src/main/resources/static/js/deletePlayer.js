function deletePlayer() {
    let elements = document.getElementById("deletePlayer").elements;
    let obj = {};
    let item = elements.item(0);
    obj[item.name] = item.value;
    const req = new XMLHttpRequest();
    let id = obj.pid;
    alert(id);
    req.open("DELETE", "http://localhost:8080/deletePlayer/" + id);
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-type", "application/json;charset=UTF-8");
    req.send();
}
