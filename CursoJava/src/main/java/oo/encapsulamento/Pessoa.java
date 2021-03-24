package oo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;
    public Pessoa(String nome,String sobrenome,int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    //Getter(ler a idade)
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    //Setter(alterar a idade);
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <=120) {
            this.idade = novaIdade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() +" "+ getSobrenome();
    }

    @Override
    public String toString() {
        return "Olá eu sou o "+getNomeCompleto()
                + " e tenho " +getIdade() + " anos.";
    }
}
