package samueldev.challenges.ifoodchallenge.menus.requests;

import lombok.Data;

@Data
public class OptionPostRequestBody {

    private String item;

    private Double price;

    private String status;

}
