# IPHONEJAVADIO
# Projeto iPhone 2007 - Funções Multifuncionais

Este projeto representa um modelo simples do iPhone de 2007, que desempenha três papéis principais: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Descrição

O iPhone 2007 é uma simulação de um dispositivo multifuncional que permite ao usuário:

- Reproduzir música
- Realizar chamadas telefônicas
- Navegar na internet

O projeto inclui classes e interfaces que representam esses recursos.

## Classes e Interfaces

### Interfaces

1. **ReprodutorMusical**
   - Métodos:
     - `play(): void`
     - `pause(): void`
     - `stop(): void`
     - `nextTrack(): void`
     - `previousTrack(): void`

2. **AparelhoTelefonico**
   - Métodos:
     - `fazerLigacao(numero: String): void`
     - `receberLigacao(numero: String): void`
     - `encerrarLigacao(): void`
     - `enviarMensagem(texto: String, numero: String): void`
     - `receberMensagem(texto: String, numero: String): void`

3. **NavegadorInternet**
   - Métodos:
     - `abrirPaginaWeb(url: String): void`
     - `fecharPaginaWeb(): void`
     - `buscarNaInternet(termo: String): void`
     - `navegarHistorico(): void`
     - `favoritarPagina(url: String): void`

### Classe

4. **iPhone2017**
   - Implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.
   - Atributos:
     - `modelo: String`
     - `numeroSerie: String`
   - Métodos:
     - `Construtor(modelo: String, numeroSerie: String): void`
     - `getDetalhes(): String`
     - (Implementar todos os métodos das interfaces)

## Uso

Exemplo de uso do iPhone 2007:

```java
// Crie uma instância do iPhone 2007
iPhone2007 meuiPhone = new IPhone2007("iPhone 1", "123456");

// Reproduza uma música
meuiPhone.play();

// Faça uma ligação
meuiPhone.fazerLigacao("+1234567890");

// Navegue na internet
meuiPhone.abrirPaginaWeb("https://www.example.com");
