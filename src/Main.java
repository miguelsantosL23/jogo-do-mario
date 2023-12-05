import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Strive", "Marrom", 25, 5.5, 5, "Neutro");
        Gato gato1 = new Gato("Locao", "preto",10, 2.5,"Neutro");
        Passaro passaro1 = new Passaro("Azulão", "Azul", 4, 1, "Neutro");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());


    }
}
