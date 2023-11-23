/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.g12.duque.mateus.gestor.repositories;

import br.g12.duque.mateus.models.Category;
import java.util.ArrayList;

/**
 *
 * @author 08137
 */
public interface IRespositoryCategory {
    public boolean insert(); // Métodos abstratos // Clean code
    public boolean update();
    public boolean delete();
    public ArrayList findAll();
    public Category findById(); // parametros ==> variaveis locais
    /*
    public boolean save(){
        Customer cust = new Customer();
    }
    */
    
}
