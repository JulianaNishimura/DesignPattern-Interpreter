public class Cliente {
        public static void main(String[] args) {
            // Criando expressões numéricas (nós terminais)
            Expressao cinco = new ExpressaoNumerica(5);
            Expressao tres = new ExpressaoNumerica(3);
            Expressao dois = new ExpressaoNumerica(2);

            // Criando a expressão "5 + 3"
            Expressao somar = new SomarExpressao(cinco, tres);

            // Criando a expressão "(5 + 3) - 2"
            Expressao resultado = new SubtrairExpressao(somar, dois);

            // Interpretando e imprimindo o resultado
            System.out.println("Resultado: " + resultado.interpret()); // Deve imprimir 6
    }
}
