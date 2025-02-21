package at.spengergasse.probematurauebung.domain;

public record DemographicData(
        boolean studied,
        boolean finishedBachelor,
        boolean finishedMaster,
        boolean finishedPhD,
        boolean isSelfEmployed,
        boolean hasEmployees,
        boolean hasStaffResponsibility,
        IncomeRange yearlyIncome
) {
}
