package com.example.org.controller;

import com.example.org.model.Loan;
import com.example.org.repository.LoanRepository;
import com.example.org.csv_loader.CsvFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController
@RequestMapping("/api")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;

    @GetMapping("/sync")
    public @ResponseBody String saveData() throws IOException {
        CsvFile.readCsv();
        loanRepository.saveAll(CsvFile.listAll);
        return "Data was saved in db.";
    }

    @GetMapping("/data/db")
    public @ResponseBody Iterable<Loan> getAllLoansFromDB(){
        return loanRepository.findAll();
    }

    @GetMapping("/data/file")
    public @ResponseBody Iterable<Loan> getAllLoansFromFile() throws IOException{
        return CsvFile.listAll;
    }

    @GetMapping("/data/db/gender/female")
    public @ResponseBody Iterable<Loan> getAllLoansFemale(@RequestParam(required = false,
            defaultValue = "1") int gender){
        return loanRepository.findByGender(gender);
    }

    @GetMapping("/data/file/gender/male")
    public @ResponseBody Iterable<Loan> getAllLoansMale(@RequestParam(required = false,
            defaultValue = "0") int gender) throws IOException{
        return CsvFile.findByGender(gender);
    }

    @GetMapping("/data/db/year/{year}")
    public @ResponseBody Iterable<Loan> getAllLoansByYear(@PathVariable int year){
        return loanRepository.findByYear(year);
    }

    @GetMapping("/data/db/year/{year}/gender/male/state/{status}")
    public @ResponseBody Iterable<Loan> getAllLoansByYearGenderStatus(@RequestParam(required = false,
            defaultValue = "1990") int year, @RequestParam(required = false,
            defaultValue = "0") int gender, @RequestParam(required = false, defaultValue = "Late") String status){
        return loanRepository.findByYearGenderStatus(year, gender, status);
    }

    @GetMapping("/data/file/gender/female/state/{status1}/state/{status2}")
    public @ResponseBody Iterable<Loan> getAllLoansByGenderAndStatus(@RequestParam(required = false,
            defaultValue = "1") int gender, @RequestParam(required = false, defaultValue = "Current") String status1, @RequestParam(required = false,
            defaultValue = "Repaid") String status2) throws IOException{
        return CsvFile.findByGenderAndStatus(gender, status1, status2);
    }
}
