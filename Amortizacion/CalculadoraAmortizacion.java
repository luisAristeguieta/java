package com.cmc.evaluacion;

public class CalculadoraAmortizacion {

	// Metodo calcularCuota: 
	public static double calcularCuota(Prestamo prestamo) {

	    double i = (prestamo.getInteres() / 12.0) / 100.0;
	    int n = prestamo.getPlazo() *-1;                
	    double p = prestamo.getMonto();              

	    return (p * i) / (1 - Math.pow(1 + i, n));
	}

    // 2 Metodo generarTabla: 

    public static void generarTabla(Prestamo prestamo) {

        int n = prestamo.getPlazo();
        Cuota[] cuotas = prestamo.getCuotas();

        // 1 Calcular cuota mensual y tasa del periodo
        double cuotaMensual = calcularCuota(prestamo);
        double tasaPeriodo = prestamo.getInteres() / 12.0 / 100.0;

        // 2 Inicializar las cuotas (n posiciones)
        for (int i = 0; i < n; i++) {
            cuotas[i] = new Cuota(i + 1);
            cuotas[i].setCuota(cuotaMensual);
        }

        // 3 Valor primera cuota: 
        cuotas[0].setInicio(prestamo.getMonto());

        // 4 y 5) Calcular los valores de cada cuota
        for (int i = 0; i < n; i++) {
            Cuota actual = cuotas[i];
            Cuota siguiente = (i < n - 1) ? cuotas[i + 1] : null;
            calcularValoresCuota(tasaPeriodo, actual, siguiente);
        }

        // 6 Forma de ajustar la ultima cuota intercalando la funcion redondear: 
        Cuota ultimaCuota = cuotas[n - 1];

        double saldoPendiente = ultimaCuota.getSaldo();
        double saldoRedondeado = Utilitario.redondear(saldoPendiente);

        // Si después de redondear aproximadamnete a cero 0: 
        if (saldoRedondeado != 0) {

            double nuevoAbono = ultimaCuota.getAbonoCapital() + saldoRedondeado;
            nuevoAbono = Utilitario.redondear(nuevoAbono);

            ultimaCuota.setAbonoCapital(nuevoAbono);
            ultimaCuota.setCapital(nuevoAbono);

            double nuevaCuota = ultimaCuota.getCuota() + saldoRedondeado;
            nuevaCuota = Utilitario.redondear(nuevaCuota);

            ultimaCuota.setCuota(nuevaCuota);
            ultimaCuota.setSaldo(0);
        }
    }

    // Metodo calcularValoresCuota para ser usado en la funcio de arriba en el punto 5.
    private static void calcularValoresCuota(double tasaPeriodo, Cuota actual, Cuota siguiente) {

        double inicio = actual.getInicio();

        double interes = inicio * tasaPeriodo;
        double abonoCapital = actual.getCuota() - interes;
        double saldo = inicio - abonoCapital;

        actual.setInteres(interes);
        actual.setAbonoCapital(abonoCapital);
        actual.setCapital(abonoCapital);
        actual.setSaldo(saldo);

        // el saldo de esta cuota se convierte en el inicio de la siguiente
        if (siguiente != null) {
            siguiente.setInicio(saldo);
        }
    }

    // Metodo Mostrar la tabla en consola pero usando lo de mostrarPrestamo. Este metodo no es solicitado directamente en esta clase
    public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("N° | Cuota | Inicio | Interés | Abono | Saldo");
        
        Cuota[] cuotas = prestamo.getCuotas();

        for (int i = 0; i < cuotas.length; i++) {
            Cuota c = cuotas[i];
            c.mostrarPrestamo();
        }
    }
    
    
}







/*
    
















package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {

    
}
package com.cmc.evaluacion;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo p = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
        double cuota = calc.calcularCuota(p);
        System.out.println("Cuota: " + cuota);
    }
}

package com.cmc.evaluacion;

public class TestCalculadora {
    public static void main(String[] args) {
        Prestamo p = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
        calc.generarTabla(p);
        calc.mostrarTabla(p);
    }
}


package com.cmc.evaluacion;

public class TestCalculadora2 {
    public static void main(String[] args) {
        Prestamo p = new Prestamo(500000, 12, 15);
        CalculadoraAmortizacion calc = new CalculadoraAmortizacion();
        calc.generarTabla(p);
        calc.mostrarTabla(p);
    }
}


package com.cmc.evaluacion;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente c1 = new Cliente("1234567890", "Juan", "Perez");
        Cliente c2 = new Cliente("0987654321", "Maria", "Lopez");
        Cliente c3 = new Cliente("1234567890", "Juan", "Perez");

        banco.registrarCliente(c1);
        banco.registrarCliente(c2);
        banco.registrarCliente(c3); // ya existe
    }
}


package com.cmc.evaluacion;

import java.util.ArrayList;

public class TestPrestamos {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente c1 = new Cliente("111", "Juan", "Perez");
        Cliente c2 = new Cliente("222", "Maria", "Lopez");

        banco.registrarCliente(c1);
        banco.registrarCliente(c2);

        Prestamo p1 = new Prestamo(4000, 12, 16);
        Prestamo p2 = new Prestamo(50000, 10, 11);
        Prestamo p3 = new Prestamo(2000, 8, 14);

        banco.asignarPrestamo("111", p1);
        banco.asignarPrestamo("111", p2);
        banco.asignarPrestamo("222", p3);

        ArrayList<Prestamo> prestamosJuan = banco.buscarPrestamos("111");
        if (prestamosJuan != null) {
            System.out.println("Cliente: " + c1.getNombre() + " " + c1.getApellido());
            System.out.println(prestamosJuan);
        }

        ArrayList<Prestamo> prestamosMaria = banco.buscarPrestamos("222");
        if (prestamosMaria != null) {
            System.out.println("Cliente: " + c2.getNombre() + " " + c2.getApellido());
            System.out.println(prestamosMaria);
        }
    }
}



 * */
