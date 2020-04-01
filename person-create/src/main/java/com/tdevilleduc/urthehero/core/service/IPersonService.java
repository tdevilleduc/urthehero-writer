package com.tdevilleduc.urthehero.core.service;

import com.tdevilleduc.urthehero.core.model.dto.PersonDTO;

public interface IPersonService {

    boolean exists(Integer personId);
    PersonDTO createOrUpdate(PersonDTO personDto);
}
