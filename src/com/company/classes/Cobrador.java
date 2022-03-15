package com.company.classes;

import com.company.interfaces.ConsultarSaldo;
import com.company.interfaces.Saque;

public class Cobrador implements Saque, ConsultarSaldo {


    @Override
    public void consultarSaldo() {
        System.out.println("Consultando Saldo....");
    }

    @Override
    public void saque(Double valor) {
        System.out.println("Saque de R$: " + valor);

    }

    @Override
    public void transacaoOk(String tipoTransacc) {
        System.out.println( tipoTransacc +  " realizada corretamente");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacc) {
        System.out.println("A transação " + tipoTransacc +  " não pode ser concluída");
    }


}
