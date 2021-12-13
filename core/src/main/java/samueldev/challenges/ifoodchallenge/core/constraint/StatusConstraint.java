package samueldev.challenges.ifoodchallenge.core.constraint;

import samueldev.challenges.ifoodchallenge.core.validator.StatusValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Documented
@Constraint(validatedBy = StatusValidator.class)
@Target({FIELD, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StatusConstraint {

    String[] values();

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
