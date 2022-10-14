package com.pach.csv;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {
    CSVReader readCSV = new CSVReader();

    @Test
    public void assertThatTheProductListReadIsNotEmptyAndFileReadingIsTrue(){
        assertTrue(readCSV.readCSV());
        assertFalse(readCSV.productList.isEmpty());
    }

    @Test
    @DisplayName("Assert product list is not empty")
    void testCSVReader() {
        assertFalse(readCSV.readCSVFile().isEmpty());
    }

}