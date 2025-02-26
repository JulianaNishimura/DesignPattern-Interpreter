class SubtrairExpressao implements Expressao {
    private Expressao left, right;

    public SubtrairExpressao(Expressao left, Expressao right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
