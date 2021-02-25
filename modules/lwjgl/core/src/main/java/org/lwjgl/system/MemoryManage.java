/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.system.libffi.*;

import javax.annotation.*;
import java.util.*;
import java.util.Map.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.StackWalkUtil.*;
import static org.lwjgl.system.libc.LibCStdlib.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Provides {@link MemoryAllocator} implementations for {@link MemoryUtil} to use. */
final class MemoryManage {

    private MemoryManage() {
    }

    static MemoryAllocator getInstance() {
        Object allocator = Configuration.MEMORY_ALLOCATOR.get();
        if (allocator instanceof MemoryAllocator) {
            return (MemoryAllocator)allocator;
        }

        if (!"system".equals(allocator)) {
            String className;
            if (allocator == null || "jemalloc".equals(allocator)) {
                className = "org.lwjgl.system.jemalloc.JEmallocAllocator";
            } else if ("rpmalloc".equals(allocator)) {
                className = "org.lwjgl.system.rpmalloc.RPmallocAllocator";
            } else {
                className = allocator.toString();
            }

            try {
                Class<?> allocatorClass = Class.forName(className);
                return (MemoryAllocator)allocatorClass.getConstructor().newInstance();
            } catch (Throwable t) {
                if (Checks.DEBUG && allocator != null) {
                    t.printStackTrace(DEBUG_STREAM);
                }
                apiLog(String.format("Warning: Failed to instantiate memory allocator: %s. Using the system default.", className));
            }
        }

        return new StdlibAllocator();
    }

    /** stdlib memory allocator. */
    private static class StdlibAllocator implements MemoryAllocator {

        @Override public long getMalloc()                              { return MemoryAccessJNI.malloc; }
        @Override public long getCalloc()                              { return MemoryAccessJNI.calloc; }
        @Override public long getRealloc()                             { return MemoryAccessJNI.realloc; }
        @Override public long getFree()                                { return MemoryAccessJNI.free; }
        @Override public long getAlignedAlloc()                        { return MemoryAccessJNI.aligned_alloc; }
        @Override public long getAlignedFree()                         { return MemoryAccessJNI.aligned_free; }

        @Override public long malloc(long size)                        { return nmalloc(size); }
        @Override public long calloc(long num, long size)              { return ncalloc(num, size); }
        @Override public long realloc(long ptr, long size)             { return nrealloc(ptr, size); }
        @Override public void free(long ptr)                           { nfree(ptr); }
        @Override public long aligned_alloc(long alignment, long size) { return naligned_alloc(alignment, size); }
        @Override public void aligned_free(long ptr)                   { naligned_free(ptr); }

    }

    /** Wraps a MemoryAllocator to track allocations and detect memory leaks. */
    static class DebugAllocator implements MemoryAllocator {

        private static final ConcurrentMap<Long, Allocation> ALLOCATIONS = new ConcurrentHashMap<>();
        private static final ConcurrentMap<Long, String>     THREADS     = new ConcurrentHashMap<>();

        private final MemoryAllocator allocator;

        private final long[] callbacks;

        DebugAllocator(MemoryAllocator allocator) {
            this.allocator = allocator;

            this.callbacks = new long[] {
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_pointer, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long size = memGetAddress(memGetAddress(args));
                        memPutAddress(ret, malloc(size));
                    }
                }.address(),
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long num  = memGetAddress(memGetAddress(args));
                        long size = memGetAddress(memGetAddress(args + POINTER_SIZE));
                        memPutAddress(ret, calloc(num, size));
                    }
                }.address(),
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long ptr  = memGetAddress(memGetAddress(args));
                        long size = memGetAddress(memGetAddress(args + POINTER_SIZE));
                        memPutAddress(ret, realloc(ptr, size));
                    }
                }.address(),
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_void, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long ptr = memGetAddress(memGetAddress(args));
                        free(ptr);
                    }
                }.address(),
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long alignment = memGetAddress(memGetAddress(args));
                        long size      = memGetAddress(memGetAddress(args + POINTER_SIZE));
                        memPutAddress(ret, aligned_alloc(alignment, size));
                    }
                }.address(),
                new CallbackI() {
                    @Override public FFICIF getCallInterface() {
                        return apiCreateCIF(FFI_DEFAULT_ABI, ffi_type_void, ffi_type_pointer);
                    }
                    @Override public void callback(long ret, long args) {
                        long ptr = memGetAddress(memGetAddress(args));
                        aligned_free(ptr);
                    }
                }.address()
            };

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                for (long callback : callbacks) {
                    Callback.free(callback);
                }

                if (ALLOCATIONS.isEmpty()) {
                    return;
                }

                for (Entry<Long, Allocation> entry : ALLOCATIONS.entrySet()) {
                    Long       address    = entry.getKey();
                    Allocation allocation = entry.getValue();

                    DEBUG_STREAM.format(
                        "[LWJGL] %d bytes leaked, thread %d (%s), address: 0x%s\n",
                        allocation.size,
                        allocation.threadId,
                        THREADS.get(allocation.threadId),
                        Long.toHexString(address).toUpperCase()
                    );
                    for (Object el : allocation.stackTrace) {
                        DEBUG_STREAM.format("\tat %s\n", el.toString());
                    }
                }
            }));
        }

        @Override public long getMalloc()       { return callbacks[0]; }
        @Override public long getCalloc()       { return callbacks[1]; }
        @Override public long getRealloc()      { return callbacks[2]; }
        @Override public long getFree()         { return callbacks[3]; }
        @Override public long getAlignedAlloc() { return callbacks[4]; }
        @Override public long getAlignedFree()  { return callbacks[5]; }

        @Override public long malloc(long size) {
            return track(allocator.malloc(size), size);
        }

        @Override
        public long calloc(long num, long size) {
            return track(allocator.calloc(num, size), num * size);
        }

        @Override
        public long realloc(long ptr, long size) {
            /*
            realloc semantics:
            a) if size == 0 and ptr != NULL => free(ptr), return NULL
            b) if size != 0 and ptr == NULL => malloc(size), return new address
            c) if ptr != NULL and size < oldSize =>
                1) reduce size, return ptr
                2) malloc new address, memcpy, free(ptr), return new address
            d) if ptr != NULL and oldSize < size =>
                1) expand size, return ptr
                2) malloc new address, memcpy, free(ptr), return new address
                3) malloc fails, return NULL
             */

            long oldSize = untrack(ptr);

            long address = allocator.realloc(ptr, size);

            if (address != NULL) {
                track(address, size);
            } else if (size != 0L) {
                track(ptr, oldSize); // d3
            }

            return address;
        }

        @Override
        public void free(long ptr) {
            untrack(ptr);
            allocator.free(ptr);
        }

        @Override
        public long aligned_alloc(long alignment, long size) {
            return track(allocator.aligned_alloc(alignment, size), size);
        }

        @Override
        public void aligned_free(long ptr) {
            untrack(ptr);
            allocator.aligned_free(ptr);
        }

        static long track(long address, long size) {
            if (address != NULL) {
                Thread t        = Thread.currentThread();
                Long   threadId = t.getId();
                if (!THREADS.containsKey(threadId)) {
                    THREADS.put(threadId, t.getName());
                }

                Allocation allocation = ALLOCATIONS.put(address, new Allocation(stackWalkGetTrace(), size));
                if (allocation != null) {
                    throw new IllegalStateException("The memory address specified is already being tracked: 0x" + Long.toHexString(address).toUpperCase());
                }
            }

            return address;
        }

        static long untrack(long address) {
            if (address == NULL) {
                return 0L;
            }

            Allocation allocation = ALLOCATIONS.remove(address);
            if (allocation == null) {
                throw new IllegalStateException("The memory address specified is not being tracked: 0x" + Long.toHexString(address).toUpperCase());
            }

            return allocation.size;
        }

        private static class Allocation {

            private final Object[] stackTrace;

            @Nullable
            private StackTraceElement[] elements; // lazy init

            final long size;
            final long threadId;

            Allocation(Object[] stackTrace, long size) {
                this.stackTrace = stackTrace;
                this.size = size;
                this.threadId = Thread.currentThread().getId();
            }

            private StackTraceElement[] getElements() {
                if (elements == null) {
                    elements = stackWalkArray(stackTrace);
                }

                return elements;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }

                Allocation that = (Allocation)o;

                return Arrays.equals(this.getElements(), that.getElements());
            }

            @Override
            public int hashCode() {
                return Arrays.hashCode(getElements());
            }

        }

        static void report(MemoryAllocationReport report) {
            for (Entry<Long, Allocation> entry : ALLOCATIONS.entrySet()) {
                Allocation allocation = entry.getValue();
                report.invoke(entry.getKey(), allocation.size, allocation.threadId, THREADS.get(allocation.threadId), allocation.getElements());
            }
        }

        private static <T> void aggregate(T t, long size, Map<T, AtomicLong> map) {
            AtomicLong node = map.computeIfAbsent(t, k -> new AtomicLong());
            node.set(node.get() + size);
        }

        static void report(
            MemoryAllocationReport report,
            MemoryAllocationReport.Aggregate groupByStackTrace,
            boolean groupByThread
        ) {
            // Using atomic long for the mutability, no concurrency here
            switch (groupByStackTrace) {
                case ALL:
                    if (groupByThread) {
                        Map<Long, AtomicLong> mapThread = new HashMap<>();
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            aggregate(allocation.threadId, allocation.size, mapThread);
                        }
                        for (Entry<Long, AtomicLong> entry : mapThread.entrySet()) {
                            report.invoke(NULL, entry.getValue().get(), entry.getKey(), THREADS.get(entry.getKey()), (StackTraceElement[])null);
                        }
                    } else {
                        long total = 0L;
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            total += allocation.size;
                        }
                        report.invoke(NULL, total, NULL, null, (StackTraceElement[])null);
                    }
                    break;
                case GROUP_BY_METHOD:
                    // Group by stackTrace[0]
                    if (groupByThread) {
                        Map<Long, Map<StackTraceElement, AtomicLong>> mapThreadMethod = new HashMap<>();
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            Map<StackTraceElement, AtomicLong> mapMethod = mapThreadMethod.computeIfAbsent(allocation.threadId, k -> new HashMap<>());
                            aggregate(allocation.getElements()[0], allocation.size, mapMethod);
                        }

                        for (Entry<Long, Map<StackTraceElement, AtomicLong>> tms : mapThreadMethod.entrySet()) {
                            long                               threadId     = tms.getKey();
                            Map<StackTraceElement, AtomicLong> mapmapMethod = tms.getValue();

                            for (Entry<StackTraceElement, AtomicLong> ms : mapmapMethod.entrySet()) {
                                report.invoke(NULL, ms.getValue().get(), threadId, THREADS.get(threadId), ms.getKey());
                            }
                        }
                    } else {
                        Map<StackTraceElement, AtomicLong> mapMethod = new HashMap<>();
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            aggregate(allocation.getElements()[0], allocation.size, mapMethod);
                        }
                        for (Entry<StackTraceElement, AtomicLong> ms : mapMethod.entrySet()) {
                            report.invoke(NULL, ms.getValue().get(), NULL, null, ms.getKey());
                        }
                    }
                    break;
                case GROUP_BY_STACKTRACE:
                    // Group by stackTrace[]
                    if (groupByThread) {
                        Map<Long, Map<Allocation, AtomicLong>> mapThreadStackTrace = new HashMap<>();
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            Map<Allocation, AtomicLong> mapStackTrace = mapThreadStackTrace.computeIfAbsent(allocation.threadId, k -> new HashMap<>());
                            aggregate(allocation, allocation.size, mapStackTrace);
                        }

                        for (Entry<Long, Map<Allocation, AtomicLong>> tss : mapThreadStackTrace.entrySet()) {
                            long                        threadId      = tss.getKey();
                            Map<Allocation, AtomicLong> mapStackTrace = tss.getValue();

                            for (Entry<Allocation, AtomicLong> ss : mapStackTrace.entrySet()) {
                                report.invoke(NULL, ss.getValue().get(), threadId, THREADS.get(threadId), ss.getKey().getElements());
                            }
                        }
                    } else {
                        Map<Allocation, AtomicLong> mapStackTrace = new HashMap<>();
                        for (Allocation allocation : ALLOCATIONS.values()) {
                            aggregate(allocation, allocation.size, mapStackTrace);
                        }
                        for (Entry<Allocation, AtomicLong> ss : mapStackTrace.entrySet()) {
                            report.invoke(NULL, ss.getValue().get(), NULL, null, ss.getKey().getElements());
                        }
                    }
                    break;
            }
        }

    }

}