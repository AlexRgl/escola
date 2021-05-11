
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre
 */
public class Nomeado implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nomed;

    public Nomeado(String nomed) {
        this.nomed = nomed;
    }

    Nomeado() {
       
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    @Override
    public String toString() {
        return "Nomeado{" + "nome=" + nomed + '}';
    }
    
}
