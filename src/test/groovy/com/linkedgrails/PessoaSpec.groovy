package com.linkedgrails

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Pessoa)
class PessoaSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"Que verdadeiro seja verdadeiro!"
        true == true
    }

    void "Listar pessoas em banco vazio retorna lista vazia"() {
        expect: "Ao listar pessoas em um banco vazio, o retorno será uma lista vazia"
        Pessoa.list() == []
    }
}
