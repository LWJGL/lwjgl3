/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.zstd;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.zip.*;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.zstd.Zstd.*;
import static org.lwjgl.util.zstd.ZstdX.*;

public final class HelloZstd {

    private static final int BENCH_WARMUP = 4;
    private static final int BENCH_ITERS  = 32;

    private HelloZstd() {
    }

    public static void main(String[] args) {
        ByteBuffer uncompressed;
        try {
            String filePath;
            if (args.length == 0) {
                System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.util.zstd.HelloZstd -Dargs=<path>' to test a different file.");
                filePath = "demo/FiraSans.ttf";
            } else {
                filePath = args[0];
            }

            System.out.println("Test file: " + filePath + "\n");
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

        int compressionLevelZSTD = ZSTD_CLEVEL_DEFAULT;

        ByteBuffer compressed     = memAlloc((int)ZSTD_COMPRESSBOUND(uncompressed.remaining()));
        long       compressedSize = ZSTD_compress(compressed, uncompressed, compressionLevelZSTD);
        compressed.limit((int)compressedSize);
        compressed = compressed.slice();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GZIPOutputStream dos = new GZIPOutputStream(baos)) {
            dos.write(uncompressedArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] compressedArray = baos.toByteArray();

        System.out.format("Using Zstandard %s\n\n", ZSTD_versionString());

        System.out.format("Uncompressed size: %d bytes\n", uncompressed.remaining());
        System.out.println("COMPRESSION RATIO:");
        System.out.format("\tZstd: %f (%d bytes)\n", (uncompressed.remaining() / (float)compressed.remaining()), compressed.remaining());
        System.out.format("\tGZip: %f (%d bytes)\n", (uncompressedArray.length / (float)compressedArray.length), compressedArray.length);

        long time = benchZSTDCompression(uncompressed, compressionLevelZSTD);
        System.out.format("\nCompression Zstd(ST): %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchZSTDCompressionAdvanced(uncompressed, compressionLevelZSTD);
        System.out.format("Compression Zstd(MT): %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchGZIPCompression(uncompressedArray);
        System.out.format("Compression GZip(ST): %d MB/s (%d us/file)\n", getThroughput(uncompressedArray.length, time), time / 1_000);

        time = benchZSTDDecompression(compressed, uncompressed);
        System.out.format("\nDecompression Zstd: %d MB/s (%d us/file)\n", getThroughput(uncompressed.remaining(), time), time / 1_000);

        time = benchGZIPDecompression(compressedArray, uncompressedArray);
        System.out.format("Decompression Gzip: %d MB/s (%d us/file)\n", getThroughput(uncompressedArray.length, time), time / 1_000);

        memFree(compressed);
    }

    private static int getThroughput(long size, long time) {
        return (int)Math.round(size * 1_000_000_000L / 1024L / 1024L / (double)time);
    }

    private static long checkZSTD(long errorCode) {
        if (ZSTD_isError(errorCode)) {
            throw new IllegalStateException("Zstd error: " + errorCode + " | " + ZSTD_getErrorName(errorCode));
        }
        return errorCode;
    }

    private static void verifyDecompressed(ByteBuffer uncompressed, ByteBuffer compressed) {
        ByteBuffer decompressed = memAlloc(uncompressed.remaining() + 1024);

        try {
            checkZSTD(ZSTD_findDecompressedSize(compressed));

            long decompressedSize = ZSTD_decompress(decompressed, compressed);
            checkZSTD(decompressedSize);

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

    // ZSTD Simple API

    private static long benchZSTDCompression(ByteBuffer uncompressed, int cLevel) {
        ByteBuffer compressed = memAlloc((int)ZSTD_COMPRESSBOUND(uncompressed.remaining()));
        try {
            // warmup
            long compressedSize = benchZSTDCompression(uncompressed, compressed, cLevel, BENCH_WARMUP);

            compressed.limit((int)compressedSize);
            verifyDecompressed(uncompressed, compressed.slice());
            compressed.limit(compressed.capacity());

            long t = System.nanoTime();
            benchZSTDCompression(uncompressed, compressed, cLevel, BENCH_ITERS);
            t = System.nanoTime() - t;

            return t / BENCH_ITERS;
        } finally {
            memFree(compressed);
        }
    }

    private static long benchZSTDCompression(ByteBuffer uncompressed, ByteBuffer compressed, int cLevel, int iterations) {
        long size = 0L;
        for (int i = 0; i < iterations; i++) {
            size |= checkZSTD(ZSTD_compress(compressed, uncompressed, cLevel));
        }
        return size;
    }

    // ZSTD Advanced API

    private static long benchZSTDCompressionAdvanced(ByteBuffer uncompressed, int cLevel) {
        ByteBuffer compressed = memAlloc((int)ZSTD_COMPRESSBOUND(uncompressed.remaining()));
        try {
            // warmup
            long compressedSize = benchZSTDCompressionAdvanced(uncompressed, compressed, cLevel, BENCH_WARMUP);

            compressed.limit((int)compressedSize);
            verifyDecompressed(uncompressed, compressed);
            compressed.limit(compressed.capacity());

            long t = System.nanoTime();
            benchZSTDCompressionAdvanced(uncompressed, compressed, cLevel, BENCH_ITERS);
            t = System.nanoTime() - t;

            return t / BENCH_ITERS;
        } finally {
            memFree(compressed);
        }
    }

    private static long benchZSTDCompressionAdvanced(ByteBuffer uncompressed, ByteBuffer compressed, int cLevel, int iterations) {
        long size = 0L;

        long cctx = ZSTD_createCCtx();
        try (MemoryStack stack = stackPush()) {
            checkZSTD(ZSTD_CCtx_setParameter(cctx, ZSTD_c_compressionLevel, cLevel));
            //checkZSTD(ZSTD_CCtx_setParameter(cctx, ZSTD_c_strategy, ZSTD_dfast));
            checkZSTD(ZSTD_CCtx_setParameter(cctx, ZSTD_c_nbWorkers, Math.min(Runtime.getRuntime().availableProcessors(), 8)));
            checkZSTD(ZSTD_CCtx_setParameter(cctx, ZSTD_c_windowLog, 14)); // the default window is tuned for large files

            PointerBuffer dstPos = stack.callocPointer(1);
            PointerBuffer srcPos = stack.callocPointer(1);

            for (int i = 0; i < iterations; i++) {
                ZSTD_CCtx_setPledgedSrcSize(cctx, uncompressed.remaining());
                checkZSTD(ZSTD_compressStream2_simpleArgs(cctx, compressed, dstPos, uncompressed, srcPos, ZSTD_e_end));
                size |= dstPos.get(0);
                dstPos.put(0, 0L);
                srcPos.put(0, 0L);
            }
        } finally {
            checkZSTD(ZSTD_freeCCtx(cctx));
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

    // ZSTD

    private static long benchZSTDDecompression(ByteBuffer compressed, ByteBuffer decompressed) {
        // warmup
        benchZSTDDecompression(compressed, decompressed, BENCH_WARMUP);

        long t = System.nanoTime();
        benchZSTDDecompression(compressed, decompressed, BENCH_ITERS);
        t = System.nanoTime() - t;

        return t / BENCH_ITERS;
    }

    private static void benchZSTDDecompression(ByteBuffer compressed, ByteBuffer decompressed, int iterations) {
        long dctx = ZSTD_createDCtx();
        try {
            for (int i = 0; i < iterations; i++) {
                checkZSTD(ZSTD_decompressDCtx(dctx, decompressed, compressed));
            }
        } finally {
            checkZSTD(ZSTD_freeDCtx(dctx));
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