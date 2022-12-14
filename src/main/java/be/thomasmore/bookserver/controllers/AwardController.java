package be.thomasmore.bookserver.controllers;

import be.thomasmore.bookserver.model.dto.*;
import be.thomasmore.bookserver.services.AwardService;
import be.thomasmore.bookserver.services.BookService;
import io.swagger.v3.oas.annotations.Operation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/awards")
public class AwardController {


    @Autowired
    private AwardService awardService;

    @Operation(summary = "list of awards in the database.",
            description = "get all awards")
    @GetMapping("")
    public Iterable<AwardDTO> findAll(@RequestParam(required = false) String TitleKeyWord,@RequestParam(required = false) String InfoKeyWord) {
        log.info("##### findAll awards - titleKeyWord=" + TitleKeyWord + "InfoKeyWord=" + InfoKeyWord);
        return awardService.findAll(TitleKeyWord,InfoKeyWord);
    }

    @Operation(summary = "get all details from 1 award from the database.",
            description = " get <b> 1 </b> author ")
    @GetMapping("{id}")
    public AwardDetailedDTO findOne(@PathVariable int id) {
        return awardService.findOne(id);
    }

}

