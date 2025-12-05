package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class UnsafeCopyOffHeap2ArrayBench {

    private static final Unsafe UNSAFE = getUnsafeInstance();

    private static final int MAX_SIZE = 10 * 1024; // big enough for all tests

    private static long dst = UNSAFE.allocateMemory(MAX_SIZE);

    //@Param({"254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264"})
    @Param({"1024"})
    public int length;

    public byte[]   arrayB;
    public short[]  arrayS;
    public int[]    arrayI;
    public long[]   arrayL;
    public float[]  arrayF;
    public double[] arrayD;

    @Setup
    public void setup() {
        arrayB = new byte[length];
        arrayS = new short[length >> 1];
        arrayI = new int[length >> 2];
        arrayL = new long[length >> 3];
        arrayF = new float[length >> 2];
        arrayD = new double[length >> 3];
    }

    @Benchmark
    public void t0_byte_baseline() {
        UNSAFE.copyMemory(null, dst, arrayB, Unsafe.ARRAY_BYTE_BASE_OFFSET, length);
    }

    @Benchmark
    public void t0_byte_workaround() {
        memCopy(dst, arrayB);
    }

    @Benchmark
    public void t1_short_baseline() {
        UNSAFE.copyMemory(null, dst, arrayS, Unsafe.ARRAY_SHORT_BASE_OFFSET, length);
    }

    @Benchmark
    public void t1_short_workaround() {
        memCopy(dst, arrayS);
    }

    @Benchmark
    public void t2_int_baseline() {
        UNSAFE.copyMemory(null, dst, arrayI, Unsafe.ARRAY_INT_BASE_OFFSET, length);
    }

    @Benchmark
    public void t2_int_workaround() {
        memCopy(dst, arrayI);
    }

    @Benchmark
    public void t3_long_baseline() {
        UNSAFE.copyMemory(null, dst, arrayL, Unsafe.ARRAY_LONG_BASE_OFFSET, length);
    }

    @Benchmark
    public void t3_long_workaround() {
        memCopy(dst, arrayL);
    }

    @Benchmark
    public void t4_float_baseline() {
        UNSAFE.copyMemory(null, dst, arrayF, Unsafe.ARRAY_FLOAT_BASE_OFFSET, length);
    }

    @Benchmark
    public void t4_float_workaround() {
        memCopy(dst, arrayF);
    }

    @Benchmark
    public void t5_double_baseline() {
        UNSAFE.copyMemory(null, dst, arrayD, Unsafe.ARRAY_DOUBLE_BASE_OFFSET, length);
    }

    @Benchmark
    public void t5_double_workaround() {
        memCopy(dst, arrayD);
    }

    private static Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = Unsafe.class.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            field.setAccessible(true);
            try {
                return (Unsafe)field.get(null);
            } catch (IllegalAccessException e) {
                // ignore
            }
            break;
        }
        throw new UnsupportedOperationException();
    }

}
