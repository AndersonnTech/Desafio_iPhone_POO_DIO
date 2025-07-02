 classDiagram
    
    class ReprodutorMusical {
        +tocar(String "Tocando musica")
        +pausar(String "Musica pausada")
        +selecionarMusica(String "Musica selecionada")
    }

    class AparelhoTelefonico {
        +ligar(String "ligando para o numero")
        +atender(String "Chamada atendida")
        iniciarCorreioVoz(String "Reproduzindo correio de voz")
    }

    class NavegadorInternet {
        +exibirPagina(String "Exibindo pagina url:")
        +adicionarNovaAba(String "Nova aba adicionada")
        +atualizarPagina(String "Atualizando pagina")
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet