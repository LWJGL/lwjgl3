/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.linux.liburing;

import org.lwjgl.system.*;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.linux.liburing.*;
import sun.misc.*;

import java.io.*;
import java.lang.reflect.*;
import java.nio.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.system.linux.liburing.BenchBase.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libc.LibCErrno.*;
import static org.lwjgl.system.libc.LibCString.*;
import static org.lwjgl.system.linux.FCNTL.*;
import static org.lwjgl.system.linux.MMAN.*;
import static org.lwjgl.system.linux.UNISTD.*;
import static org.lwjgl.system.linux.liburing.LibIOURing.*;

/**
 * Compares Java I/O to io_uring using the low-level interface.
 *
 * <p>This sample simply reads a file repeatedly to a pre-allocated buffer. It is not representative of real workloads, nor does it do a good job of showcasing
 * io_uring's advantages. However it does demonstrate a working io_uring I/O loop with advanced features, like {@code IORING_REGISTER_BUFFERS},
 * {@code IORING_REGISTER_FILES} and {@code IOSQE_ASYNC}. It is also configured with {@code IORING_SETUP_SQPOLL} (submission queue polling from a kernel
 * thread, IRQ-driven completion), which means zero syscalls in the I/O loop.</p>
 *
 * <p>This implementation works correctly on x86 but may fail on other architectures because of Java 8 limitations. Users are advised to replace the Unsafe
 * fences/accesses below with Java 9+ VarHandle methods that match the appropriate atomicity/ordering semantics. Alternative, the high-level liburing
 * interface may be used, which handles memory ordering constraints internally (see {@link HelloLibURing}).</p>
 */
public class HelloLibIOURing {

    private static Unsafe UNSAFE = getUnsafeInstance();

    public static void main(String[] args) throws IOException {
        String filePath = args.length == 0 ? "modules/lwjgl/vulkan/src/templates/kotlin/vulkan/templates/VK10.kt" : args[0];

        File f = new File(filePath);
        System.out.println("Reading: " + f.getAbsolutePath());
        if (args.length == 0) {
            System.out.println("\tUse 'ant demo -Dclass=org.lwjgl.demo.system.linux.HelloLibIOURing -Dargs=<path>' to cat a different file.");
        }

        int fileLength = (int)f.length();

        benchInit(filePath, fileLength);

        benchIO(filePath, fileLength);
        benchNIO(filePath, fileLength);
        benchFRAB(filePath);
        benchLibC(filePath, fileLength);
        benchIOURing(filePath, fileLength);
    }

