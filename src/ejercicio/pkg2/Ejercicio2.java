package ejercicio.pkg2;

public class Ejercicio2 {

    public static void main(String[] args) {
        float a=100;
        int b=3;
        float c=50;
        Billing cuenta1 = new Billing();
        System.out.println(cuenta1.computeBill(a));
        System.out.println(cuenta1.computeBill(a,b));
        System.out.println(cuenta1.computeBill(a,b,c));
    }
    
}
