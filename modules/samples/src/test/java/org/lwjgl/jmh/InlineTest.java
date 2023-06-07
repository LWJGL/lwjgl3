/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.stb.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.*;

import static org.lwjgl.system.MemoryStack.*;

@State(Scope.Thread)
public class InlineTest {

    private MemoryStack stack;

    @Setup
    public void getStack() {
        stack = stackGet();
    }

    @Fork(jvmArgsAppend = {
//        "-XX:MaxInlineLevel=3",

//        "-XX:+UnlockDiagnosticVMOptions",
//        "-XX:+TraceClassLoading",
//        "-XX:+LogCompilation",
//        "-XX:+PrintAssembly",
//        "-XX:PrintAssemblyOptions=intel",
//        "-XX:LogFile=inline.log",

//        "-XX:-TieredCompilation",
//        "-XX:-UseCompressedOops",

//        "-XX:+UnlockExperimentalVMOptions",
//        "-XX:+EnableJVMCI",
//        "-XX:+UseJVMCICompiler",
    })
    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void escapeAnalysis(Blackhole bh) {
        // This benchmark examines the efficacy of Escape Analysis on simple loops over struct buffers.
        // All code paths that touch an object must be inlined for the object to be marked as not
        // escaping, which means that EA is highly sensitive to inlining decisions. LWJGL has been tuned
        // so that the following loops produce zero garbage on Hotspot, while using as little as possible
        // of the available MaxInlineLevel budget. Graal does a much better job, without workarounds.

        try (MemoryStack frame = stack.push()) {
            STBTTAlignedQuad.Buffer q = STBTTAlignedQuad.malloc(10, frame);
            for (STBTTAlignedQuad el : q) {
                bh.consume(el.address());
            }
        }

        /*try (MemoryStack frame = stack.push()) {
            STBTTAlignedQuad.Buffer q = STBTTAlignedQuad.malloc(10, frame);
            for (int i = 0; i < q.remaining(); i++) {
                bh.consume(q.get(i).address());
            }
        }*/

        /*try (MemoryStack frame = stack.push()) {
            STBTTAlignedQuad
                .malloc(10, frame)
                .forEach(it -> bh.consume(it.address()));
        }*/

        // This is tough for Hotspot, but Graal eliminates all allocations.
        /*try (MemoryStack frame = stack.push()) {
            STBTTAlignedQuad
                .malloc(10, frame)
                .stream()
                .forEach(it -> bh.consume(it.address()));
        }*/
    }

    //@Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    @Fork(jvmArgsAppend = {"-XX:MaxInlineLevel=9"})
    // GC with 9, no GC with 10. 9 is the default in Hotspot
    public int level0() {
        return level1().x;
    }

    private static Simple level1() { return level2(); }
    private static Simple level2() { return level3(); }
    private static Simple level3() { return level4(); }
    private static Simple level4() { return level5(); }
    private static Simple level5() { return level6(); }
    private static Simple level6() { return level7(); }
    private static Simple level7() { return level8(); }
    private static Simple level8() { return level9(); }
    private static Simple level9() { return new Simple(10); }

    private static class Simple {
        int x;

        Simple(int x) {
            this.x = x;
        }
    }

}
