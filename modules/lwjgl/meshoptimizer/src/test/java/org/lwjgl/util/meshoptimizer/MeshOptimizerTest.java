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
                float value = rand.nextFloat();

                int quantized = meshopt_quantizeUnorm(value, N);
                assertEquals(quantized, meshopt_quantizeUnorm_ref(value, N));

                float reconstructed = (float)quantized / ((1 << N) - 1);
                assertEquals(reconstructed, value, 1.0f / (1 << N));
            }
        }
    }

    public void testSnorm() {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < 1000; i++) {
            for (int N : BITS) {
                float value = (rand.nextFloat() - 0.5f) * 2.0f;

                int quantized = meshopt_quantizeSnorm(value, N);
                assertEquals(quantized, meshopt_quantizeSnorm_ref(value, N));

                float reconstructed = (float)quantized / ((1 << (N - 1)) - 1);
                assertEquals(reconstructed, value, 1.0f / (1 << (N - 1)));
            }
        }
    }

    public void testQuantizeHalf() {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < 10_000; i++) {
            float value = Math.max(6e-5f, rand.nextFloat() * 65504.0f);

            short quantized = meshopt_quantizeHalf(value);
            assertEquals(quantized, meshopt_quantizeHalf_ref(value));
        }
    }

    public void testQuantizeFloat() {
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        for (int i = 0; i < 1000; i++) {
            for (int N : BITS) {
                float value = rand.nextFloat();

                float quantized = meshopt_quantizeFloat(value, N);
                assertEquals(quantized, meshopt_quantizeFloat_ref(value, N));
            }
        }
    }

    public void testDequantizeHalf() {
        for (int i = 0; i < 0xFFFF; i++) {
            float dequantized = meshopt_dequantizeHalf((short)i);
            assertEquals(dequantized, meshopt_dequantizeHalf_ref((short)i));
        }
    }
}