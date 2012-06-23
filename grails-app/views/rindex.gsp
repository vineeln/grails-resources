<!doctype html>
<html>
   <head>
      <meta name="layout" content="main"/>
      <r:require modules="nb.js, blueprint"/>
      <g:if test="${params.brand}">
        <r:require modules="nbos.brand.${params.brand}"/>
      </g:if>
      <r:script>
        $(function() {
          $('#form').dialog({
           open: function() {  $('<p>Have a Wonderful Day!!</p>').appendTo(this); },
           title: 'Hello from JQuery'
          });
        });
      </r:script>
   </head>
   <body>
      <div id="form">
           Hello World
      </div> 
   <body>
</html
