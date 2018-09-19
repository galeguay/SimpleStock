
package modelo;

import java.util.*;


public class Pieza extends Producto implements Comparable<Pieza>{
    
    public Pieza(String nombre,int codigo, String cole,int cantidad){
        super(nombre, codigo, cantidad);
        this.cole= cole;
    }
    
    public String getResumen(){
        
        return "Hay " + getCantidad() + " " + getNombre() + " en stock. (COD: " + getCodigo() + ")";
    }
    
    public String getCole(){	//GETTER
        return cole;    
    }
    
    public void addEvento(int dia, int mes, int anio,double monto,int cantidad,tipoEvento tipo){
        Evento auxEvento= new Evento(dia, mes, anio, monto, cantidad, tipo);
        eventos.add(auxEvento);
    }
    
    public Evento getEvento(int pos){	//SETTER DEL EVENTO DE LA POSICION DESEADA 
        return eventos.get(pos);
    } 
    
    private final String cole;	//cole = coleccion	
    private List<Evento> eventos= new ArrayList();
    //private evento[] eventos= new evento[10];

    @Override
    public int compareTo(Pieza o) {
        return getCodigo() - o.getCodigo();
    }
}

