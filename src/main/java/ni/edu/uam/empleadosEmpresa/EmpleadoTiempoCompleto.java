package ni.edu.uam.empleadosEmpresa;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salariofijo;

    public EmpleadoTiempoCompleto(String nombre, double salariofijo) {
        super(nombre);
        this.salariofijo = salariofijo;
    }

    @Override
    public double calcularSalario() {
        return salariofijo;
    }
}
