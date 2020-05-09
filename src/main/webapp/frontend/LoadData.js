function getUser(id) {
    JSONGet("rest/test",id)
}
JSONGet = function (url, id) {
    const request = new XMLHttpRequest();
    request.onreadystatechange = function (){
        if (this.readyState === 4 && this.status === 200){
            document.getElementById(id).innerHTML = "<p>" + this.responseText + "</p>";
        }
    };
    request.open("GET",url,true)
    request.send();
};
