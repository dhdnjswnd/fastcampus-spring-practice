package org.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바 소트 - 리스트 넣으면 정렬된 결과 shot")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(3,2,4,5,1));

        assertEquals(List.of(1,2,3,4,5), actual);
    }
}