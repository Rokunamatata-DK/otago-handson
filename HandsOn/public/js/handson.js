/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var clicker = document.getElementById("clicker");
var modal = document.getElementById("modal");

clicker.onclick = function() {
    modal.style.display = "block";
};

window.onclick = function() {
    modal.style.display = "none";
};
