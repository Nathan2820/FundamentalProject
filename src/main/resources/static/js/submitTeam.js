function submitTeam() {
    let elements = document.getElementById("teamForm").elements;
    let obj = {};
    let item = elements.item(0);
    obj[item.name] = item.value;
    const req = new XMLHttpRequest();
    req.open("POST", "http://34.89.6.97/createTeam");
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.setRequestHeader("Content-type", "application/json;charset=UTF-8");
    //alert(obj.name + " is the team name");
    req.send(JSON.stringify({ teamName : obj.name }));
}
