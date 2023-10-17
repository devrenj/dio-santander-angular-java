# Java + Angular Dio

## Professor: Glaysson Sampaio

### Como criar um pacote Java no VSCode

Este exemplo permite que ao mover um arquivo .java, o VSCode interprete automáticamente o seu `package`

- 01: Criar a pasta com o nome do pacote (ex.: edu)
- 02: Criar subdiretórios que contém o tema ou assunto do programa ou outro identificador (ex.: bootcamp)
- 03: Por convenção o último subdiretório deve conter um resumo do que a parte do programa indicada pelo pacote faz
- Exemplo de pacote: edu.dio.angular.java.calculadoraimc
- Exemplo de diretórios: edu/dio/angular/java/calculadoraimc

## Síntaxe e visão geral

Java é uma linguagem multi-paradigmas, fortemente usado sob o paradigma de Orientação a Objetos, utilizando fortemente classes, métodos e visibilidade para conectar o programa. O conceito de objeto pode conter dados na forma de campos, também conhecidos como atributos e códigos, na forma de procedimentos, também conhecidos como métodos.
Cada pacote é uma parte modularizada do programa como um todo, esta construção faz parte dos pilares da linguagem, que são:

- Encapsulamento: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos, com finalidades específicas que complementam uma ação em nossa aplicação
- Herança: Características e comportamentos comuns, podem ser elevados e compartilhados através de uma hierarquia de objetos
- Polimorfismo: São as inúmeras maneiras de se realizar uma mesma ação
- Abstração: É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, atendendo às necessidades do que está sendo programado

## Javadoc

É um gerador de documentação criado pela Sun Microsystems, para documentar a API dos programas em  Java. O resultado é expresso em HTML.

CLI :: `javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java`

### Tratamento de exceção

Quando inveitávelmente acontece uma exceção, tratamos de acordo com os tipos de erros para que o programa não precise ser encerrado ou reinicializado. O tratamento precisa informar ao usuário o que ele pode fazer para mitigar o erro, resumindo de forma breve o seu motivo

- Erro: O arquivo é encerrado drásticamente (termo: crash)
- Exceção: Fluxos não previstos pela aplicação
- Exceção tratada: Controle de fluxo caso algo não esteja de acordo com os blocos de código para que não haja interrupção bruta do programa
- Interações indevidas: Quando o usuário se expressa de forma inesperada pelo programa

Try - É o bloco de código que está recebendo tratamento, o programa irá tentar executá-lo primeiro
Catch - Caso o bloco try não tenha sucesso, o bloco catch irá tratar a exceção com o seu tipo

Subcategorias:

- Exception: Fluxos não previstos pela aplicação
- Runtime Exception: 

Classificação:
O risco da exceção ser disparada e logo precisar tratá-la

- Checked: A exceção precisa ser tratada imediatamente com um bloco try-catch
- Unchecked: A exceção acontece mas não é obrigatório ser tratado

Referência e tipos de exceções: <https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-excepcionais>

### Glossário

CLI: Command Line Interface - Códigos executados no terminal

### Referências

<https://glysns.gitbook.io/java-basico/>
