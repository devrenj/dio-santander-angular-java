package edu.dio.angular.java.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioContador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int primeiraEntrada = 0;
    int segundaEntrada = 0;
    try {
      System.out.println("Digite o primeiro número:");
      primeiraEntrada = sc.nextInt();

      System.out.println("Digite o segundo número:");
      segundaEntrada = sc.nextInt();
      
      try {
        contar(primeiraEntrada, segundaEntrada);
  
        } catch (ParametrosInvalidosException e) {
          System.err.println("A contagem deve ser positiva! Digite o primeiro número menor que o segundo número.");
        }
        
    } catch (InputMismatchException e) {
      System.out.println("Digite apenas números!");
    }


      sc.close();

      // // Testes
      // System.out.println(primeiraEntrada);
      // System.out.println(segundaEntrada);

  }

  static void contar(int num1, int num2) throws ParametrosInvalidosException {
    if (num1 < num2){
      System.out.println("Contando:");
      for (int i=num1;i <= num2; i++) {
        System.out.println(i + "..");
      }
    } else if (num1 > num2) {
      throw new ParametrosInvalidosException();
    } else if (num1 < 0){
      throw new ParametrosInvalidosException();
    }
    System.out.println("Contagem finalizada!");
  }
}