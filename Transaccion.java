
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
public class Transaccion {

    private Date Fecha;
    private String Descrpcion;
    private String Tipo;
    private double Valor;
    private ArrayList<Cuenta> Cuentas;

    public Transaccion(Date Fecha, String Descrpcion, String Tipo, double Valor, ArrayList<Cuenta> cuentas) {
        this.Fecha = Fecha;
        this.Descrpcion = Descrpcion;
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.Cuentas=new ArrayList<Cuenta>();
    }

    public Date getFecha() {
        return Fecha;
    }

    public ArrayList<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescrpcion() {
        return Descrpcion;
    }

    public void setDescrpcion(String Descrpcion) {
        this.Descrpcion = Descrpcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int retirar() {
        return 0;
    }

}
