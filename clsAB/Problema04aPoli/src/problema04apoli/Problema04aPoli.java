
package problema04apoli;

/**
 *
 * @author edi
 */
public class Problema04aPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*        
        Empleado emp1, emp5;
        Administrativo adm1= new Administrativo("Compu","5404","Rebeca", 15000);
        
        emp1= adm1;
        emp5= new Operario("Paco", 6000,10);
        System.out.println("\n 0 adm1= "+adm1.toString());
        System.out.println("\n 1 emp1= "+emp1.toString());
        System.out.println("\n 2 emp1= "+emp5.toString());
        
        ((Administrativo)emp1).getDepartamento();
        Administrativo adm2= (Administrativo)emp1;
        
        if(emp5 instanceof Operario)
        {
            System.out.println("Si es operario");
        }
        
        System.out.println("Arreglo de Empleados");
        Empleado[] arremp= new Empleado[3];
        arremp[0]= adm1;
        arremp[1]= emp5;
        arremp[2]= new Administrativo("Playstation", "1800","Mario",1900);
        
        for(int i=0; i<arremp.length;i++)
        {
            System.out.println(arremp[i].toString());
        }
*/

// Declaracion de variables y referencias
        Administrativo a1, a2, a3;
        Operario o1, o2, o3;
        Empresa e;
    
        //Crear objetos de empleados.
        System.out.println("#0 - CREACION DE ADMINISTRADORES Y OPERARIOS");
        a1= new Administrativo("Computación","5405","Rebeca",15000);
        a2= new Administrativo("Mate","3160","Pablo",20000);
        a3= new Administrativo("Ing. Ind.","8943","Juan",60000);
        System.out.println(a1.toString());
        o1= new Operario("Paco",6000,10);
        o2= new Operario("Hugo",7000,15);
        o3= new Operario("Luis",7500,5);
        System.out.println(o1.toString());
    
        //Imprimir valores.
        System.out.println("#0.1 - MISCELANEA DE ADMINISTRADORES Y OPERARIOS");
        System.out.println("ADMINISTRATIVOS:");
        System.out.println(a2.toString());
        System.out.println("Salario: "+a2.calculaSalario(0.15, 0.2)+"\n");

        System.out.println("OPERARIOS:");
        System.out.println(o3.toString());
        System.out.println("Salario: "+o3.calculaSalario(0.1, 0.15, 10)+"\n");  

        System.out.println("¿Son iguales estos Administrativos a2 y a3: " +
                a2.equals(a3) + "\n");

        System.out.println("¿Son iguales estos Administrativos a2 y a2: " +
                a2.equals(a2) + "\n");
        
        // 1) Se crea la empresa y se dan de alta los empleados.
        System.out.println("#1.0 - CREACION DE EMPRESA");
        e= new Empresa("Oracle","Calle 1-10","Albert");
        System.out.println("#1.1 - ALTA DE ADMIN Y OPER EN LA EMPRESA");
        e.altaEmple(a1); e.altaEmple(a2); e.altaEmple(a3);
        e.altaEmple(o1); e.altaEmple(o2); e.altaEmple(o3);
        

        // 2) Genera reporte de los administartivos.
        System.out.println("#2.1 - REPORTE DE ADMINs");
        System.out.println(e.reporteEmps(new Administrativo())); 
        
        System.out.println("#2.1 - REPORTE DE OPERs");
        System.out.println(e.reporteEmps(new Operario())); 

        // 3) Aumento a un administrativo.
        System.out.println("#3.0 - AUMENTO A UN ADMIN");
        if(e.aumentoEmple(102, 0.10)) {
            System.out.println("Aumento exitoso");
            System.out.println(a3.toString());
        }
        else  {
              System.out.println("El administrativo no existe");
        }
        
        // 4) Cambio de un administrativo a otro departamento.
        System.out.println("#4.0 - ADMINISTRATIVO A OTRO DEPARTAMENTO.");
        if( e.cambioDepto(102, "Informatica") ) {
            System.out.println("Cambio exitoso");
            System.out.println(a3.toString());
        }
        else  {
              System.out.println("El administrativo no existe");
        }
       
        // 5) Cobro que hara un operario
        System.out.println("#5.0 - AUMENTO A UN OPERARIO, si existe.");
        e.impriCobra(0, 0, 0, 0);
        e.impriCobra(105, 0.2, 0.03, 6.0);
       
        // 6) Operarios que ganan menos que una cantidad
        System.out.println("#6.0 - REPORTE DE OPERARIOS CON SUELDO BASE < PARAMETRO.");
        System.out.println(e.reporteToOpera(10000.0));
        System.out.println(e.reporteToOpera(7100.0));     
        
        Empleado emp5;
        Administrativo adm= new Administrativo();
        emp5= adm;
        emp5= new Operario();
        
        
    }
    
    public static int ctaAdmin(Empleado [] arre)
    {
        int contador=0;
        
        for (Empleado arre1 : arre) {
            if (arre1 instanceof Administrativo) {
                contador++;
            }
        }
        return contador;
    }
}
