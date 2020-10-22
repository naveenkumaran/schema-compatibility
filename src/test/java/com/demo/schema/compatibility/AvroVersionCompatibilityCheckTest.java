package com.demo.schema.compatibility;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AvroVersionCompatibilityCheckTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreateVersion0() throws Exception{

        AvroVersionCompatibilityCheck.baseVersion();
    }
}
