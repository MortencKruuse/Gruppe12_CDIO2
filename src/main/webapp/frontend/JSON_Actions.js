function getAllUsers(divElement) {
    JSONGet("rest/person/get-users", divElement)
}

JSONGet = function (url, div) {
    const obj = {table: "Users", limit: 20};
    const param = JSON.stringify(obj);
    const request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (this.readyState === 4 && this.status === 200) {
            var objects = JSON.parse(this.responseText);
            var txt = "<table border='1'>" +
                "<th>User ID</th>" +
                "<th>Username</th>" +
                "<th>Initialer</th>" +
                "<th>CPR</th>" +
                "<th>Password</th>" +
                "<th>Role</th>" +
                "<th>Delete user</th>";
            for (let i in objects) {
                txt += "<tr>" +
                    "<td>" + objects[i].userID + "</td>" +
                    "<td>" + objects[i].username + "</td>" +
                    "<td>" + objects[i].ini + "</td>" +
                    "<td>" + objects[i].cpr + "</td>" +
                    "<td>" + objects[i].password + "</td>" +
                    "<td>" + objects[i].role + "</td>" +
                    "<td><button type=\"button\" onclick=\"JSONDelete("
                    + objects[i].userID + div + ")\">Delete user</button></td>" +
                    "</tr>"
            }
            txt += "</table>";
            document.getElementById(div).innerHTML = txt;
        }
    };
    request.open("GET", url, true);
    request.send("x= " + param);
};

JSONDelete = function (id,div) {
    alert("Success at delete object " + id);
    const request = new XMLHttpRequest();
    request.open("PUT", "rest/person/delete-user", true);
    request.setRequestHeader('Content-type','application/json; charset=utf-8');
    request.onload = function () {
        if (request.readyState === 4 && request.responseText === "201"){
            getAllUsers(div)
        }
    };
    request.send(JSON.stringify(id));


};
