/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.remotery;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.infra.*;

import java.util.*;
import java.util.concurrent.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.remotery.Remotery.*;

/** This sample was ported to Java/LWJGL from {@code sample/sample.c} in the Remotery repository. */
public class Sample {

    private static void aggregateFunction() {
        rmt_BeginCPUSample("aggregate", RMTSF_Aggregate, null);

        Blackhole.consumeCPU(1_000);

        rmt_EndCPUSample();
    }

    private static void recursiveFunction(int depth) {
        rmt_BeginCPUSample("recursive", RMTSF_Recursive, null);

        Blackhole.consumeCPU(1_000);
        if (depth + 1 < 100) {
            recursiveFunction(depth + 1);
        }

        rmt_EndCPUSample();
    }

    private static void root(long tokens) {
        rmt_BeginCPUSample("root", RMTSF_Root, null);

        Blackhole.consumeCPU(tokens);
        recursiveFunction(0);
        for (int i = 0; i < 100; i++) {
            aggregateFunction();
        }

        rmt_EndCPUSample();
    }

    public static void main(String[] args) {
        CountDownLatch shutdownSignal = new CountDownLatch(1);
        CountDownLatch cleanupSignal  = new CountDownLatch(1);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            shutdownSignal.countDown();
            try {
                cleanupSignal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        Objects.requireNonNull(rmt_Settings())
            .reuse_open_port(true);

        long rmt = NULL;
        try {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);

                int error = rmt_CreateGlobalInstance(pp);
                if (RMT_ERROR_NONE != error) {
                    throw new IllegalStateException("Error launching Remotery [" + error + "]: " + rmt_GetLastErrorMessage());
                }

                rmt = pp.get(0);
            }

            rmt_SetCurrentThreadName("Sample - Main Thread");

            while (shutdownSignal.getCount() != 0) {
                long tokens = ThreadLocalRandom.current().nextLong(10_000L, 100_000L);

                rmt_LogText("root begin - " + tokens);
                root(tokens);
                rmt_LogText("root end");
            }
        } finally {
            if (rmt != NULL) {
                rmt_DestroyGlobalInstance(rmt);
            }

            System.out.println("Cleaned up and quit");

            cleanupSignal.countDown();
        }
    }

}
