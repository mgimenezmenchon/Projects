package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mgimenez
 */
public class TaxRelief implements Serializable{
    private String taxReliefId;
    @NotNull(message="isCondoUpgrade non deve essere nullo")
    private Boolean isCondoUpgrade;
    @NotNull(message="creditorFiscalCode non deve essere nullo")
    private String creditorFiscalCode;
    @NotNull(message="beneficiaryType non deve essere nullo")
    private String beneficiaryType;
    private NaturalPersonBeneficiary naturalPersonBeneficiary;
    private LegalPersonBeneficiary legalPersonBeneficiary;

    public TaxRelief() {
    }

    public String getTaxReliefId() {
        return taxReliefId;
    }

    public void setTaxReliefId(String taxReliefId) {
        this.taxReliefId = taxReliefId;
    }

    public Boolean getIsCondoUpgrade() {
        return isCondoUpgrade;
    }

    public void setIsCondoUpgrade(Boolean isCondoUpgrade) {
        this.isCondoUpgrade = isCondoUpgrade;
    }

    public String getCreditorFiscalCode() {
        return creditorFiscalCode;
    }

    public void setCreditorFiscalCode(String creditorFiscalCode) {
        this.creditorFiscalCode = creditorFiscalCode;
    }

    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
        return naturalPersonBeneficiary;
    }

    public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
        this.naturalPersonBeneficiary = naturalPersonBeneficiary;
    }

    public LegalPersonBeneficiary getLegalPersonBeneficiary() {
        return legalPersonBeneficiary;
    }

    public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
        this.legalPersonBeneficiary = legalPersonBeneficiary;
    }

    
    
    
}
