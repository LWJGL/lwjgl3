package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

@State(Scope.Benchmark)
public class UnsafeCopyMemoryBench {

    private static final Unsafe UNSAFE = getUnsafeInstance();

    private static final int MAX_SIZE = 1024; // big enough for all tests

    private static final int OOP_SHIFT = 2; // assume compressed OOPs

    private static long f = UNSAFE.allocateMemory(MAX_SIZE);
    private static long t = UNSAFE.allocateMemory(MAX_SIZE);

    private static final byte[] fb = new byte[MAX_SIZE];
    private static final byte[] tb = new byte[MAX_SIZE];

    private static final short[] fs = new short[MAX_SIZE >> 1];
    private static final short[] ts = new short[MAX_SIZE >> 1];

    private static final int[] fi = new int[MAX_SIZE >> 2];
    private static final int[] ti = new int[MAX_SIZE >> 2];

    private static final long[] fl = new long[MAX_SIZE >> 3];
    private static final long[] tl = new long[MAX_SIZE >> 3];

    private static final Object[] fo = new Object[MAX_SIZE >> OOP_SHIFT];
    private static final Object[] to = new Object[MAX_SIZE >> OOP_SHIFT];

    @Param({"254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264"})
    public int length;

    @Benchmark
    public void t0_unsafe_baseline() {
        UNSAFE.copyMemory(null, f, null, t, length);
    }

    @Benchmark
    public void t0_unsafe_workaround() {
        // On x64, copyMemory has degraded performance when byte count is a multiple of 4.
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        long lastByteIndex = length - 1L;
        UNSAFE.copyMemory(null, f, null, t, lastByteIndex + (length & 1L));
        UNSAFE.putByte(null, t + lastByteIndex, UNSAFE.getByte(null, f + lastByteIndex));
    }

    //@Benchmark
    public void t1_array_0_byte() {
        System.arraycopy(fb, 0, tb, 0, length);
    }

    //@Benchmark
    public void t1_array_1_short() {
        System.arraycopy(fs, 0, ts, 0, length >> 1);
    }

    //@Benchmark
    public void t1_array_2_int() {
        System.arraycopy(fi, 0, ti, 0, length >> 2);
    }

    //@Benchmark
    public void t1_array_3_long() {
        System.arraycopy(fl, 0, tl, 0, length >> 3);
    }

    //@Benchmark
    public void t1_array_4_object() {
        System.arraycopy(fo, 0, to, 0, length >> OOP_SHIFT);
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
