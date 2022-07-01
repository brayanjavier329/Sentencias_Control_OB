package Sentencias_Control;

public class Main {
    public static void main(String[] args) {

        // Condicional If
        System.out.println("Condicional if:");
        int numeroIf = 7;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es cero");
        }

        // Bucle while
        System.out.println("Ciclo While:");
        int numWhile = 0;

        while (numWhile < 3) {
            System.out.println(numWhile);
            numWhile++;
        }

        // Bucle Do While
        System.out.println("Ciclo Do While");
        int numDoWhile = 2;
        do {
            System.out.println(numDoWhile);
            numDoWhile++;
        } while (numDoWhile < 3);

        // Bucle For
        System.out.println("Ciclo For");
        // int numFor=0;
        for (int numFor = 0; numFor <= 3; numFor++) {
            System.out.println(numFor);
        }

        // Switch case
        System.out.println("Switch case:");
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("El valor de la variable no corresponde a una estación");
        }
    }

}