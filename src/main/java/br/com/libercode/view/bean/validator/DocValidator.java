package br.com.libercode.view.bean.validator;

abstract class DocValidator {

    abstract void throwError();

    int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length()-1, digito; indice >= 0; indice-- ) {
            digito = Integer.parseInt(str.substring(indice,indice+1));
            soma += digito*peso[peso.length - str.length()+indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

}
