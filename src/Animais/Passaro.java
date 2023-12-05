package Animais;

public class Passaro extends  Animal{
//    Atributos

    static int numeroDePassaros;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }


//    Contrutores




//    Métodos

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Trufi Trufi Trufiu");
    }
}
