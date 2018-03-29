package es.uji.ei1027.SAPE.model;


public class Estudiante extends Personal{
	
	private short id;
	private String dni;
	private String nombre;
	private int numeroCreditosAprobados;
	private int numeroAsignaturasPendientes4t;
	private int semestreInicioEstancia;	
	private int orden;
	private MenuItinerario itinerario;
	
	
	
	public final short getId() {return id;}
	public final void setId(short id) {this.id = id;}

	public final String getDni() {return dni;}
	public final void setDni(String dni) {this.dni = dni;}




	public final String getNombre() {return nombre;}
	public final void setNombre(String nombre) {this.nombre = nombre;}

	public final int getNumeroCreditosAprobados() {return numeroCreditosAprobados;}
	public final void setNumeroCreditosAprobados(int numeroCreditosAprobados) {this.numeroCreditosAprobados = numeroCreditosAprobados;}
	
	public final int getNumeroAsignaturasPendientes4t() {return numeroAsignaturasPendientes4t;}
	public final void setNumeroAsignaturasPendientes4t(int numeroAsignaturasPendientes4t) {this.numeroAsignaturasPendientes4t = numeroAsignaturasPendientes4t;}

	public final int getSemestreInicioEstancia() {return semestreInicioEstancia;}
	public final void setSemestreInicioEstancia(int semestreInicioEstancia) {this.semestreInicioEstancia = semestreInicioEstancia;}

	public final int getOrden() {return orden;}
	public final void setOrden(int orden) {this.orden = orden;}

	public final Enum getItinerario() {return itinerario;}
	public final void setItinerario(MenuItinerario itinerario) {this.itinerario = itinerario;}


	@Override
	public String toString(){
		return "Estudiante: id: "+ id +", nombre: "+ nombre +", dni: "+ dni +", itinerario: "+ itinerario + ", orden seleccion: "+ orden;
	}

}