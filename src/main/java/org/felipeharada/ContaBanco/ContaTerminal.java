/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.felipeharada.ContaBanco;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite a agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo é de " + saldo + " já está disponível para saque.");
    }
}
