package com.linkedgrails

import grails.converters.XML

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        flash.message = "Teste"
        redirect(controller: "grupo", action: "index", params: ['max':5])
    }
}
