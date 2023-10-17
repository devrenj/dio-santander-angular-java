package edu.dio.angular.java.cases;

public class ProcessoSeletivo {
  
  public static void main(String[] args) {
    
    // Primeiro Sistema: 
    // double salarioOfertado = 2500.00;
    // double salarioCandidato = 2000.00;
    


    // String validacao = salarioOfertado > salarioCandidato ? "Ligar para o candidato" : salarioOfertado == salarioCandidato ? "Ligar para o candidato com contra proposta" : "Aguardando demais candidatos" ;
  
    // System.out.println(validacao);
  
    // Segundo sistema:
    System.out.println(analisarCandidato(2500));
    System.out.println(analisarCandidato(3900));
    System.out.println(analisarCandidato(5000));

  }

  static String analisarCandidato(double salarioPretendido) {
    double salarioOfertado = 2000.00;
    
    if (salarioOfertado < salarioPretendido){
      return "Aguardar demais candidatos";
    } else if (salarioOfertado == salarioPretendido){
      return "Ligar para o candidato com contra proposta";
    } else {
      return "Ligar para o candidato";
    }
  }

}
