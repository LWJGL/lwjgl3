/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;
import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.ffm.FFM.*;

@State(Scope.Benchmark)
public class FFMStructClearTest {

    static {
        ffmConfig(
            FFMStructClearTest.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .build());
    }

    interface S {
        // struct size greater than the default NATIVE_THRESHOLD_FILL
        StructBinder<@NonNull S> $ = ffmStruct(S.class)
            .m("a", array(int32_t, 16))
            .build();
    }

    private MemorySegment segment;

    private S s;

    @Setup
    public void setup() {
        segment = Arena.ofAuto().allocate(S.$.layout());
        s = S.$.get(segment);
    }

    @Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=clear.xml"})
    public void t0_clear() {
        S.$.clear(s);
    }

    @Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memsetConstant.xml"})
    public void t1_memsetConstant() {
        memSet(segment.address(), 0, S.$.sizeof());
    }

    @Benchmark
    @Fork(jvmArgsAppend = {
        "-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memsetConstantFill6.xml",
        "-Djava.lang.foreign.native.threshold.power.fill=6"
    })
    public void t2_memsetConstantFill6() {
        memSet(segment.address(), 0, S.$.sizeof());
    }

    //@Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memsetVariable.xml",})
    public void t3_memsetVariable() {
        memSet(segment.address(), 0, segment.byteSize());
    }

    //@Benchmark
    @Fork(jvmArgsAppend = {
        "-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memsetVariableFill6.xml",
        "-Djava.lang.foreign.native.threshold.power.fill=6"
    })
    public void t4_memsetVariableFill6() {
        memSet(segment.address(), 0, segment.byteSize());
    }

}