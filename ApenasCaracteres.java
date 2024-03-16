public class ApenasCaracteres {

    public static boolean isNumero(String str) {
        if (str.isEmpty()) {
            return true;
        }

        char firstChar = str.charAt(0);
        if (firstChar < '0' || firstChar > '9') {
            return false;
        }

        return isNumero(str.substring(1));
    }

    public static void main(String[] args) {

        String teste1 = "123456"; // Deve retornar true
        String teste2 = "123456A"; // Deve retornar false
        String teste3 = "A983B"; // Deve retornar false

        System.out.printf("\n %s eh uma cadeia de strings?: %s \n ", teste1, isNumero(teste1));
        System.out.printf("\n %s eh uma cadeia de strings?: %s\n", teste2, isNumero(teste2));
        System.out.printf("\n %s eh uma cadeia de strings?: %s\n ", teste3, isNumero(teste3));
    }
}
