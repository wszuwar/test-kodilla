package com.kodilla.hibernate.manytomany.Facade;

import org.slf4j.Logger;

public class NotFoundExeption extends Exception{
    public static String ERR_GET_COMPANIES_ERROR= "Company not found";
    public static String ERR_GET_EMPLOEES_ERROR= "Employe not found";

    public NotFoundExeption(String message) {
        super(message);
    }
}
