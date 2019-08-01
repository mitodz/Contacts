/*
 * Copyright (c) 2019. Ashot Tonaganyan mitodzzz@gmail.com
 */

package contacts;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void isCorrect1() {
        assertFalse(new Contact().isCorrect("+(with space)"));
    }

    @Test
    public void isCorrect2() {
        assertTrue(new Contact().isCorrect("(123)"));
    }

    @Test
    public void isCorrect3() {
        assertFalse(new Contact().isCorrect("+(123) (123)"));
    }

    @Test
    public void isCorrect4() {
        assertTrue(new Contact().isCorrect("+0 (123) 456-789-ABcd"));
    }
}