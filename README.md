<p align="center">
    <a href="https://kotlinlang.org" target="_blank">
        <img src="https://user-images.githubusercontent.com/3258293/213479337-b6d02953-dc71-4e72-ab69-f7f926f786e4.png" width="600" alt="Kotlin Logo">
    </a>
</p>

# Binary Search in Kotlin (JVM) - Console Application

> "A **pesquisa** ou **busca binária** (em inglês binary search algorithm ou binary chop) é um algoritmo de busca em 
> vetores que segue o paradigma de **divisão e conquista**. Ela parte do pressuposto de que o vetor está ordenado e 
> realiza sucessivas divisões do espaço de busca comparando o elemento buscado (chave) com o elemento no meio do vetor. 
> Se o elemento do meio do vetor for a chave, a busca termina com sucesso. Caso contrário, se o elemento do meio vier 
> antes do elemento buscado, então a busca continua na metade posterior do vetor. E finalmente, se o elemento do meio 
> vier depois da chave, a busca continua na metade anterior do vetor.
>
> -- [Pesquisa Binária - Wikipedia](https://pt.wikipedia.org/wiki/Pesquisa_bin%C3%A1ria)

![binary-x-linear-search](docs/imgs/binary-x-linear-search.gif)
![binary-search-tree](docs/imgs/binary-search-tree.gif)

## Dependencies

- [Java `v11`](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
- [Kotlin `v1.8.0`](https://kotlinlang.org/docs/whatsnew18.html)

## Complexity Analysis

A complexidade do algoritmo de **Busca binária** é da ordem de **`O(log n)`**, em que **`n`** é o tamanho do 
vetor de busca. Apresenta-se mais eficiente que a **Busca linear** cuja ordem é **`O(n)`**.

## Procedure

Dado uma lista **&Alpha;** de **`n`** elementos com os valores **&Alpha;<sub>0</sub>, &Alpha;<sub>1</sub>, 
&Alpha;<sub>2</sub>, ..., &Alpha;<sub>n-1</sub>** ordenada de tal modo que **&Alpha;<sub>0</sub> &le; 
&Alpha;<sub>1</sub> &le; &Alpha;<sub>2</sub>  &le; ... &le; &Alpha;<sub>n-1</sub>**, e um valor para pesquisa 
**`T`**, a seguinte rotina usa pesquisa binária para achar o índice de **`T`** em **&Alpha;**.

1. Defina **`L`** para `0` e **`R`** para `n - 1`.
2. Se **L &gt; R** a pesquisa termina sem sucesso.
3. Defina **`m`**(o índice do meio da lista) para **`(L + R) / 2`** arredondado.
4. Se **&Alpha;<sub>m</sub> &lt; T**, defina **`L`** para **`m + 1`** e volte ao segundo passo.
5. Se **&Alpha;<sub>m</sub> &gt; T**, defina **`R`** para **`m - 1`** e volte ao segundo passo.
6. Se **&Alpha;<sub>m</sub> = T**, a pesquisa está feita, o índice de **`T`** é **`m`**.

> Para o algoritmo computacional ser mais eficiente, foi implementado uma validação de **Lista vazia**, evitando-se a 
> execução de procedimentos desnecessários! 

## How to run?

```shell
./gradlew run
```

### With empty list

> ![image](https://user-images.githubusercontent.com/3258293/213061515-c532564d-5257-46e6-8d88-c69a9e429361.png)

### With a search lower than list

> ![image](https://user-images.githubusercontent.com/3258293/213061971-40974ee9-a733-4845-9a13-c76ae908291d.png)
> 
> ![image](https://user-images.githubusercontent.com/3258293/213062199-a90dc280-30ed-42ef-8db7-f8f757928a6e.png)

### With a search higher than the list

> ![image](https://user-images.githubusercontent.com/3258293/213062503-2a40e825-da8d-4917-805c-96c592bf6332.png)
> 
> ![image](https://user-images.githubusercontent.com/3258293/213062850-f83b50ff-6230-4cfa-863b-923c0b2a457b.png)

### With a random search

> ![image](https://user-images.githubusercontent.com/3258293/213063171-343a7fae-de54-4c3e-8dca-ad7ff6668814.png)
> 
> ![image](https://user-images.githubusercontent.com/3258293/213064102-8652e085-d5b9-4f39-8fd4-f8a73fc8f5de.png)
> 
> ![image](https://user-images.githubusercontent.com/3258293/213064511-2f9e74aa-461f-4c3b-bf0e-9994de173958.png)
> 
> ![image](https://user-images.githubusercontent.com/3258293/213064941-7490f173-1c26-4d45-8f83-886f8fed81bc.png)

> É possível observar que nem sempre a função nativa da linguagem 
> [`binarySearch()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/binary-search.html) é a que 
> possui a melhor performance!

## How to test?

Using only native [kotlin.test](https://kotlinlang.org/api/latest/kotlin.test/index.html) and JUnit5.

```shell
./gradlew test
```