/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE1;

import PCTE2.Cargo;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author João Victor
 */
public class Funcionario {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int sexo;
    private String cpf;
    public Cargo cargo = new Cargo();

    public void entraDados(){
        nome = JOptionPane.showInputDialog("Digite seu Nome: ");
        sexo =Integer.parseInt(JOptionPane.showInputDialog("Qual é o seu Sexo ?" + "\n[1]Feminino" + "\n[2]Masculino"));
        cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
          
    }
    
    @Override
    public String toString(){
        return null;
    }
    
    public double Comissao(){
        return 0;
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public int getSexo() {
        return sexo;
    }

   
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    
    public String getCpf() {
        return cpf;
    }

  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    
    
}
