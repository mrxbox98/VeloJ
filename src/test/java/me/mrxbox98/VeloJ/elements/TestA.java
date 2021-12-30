package me.mrxbox98.VeloJ.elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestA {

    @Test
    public void testABase() {
        assertEquals("<a></a>", new A().toString());
    }

    @Test
    public void testAHref()
    {
        assertEquals("<a href=\"https://example.com\"></a>", new A().setHref("https://example.com").toString());
    }

}
