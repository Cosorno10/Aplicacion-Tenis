
public class Equipo {


	private String nombre_equipo;
	private Jugador j1;
	private Jugador j2;
	
	public Equipo(String nombre_equipo,
			Jugador j1,Jugador j2)
	{
		this.nombre_equipo=nombre_equipo;
		this.j1=j1;
		this.j2=j2;
		
	}
	public Equipo
	(String param,String param1,String param2)
	{
		this.nombre_equipo=param;
		this.j1=new Jugador(param1);
		this.j2=new Jugador(param2);
	}
	public Equipo()
	{
		this.nombre_equipo="Equipo Reserva";
		this.j1=new Jugador("Andres");
		this.j2=new Jugador("Pedro");
	}
	
	public String getNombreequipo()
	{
		return this.nombre_equipo;
	}
	public Jugador getJ1()
	{
		return this.j1;
	}
	
	public Jugador getJ2()
	{
		return this.j2;
	}
	// METODOS ESPECIFICOS

	private int contabilizargolpesganadores()
	{
		return this.j1.getGolpesganadores()+this.j2.getGolpesganadores();	
				
	}
	
	private int contabilizarsaquesdirectos()
	{
		return this.j1.getSaquesdirectos()+this.j2.getSaquesdirectos();
	}
	private int contabilizarerroresnoforzados()
	{
		return this.j1.getErroresnoforzados()+this.j2.getErroresnoforzados();
	}
	
	public void informe_equipo()
	{
	System.out.println
	("****INFORME DEL EQUIPO: "+ this.nombre_equipo+"********");
	this.j1.informejugador();
	System.out.println("-----------------------");
	this.j2.informejugador();
	System.out.println("*****INFORME DEL EQUIPO*********");
	System.out.println
	("Total golpes ganadores: "+this.contabilizargolpesganadores());
	System.out.println
	("Total errores no forzados: "+this.contabilizarerroresnoforzados());
	System.out.println
	("Total saques directos: "+this.contabilizarsaquesdirectos());
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






