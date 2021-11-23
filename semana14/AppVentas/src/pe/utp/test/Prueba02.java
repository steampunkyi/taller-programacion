package pe.utp.test;

import java.util.Scanner;

import pe.utp.model.Empleado;

public class Prueba02 {
	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);
		try {
			System.out.println("Ingrese el nro. de personas: ");
			int nro = Leer.nextInt();
			Empleado emps[] = new Empleado[nro];
			for (int i = 0; i < emps.length; i++) {
				System.out.println("Ingrese dni: ");
				String dni = Leer.next();
				System.out.println("Ingrese apellidos: ");
				String apellidos = Leer.next();
				System.out.println("Ingrese nombres: ");
				String nombre = Leer.next();
				System.out.println("Ingrese cargo: ");
				String cargo = Leer.next();
				System.out.println("Ingrese sueldo: ");
				double sueldo = Leer.nextDouble();
				// Crear datos del tipo empleado
				Empleado emp1 = new Empleado(dni, apellidos, nombre, cargo, sueldo);
				// Guardar el objeto en el arreglo
				emps[i] = emp1;
			}
			// Mostrar datos los objetos del arreglo
			for (int i = 0; i < emps.length; i++) {
				System.out.println(emps[i].verDatos());
				emps[i].mostrarDni();
				System.out.println("=======================");
			}
		} catch (Exception ex) {
			System.out.println("Error en el ingreso de datos");
		} finally {
			System.out.println("Proceso terminado");
		}
	}
}
