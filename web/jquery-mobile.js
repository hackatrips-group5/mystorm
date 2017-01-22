$(document).ready(function() {
    $("input[type=submit]").click(function(e) {
        var name = $("#name").val();
        var email = $("#email").val();
        var city = $("#city").val();
        var days = $("#days").val();
        var placeQuantity = $("#placeQuantity").val();
        if (name == '' || email == '' || city == '' || days == '' || placeQuantity == '')
        {
            e.preventDefault();
            alert("Please Fill Required Fields");
        }
    });
});


$(window).load(function(){
(function( $ ){
 
     $.fn.multipleInput = function() {
 
          return this.each(function() {
 
               // create html elements
 
               // list of email addresses as unordered list
               $list = $('<ul/>');
 
               // input
               var $input = $('<input type="text"/>').keyup(function(event) {
 
                    if(event.which == 32 || event.which == 188) {
                         // key press is space or comma
                        var val = $(this).val().slice(0, -1); // remove space/comma from value
 
                         // append to list of emails with remove button
                         $list.append($('<li class="multipleInput-email"><span> ' + val + '</span></li>')
                              .append($('<a href="#" class="multipleInput-close" title="Remove">x</a>')
                                   .click(function(e) {
                                        $(this).parent().remove();
                                        e.preventDefault();
                                   })
                              )
                         );
                         $(this).attr('placeholder', '');
                         // empty input
                         $(this).val('');
                    }
 
               });
 
               // container div
               var $container = $('<div class="multipleInput-container" />').click(function() {
                    $input.focus();
               });
 
               // insert elements into DOM
               $container.append($list).append($input).insertAfter($(this));
 
               // add onsubmit handler to parent form to copy emails into original input as csv before submitting
               var $orig = $(this);
               $(this).closest('form').submit(function(e) {
 
                    var emails = new Array();
                    $('.multipleInput-email span').each(function() {
                         emails.push($(this).html());
                    });
                    emails.push($input.val());
 
                    $orig.val(emails.join());
 
               });
 
               return $(this).hide();
 
          });
 
     };
})( jQuery );

$(document).ready(function() {
  $('#btnDel').attr('disabled','disabled');
  $('#btnAdd').click(function() {
    var num = $('.clonedInput').length; // how many "duplicatable" input fields we currently have
    var newNum = new Number(num + 1); // the numeric ID of the new input field being added
 
    // create the new element via clone(), and manipulate it's ID using newNum value
    var newElem = $('#input' + num).clone().attr('id', 'Add' + newNum);
 
    // manipulate the name/id values of the input inside the new element
    newElem.children(':last').attr('id', 'name' + newNum).attr('name', 'name' + newNum);
 
    // insert the new element after the last "duplicatable" input field
    $('#input' + num).after(newElem);
 
    // enable the "remove" button
    $('#btnDel').attr('disabled',false);
 
    // business rule: you can only add 10 names
    if (newNum == 10)
      $('#btnAdd').attr('disabled','disabled');
  });
 
  $('#btnDel').click(function() {
    var num = $('.clonedInput').length; // how many "duplicatable" input fields we currently have
    $('#input' + num).remove(); // remove the last element
 
    // enable the "add" button
    $('#btnAdd').attr('disabled',false);
 
    // if only one element remains, disable the "remove" button
    if (num-1 == 1)
      $('#btnDel').attr('disabled','disabled');
  });
 
});
