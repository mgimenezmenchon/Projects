package com.fabrik.restcontroller.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mgimenez
 */
public class LegalPersonBeneficiary implements Serializable{
    @NotNull(message="fiscalCode non deve essere nullo")
    private String fiscalCode;
    private String legalRepresentativeFiscalCode;

    public LegalPersonBeneficiary() {
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getLegalRepresentativeFiscalCode() {
        return legalRepresentativeFiscalCode;
    }

    public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
        this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
    }

    
}
