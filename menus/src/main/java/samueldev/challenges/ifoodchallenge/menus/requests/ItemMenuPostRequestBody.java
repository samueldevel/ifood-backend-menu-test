package samueldev.challenges.ifoodchallenge.menus.requests;

import lombok.Data;
import samueldev.challenges.ifoodchallenge.core.domain.menus.Item;

import java.util.List;

@Data
public class ItemMenuPostRequestBody {

    private String name;

    private List<Item> items;
}