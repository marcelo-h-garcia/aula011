package aula011;
public class Aula011 {
     public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Não posso instaciar uma objeto de classe abstrata
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
         System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        System.out.println(a1.toString());
        
        System.out.println("  ");
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("José");
        b1.setBolsa(12.5f);
        b1.setSexo("H");
        b1.setCurso("Ar Condicionado");
        b1.setIdade(20);
        b1.pagarMensalidade();
                        
        System.out.println(b1.toString());
        System.out.println(" ");
        
        Tecnico t1 = new Tecnico();
        t1.setMatricula(1113);
        t1.setNome("Maria");
        t1.setSexo("M");
        t1.setCurso("Telecomunicações");
        t1.setIdade(23);
        t1.setRegistroProfissional(7778);
        t1.praticar();
        
         System.out.println(t1.toString());
         System.out.println(" ");
         
         Professor p1 = new Professor();
         p1.setNome("Felipe");
         p1.setSexo("H");
         p1.setIdade(40);
         p1.setEspecialidade("Química");
         p1.setSalario(3500.00f);
         p1.receberAumento(300.00f);
         
         System.out.println(p1.toString());
    }
    
}
