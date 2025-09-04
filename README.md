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

---

## Aula 18/08

### Padrões de Projeto
Vscode

---

## Aula 28/08

### Características da arquitetura

Característiicas de arquitetura = requisitos não funcionais.

Características: Disponibilidade, confiabilidade, testibilidade, escalabilidade, segurança (maior prioridade, pois compromete o site e as informações dos clientes), agilidade, tolerância e falhas, elasticidade, recuperabilidade, desempenho, implementabilidade e capazidade e aprendizagem.

### Princípios do Design

Regras básicas a serem seguidas para não perder o padrão.

Sempre que possível, utilize a mensageria assíncrona entre os serviços para aumentar o desempenho.

### Decisões da Arquitetura

Decisões da Aquitetura são regras para construir sistemas. As decisões definem qual modelo (padrão) será usado para a construção do sistema.

microserviço - reduzir o acoplamento (quanto uma parte depende de outra/está acoplada a outra)

---

## Aula 01/09

### Expectativas de um Arquiteto

- Tomar decisões da arquiteutra - tomar as melhores decisões para ter um sistema melhor.
- Necessita manter continuamente a arquitetura, para manter ela adequada.
- Mante-lá sempre atualizada, de acordo com as novas tendências. Como ele vai trazer valor para a empresa?
- Ter conhecimento sobre o negócio, qual o objetivo da empresa, desafios.
- Exposição e experiência diversificada, ele deve ter passado por várias empresas.
- Deve ter um pé na liderança.
- Ter habilidades interpessoais.
- Entender e lidar bem com questões políticas.

### Tomar decisões da arquitetura.
- Orientação é a palavra chave, ele deve orientar, ajudar para um bom andamento da empresa.
- "Framework reativo para o desenvolvimento web front-end", ele deve escutar a equipe também, pois ninguém sabe tudo, as vezes os programadores tem ideias de ouro.

### Analisar continuamente a arquitetura
- Um arquiteto deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias.
- Refere-se a vitalidade da empresa.

### Manter-se atualizado com as últimas tendências.
- Um Arquiteto precisa se manter atualizado das últimas tendências da tecnologia e do setor.


### Assegurar a conformidade das decisões
- Um Arquiteto precisa ter formas de garantir que o sistema será desenvolvido do jeito que ele projetou.
- Ele tenta manter a padronização do sistema.
- Análise estática de código. (rodar pelo código buscando quebras de padrão)


### Ter habilidades interpessoais
- Um arquiteto deve ter habilidades interpessoais, saber trabalhar em grupo.

---

## Aula 04/09

### Resuma a diferençca entre: Arquitetura e Design

### Arquitetura
- Decisões mais importantes e de alto nível que definem a estrutura básica do sistema. É quando você pensa nas principais partes que ele vai ter, como elas vão se conectar e quais padrões vão garantir que o sistema funcione bem, seja rápido, seguro e fácil de manter. Essas decisões têm impacto direto no sucesso do sistema lá na frente, a longo prazo. Além disso, a arquitetura está bem ligada ao que o negócio precisa e às qualidades que o sistema deve ter.

### Design
- Decisões mais detalhadas e práticas, aquelas que mostram como as partes que a arquitetura definiu vão ser realmente construídas. Aqui, o foco está em organizar o código, escolher as classes, os algoritmos, e resolver problemas específicos do dia a dia do desenvolvimento. O design é mais imediato, é o que faz a arquitetura sair do papel e virar realidade.

### Conclusão

Resumindo, a arquitetura é como o mapa geral da cidade, ela define onde ficam as ruas principais, os bairros e as conexões entre eles. O design, por sua vez, é o detalhe das construções e dos interiores das casas e prédios. A arquitetura responde ao “o que” e “por que” do sistema, enquanto o design responde ao “como” colocar tudo isso em prática. Os dois são essenciais e trabalham juntos para garantir que o software funcione bem e atenda às necessidades de todos.

### Como é a formação do conhecimento de um arquiteto modelo T?

O arquiteto modelo T possui um conhecimento profundo em uma área técnica específica, que é sua especialidade. Ao mesmo tempo, ele tem uma visão ampla e geral sobre outras tecnologias, práticas e aspectos relacionados ao desenvolvimento de software. Essa combinação permite que ele tome decisões técnicas sólidas e, ao mesmo tempo, compreenda o contexto mais amplo do projeto, facilitando a comunicação e a colaboração com diferentes equipes.
