/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var callbacks={};
function load_url(url){
     $("#load_url").load(url,function(){
         if(url in callbacks)
             callbacks[url]();
     }); 
 }
 
 
function getFormSearch(form_id, input_id, btn_id) {
    return '<form class="form-inline" id="' + form_id + '" style="margin-bottom:-3px">' +
        '<div class="input-group input-group-sm">' +
        '<input type="text" id="' + input_id + '" name="search" class="form-control" autocomplete="off" placeholder="Buscar..." />' +
        '<span class="input-group-btn">' +
        '<button type="submit" id="' + btn_id + '" class="btn btn-success">' +
        '<i class="fa fa-search"></i>' +
        '</button>' +
        '</span>' +
        '</div>' +
        '</form>';
}

function generateSearchForm(form_id, btn_id, callback, is_click) {
    var btn = $('#' + btn_id);

    btn.click(function (e) {
        callback();
        e.preventDefault();
    });

    if (is_click) {
        btn.click();
    }

    $('#' + form_id).submit(function (e) {
        btn.click();
        e.preventDefault();
    });
}