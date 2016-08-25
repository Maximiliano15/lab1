
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maximiliano
 */
public class Cajero {
    private String clave;
    private ArrayList<Transaccion> CAJERO ;

    public Cajero(String clave, ArrayList<Transaccion> CAJERO) {
        this.clave = clave;
        this.CAJERO = CAJERO;
    }

    
   
    
    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Transaccion> getCAJERO() {
        return CAJERO;
    }

    public void setCAJERO(ArrayList<Transaccion> CAJERO) {
        this.CAJERO = CAJERO;
    }
    
    public void mostrar_Opciones(){
        
    }
    
      public void Solicitar_Clave(){
        
    }
      
      public void Verificar_banco(){
        
    }
      
      public void Da_Repuesta(){
        
    }  
    
    
    
    
    
}
