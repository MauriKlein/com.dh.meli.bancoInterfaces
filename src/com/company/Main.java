package com.company;

import com.company.classes.Basico;
import com.company.classes.Cobrador;
import com.company.classes.Executivo;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------Executivo--------------");
        Executivo executivo = new Executivo();

        executivo.fazerDeposito(1000.0);
        //Simulando uma transação Ok
        executivo.transacaoOk("Depósito");

        executivo.fazerTransferencia(500.0);
        //Simulando uma transação não Ok
        executivo.transacaoNaoOk("Transferência");

        System.out.println("\n\n-------------Cobrador--------------");
        Cobrador cobrador = new Cobrador();

        cobrador.saque(2000.0);
        //Simulando uma transação Ok
        executivo.transacaoOk("Saque");

        cobrador.consultarSaldo();
        //Simulando uma transação não Ok
        executivo.transacaoNaoOk("Consultar Saldo");



        System.out.println("\n\n-------------Básico--------------");
        Basico basico = new Basico();

        basico.consultarSaldo();
        //Simulando uma transação Ok
        basico.transacaoOk("Consultar Saldo");

        basico.saque(8000.0);
        //Simulando uma transação não Ok
        basico.transacaoNaoOk("Saque");

        basico.pagarServico("Conta de Luz");
        //Simulando uma transação não Ok
        basico.transacaoNaoOk("Pagar Servço ");


    }
}
