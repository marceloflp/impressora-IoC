# Impressora e Relatório - Exemplo de Inversão de Controle e Injeção de Dependência

Este repositório contém um pequeno projeto Java que demonstra o conceito de Inversão de Controle (IoC) e Injeção de Dependência (DI) utilizando as classes `Impressora`, `ImpressoraConsole`, `ImpressoraArquivo`, `Relatorio`, e `Main`.

## Estrutura do Projeto

- **`Impressora` (interface):** Define o contrato para impressão de texto.
- **`ImpressoraConsole` (implementação de `Impressora`):** Imprime o texto no console.
- **`ImpressoraArquivo` (implementação de `Impressora`):** Grava o texto em um arquivo específico.
- **`Relatorio`:** Classe que utiliza uma instância de `Impressora` para gerar relatórios.
- **`Main`:** Ponto de entrada do programa. Demonstra como criar uma instância de `Relatorio` e imprimir ou gravar o relatório.

## Inversão de Controle e Injeção de Dependência

A inversão de controle refere-se à mudança de controle de uma aplicação de um componente para outro. Neste projeto, a inversão de controle ocorre porque a classe `Main` não é responsável por criar diretamente uma instância de `Impressora`. Em vez disso, ela depende de uma instância de `Relatorio`, que, por sua vez, depende de uma implementação de `Impressora`. Isso é feito através da injeção de dependência.

### Como Funciona

1. A classe `Relatorio` recebe uma instância de `Impressora` no seu construtor, tornando-se dependente dela.
2. Quando um relatório é gerado através do método `gerarRelatorio(String texto)`, a instância de `Relatorio` usa a `Impressora` para imprimir ou gravar o texto, sem saber exatamente qual implementação está sendo utilizada.
3. Na classe `Main`, você pode escolher a implementação específica de `Impressora` que deseja utilizar, criando uma instância correspondente de `Relatorio`.

## Como Utilizar

1. Clone o repositório para sua máquina local.
2. Abra o projeto em sua IDE preferida.
3. Execute a classe `Main`.
4. Observe a saída no console ou o arquivo gerado, dependendo da implementação de `Impressora` escolhida.

**OBS:** Experimente alternar entre as implementações de `Impressora` na classe `Main` para observar a flexibilidade proporcionada pela Injeção de Dependência.
