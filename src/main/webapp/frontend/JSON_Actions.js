function getAllUsers(divElement) {
    JSONGet("rest/person/get-users", divElement)
}

function postAnUser(){
    var username = document.getElementById("uname").value;

    var ini =      document.getElementById("ini").value;
    var cpr =      document.getElementById("cpr").value;
    var password = document.getElementById("password").value;
    var role = "Dummy";
    if(document.getElementById("Pharmaceut").checked){
        role = "Pharmaceut";
    }

    if(document.getElementById("Admin").checked){
        role = "Admin";
    }

    if(document.getElementById("Produktionsleder").checked){
        role = "Produktionsleder";
    }
    if(document.getElementById("Laborant").checked){
        role = "Laborant";
    }
    JSONPostUser("rest/person/create-user", username, ini, cpr, password, role);
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
            document.getElementById(div).innerHTML = txt;
        }
    };
    request.open("GET", url, true);
    request.send("x= " + param);
};

JSONDelete = function (div,id) {
    const request = new XMLHttpRequest();
    request.open("PUT", "rest/person/delete-user", true);
    request.setRequestHeader('Content-Type','application/json; charset=utf-8');
    request.onload = function () {
        if (request.readyState === 4){
            getAllUsers(div);
        }
    };
    alert(id)
    request.send(JSON.stringify(id));


};

JSONPostUser = function (url, username, ini, cpr, password, role){
    const request = new XMLHttpRequest();
    request.open("POST", url, true);
    var user = {"userID": 0, //Dummy id
        "username":username,
        "ini":ini,
        "cpr":cpr,
        "password":password,
        "role":role
    }
    var sendStr = JSON.stringify(user);
    request.setRequestHeader('Content-Type','application/json; charset=utf-8');
    request.setRequestHeader('Content-Length',sendStr.length);
    request.onreadystatechange = function() {
        if(request.readyState == 4 && request.status == 200) {
            alert(request.responseText);
        }
    }
    request.send(sendStr);

}
