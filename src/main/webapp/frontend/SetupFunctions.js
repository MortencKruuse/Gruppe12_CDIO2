const SetupFunctions ={};
SetupFunctions.JSONGet = function(url, success, error){
    $.ajax({
        url:url,
        method: 'GET',
        contentType: 'application/JSON',
        success: success,
        error: error
    })
};