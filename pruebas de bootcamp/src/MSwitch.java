class MSwitch {
  public void SwitchMethod(int estacion) {
    switch (estacion) {
      case 0:
      System.out.println("Estamos en otono");
      break;
      case 1:
      System.out.println("Estamos en invierno");
      break;
      case 2:
      System.out.println("Estamos en verano");
      break;
      case 3:
      System.out.println("Estamos en primavera");
      break;
      default:
      System.out.println("La opcion seleccionada no es valida.");
      break;
    }
  }
}