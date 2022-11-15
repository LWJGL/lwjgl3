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

        private static final ConcurrentMap<Allocation, Allocation> ALLOCATIONS = new ConcurrentHashMap<>();
        private static final ConcurrentMap<Long, String>           THREADS     = new ConcurrentHashMap<>();

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

                boolean missingStacktrace = false;
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StringBuilder sb = new StringBuilder(512);

                    sb
                        .append("[LWJGL] ")
                        .append(allocation.size)
                        .append(" bytes leaked, thread ")
                        .append(allocation.threadId)
                        .append(" (")
                        .append(THREADS.get(allocation.threadId))
                        .append("), address: 0x")
                        .append(Long.toHexString(allocation.address).toUpperCase())
                        .append("\n");

                    StackTraceElement[] stackTrace = allocation.getElements();
                    if (stackTrace != null) {
                        for (Object el : stackTrace) {
                            sb
                                .append("\tat ")
                                .append(el.toString())
                                .append("\n");
                        }
                    } else {
                        missingStacktrace = true;
                    }

                    DEBUG_STREAM.print(sb);
                }

                if (missingStacktrace) {
                    DEBUG_STREAM.print("[LWJGL] Reminder: disable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST to get stacktraces of leaking allocations.\n");
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
                Thread t = Thread.currentThread();
                THREADS.putIfAbsent(t.getId(), t.getName());

                Allocation allocationNew = new Allocation(
                    address,
                    size,
                    t.getId(),
                    Configuration.DEBUG_MEMORY_ALLOCATOR_FAST.get(false) ? null : stackWalkGetTrace()
                );

                Allocation allocationOld = ALLOCATIONS.put(allocationNew, allocationNew);
                if (allocationOld != null) {
                    trackAbort(address, allocationOld, allocationNew);
                }
            }

            return address;
        }
        private static void trackAbort(long address, Allocation allocationOld, Allocation allocationNew) {
            String addressHex = Long.toHexString(address).toUpperCase();

            trackAbortPrint(allocationOld, "Old", addressHex);
            trackAbortPrint(allocationNew, "New", addressHex);

            throw new IllegalStateException("The memory address specified is already being tracked: 0x" + addressHex);
        }
        private static void trackAbortPrint(Allocation allocation, String name, String address) {
            StringBuilder sb = new StringBuilder(512);

            sb
                .append("[LWJGL] ")
                .append(name)
                .append(" allocation with size ")
                .append(allocation.size)
                .append(", thread ")
                .append(allocation.threadId)
                .append(" (")
                .append(THREADS.get(allocation.threadId))
                .append("), address: 0x")
                .append(address)
                .append("\n");

            StackTraceElement[] stackTrace = allocation.getElements();
            if (stackTrace != null) {
                for (Object el : stackTrace) {
                    sb
                        .append("\tat ")
                        .append(el.toString())
                        .append("\n");
                }
            }

            DEBUG_STREAM.print(sb);
        }

        static long untrack(long address) {
            if (address == NULL) {
                return 0L;
            }

            Allocation allocation = ALLOCATIONS.remove(new Allocation(address, 0L, NULL, null));
            if (allocation == null) {
                untrackAbort(address);
            }

            return allocation.size;
        }
        private static void untrackAbort(long address) {
            String addressHex = Long.toHexString(address).toUpperCase();

            throw new IllegalStateException("The memory address specified is not being tracked: 0x" + addressHex);
        }

        private static class Allocation {

            final long address;
            final long size;
            final long threadId;

            @Nullable
            private final Object[] stacktrace;

            Allocation(long address, long size, long threadId, @Nullable Object[] stacktrace) {
                this.address = address;
                this.size = size;
                this.threadId = threadId;
                this.stacktrace = stacktrace;
            }

            @Nullable
            private StackTraceElement[] getElements() {
                return stacktrace == null ? null : stackWalkArray(stacktrace);
            }

            @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
            @Override
            public boolean equals(Object other) {
                return this.address == ((Allocation)other).address;
            }

            @Override
            public int hashCode() {
                return Long.hashCode(address);
            }

        }

        static void report(MemoryAllocationReport report) {
            for (Allocation allocation : ALLOCATIONS.keySet()) {
                report.invoke(allocation.address, allocation.size, allocation.threadId, THREADS.get(allocation.threadId), allocation.getElements());
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
            switch (groupByStackTrace) {
                case ALL:
                    reportAll(report, groupByThread);
                    break;
                case GROUP_BY_METHOD:
                    reportByMethod(report, groupByThread);
                    break;
                case GROUP_BY_STACKTRACE:
                    reportByStacktrace(report, groupByThread);
                    break;
            }
        }
        private static void reportAll(MemoryAllocationReport report, boolean groupByThread) {
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
        }
        private static void reportByMethod(MemoryAllocationReport report, boolean groupByThread) {
            // Group by stackTrace[0]
            if (groupByThread) {
                Map<Long, Map<StackTraceElement, AtomicLong>> mapThreadMethod = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        Map<StackTraceElement, AtomicLong> mapMethod = mapThreadMethod.computeIfAbsent(allocation.threadId, k -> new HashMap<>());
                        aggregate(elements[0], allocation.size, mapMethod);
                    }
                }

                for (Entry<Long, Map<StackTraceElement, AtomicLong>> tms : mapThreadMethod.entrySet()) {
                    long   threadId   = tms.getKey();
                    String threadName = THREADS.get(threadId);
                    for (Entry<StackTraceElement, AtomicLong> ms : tms.getValue().entrySet()) {
                        report.invoke(NULL, ms.getValue().get(), threadId, threadName, ms.getKey());
                    }
                }
            } else {
                Map<StackTraceElement, AtomicLong> mapMethod = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        aggregate(elements[0], allocation.size, mapMethod);
                    }
                }
                for (Entry<StackTraceElement, AtomicLong> ms : mapMethod.entrySet()) {
                    report.invoke(NULL, ms.getValue().get(), NULL, null, ms.getKey());
                }
            }
        }
        private static void reportByStacktrace(MemoryAllocationReport report, boolean groupByThread) {
            // Group by stackTrace[]
            if (groupByThread) {
                Map<Long, Map<AllocationKey, AtomicLong>> mapThreadStackTrace = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        Map<AllocationKey, AtomicLong> mapStackTrace = mapThreadStackTrace.computeIfAbsent(allocation.threadId, k -> new HashMap<>());
                        aggregate(new AllocationKey(elements), allocation.size, mapStackTrace);
                    }

                }

                for (Entry<Long, Map<AllocationKey, AtomicLong>> tss : mapThreadStackTrace.entrySet()) {
                    long threadId = tss.getKey();
                    for (Entry<AllocationKey, AtomicLong> ss : tss.getValue().entrySet()) {
                        report.invoke(NULL, ss.getValue().get(), threadId, THREADS.get(threadId), ss.getKey().elements);
                    }
                }
            } else {
                Map<AllocationKey, AtomicLong> mapStackTrace = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        aggregate(new AllocationKey(elements), allocation.size, mapStackTrace);
                    }
                }
                for (Entry<AllocationKey, AtomicLong> ss : mapStackTrace.entrySet()) {
                    report.invoke(NULL, ss.getValue().get(), NULL, null, ss.getKey().elements);
                }
            }
        }
        // Used by GROUP_BY_STACKTRACE only.
        private static class AllocationKey {

            final StackTraceElement[] elements;

            AllocationKey(StackTraceElement[] elements) {
                this.elements = elements;
            }

            @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
            @Override public boolean equals(Object other) {
                return this == other || Arrays.equals(elements, ((AllocationKey)other).elements);
            }

            @Override public int hashCode() {
                return Arrays.hashCode(elements);
            }

        }

    }

}