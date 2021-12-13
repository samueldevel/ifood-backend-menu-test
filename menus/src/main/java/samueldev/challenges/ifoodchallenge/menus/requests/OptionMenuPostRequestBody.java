package samueldev.challenges.ifoodchallenge.menus.requests;

import lombok.Data;
import samueldev.challenges.ifoodchallenge.core.domain.menus.Option;

import java.util.List;

@Data
public class OptionMenuPostRequestBody {

    private String name;

    private List<Option> options;
}
