## Estudo de Estruturas de Dados em Java

Este repositório é dedicado ao estudo de estruturas de dados em Java, focando nas interfaces `List`, `Set`, e `Map`, suas principais implementações e características.

## Set
Representa uma coleção que não permite elementos duplicados e não mantém uma ordem específica.

## Map
Representa uma coleção de pares chave-valor, onde cada chave é única. Não permite chaves duplicadas.

## List
Representa uma sequência ordenada de elementos, permitindo elementos duplicados e mantendo a ordem de inserção.

---

## 1 - List

### 1.1 - ArrayList
- **Características:**
    - Implementação baseada em array dinâmico.
    - Eficiente para acesso direto e busca.
    - Pode ser menos eficiente para inserções e remoções no meio da lista.

### 1.2 - LinkedList
- **Características:**
    - Implementação baseada em lista duplamente encadeada.
    - Eficiente para inserções e remoções no meio da lista.
    - Menos eficiente para acesso direto e busca.

### 1.3 - Vector
- **Características:**
    - Similar ao `ArrayList` (implementação baseada em array dinâmico).
    - Métodos são sincronizados, o que pode impactar o desempenho em operações concorrentes.

### 1.4 - Stack
- **Características:**
    - Extende `Vector`.
    - Implementa uma pilha (last-in, first-out).

### 1.5 - CopyOnWriteArrayList
- **Características:**
    - Implementação thread-safe.
    - Eficiente para leitura, copiando a lista ao modificar.

### 1.6 - Resumo
- **ArrayList:** Eficiente para acesso direto e busca, menos eficiente para inserções/remoções no meio.
- **LinkedList:** Eficiente para inserções/remoções no meio, menos eficiente para acesso direto/busca.
- **Vector:** Similar ao `ArrayList`, mas métodos são sincronizados.
- **Stack:** Implementa uma pilha.
- **CopyOnWriteArrayList:** Thread-safe, eficiente para leitura.

---

## 2 - Set

### 2.1 - HashSet
- **Características:**
    - Implementação baseada em tabela de dispersão (hash table).
    - Não garante a ordem dos elementos.
    - Permite elementos nulos.
    - Não é sincronizado.

### 2.2 - TreeSet
- **Características:**
    - Implementação baseada em árvore (normalmente árvore vermelha-preta).
    - Mantém elementos em ordem natural.
    - Não permite elementos nulos.
    - Não é sincronizado.

### 2.3 - LinkedHashSet
- **Características:**
    - Implementação híbrida entre `HashSet` e `LinkedList`.
    - Mantém a ordem de inserção dos elementos.
    - Permite elementos nulos.
    - Não é sincronizado.

### 2.4 - EnumSet
- **Características:**
    - Implementação específica para conjuntos de enums.
    - Muito eficiente e especializada para enums.
    - Não permite elementos nulos.
    - Não é sincronizado.

### 2.5 - Resumo
- **HashSet:** Implementação baseada em tabela de dispersão, sem garantia de ordem.
- **TreeSet:** Implementação baseada em árvore, mantém ordem natural.
- **LinkedHashSet:** Mantém ordem de inserção, híbrido entre `HashSet` e `LinkedList`.
- **EnumSet:** Especializado para conjuntos de enums.

---

## 3 - Map

### 3.1 - HashMap
- **Características:**
    - Implementação baseada em tabela de dispersão.
    - Permite chaves e valores nulos.
    - Não garante ordem nos pares chave-valor.
    - Não é sincronizado.

### 3.2 - TreeMap
- **Características:**
    - Implementação baseada em árvore (normalmente árvore vermelha-preta).
    - Mantém a ordem natural das chaves.
    - Não permite chaves nulas, mas valores podem ser nulos.
    - Não é sincronizado.

### 3.3 - LinkedHashMap
- **Características:**
    - Implementação híbrida entre `HashMap` e `LinkedList`.
    - Mantém ordem de inserção.
    - Permite chaves e valores nulos.
    - Não é sincronizado.

### 3.4 - Hashtable
- **Características:**
    - Implementação mais antiga, sincronizada.
    - Não permite chaves ou valores nulos.
    - Substituído por `ConcurrentHashMap` em ambientes concorrentes.

### 3.5 - ConcurrentHashMap
- **Características:**
    - Implementação otimizada para concorrência.
    - Boa performance em ambientes com múltiplas threads.
    - Permite chaves e valores nulos.

### 3.6 - Resumo
- **HashMap:** Implementação baseada em tabela de dispersão, sem garantia de ordem.
- **TreeMap:** Implementação baseada em árvore, mantém ordem natural das chaves.
- **LinkedHashMap:** Mantém ordem de inserção, híbrido entre `HashMap` e `LinkedList`.
- **Hashtable:** Implementação mais antiga, sincronizada, não permite nulos.
- **ConcurrentHashMap:** Otimizado para concorrência, permite nulos.

## 4 - Outras Estruturas de Dados

### Pilhas (Stacks)

Pilhas operam no princípio Last In First Out (LIFO). O lemento que é empurrado (pushed) por último é o primeiro a ser 
retirado (popped). Em Java, a classe `Stack` herda da classe `Vector` e incorpora todos os métodos da 
classe `Vector` e adiciona seus próprios métodos.

### Filas (Queues)

Filas operam no princípio First In First Out (FIFO). Elementos são inseridos no final ("rear") e são removidos do 
início ("front"). A classe `Queue` em Java suporta várias operações como inserção, remoção, inspeção do elemento 
no início da fila, verificação se a fila está vazia, e assim por diante.