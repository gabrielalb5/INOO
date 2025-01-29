package model;

import java.time.LocalDate;

public interface IRemarcavel {
    void remarcarViagem(LocalDate hoje, String novoDestino, String novaIda, String novaVolta);
}
