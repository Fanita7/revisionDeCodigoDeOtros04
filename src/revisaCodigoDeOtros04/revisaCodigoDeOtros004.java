package revisaCodigoDeOtros04;
import java.util.Scanner;
public class revisaCodigoDeOtros004 {

	public static void main(String[] args) { //se agrega public static void
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
    	System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    	String j1 = s.nextLine().toLowerCase();//se agrega .toLowerCase()
 // se borra scanner 2
    	System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //jugador 2
        String j2 = s.next().toLowerCase();//se agrega .toLowerCase()
    
    if (j1.equals(j2)) { //se quita una ) //se le pone equals
      System.out.println("Empate");
    } else {
      int g = 2;
      
      switch(j1) {
        case "piedra":
        	if (j2.equals("tijeras")) { //se le pone equals
            g = 1;
        	}
        	break; //se le pone break

        case "papel":
        	if (j2.equals("piedra")) { //se le pone equals
            g = 1;
        	}
        	break; //se le pone break
            
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break; //se le pone break
          
        default:
        	System.out.println("Esa no es una opción"); //se le pone un mensaje por default
        	return;
      		}
      System.out.println("Gana el jugador " + g);
    
  	}
 s.close(); //se cierra scanner
	}
    
	
}
