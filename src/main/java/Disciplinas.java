
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

public class Disciplinas implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idDisciplina;
    private String nome;
    private int horas;
    private String cdisciplina;

    public Disciplinas(int idDisciplina, String nome, int horas, String cdisciplina) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.horas = horas;
        this.cdisciplina = cdisciplina;
    }

    Disciplinas() {
       
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCdisciplina() {
        return cdisciplina;
    }

    public void setCdisciplina(String cdisciplina) {
        this.cdisciplina = cdisciplina;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "idDisciplina=" + idDisciplina + ", nome=" + nome + ", horas=" + horas + ", cdisciplina=" + cdisciplina + '}';
    }

    void setHora(int parseInt) {
        
    }
    
}
