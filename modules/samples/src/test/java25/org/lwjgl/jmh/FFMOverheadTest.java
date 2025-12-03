/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.jspecify.annotations.*;
import org.lwjgl.system.*;
import org.lwjgl.system.ffm.*;
import org.openjdk.jmh.annotations.*;

import java.lang.foreign.*;
import java.lang.invoke.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.ffm.FFM.*;

/*
Results on AMD 7950X3D, Windows 11, JDK 23:
--------------------------------------------------------------------------

Benchmark                                 Mode  Cnt  Score    Error  Units
FFMOverheadTest.b00_noop_jni              avgt    3  3,192 ?  0,522  ns/op

FFMOverheadTest.b01_noop_ffm              avgt    3  2,993 ?  0,337  ns/op
FFMOverheadTest.b02_noop_gen              avgt    3  2,993 ?  0,094  ns/op

FFMOverheadTest.b01_noop_ffm_crit         avgt    3  2,468 ?  1,662  ns/op
FFMOverheadTest.b02_noop_gen_crit         avgt    3  2,461 ?  1,967  ns/op

--------------------------------------------------------------------------

Benchmark                                 Mode  Cnt  Score    Error  Units
FFMOverheadTest.b10_noop_params_jni       avgt    3  3,600 ?  0,075  ns/op

FFMOverheadTest.b11_noop_params_ffm       avgt    3  3,178 ?  0,818  ns/op
FFMOverheadTest.b12_noop_params_gen       avgt    3  3,172 ?  0,428  ns/op

FFMOverheadTest.b11_noop_params_ffm_crit  avgt    3  2,628 ?  0,146  ns/op
FFMOverheadTest.b12_noop_params_gen_crit  avgt    3  2,610 ?  0,254  ns/op
 */
@State(Scope.Benchmark)
public class FFMOverheadTest {

    static {
        Library.initialize();
    }

    private static final SymbolLookup LOADER = SymbolLookup.libraryLookup("lwjgl", Arena.global());

    private static final MemorySegment FUNCTION_NOOP        = LOADER.find("org_lwjgl_system_noop").orElseThrow();
    private static final MemorySegment FUNCTION_NOOP_PARAMS = LOADER.find("org_lwjgl_system_noop_params").orElseThrow();

    private static final MethodHandle NOOP = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid())
        .bindTo(FUNCTION_NOOP);

    private static final MethodHandle NOOP_PARAMS = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT))
        .bindTo(FUNCTION_NOOP_PARAMS);

    private static final MethodHandle NOOP_CRIT = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(), Linker.Option.critical(false))
        .bindTo(FUNCTION_NOOP);

    private static final MethodHandle NOOP_PARAMS_CRIT = Linker.nativeLinker()
        .downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT), Linker.Option.critical(false))
        .bindTo(FUNCTION_NOOP_PARAMS);

    private interface FFMBindings {
        @FFMName("org_lwjgl_system_noop")
        void noop();

        @FFMCritical
        @FFMName("org_lwjgl_system_noop")
        void noop_crit();

        @FFMName("org_lwjgl_system_noop_params")
        void noop_params(@Nullable MemorySegment param0, @Nullable MemorySegment param1, int param2);

        @FFMName("org_lwjgl_system_noop_params")
        void noop_params_checked(MemorySegment param0, MemorySegment param1, int param2);

        @FFMCritical
        @FFMName("org_lwjgl_system_noop_params")
        void noop_params_crit(@Nullable MemorySegment param0, @Nullable MemorySegment param1, int param2);

        @FFMCritical
        @FFMName("org_lwjgl_system_noop_params")
        void noop_params_crit_checked(MemorySegment param0, MemorySegment param1, int param2);
    }

    private static final FFMBindings BINDINGS = ffmGenerate(FFMBindings.class,
        ffmConfigBuilder(MethodHandles.lookup())
            .withSymbolLookup(LOADER)
            .build()
    );

    private MemorySegment param0 = MemorySegment.ofAddress(8L);
    private MemorySegment param1 = MemorySegment.ofAddress(16L);
    private int           param2 = 32;

    @Benchmark
    public void b00_noop_jni() {
        invokeV(FUNCTION_NOOP.address());
    }

    @Benchmark
    public void b10_noop_params_jni() {
        invokePPV(param0.address(), param1.address(), param2, FUNCTION_NOOP.address());
    }

    @Benchmark
    public void b20_noop_params_checked_jni() {
        if (CHECKS) {
            if (MemorySegment.NULL.equals(param0)) {
                throw new IllegalArgumentException("MemorySegment argument <param0> cannot be NULL");
            }
            if (MemorySegment.NULL.equals(param1)) {
                throw new IllegalArgumentException("MemorySegment argument <param1> cannot be NULL");
            }
        }
        invokePPV(param0.address(), param1.address(), param2, FUNCTION_NOOP.address());
    }

    @Benchmark
    public void b01_noop_ffm() {
        try {
            NOOP.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b01_noop_ffm_crit() {
        try {
            NOOP_CRIT.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b11_noop_params_ffm() {
        try {
            NOOP_PARAMS.invokeExact(param0, param1, param2);
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b11_noop_params_ffm_crit() {
        try {
            NOOP_PARAMS_CRIT.invokeExact(param0, param1, param2);
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b21_noop_params_checked_ffm() {
        if (CHECKS) {
            if (MemorySegment.NULL.equals(param0)) {
                throw new IllegalArgumentException("MemorySegment argument <param0> cannot be NULL");
            }
            if (MemorySegment.NULL.equals(param1)) {
                throw new IllegalArgumentException("MemorySegment argument <param1> cannot be NULL");
            }
        }
        try {
            NOOP_PARAMS.invokeExact(param0, param1, param2);
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b21_noop_params_checked_ffm_crit() {
        if (CHECKS) {
            if (MemorySegment.NULL.equals(param0)) {
                throw new IllegalArgumentException("MemorySegment argument <param0> cannot be NULL");
            }
            if (MemorySegment.NULL.equals(param1)) {
                throw new IllegalArgumentException("MemorySegment argument <param1> cannot be NULL");
            }
        }
        try {
            NOOP_PARAMS_CRIT.invokeExact(param0, param1, param2);
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }

    @Benchmark
    public void b02_noop_gen() {
        BINDINGS.noop();
    }

    @Benchmark
    public void b02_noop_gen_crit() {
        BINDINGS.noop_crit();
    }

    @Benchmark
    public void b12_noop_params_gen() {
        BINDINGS.noop_params(param0, param1, param2);
    }

    @Benchmark
    public void b12_noop_params_gen_crit() {
        BINDINGS.noop_params_crit(param0, param1, param2);
    }

    @Benchmark
    public void b22_noop_params_checked_gen() {
        BINDINGS.noop_params_checked(param0, param1, param2);
    }

    @Benchmark
    public void b22_noop_params_checked_gen_crit() {
        BINDINGS.noop_params_crit_checked(param0, param1, param2);
    }

}