public class TesteRepeticao {
    public static void main(String[] args) throws Exception {
                
        for (int x = 1; x <= 2; x++) {
            System.out.println(x);
        }

        boolean condicao = false;

        while (condicao) {
            System.out.println("Verdadeiro");
        }

        do {

            System.out.println("Executou");

        } while (condicao);

    }
}
