const invetarioDrofo = [
    "anel da invisibilidade",
    "par de botas mágicas",
    "par de botas mágicas",
    "poção do sono",
    "poção da inocência",
    "poção da inocência"
]

const invetarioTorper = [
    "capa da invisibilidade",
    "pedra do despertar",
    "varinha das varinhas",
    "poção da inocência",
    "poção da mentira",
    "poção da mentira",
    "poção anti-inteligência"
]

let index = 0

// ========================= Torper =========================

// Torper consumiu uma das poções da mentira
index = invetarioTorper.indexOf("poção da mentira");
invetarioTorper.splice(index, 1);

// Perdeu sua pedra
index = invetarioTorper.indexOf("pedra do despertar");
invetarioTorper.splice(index, 1);

// Ganhou um par de botar mágicas do Drofo
index = invetarioDrofo.indexOf("par de botas mágicas");
invetarioDrofo.splice(index, 1);
invetarioTorper.push("par de botas mágicas");

// Achou um escudo mágico e uma espada mágica. 
invetarioTorper.push("escudo mágico");
invetarioTorper.push("espada mágica");

// ========================= Drofo =========================

// Ganhou mais uma bota mágica
invetarioDrofo.push("par de botas mágicas");

// Usou sua poção do sono
index = invetarioDrofo.indexOf("poção do sono");
invetarioDrofo.splice(index, 1);

// Consumiu a poção anti-inteligência do Torper
index = invetarioTorper.indexOf("poção anti-inteligência");
invetarioTorper.splice(index, 1);

// Encontrou um ovo de dragão e uma coxinha
invetarioDrofo.push("ovo de dragão");
invetarioDrofo.push("coxinha");

console.log(invetarioTorper);
console.log(invetarioDrofo);