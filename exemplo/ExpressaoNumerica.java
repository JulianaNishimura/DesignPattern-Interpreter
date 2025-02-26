public class ExpressaoNumerica implements Expressao {
    //expressão terminal
    private int numero;

    public ExpressaoNumerica(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpret() {
        return numero;
    }
    //expressao terminal

}
