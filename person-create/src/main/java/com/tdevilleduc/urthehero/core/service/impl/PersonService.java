package com.tdevilleduc.urthehero.core.service.impl;

import com.tdevilleduc.urthehero.core.convertor.PersonConvertor;
import com.tdevilleduc.urthehero.core.dao.PersonDao;
import com.tdevilleduc.urthehero.core.model.Person;
import com.tdevilleduc.urthehero.core.model.dto.PersonDTO;
import com.tdevilleduc.urthehero.core.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.tdevilleduc.urthehero.core.constant.ApplicationConstants.ERROR_MESSAGE_PERSON_DOESNOT_EXIST;

@Slf4j
@Service
public class PersonService implements IPersonService {

    private PersonDao personDao;
    private PersonConvertor personConvertor;

    public boolean exists(final Integer personId) {
        Optional<Person> person = personDao.findById(personId);
        if (person.isEmpty()) {
            log.error(ERROR_MESSAGE_PERSON_DOESNOT_EXIST, personId);
            return false;
        }
        return true;
    }

    public PersonDTO createOrUpdate(PersonDTO personDto) {
        Person person = personConvertor.convertToEntity(personDto);
        return personConvertor.convertToDto(personDao.save(person));
    }

}
