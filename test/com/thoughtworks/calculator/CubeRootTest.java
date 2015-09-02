package com.thoughtworks.calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeRootTest {

    @Test
    public void shoudlReturnZeroIfOperandIsZero() {
        CubeRoot cubeRoot = new CubeRoot();

        assertEquals(0.0, cubeRoot.doOperation(0), 0.0);
    }

    @Test
    public void shoudlReturnValidCubeRootIfNotZero() {
        CubeRoot cubeRoot = new CubeRoot();

        assertEquals(2.0, cubeRoot.doOperation(8), 0.0);
    }
}
