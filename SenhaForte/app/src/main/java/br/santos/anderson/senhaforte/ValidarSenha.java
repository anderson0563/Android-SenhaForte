package br.santos.anderson.senhaforte;

public class ValidarSenha {
    public boolean confirmacaoSenha(String senha, String confirmacaoSenha){
        return senha.equals(confirmacaoSenha);
    }
    private boolean caractereAdequado(String senha, int menorLetra, int maiorLetra){
        //tabela ascii
        // a=97 - z=122
        // A=65 - Z=90
        // 0=48 - 9=57
        boolean resultado = true;
        for(int i=0; i<senha.length(); i++){
            resultado = resultado && (senha.charAt(i)>=menorLetra && senha.charAt(i)<=maiorLetra);
        }
        return resultado;
    }

    public boolean conferir(String senha){
        return caractereAdequado(senha, 97, 122) &&
               caractereAdequado(senha, 65, 90) &&
               caractereAdequado(senha, 48, 57);
    }
}
