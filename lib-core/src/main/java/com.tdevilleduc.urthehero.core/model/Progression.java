package com.tdevilleduc.urthehero.core.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "progression")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Progression {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer id;
    @NonNull
    private Integer storyId;
    @NonNull
    private Integer personId;
    @NonNull
    private Integer actualPageId;

}
