/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Client;

/**
 * hashCode e equals
 * 
 * sao operacoes da classe Object utilizada para comparar se um ojbeto é igual o outro
 * 
 * equals: lento, respota 100%
 * 
 * hashCode: rapida, porem resposta positiva nao é 100%
 * 
 * 
 * tipos comuns (String, Date, Integer, Double etc) ja possuem 
 * 
 * Classes personalizadas precisam sobrepo-la   - exemplo classe = pessoa cliente carro etc
 * 
 * 
 * equals - metodo que compara se objeto é igual outro retorna true ou false
 * String a = "Maria";
 * String b = "Alex";
 * System.out.println(a.equals(b));
 * 
 * 
 * 
 * 
 */
public class Program {
    
    public static void main(String[] args){
      String a = "Maria";
      String b = "Alex";
      
      
      System.out.println(a.equals(b));

      
       System.out.println(a.hashCode());
       System.out.println(b.hashCode());
       
       
       Client c1 = new Client("Maria", "maria@gmail.com");
       Client c2 = new Client("Maria", "maria@gmail.com");
       
       System.out.println("====================================");
       System.out.println("*   imprimindo hasCode e equals    *");
       System.out.println();
       System.out.println(c1.hashCode());
       System.out.println(c2.hashCode());
       System.out.println(c1.equals(c2));
        
       System.out.println(c1 == c2);  // desse jeito nao pode porque sao objeto e assim ele pega ref de memoria
       
        
       
       
       
       
       
    }
}
