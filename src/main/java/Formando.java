
import java.io.Serializable;


public class Formando implements Serializable {
private static final long serialVersionUID = 1L;
    private int idFormando;
    private String nomef;
    private String masculino;
    private int telefones;

    public Formando(int idFormando, String nomef, String masculino, int telefones) {
        this.idFormando = idFormando;
        this.nomef = nomef;
        this.masculino = masculino;
        this.telefones = telefones;
    }

    Formando() {
        
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

    public String getMasculino() {
        return masculino;
    }

    public void setMasculino(String masculino) {
        this.masculino = masculino;
    }

    public int getTelefones() {
        return telefones;
    }

    public void setTelefones(int telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Formando{" + "idFormando=" + idFormando + ", nomef=" + nomef + ", masculino=" + masculino + ", telefones=" + telefones + '}';
    }

    


}
