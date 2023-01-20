
public class Aplicacion {
	
	public  Equipo eq3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo eq1;
		Equipo eq2;
		
		int a;
		int b;
		a=8;
		b=9;
		
	eq1= new Equipo("España",new Jugador("Rafa"), new Jugador("David"));
	
	eq1.getJ1().contabilizargolpesganadores();
	eq1.getJ1().contabilizargolpesganadores();
	
	eq1.getJ2().contabilizargolpesganadores();
	System.out.println(eq1.getNombreequipo());
	
	
	eq1.informe_equipo();
	eq1.getJ1().nacionalidad="FRANCIA";
	System.out.println(eq1.getJ1().nacionalidad);
	System.out.println(eq1.getJ2().nacionalidad);
	System.out.println(Jugador.nacionalidad);
	
	
	
	
	
	
	
	
	
	
	}

}







