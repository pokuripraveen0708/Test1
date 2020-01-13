$(document).ready(function(){
  $("#userName").on("click", function(){
  var name = $('#userName').val();
            $.get('test', {
                    userName : name
            }, function(responseText) {
                    $('#ajaxGetUserServletResponse').text(responseText);
            });
  });
});