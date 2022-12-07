package be.thomasmore.bookserver.services;

import be.thomasmore.bookserver.model.Award;
import be.thomasmore.bookserver.model.Book;
import be.thomasmore.bookserver.model.converters.AwardDTOConverter;
import be.thomasmore.bookserver.model.converters.BookDTOConverter;
import be.thomasmore.bookserver.model.dto.AwardDTO;
import be.thomasmore.bookserver.model.dto.BookDTO;
import be.thomasmore.bookserver.repositories.AwardRepository;
import be.thomasmore.bookserver.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AwardService {

    @Autowired
    private AwardRepository awardRepository;

    @Autowired
    private AwardDTOConverter awardDTOConverter;

    public List<AwardDTO> findAll(String titleKeyWord, String infoKeyWord) {
        final List<Award> award = titleKeyWord != null ?
                awardRepository.findByTitleContainingIgnoreCase(titleKeyWord):
                infoKeyWord != null ?
                        awardRepository.findByInfoContainingIgnoreCase(infoKeyWord)
                        : awardRepository.findAll();


        return award.stream()
                .map(a -> awardDTOConverter.convertToDto(a))
                .collect(Collectors.toList());
    }
}
