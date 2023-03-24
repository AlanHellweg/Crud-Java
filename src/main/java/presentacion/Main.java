package presentacion;

import datos.EmpleadoDAO;
import dominio.Empleado;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDao.mostrar();
        
        for(Empleado empleadoForEach: empleados){
            System.out.println(empleadoForEach);
        }
    }
}





