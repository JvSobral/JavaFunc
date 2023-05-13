/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE2;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author João Victor
 */
public class Cargo {
    Scanner sc = new Scanner (System.in);
    private int codigo;
    private String descricao;
    private float remuneracao;

   
    public void entraDados(){
        codigo =Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo do cargo: "));
        descricao = ("Digite a descrição do cargo: ");
        System.out.println("Digite sua remuneração");
        remuneracao = sc.nextFloat();
       
    }
    
    
    public void concedeBonus(int percentual){
        System.out.println("Qual o percentual de bounus ?");
       percentual = sc.nextInt();
        System.out.println("O novo salario é de: "+(percentual*remuneracao)/100);
    }
    
    public int getCodigo() {
        return codigo;
    }

   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public float getRemuneracao() {
        return remuneracao;
    }

   
    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }
    
    
    
}
