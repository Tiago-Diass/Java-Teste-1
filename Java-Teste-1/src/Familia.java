public class Familia {
    private Pessoa encarregadoEducacao;
    private String parentescoEncEducacao;
    private Pessoa aluno;

    public Familia() {
    }

    public Familia(Pessoa encarregadoEducacao, String parentescoEncEducacao, Pessoa aluno) {
        this.encarregadoEducacao = encarregadoEducacao;
        this.parentescoEncEducacao = parentescoEncEducacao;
        this.aluno = aluno;
    }

    public Pessoa getEncarregadoEducacao() {
        return encarregadoEducacao;
    }

    public void setEncarregadoEducacao(Pessoa encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }

    public String getParentescoEncEducacao() {
        return parentescoEncEducacao;
    }

    public void setParentescoEncEducacao(String parentescoEncEducacao) {
        this.parentescoEncEducacao = parentescoEncEducacao;
    }

    public Pessoa getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Familia [encarregadoEducacao=" + encarregadoEducacao + ", parentescoEncEducacao="
                + parentescoEncEducacao + ", aluno=" + aluno + "]";
    }
    
    public String getInfoEncEducacao(){
        return this.encarregadoEducacao + this.parentescoEncEducacao;
    }
}
