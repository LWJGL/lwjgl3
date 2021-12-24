/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.linux.liburing;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCErrno.*;
import static org.lwjgl.system.libc.LibCString.*;
import static org.lwjgl.system.linux.FCNTL.*;
import static org.lwjgl.system.linux.UNISTD.*;

final class BenchBase {
    static final int WARMUP_ITERS = 100;
    static final int BENCH_ITERS  = 1000;

    static final int BLOCK_SIZE = 1024 * 64;

    static final int QUEUE_DEPTH = 16;

    static int REFERENCE_HASHCODE;

    static void benchInit(String filePath, int fileLength) {
        byte[] data = new byte[fileLength];
        benchIOInner(filePath, data);
        REFERENCE_HASHCODE = Arrays.hashCode(data);

        for (int i = 0; i < 100_000; i++) {
            System.nanoTime();
        }
    }

    static void benchIO(String filePath, int fileLength) {
        byte[] data = new byte[fileLength];

        benchIOInner(filePath, data);
        if (Arrays.hashCode(data) != REFERENCE_HASHCODE) {
            throw new IllegalStateException();
        }

        for (int i = 0; i < WARMUP_ITERS; i++) {
            benchIOInner(filePath, data);
        }

        long t = System.nanoTime();
        for (int i = 0; i < BENCH_ITERS; i++) {
            benchIOInner(filePath, data);
        }
        t = System.nanoTime() - t;
        System.out.println("java.io:\n\t" + (t / BENCH_ITERS));
    }

    private static void benchIOInner(String filePath, byte[] data) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath), BLOCK_SIZE)) {
            int b;
            int offset = 0;
            while ((b = bis.read(data, offset, data.length - offset)) != -1) {
                offset += b;
                if (offset == data.length) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void benchNIO(String filePath, int fileLength) {
        ByteBuffer buffer = memAlloc(fileLength);

        benchNIOInner(filePath, buffer);
        if (benchHashCode(buffer) != REFERENCE_HASHCODE) {
            throw new IllegalStateException();
        }

        for (int i = 0; i < WARMUP_ITERS; i++) {
            benchNIOInner(filePath, buffer);
        }

        long t = System.nanoTime();
        for (int i = 0; i < BENCH_ITERS; i++) {
            benchNIOInner(filePath, buffer);
        }
        t = System.nanoTime() - t;
        System.out.println("java.nio:\n\t" + (t / BENCH_ITERS));

        memFree(buffer);
    }

    private static int benchNIOInner(String filePath, ByteBuffer buffer) {
        int sum = 0;
        try (FileChannel fc = FileChannel.open(Paths.get(filePath), StandardOpenOption.READ)) {
            while (fc.read(buffer) != -1) {
                if (buffer.remaining() == 0) {
                    buffer.clear();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sum;
    }

    static void benchFRAB(String filePath) {
        if (Arrays.hashCode(benchFRABInner(filePath)) != REFERENCE_HASHCODE) {
            throw new IllegalStateException();
        }

        for (int i = 0; i < WARMUP_ITERS; i++) {
            benchFRABInner(filePath);
        }

        long t = System.nanoTime();
        for (int i = 0; i < BENCH_ITERS; i++) {
            benchFRABInner(filePath);
        }
        t = System.nanoTime() - t;
        System.err.println("Files.readAllBytes:\n\t" + (t / BENCH_ITERS));
    }

    private static byte[] benchFRABInner(String filePath) {
        try {
            return Files.readAllBytes(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void benchLibC(String filePath, int fileLength) {
        ByteBuffer buffer = memAlloc(fileLength);

        benchLibCInner(filePath, buffer);
        if (benchHashCode(buffer) != REFERENCE_HASHCODE) {
            throw new IllegalStateException();
        }

        for (int i = 0; i < WARMUP_ITERS; i++) {
            benchLibCInner(filePath, buffer);
        }

        long t = System.nanoTime();
        for (int i = 0; i < BENCH_ITERS; i++) {
            benchLibCInner(filePath, buffer);
        }
        t = System.nanoTime() - t;
        System.out.println("libc:\n\t" + (t / BENCH_ITERS));

        memFree(buffer);
    }

    private static void benchLibCInner(String filePath, ByteBuffer buffer) {
        int fileFD = open(filePath, O_RDONLY, 0);
        if (fileFD < 0) {
            throw new IllegalStateException("Failed to open file: " + strerror(getErrno()));
        }

        long b;
        while (0 < (b = read(fileFD, buffer))) {
            buffer.position(buffer.position() + (int)b);
        }

        if (b == -1) {
            throw new IllegalStateException("Failed to read file: " + strerror(getErrno()));
        }

        buffer.clear();

        if (close(fileFD) != 0) {
            System.err.println("Failed to close file fd: " + strerror(getErrno()));
        }
    }

    static int benchHashCode(ByteBuffer buffer) {
        int hash = 1;
        for (int i = buffer.position(); i < buffer.limit(); i++) {
            hash = 31 * hash + buffer.get(i);
        }
        return hash;
    }
}
