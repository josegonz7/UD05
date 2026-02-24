package equipodefutbol.centrocampistas;

import equipodefutbol.Jugador;

public class Centrocampistas extends Jugador {
	
	private int pasesCompletados;

	public Centrocampistas(int pasesCompletados, String nombre, int dorsal, String equipo, int paradas) {
		super(nombre, dorsal, equipo);
		this.pasesCompletados = pasesCompletados;
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

	@Override
	public String toString() {
		return String.format("Centrocampistas [nombre= %s, dorsal= %d, equipo= %s, pasesCompletados= %s]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.pasesCompletados);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Centrocampistas other = (Centrocampistas) obj;
		return super.equals(other) && this.pasesCompletados == other.pasesCompletados;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());		
	}
	
}