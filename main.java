public class main {

    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public void multiPorSomaSucessiva(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        main m = new main();
        m.multiPorSomaSucessiva(3, 4);





    }
}


