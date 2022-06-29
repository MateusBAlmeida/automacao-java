#language: pt
#enconding: UTF-8

Funcionalidade: Login

Cenário: Usuário inválido
Quando eu informar um usuario "ad"
E informar a senha "asd"
E clicar no botao login
Entao o sistema exibe a mensagem de usuario invalido

Cenário: Realizar Login
Quando eu informar um usuario "Admin"
E informar a senha "admin123"
E clicar no botao login
Entao o sistema exibe um usuario logado