
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexandre
 */
public class CursoDisci implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String nomed;
    private int idCurso;
    private int idDisciplina;
    private int horas;
    CursoDisci() {

    }

    public CursoDisci(String nome, String nomed, int idCurso, int idDisciplina, int horas) {
        this.nome = nome;
        this.nomed = nomed;
        this.idCurso = idCurso;
        this.idDisciplina = idDisciplina;
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public CursoDisci(String nome, String nomed, int idCurso, int idDisciplina) {
        this.nome = nome;
        this.nomed = nomed;
        this.idCurso = idCurso;
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public String toString() {
        return "CursoDisci{" + "nome=" + nome + ", nomed=" + nomed + ", idCurso=" + idCurso + ", idDisciplina=" + idDisciplina + '}';
    }
  
}
