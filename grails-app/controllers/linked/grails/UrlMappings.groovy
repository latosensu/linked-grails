package linked.grails

class UrlMappings {

    static mappings = {


        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/meuPerfil/$id(.$format)?"(
                controller: 'perfil',
                action: 'meuPerfil'
        )

        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')


    }
}
