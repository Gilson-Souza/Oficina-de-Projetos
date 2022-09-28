let seuVotoPara = document.querySelector('.sup-voto');
let cargo = document.querySelector('.sup-cand');
let descricao = document.querySelector('.sup-info');
let aviso = document.querySelector('.inferior-tela');
let lateral = document.querySelector('.sup-imagens');
let numeros = document.querySelector('.tecla-sup');
// aqui acima eu tenho o controle de tudo que está na tela da urna 
// desta forma eu posso tirar e botar o que eu quiser partindo desses comandos
// utilizando o console e aplicando os comandos

let etapaAtual = 0;
let numero = '';
let votoBranco = false;
let votos = [];

function comecarEtapa() {
    let etapa = etapas[etapaAtual];

    let numeroHtml = '';
    numero = '';
    votoBranco = false;


    for (let i=0;i<etapa.numeros;i++) {
        if (i === 0) {
            numeroHtml += '<div class="numero pisca"></div>';
        } else {
            numeroHtml += '<div class="numero"></div>'
        }
    }

    seuVotoPara.style.display = 'none';
    cargo.innerHTML = etapa.titulo;
    descricao.innerHTML = '';
    aviso.style.display = 'none';
    lateral.innerHTML = '';
    numeros.innerHTML = numeroHtml;
}

function atualizaInterface() {
    let etapa = etapas[etapaAtual];
    let candidato = etapa.candidatos.filter((item)=>{
        if(item.numero === numero) {
            return true;  
        } else {
            return false;
        }
    });
    if (candidato.length > 0) {
        candidato = candidato[0];
        seuVotoPara.style.display = 'block';
        aviso.style.display = 'block';
        descricao.innerHTML = `Nome: ${candidato.nome}<br/>Partido: ${candidato.partido}`;
        let fotosHTML = '';
        for(let i in candidato.fotos) {
            if (candidato.fotos[i].small) {
                fotosHTML += `<div class="sup-1-image small"><img src="imagens/${candidato.fotos[i].url}"" alt="" /></div>`
            } else {
                fotosHTML += `<div class="sup-1-image"><img src="imagens/${candidato.fotos[i].url}"" alt="" /></div>`
            }
           
        }
        lateral.innerHTML = fotosHTML; 
    } else {
        seuVotoPara.style.display = 'block';
        aviso.style.display = 'block';
        descricao.innerHTML = '<div class="aviso--grande pisca">VOTO NULO</div>';
    }
}

function clicou(n) {
    let elNumero = document.querySelector('.numero.pisca');
    if (elNumero !== null) {
        elNumero.innerHTML = n;
        numero = `${numero}${n}`;

        elNumero.classList.remove('pisca');
        if (elNumero.nextElementSibling !== null) {
            elNumero.nextElementSibling.classList.add('pisca');
        } else {
            atualizaInterface();
        }
    }
}
function branco() {
        numero = '';
        votoBranco = true;

        seuVotoPara.style.display = 'block';
        aviso.style.display = 'block';
        numeros.innerHTML = '';
        descricao.innerHTML = '<div class="aviso--grande pisca">VOTO EM BRANCO</div>';
        lateral.innerHTML = '';
}
function corrige() {
    comecarEtapa();
}
function confirma() {
    let etapa = etapas[etapaAtual];

    let votoConfirmado = false;

    if(votoBranco === true) {
        votoConfirmado = true;
        votos.push({
            etapa: etapas[etapaAtual].titulo,
            voto: 'branco'
        });
    } else if(numero.length === etapa.numeros) {
        votoConfirmado = true;
        votos.push({
            etapa: etapas[etapaAtual].titulo,
            voto: numero
        });
    }

    if(votoConfirmado) {
        etapaAtual++;
        if(etapas[etapaAtual] !== undefined) {
            comecarEtapa();
        } else {
            document.querySelector('.container').innerHTML = '<div class="aviso--gigante pisca">FIM</div>';
            console.log(votos)
        }
    }
}
comecarEtapa();

































































































































































































