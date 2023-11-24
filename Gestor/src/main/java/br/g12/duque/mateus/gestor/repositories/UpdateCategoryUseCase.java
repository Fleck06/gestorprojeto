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
public class UpdateCategoryUseCase {
    public static void main(String[] args) {
        String strCodigo = JOptionPane.showInputDialog(null, "Digite o código");
        String nome = JOptionPane.showInputDialog(null, "Novo nome:");
        String descricao = JOptionPane.showInputDialog(null, "Novo descrição:");
        int codigo = Integer.valueOf(strCodigo);
        
        Category categoria = new Category(codigo, nome, descricao);
        CategoryDao dao = new CategoryDao(categoria);
        
        boolean sucesso = dao.update();
        
        if(sucesso){
            JOptionPane.showMessageDialog(null, "Registro atualizado");
        }else{
            JOptionPane.showMessageDialog(null, "Erro na atualização");
        }
        
    }
}
