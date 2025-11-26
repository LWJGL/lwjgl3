package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import sun.misc.*;

import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class UnsafeSetMemoryBench {

    private static final Unsafe UNSAFE = getUnsafeInstance();

    private static final int MAX_SIZE = 1024; // big enough for all tests

    private static long buffer = nmemAlloc(MAX_SIZE);

    @Param({"254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264"})
    public int length;

    @Benchmark
    public void setMemory_baseline() {
        UNSAFE.setMemory(buffer, length, (byte)0);
    }

    @Benchmark
    public void setMemory_workaround() {
        // On x64, setMemory has degraded performance when byte count is a multiple of 2 or 4 (but not 8).
        // Workaround by setting all but the last byte with setMemory, then setting the last byte separately.
        long lastByteIndex = length - 1L;
        UNSAFE.setMemory(buffer, lastByteIndex + (length & 1L), (byte)0);
        UNSAFE.putByte(buffer + lastByteIndex, (byte)0);
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
