import java.lang.reflect.Array;

public class Main {
    
    public static void main (String[] args){
        //1ª 
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("El numero de la variable es positivo");
        }else if(numeroIf < 0){
            System.out.println("El numero de la variable es negativo");
        }else {
            System.out.println("El numero de la variable es 0");
        }

        //2ª
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("bucle del while: "+numeroWhile);
        }

        //3ª
        do{
           numeroWhile++;
           System.out.println("bucle del do while: "+numeroWhile); 
        }while(numeroWhile < 1);

        //4ª
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("bucle del for: "+numeroFor); 
        }

        //5ª
         //["Primavera", "Verano", "Otoño", "Invierno"]
         var estacion = "Primavera";

        switch(estacion){
            case "Primavera": System.out.println("Nos encontramos en la estacion de: Primavera");break;
            case "Verano": System.out.println("Nos encontramos en la estacion de: Verano");break;
            case "Otoño": System.out.println("Nos encontramos en la estacion de: Otoño");break;
            case "Invierno": System.out.println("Nos encontramos en la estacion de: Invierno");break;
            default: System.out.println("No es una estacion");
        }
    }
}
