public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Pessoa pessoa1 = new Pessoa(12345, "Luis", "Santos", 1999, 03, 31);
        Pessoa pessoa2 = new Pessoa(67676, "Tiago", "Dias", 2067, 12, 19);
        Familia familia1 = new Familia(pessoa1, "Pai", pessoa2);
        
        System.out.println("\nNome completo da pessoa 1: " + pessoa1.getNomeCompleto());
        System.out.println("Idade da pessoa 1: " + pessoa1.getIdade());
        System.out.println("\nNome completo da pessoa 2: " + pessoa2.getNomeCompleto());
        System.out.println("Idade da pessoa 2: " + pessoa2.getIdade());
        System.out.println("\nInformacao do Encarregado de Educacao: \n" + familia1.getInfoEncEducacao());
        System.out.println("\nInformacao toda do Encarregado de Educacao: " + familia1.getInfoFamilia());
        System.out.println("\n\n\n");
        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(familia1.toString());
    }
}
