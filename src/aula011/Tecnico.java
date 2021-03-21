
package aula011;
public class Tecnico extends Aluno{
    private int registroProfissional;
    public void praticar(){
        System.out.println("O técnico está praticando");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", curso=" + curso + " registroProfissional=" + registroProfissional + '}';
    }

   
    
    

    
    
    
    
    
}
