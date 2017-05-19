package com.linkedgrails

import grails.converters.JSON

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        println pessoa.properties
    }
}
