
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
public class CursoForm implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idFormando;
    private String nomef;
    private int idCurso;
    private String nome;

    CursoForm() {
        
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CursoForm(int idFormando, String nomef, int idCurso, String nome) {
        this.idFormando = idFormando;
        this.nomef = nomef;
        this.idCurso = idCurso;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CursoForm{" + "idFormando=" + idFormando + ", nomef=" + nomef + ", idCurso=" + idCurso + ", nome=" + nome + '}';
    }
    
}
