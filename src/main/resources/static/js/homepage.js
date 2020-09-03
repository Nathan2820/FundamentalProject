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
                    header.textContent = "Team name: " + el.teamName;
                    elem.appendChild(header);
                    el.players.forEach(player => {
                        let info = document.createElement('p');
                        info.textContent = "Name: " + player.name + <br> + " Position: " + player.position + <br> + " Age: " + player.age;
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
    req.open("GET", "http://localhost:8080/viewAllTeams");
    req.send();
}