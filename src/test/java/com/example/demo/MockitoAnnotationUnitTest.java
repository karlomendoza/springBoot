package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockitoAnnotationUnitTest {


    @Mock
    private Map<String, String> wordMap;

    @Test
    public void bla(){
        assertTrue(true);
    }

    @Test
    public void whenUseInjectMocksAnnotation_thenCorrect() {
        Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");

    }

}