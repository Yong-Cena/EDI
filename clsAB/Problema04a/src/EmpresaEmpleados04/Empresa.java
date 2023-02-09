
package EmpresaEmpleados04;

/**
 * @author EDg3
 */
public class Empresa {
    //Atributos.
    private String nombre;
    private String direccion;
    private String dueño;
    private Administrativo adminsDir[];
    private Operario opersDir[];
    private int cantAdmins=0, cantOpers=0;
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
       
    // 2)- Genera un reporte con el nombre y
    //     sueldo base de los administrativos.
    public String reporteAdmins() {
        StringBuilder strb;
        strb = new StringBuilder();
        strb.append(nombre + "\n");
        strb.append("Nombre y sueldo base de Administrativos:\n");
        for(int i=0; i<cantAdmins; i++) {
            strb.append(" " + adminsDir[i].toString() + "\n");
        }
        strb.append("\n");
        return strb.toString();
    }

    // Busca la posicion de un Administrativo buscando su clave,
    // para usar en 3) y 4).
    private int buscaAdminPos(int claveE) {
        int i, pos;
        i = 0;
        pos = -1;   // Administrativo inexistente
        while((i<cantAdmins) && (pos == -1)) {
            if( adminsDir[i].getClaveEmpleado() == claveE) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    // 3)- Aumenta el sueldo base de un administrativo, si existe. 
    //     El aumento se da en porcentaje.
    public boolean aumentoAdmin(int claveE, double porc) {
        boolean bo = false;
        int pos;
        double aumento;
        pos = buscaAdminPos(claveE);
        if( pos != -1) {
            aumento= adminsDir[pos].getSueldoBase()*(1+porc);
            adminsDir[pos].setSueldoBase(aumento);
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
        pos = buscaAdminPos(claveE);
        if( pos != -1) {
            adminsDir[pos].setDepartamento(depto);
            bo = true;
        }        
        return bo;
    }
    
    // Busca la posicion de un Operario buscando su clave,
    // para usar en 5).
    private int buscaOperaPos(int claveE) {
        int i, pos;
        i = 0;
        pos = -1;   // Operario inexistente
        while((i<cantOpers) && (pos == -1)) {
            if( opersDir[i].getClaveEmpleado() == claveE) {
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
        pos = buscaOperaPos(claveE);
        if( pos != -1) {
            cobra= opersDir[pos].calculaSalario(prestac, deduc, precioHE);
            cade = "cobrara "+cobra; 
        }
        System.out.println("\n" + cade + "\n");
    }
    
    // 6)- Generar un reporte de todos los operarios, que tienen un sueldo base
    //     menor a cierta cantidad. Además incluir el total.
    public String reporteToOpera(double cantidad) {
        String cade = "";
        int comc = 0;
        for(int i = 0; i<cantOpers; i++) {
            if( opersDir[i].getSueldoBase() < cantidad) {
                cade = cade + opersDir[i].toString() + "\n";
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

}
