"use strict"
var x=0;
document.getElementById("b3").addEventListener("click", showTeam);

function showTeam() {
    if (x == 1) {
        location.reload();
    } else {
        if (document.getElementById("check1").checked) {
            document.getElementById("herren").style.display="block";
        }
        if (document.getElementById("check2").checked) {
            document.getElementById("damen").style.display="block";
        }
        if (document.getElementById("check3").checked) {
            document.getElementById("jugend").style.display="block";
        } 
        document.getElementById("b3").innerHTML="Verbergen";
        x++;
    }
}