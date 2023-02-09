package Problema08;

/**
 * Clase principal del problema 08 sobre Interface
 * @author EDI
 */
public class AplicaMain08 {

    public static void main(String[] args) {
        Triangulo tri;
        Circulo cir;
        
        System.out.println("\n ---- PRUEBAS 1 ----");
        tri = new Triangulo(7.0, 9.0, 11.0);
        System.out.println("#1- Perimetro y Area de un Triangulo:\n"
                + tri.calculaPerim() + ",  " + tri.calculaArea());
        System.out.println("\n#2- Info del Triangulo: " + tri);
        
        cir = new Circulo(5.0);
        System.out.println("\n#3- Perimetro y Area de un Circulo:\n"
                + cir.calculaPerim() + ",  " + cir.calculaArea());
        System.out.println("\n#4- Info del Circulo: " + cir);        

        
        System.out.println("\n ---- PRUEBAS 2 ----");
        System.out.println("#5- - Son iguales?: \n    " + cir.toString() + ", y " +
                tri.toString() + " : " + cir.equals(tri));
        Circulo c1, c2;
        c1= new Circulo(6.0);    c2= new Circulo(5.0);
        System.out.println("#6- Son iguales?: \n    " + cir.toString() + ", y " +
                c1.toString() + " : " + cir.equals(c1));        
        System.out.println("#7- Son iguales?: \n    " + cir.toString() + ", y " +
                c2.toString() + " : " + cir.equals(c2));                   

        System.out.println("\n#8- - Son iguales?: \n    " + tri.toString() + ", y " +
                cir.toString() + " : " + tri.equals(cir));
        Triangulo t1, t2;
        t1= new Triangulo(1.0, 2.0, 3.0);    t2= new Triangulo(6.0, 5.0, 7.0);
        System.out.println("#9- Son iguales?: \n    " + tri.toString() + ", y " +
                t1.toString() + " : " + tri.equals(t1));        
        System.out.println("#10- Son iguales?: \n    " + tri.toString() + ", y " +
                t2.toString() + " : " + tri.equals(t2));                   
        
        // Pruebas con Cuadrilateros
        Cuadrado cua;
        Rectangulo rec;        
        System.out.println("\n ---- PRUEBAS 3 ----");
        cua = new Cuadrado(10.0);
        System.out.println("#11- Perimetro y Area de un Cuadrado:\n"
                + cua.calculaPerim() + ",  " + cua.calculaArea());
        System.out.println("\n#12- Info del Cuadrado: " + cua);
        
        rec = new Rectangulo(6.0, 8.0);
        System.out.println("\n#13- Perimetro y Area de un Rectangulo:\n"
                + rec.calculaPerim() + ",  " + rec.calculaArea());
        System.out.println("\n#14- Info del Rectangulo: " + rec);

    }
    
}
