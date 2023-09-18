public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Ronaldo";
        String segundoNome = "de Oliveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(primeiroNome);
        System.out.println(segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
