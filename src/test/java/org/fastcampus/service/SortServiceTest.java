package org.fastcampus.service;

import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private  SortService srt = new SortService(new BubbleSort<>());

    @Test
    void test(){
        //Given

        //When
        List<String > actual = srt.doSort(List.of("3","2","1"));
        //Then

        assertEquals(List.of("1","2","3"), actual);

    }

}