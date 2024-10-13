package pct_Encapsulamento;



public class Empresa {
     public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Nome do funcionário: "+funcionario.getNome()+
                "\nSalário do funcionário: "+funcionario.getSalario());
    }
    
}