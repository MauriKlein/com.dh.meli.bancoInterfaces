package com.company.classes;

import com.company.interfaces.ConsultarSaldo;
import com.company.interfaces.PagoServico;
import com.company.interfaces.Saque;

public class Basico implements ConsultarSaldo, PagoServico, Saque {
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando Saldo....");
    }

    @Override
    public void pagarServico(String tipoServ) {
        System.out.println("Pagando serviço: " + tipoServ);
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
