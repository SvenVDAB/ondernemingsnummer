package be.vdab.ondernemingsnummer.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OndernemingsNummerValidator implements ConstraintValidator<OndernemingsNummer, Integer> {
    @Override
    public void initialize(OndernemingsNummer constraintValidation) {
    }
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        if (value < 0) {
            return false;
        }
        return ((value % 100) == 97 - (value / 100) % 97);
    }
}
