package com.example.org.csv_loader;

import com.example.org.model.Loan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;


public class CsvFile {

    public static List<Loan> listAll;

    public static List<Loan> findByGender(int gender){
        List<Loan> listByGender = new ArrayList<>();

        if(listAll == null || listAll.isEmpty()){
            return Collections.emptyList();
        }

        for(int i = 0; i < listAll.size(); i++) {
            Loan loan = listAll.get(i);
            if(loan.getGender() != null && loan.getGender() == gender){
                listByGender.add(loan);
            }
        }
        return listByGender;
    }

    public static List<Loan> findByGenderAndStatus(int gender, String status1, String status2){

        List<Loan> listByGenderAndStatus = new ArrayList<>();

        if(listAll == null || listAll.isEmpty()){
            return Collections.emptyList();
        }

        for (int i = 0; i < listAll.size(); i++) {
                Loan loan = listAll.get(i);
                if (loan.getGender() != null && loan.getGender() == gender
                        && (loan.getStatus().compareTo(status1) == 0 || loan.getStatus().compareTo(status2) == 0)) {
                    listByGenderAndStatus.add(loan);
                }
            }

        return listByGenderAndStatus;
    }

    public static void readCsv() throws IOException{

        URL url = new URL("https://s3-eu-west-1.amazonaws.com/b2bmobiledata.fidomockapp/dev/loans_data.csv");
        BufferedReader file = new BufferedReader(new InputStreamReader(url.openStream()));
        List<Loan> list = new ArrayList<>();
        BufferedReader buff = null;
        String line = "";
        Pattern pattern = Pattern.compile("((\"){1}[\"\\p{Lu}\\p{Lt}\\p{Lm}\\p{Lo}\\c\\p{IsCyrillic}\\pL\\pM\\s\\w-().^+,]*(\"){1})?,");

        try{
            buff = file;
            buff.readLine();
            while((line = buff.readLine())!= null){
                String [] dataSplit = pattern.split(line);
                ArrayList<String> data = new ArrayList<>(32);
                for(int i = 0; i < dataSplit.length; i++) {
                    data.add(dataSplit[i]);
                }
                if(data.size() < 32){
                    data.add("");
                }
                Loan loan = new Loan();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                if(!data.get(0).isEmpty()) {
                    loan.setId(Integer.valueOf(data.get(0)));
                }else{
                    loan.setId(null);
                }
                loan.setStatus(data.get(1));
                if(!data.get(2).isEmpty()) {
                    loan.setAmount(Double.valueOf(data.get(2)));
                }else{
                    loan.setAmount(null);
                }
                if(!data.get(3).isEmpty()) {
                    loan.setApplicationSignedHour(Integer.valueOf(data.get(3)));
                }else{
                    loan.setApplicationSignedHour(null);
                }
                if(!data.get(4).isEmpty()) {
                    loan.setApplicationSignedWeekday(Integer.valueOf(data.get(4)));
                }else{
                    loan.setApplicationSignedWeekday(null);
                }
                loan.setCity(data.get(5));
                loan.setCountry(data.get(6));
                loan.setCreditScoreEsEquifaxRisk(data.get(7));
                if(!data.get(8).isEmpty()) {
                    loan.setDateOfBirth(dateFormat.parse(data.get(8)));
                }else{
                    loan.setDateOfBirth(null);
                }
                if(!data.get(9).isEmpty()) {
                    loan.setDebtToIncome(Double.valueOf(data.get(9)));
                }else {
                    loan.setDebtToIncome(null);
                }
                if(!data.get(10).isEmpty()) {
                    loan.setEducation(Integer.valueOf(data.get(10)));
                }else{
                    loan.setEducation(null);
                }
                loan.setEmploymentDurationCurrentEmployer(data.get(11));
                loan.setEmploymentPosition(data.get(12));
                if(!data.get(13).isEmpty()) {
                    loan.setEmploymentStatus(Integer.valueOf(data.get(13)));
                }else{
                    loan.setEmploymentStatus(null);
                }
                if(!data.get(14).isEmpty()) {
                    loan.setExistingLiabilities(Integer.valueOf(data.get(14)));
                }else{
                    loan.setExistingLiabilities(null);
                }
                if(!data.get(15).isEmpty()) {
                    loan.setGender(Integer.valueOf(data.get(15)));
                }else{
                    loan.setGender(null);
                }
                if(!data.get(16).isEmpty()) {
                    loan.setHomeOwnershipType(Integer.valueOf(data.get(16)));
                }else{
                    loan.setHomeOwnershipType(null);
                }
                if(!data.get(17).isEmpty()) {
                    loan.setIncomeFromPrincipalEmployer(Double.valueOf(data.get(17)));
                }else{
                    loan.setIncomeFromPrincipalEmployer(null);
                }
                if(!data.get(18).isEmpty()) {
                    loan.setIncomeTotal(Double.valueOf(data.get(18)));
                }else {
                    loan.setIncomeTotal(null);
                }

                if(!data.get(19).isEmpty()){
                loan.setInterestRate(Double.valueOf(data.get(19)));
                } else{
                    loan.setInterestRate(null);
                };
                if(!data.get(20).isEmpty()) {
                    loan.setLoanDate(dateFormat.parse(data.get(20)));
                }else{
                    loan.setLoanDate(null);
                }
                if(!data.get(21).isEmpty()) {
                    loan.setLoanDuration(Integer.valueOf(data.get(21)));
                }else{
                    loan.setLoanDuration(null);
                }
                if(!data.get(22).isEmpty()) {
                    loan.setMaritalStatus(Integer.valueOf(data.get(22)));
                }else{
                    loan.setMaritalStatus(null);
                }
                if(!data.get(23).isEmpty()) {
                    loan.setNewCreditCustomer(Boolean.valueOf(data.get(23)));
                }else{
                    loan.setNewCreditCustomer(null);
                }
                if(!data.get(24).isEmpty()) {
                    loan.setNoOfPreviousLoansBeforeLoan(Integer.valueOf(data.get(24)));
                }else{
                    loan.setNoOfPreviousLoansBeforeLoan(null);
                }
                if(!data.get(25).isEmpty()) {
                    loan.setOccupationArea(Integer.valueOf(data.get(25)));
                }else{
                    loan.setOccupationArea(null);
                }
                if(!data.get(26).isEmpty()) {
                    loan.setUseOfLoan(Integer.valueOf(data.get(26)));
                }else{
                    loan.setUseOfLoan(null);
                }
                if(!data.get(27).isEmpty()) {
                    loan.setVerificationType(Integer.valueOf(data.get(27)));
                }else{
                    loan.setVerificationType(null);
                }
                loan.setWorkExperience(data.get(28));
                if(!data.get(29).isEmpty()) {
                    loan.setPreviousScore(Double.valueOf(data.get(29)));
                }else{
                    loan.setPreviousScore(null);
                }
                if(!data.get(30).isEmpty()) {
                    loan.setDefaulted(Boolean.valueOf(data.get(30)));
                }else{
                    loan.setDefaulted(null);
                }
                if(!data.get(31).isEmpty()) {
                    loan.setDefaultDate(dateFormat.parse(data.get(31)));
                }else{
                    loan.setDefaultDate(null);
                }
                list.add(loan);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }finally {
            if(buff != null){
                try{
                    buff.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        listAll = list;
    }
}