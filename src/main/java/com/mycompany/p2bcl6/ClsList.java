
package com.mycompany.p2bcl6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 *
 * @author chinc
 */
public class ClsList {
    public static void main(String[] args) {
       
        List<ClsVendedores> misEmp = new ArrayList();
        
         Random R = new Random();
         
         // Vendedor 1
        ClsVendedores ven = new ClsVendedores("Andrew");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
       
                    
        //  Vendedor 2
        ven = new ClsVendedores("Karla");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
        
        
        //  Vendedor 3
        ven = new ClsVendedores("Ramon");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
        
        
        //  Vendedor 4
        ven = new ClsVendedores("Dayana");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
        
        
        //  Vendedor 5
        ven = new ClsVendedores("Suly");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
        
        
        //  Vendedor 6
        ven = new ClsVendedores("Maria");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
  
        
        //  Vendedor 7
        ven = new ClsVendedores("Martin");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
        
        
        //  Vendedor 8
        ven = new ClsVendedores("Lucas");
        ven.setEnero(R.nextInt(5000)+50);
        ven.setFebrero(R.nextInt(5000)+50);
        ven.setMarzo(R.nextInt(5000)+50);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
        
        double sumaEnero   = 0;
        double sumaFebrero = 0;
        double sumaMarzo   = 0;
        double TotalVenta  = 0;
        double Comision20  = 0;
        double Comision35  = 0;
        double TotalVComisiones = 0;
        double Isr = 0;
        double TotalLiq = 0;
        double sumfinal = 0;
        
           System.out.println("\n\t\t\t\t\t\t\tDATOS DE LOS VENDEDORES: ");//ENCABEZADO
           System.out.println("\n");
           System.out.println("\tNOMBRE\t\tENERO\tFEBRERO\tMARZO\t\tTOTAL VENTA\t20%\t  35%\t\tT.V.COMISIONES\t\tISR 5%\t\t  Total Liquido");
           System.out.println("");
           
        for (ClsVendedores v : misEmp){//CALCULOS TABLA DE VENDEDORES
          
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            TotalVenta = (v.getEnero()+v.getFebrero()+v.getMarzo());// TOTAL DE VENTA
            
            
            if(TotalVenta<=2000){// COMISIONES DEL 20%
                Comision20 = (TotalVenta*20/100);
                Comision35 = 0;
            }
                //Comision20 = 0;
            
            if(TotalVenta>=2001){// COMISIONES DEL 35%
                Comision35 = (TotalVenta*35/100);
                Comision20 = 0;
            }
               // Comision35 = 0;
            
               
            TotalVComisiones = (TotalVenta+Comision20+Comision35);// TOTAL DE VENTAS + COMISIONES
            Isr = (TotalVComisiones*5/100);// DESCUENTO ISR 5%
            TotalLiq = Math.round(TotalVComisiones-Isr); // TOTAL LIQUIDO
            
            //IMPRECION DE LOS DATOS EN FORMA DE TABLA
            System.out.println("\t"+v.getNombre()+"\t\t"+v.getEnero()+" \t"+v.getFebrero()+" \t"+v.getMarzo()+"\t\t"+TotalVenta+"\t\t"+Comision20+"\t "+Comision35+" \t "+TotalVComisiones+" \t\t"+Isr+"   \t\t"+TotalLiq+" \t");


        }
        
        //SUMA TOTAL POR LOS MESES
        System.out.println("\n"); 
        System.out.println("\n\t SUMA DE VENTAS TOTALES POR MES: ");
         System.out.println("\n");
        System.out.println("\tLA SUMA DE ENERO   ES = Q"+sumaEnero);
        System.out.println("\tLA SUMA DE FEBRERO ES = Q"+sumaFebrero);
        System.out.println("\tLA SUMA DE MARZO   ES = Q"+sumaMarzo);
        sumfinal = (sumaEnero+sumaFebrero+sumaMarzo);
        
        //SUMA FINAL DE TODAS LAS VENTAS
        System.out.println("\n");
        System.out.println("\tTOTAL FINAL DE VENTAS ASCIENDE A: Q"+sumfinal);
        
        
    }
   
}


