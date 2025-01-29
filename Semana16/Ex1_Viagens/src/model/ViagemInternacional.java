package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ViagemInternacional extends ViagemCorporativa {
    private String passaporte;

    public ViagemInternacional(String destino, String ida, String volta, String passporte){
        super(destino,ida,volta);
        this.passaporte = passporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    @Override
    public void remarcarViagem(LocalDate hoje, String novoDestino, String novaIda, String novaVolta){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate idaFormatada = LocalDate.parse(ida, formato);
        LocalDate limiteRemarcacao = idaFormatada.minusDays(7);

        if(hoje.isBefore(limiteRemarcacao)){
            System.out.println("Vamos remarcar sua a data da sua viagem para "+getDestino());
            setIda(novaIda);
            setVolta(novaVolta);
            System.out.println("Taxa de remarcação de R$500");
        }else{
            System.out.println("Não é possível remarcar a data da sua viagem");
        }
    }

    @Override
    public void detalhesViagem() {
        System.out.println("\n"+super.getDestino());
        System.out.println("Ida: "+super.getIda()+" | Volta: "+super.getVolta());
        System.out.println("Passaporte - "+getPassaporte());
    }
}
