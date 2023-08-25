class Main {
  public static String matriz[][] = new String [30][30];
  public static void main(String[] args) {

      for(int i=0; i<30; i++){
        for(int j=0; j<30; j++){
        matriz[i][j] = "°";
         System.out.print(matriz[i][j]+"°");
        }
    System.out.println("");
      }
    // en la linea 2 declaro lo que va a ser mi matriz y su tamaño  INSTANCIAR LA CLASE//
    // linea 5 : hago el for de los 2 objetos que son filas y columnas //
    // linea 7: al nombre que declaré de la matriz le doy un valor y lo imprimo sin el ln //
    
    
    }
}