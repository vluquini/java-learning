# Estudo de Estruturas de Dados em Java

Este repositório é dedicado ao estudo de estruturas de dados em Java, focando nas interfaces `List`, `Set`, e `Map`, suas principais implementações e características.

## Set
Representa uma coleção que não permite elementos duplicados e não mantém uma ordem específica.

## Map
Representa uma coleção de pares chave-valor, onde cada chave é única. Não permite chaves duplicadas.

## List
Representa uma sequência ordenada de elementos, permitindo elementos duplicados e mantendo a ordem de inserção.

---

## Resumo

- **List**: Permite elementos duplicados e mantém a ordem de inserção.
- **Set**: Não permite elementos duplicados e não mantém uma ordem específica.
- **Map**: Associa chaves exclusivas a valores.

---

## List

### ArrayList
- **Características:**
    - Implementação baseada em array dinâmico.
    - Eficiente para acesso direto e busca.
    - Pode ser menos eficiente para inserções e remoções no meio da lista.

### LinkedList
- **Características:**
    - Implementação baseada em lista duplamente encadeada.
    - Eficiente para inserções e remoções no meio da lista.
    - Menos eficiente para acesso direto e busca.

### Vector
- **Características:**
    - Similar ao `ArrayList` (implementação baseada em array dinâmico).
    - Métodos são sincronizados, o que pode impactar o desempenho em operações concorrentes.

### Stack
- **Características:**
    - Extende `Vector`.
    - Implementa uma pilha (last-in, first-out).

### CopyOnWriteArrayList
- **Características:**
    - Implementação thread-safe.
    - Eficiente para leitura, copiando a lista ao modificar.

### Resumo:
- **ArrayList:** Eficiente para acesso direto e busca, menos eficiente para inserções/remoções no meio.
- **LinkedList:** Eficiente para inserções/remoções no meio, menos eficiente para acesso direto/busca.
- **Vector:** Similar ao `ArrayList`, mas métodos são sincronizados.
- **Stack:** Implementa uma pilha.
- **CopyOnWriteArrayList:** Thread-safe, eficiente para leitura.

---

## Set

### HashSet
- **Características:**
    - Implementação baseada em tabela de dispersão (hash table).
    - Não garante a ordem dos elementos.
    - Permite elementos nulos.
    - Não é sincronizado.

### TreeSet
- **Características:**
    - Implementação baseada em árvore (normalmente árvore vermelha-preta).
    - Mantém elementos em ordem natural.
    - Não permite elementos nulos.
    - Não é sincronizado.

### LinkedHashSet
- **Características:**
    - Implementação híbrida entre `HashSet` e `LinkedList`.
    - Mantém a ordem de inserção dos elementos.
    - Permite elementos nulos.
    - Não é sincronizado.

### EnumSet
- **Características:**
    - Implementação específica para conjuntos de enums.
    - Muito eficiente e especializada para enums.
    - Não permite elementos nulos.
    - Não é sincronizado.

### Resumo:
- **HashSet:** Implementação baseada em tabela de dispersão, sem garantia de ordem.
- **TreeSet:** Implementação baseada em árvore, mantém ordem natural.
- **LinkedHashSet:** Mantém ordem de inserção, híbrido entre `HashSet` e `LinkedList`.
- **EnumSet:** Especializado para conjuntos de enums.

---

## Map

### HashMap
- **Características:**
    - Implementação baseada em tabela de dispersão.
    - Permite chaves e valores nulos.
    - Não garante ordem nos pares chave-valor.
    - Não é sincronizado.

### TreeMap
- **Características:**
    - Implementação baseada em árvore (normalmente árvore vermelha-preta).
    - Mantém a ordem natural das chaves.
    - Não permite chaves nulas, mas valores podem ser nulos.
    - Não é sincronizado.

### LinkedHashMap
- **Características:**
    - Implementação híbrida entre `HashMap` e `LinkedList`.
    - Mantém ordem de inserção.
    - Permite chaves e valores nulos.
    - Não é sincronizado.

### Hashtable
- **Características:**
    - Implementação mais antiga, sincronizada.
    - Não permite chaves ou valores nulos.
    - Substituído por `ConcurrentHashMap` em ambientes concorrentes.

### ConcurrentHashMap
- **Características:**
    - Implementação otimizada para concorrência.
    - Boa performance em ambientes com múltiplas threads.
    - Permite chaves e valores nulos.

### Resumo:
- **HashMap:** Implementação baseada em tabela de dispersão, sem garantia de ordem.
- **TreeMap:** Implementação baseada em árvore, mantém ordem natural das chaves.
- **LinkedHashMap:** Mantém ordem de inserção, híbrido entre `HashMap` e `LinkedList`.
- **Hashtable:** Implementação mais antiga, sincronizada, não permite nulos.
- **ConcurrentHashMap:** Otimizado para concorrência, permite nulos.
