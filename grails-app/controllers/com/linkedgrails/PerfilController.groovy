package com.linkedgrails

import grails.converters.XML

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        flash.message = "Teste"

        println params

        respond pessoa, model: [informacaoExtra1: "info1",informacaoExtra2: "info2"]
//        redirect(controller: "grupo", action: "index", params: ['max':5])
    }
}
