/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.linux.liburing;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.linux.liburing.*;

import java.io.*;
import java.nio.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.system.linux.liburing.BenchBase.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCString.*;
import static org.lwjgl.system.linux.FCNTL.*;
import static org.lwjgl.system.linux.UNISTD.*;
import static org.lwjgl.system.linux.liburing.LibIOURing.*;
import static org.lwjgl.system.linux.liburing.LibURing.*;

/**
 * Compares Java I/O to io_uring using the high-level interface (liburing).
 *
 * <p>This sample simply reads a file repeatedly to a pre-allocated buffer. It is not representative of real workloads, nor does it do a good job of showcasing
 * liburing's advantages. However it does demonstrate a working liburing I/O loop with advanced features, like {@code IORING_REGISTER_BUFFERS},
 * {@code IORING_REGISTER_FILES} and {@code IOSQE_ASYNC}. It is also configured with {@code IORING_SETUP_SQPOLL} (submission queue polling from a kernel
 * thread, IRQ-driven completion), which means zero syscalls in the I/O loop.</p>
 */
public class HelloLibURing {

    public static void main(String[] args) throws IOException {
        String filePath = args.length == 0 ? "modules/lwjgl/vulkan/src/templates/kotlin/vulkan/templates/VK10.kt" : args[0];

        File f = new File(filePath);
        System.out.println("Reading: " + f.getAbsolutePath());
        if (args.length == 0) {
            System.out.println("\tUse 'ant demo -Dclass=org.lwjgl.demo.system.linux.liburing.HelloLibURing -Dargs=<path>' to cat a different file.");
        }

        int fileLength = (int)f.length();

        benchInit(filePath, fileLength);

        benchIO(filePath, fileLength);
        benchNIO(filePath, fileLength);
        benchFRAB(filePath);
        benchLibC(filePath, fileLength);
        benchLibURing(filePath, fileLength);
    }

    private static class LibURingContainer implements AutoCloseable {
        private final IOURing uring;

        int registeredFiles;

        LibURingContainer(MemoryStack stack) {
            uring = IOURing.malloc();

            try (MemoryStack frame = stack.push()) {
                IOURingParams params = IOURingParams.calloc(frame);
                params.flags(IORING_SETUP_CQSIZE | IORING_SETUP_SQPOLL);
                params.sq_thread_idle(1000);
                params.cq_entries(QUEUE_DEPTH);

                int init = io_uring_queue_init_params(QUEUE_DEPTH, uring, params);
                if (init != 0) {
                    throw new IllegalStateException("Failed io_uring_queue_init_params: " + strerror(-init));
                }

                /*System.out.println("io_uring features: (supported by current kernel)");
                System.out.println("------------------");
                printFeature(params, "IORING_FEAT_SINGLE_MMAP", IORING_FEAT_SINGLE_MMAP);
                printFeature(params, "IORING_FEAT_NODROP", IORING_FEAT_NODROP);
                printFeature(params, "IORING_FEAT_SUBMIT_STABLE", IORING_FEAT_SUBMIT_STABLE);
                printFeature(params, "IORING_FEAT_RW_CUR_POS", IORING_FEAT_RW_CUR_POS);
                printFeature(params, "IORING_FEAT_CUR_PERSONALITY", IORING_FEAT_CUR_PERSONALITY);
                printFeature(params, "IORING_FEAT_FAST_POLL", IORING_FEAT_FAST_POLL);
                printFeature(params, "IORING_FEAT_POLL_32BITS", IORING_FEAT_POLL_32BITS);
                printFeature(params, "IORING_FEAT_SQPOLL_NONFIXED", IORING_FEAT_SQPOLL_NONFIXED);
                printFeature(params, "IORING_FEAT_EXT_ARG", IORING_FEAT_EXT_ARG);
                printFeature(params, "IORING_FEAT_NATIVE_WORKERS", IORING_FEAT_NATIVE_WORKERS);
                printFeature(params, "IORING_FEAT_RSRC_TAGS", IORING_FEAT_RSRC_TAGS);
                System.out.println("------------------");*/
            }
        }

        private static void printFeature(IOURingParams params, String name, int featureBit) {
            System.out.println(name + ": " + ((params.features() & featureBit) != 0));
        }

        public void registerFile(int fileFD) {
            try (MemoryStack stack = stackPush()) {
                int errno;
                if (registeredFiles == 0) {
                    errno = io_uring_register_files(uring, stack.ints(fileFD));
                    registeredFiles = 1;
                } else {
                    errno = io_uring_register_files_update(uring, 0, stack.ints(fileFD));
                }
                if (errno < 0) {
                    throw new IllegalStateException("Failed to register file: " + strerror(-errno));
                }
            }
        }

