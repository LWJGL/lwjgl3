/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.*;
import org.openjdk.jmh.runner.*;
import org.openjdk.jmh.runner.options.*;

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

        Options opt = new OptionsBuilder()
            .include(args[0])
            .forks(1)
            //.addProfiler(WinPerfAsmProfiler.class)
            //.addProfiler(GCProfiler.class)
            .warmupIterations(2)
            .measurementIterations(3)
            .measurementTime(TimeValue.seconds(1))
            .warmupTime(TimeValue.seconds(1))
            .mode(Mode.AverageTime)
            .timeUnit(TimeUnit.NANOSECONDS)
            .jvmArgsPrepend("-server")
            .build();

        new Runner(opt).run();
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