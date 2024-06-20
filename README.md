<h1>Sistema de Autenticação e Autorização para E-commerce</h1>
<p>Este projeto foi desenvolvido para a avaliação de Arquitetura de Aplicações Web. Ele visa a implementação de uma API REST utilizando Spring Boot e autenticando com JWT (JSON Web Token). A API é configurada para o gerenciamento de usuários como (ADMIN, GERENTE, VENDEDOR e CLIENTE) e o controle dos acessos de forma segura.</p>

<h3>Resumo</h3>
<li>Ferramentas utilizadas</li>
<li>Endpoints disponíveis</li>
<li>Estrutura do Projeto</li>
<li>Autenticação</li>
<li>Respostas de retornos</li>
<li>Prints do Insomnia</li>
<li>Diagrama</li>

<h3>Ferramentas utilizadas</h3>
<li>IntelliJ IDEA Community Edition</li>
<li>Maven</li>
<li>Imsonia</li>
<li>Figma</li>

<h3>Endpoints disponíveis</h3>
<p>POST /login: Endpoint para obter uma autenticação JWT</p>
<p>GET /username/{token}: Rota que obtém o Token JWT para um usuário</p>
<p>GET /admin: Rota acessada apenas por um usuário ADMIN</p>
<p>GET /gerenteProduto: Rota acessada apenas por um usuário GERENTE</p>
<p>GET /vendedor: Rota acessada por vendedores, VENDEDOR</p>
<p>GET /cliente: Rota acessada para acesso de clientes, CLIENTE</p>

<h3>Estrutura do Projeto</h3>
<p>(Application) Onde rodaremos a aplicação</p>
<p>(Config) Onde é configurado os logins, permissoes e restrições de acesso</p>
<p>(Controller) Onde há controladores que lidam com as requisições HTTP</p>
<p>(Model) Onde temos as requisições</h5>
<p>(Security) Onde se faz operações relacionadas ao JWT </p>
<p>(Service) Onde ficam os serviços da aplicação </p>

<h3>Autenticação</h3>
<p>Este sistema utiliza o JWT (Jason Web Token) como método de autenticação utilizando uma chave Token JWT.</p>

<h3>Respostas de retornos</h3>
<p>[200 OK] Requisição autorizada com sucesso.</p>
<p>[401 Unautorizhed] Não autorizado, senha ou usuário incorreto.</p>
<p>[403 Forbidden] Usuário não possui autorização para este acesso.</p>

<h3>Prints do Insomnia</h3>

<h4>Login:</h4>

![Login](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/5172e8d7-2e9e-4528-95b4-3c9190342375)

<h4>Utilizando o Token:</h4>

![UsernameToken](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/be77d4af-ba4c-4e06-b1ef-0ea1e50bae1d)

<h4>Administrador:</h4>

![Admin](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/12697db2-d992-4438-a6a6-c9165f2a5ef9)

<h4>Usuario não autorizado:</h4>

![naoAutorizado](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/df53364c-9f56-4b34-9bae-0199c408c066)

<h4>Falha login administrador:</h4>

![falhaLogin](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/b2aa2409-1e88-410b-a2fc-cad9d1a55fd8)

<h4>Gerente:</h4>

![gerente](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/ebe1785c-9824-45fd-8f46-230d541948fc)

<h4>Vendedor:</h4>

![Vendedor](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/01a0d48b-1942-46d3-bdd8-deab22260018)

<h4>Cliente:</h4>

![Cliente](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/febea6a9-eccd-45b4-896c-9a7b203da505)

<h3>Diagrama</h3>

![diagrama](https://github.com/EdsonBuzetti/Av2_Arquitetura_Web/assets/126629330/7faa1e48-ea5e-4b21-88ef-3a1025dfcce4)

[Link do Figma](https://www.figma.com/board/LwO562JYKMkW54OcW0x3uA/Untitled?node-id=0-1&t=INgKBlkgwMHTj6TQ-0)
