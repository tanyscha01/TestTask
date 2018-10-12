package com.example.org.repository;


import com.example.org.model.Loan;

import java.util.List;

public interface LoanRepositoryCustom {

    List<Loan> findByGender(int gender);

    List<Loan> findByYear(int year);

    List<Loan> findByYearGenderStatus(int year, int gender, String status);

}
