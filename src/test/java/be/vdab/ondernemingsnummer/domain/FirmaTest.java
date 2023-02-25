package be.vdab.ondernemingsnummer.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FirmaTest {
    private Validator validator;
    private Firma firma;
    @BeforeEach
    void beforeEach() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        firma = new Firma();
        firma.setOndernemingsNummer(426388541);

    }

    @Test
    void correcteFirma() {
        assertThat(validator.validate(firma)).isEqualTo(Collections.emptySet());
    }

    @Test
    void fouteFirma() {
        var firma2 = new Firma();
        firma2.setOndernemingsNummer(426388542);
        assertThat(validator.validate(firma2)).isNotEqualTo(Collections.emptySet());
    }
}
