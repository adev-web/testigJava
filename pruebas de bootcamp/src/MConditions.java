class MConditions{
    public void ConditionMethod(int numeroIf) {
      if (numeroIf < 0) {
        System.out.println("Es Negativo");
      }else if (numeroIf == 0) {
        System.out.println("Es Cero");
      }else if (numeroIf > 0) {
        System.out.println("Es Positivo");
      }
    }
  }