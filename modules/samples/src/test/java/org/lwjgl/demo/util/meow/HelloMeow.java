/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.meow;

import org.lwjgl.system.*;
import org.lwjgl.util.meow.*;

import java.nio.*;
import java.util.concurrent.*;

import static java.lang.Math.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.meow.Meow.*;
import static org.testng.Assert.*;

public final class HelloMeow {

    private HelloMeow() {
    }

    public static void main(String[] args) {
        int SEED = 7;
        int RUNS = 100;

        ByteBuffer buffer = memAlignedAlloc(16, 8 * 1024 * 1024);

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < buffer.limit() >> 3; i++) {
            buffer.putLong(i << 3, rand.nextLong());
        }

        try (MemoryStack stack = stackPush()) {
            MeowU128 ref = MeowU128.mallocStack(stack);

            // BATCH

            long st = Long.MAX_VALUE;
            for (int r = 0; r < RUNS; r++) {
                long t = System.nanoTime();

                MeowHash1(SEED, buffer, ref);

                st = min(System.nanoTime() - t, st);
                System.out.format("%d bytes/ns, %d GB/s\n", buffer.capacity() / st, (buffer.capacity() * 1_000_000_000L / st) / (1024 * 1024 * 1024));
            }

            // STREAMING

            MeowHashState state = MeowHashState.mallocStack(stack);
            MeowHashBegin(state);

            long at    = memAddress(buffer);
            int  count = buffer.remaining();
            while (0 < count) {
                int amount = rand.nextInt(0, Integer.MAX_VALUE) % (8192 + 1);
                if (count < amount) {
                    amount = count;
                }

                nMeowHashAbsorb1(state.address(), amount, at);

                at += amount;
                count -= amount;
            }

            MeowU128 hash = MeowHashEnd(state, SEED, MeowU128.mallocStack(stack));

            assertTrue(MeowHashesAreEqual(hash, ref));
        }

        memAlignedFree(buffer);
    }

}