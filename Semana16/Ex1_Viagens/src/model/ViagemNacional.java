package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ViagemNacional extends ViagemCorporativa {
    private String documento;

    public ViagemNacional(String destino, String ida, String volta, String documento){
        super(destino,ida,volta);
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public void remarcarViagem(LocalDate hoje, String novoDestino, String novaIda, String novaVolta){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate idaFormatada = LocalDate.parse(ida, formato);
        LocalDate limiteRemarcacao = idaFormatada.minusDays(2);

        if(hoje.isBefore(limiteRemarcacao)){
            System.out.println("Vamos remarcar sua viagem de "+getDestino()+" para "+novoDestino);
            setDestino(novoDestino);
            setIda(novaIda);
            setVolta(novaVolta);
            System.out.println("Taxa de remarcação de R$100");
        }else{
            System.out.println("Não é possível remarcar sua viagem de "+getDestino()+" para "+novoDestino);
        }
    }

    @Override
    public void detalhesViagem() {
        System.out.println("\n"+super.getDestino());
        System.out.println("Ida: "+super.getIda()+" | Volta: "+super.getVolta());
        System.out.println("Documento - "+getDocumento());
    }
}
