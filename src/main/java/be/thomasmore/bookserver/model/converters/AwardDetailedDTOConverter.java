package be.thomasmore.bookserver.model.converters;

import be.thomasmore.bookserver.model.Author;
import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.dto.AwardDetailedDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AwardDetailedDTOConverter {

    @Autowired
    private ModelMapper modelMapper;

    public AwardDetailedDTO convertToDto(Award award) {
        return modelMapper.map(award, AwardDetailedDTO.class);
    }

    public Award convertToEntity(AwardDetailedDTO awardDto, Award award) {
        modelMapper.map(awardDto, award);
        return award;
    }
}
