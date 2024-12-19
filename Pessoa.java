package POO;

public class Pessoa {

    // Atributos = características
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor padrão que inicializa os atributos com valores padrão.
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    // Função construtora com atributos
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos = Ações da classe
    // setters e getters -> ("set" para colocar o valor e "get" pra pegar)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    // Método que calcula o Índice de Massa Corporal (IMC) com base no peso e
    // altura.
    public double calcularImc() {
        return peso / (altura * altura);
    }

    // Método que classifica o IMC e imprime a classificação correspondente. Retorna
    // o valor do IMC.
    public double classificacaoDeImc() {
        double imc = calcularImc();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III (Obesidade Mórbida)");
        }

        return imc;

    }

    // Método que retorna uma string formatada com os atributos da pessoa.
    public String formatarSaida() {
        return "Olá, me chamo " + nome + ", tenho " + idade + " de idade" + ", minha altura é " + altura
                + ", meu peso é " + peso + ". ";
    }

}
