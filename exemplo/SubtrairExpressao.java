class SubtrairExpressao implements Expressao {
    private Expressao esquerda, direita;

    public SubtrairExpressao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpret() {
        return esquerda.interpret() - direita.interpret();
    }
}
