package ni.edu.uam.empleadosEmpresa;

public class EmpleadoHora extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoHora(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

}
