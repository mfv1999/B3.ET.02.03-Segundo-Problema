package B03.Problema2;

public class Principal {
	public static void main(String[] args) {
		Persona p = new Persona(true, false, false, true, true, 25);
		System.out.println(calcularPrecio(350, p, 200));
	}

	public static double calcularPrecio(int iaclm, Persona p, int plazas) {
		double precio = 50.0;
		// si no entra en esta condiciones puede viajar
		if (p.isEnferma() || p.isContacto() || p.isSintomas()) {
			// no viaja
			precio = -1;
			return precio;
		} else if (p.isPasaporte() && !p.isEnferma() && plazas > 0) {
			// puede viajar
			if (iaclm < 100) { // nivel 0
				if (p.getEdad() < 23) {
					precio = precio * 0.4;
				} else if (p.getEdad() > 65) {
					precio = precio * 0.2;
				}
			} else if (iaclm >= 100 && iaclm <= 200) { // nivel 1
				plazas = (int) (plazas * 0.8);
				if (plazas > 0) {
					if (p.getEdad() < 23) {
						precio = precio * 0.7;
					} else if (p.getEdad() > 65) {
						precio = precio * 0.5;
					}
				}
			} else if (iaclm > 200 && iaclm <= 300) { // nivel 2
				plazas = (int) (plazas * 0.6);
				if (p.isProfimpre() && plazas > 0) {
					if (p.getEdad() < 23) {
						// no hay descuento
					} else if (p.getEdad() > 65) {
						precio = precio * 1.2;
					}
				} else if (plazas * 0.4 > 0) {
					if (p.getEdad() < 23) {
						// no hay descuento
					} else if (p.getEdad() > 65) {
						precio = precio * 1.2;
					}
				}
			} else if (iaclm > 300 && iaclm <= 500) { // nivel 3
				plazas = (int) (plazas * 0.4);
				if (p.isProfimpre() && plazas > 0) {
					if (p.getEdad() < 23) {
						precio = precio * 1.2;
					} else if (p.getEdad() > 65) {
						precio = precio * 1.5;
					}
				} else if (plazas * 0.2 > 0) {
					if (p.getEdad() < 23) {
						precio = precio * 1.2;
					} else if (p.getEdad() > 65) {
						precio = precio * 1.5;
					}
				}
			} else if (iaclm > 500) { // nivel 4
				plazas = (int) (plazas * 0.3);
				if (p.isProfimpre() && plazas > 0) {
					if (p.getEdad() < 23) {
						precio = precio * 1.5;
					} else if (p.getEdad() > 65) {
						precio = -1;
						return precio;
						// no viajan
					}
				} else if (plazas * 0.1 > 0) {
					if (p.getEdad() < 23) {
						precio = precio * 1.5;
					} else if (p.getEdad() > 65) {
						// no viajan
						precio = -1;
						return precio;
					}
				}
			}
		}
		return precio;
	}
}
