# Pacote Conjuntos

Este pacote contém exemplos e informações sobre três estruturas de dados 
relacionadas que usam funções de hash em Java: `TreeSet`, `HashSet`, `HashMap` 
e `Hashtable`. Cada uma dessas classes tem um propósito distinto e diferenças 
significativas.

## `TreeSet`

O `TreeSet` é uma estrutura de dados que implementa a interface `Set` em Java 
e é baseada em uma árvore (normalmente uma árvore vermelha-preta). Ele mantém 
seus elementos em ordem natural, o que significa que os elementos são armazenados 
em uma ordem que segue a ordem natural dos objetos (por exemplo, ordem alfabética 
para strings).

Principais características do `TreeSet`:

- Armazena elementos únicos: O `TreeSet` não permite elementos duplicados. Cada 
elemento é exclusivo na coleção.

- Ordem Natural: Os elementos são armazenados em ordem natural, o que é útil
para situações em que você deseja acessar os elementos em ordem.

- Desempenho: O desempenho do `TreeSet` para operações de inserção, remoção e
busca é relativamente eficiente, embora um pouco mais lento do que o `HashSet`.

- Não Sincronizado: Assim como o `HashSet`, o `TreeSet` não é sincronizado, o 
que significa que não é seguro para uso concorrente em threads simultâneas.

O `TreeSet` é uma escolha apropriada quando você precisa de uma coleção que mantém 
elementos únicos em ordem natural. No entanto, lembre-se de que a ordem natural 
pode variar dependendo do tipo de elementos que você está armazenando.

## `HashSet`

O `HashSet` é uma coleção que armazena elementos únicos, sem permitir duplicatas. 
Ele é útil quando você precisa manter uma coleção de elementos únicos. 
Os elementos em um `HashSet` não são armazenados em uma ordem específica e a 
estrutura não é segura para threads.

## `HashMap`

O `HashMap` é uma coleção de pares chave-valor, onde cada chave mapeia para 
um valor. Ele é usado para armazenar e recuperar valores associados a chaves.
O `HashMap` permite elementos duplicados, mas as chaves são únicas. 
Assim como o `HashSet`, os elementos em um `HashMap` não são armazenados em 
uma ordem específica e a estrutura não é segura para threads.

## `Hashtable`

O `Hashtable` é semelhante ao `HashMap`, mas é uma versão mais antiga e projetada 
para ser segura para threads (thread-safe). No entanto, seu uso é desencorajado 
em favor de classes mais modernas, como `ConcurrentHashMap`, que oferecem melhor 
desempenho em ambientes concorrentes. O `Hashtable` não permite chaves duplicadas.

A escolha entre `HashSet` e `HashMap` depende de requisitos específicos. No geral,
use o `HashSet` quando você precisar armazenar elementos únicos e o `HashMap` 
quando precisar associar chaves a valores.

