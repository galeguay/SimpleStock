package modelo;


abstract class Producto {

    public Producto(String nombre, int codigo, int cantidad){
        
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }
    
    public int getCodigo(){ //getter codigo
        return codigo;
    }
    
    
    public String getNombre(){ //getter nombre
        return nombre;
    }
    
    public void setNombre(String nombre){ //setter nombre
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void sumaCantidad(int cantidad){     //SUMA EL VALOR PASADO A LA VARIABLE CANT
        this.cantidad+= cantidad;
    }
    
    public void restaCantidad(int cantidad){    //RESTA EL VALOR PASADO A LA VARIABLE CANT
        this.cantidad-= cantidad;
    }
    
    abstract String getResumen();

    private String nombre;
    
    private int codigo;
        
    private int cantidad;
}
