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
        int decimal = 0, power = 0;
        

        // Iniciar a la derecha, cifra menos significativa
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            char digit = binaryStr.charAt(i);
            if (digit == '1') {
                decimal += (int) Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
    public static void menu(){
        Scanner miScanner = new Scanner(System.in);

        while(true) {
            System.out.print("Convertidor de binario a decimal \nIngrese un numero binario: ");
            String binaryStr = miScanner.nextLine();

            if (validaBinario(binaryStr)) {
                int decimal = binarioDecimal(binaryStr);
                System.out.println("Equivalente en decimal: " + decimal);
            } else {
                System.out.println("El numero binario ingresado no es valido.");
            }
            System.out.println("Desea convertir otro numero?(s/n)");
            String continuar = miScanner.nextLine().toLowerCase();
            if (continuar == "n") return;
            miScanner.close();
        }
    }

}