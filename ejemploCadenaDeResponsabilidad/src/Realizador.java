/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public interface Realizador {
    
    public void setNext(Realizador realizador);
    public Realizador getNext ();
    public void Fiesta (int invitados);            
    
}
