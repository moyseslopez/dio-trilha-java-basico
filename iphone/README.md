![image](https://github.com/user-attachments/assets/1646ba14-89ad-4daf-95e7-fa8cf2628992)

Memaid Code:
classDiagram
    class ReprodutorMusical {
        +selecionarMusica(String musicaSelecionada, ArrayOfMusica musicas)
        +carregaMusicasElegiveis(ArrayOfMusica musicas)
        +tocar()
        +pausar()
        +avancar()
        +retroceder()
    }

    class Musica {
        -nome
        +getNome()
        +setNome()
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +desligar()
        +iniciarCorreioVoz()
        +pesquisaLigaContato(String nomeContato, ArrayOfContato contatos)
    }

    class Contato {
        -nome
        -numero
        +getNome()
        +getNumero()
    }

    class NavegadorInternet {
        +abreNavegador(String navegador)
        +exibirPagina(String url)
        +atualizarPagina()
        +selecionaAba(String aba)
        +adicionarNovaAba()
    }

    class iPhone {
    }


    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

    ReprodutorMusical --> Musica
    AparelhoTelefonico --> Contato
