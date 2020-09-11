function displayTeams() {
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-type") === "application/json") {
                console.log("JSON: " + req.responseText);
                let content = JSON.parse(req.response);
                content.forEach(el => {
                    let elem = document.createElement('div');
                    let header = document.createElement('h4');
                    let teamId = el.tid;
                    header.textContent = "Team name: " + el.teamName + " id: " + teamId;
                    elem.appendChild(header);
                    el.players.forEach(player => {
                        let info = document.createElement('p');
                        info.textContent = "Name: " + player.name + " Position: " + player.position + " Age: " + player.age + " id: " + player.id;
                        elem.appendChild(info);
                    })
                    document.body.appendChild(elem);
                });
            } else {
                console.log("Doesn't seem to be JSON... " + req.responseText);
            }
        } else {
            console.log("Oh no... handle error");
        }
    };
    req.open("GET", "http://35.234.158.15:8080/viewAllTeams");
    req.send();
}