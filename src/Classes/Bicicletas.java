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
public class Bicicletas {
    private int idBicicleta;
    private double tamanhoBicicleta; // tamanho bike aro 17 ou 19 
    private int modelo; //Isto é um tipo de bicicleta - exemplo: speed, comum, infantil, trilha
    private int corBicicleta; //1. azul, 2. roxo...
    private int marca;
    private int numerodeserieBicicleta;
   
     public int getIdBicicleta() {
        return idBicicleta;
    }

    public void setIdBicicleta(int idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public double getTamanhoBicicleta() {
        return tamanhoBicicleta;
    }

    public void setTamanhoBicicleta(double alturaBicicleta) {
        this.tamanhoBicicleta = alturaBicicleta;
    }

    public int getModeloBicicleta() {
        return modelo;
    }

    public void setModeloBicicleta(int modeloBicicleta) {
        this.modelo = modeloBicicleta;
    }

    public int getMarcabicicleta() {
        return marca;
    }

    public void setMarcablicicleta(int marcabicicleta) {
        this.marca = marcabicicleta;
    }

    public int getNumerodeserieBicicleta() {
        return numerodeserieBicicleta;
    }

    public void setNumerodeserieBicicleta(int numerodeserieBicicleta) {
        this.numerodeserieBicicleta = numerodeserieBicicleta;
    }

    public int getCorBicicleta() {
        return corBicicleta;
    }

    public void setCorBicicleta(int corBicicleta) {
        this.corBicicleta = corBicicleta;
    }
    
    
              
    
}





