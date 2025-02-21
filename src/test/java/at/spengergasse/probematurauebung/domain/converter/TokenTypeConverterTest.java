package at.spengergasse.probematurauebung.domain.converter;

import at.spengergasse.probematurauebung.domain.TokenType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenTypeConverterTest {

    private final TokenTypeConverter tokenTypeConverter = new TokenTypeConverter();

    @Test
    void convertToDatabaseColumn() {
        assertEquals("V", tokenTypeConverter.convertToDatabaseColumn(TokenType.VOUCHER));
        assertEquals("R", tokenTypeConverter.convertToDatabaseColumn(TokenType.REGISTRATION));
        assertEquals("A", tokenTypeConverter.convertToDatabaseColumn(TokenType.AFFILIATE));
        assertEquals("P", tokenTypeConverter.convertToDatabaseColumn(TokenType.PASSWORD_RESET));
    }

    @Test
    void convertToEntityAttribute() {
        assertEquals(TokenType.VOUCHER, tokenTypeConverter.convertToEntityAttribute("V"));
        assertEquals(TokenType.REGISTRATION, tokenTypeConverter.convertToEntityAttribute("R"));
        assertEquals(TokenType.AFFILIATE, tokenTypeConverter.convertToEntityAttribute("A"));
        assertEquals(TokenType.PASSWORD_RESET, tokenTypeConverter.convertToEntityAttribute("P"));
        assertThrows(IllegalArgumentException.class, () -> tokenTypeConverter.convertToEntityAttribute("INVALID"));
    }
}