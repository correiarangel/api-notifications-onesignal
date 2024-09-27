### API de Notificações OneSignal 

[Linkedin Always On](https://www.linkedin.com/in/marcos-fabiano-correia-rangel/)

#### Flutter Developer

#### Apaixonado por desenvolvimento de software e LINUX!

### The only way to get to the impossible is to believe it's possible.

## 📝 Descrição

A **API de Notificações OneSignal** é uma ferramenta simples e eficiente para gerar e enviar notificações push individuais usando o serviço OneSignal.
Ela é ideal para facilitar os testes de notificações, ajudando desenvolvedores que utilizam OneSignal em seus aplicativos. Esta API não realiza coleta de dados pessoais.

## 📄 Sumário da API

Esta API permite o envio de notificações push customizadas e conta com validação de parâmetros obrigatórios. Aqui estão os parâmetros aceitos:

- **appId**: Não pode ser nulo ou vazio e deve ter no máximo 35 caracteres.
- **apiKey**: Não pode ser nulo ou vazio e deve ter no máximo 40 caracteres.
- **ptMessage**: Não pode ser nulo ou vazio (mensagem em português).
- **enMessage**: Não pode ser nulo ou vazio (mensagem em inglês).
- **enHeading**: Não pode ser nulo ou vazio (título da notificação em inglês).
- **ptHeading**: Não pode ser nulo ou vazio (título da notificação em português).
- **smallIcon**: Opcional, pode ser nulo ou vazio.
- **externalId**: Não pode ser nulo ou vazio.

Todos os parâmetros são validados, e em caso de erro, uma exceção é lançada com detalhes sobre o parâmetro inválido.

---

## 🛠 &nbsp;&nbsp;Tech Stack

![Java](https://img.shields.io/badge/-Java-05122A?style=flat&logo=java)&nbsp;
![Spring Boot](https://img.shields.io/badge/-Spring%20Boot-05122A?style=flat&logo=spring)&nbsp;
![OneSignal](https://img.shields.io/badge/-OneSignal-05122A?style=flat&logo=onesignal)&nbsp;
![Gradle](https://img.shields.io/badge/-Gradle-05122A?style=flat&logo=gradle)&nbsp;
![JUnit](https://img.shields.io/badge/-JUnit-05122A?style=flat&logo=junit)&nbsp;

## 📦 Como clonar o repositório

Para clonar este projeto em sua máquina local, execute os seguintes comandos:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
```

## 🚀 Instruções para rodar a API

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- **Java 17**
- **Gradle**
- **Git**

### Passos para rodar o projeto

- 1 Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

- 2 Navegue até o diretório do projeto:

```bash
cd nome-do-repositorio
```

- 3 Execute o comando Gradle para iniciar a aplicação:

```bash
./gradlew bootRun
```

- 4 Acesse a API em seu navegador:

```bash
http://
```

### 🔍 Testando a API

Utilize um cliente HTTP como Postman ou cURL para enviar solicitações POST para a rota /api/notifications.

Exemplo de corpo de requisição válido:

```bash
{
  "appId": "stringstringstringstringstringstrin",
  "apiKey": "stringstringstringstringstringstringstri",
  "ptMessage": "Mensagem em português",
  "enMessage": "Message in English",
  "enHeading": "Notification Title in English",
  "ptHeading": "Título da Notificação em Português",
  "smallIcon": "icone-pequeno",
  "externalId": "user123"
}
```

### 📧 Contato

Para mais informações, dúvidas ou sugestões, entre em contato:

***Email:***  ***okcomputer.use.linux@gmail.com***
