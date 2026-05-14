package ni.edu.uam;
import ni.edu.uam.empleadosEmpresa.Empleado;
import ni.edu.uam.empleadosEmpresa.EmpleadoHora;
import ni.edu.uam.empleadosEmpresa.EmpleadoTiempoCompleto;
import ni.edu.uam.sistemaAnimales.Animal;
import ni.edu.uam.sistemaAnimales.Gato;
import ni.edu.uam.sistemaAnimales.Perro;
import ni.edu.uam.sistemaAnimales.Vaca;
import ni.edu.uam.vehiculos.Bicicleta;
import ni.edu.uam.vehiculos.Carro;
import ni.edu.uam.vehiculos.Moto;
import ni.edu.uam.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sonidos de los animales:");
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

        Vehiculo carro = new Carro();
        Vehiculo moto = new Moto();
        Vehiculo bicicleta = new Bicicleta();

        System.out.println("\nMovimientos de los vehículos:");

        iniciarMovimiento(carro);
        iniciarMovimiento(moto);
        iniciarMovimiento(bicicleta);
    }

    public static void iniciarMovimiento(Vehiculo vehiculo) {
        vehiculo.mover();

    }
}
