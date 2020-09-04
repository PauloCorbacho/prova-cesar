#language: pt
#Característica: Como um usuário quero imprimir alguns itens da tela de demo
Funcionalidade: Imprimir valores da tela de demo

  Esquema do Cenário: Validando as saídas de alguns itens do site
    Dado que o usuário está acessando a seguinte página "<página>"
    E o botão demo é pressionado
    Quando o usuário pressiona o botão de scroll do mouse até o final da página
    Então a impressão da descrição dos itens bloqueados será apresentada
    E a impressão dos itens por categoria
    E o usuário imprime o tópico com maior número de views

    Exemplos:
      | página                     |
      | https://www.discourse.org/ |




