package com.linkedgrails

import grails.converters.XML

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        respond pessoa
    }
}
