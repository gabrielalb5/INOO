package com.gabriel.ex2.view;

import com.gabriel.ex2.model.Assinatura;
import com.gabriel.ex2.model.AssinaturaAnual;
import com.gabriel.ex2.model.AssinaturaMensal;

public class Main {
    public static void main(String[] args) {

        Assinatura a1 = new AssinaturaMensal("Gabriel", "Netflix", "05/05/2024", false, true, 39.90);
        Assinatura a2 = new AssinaturaMensal("Gabriel", "Amazon", "05/05/2024", false, true, 14.90);
        Assinatura a3 = new AssinaturaAnual("Gabriel", "Investidor10", "02/02/2025", true, true, 249.90);
        Assinatura a4 = new AssinaturaAnual("Ana Ligia", "Spotify", "01/01/2024", true, true, 149.90);

        a1.detalhesAssinatura();
        a2.detalhesAssinatura();
        a3.detalhesAssinatura();
        a4.detalhesAssinatura();
        
        a1.cancelarAssinatura("06/02/2025");
        a2.cancelarAssinatura("06/02/2025");
        a3.cancelarAssinatura("06/02/2025");
        a4.cancelarAssinatura("06/02/2025");

        a1.detalhesAssinatura();
        a2.detalhesAssinatura();
        a3.detalhesAssinatura();
        a4.detalhesAssinatura();
    }
}
