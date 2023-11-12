import java.util.Scanner;


class main {
    
    public static void main(String[] args) {
    menu();
    }

    // Validar que el numero ingresado contenga 0 y 1 unicamente
    public static boolean validaBinario(String binaryStr) {
        return binaryStr.matches("[01]+");
    }

    // Convertir string a int
    public static int binarioDecimal(String binaryStr) {
        int decimal = 0, potencia = 0;
        

        // Iniciar a la derecha, cifra menos significativa
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            char digito = binaryStr.charAt(i);
            if (digito == '1') {
                decimal += (int) Math.pow(2, potencia);
            }
            potencia++;
        }

        return decimal;
    }
    public static void menu(){
        Scanner miScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Convertidor de binario a decimal \nIngrese un numero binario: ");
            String strBin = miScanner.nextLine();

            if (validaBinario(strBin)) { // binario = true
                int decimal = binarioDecimal(strBin);
                System.out.println("Equivalente en decimal: " + decimal);
            } else {
                System.out.println("El numero binario ingresado no es valido.");
            }
            System.out.println("Desea convertir otro numero?(s/n)");
            String continuar = miScanner.nextLine().toLowerCase();
            if (continuar.equals("n")) break;
            //miScanner.close();
        }
    }

}