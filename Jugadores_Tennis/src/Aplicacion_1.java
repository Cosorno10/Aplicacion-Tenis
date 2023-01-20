import java.util.Scanner;

public class Aplicacion_1 {
	
	private static Scanner sc;
	private static Equipo eq1;
	private static Equipo eq2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int opcion;
		do {
		System.out.println("++++MENU PARTIDO+++++");
		System.out.println("1.-Crear Equipos");
		System.out.println("2.- Contabilizar Ganadores");
		System.out.println("3.-Contabilizar errores");
		System.out.println("4.-Contabilizar saques");
		System.out.println("5.-Mostrar Info Equipo");
		System.out.println("6.- Salir de la aplicacion");
		System.out.println("Elegir opcion: ");
		opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				crearequipo();
				break;
			case 2:
				contabilizargolpesganadores();
				break;
			case 3:
				contabilizarerrores();
				break;
			case 4:
				contabilizarsaques();
				break;
			case 5:
				mostrarinfoequipo();
				break;
			case 6:
				System.out.println("Programa finalizado");
				System.exit(0);
			
				break;
			default:
			System.out.println
			("Opcion erronea, marcar valor de 1-6");	
				break;
			}
			
		} while (opcion!=6);
			
		
	}//FIN METODO MAIN

	
	
	private static void crearequipo()
	{
		int opcion;
		boolean comprobar=true;
		do {
			System.out.println("+++SELECCIONA EQUIPO+++");
			System.out.println("1.- EQUIPO 1");
			System.out.println("2.- EQUIPO 2");
			System.out.println("3.- TERMINAR CREAR EQUIPO");
			System.out.println("Elija opcion:");
			opcion=sc.nextInt();
				switch (opcion) {
				case 1:
					if(eq1==null)
					{
					System.out.println
					("Introduce nombre del equipo 1");
					String nombre=sc.next();
					System.out.println
					("Introduce nombre del jugador 1 1 equipo");
					String nombrej1=sc.next();
					System.out.println
					("Introduce nombre del jugador 2 equipo 1");
					String nombrej2=sc.next();
				eq1=new Equipo(nombre, nombrej1, nombrej2);	
						
					}else {
				System.out.println("El equipo 1 ya existe");		
					}
					
					break;
				case 2:
					if(eq2==null)
					{
					System.out.println
					("Introduce nombre del equipo 2");
					String nombre=sc.next();
					System.out.println
					("Introduce nombre del jugador 1 equipo 2");
					String nombrej1=sc.next();
					System.out.println
					("Introduce nombre del jugador 2 equipo 2");
					String nombrej2=sc.next();
				eq2=new Equipo(nombre, nombrej1, nombrej2);	
						
					}else {
				System.out.println("El equipo 2 ya existe");		
					}
					break;
				case 3:
						if(eq1==null)
							{System.out.println
							("Debes crear equipo 1");
							}
						
						else if(eq2==null)
							{System.out.println
							("Debes crear equipo 2");
							}
						
						else
							comprobar=false;
							
					break;
				default:
			System.out.println("Opcion incorrecta marcar del 1-3");		
					break;
				}
			
		} while (comprobar);
		System.out.println("Los dos equipos han sido creados");
		
	}
	private static void comprobarequipo()
	{
		if(eq1==null)
		{
			System.out.println
			("El equipo 1 debe estar creado");
		crearequipo();
		}else if(eq2==null)
		{
			System.out.println
			("El equipo 2 debe estar creado");
		crearequipo();	
		}
	}
	
	
	private static void contabilizargolpesganadores()
	{
		
		comprobarequipo();		
		
		System.out.println("Introduzca nombre del jugador");
		String nombrej=sc.next();

		if(eq1.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ1().contabilizargolpesganadores();
		}else if(eq1.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ2().contabilizargolpesganadores();
		}
		
		
		else if(eq2.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ1().contabilizargolpesganadores();
		}else if(eq2.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ2().contabilizargolpesganadores();	
		}else
		{
			System.out.println("Jugador no existe");
		}
	

		
	}
	
	private static void contabilizarsaques()
	{
		comprobarequipo();
		System.out.println("Introduzca nombre del jugador");
		String nombrej=sc.next();
	
		if(eq1.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ1().contabilizarsaquesdirectos();
		}else if(eq1.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ2().contabilizarsaquesdirectos();
		}
		else if(eq2.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ1().contabilizarsaquesdirectos();
		}else if(eq2.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ2().contabilizarsaquesdirectos();	
		}else
		{
			System.out.println("Jugador no existe");
		}
	

		
	}	
	
	private static void contabilizarerrores()
	{
		comprobarequipo();
		System.out.println("Introduzca nombre del jugador");
		String nombrej=sc.next();
	
		if(eq1.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ1().contabilizarerroresnoforzados();
		}else if(eq1.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq1.getJ2().contabilizarerroresnoforzados();
		}
		else if(eq2.getJ1().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ1().contabilizarerroresnoforzados();
		}else if(eq2.getJ2().getNombre().equalsIgnoreCase(nombrej))
		{
			eq2.getJ2().contabilizarerroresnoforzados();	
		}else
		{
			System.out.println("Jugador no existe");
		}
	
	}
	
	private static void mostrarinfoequipo()
	{
		comprobarequipo();
		int opcion;
		do {
			System.out.println
			("+++SELECIONE EQUIPO DEL QUE OBTENER INFO+++"); 
			System.out.println("1.-Equipo 1");
			System.out.println("2.- Equipo 2");
			System.out.println("3.- Salir de informe");
			System.out.println("Seleccione equipo:");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				if(eq1==null)
				{
					System.out.println("El equipo no se ha creado");
				}else
				{
					eq1.informe_equipo();
				}
				break;
			case 2:
				if(eq2==null)
				{
					System.out.println("El equipo 2 no se ha creado");
				}else {
					eq2.informe_equipo();
				}
				
				break;
			case 3:
				System.out.println("Salir informe equipo");
				break;
			default:
			System.out.println("Opcion erronea");	
				break;
			}
			
			
		} while (opcion!=3);
		
	}
	
}//FIN CLASE











