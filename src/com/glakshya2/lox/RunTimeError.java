package com.glakshya2.lox;

class RunTimeError extends RuntimeException {
    final Token token;

    RunTimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
