package simplestock;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SimpleStock {
    public static void main(String[] args){
        String nombre;
        String cole;
        int codigo;
        int cont= 0;
        Pieza[] Piezas=new Pieza[10]; //INICIALIZA ARREGLO DE PIEZAS
        int opc=-1;
        while(opc != 0){ //INICIO MENU
            String auxIn= JOptionPane.showInputDialog("Bienvenid@, elija la opción que desee\n1 - Cargar una pieza al sistema\n2 - Ver las piezas cargadas en el sistema\n0 - SALIR DEL PROGRAMA");
            /*System.out.println("Bienvenid@, elija la opción que desee");
            System.out.println("1 - Cargar una pieza al sistema");
            System.out.println("2 - Ver las piezas cargadas en el sistema");
            System.out.println("0 - SALIR DEL PROGRAMA");
            Scanner sc= new Scanner(System.in);
            opc= Integer.parseInt(sc.nextLine()); */ //PIDE OPCION DE MENU
            opc= Integer.parseInt(auxIn);
            if (opc == 1){
                System.out.println("\nCARGA DE PIEZA");
                auxIn= JOptionPane.showInputDialog("Introduzca el nombre de la pieza");
                nombre= auxIn;
                auxIn= JOptionPane.showInputDialog("Introduzca la coleccion a la cual pertenece");
                cole= auxIn;
                auxIn= JOptionPane.showInputDialog("Introduzca el codigo de la pieza");
                codigo= Integer.parseInt(auxIn);
                Piezas[cont]= new Pieza(nombre, cole, codigo);
                System.out.println("\nDATOS INGRESADOS DE LA PIEZA ESSEN" + "\nNOMBRE: " + Piezas[cont].getNombre() + "\nCOLECCION: " + Piezas[cont].getCole() + "\nCODIGO: " + Piezas[cont].getCodigo());
                cont++;
            }else if (opc == 2){
                System.out.println("\n-- PIEZAS CARGADAS --");
                for (int i=0; i < cont; i++){
                    System.out.println("\nDATOS INGRESADOS DE LA PIEZA ESSEN" + "\nNOMBRE: " + Piezas[i].getNombre() + "\nCOLECCION: " + Piezas[i].getCole() + "\nCODIGO: " + Piezas[i].getCodigo());
                }
                
            }
            
        }
        
    }
}

class Pieza{
    private final String nombre;
    private final String cole;    //cole = coleccion
    private final int codigo;
    //private evento[] movi= new evento[10]; //movi = movimientos
    //private  registro 
    public Pieza(String nombre, String cole,int codigo){
        this.nombre= nombre;
        this.cole= cole; 
        this.codigo= codigo;
    }
    public String getNombre(){ //GETTER
        return nombre;    
    }
    
    public String getCole(){ //GETTER
        return cole;    
    }

    public int getCodigo(){ //GETTER
        return codigo;    
    }
}

class evento{
    private Date fecha;
    private double monto;
    private int cant; //cant = cantidad
    private String tipo;
    
    public evento(int dia, int mes, int anio,double monto,int cant,String tipo){
        Date fecha1= new Date(anio, mes, dia);
        fecha= fecha1;
        this.monto= monto;
        this.cant= cant;
        this.tipo= tipo;
    }
    
    public Date getFecha(){
        return fecha;        
    }
    
    public double getMonto(){
        return monto;
    }
    
    public int getCantidad(){
        return cant;        
    }
    
    public String getTipo(){
        return tipo;
    }
}