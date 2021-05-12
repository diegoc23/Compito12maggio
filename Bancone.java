/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettocompito;
import java.util.concurrent.Semaphore;

public class Bancone 
{
    Semaphore pieno = new Semaphore(1);
    Semaphore vuoto = new Semaphore(0);

    public void Deposito(int numPiatto) //il cuoco depositerà i piatti pronti
    {
        try
        {
            System.out.println("Il piatto n° " + numPiatto + " e' pronto.");
        }
        catch(Exception e)
        {
            
        }
    }
    
    
    
}
