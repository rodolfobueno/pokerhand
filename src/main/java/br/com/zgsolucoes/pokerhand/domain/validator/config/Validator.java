package br.com.zgsolucoes.pokerhand.domain.validator.config;

public interface Validator<E extends Object> {

  boolean check(E object);

}
