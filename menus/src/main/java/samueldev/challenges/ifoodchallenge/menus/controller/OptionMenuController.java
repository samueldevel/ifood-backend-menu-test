package samueldev.challenges.ifoodchallenge.menus.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samueldev.challenges.ifoodchallenge.core.domain.menus.OptionMenu;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionMenuPostRequestBody;
import samueldev.challenges.ifoodchallenge.menus.service.OptionMenuService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/optionMenu/v1")
public class OptionMenuController {
    private final OptionMenuService optionMenuService;

    @GetMapping
    public ResponseEntity<List<OptionMenu>> findAll() {

        return new ResponseEntity<>(optionMenuService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OptionMenu> save(@RequestBody OptionMenuPostRequestBody optionMenuPostRequestBody) {

        return new ResponseEntity<>(optionMenuService.save(optionMenuPostRequestBody), HttpStatus.CREATED);
    }
}
