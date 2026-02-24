package equipodefutbol.defensas;

import equipodefutbol.Jugador;

public abstract class Defensas extends Jugador {
	
	private int disputasRealizadas;

	public Defensas(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}

	@Override
	public String toString() {
		return String.format("Defensa [nombre= %s, dorsal= %d, equipo= %s, disputasRealizadas= %d]", this.getNombre(), this.getDorsal(), this.getEquipo(), this.disputasRealizadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Defensas other = (Defensas) obj;
		return super.equals(other) && this.disputasRealizadas == other.disputasRealizadas;				
	}		

}