        @Override
        public void close() {
            io_uring_queue_exit(uring);
            uring.free();
        }
    }

    private static void benchLibURing(String filePath, int fileLength) {
        ByteBuffer buffer = memAlignedAlloc(PAGE_SIZE, fileLength);

        try (
            MemoryStack stack = stackPush();
            LibURingContainer container = new LibURingContainer(stack)
        ) {
            IntBuffer errno = stack.mallocInt(1);

            try (MemoryStack frame = stack.push()) {
                IOVec.Buffer IOVECS = IOVec.malloc(1, frame);
                IOVECS.get(0)
                    .iov_base(buffer)
                    .iov_len(buffer.capacity());

                int register = io_uring_register_buffers(container.uring, IOVECS);
                if (register != 0) {
                    throw new IllegalStateException("Failed to register buffers: " + strerror(-register));
                }
            }

            benchLibURingInner(filePath, fileLength, container, errno, buffer);
            if (benchHashCode(buffer) != REFERENCE_HASHCODE) {
                throw new IllegalStateException();
            }

            for (int i = 0; i < WARMUP_ITERS; i++) {
                benchLibURingInner(filePath, fileLength, container, errno, buffer);
            }

            long t = System.nanoTime();
            for (int i = 0; i < BENCH_ITERS; i++) {
                benchLibURingInner(filePath, fileLength, container, errno, buffer);
            }
            t = System.nanoTime() - t;
            System.out.println("liburing:\n\t" + (t / BENCH_ITERS));

            int unregister = io_uring_unregister_buffers(container.uring);
            if (unregister != 0) {
                System.err.println("Failed to unregister buffers: " + strerror(-unregister));
            }
        } finally {
            memAlignedFree(buffer);
        }
    }

    private static void benchLibURingInner(String filePath, int fileLength, LibURingContainer container, IntBuffer errno, ByteBuffer buffer) {
        int fileFD = open(errno, filePath, O_RDONLY, 0);
        if (fileFD < 0) {
            throw new IllegalStateException("Failed to open file: " + errno.get(0));
        }
        container.registerFile(fileFD);

        int offset    = 0;
        int submitted = 0;
        while (true) {
            // submit
            {
                if (submitted == QUEUE_DEPTH) {
                    io_uring_sqring_wait(container.uring);
                }

                while (offset < fileLength && submitted < QUEUE_DEPTH) {
                    ByteBuffer block = memSlice(buffer, offset, min(fileLength - offset, BLOCK_SIZE));

                    IOURingSQE sqe = io_uring_get_sqe(container.uring);
                    if (sqe == null) {
                        break;
                    }

                    io_uring_prep_read_fixed(sqe, 0, block, offset, 0);
                    io_uring_sqe_set_flags(sqe, IOSQE_FIXED_FILE | IOSQE_ASYNC);
                    io_uring_sqe_set_data(sqe, memAddress(block));

                    int submit = io_uring_submit(container.uring);
                    if (submit < 1) {
                        throw new IllegalStateException("Failed io_uring_submit: " + strerror(-submit));
                    }

                    offset += block.limit();
                    submitted++;
                }

                if (submitted == 0) {
                    break;
                }
            }

            // reap
            {
                while (submitted != 0) {
                    IOURingCQE cqe;
                    try (MemoryStack stack = stackPush()) {
                        PointerBuffer pp = stack.mallocPointer(1);

                        int wait = io_uring_wait_cqe(container.uring, pp);
                        if (wait != 0) {
                            throw new IllegalStateException("Failed io_uring_wait_cqe: " + strerror(-wait));
                        }
                        cqe = IOURingCQE.create(pp.get(0));
                    }

                    int result = cqe.res(); // result of read(2) call
                    if (result < 0) {
                        throw new IllegalStateException("Submission failed: " + strerror(-result));
                    }

                    io_uring_cqe_seen(container.uring, cqe);

                    submitted--;
                }
            }
        }

        // TODO: why super slow?
        /*if (io_uring_unregister_files(container.uring) != 0) {
            throw new IllegalStateException("Failed to unregister file: " + strerror(getErrno()));
        }*/
        if (close(errno, fileFD) != 0) {
            System.err.println("Failed to close file fd: " + strerror(errno.get(0)));
        }
    }
}