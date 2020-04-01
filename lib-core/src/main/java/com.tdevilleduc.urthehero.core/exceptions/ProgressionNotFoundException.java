package com.tdevilleduc.urthehero.core.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProgressionNotFoundException extends RuntimeException {
    public ProgressionNotFoundException(String s) {
        super(s);
    }
}
