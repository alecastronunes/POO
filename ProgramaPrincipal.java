package POO;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Criar uma pessoa = Instanciar
        Pessoa pessoa_01 = new Pessoa();

        pessoa_01.setNome("Alexandre de Castro Nunes");
        pessoa_01.setIdade(32);
        pessoa_01.setPeso(94.6);
        pessoa_01.setAltura(1.93);

        System.out.println("Nome: " + pessoa_01.getNome());
        System.out.println("Idade: " + pessoa_01.getIdade());
        System.out.println("Peso: " + pessoa_01.getPeso());
        System.out.println("Altura: " + pessoa_01.getAltura());

        Pessoa pessoa_02 = new Pessoa("Fernanda", 32, 1.83, 94.6);
        System.out.println(pessoa_02.getNome());
        System.out.println(pessoa_02.calcularImc());
        System.out.println(pessoa_02.classificacaoDeImc());

        System.out.println(pessoa_01.formatarSaida());
        System.out.println(pessoa_02.formatarSaida());
    }
}
