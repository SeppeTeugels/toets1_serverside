package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.AuthorDTO;
import be.thomasmore.bookserver.model.dto.AwardDTO;
import be.thomasmore.bookserver.model.dto.BookDTO;
import be.thomasmore.bookserver.model.dto.BookDetailedDTO;
import be.thomasmore.bookserver.services.AwardService;
import be.thomasmore.bookserver.services.BookService;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/awards")
public class AwardController {


    @Autowired
    private AwardService awardService;

    @Operation(summary = "list of awards in the database.",
            description = "get all awards")
    @GetMapping("")
    public Iterable<AwardDTO> findAll(@RequestParam(required = false) String TitleKeyWord,@RequestParam(required = false) String InfoKeyWord) {
        return awardService.findAll(TitleKeyWord,InfoKeyWord);
    }

}

