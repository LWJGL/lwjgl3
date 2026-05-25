/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.*;
import org.openjdk.jmh.runner.*;
import org.openjdk.jmh.runner.options.*;

import java.util.*;
import java.util.concurrent.*;

public final class Bench {

    private Bench() {
    }

    // Run with:
    //     ant demo -Dclass=org.lwjgl.jmh.Bench -Dargs=<regex>
    public static void main(String[] args) throws RunnerException {
        if (args.length == 0) {
            throw new IllegalArgumentException("Please specify the benchmark include regex.");
        }

        ChainedOptionsBuilder builder = new OptionsBuilder()
            .include(args[0])
            .forks(1)
            //.addProfiler(WinPerfAsmProfiler.class)
            //.addProfiler(GCProfiler.class)
            .warmupIterations(3)
            .measurementIterations(2)
            .measurementTime(TimeValue.seconds(1))
            .warmupTime(TimeValue.seconds(1))
            .mode(Mode.AverageTime)
            .timeUnit(TimeUnit.NANOSECONDS)
            .detectJvmArgs();

        String jitwatch = System.getProperty("org.lwjgl.util.jitwatch");
        if (jitwatch != null) {
            List<String> jvmArgs = new ArrayList<>();

            jvmArgs.add("-XX:+UnlockDiagnosticVMOptions");
            jvmArgs.add("-XX:+LogCompilation");
            jvmArgs.add("-XX:CompileCommandFile=config/cli/CompileCommand.args");
            jvmArgs.add("-XX:PrintAssemblyOptions=intel");
            jvmArgs.add("-Xlog:class+load=info,jit+compilation=debug");
            //jvmArgs.add("-XX:-TieredCompilation");
            //jvmArgs.add("-XX:-UseCompressedOops");

            if (!"true".equalsIgnoreCase(jitwatch)) {
                jvmArgs.add("-XX:LogFile=" + jitwatch);
            }

            builder.jvmArgsPrepend(jvmArgs.toArray(new String[0]));
        } else {
            builder.jvmArgsPrepend("-XX:+UnlockDiagnosticVMOptions");
        }

        new Runner(builder.build()).run();
    }

    static sun.misc.Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        /*
        Different runtimes use different names for the Unsafe singleton,
        so we cannot use .getDeclaredField and we scan instead. For example:

        Oracle: theUnsafe
        PERC : m_unsafe_instance
        Android: THE_ONE
        */
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            field.setAccessible(true);
            try {
                return (sun.misc.Unsafe)field.get(null);
            } catch (IllegalAccessException e) {
                // ignore
            }
            break;
        }

        throw new UnsupportedOperationException();
    }

}