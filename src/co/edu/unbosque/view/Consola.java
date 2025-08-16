package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);

	}

	public int leerEntero() {
		return sc.nextInt();
	}

	public double leerDoble() {
		return sc.nextDouble();
	}

	public float leerFlotante() {
		return sc.nextFloat();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public String leerLineaCompleta() {
		return sc.nextLine();
	}

	public char leerChar() {
		return sc.next().charAt(0);
	}

	public String leerPalabra() {
		return sc.next();
	}

	public void escribirConSalto(String texto) {
		System.out.println(texto);	}

	public void escribirSinSalto(String texto) {
		System.out.print(texto);
	}

	public void quemarLinea() {
		sc.nextLine();
	}

	public boolean leerBooleano() {
		String entrada = leerLineaCompleta();
		if(entrada.toLowerCase().contains("si")) {
			return true;	
		}else {
			return false;
		}
	}

}
