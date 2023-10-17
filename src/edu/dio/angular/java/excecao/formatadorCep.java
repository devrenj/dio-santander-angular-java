package edu.dio.angular.java.excecao;


public class formatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("234");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.err.println("O CEP precisa ter no mínimo 8 caracteres");
    }
  }
  
  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
    throw new CepInvalidoException();

    // Simulando um Cep formatado
    return "23.765-064";

  }

}
