/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.mateus.gestor.repositories;

import br.g12.duque.mateus.dao.CategoryDao;
import br.g12.duque.mateus.models.Category;
import javax.swing.JOptionPane;

/**
 *
 * @author 08137
 */
public class FindByIdUseCase {
    public static void main(String[] args) {
        //1. Criar um objeto do tipo category
        Category category  = new Category();
        
        //2. Criar um objeto para armazenar a categoria encontrada (se houver)...
        Category categoryFound = null;
        
        //3. Executar o metodo findById do Dao
        String strCodigo = JOptionPane.showInputDialog(null, "Digite o código");
        int codigo = Integer.valueOf(strCodigo);
        category.setId(codigo);       
        CategoryDao dao = new CategoryDao(category);
        categoryFound = dao.findById();
        System.out.println(categoryFound);
    }
}
