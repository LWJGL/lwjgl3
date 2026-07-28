/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.rpmalloc;

import org.testng.annotations.*;

import java.util.concurrent.*;

import static org.lwjgl.system.rpmalloc.RPmalloc.*;

@Test
public class RPMallocTest {

    public void testInit() {
        rpmalloc_initialize(null);

        rpfree(rpmalloc(8));

        rpmalloc_finalize();
    }

    public void testInitThread() {
        rpmalloc_initialize(null);

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

}
