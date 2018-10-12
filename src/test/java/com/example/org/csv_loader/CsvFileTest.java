package com.example.org.csv_loader;

import com.example.org.controller.LoanController;
import com.example.org.model.Loan;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CsvFileTest {

    @Before
    public void setup() throws IOException{
        LoanController controller = new LoanController();
        controller.saveData();
    }

    @Test
    public void testSaveDataFile() {

        List<Loan> listAll = CsvFile.listAll;
        assertTrue(!listAll.isEmpty());
    }

    @Test
    public void testFindByGenderInFile(){

        List<Loan> loanList = CsvFile.findByGender(0);
        for(int i = 0; i < loanList.size(); i++){
            int gender = loanList.get(i).getGender();
            assertEquals(gender, 0);
        }
    }

    @Test
    public void testFindByGenderAndStatusInFile(){

        List<Loan> loanList = CsvFile.findByGenderAndStatus(1, "Current", "Repaid");
        for(int i = 0; i < loanList.size(); i++){
            int gender = loanList.get(i).getGender();
            String status = loanList.get(i).getStatus();
            assertEquals(gender, 1);
            assertTrue((status.compareTo("Current") == 0 || status.compareTo("Repaid") == 0));
        }
    }
}
