package samueldev.challenges.ifoodchallenge.menus.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samueldev.challenges.ifoodchallenge.core.domain.menus.Option;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionPostRequestBody;
import samueldev.challenges.ifoodchallenge.menus.service.OptionService;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/option")
@RequiredArgsConstructor
@Log4j2
public class OptionController {
    private final OptionService optionService;

    @PostMapping("/{optionMenuId}")
    public ResponseEntity<Option> save(@PathVariable(name = "optionMenuId") Long optionMenuId, @Valid @RequestBody OptionPostRequestBody optionPostRequestBody) {

        return new ResponseEntity<>(optionService.save(optionMenuId, optionPostRequestBody), HttpStatus.CREATED);
    }
}
