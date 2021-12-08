package sample.model;

public class Produto {

    public String nome;
    public double preco;
    public int tamanho;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", R$" + preco +
                ", tamanho=" + tamanho +
                '}';
    }
}
