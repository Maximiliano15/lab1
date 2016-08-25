
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
public class Cliente {
    private int Num_cliente;
    private int  Indentificacion;
    private String  Nombre;
    private String apellido;
    private int Telefono;
    private ArrayList<Tarjeta> Targetas;

    public Cliente(int Num_cliente, int Indentificacion, String Nombre, String apellido, int Telefono) {
        this.Num_cliente = Num_cliente;
        this.Indentificacion = Indentificacion;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.Telefono = Telefono;
        this.Targetas=new ArrayList<Tarjeta>();
    }

    public ArrayList<Tarjeta> getTargetas() {
        return Targetas;
    }

    public void setTargetas(ArrayList<Tarjeta> Targetas) {
        this.Targetas = Targetas;
    }

    public int getNum_cliente() {
        return Num_cliente;
    }

    public void setNum_cliente(int Num_cliente) {
        this.Num_cliente = Num_cliente;
    }

    public int getIndentificacion() {
        return Indentificacion;
    }

    public void setIndentificacion(int Indentificacion) {
        this.Indentificacion = Indentificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    
    }
    
    public int IngresarClave(){
      return 0;  
    }
    
    public int Elegir_Opcion(){
        return 0;
    }
    
    public int RetirarValoraRetirar(){
        return 0;
    }
    
    
}
