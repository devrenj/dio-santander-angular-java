package edu.dio.angular.java.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * <h1>Desafio Dio</h1>
 * <h2>Contador</h2>
 * <p>Este programa tem como objetivo executar um contador que itera de acordo com as entradas do usuário e tratar possíveis exceções para indicar o que é esperado pelo algoritmo.
 * @author Roberto Nóbrega Jr.
 * @Mentor Gleysson Sampaio
 * @version 1.1
 * @since 17/10/2023
 * @GitHub devrenj
 */

public class DesafioContador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    int primeiraEntrada = 0;
    int segundaEntrada = 0;
    boolean fluxo = false;

    // Recebendo as entradas do usuário 
    do {

      try {
      System.out.println("Digite o primeiro número:");
      primeiraEntrada = terminal.nextInt();

      System.out.println("Digite o segundo número:");
      segundaEntrada = terminal.nextInt();
      
      // Executando a função contar()
      try {
        contar(primeiraEntrada, segundaEntrada);
        fluxo = true;
        // Tratamento de exceção em caso do usuário digitar parâmetros inválidos, sejam eles negativos ou o primeiro parâmetro menor que o segundo parâmetro
        } catch (ParametrosInvalidosException e) {
          System.err.println("A contagem deve ser positiva! Digite o primeiro número menor que o segundo número.");
        }
    
    // Tratamento de exceção em caso do usuário digitar algo diferente de um número
  } catch (InputMismatchException e) {
    System.out.println("Digite apenas números!");
  }
  
} while(!fluxo);
      // Fechando o Scanner()
      terminal.close();

      // // Testes
      // System.out.println(primeiraEntrada);
      // System.out.println(segundaEntrada);

  }

  /**
   * Esta é uma simples função que recebem dois números e posteriormente executam um laço de repetição (for) que começa com o primeiro parâmetro e itera do menor para o maior, até que atinja o limite do segundo parâmetro
   * @param num1 Recebe o primeiro número digitado pelo usuário armazenado na variável primeiraEntrada
   * @param num2 Recebe o segundo número digitado pelo usuário armazenado na variável segundaEntrada
   * @throws ParametrosInvalidosException Trata a condição de que o primeiro número deve ser menor que o segundo e também não receber um resultado negativo
   */
  static void contar(int num1, int num2) throws ParametrosInvalidosException {
    if (num1 < num2){
      System.out.println("Contando:");
      for (int i=num1;i <= num2; i++) {
        System.out.println(i + "..");
      }
      // Tratamento de exceção caso o primeiro parâmetro seja maior que o segundo parâmetro 
    } else if (num1 > num2) {
      throw new ParametrosInvalidosException();
      // Tratamento de exceção para números negativos
    } else if (num1 < 0){
      throw new ParametrosInvalidosException();
    }
    System.out.println("Contagem finalizada!");
  }
}