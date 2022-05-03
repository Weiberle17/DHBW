"use strict"
var x=1;
var y=1;
document.getElementById("b1").addEventListener("click", toggleTable1);
document.getElementById("b2").addEventListener("click", toggleTable2);

function toggleTable1() {
    if (x == 0) {
        document.getElementById("herren1").style.display="none";
        document.getElementById("legende1").style.display="none";
        document.getElementById("legende2").style.display="none";
        document.getElementById("b1").innerHTML="Anzeigen";
        x = 1;
    } else if (x == 1) {
        document.getElementById("herren1").style.display="block";
        document.getElementById("legende1").style.display="block";
        document.getElementById("legende2").style.display="block";
        document.getElementById("b1").innerHTML="Verbergen";
        x = 0;
    }
}
function toggleTable2() {
    if (y == 0) {
        document.getElementById("herren2").style.display="none";
        document.getElementById("legende3").style.display="none";
        document.getElementById("legende4").style.display="none";
        document.getElementById("b2").innerHTML="Anzeigen";
        y = 1;
    } else if (y == 1) {
        document.getElementById("herren2").style.display="block";
        document.getElementById("legende3").style.display="block";
        document.getElementById("legende4").style.display="block";
        document.getElementById("b2").innerHTML="Verbergen";
        y = 0;
    }
}