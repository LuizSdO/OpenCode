package br.com.fiap.opencode.model;

public class LoginUsuario {
    private String email;
    private String senha;
    public LoginUsuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "LoginUsuario [email=" + email + ", senha=" + senha + "]";
    }
    
}
