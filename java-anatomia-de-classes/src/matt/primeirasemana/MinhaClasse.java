package matt.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Mateus";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método é: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
