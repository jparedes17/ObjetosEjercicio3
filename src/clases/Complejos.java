/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pared
 */
public class Complejos 
{
  private double numero1;
  private double numero2;
public Complejos ()
{
    numero1= 0.0;
    numero2= 0.0;        
}
 public Complejos (double numero1, double numero2)
 {
     this.numero1= numero1;
     this.numero2= numero2;
 }  

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
 
    public Complejos sumar (Complejos num3)
    {
        Complejos num;
        double sum1, sum2;
        
        sum1= (this.numero1 + num3.numero1);
        sum2= (this.numero2 + num3.numero2);
        
        num= new Complejos (sum1, sum2);
        return num;
    }
    
     public Complejos restar (Complejos num3)
    {
        Complejos num;
        double sum1, sum2;
        
        sum1= (this.numero1 - num3.numero1);
        sum2= (this.numero2 - num3.numero2);
        
        num= new Complejos (sum1, sum2);
        return num;
    }
     
     
       public Complejos multiplicar (Complejos num3)
    {
        Complejos num;
        double sum1, sum2;
        
        sum1= (this.numero1 * num3.numero1)-(this.numero2 * num3.numero2);
        sum2= (this.numero1 * num3.numero2)+(this.numero2 * num3.numero1);
        
        num= new Complejos (sum1, sum2);
        return num;
    }
       public Complejos division (Complejos num3)
       {
         Complejos num;
        double sum1, sum2;
        
        sum1= ((((this.numero1*num3.numero1))+(this.numero2*num3.numero2))/((num3.numero1*num3.numero1)+(num3.numero2*num3.numero2)));
        sum2= ((((this.numero1*num3.numero2))-(this.numero2*num3.numero1))/((num3.numero1*num3.numero1)+(num3.numero2*num3.numero2)));
        
        num = new Complejos (sum1, sum2);
        return num;
       }
}