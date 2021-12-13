package samueldev.challenges.ifoodchallenge.core.domain.menus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ItemMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The field name in ItemMenu cannot be empty")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @NotEmpty(message = "The field items in ItemMenu cannot be empty list")
    private List<Item> items;

}
