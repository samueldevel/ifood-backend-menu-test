package samueldev.challenges.ifoodchallenge.core.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@SuperBuilder
public class ConstraintViolationExceptionDetails extends ExceptionDetails {
    private int invalidFieldsNumber;
}
