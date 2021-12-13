package samueldev.challenges.ifoodchallenge.menus.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samueldev.challenges.ifoodchallenge.core.domain.menus.ItemMenu;
import samueldev.challenges.ifoodchallenge.menus.requests.ItemMenuPostRequestBody;
import samueldev.challenges.ifoodchallenge.menus.service.ItemMenuService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/itemMenu/v1")
public class ItemMenuController {
    private final ItemMenuService itemMenuService;

    @GetMapping
    public ResponseEntity<List<ItemMenu>> findAll() {

        return new ResponseEntity<>(itemMenuService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ItemMenu> save(@RequestBody ItemMenuPostRequestBody itemMenuPostRequestBody) {

        return new ResponseEntity<>(itemMenuService.save(itemMenuPostRequestBody), HttpStatus.CREATED);
    }

}
