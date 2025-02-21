package at.spengergasse.probematurauebung.domain.converter;

import at.spengergasse.probematurauebung.domain.IncomeRange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class IncomeRangeConverterTest {

    private final IncomeRangeConverter incomeRangeConverter = new IncomeRangeConverter();

    @Test
    public void testIncomeConverter() {
        assertEquals("BL", incomeRangeConverter.convertToDatabaseColumn(IncomeRange.BELOW_30000));
        assertEquals("A3", incomeRangeConverter.convertToDatabaseColumn(IncomeRange.A30001_60000));
        assertEquals("A6", incomeRangeConverter.convertToDatabaseColumn(IncomeRange.A60001_100000));
        assertEquals("A1", incomeRangeConverter.convertToDatabaseColumn(IncomeRange.A100001_200000));
        assertEquals("AB", incomeRangeConverter.convertToDatabaseColumn(IncomeRange.ABOVE_200000));
    }

    @Test
    public void testIncomeConverterEntity() {
        assertEquals(IncomeRange.BELOW_30000, incomeRangeConverter.convertToEntityAttribute("BL"));
        assertEquals(IncomeRange.A30001_60000, incomeRangeConverter.convertToEntityAttribute("A3"));
        assertEquals(IncomeRange.A60001_100000, incomeRangeConverter.convertToEntityAttribute("A6"));
        assertEquals(IncomeRange.A100001_200000, incomeRangeConverter.convertToEntityAttribute("A2"));
        assertEquals(IncomeRange.ABOVE_200000, incomeRangeConverter.convertToEntityAttribute("AB"));
        assertThrows(IllegalArgumentException.class, () -> incomeRangeConverter.convertToEntityAttribute("INVALID"));
    }
}