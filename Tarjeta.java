/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maximiliano
 */
public class Tarjeta {
    private int numero_Tarjeta;
    private int num_Cajero;
    private int numero_Cliente;
    private Date Fechha_de_Expiracion;

    public Tarjeta(int numero_Tarjeta, int num_Cajero, int numero_Cliente, Date Fechha_de_Expiracion) {
        this.numero_Tarjeta = numero_Tarjeta;
        this.num_Cajero = num_Cajero;
        this.numero_Cliente = numero_Cliente;
        this.Fechha_de_Expiracion = Fechha_de_Expiracion;
    }

    public int getNumero_Tarjeta() {
        return numero_Tarjeta;
    }

    public void setNumero_Tarjeta(int numero_Tarjeta) {
        this.numero_Tarjeta = numero_Tarjeta;
    }

    public int getNum_Cajero() {
        return num_Cajero;
    }

    public void setNum_Cajero(int num_Cajero) {
        this.num_Cajero = num_Cajero;
    }

    public int getNumero_Cliente() {
        return numero_Cliente;
    }

    public void setNumero_Cliente(int numero_Cliente) {
        this.numero_Cliente = numero_Cliente;
    }

    public Date getFechha_de_Expiracion() {
        return Fechha_de_Expiracion;
    }

    public void setFechha_de_Expiracion(Date Fechha_de_Expiracion) {
        this.Fechha_de_Expiracion = Fechha_de_Expiracion;
    }
    
    
    
    

}