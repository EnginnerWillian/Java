import java.util.ArrayList;

public class JavaConceitos {
    byte b = 100;
    short s = 10000;
    int i = 10000;
    long l = 10000L;
    float f = 1000.5f;
    double d = 102.123232;
    char a = 'a';
    String str = "Willian";
    boolean bool = false;
    int[] colecaoLista = { 1, 1, 11, 1, 1, 1 };

    public void main(String[] args) {
        if (bool) {
            System.out.print("Verdadeiro");
        } else {
            System.out.print("False");
        }
        System.out.print(colecaoLista);
        ArrayList<String> nome = new ArrayList<>();

        nome.add("Willian");
        nome.add("Willian Florencio Calixto");
        nome.add("Willian Florencio Calixto");
        nome.add("Willian Florencio Calixto");

        System.out.println(nome.get(3));

        nome.remove(3);

        System.out.println(nome.get(3));

        for (i = 0; i < nome.size(); i++) {
            System.out.println(nome.get(i));

        }
        for (String nomes : nome) {
            System.out.println(nomes);
        }

    }

}
