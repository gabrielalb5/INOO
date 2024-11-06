package model;

public class Tv {
    private boolean ligada = false;
    private String canal = "Sem sinal";
    private int volume = 0;

    public String getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }
    public boolean getLigada() {
        return ligada;
    }

    public void ligar(boolean ligada){
        this.ligada = ligada;
        if(ligada)
            System.out.println("A tv foi ligada");
        else
            System.out.println("A tv foi desligada");
    }

    public void ligar(boolean ligada, String canal){
        this.ligada = ligada;
        this.canal = canal;
        if(ligada)
            System.out.println("A tv foi ligada e sintonizada no canal "+canal);
        else
            System.out.println("A tv foi desligada");
    }

    public void ligar(boolean ligada, String canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
        if(ligada)
            System.out.println("A tv foi ligada e sintonizada no canal "+canal+" - volume: "+volume);
        else
            System.out.println("A tv foi desligada");
    }

    public static void getStatus(Tv televisao) {
        System.out.println("STATUS DA TV");
        if(televisao.getLigada())
            System.out.println("Ligada");
        else
           System.out.println("Desligada"); 
        System.out.println(televisao.getCanal()); 
        System.out.println("Volume: "+televisao.getVolume()+"\n"); 
    }
}
