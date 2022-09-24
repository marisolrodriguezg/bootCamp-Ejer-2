
package bootcampejer2;

public class BootCampEjer2 {

   
    public static void main(String[] args) {
        
        /*Usando un if, crear una condición que compare si la variable numeroIf
        es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
        System.out.println("punto 1");
        int numeroIf=10;
        if (numeroIf <0) {
            System.out.println("el num "+ numeroIf + " es negativo");
        }else {
            if (numeroIf>0) {
                System.out.println("el num "+ numeroIf + " es positivo");
            }else{
                System.out.println("el num es 0" );
            }
        }
/*Crea un bucle While, este bucle tendrá que tener como condición que la variable 
numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.*/
        System.out.println("punto 2");
int numeroWhile=1;

        while (numeroWhile<3){
            numeroWhile=numeroWhile+1;
            System.out.println( numeroWhile);
        }
        
        /*Para el bucle Do While, deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.*/
        System.out.println("punto 3");
        int numeroWhileDo=2;
        do {  
            System.out.println( "imprime1 "+ numeroWhileDo);
            numeroWhileDo=numeroWhileDo+1;
            System.out.println( "imprimeFinal "+ numeroWhileDo);
        } while (numeroWhileDo<3);
        
        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
        y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1
        su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
        System.out.println("punto 4");
        
        for (int numeroFor=0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para
        las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá 
        mandar un mensaje por consola informando de la estación en la que está. También habrá que
        poner un default para cuando el valor de la variable no sea una estación.*/
        
        System.out.println("punto5");
        String estacion= "verano";
        
        switch(estacion){
            case "verano":
                System.out.println("es verano!");
                break;
            case "invierno":
                System.out.println("es invieno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
                default:
                    System.out.println("eso no es una estacion");
                
                
        }
    }
    
}
