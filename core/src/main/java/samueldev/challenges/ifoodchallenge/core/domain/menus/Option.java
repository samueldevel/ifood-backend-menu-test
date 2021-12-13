package samueldev.challenges.ifoodchallenge.core.domain.menus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import samueldev.challenges.ifoodchallenge.core.constraint.StatusConstraint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The field item in Option cannot be empty")
    private String item;

    @NotNull(message = "The field price in Option cannot be null")
    private Double price = 0.0;

    @StatusConstraint(values = {"available", "unavailable"}, message = "status must be available or unavailable")
    @NotEmpty(message = "The field status in Option cannot be empty")
    private String status;

}