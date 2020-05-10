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
                    "<td><button type=\"button\" onclick=\"JSONDelete(" + div + "," + objects[i].userID + ")\">Delete user</button></td>" +
                    "</tr>"
            }
            txt += "</table>";
            document.getElementById("userList").innerHTML = txt;
        }
    };
    request.open("GET", url, true);
    request.send("x= " + param);
};

JSONDelete = function (div,id) {
    const request = new XMLHttpRequest();
    request.open("PUT", "rest/person/delete-user/?id=" + id, true);
    request.setRequestHeader('Content-type','application/json; charset=utf-8');
    request.onload = function () {
        //alert("readyState=" + request.readyState+ "\nstatus=" +  request.status);
        if (request.readyState === 4 && request.status === 204){
            getAllUsers();
        }
    };
    request.send();
};
