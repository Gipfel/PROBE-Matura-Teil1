package at.spengergasse.probematurauebung.domain.converter;

import at.spengergasse.probematurauebung.domain.IncomeRange;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class IncomeRangeConverter implements AttributeConverter<IncomeRange, String> {

    @Override
    public String convertToDatabaseColumn(IncomeRange attribute) {
        return switch (attribute) {
            case BELOW_30000 -> "BL";
            case A30001_60000 -> "A3";
            case ABOVE_200000 -> "AB";
            case A100001_200000 -> "A1";
            case A60001_100000 -> "A6";
        };
    }

    @Override
    public IncomeRange convertToEntityAttribute(String dbData) throws IllegalArgumentException {
       return switch (dbData) {
           case "BL" -> IncomeRange.BELOW_30000;
           case "A3" -> IncomeRange.A30001_60000;
           case "AB" -> IncomeRange.ABOVE_200000;
           case "A1" -> IncomeRange.A100001_200000;
           case "A6" -> IncomeRange.A60001_100000;
           default -> throw new IllegalArgumentException("Unexpected IncomeRange " + dbData);
       };
    }
}
