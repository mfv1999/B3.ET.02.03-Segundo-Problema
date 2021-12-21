package B03.Problema2;


public class Persona {
	private boolean enferma;
	private boolean sintomas;
	private boolean contacto;
	private boolean pasaporte;
	private boolean profimpre;
	private int edad;

	public Persona() {

	}

	public Persona(boolean enferma, boolean sintomas, boolean contacto, boolean pasaporte, boolean profimpre, int edad) {
		super();
		this.enferma = enferma;
		this.sintomas = sintomas;
		this.contacto = contacto;
		this.pasaporte = pasaporte;
		this.profimpre = profimpre;
		this.edad = edad;
	}

	public boolean isProfimpre() {
		return profimpre;
	}

	public void setProfimpre(boolean profimpre) {
		this.profimpre = profimpre;
	}

	public boolean isEnferma() {
		return enferma;
	}

	public void setEnferma(boolean sana) {
		this.enferma = enferma;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}

	public boolean isContacto() {
		return contacto;
	}

	public void setContacto(boolean contacto) {
		this.contacto = contacto;
	}

	public boolean isPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(boolean pasaporte) {
		this.pasaporte = pasaporte;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
