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
        String mensagem = this.encarregadoEducacao + " " + this.parentescoEncEducacao;
        return mensagem;
    }

    public String getInfoFamilia(){
        String mensagem = "\nEncarregado de Educacao: " + this.encarregadoEducacao +
                          "\nParentesco do Encarregado de Educacao: " + this.parentescoEncEducacao +
                          "\nAluno: " + this.aluno;
        return mensagem;
    }
}
