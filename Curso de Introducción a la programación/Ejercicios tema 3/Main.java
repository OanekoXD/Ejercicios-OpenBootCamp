public class Main{

    public static void main (String[] args){
        //1ª Llamar funcion y darle valores
        int resultado = 0;
        resultado = suma(10 , 30, 50);
        System.out.println("Resultado de la suma: " + resultado);

        //2ª crear objeto, aumentar puertas y mostrar en pantalla
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println("Numero de puertas: " + miCoche.numPuertas);
    }

//1ª Crear funcion
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

//2ª Crear clase Coche
class Coche{
    public int numPuertas = 0;

    public void aumentarPuertas(){
        this.numPuertas++;
    }
}