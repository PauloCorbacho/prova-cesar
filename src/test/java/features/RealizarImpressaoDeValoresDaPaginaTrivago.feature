#language: pt
#Característica: Como um usuário quero realizar uma busca e imprimir as comodidades de um hotel específico
Funcionalidade: Imprimir valores da trivago

  Esquema do Cenario: Validando as saídas do site trivago
    Dado que o usuário está acessando a seguinte página "<página>"
    E o usuário preenche o valor "<destino>" no campo de pesquisa
    E o usuário pressiona o botao de pesquisar
    E o usuário diminui a quantidade de quartos "<quantidadeAdultosPorQuarto>"
    E o usuário ordena a pesquisa por "<OrdenarPor>"
    E o usuário imprime o nome do hotel "<IndiceHotel>"
    E o usuário imprime a quantidade de estrelas da avaliação "<IndiceHotel>"
    E o usuário imprime o site da oferta "<IndiceHotel>"
    E o usuário imprime o valor do quarto "<IndiceHotel>"
    E o usuário pressiona na localização "<IndiceHotel>"
    Quando o usuário pressiona o botão visualizar todas as comodidades "<IndiceHotel>"
    Entao todas as informações sobre comodidades serão apresentadas

    Exemplos:
      | página                    | destino | OrdenarPor        | IndiceHotel | quantidadeAdultosPorQuarto |
      | http://www.trivago.com.br | Natal   | Somente distância | 1           | 0                          |
