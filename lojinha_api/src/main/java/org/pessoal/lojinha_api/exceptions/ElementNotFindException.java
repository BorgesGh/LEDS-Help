package org.pessoal.lojinha_api.exceptions;

public class ElementNotFindException extends Exception{

    public ElementNotFindException(String message) {
        super(message + " não foi encontrado...");
    }
}
