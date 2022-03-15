package com.company.classes;

import com.company.interfaces.Deposito;
import com.company.interfaces.Transferencia;

public class Executivo implements Deposito, Transferencia {
    @Override
    public void fazerDeposito(Double valor) {
        System.out.println("Fazendo Depósito de R$ "+valor);
    }

    @Override
    public void transacaoOk(String tipoTransacc) {
        System.out.println( tipoTransacc +  " realizado corretamente");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacc) {
        System.out.println("A transação " + tipoTransacc +  " não pode ser concluída");
    }

    @Override
    public void fazerTransferencia(Double valor) {
        System.out.println("Fazendo Transferencia de R$ "+valor);
    }
}
