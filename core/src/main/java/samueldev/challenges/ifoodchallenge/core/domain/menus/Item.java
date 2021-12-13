package samueldev.challenges.ifoodchallenge.core.domain.menus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The field name in Item cannot be empty ")
    private String name;

    @NotNull(message = "The field price in Item cannot be null ")
    private Double price = 0.00;

    @OneToMany(cascade = CascadeType.ALL)
    @NotEmpty(message = "The field optionsMenu in Item cannot be empty ")
    private List<OptionMenu> optionsMenu;

}
