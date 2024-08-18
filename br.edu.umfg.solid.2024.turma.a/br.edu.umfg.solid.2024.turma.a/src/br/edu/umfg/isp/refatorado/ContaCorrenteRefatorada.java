package br.edu.umfg.isp.refatorado;

public class ContaCorreteRefatorada
        extends AbstractConta implements IContaRefatorada{
    public ContaCorreteRefatorada(String documento, String nome) {
        super(documento, nome);
    }
}
