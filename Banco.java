/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maximiliano
 */
public class Banco {

    private int numero_banco;
    private String nombre;
    private String direccion;
    private int Telefono;

    public Banco(int numero_banco, String nombre, String direccion, int Telefono) {
        this.numero_banco = numero_banco;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Telefono = Telefono;
    }

    public int getNumero_banco() {
        return numero_banco;
    }

    public void setNumero_banco(int numero_banco) {
        this.numero_banco = numero_banco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void verificar_Transaccion() {

    }

    public void verificar_cuenta() {

    }

    public void saldo() {

    }

}
