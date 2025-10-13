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


### DevOps
- DevOps é uma abordagem moderna de engenharia de software que integra as equipes de desenvolvimento (Dev) e operações (Ops) para melhorar a colaboração, acelerar entregas e aumentar a qualidade dos sistemas. Em vez de trabalharem isoladamente, essas equipes adotam processos colaborativos, ferramentas compartilhadas e automação para promover a integração contínua (CI), entrega contínua (CD) e monitoramento constante. O objetivo é reduzir o tempo entre a ideia e a implementação em produção, garantindo maior agilidade na resposta a mudanças de mercado e feedback dos usuários. DevOps também promove uma cultura de melhoria contínua, onde os times aprendem com cada ciclo de entrega, ajustando processos e fortalecendo a confiabilidade, segurança e eficiência das soluções entregues. Além disso, incentiva a responsabilização coletiva, comunicação aberta e uso de métricas para tomada de decisões orientadas por dados.


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

---

## Aula 08/09

### Trade-off
- Trade-off refere-se à necessidade de equilibrar decisões conflitantes, onde melhorar um aspecto geralmente implica sacrificar outro. Por exemplo, priorizar desempenho pode comprometer a manutenibilidade do código, ou optar por uma arquitetura altamente modular pode aumentar a complexidade e o custo de desenvolvimento. Arquitetos de software precisam constantemente avaliar os impactos de suas escolhas, considerando critérios como escalabilidade, segurança, custo, tempo de entrega e experiência do usuário, buscando a melhor solução possível dentro das restrições do projeto.

### Mecanismo de Tópico
- O mecanismo de tópico é uma estratégia utilizada principalmente em sistemas de comunicação assíncrona, como os baseados em arquitetura publish/subscribe, para organizar e distribuir mensagens entre diferentes componentes de forma desacoplada. Nesse modelo, as mensagens são categorizadas por "tópicos", permitindo que produtores publiquem informações em um canal específico, enquanto consumidores se inscrevem apenas nos tópicos de seu interesse. Isso promove um alto grau de modularidade e escalabilidade, já que os emissores e receptores de mensagens não precisam conhecer diretamente uns aos outros, tornando o sistema mais flexível e fácil de evoluir ou manter. (Mensagem de 1 para N)
- Menor acoplamento, 1 mensagem que supra todos.
- Extensibilidade arquitetural

- DESVANTAGENS
- Acesso a dados e preocupações com a segurança dos dados
- Nenhum contrato heterogêneo

### Mecanismo de Fila
- O mecanismo de fila funciona com base em duas operações fundamentais: enqueue e dequeue. A operação de enqueue consiste em adicionar um novo elemento ao final da fila, colocando-o na ordem para ser processado. Já a operação de dequeue remove o elemento que está no início da fila, ou seja, o primeiro que entrou, respeitando a lógica FIFO (First In, First Out). Esse comportamento garante que os dados ou tarefas sejam processados na mesma ordem em que foram recebidos, o que é essencial para manter a consistência e previsibilidade em sistemas assíncronos. Juntas, essas operações permitem o gerenciamento eficiente do fluxo de mensagens entre componentes produtores e consumidores, mesmo quando operam em ritmos diferentes. (Mensagem de 1 para 1)
- Maior acoplamento, consegue diminuir a mensagem para mandar apenas a informação que cada um precisa.

### Buffer
- Buffer é uma estrutura que combina características de fila e tópico em sistemas de mensagens: ele possui um tópico que envia a mesma mensagem para múltiplos consumidores, mas antes de cada consumidor há uma fila exclusiva que armazena as mensagens na ordem de chegada. Dessa forma, o buffer funciona como uma área intermediária que armazena temporariamente os dados para equilibrar a produção e o consumo, garantindo que cada consumidor possa processar suas mensagens independentemente e que, mesmo se um consumidor ficar offline, ele continuará recebendo as mensagens armazenadas em sua fila assim que voltar.

## Aula 06/10
Características da Arquitetura: São requisitos não relacionados diretamente à funcionalidade, mas essenciais para o sucesso do sistema. Como o Desepenho, segurança, escalabilidade, manutenibilidade.

###Classificação das Características da Arquitetura
As características são organizadas em três grandes categorias:

Operacionais: Essas características estão diretamente ligadas a práticas de DevOps e infraestrutura.
Estruturais: São cruciais para escalabilidade técnica, qualidade e ciclo de vida do sistema e Relacionam-se à qualidade do código, modularidade e manutenção.
Transversais: Essas características são frequentemente críticas em setores regulados, como financeiro, saúde, governo, etc. São restrições ou requisitos amplos, que não se encaixam nas outras categorias.
###Trade-offs e Compensações
Características da arquitetura conflitam entre si exemplo: segurança x desempenho

O arquiteto deve equilibrar as escolhas buscando a arquitetura mais adequada ao contexto.
