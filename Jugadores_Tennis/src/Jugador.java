
public class Jugador {
	
	private String nombrejugador;
	private int golpesganadores;
	private int erroresnoforzados;
	private int saquesdirectos;
	static String nacionalidad="España";
	
	public Jugador(String nombre)
	{
		this.nombrejugador=nombre;
		
	}
	public String getNombre()
	{
		return this.nombrejugador;
	}
	public int getGolpesganadores()
	{
		return this.golpesganadores;
	}
	public int getErroresnoforzados()
	{
		return this.erroresnoforzados;
	}
	public int getSaquesdirectos()
	{
		return this.saquesdirectos;
	}
	// METODO ESPECIFICOS
	
	public void contabilizargolpesganadores()
	{
		this.golpesganadores++;
	}
	
	public void contabilizarerroresnoforzados()
	{
		this.erroresnoforzados++;
	}
	public void contabilizarsaquesdirectos()
	{
		this.saquesdirectos++;
	}
	public static String Info()
	{
		
		return "HOLA";
	}
	public void informejugador()
	{
		System.out.println(Jugador.nacionalidad);
	System.out.println("*****DATOS DEL JUGADOR: "+this.getNombre());
	System.out.println("Golpes ganadores: "
	+this.golpesganadores);
	System.out.println("Saques directos: "+
	this.saquesdirectos);
	System.out.println("Errores no forzados:"+ this.erroresnoforzados);
	Jugador.Info();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
