package com.workintech.zoo.validation;

import com.workintech.zoo.entity.Kangroo;
import com.workintech.zoo.exception.KangrooException;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class ZooKangrooValidation {

    private static final String ID_IS_NOT_VALID = "Id must be greater than 0";
    private static final String KANGROO_NOT_EXIST = "Student with given id is not exist: ";
    private static final String KANGROO_EXIST = "Student with given id is already exist: ";
    private static final String KANGROO_CREDENTIALS_NOT_EXIST = "Student credentials are not valid ";

    public static void isIdNotValid(long id){
        if(id<0){
            throw new KangrooException(ID_IS_NOT_VALID, HttpStatus.BAD_REQUEST);
        }
    }

    public static void isKangrooNotExist(Map<Long, Kangroo> kangrooMap, long id){
        if(!kangrooMap.containsKey(id)){
            throw new KangrooException(KANGROO_NOT_EXIST, HttpStatus.NOT_FOUND);
        }
    }

    public static void isKangrooExist(Map<Long, Kangroo> kangrooMap, long id){
        if(kangrooMap.containsKey(id)){
            throw new KangrooException(KANGROO_CREDENTIALS_NOT_EXIST + id, HttpStatus.BAD_REQUEST);
        }
    }






}
