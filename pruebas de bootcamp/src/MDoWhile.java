class MDoWhile{
    public void DoWhileMethod(int numDoWhile){
      int limit = numDoWhile+1;
      do{
        numDoWhile = numDoWhile + 1;
        System.out.println("El numero dentro del bucle DoWhile es: " + numDoWhile);
      }while(numDoWhile < 3 && numDoWhile < limit);
      System.out.println("--------------------------");
      } 
  }