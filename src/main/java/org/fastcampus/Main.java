package org.fastcampus;

import org.fastcampus.logic.BubbleSort;
import org.fastcampus.logic.Sort;
import org.fastcampus.service.SortService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortService sortService=new SortService(new BubbleSort<>());
        System.out.println("{result} " + sortService.doSort(Arrays.asList(args)));
    }
}