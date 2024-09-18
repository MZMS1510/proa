// Meu Código

const naturalidade = {
    RO: "Rondoniano",
    AC: "Acriano",
    AM: "Amazonense",
    RR: "Roraimense",
    PA: "Paraibano",
    AP: "Amapaense",
    TO: "Tocantinense",
    MA: "Maranhense",
    PI: "Piauiense",
    CE: "Cearense",
    RN: "Potiguar",
    PB: "Paraibano",
    PE: "Pernambucano",
    AL: "Alagoano",
    SE: "Sergipano",
    BA: "Baiano",
    MG: "Mineiro",
    ES: "Capixaba",
    RJ: "Fluminense",
    SP: "Paulista",
    PR: "Paraense",
    SC: "Catarinense",
    RS: "Gaúcho",
    MS: "Sul-mato-grossense",
    MT: "Mato-grossense",
    GO: "Goiano",
    DF: "Brasiliense",
}

function escreverNaturalidade(uf) {
    document.getElementById("mensagem").innerHTML = "Este CEP é: " + naturalidade[uf];
}

// ViaCEP

function limparForm() {
    //Limpa valores do formulário de cep.
    document.getElementById('estado').value         = "";
    document.getElementById('cidade').value         = "";
    document.getElementById('bairro').value         = "";
    document.getElementById('rua').value            = "";
    document.getElementById('complemento').value    = "";
    document.getElementById('complemento').value    = "";
}

function preencherEndereco(conteudo) {
    if (!("erro" in conteudo)) {
        //Atualiza os campos com os valores.
        document.getElementById('estado').value = conteudo.estado;
        document.getElementById('cidade').value = conteudo.localidade;
        document.getElementById('bairro').value = conteudo.bairro;
        document.getElementById('rua').value = conteudo.logradouro;
        document.getElementById('complemento').value = conteudo.complemento;
        document.getElementById('uf').value = conteudo.uf

        escreverNaturalidade(conteudo.uf);
    }
    else {
        //CEP não Encontrado.
        limparForm();
        alert("CEP não encontrado.");
    }
}

function pesquisaCep(valor) {

    //Nova variável "cep" somente com dígitos.
    let cep = valor.replace(/\D/g, '');

    //Verifica se campo cep possui valor informado.
    if (cep != "") {

        //Expressão regular para validar o CEP.
        let validaCep = /^[0-9]{8}$/;

        //Valida o formato do CEP.
        if (validaCep.test(cep)) {

            //Cria um elemento javascript.
            var script = document.createElement('script');

            //Sincroniza com o callback.
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=preencherEndereco';

            //Insere script no documento e carrega o conteúdo.
            document.body.appendChild(script);

        }
        else {
            //cep é inválido.
            limparForm();
            alert("Formato de CEP inválido.");
        }
    }
    else {
        //cep sem valor, limpa formulário.
        limparForm();
    }
};