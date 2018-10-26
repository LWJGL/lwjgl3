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

        // 1GB: memory bandwidth bound
        // 8MB (L3 cache size): best-case MT speed-up
        ByteBuffer buffer = memAlignedAlloc(MEOW_HASH_ALIGNMENT >> 3, 8 * 1024 * 1024);

        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < buffer.limit() >> 3; i++) {
            buffer.putLong(i << 3, rand.nextLong());
        }

        try (MemoryStack frame0 = stackPush()) {
            MeowHash ref = MeowHash.mallocStack(frame0);

            // SINGLE-THREADED

            long st = Long.MAX_VALUE;
            for (int r = 0; r < RUNS; r++) {
                long t = System.nanoTime();

                MeowHash1(SEED, buffer, ref);

                st = min(System.nanoTime() - t, st);
                System.out.format("ST: %d bytes/ns, %d GB/s\n", buffer.capacity() / st, (buffer.capacity() * 1_000_000_000L / st) / (1024 * 1024 * 1024));
            }

            // MULTI-THREADED

            MeowSourceBlocks blocks = MeowSourceBlocksFor(buffer, MeowSourceBlocks.malloc());

            int blockCount = (int)blocks.MacroblockCount();

            MeowMacroblockResult.Buffer results = MeowMacroblockResult.create(
                nmemAlignedAlloc(MeowMacroblockResult.ALIGNOF, blockCount * MeowMacroblockResult.SIZEOF),
                blockCount
            );

            long mt = Long.MAX_VALUE;
            for (int r = 0; r < RUNS; r++) {
                try (MemoryStack frame1 = stackPush()) {
                    long t = System.nanoTime();

                    for (int i = 0; i < blockCount; i++) {
                        int index = i;
                        ForkJoinPool
                            .commonPool()
                            .submit(() -> {
                                try (MemoryStack stack = stackPush()) {
                                    MeowMacroblock block = MeowGetMacroblock(blocks, index, MeowMacroblock.mallocStack(stack));

                                    MeowHash1Op(
                                        block.BlockCount(),
                                        block.Source(),
                                        results.get(index)
                                    );
                                }
                            });
                    }
                    ForkJoinPool
                        .commonPool()
                        .awaitQuiescence(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

                    MeowHash hash = MeowHashFinish(
                        MeowHashMergeArray(results, results.get(0)),
                        SEED,
                        blocks.TotalLengthInBytes(),
                        blocks.Overhang(),
                        blocks.OverhangStart(),
                        MeowHash.mallocStack(frame1)
                    );

                    mt = min(System.nanoTime() - t, mt);
                    System.out.format("MT: %d bytes/ns, %d GB/s, %.2fx faster\n", buffer.capacity() / mt, (buffer.capacity() * 1_000_000_000L / mt) / (1024 * 1024 * 1024), (st / (float)mt));

                    assertTrue(MeowHashesAreEqual(hash, ref));
                }
            }

            nmemAlignedFree(results.address());
            blocks.free();

            memAlignedFree(buffer);
        }
    }

}