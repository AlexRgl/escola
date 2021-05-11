import java.io.Serializable;
import java.util.ArrayList;

public class Cursos implements Serializable {
private static final long serialVersionUID = 1L;
    private int idCurso;
    private String nome;
    private int horas;
    private String cdisciplina;

    Cursos() {
        
    }

    @Override
    public String toString() {
        return "Cursos{" + "idCurso=" + idCurso + ", nome=" + nome + ", horas=" + horas + ", cdisciplina=" + cdisciplina + '}';
    }

    public Cursos(int idCurso, String nome, int horas, String cdisciplina) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.horas = horas;
        this.cdisciplina = cdisciplina;
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


}
