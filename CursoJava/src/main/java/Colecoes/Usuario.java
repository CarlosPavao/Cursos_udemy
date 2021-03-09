package Colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome é "+this.nome+".";
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
 
}