
var btn = document.getElementById("btn");
btn.addEventListener("click",function () {
    var request = new XMLHttpRequest();
    request.open('GET','')

})
JQuary.ajax(
    {
        url: '<c:url value="/test" />',
        type: 'POST',
        dataType: JSON,
        cache: false,
        success: function (response) {
            alert("response = " + response);
        },
        error: function (jqXhr, textStatus, errorThrown) {
            alert(jqXhr);
            alert(textStatus);
            alert(errorThrown);
        }
    }
)