package pct_Encapsulamento;

public class Funcionario {

       private static String nome_funcionario;
    private static double salario_funcionario;

    public static String getNome() {
        return nome_funcionario;
    }

    public static void setNome(String nome) {
        nome_funcionario = nome;
    }

    public static double getSalario() {
        return salario_funcionario;
    }

    public static void setSalario(double salario) { 
        salario_funcionario = salario;
       
    }
    
    public static boolean cadastrar(String nome, double salario){
        if(nome.length() < 3 || salario < 0){
            return false;
        }
        
        setSalario(salario);
        setNome(nome);
        
        return true;
    }

}