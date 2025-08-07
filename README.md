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


### SOLID  
Os princípios SOLID são um conjunto de cinco princípios fundamentais de projeto de software que ajudam a criar sistemas mais manuteníveis, flexíveis e robustos.

A sigla SOLID representa:

S – Single Responsibility Principle (Princípio da Responsabilidade Única)

O – Open/Closed Principle (Princípio Aberto/Fechado)

L – Liskov Substitution Principle (Princípio da Substituição de Liskov)

I – Interface Segregation Principle (Princípio da Segregação de Interfaces)

D – Dependency Inversion Principle (Princípio da Inversão de Dependências)

Esses princípios orientam soluções que não só resolvem problemas, mas também facilitam a manutenção e evolução do software ao longo do tempo.

Aplicar os princípios SOLID ajuda a evitar sistemas com código difícil de modificar, reduzindo riscos e custos em manutenções futuras.

Eles são essenciais para lidar com a mudança frequente de requisitos e tecnologias em projetos de software.

