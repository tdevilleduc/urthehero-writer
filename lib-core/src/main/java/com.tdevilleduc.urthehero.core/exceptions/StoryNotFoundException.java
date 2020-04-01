package com.tdevilleduc.urthehero.core.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StoryNotFoundException extends RuntimeException {
    public StoryNotFoundException(String s) {
        super(s);
    }
}
