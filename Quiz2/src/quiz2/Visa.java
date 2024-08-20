/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

public class Visa extends Tarjeta{
    private double descuento = 0.18;
    
    public Visa(String numeroDeCuenta, double valorApertura, String mes){
        super(numeroDeCuenta, valorApertura, mes);
        this.descuento = descuento;
    }

    @Override
    public double cuotaDeManejo() {
        return 50000-(getValorApertura() - (getValorApertura() * descuento));
    }
}
