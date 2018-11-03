package api;

public class Entidad {
	private String nombre;
	private String ci;
	private String facultad;
	private int promocion;
	public String getNombre_compleo() {
		return nombre;
	}
	public void setNombre_compleo(String nombre_compleo) {
		this.nombre = nombre_compleo;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public int getPromocion() {
		return promocion;
	}
	public void setPromocion(int promocion) {
		this.promocion = promocion;
	}

}
