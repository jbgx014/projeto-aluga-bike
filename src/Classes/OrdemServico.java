/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author guigo
 */
public class OrdemServico {
    private int idOrdemServico;
    private Date dataAluguel;
    private double valor;
    private int dataEntrega;
    private int idBicicleta;
    private int id_func;
    private boolean finalizado;

    public int getIdOrdemServico() {
        return idOrdemServico;
    }

    public void setIdOrdemServico(int idOrdemServico) {
        this.idOrdemServico = idOrdemServico;
    }

    
    
}
