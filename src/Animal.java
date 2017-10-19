

public class Animal {
	private String nombre;
	private int peso;
	
	public Animal() {
		this.nombre = "";
		this.peso = 0;
	}

	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + this.getNombre() + ", peso=" + peso + "]";
	}
	
	public String comer() {
		return "Estoy comiendo como un animal";
	}
	
	
	
	
	
	
}
