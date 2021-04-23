# java8
Exemplos de algumas novidades do Java 8 relacionado a Functional interface, Lambda expression, Stream API, Optional, String Joiner

# 1-	O que é uma interface funcional?
É uma interface(diferente da comum) que pode ter apenas um método abstrato à ser implementado. Pode ser chamado também de SAM( Single Abstract Method) ,  inclusive há uma nova anotação (@FunctionalInterface) para decorar este tipo de interface. .
*SAM type é qualquer interface que defina apenas um único método abstrato
   
# 2-  O que é expressão lambda?
É uma expressão que permite definir uma interface funcional(um método abstrato) que o compilador identifica pela estrutura, a partir de sua posição. É uma função anônima.

# 3-	O que é Stream API?
É usado para lidar com fluxos de dados dentro da coleção, reduzir a preocupação do desenvolvedor com a forma de implementar controle de fluxo ao lidar com coleções, deixando isso a cargo da API. A ideia é iterar sobre essas coleções de objetos e,
a cada elemento, realizar alguma ação, seja ela de filtragem, mapeamento, transformação, etc. Caberá ao desenvolvedor apenas definir qual ação será realizada sobre o objeto.

# 4-	O que é Optional?
É uma classe final pública que é usada para lidar com NullPointer na aplicação Java,  A principal proposta deste recurso é encapsular o retorno de métodos e informar se um valor do tipo <T> está presente ou ausente.
O Optional nos ajuda a evitar os erros NullPointerException, tirar a necessidade da verificação (if x != null) e também a escrever um código com menos linhas e mais bonito.

# 5-	O que é StringJoiner?
É utilizado para unir Strings com o uso de delimiter, prefix, e suffix.
é usado para construir uma sequência de caracteres separados por um delimitador e, opcionalmente, começando com um prefixo fornecido e terminando com um sufixo fornecido.

# 6-	Diferença entre Collection API and Stream API
Collection API é usado para armazenar dados em diferentes tipos de estruturas de dados. A API Stream é usada para cálculo de dados em um grande conjunto de objetos
Com Collection API, podemos armazenar um número finito de elementos em uma estrutura de dados. Com a Stream API, podemos lidar com fluxos de dados que podem conter um número infinito de elementos.

# 7-	Qual tipo de variável você pode acessar em uma lambda expression.?
Usando a expressão lambda, você pode se referir à variável final ou efetivamente à variável final (que é atribuída apenas uma vez). A expressão lambda gera um erro de compilação, se um valor for atribuído a uma variável pela segunda vez.

# 8-	Diferença entre Iterator e Spliterator
Iterator foi introduzido no jdk 1.2 enquanto Spliterator foi introduzido no jdk 1.8
Iterator é usado para Collection API enquanto Spliterator é utilizado por Stream API.
Iterator pode ser usado para iterar os elementos da Coleção em ordem sequencial, enquanto o Spliterator pode ser usado para iterar os elementos do Stream em ordem paralela ou sequencial.

# 9-	Diferença entre Java antigos e java 8 
Earlier Date(data anterior) API  não era thread-safe, enquanto a API de data e hora do Java 8 era thread-safe.
A API de data anterior era mutável, enquanto a API de data e hora do Java 8 é imutável.
A API de data anterior define os meses de 0 a 11, enquanto a API de data e hora do Java 8 define os meses de 1 a 12.
