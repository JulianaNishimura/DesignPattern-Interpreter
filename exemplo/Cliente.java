public class Cliente {
        public static void main(String[] args) {
            // Criando expressões numéricas (nós terminais)
            Expressao five = new ExpressaoNumerica(5);
            Expressao three = new ExpressaoNumerica(3);
            Expressao two = new ExpressaoNumerica(2);

            // Criando a expressão "5 + 3"
            Expressao sum = new SomarExpressao(five, three);

            // Criando a expressão "(5 + 3) - 2"
            Expressao result = new SubtrairExpressao(sum, two);

            // Interpretando e imprimindo o resultado
            System.out.println("Resultado: " + result.interpret()); // Deve imprimir 6
    }
}
