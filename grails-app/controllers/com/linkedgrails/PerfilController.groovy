package com.linkedgrails

import grails.converters.XML

class PerfilController {

    def meuPerfil(Pessoa pessoa) {
        respond pessoa, model: [informacaoExtra1: 'info1', informacaoExtra2: 'info2']
    }
}
