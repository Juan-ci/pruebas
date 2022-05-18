package com.mycompany.prueba.unit;

import com.mycompany.prueba.StringUtils;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    

    @Test
    public void is_empty_test() {
        assertTrue(StringUtils.isEmpty(""));
    }
    
    @Test
    public void is_empty_test_trim() {
        assertTrue(StringUtils.isEmpty(" "));
    }
    
    @Test
    public void is_empty_test_string() {
        assertFalse(StringUtils.isEmpty(" l "));
    }
}
