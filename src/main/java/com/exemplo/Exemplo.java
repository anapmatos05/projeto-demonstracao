/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exemplo;

/**
 *
 * @author anapm
 */
/**public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Teste de Conexão: NetBeans + GitHub");
        System.out.println("O Push funcionou com sucesso!");
    }
*/

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("--- Sistema de Notas do Aluno ---");
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A média final é: " + media);
        
        if (media >= 10) {
            System.out.println("Resultado: Aprovado! Parabéns.");
        } else {
            System.out.println("Resultado: Reprovado. Precisa de estudar mais.");
        }
        
        System.out.println("---------------------------------");
    }
}