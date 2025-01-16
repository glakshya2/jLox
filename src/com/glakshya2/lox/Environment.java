package com.glakshya2.lox;

import java.util.HashMap;
import java.util.Map;

class Environment {
    final Environment enclosing;
    private final Map<String, Object> values = new HashMap<>();

    Environment() {
        this.enclosing = null;
    }

    Environment(Environment enclosing) {
        this.enclosing = enclosing;
    }

    void define(String name, Object value) {
        values.put(name, value);
    }

    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            Object value = values.get(name.lexeme);
            if (value == null) throw new RunTimeError(name, "Variable can not be accessed before initialization.");
            return value;
        }
        if (enclosing != null) return enclosing.get(name);
        throw new RunTimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }

    void assign(Token name, Object value) {
        if (values.containsKey(name.lexeme)) {
            values.put(name.lexeme, value);
            return;
        }

        if (enclosing != null) {
            enclosing.assign(name, value);
            return;
        }
        throw new RunTimeError(name, "Undefined variable '" + name.lexeme + ";.");
    }
}
