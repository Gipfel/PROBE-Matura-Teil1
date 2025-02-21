package at.spengergasse.probematurauebung.domain.converter;

import at.spengergasse.probematurauebung.domain.TokenType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TokenTypeConverter implements AttributeConverter<TokenType, String> {

    @Override
    public String convertToDatabaseColumn(TokenType attribute) {
        return switch (attribute) {
            case VOUCHER -> "V";
            case REGISTRATION -> "R";
            case AFFILIATE -> "A";
            case PASSWORD_RESET -> "P";
        };
    }

    @Override
    public TokenType convertToEntityAttribute(String dbData) throws IllegalArgumentException {
        return switch (dbData) {
            case "V" -> TokenType.VOUCHER;
            case "R" -> TokenType.REGISTRATION;
            case "A" -> TokenType.AFFILIATE;
            case "P" -> TokenType.PASSWORD_RESET;
            default -> throw new IllegalArgumentException("Unexpected TokeType: " + dbData);
        };
    }
}
