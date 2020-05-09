function getUser(id) {
    SetupFunctions.JSONGet("rest/test",id)
}
const SetupFunctions = {};
SetupFunctions.JSONGet = function (url, id) {
    var request = new XMLHttpRequest();
    request.onreadystatechange = function (){
        if (this.readyState === 4 && this.status === 200){
            document.getElementById(id).innerHTML = this.responseText;
        }
        request.open("GET",url,true)
        request.send();
    }
};
