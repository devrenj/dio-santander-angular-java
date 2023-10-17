package edu.dio.angular.java.metodos;

public class SmartTv {
  boolean ligada = false;
  int canal = 12;
  int volume = 2;

  void ligar() {
    ligada = true;
  }

  String desligar() {
    if (ligada == true){
      ligada = false;
      return "A Tv foi desligada";
    } else {
      return "Tv já está desligada";
    }
  }

  int diminuirVolume(){
    if (volume > 0) {
      return volume--;
    } return 0;
  }
  
  String tvLigada = ligada ? "Tv desligada" : "Tv Ligada";
}
