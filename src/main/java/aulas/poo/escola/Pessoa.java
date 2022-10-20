package aulas.poo.escola;

public class Pessoa {
    private String nome;
    private String email;
    private String cpf;

    //construtor
    public Pessoa(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    //métodos
    public void seApresentar(){
        System.out.println("Olá, me chamo " + this.nome);
    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
