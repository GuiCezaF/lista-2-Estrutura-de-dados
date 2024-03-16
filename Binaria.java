public class Binaria {

  /*
   * Todo número decimal possui também uma representação binária, sendo o seu
   * valor
   * apresentado apenas com os dígitos "0" e "1". Por exemplo, o número 12 em base
   * decimal possui como representação binária o valor 1100 (pois 1 * 23 + 1 * 22
   * + 0 * 21 +
   * 0 * 20). Implemente a função baseBinaria() da classe Binaria.java que
   * recebe como parâmetro um número inteiro decimal positivo e devolve a sua
   * representação binária. Essa função deve ser recursiva.
   */

  public static String baseBinaria(int decimal) {
    if (decimal == 0) {
      return "0";
    }
    if (decimal == 1) {
      return "1";
    }
    
    int ultimoBit = decimal % 2;
    int resto = decimal / 2;
    return baseBinaria(resto) + ultimoBit;
  }

  public static void main(String[] args) {
    // Caso 1
    int caso1 = 12;
    String binarioCaso1 = baseBinaria(caso1);
    System.out.println(binarioCaso1);

    // Caso 2
    int caso2 = 15;
    String binarioCaso2 = baseBinaria(caso2);
    System.out.println(binarioCaso2);

    // Caso 3
    int caso3 = 91;
    String binarioCaso3 = baseBinaria(caso3);
    System.out.println(binarioCaso3);
  }

}