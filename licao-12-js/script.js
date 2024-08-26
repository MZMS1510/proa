// Funcão é uma sequência de comandos
function showCamada1() {
    document.getElementById("camada1").style.visibility = "visible";
    document.getElementById("camada2").style.visibility = "hidden";
    document.getElementById("camada3").style.visibility = "hidden";
}

function showCamada2() {
    document.getElementById("camada1").style.visibility = "hidden";
    document.getElementById("camada2").style.visibility = "visible";
    document.getElementById("camada3").style.visibility = "hidden";
}

function showCamada3() {
    document.getElementById("camada1").style.visibility = "hidden";
    document.getElementById("camada2").style.visibility = "hidden";
    document.getElementById("camada3").style.visibility = "visible";
}

function someTudo() {
    document.getElementById("camada1").style.visibility = "hidden";
    document.getElementById("camada2").style.visibility = "hidden";
    document.getElementById("camada3").style.visibility = "hidden";
}

document.getElementById("camada1").style.transition = "2s all ease";