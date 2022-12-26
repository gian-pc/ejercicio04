package estructurasControl;

public class Ejercicio05 {
    public static void main(String[] args) {
        String estacion = "Otoño";

        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Ingrese una estación valida");
        }

    }
}
