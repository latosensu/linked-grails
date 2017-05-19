package com.linkedgrails

import grails.converters.XML

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        //respond pessoa, model: [informacaoExtra1: 'info1', informacaoExtra2: 'info2']
//        redirect(url: "http://www.ufscar.br")
        redirect(controller: "pessoa", action: "index", params: ['max':5])
    }
}
