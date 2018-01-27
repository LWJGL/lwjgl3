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

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCStdlib.*;
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
                    rpmalloc_thread_finalize();
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
            AtomicInteger allocations = new AtomicInteger();

            RPMallocConfig config = RPMallocConfig.callocStack(stack)
                .memory_map(size -> {
                    long m = naligned_alloc(64 * 1024, size);
                    if (m != NULL) {
                        allocations.incrementAndGet();
                    }
                    return m;
                })
                .memory_unmap((address, size) -> {
                    naligned_free(address);
                    if (address != NULL) {
                        allocations.decrementAndGet();
                    }
                });

            try {
                rpmalloc_initialize_config(config);

                ByteBuffer b = rpmalloc(8);
                assertNotEquals(allocations.get(), 0);
                rpfree(b);

                rpmalloc_finalize();
                assertEquals(allocations.get(), 0);
            } finally {
                Objects.requireNonNull(config.memory_unmap()).free();
                Objects.requireNonNull(config.memory_map()).free();
            }
        }
    }

}
