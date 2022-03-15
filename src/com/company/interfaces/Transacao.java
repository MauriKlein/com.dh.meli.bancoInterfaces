package com.company.interfaces;

public interface Transacao {

    public abstract void transacaoOk(String tipoTransacc);
    public abstract void transacaoNaoOk(String tipoTransacc);
}
