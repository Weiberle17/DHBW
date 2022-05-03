"use strict"
document.getElementById("angebote").addEventListener("change", showAngebot);
document.getElementById("b4").addEventListener("click", hideAngebot);

function showAngebot() {
    var value = document.getElementById("angebote").value;
    if (value == 1) {
        document.getElementById("eltern").style.display="block";
    } else if (value == 2) {
        document.getElementById("ganzkoerper").style.display="block";
    } else if (value == 3) {
        document.getElementById("superFitness").style.display="block";
    } else if (value == 4) {
        document.getElementById("skigymnastik").style.display="block";
    } else if (value == 5) {
        document.getElementById("freizeit").style.display="block";
    } else if (value == 6) {
        document.getElementById("yoga").style.display="block";
    } else if (value == 7) {
        document.getElementById("cardio").style.display="block";
    } else if (value == 8) {
        document.getElementById("manner").style.display="block";
    }
}

function hideAngebot() {
    document.getElementById("eltern").style.display="none";
    document.getElementById("ganzkoerper").style.display="none";
    document.getElementById("superFitness").style.display="none";
    document.getElementById("skigymnastik").style.display="none";
    document.getElementById("freizeit").style.display="none";
    document.getElementById("yoga").style.display="none";
    document.getElementById("cardio").style.display="none";
    document.getElementById("manner").style.display="none";
}