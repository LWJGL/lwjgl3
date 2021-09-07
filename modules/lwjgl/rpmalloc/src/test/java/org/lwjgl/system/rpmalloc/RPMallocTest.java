/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.rpmalloc.RPmalloc.*;
import static org.testng.Assert.*;

@Test
public class RPMallocTest {

    public void testInit() {
        rpmalloc_initialize();

        rpfree(rpmalloc(8));

        rpmalloc_finalize();
    }

    public void testInitThread() {
        rpmalloc_initialize();

        Thread[]      threads = new Thread[8];
        CyclicBarrier barrier = new CyclicBarrier(threads.length);

        for (int i = 0; i < threads.length; i++) {
            Thread t = threads[i] = new Thread(() -> {
                try {
                    barrier.await();
                } catch (Exception ignored) {
                }

                for (int j = 0; j < 100; j++) {
                    rpmalloc_thread_initialize();
                    rpfree(rpmalloc(8));
                    rpmalloc_thread_finalize(true);
                }
            });
            t.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join(0);
            } catch (InterruptedException ignored) {
            }
        }

        rpmalloc_finalize();
    }

    public void testInitConfig() {
        try (MemoryStack stack = stackPush()) {
            AtomicInteger memoryMappings = new AtomicInteger();

            rpmalloc_initialize();

            // get default configuration
            RPMallocConfig config = RPMallocConfig.malloc(stack);
            config.set(rpmalloc_config());

            rpmalloc_finalize();

            // get OS memory mapping functions (the custom callbacks below delegate to these)
            long memoryMapCB   = memGetAddress(config.address() + RPMallocConfig.MEMORY_MAP);
            long memoryUnmapCB = memGetAddress(config.address() + RPMallocConfig.MEMORY_UNMAP);

            config
                .memory_map((size, offset) -> {
                    long m = invokePPP(size, offset, memoryMapCB);
                    assertNotEquals(m, NULL);
                    memoryMappings.incrementAndGet();
                    return m;
                })
                .memory_unmap((address, size, offset, release) -> {
                    invokePPPV(address, size, offset, release ? 1 : 0, memoryUnmapCB);
                    if (release) {
                        memoryMappings.decrementAndGet();
                    }
                });

            try {
                rpmalloc_initialize_config(config);

                ByteBuffer b = rpmalloc(8);
                assertNotNull(b);
                assertNotEquals(memoryMappings.get(), 0);
                rpfree(b);

                rpmalloc_finalize();
                assertEquals(memoryMappings.get(), 0);
            } finally {
                Objects.requireNonNull(config.memory_unmap()).free();
                Objects.requireNonNull(config.memory_map()).free();
            }
        }
    }

}
