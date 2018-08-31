package com.kodilla.testing.calculator;

import java.util.List;

public class Testing01 {


    public int showDuplicate(List<Integer> list){
        int duplicated = 0;
        for (int i = 0; i <list.size()-1 ; i++) {
            duplicated = list.get(i);
            if (list.get(i+1) == duplicated){
                return duplicated;
            }
        }
        return 0;
    }
}
