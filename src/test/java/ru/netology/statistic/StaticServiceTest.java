package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticServiceTest {

    @Test
    void findMaxWhenItFirst() {
        StaticService service = new StaticService();

        long[] incomesInBillions = {13, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

  //  @Test
  //  void findMaxWhenItLast() {
  //      StaticService service = new StaticService();

  //      long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};
  //      long expected = 13;

 //       long actual = service.findMax(incomesInBillions);

   //     assertEquals(expected, actual);
   // }
}