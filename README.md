# Resumo das Aulas de Design e Arquitetura de Software

## Aula 31/07

### Princípios de projeto de código  
Os princípios de projeto de código ajudam a criar sistemas mais organizados, legíveis, reutilizáveis e fáceis de manter. Um bom projeto de código leva em conta aspectos como simplicidade, legibilidade, modularidade, reutilização e facilidade de testes. Entre os princípios mais importantes estão: separação de responsabilidades, baixo acoplamento e alta coesão.

### Padronização de código  
A padronização de código é a definição e adoção de um conjunto de regras de estilo e convenções de escrita no desenvolvimento de software. Ela facilita a leitura, manutenção e colaboração entre desenvolvedores, reduzindo ambiguidades. Exemplos incluem convenções de nomes, organização de arquivos, uso de indentação, comentários e formatação. Ferramentas como ESLint, Prettier, EditorConfig, entre outras, ajudam a automatizar essa padronização.

### Ocultamento de Informação  
O ocultamento de informação (ou encapsulamento) é um princípio fundamental da programação orientada a objetos. Ele consiste em esconder os detalhes internos da implementação de um componente, expondo apenas o que é necessário através de interfaces públicas. Isso reduz a complexidade e evita que outras partes do sistema dependam de detalhes internos que podem mudar. Também contribui para maior segurança e manutenção do código.

---

## Aula 04/08

### Coesão  
Atributo/Caracteristica que buscamos em nosso sistema, toda a classe deve atribuir uma única função ou serviço.

Vantagens da Coesão:
- Facilita a implementação de uma classe, bem como o seu entendimento ou manutenção.
- Facilita a alocação de um único responsável por manter uma classe.
- Facilita o reuso e teste de uma classe.

### Acoplamento  
- Acoplamento é o grau de dependência entre duas classes.

- Acoplamento aceitável ocorre quando uma classe usa apenas métodos públicos estáveis de outra.

- Acoplamento ruim acontece quando há acesso direto a dados internos, uso de variáveis globais compartilhadas ou interfaces instáveis.

- O objetivo é maximizar a coesão (foco único da classe) e minimizar o acoplamento (dependências controladas).

- Acoplamento estrutural é a referência direta entre classes; acoplamento evolutivo é quando mudanças em uma classe afetam outra sem referência direta.

- Exemplo: evitar que uma classe acesse diretamente um arquivo usado por outra, preferindo comunicação via métodos públicos estáveis.

- Acoplamento é necessário, mas deve ser bem gerenciado para evitar problemas de manutenção e propagação de erros.

---

## Aula 07/08

### SOLID  
Os princípios SOLID são um conjunto de cinco princípios fundamentais de projeto de software que ajudam a criar sistemas mais manuteníveis, flexíveis e robustos.

A sigla SOLID representa:

S single Responsibility Principle
O open/Closed Principle
L liskov Substitution Principle
I interface Segregation Principle
D dependency Inversion Principle

- Princípio da Responsabilidade Única -  Cada classe deve ter apenas uma responsabilidade, aumentando a coesão. Deve existir um único motivo para modificar qualque classe em um sistema. Um corolário desse princípio recomenda separar apresentação de regras de negócio.
- Princípio da Segregação de Interfaces - aso particular de Responsabilidade Única com foco em interfaces. O princípio define que interfaces têm que ser pequenas, coesas e, mais importante ainda, específicas para cada tipo de cliente. O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar.
- Princípio de Inversão de Dependências - Esse princípio recomenda que uma classe cliente deve estabelecer dependências prioritariamente com abstrações e não com implementações concretas, pois abstrações (isto é, interfaces) são mais estáveis do que implementações concretas (isto é, classes). A ideia é então trocar (ou inverter) as dependências: em vez de depender de classes concretas, clientes devem depender de interfaces. Portanto, um nome mais intuitivo para o princípio seria Prefira Interfaces a Classes.
- Prefira Composição a Herança - O princípio "Prefira Composição a Herança" recomenda usar composição em vez de herança para evitar forte acoplamento e expor detalhes internos, facilitando a manutenção e flexibilidade do código. Por exemplo, uma pilha deve conter uma lista internamente (composição), não herdar dela. Composição permite trocar implementações em tempo de execução e preserva melhor o encapsulamento, enquanto herança pode causar problemas. Linguagens modernas como Go e Rust seguem essa ideia, não oferecendo herança de classes.
- Princípio de Demeter - O Princípio de Demeter, ou Lei do Menor Conhecimento, recomenda que um método só deve chamar métodos de sua própria classe, de objetos passados como parâmetro, de objetos que cria, ou de seus atributos, evitando chamar métodos em objetos obtidos por chamadas encadeadas.
- Princípio Aberto/Fechado - O Princípio Aberto/Fechado diz que classes devem permitir extensões sem que seu código original precise ser modificado. Isso facilita a manutenção e a evolução do software, como no caso da classe Collections do Java, que permite diferentes formas de ordenação sem alterar seu código. Já códigos que exigem mudanças para cada novo tipo violam esse princípio.
- Princípio de Substituição de Liskov - O Princípio de Substituição de Liskov estabelece que subclasses devem poder substituir suas classes base sem alterar o comportamento esperado dos métodos herdados. Ou seja, métodos redefinidos nas subclasses devem respeitar o contrato original da classe base para garantir que clientes que usam objetos da classe base funcionem corretamente também com objetos das subclasses. Violações ocorrem quando, por exemplo, uma subclasse restringe o domínio de um método ou altera sua semântica, como no caso em que uma soma de inteiros é substituída por uma concatenação de strings, causando resultados inesperados e quebrando a previsibilidade do código.
  






