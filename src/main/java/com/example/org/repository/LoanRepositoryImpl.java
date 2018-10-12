package com.example.org.repository;

import com.example.org.model.Loan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class LoanRepositoryImpl implements LoanRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Loan> findByGender(int gender) {

        Query query = entityManager.createNativeQuery("SELECT * FROM restclientdb.loan as em " +
                "WHERE em.gender LIKE ?", Loan.class);
        query.setParameter(1, gender);
        return query.getResultList();
    }


    @Override
    public List<Loan> findByYear(int year) {

        Query query = entityManager.createNativeQuery("SELECT * FROM restclientdb.loan as em " +
                "WHERE em.date_of_birth >= STR_TO_DATE(?,'%d/%m/%Y') and em.date_of_birth <= STR_TO_DATE(?,'%d/%m/%Y')", Loan.class);
        query.setParameter(1, "01/01/" + year);
        query.setParameter(2, "31/12/" + year);
        return query.getResultList();
    }

    @Override
    public List<Loan> findByYearGenderStatus(int year, int gender, String status) {
        Query query = entityManager.createNativeQuery("SELECT * FROM restclientdb.loan as em " +
                "WHERE em.date_of_birth >= STR_TO_DATE(?,'%d/%m/%Y') and em.date_of_birth <= STR_TO_DATE(?,'%d/%m/%Y') AND em.gender = ? and em.status = ?", Loan.class);
        query.setParameter(1, "01/01/" + year);
        query.setParameter(2, "31/12/" + year);
        query.setParameter(3, gender);
        query.setParameter(4, status);
        return query.getResultList();
    }
}
