package edu.dio.angular.java.debugando;

public class NotaEscolar {
  public static void main(String[] args) {
    
    double nota = 4.9;
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
    // Nesse exemplo tentei encadear mais condições ao operador ternário, porém sem sucesso...
    System.out.println(resultado); 

  }
}
