package com.tdevilleduc.urthehero.core.convertor;

import com.tdevilleduc.urthehero.core.model.Story;
import com.tdevilleduc.urthehero.core.model.dto.StoryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoryConvertor {

    @Autowired
    ModelMapper modelMapper;

    public StoryDTO convertToDto(Story story) {
        return modelMapper.map(story, StoryDTO.class);
    }

    public Story convertToEntity(StoryDTO storyDto) {
        return modelMapper.map(storyDto, Story.class);
    }
}
