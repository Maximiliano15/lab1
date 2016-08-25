
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
public class Cuenta {
    private int Num_cuenta;
    private int Num_cliente;
    private String Tipo_cuenta;
    private double saldo;
    private ArrayList<Banco> Bancos;

    public Cuenta(int Num_cuenta, int Num_cliente, String Tipo_cuenta, double saldo, ArrayList<Banco> Bancos) {
        this.Num_cuenta = Num_cuenta;
        this.Num_cliente = Num_cliente;
        this.Tipo_cuenta = Tipo_cuenta;
        this.saldo = saldo;
        this.Bancos = Bancos;
    }

    public ArrayList<Banco> getBancos() {
        return Bancos;
    }

    public void setBancos(ArrayList<Banco> Bancos) {
        this.Bancos = Bancos;
    }

  

    public int getNum_cuenta() {
        return Num_cuenta;
    }

    public void setNum_cuenta(int Num_cuenta) {
        this.Num_cuenta = Num_cuenta;
    }

    public int getNum_cliente() {
        return Num_cliente;
    }

    public void setNum_cliente(int Num_cliente) {
        this.Num_cliente = Num_cliente;
    }

    public String getTipo_cuenta() {
        return Tipo_cuenta;
    }

    public void setTipo_cuenta(String Tipo_cuenta) {
        this.Tipo_cuenta = Tipo_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Consultar_cuenta(){
        
    }
    
    
}
