package edu.dio.angular.java.cases;

import java.util.concurrent.ThreadLocalRandom;
public class SelecaoCandidatos {
  public static void main(String[] args) {
  
    selecaoCandidatos();
    
  }

// Array com a lista de candidatos
static void selecaoCandidatos() {
  String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE", "Roberto", "Paula", "Márcio", "Thaiz", "Enelides"};

  final int QUANTIDADE_CANDIDATOS = 5;
  int candidatosSelecionados = 0;
  int candidatoAtual = 0;
  double salarioBase = 2000.00;
  String [] candidatosAprovados = new String[QUANTIDADE_CANDIDATOS];

    while (candidatosSelecionados < QUANTIDADE_CANDIDATOS && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
      
      System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
          candidatosAprovados[candidatosSelecionados] = candidato;
          System.out.println("O candidato " + candidato + " foi selecionado para a vaga!" + "(" + 
          (candidatosSelecionados + 1) + ")");
          candidatosSelecionados++;
        }
        candidatoAtual++;
            if (candidatoAtual == candidatos.length) {
          candidatoAtual = 0;
        }
      }
    // while (candidatoAtual < candidatosAprovados.length) {
      
    //   System.out.println(candidatosAprovados[candidatoAtual]);
    //   candidatoAtual++;
    // }
    // System.out.println(candidatosAprovados[]);

    System.out.println("Mostrar candidatos aprovados: ");
    for (String candidato: candidatosAprovados) {
      System.out.println(candidato);
    }
  }
  // Método que simula o valor pretendido  
  static double valorPretendido() {
       return ThreadLocalRandom.current().nextDouble(1990, 2500);
  }
}
