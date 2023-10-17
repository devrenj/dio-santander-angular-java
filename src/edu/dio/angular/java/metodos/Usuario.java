package edu.dio.angular.java.metodos;

public class Usuario {
    
  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();
    System.out.println(smartTv.tvLigada);

    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("TV Ligada? " + smartTv.ligada);
    System.out.println(smartTv.tvLigada);

    System.out.println(smartTv.desligar());
    smartTv.desligar();
    System.out.println(smartTv.desligar());

    System.out.println(smartTv.volume);
    smartTv.diminuirVolume();
    System.out.println(smartTv.volume);
    
    smartTv.diminuirVolume();
    System.out.println(smartTv.volume);

  }
}