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
import static org.lwjgl.util.meow.MeowC.*;
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
            MeowHash ref  = MeowHash.malloc(stack);
            MeowHash hash = MeowHash.malloc(stack);

            // BATCH

            long st = Long.MAX_VALUE;
            for (int r = 0; r < RUNS; r++) {
                long t = System.nanoTime();

                MeowHash_Accelerated(SEED, buffer, ref);

                st = min(System.nanoTime() - t, st);
                System.out.format("%d bytes/ns, %d GB/s\n", buffer.capacity() / st, (buffer.capacity() * 1_000_000_000L / st) / (1024 * 1024 * 1024));
            }

            assertEquals(ref.u64(0), MeowU64From(ref));
            assertEquals(ref.u32(0), MeowU32From(ref));

            MeowHash_C(SEED, buffer, hash);
            checkEqual(ref, hash);

            // STREAMING

            long at    = memAddress(buffer);
            int  count = buffer.remaining();

            MeowHashState state = MeowHashState.malloc(stack);
            MeowHashBegin(state);
            while (0 < count) {
                int amount = rand.nextInt(0, Integer.MAX_VALUE) % (8192 + 1);
                if (count < amount) {
                    amount = count;
                }

                nMeowHashAbsorb(state.address(), amount, at);

                at += amount;
                count -= amount;
            }
            MeowHashEnd(state, SEED, hash);
            checkEqual(ref, hash);
        }

        memAlignedFree(buffer);
    }

    private static void checkEqual(MeowHash ref, MeowHash hash) {
        assertTrue(MeowHashesAreEqual(hash, ref));
        for (int i = 0; i < 2; i++) {
            assertEquals(hash.u64(i), ref.u64(i));
        }
        for (int i = 0; i < 4; i++) {
            assertEquals(hash.u32(i), ref.u32(i));
        }
    }

}