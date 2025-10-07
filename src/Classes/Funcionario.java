/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author guigo
 */
public class Funcionario extends Pessoa {
    private int idFuncionario;
    private String senha;
    
    //método construtor 1 - preciso salvar nele o id do Funcionário e a senha
    //com isso utilizamos o polimorfismo de sobrecarga, pois temos dois métodos com o mesmo nome, mas com assinaturas diferentes
    public Funcionario(int idFuncionario, String senha) {
        this.idFuncionario = idFuncionario;
        this.senha = senha;
    };
    
    //método construtor 2 - posso salvar apenas o idFuncionario
    public Funcionario (int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

