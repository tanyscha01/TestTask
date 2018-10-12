package com.example.org.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Loan {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Status")
    private String status;

    @Column(name = "Amount")
    private Double amount;

    @Column(name = "ApplicationSignedHour")
    private Integer applicationSignedHour;

    @Column(name = "ApplicationSignedWeekday")
    private Integer applicationSignedWeekday;

    @Column(name = "City")
    private String city;

    @Column(name = "Country")
    private String country;

    @Column(name = "CreditScoreEsEquifaxRisk")
    private String creditScoreEsEquifaxRisk;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "DebtToIncome")
    private Double debtToIncome;

    @Column(name = "Education")
    private Integer education;

    @Column(name = "EmploymentDurationCurrentEmployer")
    private String employmentDurationCurrentEmployer;

    @Column(name = "EmploymentPosition")
    private String employmentPosition;

    @Column(name = "EmploymentStatus")
    private Integer employmentStatus;

    @Column(name = "ExistingLiabilities")
    private Integer existingLiabilities;

    @Column(name = "Gender")
    private Integer gender;

    @Column(name = "HomeOwnershipType")
    private Integer homeOwnershipType;

    @Column(name = "IncomeFromPrincipalEmployer")
    private Double incomeFromPrincipalEmployer;

    @Column(name = "IncomeTotal")
    private Double incomeTotal;

    @Column(name = "InterestRate")
    private Double interestRate;

    @Column(name = "LoanDate")
    private Date loanDate;

    @Column(name = "LoanDuration")
    private Integer loanDuration;

    @Column(name = "MaritalStatus")
    private Integer maritalStatus;

    @Column(name = "NewCreditCustomer")
    private Boolean newCreditCustomer;

    @Column(name = "NoOfPreviousLoansBeforeLoan")
    private Integer noOfPreviousLoansBeforeLoan;

    @Column(name = "OccupationArea")
    private Integer occupationArea;

    @Column(name = "UseOfLoan")
    private Integer useOfLoan;

    @Column(name = "VerificationType")
    private Integer verificationType;

    @Column(name = "WorkExperience")
    private String workExperience;

    @Column(name = "PreviousScore")
    private Double previousScore;

    @Column(name = "Defaulted")
    private Boolean defaulted;

    @Column(name = "DefaultDate")
    private Date defaultDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getApplicationSignedHour() {
        return applicationSignedHour;
    }

    public void setApplicationSignedHour(Integer applicationSignedHour) {
        this.applicationSignedHour = applicationSignedHour;
    }

    public Integer getApplicationSignedWeekday() {
        return applicationSignedWeekday;
    }

    public void setApplicationSignedWeekday(Integer applicationSignedWeekday) {
        this.applicationSignedWeekday = applicationSignedWeekday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreditScoreEsEquifaxRisk() {
        return creditScoreEsEquifaxRisk;
    }

    public void setCreditScoreEsEquifaxRisk(String creditScoreEsEquifaxRisk) {
        this.creditScoreEsEquifaxRisk = creditScoreEsEquifaxRisk;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getDebtToIncome() {
        return debtToIncome;
    }

    public void setDebtToIncome(Double debtToIncome) {
        this.debtToIncome = debtToIncome;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getEmploymentDurationCurrentEmployer() {
        return employmentDurationCurrentEmployer;
    }

    public void setEmploymentDurationCurrentEmployer(String employmentDurationCurrentEmployer) {
        this.employmentDurationCurrentEmployer = employmentDurationCurrentEmployer;
    }

    public String getEmploymentPosition() {
        return employmentPosition;
    }

    public void setEmploymentPosition(String employmentPosition) {
        this.employmentPosition = employmentPosition;
    }

    public Integer getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Integer employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Integer getExistingLiabilities() {
        return existingLiabilities;
    }

    public void setExistingLiabilities(Integer existingLiabilities) {
        this.existingLiabilities = existingLiabilities;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getHomeOwnershipType() {
        return homeOwnershipType;
    }

    public void setHomeOwnershipType(Integer homeOwnershipType) {
        this.homeOwnershipType = homeOwnershipType;
    }

    public Double getIncomeFromPrincipalEmployer() {
        return incomeFromPrincipalEmployer;
    }

    public void setIncomeFromPrincipalEmployer(Double incomeFromPrincipalEmployer) {
        this.incomeFromPrincipalEmployer = incomeFromPrincipalEmployer;
    }

    public Double getIncomeTotal() {
        return incomeTotal;
    }

    public void setIncomeTotal(Double incomeTotal) {
        this.incomeTotal = incomeTotal;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Integer getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(Integer loanDuration) {
        this.loanDuration = loanDuration;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Boolean isNewCreditCustomer() {
        return newCreditCustomer;
    }

    public void setNewCreditCustomer(Boolean newCreditCustomer) {
        this.newCreditCustomer = newCreditCustomer;
    }

    public Integer getNoOfPreviousLoansBeforeLoan() {
        return noOfPreviousLoansBeforeLoan;
    }

    public void setNoOfPreviousLoansBeforeLoan(Integer noOfPreviousLoansBeforeLoan) {
        this.noOfPreviousLoansBeforeLoan = noOfPreviousLoansBeforeLoan;
    }

    public Integer getOccupationArea() {
        return occupationArea;
    }

    public void setOccupationArea(Integer occupationArea) {
        this.occupationArea = occupationArea;
    }

    public Integer getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(Integer useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    public Integer getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Integer verificationType) {
        this.verificationType = verificationType;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public Double getPreviousScore() {
        return previousScore;
    }

    public void setPreviousScore(Double previousScore) {
        this.previousScore = previousScore;
    }

    public Boolean isDefaulted() {
        return defaulted;
    }

    public void setDefaulted(Boolean defaulted) {
        this.defaulted = defaulted;
    }

    public Date getDefaultDate() {
        return defaultDate;
    }

    public void setDefaultDate(Date defaultDate) {
        this.defaultDate = defaultDate;
    }

    @Override
    public String toString() {
        return "[id = " + this.id + ", status = " + this.status + ", amount = " + this.amount + ", applicationSignedHour = " + this.applicationSignedHour + ", applicationSignedWeekday = " + this.applicationSignedWeekday +
                ", city = " + this.city + ", country = " + this.country + ", creditScoreEsEquifaxRisk = " + this.creditScoreEsEquifaxRisk + ", dateOfBirth = " + this.dateOfBirth + ", debtToIncome = " + this.debtToIncome +
                ", education = " + this.education + ", employmentDurationCurrentEmployer = " + this.employmentDurationCurrentEmployer + ", employmentPosition = " + this.employmentPosition + ", employmentStatus = " + this.employmentStatus + ", existingLiabilities = " + this.existingLiabilities +
                ", gender = " + this.gender + ", homeOwnershipType = " + this.homeOwnershipType + ", incomeFromPrincipalEmployer = " + this.incomeFromPrincipalEmployer + ", incomeTotal = " + this.incomeTotal + ", interestRate = " + this.interestRate +
                ", loanDate = " + this.loanDate + ", loanDuration = " + this.loanDuration + ", maritalStatus = " + this.maritalStatus + ", newCreditCustomer = " + this.newCreditCustomer + ", noOfPreviousLoansBeforeLoan = " + this.noOfPreviousLoansBeforeLoan +
                ", occupationArea = " + this.occupationArea + ", useOfLoan = " + this.useOfLoan + ", verificationType = " + this.verificationType + ", workExperience = " + this.workExperience + ", previousScore = " + this.previousScore +
                ", defaulted = " + this.defaulted + ", defaultDate = " + this.defaultDate +"]";
    }
}
