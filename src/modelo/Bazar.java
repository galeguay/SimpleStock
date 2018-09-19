package modelo;


public class Bazar extends Producto implements Comparable<Bazar>{
    
    public Bazar(String nombre, int codigo, int cantidad){
        super(nombre, codigo, cantidad);        
    }
    
    public String getResumen(){
        return "Hay " + getCantidad() + " " + getNombre() + " en stock. (COD: " + getCodigo() + ")";    
    }

    public int compareTo(Bazar o) {
        return getCodigo() - o.getCodigo();
    }

}
