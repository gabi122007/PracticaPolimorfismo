package ni.edu.uam;
import ni.edu.uam.empleadosEmpresa.Empleado;
import ni.edu.uam.empleadosEmpresa.EmpleadoHora;
import ni.edu.uam.empleadosEmpresa.EmpleadoTiempoCompleto;
import ni.edu.uam.sistemaAnimales.Animal;
import ni.edu.uam.sistemaAnimales.Gato;
import ni.edu.uam.sistemaAnimales.Perro;
import ni.edu.uam.sistemaAnimales.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal[] animales = {new Perro(), new Gato(), new Vaca()};
        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        System.out.println("\nEmpleados y sus salarios:");

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoTiempoCompleto("Juan", 800));
        empleados.add(new EmpleadoHora("Ana", 5, 70));
        empleados.add(new EmpleadoTiempoCompleto("Carlos", 950));
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " gana: " + empleado.calcularSalario());
        }
    }
}
