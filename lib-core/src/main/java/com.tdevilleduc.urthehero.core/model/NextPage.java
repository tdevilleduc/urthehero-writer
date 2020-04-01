package com.tdevilleduc.urthehero.core.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "next_page")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class NextPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;
    @NonNull
    private String text;
    @NonNull
    private Integer pageId;
    @NonNull
    private Integer destinationPageId;
    @NonNull
    private Position position;

}
