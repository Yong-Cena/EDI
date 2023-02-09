
package problema04apoli;

/**
 * @author EDg3
 */
public class Empresa {
    //Atributos.
    private String nombre;
    private String direccion;
    private String dueño;
      //quitar al final
      private Administrativo adminsDir[];
      private Operario opersDir[];
      private int cantAdmins=0, cantOpers=0;
      
    private Empleado emps[];
    private int cantEmps=0;
    private final int MAX=10;
    
    // Constructor
    public Empresa() {
        this("vacio", "vacio", "vacio");
    }
    public Empresa(String nombre, String direccion, String dueño) {
        if( nombre==null || direccion==null || dueño==null) throw new
             RuntimeException("Empresa(): nombre, direccion, y/o dueño, null.\n");
        this.nombre = nombre;
        this.direccion = direccion;
        this.dueño = dueño;
        emps= new Empleado[MAX];                                                
        
        this.adminsDir = new Administrativo[MAX];
        this.opersDir = new Operario[MAX];
    }    
    
    // 1)- Alta de un administrativo.
    public boolean altaAdmin(Administrativo a) {
        if( a==null ) 
            throw new RuntimeException("altaAdmin(): a null.\n");

        boolean resp = false;
        // Da de alta si hay espacio en el arreglo
        if( cantAdmins < MAX) {
            adminsDir[cantAdmins] = a;
            cantAdmins++;
            resp = true;
        }
        return resp;
    }
    
    // 1)- Alta de un operario.
    public boolean altaOper(Operario a) {
        if( a==null ) 
            throw new RuntimeException("altaAdmin(): a null.\n");
        
        boolean resp = false;
        // Da de alta si hay espacio en el arreglo
        if( cantOpers < MAX) {
            opersDir[cantOpers] = a;
            cantOpers++;
            resp = true;
        }
        return resp;
    }
    
    public boolean altaEmple(Empleado a)
    {
        if( a==null ) 
            throw new RuntimeException("altaEmpleado(): a null.\n");
        
        boolean resp = false;
        if( cantEmps < MAX) {
            emps[cantEmps] = a;
            cantEmps++;
            resp = true;
        }
        return resp;
        
    } 

    // 3)- Aumenta el sueldo base de un administrativo, si existe. 
    //     El aumento se da en porcentaje.
    public boolean aumentoEmple(int claveE, double porc) {
        boolean bo = false;
        int pos;
        double aumento;
        pos = buscaEmplePos(claveE);
        if( pos != -1) {
            aumento= emps[pos].getSueldoBase()*(1+porc);
            emps[pos].setSueldoBase(aumento);
            bo=true;
        }
        return bo;
    }
    
    // 4)- Cambio de departamento de un empleado administrativo, si existe,
    //     dada la clave y el nombre del departamento.
    public boolean cambioDepto(int claveE, String depto) {
        if( depto==null ) 
            throw new RuntimeException("cambioDepto(): depto null.\n");

        boolean bo = false;
        int pos;
        pos = buscaEmplePos(claveE);
        if(( pos != -1) && (emps[pos] instanceof Administrativo)) {
            ((Administrativo)emps[pos]).setDepartamento(depto);
            bo = true;
        }        
        return bo;
    }
    
    private int buscaEmplePos(int claveE) {
        int i, pos;
        i = 0;
        pos = -1;   // Operario inexistente
        while((i<cantEmps) && (pos == -1)) {
            if( emps[i].getClaveEmpleado() == claveE) {
                pos = i;
            }
            i++;
        }
        return pos;
    }
    
    // 5)- Imprimir lo que cobrara un operario, si existe, dada la clave y los
    //     datos necesario.
    public void impriCobra(int claveE, double prestac,
            double deduc, double precioHE) {
        String cade = "No existe el operario: " + claveE;
        int pos;
        double cobra;
        pos = buscaEmplePos(claveE);
        if((pos != -1) && (emps[pos] instanceof Operario)) {
            cobra= ((Operario)emps[pos]).calculaSalario(prestac, deduc, precioHE);
            cade = "cobrara "+cobra; 
        }
        System.out.println("\n" + cade + "\n");
    }
    
    // 6)- Generar un reporte de todos los operarios, que tienen un sueldo base
    //     menor a cierta cantidad. Además incluir el total.
    public String reporteToOpera(double cantidad) {
        String cade = "";
        int comc = 0;
        for(int i = 0; i<cantEmps; i++) {
            if( emps[i].getSueldoBase() < cantidad) {
                cade = cade + emps[i].toString() + "\n";
                comc++;
            }
        }
        
        if( comc == 0) {
            cade = "\nNo hay ningun operario que gane menos que " + cantidad + "\n";
        } else {
            cade = "\n Hay " + comc + " operarios ganan menos que " + cantidad +
                    "\n" + cade;
        }        
        return cade;
    }
    
    public String reporteEmps(Empleado e) {
        StringBuilder strb;
        strb = new StringBuilder();
        strb.append(nombre + "\n");
        strb.append("Nombre y sueldo base de Empleados:\n");
        for(int i=0; i<cantEmps; i++) {
            if(emps[i].getClass()== e.getClass())
            {
                strb.append(" " + emps[i].toString() + "\n");
            }
        }
        strb.append("\n");
        return strb.toString();
    }

}
