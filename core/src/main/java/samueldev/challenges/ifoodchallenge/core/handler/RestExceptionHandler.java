package samueldev.challenges.ifoodchallenge.core.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import samueldev.challenges.ifoodchallenge.core.exceptions.BadRequestException;
import samueldev.challenges.ifoodchallenge.core.exceptions.BadRequestExceptionDetails;
import samueldev.challenges.ifoodchallenge.core.exceptions.ConstraintViolationExceptionDetails;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class RestExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre) {
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .error("Bad Request Exception")
                        .details(bre.getMessage())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .developerMessage(bre.getClass().getName()).build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ConstraintViolationExceptionDetails> handlerConstraintViolationException(ConstraintViolationException cve) {
        String fieldsMessage = cve.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(", "));

        return new ResponseEntity<>(
                ConstraintViolationExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .error("Constraint Violation Exception, invalid fields found")
                        .status(HttpStatus.BAD_REQUEST.value())
                        .details(fieldsMessage)
                        .developerMessage(cve.getMessage())
                        .invalidFieldsNumber(cve.getConstraintViolations().size()).build(), HttpStatus.BAD_REQUEST);
    }
}
