/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;


public class Joven extends Tarjeta{
    private double descuento = 0.11;
    
    public Joven(String numeroDeCuenta, double valorApertura, String mes){
        super(numeroDeCuenta, valorApertura, mes);
        this.descuento = descuento;
    }

    @Override
    public double cuotaDeManejo() {
        return 50000 - getValorApertura()*descuento;
    }
}
