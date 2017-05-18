package com.linkedgrails

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

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
        expect: "Que verdadeiro seja verdadeiro!"
        true == true
    }

    void "Listar pessoas em banco vazio retorna lista vazia"() {
        expect: "Ao listar pessoas em um banco vazio, o retorno será uma lista vazia"
        Pessoa.list() == []

        and: "O tamanho da lista deve ser 0"
        Pessoa.list().size() == 0
    }

    void "Listar pessoas em banco vazio retorna lista vazia usando when-then"() {
        when: "Lista as pessoas em um banco vazio, o retorno será uma lista vazia"
        List<Pessoa> pessoas = Pessoa.list()

        then: "A lista deve ser vazia"
        pessoas.empty

        and: "Deve ter tamanho O"
        pessoas.size() == 0
    }

    void "Listar pessoas em banco com 2 pessoas cadastradas retorna uma lista com as duas pessoas"() {
        setup: "Cadastrar duas pessoas"
        Pessoa pessoa1 = new Pessoa().save(validate: false)
        Pessoa pessoa2 = new Pessoa().save(validate: false)

        when: "Lista as pessoas do banco"
        def pessoas = Pessoa.list()

        then: "A lista contém as duas pessoas"
        pessoas.containsAll(pessoa1, pessoa2)
    }

    void "Validar nomes de pessoas só aceita nomes com menos de 10 caracteres"() {
        when: "Cria uma nova pessoa"
        Pessoa pessoa = new Pessoa(nome: nomeAvaliado)

        and: "Valida seu nome"
        def resultadoObtido = pessoa.validate(['nome'])

        then: "O resultado esperado tem que ser igual o obtido"
        resultadoObtido == resultadoEsperado

        where:
        nomeAvaliado  || resultadoEsperado
        "A"           || true
        "1234567890"  || true
        "12345678901" || false
    }

    @Unroll
    void "Validar nome #nomeAvaliado retorna resultado #resultadoEsperado"() {
        when: "Cria uma nova pessoa"
        Pessoa pessoa = new Pessoa(nome: nomeAvaliado)

        and: "Valida seu nome"
        def resultadoObtido = pessoa.validate(['nome'])

        then: "O resultado esperado tem que ser igual o obtido"
        resultadoObtido == resultadoEsperado

        where:
        nomeAvaliado  || resultadoEsperado
        "A"           || true
        "1234567890"  || true
        "12345678901" || false
    }
}
