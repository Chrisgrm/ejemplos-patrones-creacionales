/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Organizacion implements Realizador{
    private Realizador next;
   
    
    @Override
    public Realizador getNext() {
        return next;
    }

    @Override
    public void Fiesta(int invitados) {
        
        FiestaPequeña fPequeña = new FiestaPequeña();
        this.setNext(fPequeña);
        
        FiestaMediana fMediana = new FiestaMediana();
        fPequeña.setNext(fMediana);
        
        FiestaGrande fGrande = new FiestaGrande();
        fMediana.setNext(fGrande);
        
        FiestaGigante fGigante = new FiestaGigante();
        fGrande.setNext(fGigante);  
        
        next.Fiesta(invitados);        
    }
    @Override
    public void setNext(Realizador realizador) {
        next= realizador;
    }
    
}

    

