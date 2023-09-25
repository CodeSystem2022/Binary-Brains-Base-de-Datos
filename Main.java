// Clase base para representar un empleado abstracto
abstract class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Método abstracto para calcular el salario
    abstract double calcularSalario();
}

// Clase concreta que hereda de Empleado para representar a un empleado a tiempo completo
class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salarioMensual) {
        super(nombre, edad);
        this.salarioMensual = salarioMensual;
    }

    @Override
    double calcularSalario() {
        return salarioMensual;
    }
}

// Clase concreta que hereda de Empleado para representar a un empleado por horas
class EmpleadoPorHoras extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int edad, double salarioPorHora, int horasTrabajadas) {
        super(nombre, edad);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Juan", 30, 3000.0);
        Empleado empleado2 = new EmpleadoPorHoras("Maria", 25, 10.0, 40);

        System.out.println("Nombre: " + empleado1.getNombre() + ", Edad: " + empleado1.getEdad() + ", Salario: $" + empleado1.calcularSalario());
        System.out.println("Nombre: " + empleado2.getNombre() + ", Edad: " + empleado2.getEdad() + ", Salario: $" + empleado2.calcularSalario());
    }
}

// En este ejemplo, la clase Empleado es una clase abstracta que representa un empleado genérico y contiene los datos comunes como el nombre y la edad. 
// Las clases EmpleadoTiempoCompleto y EmpleadoPorHoras son clases concretas que heredan de Empleado y tienen métodos para calcular el salario específico 
// para cada tipo de empleado.

// El programa principal crea instancias de estos empleados y calcula sus salarios. 
// Esto demuestra cómo se pueden utilizar los conceptos de herencia y polimorfismo para tratar a diferentes tipos de empleados de manera uniforme a través 
// de la clase base Empleado.




