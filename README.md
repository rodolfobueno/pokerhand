# pokerhand
Projeto para simular jogo de Poker.

# Regras Implementadas até o momento:
* Royal Flush
* Straight Flush

# Adicionando uma nova regra:
* Crie uma classe no pacote br\com\zgsolucoes\pokerhand\domain\rule que implementa a interface Rule.
* Codifique sua regra negocial no método match()
* Crie um checker para a sua nova regra no pacote br\com\zgsolucoes\pokerhand\domain\checker
* Instancie um objeto da sua nova regra no método getRule()

# Como funciona
* A classe PokerHand deverá ser utilizada para fazer a validação do jogo a partir de duas mãos de cartas
* O método compareWith realizará a criação da cadeia de regras (Rule) existentes no jogo através do builder CheckersBuilder.
* O sistema irá iniciar a validação a partir da regra mais forte para a mais fraca até encontrar o resultado da partida.
