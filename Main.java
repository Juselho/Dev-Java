public class Main {
    public static void main(String[] args) {

        String[] produtos = {"Notebook", "Mouse", "Teclado"};

        int[] estoque = {10, 25, 15};

        for (int i = 0; i < produtos.length; i++) {

            System.out.println(
                produtos[i] + ": " + estoque[i] + " unidades"
            );

        }
    }
} 