
package modelo;

import java.util.Date;


public class Evento {

    private final Date fecha;
    private final double monto;
    private final int cant;		//cant = cantidad
    private final tipoEvento tipo;
    
    public Evento(int dia, int mes, int anio,double monto,int cant,tipoEvento tipo){
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
    
    public tipoEvento getTipo(){
        return tipo;
    }
}

enum tipoEvento{Ingreso,Egreso,PrestamoPedido,PrestamoDado,DevoluciónDePPedido,DevoluciónDePDado};