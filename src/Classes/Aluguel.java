/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author guigo
 */
public class Aluguel {
    private int idAluguel;
    private String nomeAluguel; //Pacote de 1h, Pacote de 2h, Pacote de 5h, Pacote de 10h, Pacote de 24h, Pacote de 1 semana
    private double precoAluguel;

    public int getIdBicicleta() {
        return idAluguel;
    }

    public void setIdBicicleta(int idBicicleta) {
        this.idAluguel = idBicicleta;
    }

    public String getNomeServico() {
        return nomeAluguel;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeAluguel = nomeServico;
    }

    public double getPrecoServico() {
        return precoAluguel;
    }

    public void setPrecoServico(double precoServico) {
        this.precoAluguel = precoServico;
    }
    
    
}
