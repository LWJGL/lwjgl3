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
public class FFMStructCopyTest {

    static {
        ffmConfig(
            FFMStructCopyTest.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .build());
    }

    interface S {
        // struct size greater than the default NATIVE_THRESHOLD_COPY
        StructBinder<@NonNull S> $ = ffmStruct(S.class)
            .m("a", int32_t.array(32))
            .build();
    }

    private MemorySegment src;
    private MemorySegment dst;

    private S s;
    private S d;

    @Setup
    public void setup() {
        src = Arena.ofAuto().allocate(S.$.layout());
        dst = Arena.ofAuto().allocate(S.$.layout());

        s = S.$.get(src);
        d = S.$.get(dst);
    }

    @Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=copy.xml"})
    public void t0_copy() {
        S.$.copy(s, d);
    }

    @Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memcpyConstant.xml"})
    public void t1_memcpyConstant() {
        memCopy(src.address(), dst.address(), S.$.sizeof());
    }

    @Benchmark
    @Fork(jvmArgsAppend = {
        "-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memcpyConstantCopy7.xml",
        "-Djava.lang.foreign.native.threshold.power.copy=7"
    })
    public void t2_memcpyConstantCopy7() {
        memCopy(src.address(), dst.address(), S.$.sizeof());
    }

    //@Benchmark
    @Fork(jvmArgsAppend = {"-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memcpyVariable.xml",})
    public void t3_memcpyVariable() {
        memCopy(src.address(), dst.address(), src.byteSize());
    }

    //@Benchmark
    @Fork(jvmArgsAppend = {
        "-XX:+UnlockDiagnosticVMOptions", "-XX:LogFile=memcpyVariableCopy7.xml",
        "-Djava.lang.foreign.native.threshold.power.copy=7"
    })
    public void t4_memcpyVariableCopy7() {
        memCopy(src.address(), dst.address(), src.byteSize());
    }

}