package com.tdevilleduc.urthehero.core.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PageNotFoundException extends RuntimeException {
    public PageNotFoundException(String s) {
        super(s);
    }
}
