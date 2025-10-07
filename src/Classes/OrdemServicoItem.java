/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author guigo
 */
public class OrdemServicoItem {
    private int idItemServico;
    private OrdemServico ordemdeservico;
    private Aluguel servico;
    private Bicicletas bicicleta;
    private double precoUnitario;

    public int getIdItemServico() {
        return idItemServico;
    }

    public void setIdItemServico(int idItemServico) {
        this.idItemServico = idItemServico;
    }

    public OrdemServico getOrdemdeservico() {
        return ordemdeservico;
    }

    public void setOrdemdeservico(OrdemServico ordemdeservico) {
        this.ordemdeservico = ordemdeservico;
    }

    public Aluguel getServico() {
        return servico;
    }

    public void setServico(Aluguel servico) {
        this.servico = servico;
    }

    public Bicicletas getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicletas bicicleta) {
        this.bicicleta = bicicleta;
    }

    public double getPrecounitario() {
        return precoUnitario;
    }

    public void setPrecounitario(double precounitario) {
        this.precoUnitario = precounitario;
    }
    
    
    
    
}
