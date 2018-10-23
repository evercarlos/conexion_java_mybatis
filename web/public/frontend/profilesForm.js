/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
callbacks['profiles'] = function () {
    
   
       var search = getFormSearch('frm-search-profile', 'search_p', 'LoadRecordsButtonProfile');

        var table_container_profile = $("#table_container_profile");

        table_container_profile.jtable({
            title: "Lista de Perfiles",
            paging: true,
            sorting: true,
            actions: {
                listAction:"./profiles?url=list",
                createAction: './profiles?url=create',
                updateAction: './profiles?url=update',
                deleteAction: './profiles?url=delete'
            },
            messages: {
                addNewRecord: 'Nuevo Perfil',
                editRecord: 'Editar Perfil'
            },
            toolbar: {
                items: [{
                    cssClass: 'buscador',
                    text: search
                }]
            },
            fields: {
                id: {
                    key: true,
                    create: false,
                    edit: false,
                    list: false
                },
                perfil: {
                    title: 'Perfil'
                }
            },
            formCreated: function (event, data) {
               // data.form.find('input[name="perfil"]').attr('onkeypress','return soloLetras(event)');
            },
            formSubmitting: function (event, data) {
                var bval = true;
              //  bval = bval && data.form.find('input[name="perfil"]').required();
                return bval;
            }
        });

        generateSearchForm('frm-search-profile', 'LoadRecordsButtonProfile', function(){
            table_container_profile.jtable('load', {
                search: $('#search_p').val()
            });
        }, true);
        
        
};

