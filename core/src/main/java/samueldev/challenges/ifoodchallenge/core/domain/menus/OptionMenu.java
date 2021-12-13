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
public class OptionMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The field name in OptionMenu cannot be empty")
    private String name;

    @NotNull(message = "The field mandatory in OptionMenu cannot be null")
    private boolean isMandatory;

    @OneToMany(cascade = CascadeType.ALL)
    @NotEmpty(message = "The field options in OptionMenu cannot be empty")
    private List<Option> options;

}
