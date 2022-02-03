/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author david
 */
public class Operaciones {
    
    public static String hacerFormula(String[] valores){
    String resultados="";
    String helper="";
    double res;
    double c;
    double a=0;
    double b=0;
    c = 299792456;
       
            res=0;
            a=Double.parseDouble(valores[0]);
            b=Double.parseDouble(valores[1]);
            
            res= a*Math.pow(c,2)/Math.sqrt(1-(Math.pow(b,2)/Math.pow(c,2)));
      //      res= Math.pow((a*c),2)/Math.sqrt(1-Math.pow(b,2)/Math.pow(c,2));
      helper=String.valueOf(res);
      resultados=helper;      
   
    return resultados;
    
    }
    
       public static String sumaValores(String[] valores){
    
        String resultado="";
        String helper="";
        double res;
        double a;
        double b;
        double c;
        
        a=Double.parseDouble(valores[0]);
        b=Double.parseDouble(valores[1]);
        c=Double.parseDouble(valores[2]);
        
        res=a+b+c;
        
        helper=String.valueOf(res);
        resultado=helper;  
        return resultado;
    }
     
       public static String promedioValores(String[] valores){
    
        String resultado="";
        String helper="";
        double res;
        double a;
        double b;
        double c;
        
        a=Double.parseDouble(valores[0]);
        b=Double.parseDouble(valores[1]);
        c=Double.parseDouble(valores[2]);
        
        res=(a+b+c)/3;
        
        helper=String.valueOf(res);
        resultado=helper; 
        return resultado;
    }
}
//double numero = 11;
//		double cuadrado = Math.pow(numero, 2);
//		System.out.println("11 elevado al cuadrado es " + cuadrado);