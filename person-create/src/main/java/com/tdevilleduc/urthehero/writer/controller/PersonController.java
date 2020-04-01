package com.tdevilleduc.urthehero.writer.controller;

import com.tdevilleduc.urthehero.core.exceptions.PersonInternalErrorException;
import com.tdevilleduc.urthehero.core.model.dto.PersonDTO;
import com.tdevilleduc.urthehero.core.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Slf4j
@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    IPersonService personService;

    @PutMapping
    public @ResponseBody
    ResponseEntity<PersonDTO> createPerson(@RequestBody @NotNull PersonDTO personDto) {
        if (personDto.getId() != null && personService.exists(personDto.getId())) {
            throw new PersonInternalErrorException(MessageFormatter.format("Une personne avec l'identifiant {} existe déjà. Elle ne peut être créée", personDto.getId()).getMessage());
        }
        return ResponseEntity.ok(personService.createOrUpdate(personDto));
    }

}
