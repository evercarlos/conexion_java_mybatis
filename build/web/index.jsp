<%-- 
    Document   : index
    Created on : 23/10/2018, 07:43:59 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WEBs</title>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<link href="public/css/jtable/jtable.css" rel="stylesheet">
<link href="public/css/jtable/jtable_jqueryui.min.css" rel="stylesheet">
<link href="public/css/jtable/jquery-ui.css" rel="stylesheet">
<link href="public/css/i-check/icheck.css" rel="stylesheet">


    <script>
        var width_page = (screen.width > 480) ? 480 : 320;
        var base_url = '{{ url('/') }}';

        var show_list_ = !(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent));

    </script>
    </head>
    <body>
        <div class="row">
            <br>
            <div class="col-sm-2"></div>
            <div class="col-sm-1">
                <button class="btn btn-primary" id="btn_load">Cargar</button>
            </div>
            <div class="col-sm-8">
                <div id="load_url"></div>
            </div>
        </div>
    </body>
     <script src="public/js/jquery.min.js"></script>
     <script src="public/js/jquery-ui.min.js"></script><!-- hik.jtable= para el error-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   
    <script src="public/js/jquery.jtable.js"></script>  
    <script src="public/js/jquery.jtable.es.js"></script>  
    <script src="public/js/icheck.min.js"></script>  
    <script src="public/js/admin.js"></script>
    <script src="public/frontend/profiles.js"></script>
    <script src="public/frontend/profilesForm.js"></script>
</html>
