/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.meshoptimizer;

import org.testng.annotations.*;

import java.util.concurrent.*;

import static org.lwjgl.util.meshoptimizer.MeshOptimizer.*;
import static org.testng.Assert.*;

@Test
public class MeshOptimizerTest {

    private static final int[] BITS = {6, 8, 10, 12, 14, 16};

    public void testUnorm() {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < 1000; i++) {
            for (int N : BITS) {
                float value         = rand.nextFloat();
                int   quantized     = meshopt_quantizeUnorm(value, N);
                float reconstructed = (float)quantized / ((1 << N) - 1);

                assertEquals(reconstructed, value, 1.0f / (1 << N));
            }
        }
    }

    public void testSnorm() {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < 1000; i++) {
            for (int N : BITS) {
                float value         = (rand.nextFloat() - 0.5f) * 2.0f;
                int   quantized     = meshopt_quantizeSnorm(value, N);
                float reconstructed = (float)quantized / ((1 << (N - 1)) - 1);

                assertEquals(reconstructed, value, 1.0f / (1 << (N - 1)));
            }
        }
    }
}