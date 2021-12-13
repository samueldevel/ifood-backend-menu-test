package samueldev.challenges.ifoodchallenge.core.validator;


import samueldev.challenges.ifoodchallenge.core.constraint.StatusConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class StatusValidator implements ConstraintValidator<StatusConstraint, String> {

    private String[] values;

    @Override
    public void initialize(StatusConstraint constraintAnnotation) {
        this.values = constraintAnnotation.values();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return Arrays.asList(values).contains(s);
    }
}