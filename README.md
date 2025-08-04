Aula 31/07

- Princípios de projeto de código
Os princípios de projeto de código ajudam a criar sistemas mais organizados, legíveis, reutilizáveis e fáceis de manter. Um bom projeto de código leva em conta aspectos como
simplicidade, legibilidade, modularidade, reutilização e facilidade de testes. Entre os princípios mais importantes estão: separação de responsabilidades, baixo acoplamento,
alta coesão, e a aplicação de boas práticas como SOLID.

- Padronização de código
A padronização de código é a definição e adoção de um conjunto de regras de estilo e convenções de escrita no desenvolvimento de software. Ela facilita a leitura, manutenção
e colaboração entre desenvolvedores, reduzindo ambiguidades. Exemplos incluem convenções de nomes, organização de arquivos, uso de indentação, comentários e formatação.
Ferramentas como ESLint, Prettier, EditorConfig, entre outras, ajudam a automatizar essa padronização.

- Ocultamento de Informação
O ocultamento de informação (ou encapsulamento) é um princípio fundamental da programação orientada a objetos. Ele consiste em esconder os detalhes internos da implementação de
um componente, expondo apenas o que é necessário através de interfaces públicas. Isso reduz a complexidade e evita que outras partes do sistema dependam de detalhes internos que
podem mudar. Também contribui para maior segurança e manutenção do código.

Aula 04/08

- Coesão
Coesão é o grau em que os elementos de um módulo ou classe estão relacionados entre si e colaboram para realizar uma única tarefa bem definida. Um módulo com alta coesão é mais
fácil de entender, testar e manter, pois concentra-se em uma única responsabilidade. Já a baixa coesão geralmente indica que a classe está fazendo "coisas demais", o que pode levar
a código desorganizado e difícil de alterar.

- Acoplamento
Acoplamento se refere ao nível de dependência entre módulos ou classes. Um bom projeto busca baixo acoplamento, ou seja, que as partes do sistema possam ser alteradas com o mínimo
de impacto nas outras. O alto acoplamento indica dependência excessiva, o que dificulta mudanças, testes e reutilização. Um sistema com módulos bem acoplados é mais frágil e menos flexível.
  
- SOLID
SOLID é um acrônimo para cinco princípios fundamentais da programação orientada a objetos, criados para tornar o software mais compreensível, flexível e de fácil manutenção:

S — Single Responsibility Principle (Princípio da Responsabilidade Única): Uma classe deve ter apenas um motivo para mudar.

O — Open/Closed Principle (Princípio Aberto/Fechado): O código deve estar aberto para extensão, mas fechado para modificação.

L — Liskov Substitution Principle (Princípio da Substituição de Liskov): Subclasses devem poder ser substituídas por suas superclasses sem alterar o comportamento esperado.

I — Interface Segregation Principle (Princípio da Segregação de Interface): Uma classe não deve ser forçada a depender de interfaces que não utiliza.

D — Dependency Inversion Principle (Princípio da Inversão de Dependência): Dependa de abstrações, não de implementações.

Esses princípios ajudam a construir sistemas mais robustos, desacoplados e fáceis de evoluir.

