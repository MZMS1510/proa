const body = document.body;
const image = document.querySelector("#my-image")

function trocarVerde() {
    body.style.backgroundColor = "rgb(0, 100, 0)";
    body.style.color = "white";
    image.src = "images/sol 1.png";
}

function trocarAzul() {
    body.style.backgroundColor = "blue";
    body.style.color = "white";
    image.src = "images/lua.jpg";
}

function trocarPadrao() {
    body.style.backgroundColor = "bisque";
    body.style.color = "rgb(69, 4, 4)";
    image.src = "images/sol.jpg";

}