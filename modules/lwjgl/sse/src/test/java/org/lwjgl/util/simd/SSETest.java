/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.simd;

import org.testng.annotations.*;

import static java.lang.Math.*;
import static org.lwjgl.util.simd.SSE.*;
import static org.lwjgl.util.simd.SSE3.*;
import static org.testng.Assert.*;

@Test
public class SSETest {

    public void testControlRegister() {
        int flushZeroMode     = _MM_GET_FLUSH_ZERO_MODE();
        int roundingMode      = _MM_GET_ROUNDING_MODE();
        int denormalsZeroMode = _MM_GET_DENORMALS_ZERO_MODE();

        try {
            // Default behavior
            _MM_SET_EXCEPTION_STATE(0);
            assertEquals(_MM_GET_EXCEPTION_STATE(), 0);

            float f = Float.MIN_VALUE;
            assertEquals(_MM_GET_EXCEPTION_STATE() & _MM_EXCEPT_DENORM, 0);

            for (int i = 0; i < 100000; i++) {
                f *= nextAfter(1.0f, 0.0);
            }

            assertEquals(_MM_GET_EXCEPTION_STATE() & _MM_EXCEPT_DENORM, _MM_EXCEPT_DENORM);
            assertEquals(f, Float.MIN_VALUE);

            // Denormals are zero mode
            _MM_SET_EXCEPTION_STATE(0);
            assertEquals(_MM_GET_EXCEPTION_STATE(), 0);

            _MM_SET_FLUSH_ZERO_MODE(_MM_FLUSH_ZERO_ON);
            _MM_SET_DENORMALS_ZERO_MODE(_MM_DENORMALS_ZERO_ON);

            for (int i = 0; i < 100000; i++) {
                f *= nextAfter(1.0f, 0.0);
            }

            assertEquals(_MM_GET_EXCEPTION_STATE() & _MM_EXCEPT_DENORM, 0);
            assertEquals(f, 0.0f);
        } finally {
            // Reset control register
            _MM_SET_DENORMALS_ZERO_MODE(denormalsZeroMode);
            _MM_SET_ROUNDING_MODE(roundingMode);
            _MM_SET_FLUSH_ZERO_MODE(flushZeroMode);
        }
    }

}