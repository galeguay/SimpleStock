package controlador;
import modelo.*;
import java.util.*;

public class main {  
    public static void main(String[] args){
        LinkedList<Pieza> Piezas= new LinkedList();
        LinkedList<Bazar> Bazares= new LinkedList();
	Pieza aux;
        Bazar aux1;
        Piezas.add(aux= new Pieza("Wok",30201003,"Chef",0));
	Piezas.add(aux= new Pieza("Sartén Chef",30201004,"Chef",0));
	Bazares.add(aux1= new Bazar("Pelapapas",30201001,0));
	Piezas.add(aux= new Pieza("Savarín",30201002,"Complementos",0));
        Collections.sort(Piezas);
        System.out.println("\nPIEZAS CARGADAS\n");
        for (Pieza p: Piezas){        
        System.out.println(p.getResumen());       
        }
        System.out.println("\nPRODUCTOS DE BAZAR CARGADOS\n");        
        for (Bazar b: Bazares){
            System.out.println(b.getResumen());            
        }
    }
}