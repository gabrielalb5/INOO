package view;

import java.time.LocalDate;

import model.ViagemCorporativa;
import model.ViagemInternacional;
import model.ViagemNacional;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.parse("2025-01-29");

        ViagemCorporativa v1 = new ViagemNacional("São Paulo", "30/01/2025", "02/02/2025", "111111");
        ViagemCorporativa v2 = new ViagemNacional("Rio de Janeiro", "02/02/2025", "05/02/2025", "222222");

        System.out.println("\nVIAGENS NACIONAIS MARCADAS");
        v1.detalhesViagem();
        v1.remarcarViagem(hoje, "Natal", "05/05/2025", "10/05/2025");
        v2.detalhesViagem();
        v2.remarcarViagem(hoje, "Natal", "05/05/2025", "10/05/2025");

        System.out.println("\n>>> Pós tentativa de remarcação <<<");
        v1.detalhesViagem();
        v2.detalhesViagem();

        System.out.println("------------------------------");

        ViagemCorporativa v3 = new ViagemInternacional("Texas", "06/02/2025", "08/02/2025", "BR123");
        ViagemCorporativa v4 = new ViagemInternacional("Frankfurt", "05/02/2025", "08/02/2025", "BR456");

        System.out.println("\nVIAGENS INTENACIONAIS MARCADAS");
        v3.detalhesViagem();
        v3.remarcarViagem(hoje, null, "05/05/2025", "10/05/2025");
        v4.detalhesViagem();
        v4.remarcarViagem(hoje, null, "05/05/2025", "10/05/2025");

        System.out.println("\n>>> Pós tentativa de remarcação <<<");
        v3.detalhesViagem();
        v4.detalhesViagem();
    }
}
