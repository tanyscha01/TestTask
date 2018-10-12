package com.example.org.repository;

import com.example.org.controller.LoanController;
import com.example.org.model.Loan;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by tatja on 12.10.2018.
 */
public class LoanRepositoryImplTest {

    @Before
    public void setup() throws IOException{
        LoanController controller = new LoanController();
        controller.saveData();
    }


    @Test
    public void testFindByGenderSuccess() {
        LoanRepositoryCustom loanRepository = new LoanRepositoryImpl();
        List<Loan> loanList = loanRepository.findByGender(1);
        for(int i = 0; i < loanList.size(); i++){
            int gender = loanList.get(i).getGender();
            assertEquals(gender, 1);
        }
    }

    @Test
    public void testFindByYearSuccess() throws ParseException{
        LoanRepositoryCustom loanRepository = new LoanRepositoryImpl();
        List<Loan> loanList = loanRepository.findByYear(1996);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date afterDate = dateFormat.parse("01/01/1996");
        Date beforeDate = dateFormat.parse("31/12/1996");
        for(int i = 0; i < loanList.size(); i++){
            Date date = loanList.get(i).getDateOfBirth();
            assertTrue((date.after(afterDate) || date.compareTo(afterDate)==0) && (date.before(beforeDate) || date.compareTo(beforeDate)==0));
        }
    }

    @Test
    public void testByYearGenderStatusSuccess() throws ParseException{
        LoanRepositoryCustom loanRepository = new LoanRepositoryImpl();
        List<Loan> loanList = loanRepository.findByYearGenderStatus(1990, 0, "Late");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date afterDate = dateFormat.parse("01/01/1990");
        Date beforeDate = dateFormat.parse("31/12/1990");
        for(int i = 0; i < loanList.size(); i++){
            Date date = loanList.get(i).getDateOfBirth();
            int gender = loanList.get(i).getGender();
            String status = loanList.get(i).getStatus();
            assertEquals(gender, 0);
            assertEquals(status, "Late");
            assertTrue((date.after(afterDate) || date.compareTo(afterDate)==0) && (date.before(beforeDate) || date.compareTo(beforeDate)==0));
        }
    }
}
