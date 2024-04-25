public class Main {
    String nome;
    int idade;
    String posicao;
    boolean jogando;


    public Main(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao= posicao;
        this.jogando = false;
    }


    public void jogar() {
        if (!jogando) {
            System.out.println(nome + " está jogando!");
            jogando = true;
        } else {
            System.out.println(nome + " permanece jogando.");
        }
    }

    public void pararDeJogar() {
        if (jogando) {
            System.out.println(nome + " parou de jogar.");
            jogando = false;
        } else {
            System.out.println(nome + " não estava jogando.");
        }
    }

    public void apresentar() {
        System.out.println("eu sou rialison," + nome + " minha posição é: " + posicao + " e tenho " + idade + ".");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getidade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setposicao(String posicao) {
        this.posicao = posicao;
    }


    public static void main(String[] args) {
        Main jogador = new Main("Rialison", 17, "ponteiro");
        jogador.apresentar();
        jogador.jogar();

    }
}