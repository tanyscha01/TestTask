package com.example.org.repository;

import com.example.org.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface LoanRepository extends JpaRepository<Loan, Integer>, LoanRepositoryCustom {

}
