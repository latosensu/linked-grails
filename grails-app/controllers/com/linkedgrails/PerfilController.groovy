package com.linkedgrails

import grails.converters.JSON

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        render pessoa.nome
    }
}
