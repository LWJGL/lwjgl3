/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.lang.invoke.*;
import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class VarHandleTest {

    //private static final VarHandle ARRAY  = MethodHandles.byteArrayViewVarHandle(float[].class, ByteOrder.nativeOrder());
    //private static final VarHandle BUFFER = MethodHandles.byteBufferViewVarHandle(float[].class, ByteOrder.nativeOrder());

    private byte[]  array  = new byte[4 * 4 * 4];
    private float[] arrayF = new float[4 * 4];

    private ByteBuffer  bb  = ByteBuffer.allocate(4 * 4 * 4);
    private FloatBuffer bbF = bb.asFloatBuffer();

    private ByteBuffer  dbb  = ByteBuffer.allocateDirect(4 * 4 * 4).order(ByteOrder.nativeOrder());
    private FloatBuffer dbbF = dbb.asFloatBuffer();

    @Benchmark
    public float array() {
        for (int i = 0; i < 16; i++) {
            arrayF[i] = 0.0f;
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += arrayF[i];
        }

        return s;
    }

    /*@Benchmark
    public float arrayVH() {
        for (int i = 0; i < 16; i++) {
            ARRAY.set(array, i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += (float)ARRAY.get(array, i * 4);
        }

        return s;
    }*/


    @Benchmark
    public float bb() {
        for (int i = 0; i < 16; i++) {
            bb.putFloat(i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += bb.getFloat(i * 4);
        }

        return s;
    }

    @Benchmark
    public float bbF() {
        for (int i = 0; i < 16; i++) {
            bbF.put(i, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += bbF.get(i);
        }

        return s;
    }

    /*@Benchmark
    public float bbVH() {
        for (int i = 0; i < 16; i++) {
            BUFFER.set(bb, i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += (float)BUFFER.get(bb, i * 4);
        }

        return s;
    }*/

    @Benchmark
    public float dbb() {
        for (int i = 0; i < 16; i++) {
            dbb.putFloat(i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += dbb.getFloat(i * 4);
        }

        return s;
    }

    @Benchmark
    public float dbbF() {
        for (int i = 0; i < 16; i++) {
            dbbF.put(i, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += dbbF.get(i);
        }

        return s;
    }

    /*@Benchmark
    public float dbbVH() {
        for (int i = 0; i < 16; i++) {
            BUFFER.set(dbb, i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += (float)BUFFER.get(dbb, i * 4);
        }

        return s;
    }*/

    @Benchmark
    public float dbbUnsafe() {
        for (int i = 0; i < 16; i++) {
            memPutFloat(memAddress(dbb) + i * 4, 0.0f);
        }

        float s = 0.0f;
        for (int i = 0; i < 16; i++) {
            s += memGetFloat(memAddress(dbb) + i * 4);
        }

        return s;
    }

}