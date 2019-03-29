package br.com.zgsolucoes.pokerhand.domain.validator;

public interface Validator<E extends Object> {
	
	boolean check(E object);

}
