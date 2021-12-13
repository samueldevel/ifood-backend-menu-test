package samueldev.challenges.ifoodchallenge.core.exceptions;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class ExceptionDetails {

    protected LocalDateTime timestamp;

    protected String error;

    protected int status;

    protected String details;

    protected String developerMessage;
}
