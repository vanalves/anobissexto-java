/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anobisesexto;

import java.util.Scanner;

/**
 *
 * @author vanal
 */
public class AnoBisesexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        ano = teclado.nextInt();
        //se for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é BISSEXTO");
         //Se o ano for menos que 400
        }else if(ano % 4 == 0 && ano% 100 !=0 ){
            System.out.println(ano + " é BISSEXTO");
        }else{
            System.out.println(ano + " não é BISSEXTO");
        }
        
    }
    
}
