package Animais;

public class Gato extends Animal{
//    Atributos

    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }


//   Construtores




//    Métodos

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU MAIU");
    }
}
