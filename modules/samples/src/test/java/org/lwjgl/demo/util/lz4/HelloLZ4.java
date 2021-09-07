/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.lz4;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.lz4.*;

import java.io.*;
import java.nio.*;
import java.util.zip.*;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.lz4.LZ4.*;
import static org.lwjgl.util.lz4.LZ4Frame.*;
import static org.lwjgl.util.lz4.LZ4HC.*;

public class HelloLZ4 {

    private static final int BENCH_WARMUP = 16;
    private static final int BENCH_ITERS  = 128;

    public static void main(String[] args) {
        ByteBuffer uncompressed;
        try {
            String filePath;
            if (args.length == 0) {
                System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.util.zstd.HelloLZ4 -Dargs=<path>' to test a different file.\n");
                filePath = "demo/FiraSans.ttf";
            } else {
                filePath = args[0];
            }

            uncompressed = ioResourceToByteBuffer(filePath, 512 * 1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] uncompressedArray = new byte[uncompressed.remaining()];
        uncompressed.get(uncompressedArray);
        uncompressed.clear();

        for (int i = 0; i < 128000; i++) {
            System.nanoTime();
        }

        ByteBuffer compressed   = memAlloc(LZ4_compressBound(uncompressed.remaining()));
        ByteBuffer compressedHC = memAlloc(compressed.capacity());

        long compressedSize = LZ4_compress_default(uncompressed, compressed);
        compressed.limit((int)compressedSize);
        compressed = compressed.slice();

        compressedSize = LZ4_compress_HC(uncompressed, compressedHC, LZ4HC_CLEVEL_DEFAULT);
        compressedHC.limit((int)compressedSize);
        compressedHC = compressedHC.slice();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GZIPOutputStream dos = new GZIPOutputStream(baos)) {
            dos.write(uncompressedArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] compressedArray = baos.toByteArray();

        System.out.format("Using LZ4 %s\n\n", LZ4_versionString());

        System.out.format("Uncompressed size: %d bytes\n", uncompressed.remaining());
        System.out.println("COMPRESSION RATIO:");
        System.out.format("\tLZ4     : %f (%d bytes)\n", (uncompressed.remaining() / (float)compressed.remaining()), compressed.remaining());
        System.out.format("\tLZ4(HC) : %f (%d bytes)\n", (uncompressed.remaining() / (float)compressedHC.remaining()), compressedHC.remaining());
        System.out.format("\tGZip    : %f (%d bytes)\n", (uncompressedArray.length / (float)compressedArray.length), compressedArray.length);

        long time = benchLZ4Compression(uncompressed);
        System.out.format("\nCompression   LZ4(simple): %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchLZ4CompressionAdvanced(uncompressed);
        System.out.format("Compression LZ4(advanced): %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchLZ4HCCompression(uncompressed);
        System.out.format("Compression       LZ4(HC): %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchGZIPCompression(uncompressedArray);
        System.out.format("Compression          GZip: %d MB/s (%d us/file)\n", getThroughput(uncompressedArray.length, time), time / 1_000);

        time = benchLZ4Decompression(compressed, uncompressed);
        System.out.format("\nDecompression LZ4: %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchGZIPDecompression(compressedArray, uncompressedArray);
        System.out.format("Decompression Gzip: %d MB/s (%d us/file)\n", getThroughput(uncompressedArray.length, time), time / 1_000);

        memFree(compressedHC);
        memFree(compressed);
    }

    private static int getThroughput(long size, long time) {
        return (int)Math.round(size * 1_000_000_000L / 1024L / 1024L / (double)time);
    }

    private static long checkLZ4F(long errorCode) {
        if (LZ4F_isError(errorCode)) {
            throw new IllegalStateException("LZ4 error: " + errorCode + " | " + LZ4F_getErrorName(errorCode));
        }
        return errorCode;
    }

    private static void verifyDecompressed(ByteBuffer uncompressed, ByteBuffer compressed) {
        ByteBuffer decompressed = memAlloc(uncompressed.remaining() + 1024);

        try {
            long decompressedSize = LZ4_decompress_safe(compressed, decompressed);

            if (decompressedSize != uncompressed.remaining()) {
                throw new IllegalStateException(String.format("Decompressed size %d != uncompressed size %d", decompressedSize, uncompressed.remaining()));
            }

            for (int i = 0; i < uncompressed.remaining(); i++) {
                if (decompressed.get(i) != uncompressed.get(i)) {
                    throw new IllegalStateException("Decompressed != uncompressed at: " + i);
                }
            }
        } finally {
            memFree(decompressed);
        }
    }

    // -----------------------------
    //          COMPRESSION
    // -----------------------------

    // LZ4 Simple API

    private static long benchLZ4Compression(ByteBuffer uncompressed) {
        ByteBuffer compressed = memAlloc(LZ4_compressBound(uncompressed.remaining()));
        try {
            // warmup
            long compressedSize = benchLZ4Compression(uncompressed, compressed, BENCH_WARMUP);

            compressed.limit((int)compressedSize);
            verifyDecompressed(uncompressed, compressed.slice());
            compressed.limit(compressed.capacity());

            long t = System.nanoTime();
            benchLZ4Compression(uncompressed, compressed, BENCH_ITERS);
            t = System.nanoTime() - t;

            return t / BENCH_ITERS;
        } finally {
            memFree(compressed);
        }
    }

    private static long benchLZ4Compression(ByteBuffer uncompressed, ByteBuffer compressed, int iterations) {
        long size = 0L;
        for (int i = 0; i < iterations; i++) {
            size |= LZ4_compress_default(uncompressed, compressed);
        }
        return size;
    }

    // LZ4 Advanced API

    private static long benchLZ4CompressionAdvanced(ByteBuffer uncompressed) {
        ByteBuffer compressed = memAlloc(LZ4_compressBound(uncompressed.remaining()));
        try {
            // warmup
            long compressedSize = benchLZ4CompressionAdvanced(uncompressed, compressed, BENCH_WARMUP);

            compressed.limit((int)compressedSize);
            //verifyDecompressed(uncompressed, compressed);
            compressed.limit(compressed.capacity());

            long t = System.nanoTime();
            benchLZ4CompressionAdvanced(uncompressed, compressed, BENCH_ITERS);
            t = System.nanoTime() - t;

            return t / BENCH_ITERS;
        } finally {
            memFree(compressed);
        }
    }

    private static ByteBuffer slice(ByteBuffer compressed, int offset) {
        return memSlice(compressed, offset, compressed.limit() - offset);
    }

    private static long benchLZ4CompressionAdvanced(ByteBuffer uncompressed, ByteBuffer compressed, int iterations) {
        int size = 0;

        long cctx = NULL;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            checkLZ4F(LZ4F_createCompressionContext(pp, LZ4F_VERSION));

            cctx = pp.get(0);
            for (int i = 0; i < iterations; i++) {
                size = (int)checkLZ4F(LZ4F_compressBegin(cctx, compressed, LZ4FPreferences.calloc(stack)
                    .frameInfo(LZ4FFrameInfo.calloc(stack)
                        .blockChecksumFlag(LZ4F_blockChecksumEnabled)
                        .contentChecksumFlag(LZ4F_contentChecksumEnabled)
                        .contentSize(uncompressed.remaining())
                    )));
                size += checkLZ4F(LZ4F_compressUpdate(cctx, slice(compressed, size), uncompressed, null));
                size += checkLZ4F(LZ4F_compressEnd(cctx, slice(compressed, size), null));
            }
        } finally {
            if (cctx != NULL) {
                checkLZ4F(LZ4F_freeCompressionContext(cctx));
            }
        }

        return size;
    }

    // LZ4HC

    private static long benchLZ4HCCompression(ByteBuffer uncompressed) {
        ByteBuffer compressed = memAlloc(LZ4_compressBound(uncompressed.remaining()));
        try {
            // warmup
            long compressedSize = benchLZ4HCCompression(uncompressed, compressed, BENCH_WARMUP);

            compressed.limit((int)compressedSize);
            verifyDecompressed(uncompressed, compressed.slice());
            compressed.limit(compressed.capacity());

            long t = System.nanoTime();
            benchLZ4HCCompression(uncompressed, compressed, BENCH_ITERS);
            t = System.nanoTime() - t;

            return t / BENCH_ITERS;
        } finally {
            memFree(compressed);
        }
    }

    private static long benchLZ4HCCompression(ByteBuffer uncompressed, ByteBuffer compressed, int iterations) {
        long size = 0L;
        for (int i = 0; i < iterations; i++) {
            size |= LZ4_compress_HC(uncompressed, compressed, LZ4HC_CLEVEL_DEFAULT);
        }
        return size;
    }

    // GZIP

    private static long benchGZIPCompression(byte[] uncompressed) {
        ByteArrayOutputStream compressed = new ByteArrayOutputStream();

        // warmup
        benchGZIPCompression(uncompressed, compressed, BENCH_WARMUP);

        long t = System.nanoTime();
        benchGZIPCompression(uncompressed, compressed, BENCH_ITERS);
        t = System.nanoTime() - t;

        return t / BENCH_ITERS;
    }

    private static void benchGZIPCompression(byte[] uncompressed, ByteArrayOutputStream compressed, int iterations) {
        for (int i = 0; i < iterations; i++) {
            try (GZIPOutputStream dos = new GZIPOutputStream(compressed)) {
                dos.write(uncompressed);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                compressed.reset();
            }
        }
    }

    // -----------------------------
    //         DECOMPRESSION
    // -----------------------------

    // LZ4

    private static long benchLZ4Decompression(ByteBuffer compressed, ByteBuffer decompressed) {
        // warmup
        benchLZ4Decompression(compressed, decompressed, BENCH_WARMUP);

        long t = System.nanoTime();
        benchLZ4Decompression(compressed, decompressed, BENCH_ITERS);
        t = System.nanoTime() - t;

        return t / BENCH_ITERS;
    }

    private static void benchLZ4Decompression(ByteBuffer compressed, ByteBuffer decompressed, int iterations) {
        //long dctx = LZ4_createDCtx();
        try {
            for (int i = 0; i < iterations; i++) {
                checkLZ4F(LZ4_decompress_safe(compressed, decompressed));
            }
        } finally {
            //checkLZ4(LZ4_freeDCtx(dctx));
        }
    }

    // GZIP

    private static long benchGZIPDecompression(byte[] compressed, byte[] decompressed) {
        // warmup
        benchGZIPDecompression(compressed, decompressed, BENCH_WARMUP);

        long t = System.nanoTime();
        benchGZIPDecompression(compressed, decompressed, BENCH_ITERS);
        t = System.nanoTime() - t;

        return t / BENCH_ITERS;
    }

    private static void benchGZIPDecompression(byte[] compressed, byte[] decompressed, int iterations) {
        ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
        for (int i = 0; i < iterations; i++) {
            try (GZIPInputStream dis = new GZIPInputStream(bais)) {
                int bytes = 0;
                do {
                    bytes += dis.read(decompressed, bytes, decompressed.length - bytes);
                } while (bytes < decompressed.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                bais.reset();
            }
        }
    }
}