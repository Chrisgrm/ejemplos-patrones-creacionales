/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class FiestaGrande implements Realizador{
    
    private Realizador next;
   

    @Override
    public Realizador getNext() {
        return next;
    }

    @Override
    public void Fiesta(int invitados) {
        if (invitados>40 && invitados <=70){
            System.out.println("Enviando 4 recreacionistas y un grupo musical");
        } else {
            next.Fiesta(invitados);
        }
    }
     @Override
    public void setNext(Realizador realizador) {
        next= realizador;
    }
    
    
}


