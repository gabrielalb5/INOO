package view;

import model.Tv;

public class ControleRemoto {
    public static void main(String[] args) {
        Tv televisao = new Tv();

        Tv.getStatus(televisao);

        televisao.ligar(true);
        Tv.getStatus(televisao);

        televisao.ligar(true, "Cartoon Network");
        Tv.getStatus(televisao);

        televisao.ligar(true, "Nickelodeon", 20);
        Tv.getStatus(televisao);

        televisao.ligar(false);
        Tv.getStatus(televisao);
    }
}
