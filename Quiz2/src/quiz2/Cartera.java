/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cartera implements PatronCartera{
    private String anho;
    private List<Tarjeta> tarjetas;
    private Scanner sc;
    
    public Cartera(String anho){
        this.anho = anho;
        tarjetas = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    
    public String getAnho(){
        return anho;
    }
    
    public void setAnho(String anho){
        this.anho = anho;
    }

    @Override
    public void imprimirListaDeTarjetas() {
        if (tarjetas.isEmpty()) {
            System.out.println("No hay tarjetas registradas.");
        } else {
            for (Tarjeta tarjeta : tarjetas) {
                System.out.println(tarjeta);
            }
        }
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        System.out.println("Ingresa el Numero de tu Cuenta:");
        String numeroDeCuenta = sc.nextLine();
        System.out.println("Ingresa el valor de Apertura:");
        double valorApertura = sc.nextDouble();
        System.out.println("Que tipo de tarjeta es:");
        String tipo = sc.nextLine();
        System.out.println("Ingrese el mes:");
        String mes = sc.nextLine();
        
        if ("Joven".equals(tipo)){
            Joven joven = new Joven(numeroDeCuenta, valorApertura, mes);
            tarjetas.add(joven);
        }else if ("Nomina".equals(tipo)){
            Nomina nomina = new Nomina(numeroDeCuenta, valorApertura, mes);
            tarjetas.add(nomina);
        }else if ("Visa".equals(tipo)){
            Visa visa = new Visa(numeroDeCuenta, valorApertura, mes);
            tarjetas.add(visa);
        }
        System.out.println("Tarjeta guardada correctamente");
    }
}
