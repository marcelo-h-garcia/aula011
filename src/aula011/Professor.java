package aula011;
public class Professor extends Pessoa{
    
    protected String especialidade;
    protected float salario;
    
    public void receberAumento(float aum){
        this.salario+= aum;
        
}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{"  + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + " especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
    
}