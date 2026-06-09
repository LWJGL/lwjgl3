package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;

@Fork(1)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 1)
@State(Scope.Benchmark)
public class UnsafeAccessBench {

    private static final int MAX_SIZE = 1024;
    private static final int LONGS    = MAX_SIZE / 8;

    private final long       memory = nmemAlloc(MAX_SIZE);
    private final ByteBuffer buffer = memByteBuffer(memory, MAX_SIZE);

    private final int[] indices = new int[LONGS];

    @Setup(Level.Trial)
    public void setup() {
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // shuffle
        Random rand = new Random(7);
        for (int i = indices.length - 1; 0 < i; i--) {
            int r = rand.nextInt(i + 1);
            int v = indices[r];
            indices[r] = indices[i];
            indices[i] = v;
        }
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t0_baseline.xml"})
    @Benchmark
    public long t0_baseline() {
        int LONGS = buffer.remaining() >> 3;

        long sum = 0L;
        for (int i = 0; i < LONGS; i++) {
            sum += buffer.getLong(i << 3);
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t0_baseline_random.xml"})
    @Benchmark
    public long t0_baseline_random() {
        long sum = 0L;
        for (int index : indices) {
            sum += buffer.getLong(index << 3);
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t1_unsafe.xml"})
    @Benchmark
    public long t1_unsafe() {
        long sum = 0L;
        for (int i = 0; i < LONGS; i++) {
            sum += memGetLong(memory + ((long)i << 3));
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t1_unsafe_random.xml"})
    @Benchmark
    public long t1_unsafe_random() {
        long sum = 0L;
        for (int index : indices) {
            sum += memGetLong(memory + ((long)index << 3));
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t2_buffer.xml"})
    @Benchmark
    public long t2_buffer() {
        int LONGS = buffer.capacity() >> 3;

        long sum = 0L;
        for (int i = 0; i < LONGS; i++) {
            sum += memGetLong(buffer, (long)i << 3);
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t2_buffer_random.xml"})
    @Benchmark
    public long t2_buffer_random() {
        long sum = 0L;
        for (int index : indices) {
            sum += memGetLong(buffer, (long)index << 3);
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t3_bufferIndexed.xml"})
    @Benchmark
    public long t3_bufferIndexed() {
        int LONGS = buffer.capacity() >> 3;

        long sum = 0L;
        for (int i = 0; i < LONGS; i++) {
            sum += memGetLongAtIndex(buffer, i);
        }
        return sum;
    }

    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=t3_bufferIndexed_random.xml"})
    @Benchmark
    public long t3_bufferIndexed_random() {
        long sum = 0L;
        for (int index : indices) {
            sum += memGetLongAtIndex(buffer, index);
        }
        return sum;
    }

}
