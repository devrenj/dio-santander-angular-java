package edu.dio.angular.java.debugando;

public class CaixaEletronico {
  
  public static void main(String[] args) {
    
  double saldo = 200;
  double valorSolicitado = 50.99;

  // if (valorSolicitado < saldo) {
  //     saldo = saldo - valorSolicitado;
  //     System.out.println("Novo saldo: " + saldo);
  //   } else {
  //     System.out.println("Não foi possível realizar esta operação");
  //   }

  // Operador ternário:
  String resultado = valorSolicitado > saldo ? "Saque não realizado" : ("Saque realizado, novo saldo: " + saldo);
  System.out.println(resultado);
  }

}