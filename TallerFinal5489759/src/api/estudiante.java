package api;

public class estudiante {
	private int id;
	public estudiante() {
		super();
	}
	private String nombre;
	private String ci;
	private String facultad;
	private int promocion;
	public estudiante(int id, String nombre, String ci, String facultad, int promocion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ci = ci;
		this.facultad = facultad;
		this.promocion = promocion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
