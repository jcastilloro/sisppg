$(document).ready(function () {
    
    $("#1843570").change(func)
            .change();

});


function func(){

    $("#18435702").attr('selectedIndex', '0');
    $(".periodo").hide();
    if($("#1843570 option:selected")[0].value != 0){
        $(".pp"+$("#1843570 option:selected")[0].id).show();
    }

}
