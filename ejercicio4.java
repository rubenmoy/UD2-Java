public class ejercicio4 {
    public static void main(String[] args) {
        //Declarar las variables y asignarles un valor
        int x = 1 , y = 2;
        double n = 1 , m = 2 , resultado;
        //Mostrar los valores de cada variable
        System.out.println(x);
        System.out.println(y);
        System.out.println(n);
        System.out.println(m);
        //Realizar las operaciones
        resultado=x+y;
        System.out.println("La suma b :" + resultado);
        resultado=x-y;
        System.out.println("La resta es:" + resultado);
        resultado=x*y;
        System.out.println("La multiplicación es:" + resultado);
        resultado=x/y;
        System.out.println("La división es:" + resultado);
        resultado=x%y;
        System.out.println("El resto de la división es:" + resultado);
        resultado=n+m;
        System.out.println("La segunda suma es:" + resultado);
        resultado=n-m;
        System.out.println("La resta es:" + resultado);
        resultado=n*m;
        System.out.println("La segunda multiplicación es:" + resultado);
        resultado=n/m;
        System.out.println("La segunda división es:" + resultado);
        resultado=n%m;
        System.out.println("La segunda operación para el resto es:" + resultado);
        resultado=x+n;
        System.out.println("La tercera suma es:" + resultado);
        resultado=y/m;
        System.out.println("La tercera división es:" + resultado);
        resultado=y%m;
        System.out.println("La tercera operación del resto es:" + resultado);
        System.out.println(2*x);
        System.out.println(2*y);
        System.out.println(2*n);
        System.out.println(2*m);
    }
}