    private static sun.misc.Unsafe getUnsafeInstance() {
        Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        for (Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers))) {
                continue;
            }

            try {
                field.setAccessible(true);
                return (sun.misc.Unsafe)field.get(null);
            } catch (Exception ignored) {
            }
            break;
        }

        throw new UnsupportedOperationException();
    }

    private static class SubmissionRing {
        private final long head;
        private final long tail;
        private final long flags;

        private final int ringMask;

        private final IntBuffer array;

        SubmissionRing(long address, IOURingParams params) {
            head = address + params.sq_off().head();
            tail = address + params.sq_off().tail();
            flags = address + params.sq_off().flags();
            ringMask = memGetInt(address + params.sq_off().ring_mask());
            array = memIntBuffer(address + params.sq_off().array(), memGetInt(address + params.sq_off().ring_entries()));
        }

        int getTail() {
            return memGetInt(tail);
        }

        int getIndex(int index) {
            return index & ringMask;
        }

        void setIndex(int index, int value) {
            array.put(index, value);
        }

        void updateTail(int tail) {
            memPutInt(this.tail, tail);
            UNSAFE.storeFence(); // TODO: atomic_store_release(sqring->tail, tail);
        }

        boolean needsWakeup() {
            // TODO: unsigned flags = atomic_load_relaxed(sq_ring->flags);
            return (UNSAFE.getIntVolatile(null, flags) & IORING_SQ_NEED_WAKEUP) != 0;
        }
    }

    private static class CompletionRing {
        private final long head;
        private final long tail;

        private final int ringMask;

        private final IOURingCQE.Buffer completionRingEntries;

        CompletionRing(long address, IOURingParams params) {
            head = address + params.cq_off().head();
            tail = address + params.cq_off().tail();
            ringMask = memGetInt(address + params.cq_off().ring_mask());
            completionRingEntries = IOURingCQE.create(address + params.cq_off().cqes(), memGetInt(address + params.cq_off().ring_entries()));
        }

        int getHead() {
            return memGetInt(head);
        }

        int getTail() {
            return memGetInt(tail);
        }

        IOURingCQE getEntry(int index) {
            return completionRingEntries.get(index & ringMask);
        }
    }

    private static class IOURingContainer implements AutoCloseable {
        private final int ringFD;

        private final SubmissionRing    submissionRing;
        private final IOURingSQE.Buffer submissionRingEntries;

        private final CompletionRing completionRing;

        private int registeredFiles;

        IOURingContainer() {
            try (MemoryStack stack = stackPush()) {
                IOURingParams params = IOURingParams.calloc(stack);
                params.flags(IORING_SETUP_CQSIZE | IORING_SETUP_SQPOLL);
                params.sq_thread_idle(1000);
                params.cq_entries(QUEUE_DEPTH);

                ringFD = io_uring_setup(QUEUE_DEPTH, params);
                if (ringFD < 0) {
                    throw new IllegalStateException("Failed io_uring_setup: " + strerror(getErrno()));
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

                int submissionRingSize        = params.sq_off().array() + params.sq_entries() * Integer.BYTES;
                int submissionRingEntriesSize = params.sq_entries() * IOURingSQE.SIZEOF;
                int completionRingSize        = params.cq_off().cqes() + params.cq_entries() * IOURingCQE.SIZEOF;

                if ((params.features() & IORING_FEAT_SINGLE_MMAP) != 0) {
                    if (submissionRingSize < completionRingSize) {
                        submissionRingSize = completionRingSize;
                    }
                    completionRingSize = submissionRingSize;
                }

                long submissionRingAddress        = NULL;
                long submissionRingEntriesAddress = NULL;
                long completionRingAddress        = NULL;

                try {
                    submissionRingAddress = mmap(NULL, submissionRingSize, PROT_READ | PROT_WRITE, MAP_SHARED | MAP_POPULATE, ringFD, IORING_OFF_SQ_RING);
                    if (submissionRingAddress == MAP_FAILED) {
                        throw new IllegalStateException("Failed to memory map submission ring buffer.");
                    }

                    submissionRingEntriesAddress = mmap(0, submissionRingEntriesSize, PROT_READ | PROT_WRITE, MAP_SHARED | MAP_POPULATE, ringFD, IORING_OFF_SQES);
                    if (submissionRingEntriesAddress == MAP_FAILED) {
                        throw new IllegalStateException("Failed to memory map submission ring entries.");
                    }

                    if ((params.features() & IORING_FEAT_SINGLE_MMAP) != 0) {
                        completionRingAddress = submissionRingAddress;
                    } else {
                        completionRingAddress = mmap(0, completionRingSize, PROT_READ | PROT_WRITE, MAP_SHARED | MAP_POPULATE, ringFD, IORING_OFF_CQ_RING);
                        if (completionRingAddress == MAP_FAILED) {
                            nmunmap(submissionRingAddress, submissionRingSize);
                            throw new IllegalStateException("Failed to memory map completion ring buffer.");
                        }
                    }
                } catch (Exception e) {
                    if (submissionRingEntriesAddress != NULL) {
                        nmunmap(submissionRingEntriesAddress, submissionRingEntriesSize);
                    }
                    if (completionRingAddress != NULL && completionRingAddress != submissionRingAddress) {
                        nmunmap(completionRingAddress, completionRingSize);
                    }
                    if (submissionRingAddress != NULL) {
                        nmunmap(submissionRingAddress, submissionRingSize);
                    }
                }

                submissionRing = new SubmissionRing(submissionRingAddress, params);
                submissionRingEntries = IOURingSQE.create(submissionRingEntriesAddress, params.sq_entries());

                completionRing = new CompletionRing(completionRingAddress, params);
            }
        }

        private static void printFeature(IOURingParams params, String name, int featureBit) {
            System.out.println(name + ": " + ((params.features() & featureBit) != 0));
        }

        public void registerFile(int fileFD) {
            try (MemoryStack stack = stackPush()) {
                int  opcode;
                long arg;
                if (registeredFiles == 0) {
                    arg = memAddress(stack.ints(fileFD));
                    opcode = IORING_REGISTER_FILES;
                    registeredFiles = 1;
                } else {
                    opcode = IORING_REGISTER_FILES_UPDATE;
                    arg = IOURingRSRCUpdate.calloc(stack)
                        .offset(0)
                        .data(memAddress(stack.ints(fileFD)))
                        .address();
                }

                int ret = io_uring_register(ringFD, opcode, arg, 1);
                if (ret == -1) {
                    throw new IllegalStateException("Failed to register file: " + strerror(getErrno()));
                }
            }
        }

        public void enter(int flags) {
            int result = io_uring_enter(ringFD, 0, 0, flags, NULL);
            if (result == -1) {
                throw new IllegalStateException("Failed io_uring_enter: " + strerror(getErrno()));
            }
        }

        @Override
        public void close() {
            if (UNISTD.close(ringFD) != 0) {
                System.err.println("Failed to close io_ring fd: " + strerror(getErrno()));
            }
        }
    }

    private static void benchIOURing(String filePath, int fileLength) {
        ByteBuffer buffer = memAlignedAlloc(PAGE_SIZE, fileLength);

        try (IOURingContainer container = new IOURingContainer()) {
            try (MemoryStack stack = stackPush()) {
                IOVec.Buffer IOVECS = IOVec.malloc(1, stack);
                IOVECS.get(0)
                    .iov_base(buffer)
                    .iov_len(buffer.capacity());

                if (io_uring_register(container.ringFD, IORING_REGISTER_BUFFERS, IOVECS.address(), 1) == -1) {
                    throw new IllegalStateException("Failed to register buffers: " + strerror(getErrno()));
                }
            }

            benchIOURingInner(filePath, fileLength, container, buffer);
            if (benchHashCode(buffer) != REFERENCE_HASHCODE) {
                throw new IllegalStateException();
            }

            for (int i = 0; i < WARMUP_ITERS; i++) {
                benchIOURingInner(filePath, fileLength, container, buffer);
            }

            long t = System.nanoTime();
            for (int i = 0; i < BENCH_ITERS; i++) {
                benchIOURingInner(filePath, fileLength, container, buffer);
            }
            t = System.nanoTime() - t;
            System.out.println("io_uring:\n\t" + (t / BENCH_ITERS));

            if (io_uring_register(container.ringFD, IORING_UNREGISTER_BUFFERS, NULL, 0) == -1) {
                System.err.println("Failed to unregister buffers: " + strerror(getErrno()));
            }
        } finally {
            memAlignedFree(buffer);
        }
    }

    private static void benchIOURingInner(String filePath, int fileLength, IOURingContainer container, ByteBuffer buffer) {
        int fileFD = open(filePath, O_RDONLY, 0);
        if (fileFD < 0) {
            throw new IllegalStateException("Failed to open file: " + strerror(getErrno()));
        }
        container.registerFile(fileFD);

        SubmissionRing    submissionRing        = container.submissionRing;
        IOURingSQE.Buffer submissionRingEntries = container.submissionRingEntries;
        CompletionRing    completionRing        = container.completionRing;

        int offset    = 0;
        int submitted = 0;
        while (true) {
            // submit
            {
                if (submitted == QUEUE_DEPTH) {
                    container.enter(IORING_ENTER_SQ_WAIT);
                }

                int tail     = submissionRing.getTail();
                int tailInit = tail;
                while (offset < fileLength && submitted < QUEUE_DEPTH) {
                    int bytesToRead = min(fileLength - offset, BLOCK_SIZE);

                    long addr = memAddress(buffer) + offset;

                    int index = submissionRing.getIndex(tail);
                    submissionRingEntries.get(index)
                        .flags((byte)(IOSQE_FIXED_FILE | IOSQE_ASYNC))
                        .fd(0)
                        .off(offset)
                        .opcode(IORING_OP_READ)
                        .buf_index((short)0)
                        .addr(addr)
                        .len(bytesToRead)
                        .user_data(addr);

                    submissionRing.setIndex(index, index);

                    offset += bytesToRead;
                    tail++;
                    submitted++;
                }

                if (tailInit < tail) {
                    submissionRing.updateTail(tail);
                    if (submissionRing.needsWakeup()) {
                        container.enter(IORING_ENTER_SQ_WAKEUP);
                    }
                } else if (submitted == 0) {
                    break;
                }
            }

            // reap
            {
                int head     = completionRing.getHead();
                int headInit = head;
                while (submitted != 0) {
                    UNSAFE.loadFence(); // TODO: atomic_load_acquire(cqring->tail)
                    if (head == completionRing.getTail()) {
                        //Thread.yield();
                        break;
                    }

                    IOURingCQE cqe = completionRing.getEntry(head);

                    int result = cqe.res(); // result of read(2) call
                    if (result < 0) {
                        throw new IllegalStateException("Submission " + head + " failed: " + abs(cqe.res()));
                    }

                    head++;
                    submitted--;
                }

                if (headInit < head) {
                    memPutInt(completionRing.head, head);
                    UNSAFE.storeFence(); // TODO: atomic_store_release(cqring->head, head);
                }
            }
        }

        // TODO: why super slow?
        /*if (io_uring_register(container.ringFD, IORING_UNREGISTER_FILES, NULL, 0) == -1) {
            throw new IllegalStateException("Failed to unregister file: " + strerr(getErrno()));
        }*/
        if (close(fileFD) != 0) {
            System.err.println("Failed to close file fd: " + strerror(getErrno()));
        }
    }

}