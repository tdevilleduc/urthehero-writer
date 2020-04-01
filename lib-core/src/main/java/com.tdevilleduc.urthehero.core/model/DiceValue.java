package com.tdevilleduc.urthehero.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DiceValue {

    @NonNull
    private Integer value;
    @NonNull
    private Dice dice;

}
