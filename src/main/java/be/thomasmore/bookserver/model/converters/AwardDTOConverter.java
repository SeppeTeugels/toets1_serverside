package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.Book;
import be.thomasmore.bookserver.model.dto.AwardDTO;
import be.thomasmore.bookserver.model.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AwardDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    public AwardDTO convertToDto(Award award) {
        return modelMapper.map(award, AwardDTO.class);
    }
}
