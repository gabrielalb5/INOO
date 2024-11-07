package com.gabriel.ex4.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private Bicicleta bicicletaReservada = null;
    private double saldoCreditos = 0;

    public Usuario(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldoCreditos() {
        return saldoCreditos;
    }

    public void creditar(int credito){
        if(credito>0){
            this.saldoCreditos = credito;
            System.out.println(getNome()+" foi creditado com "+credito+" pontos");
        }else{
            System.out.println("Valor de crédito inválido");
        }
    }

    public void reservarBicicleta(Bicicleta bicicleta){
        if(this.bicicletaReservada == null){
            if(bicicleta.isDisponivel()){
                if(this.saldoCreditos >= bicicleta.getPrecoAluguel()){
                    this.bicicletaReservada = bicicleta;
                    bicicleta.setDisponivel(false);
                    bicicleta.setUltimaReserva(getCpf());
                    this.saldoCreditos = this.saldoCreditos-bicicleta.getPrecoAluguel();
                    System.out.println(getNome()+" emprestou a bicicleta \""+bicicleta.getCor()+"\" com sucesso!");
                }else{
                    System.out.println("ERRO: "+getNome()+", você não tem créditos suficientes para emprestar a bicicleta \""+bicicleta.getCor()+"\"");
                    System.out.println("Seus pontos: "+getSaldoCreditos()+" | Bicicleta: "+bicicleta.getPrecoAluguel());
                }
            }else{
                System.out.println("ERRO: A bicicleta \""+bicicleta.getCor()+"\" não está disponível");
            }
        }else{
            System.out.println("ERRO: "+getNome()+", devolva uma bicicleta antes de emprestar outra");
        }
    }

    public void devolverBicicleta(){
        if(bicicletaReservada == null){
            System.out.println(getNome()+", você não tem nenhuma bicicleta emprestada");
        }else{
            System.out.println(getNome()+" devolveu a bicicleta \""+bicicletaReservada.getCor()+"\"");
            bicicletaReservada.setDisponivel(true);
            bicicletaReservada = null;
        }
    }

    public void relatorioUsuario(){
        if(bicicletaReservada == null)
            System.out.println(getNome()+" ("+getCpf()+") - Tem "+getSaldoCreditos()+" pontos e está sem bicicleta");
        else
            System.out.println(getNome()+" ("+getCpf()+") - Tem "+getSaldoCreditos()+" pontos e está com a bicicleta \""+bicicletaReservada.getCor()+"\"");
        
    }
}
