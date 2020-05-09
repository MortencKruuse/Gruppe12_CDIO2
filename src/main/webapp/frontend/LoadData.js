function getAllUsers(id) {
    JSONGet("rest/person/get-users",id)
}
JSONGet = function (url, id) {
    const obj = { table: "customers", limit: 20 };
    const param = JSON.stringify(obj);
    const request = new XMLHttpRequest();
    request.onreadystatechange = function (){
        if (this.readyState === 4 && this.status === 200){
            var currentObj = JSON.parse(this.responseText);
            var txt = "<table>"+
                "<th>Username</th>" +
                "<th>Initialer</th>"+
                "<th>CPR</th>"+
                "<th>Password</th>"+
                "<th>Role</th>";
            for (x in currentObj){
                txt += "<tr>" +
                    "<td>"+ currentObj[x].username +"</td>" +
                    "<td>"+ currentObj[x].ini +"</td>" +
                    "<td>"+ currentObj[x].cpr +"</td>" +
                    "<td>"+ currentObj[x].password +"</td>" +
                    "<td>"+ currentObj[x].role +"</td>" +
                    "</tr>"
            }
            txt += "</table>";
            //document.getElementById(id).innerHTML = "<p>" + this.responseText + "</p>";
            document.getElementById(id).innerHTML = txt;
        }
    };
    request.open("GET",url,true);
    request.send("x= " + param);
};
