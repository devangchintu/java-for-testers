package com.serenitydojo;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class WhenWorkingWithLists {

    @Test
    public void creatingASimpleList(){

        List SimpleList = new ArrayList();
        SimpleList.add("Joe");
        SimpleList.add(123);
        assertThat(SimpleList).contains("Joe",123);
        assertThat(SimpleList).contains("Joe",123);

    }

    @Test

    public void createdATypeList(){
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        names.add("Joe");
        names.add("Michale");

        ages.add(12);
        ages.add(25);

        assertThat(names).contains("Joe","Michale");
        assertThat(ages).contains(12,25);
    }

    @Test

    public void removingStuff(){
        List<String > name = new ArrayList<>();
        name.add("Mike");
        name.add("John");
        name.remove("Smith");

        assertThat(name).contains("Mike","John");

        name.clear();
        assertThat(name).isEmpty();
    }

    @Test

    public void findelementinaList(){
        List<String> names = Arrays.asList("John","Devang","Mike");

        int IndexofDevang = names.indexOf("Devang");

        assertThat(IndexofDevang).isEqualTo(1);

    }

    @Test

    public void findingtheSize(){
        List<String> names = Arrays.asList("Joe","Devang","Mike","Elie","Mina");

        assertThat(names.size()).isEqualTo(5);
    }

    @Test

    public void sortingAList(){

        List<String> names = Arrays.asList("John","Devang","Mike","Elie");

        Collections.sort(names);

        assertThat(names).containsExactly("Devang","Elie","John","Mike");
    }

    @Test

    public void findingmaximumandminimum()
    {
        List<Integer> ages = Arrays.asList(10,20,30,40,50);

        assertThat(Collections.max(ages)).isEqualTo(50);
        assertThat(Collections.min(ages)).isEqualTo(10);

    }
    
}
