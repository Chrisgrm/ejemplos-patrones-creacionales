/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class FiestaGigante implements Realizador{
    private Realizador next;
   
    @Override
    public Realizador getNext() {
        return next;
    }

    @Override
    public void Fiesta(int invitados) {
        if (invitados>70){
            System.out.println("Enviando 4 recreacionistas, un DJ, una banda musical y un show de luces ");
        } else {
            next.Fiesta(invitados);
        }
    }
     @Override
    public void setNext(Realizador realizador) {
        next= realizador;
    }

    
}

    

