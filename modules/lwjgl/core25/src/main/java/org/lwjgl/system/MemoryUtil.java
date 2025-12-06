/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import org.lwjgl.*;
import org.lwjgl.system.MemoryManage.*;
import org.lwjgl.system.MemoryUtil.MemoryAllocationReport.*;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.nio.*;
import java.nio.charset.*;

import static java.lang.Character.*;
import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.LazyInit.*;
import static org.lwjgl.system.MemoryUtilTunables.*;
import static org.lwjgl.system.Pointer.*;

/** MemoryUtil implementation using FFM. */
@NullMarked
public final class MemoryUtil {

    /** Alias for the null pointer address. */
    public static final long NULL = 0L;

    /** The memory page size, in bytes. This value is always a power-of-two. */
    public static final int PAGE_SIZE;

    /** The cache-line size, in bytes. This value is always a power-of-two. */
    public static final int CACHE_LINE_SIZE;

    static final int ARRAY_TLC_SIZE = Configuration.ARRAY_TLC_SIZE.get(8192);

    static final ThreadLocal<byte[]> ARRAY_TLC_BYTE = ThreadLocal.withInitial(() -> new byte[ARRAY_TLC_SIZE]);
    static final ThreadLocal<char[]> ARRAY_TLC_CHAR = ThreadLocal.withInitial(() -> new char[ARRAY_TLC_SIZE]);

    static final ByteOrder NATIVE_ORDER = ByteOrder.nativeOrder();

    private static final Charset UTF16 = NATIVE_ORDER == ByteOrder.LITTLE_ENDIAN
        ? StandardCharsets.UTF_16LE
        : StandardCharsets.UTF_16BE;

    private static final int MAX_BUFFER_SIZE = Integer.MAX_VALUE - 8; // see jdk.internal.util.ArraysSupport.SOFT_MAX_ARRAY_LENGTH

    static {
        Library.initialize();

        PAGE_SIZE = 4096; // TODO: Can we do better?
        CACHE_LINE_SIZE = 64; // TODO: Can we do better?

        apiLog("Java 25 MemoryUtil enabled");
    }

    static final class LazyInit {

        private LazyInit() {
        }

        static final MemoryAllocator ALLOCATOR_IMPL;
        static final MemoryAllocator ALLOCATOR;

        static {
            boolean debug = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false);

            ALLOCATOR_IMPL = MemoryManage.getInstance();
            ALLOCATOR = debug
                ? new DebugAllocator(ALLOCATOR_IMPL)
                : ALLOCATOR_IMPL;

            apiLog("MemoryUtil allocator: " + ALLOCATOR.getClass().getSimpleName());
            if (debug && !Configuration.DEBUG_MEMORY_ALLOCATOR_FAST.get(false)) {
                apiLogMore("Reminder: enable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST for low overhead allocation tracking.");
            }
        }
    }

    private MemoryUtil() {
    }

    /*  -------------------------------------
        -------------------------------------
            EXPLICIT MEMORY MANAGEMENT API
        -------------------------------------
        ------------------------------------- */

    /** The interface implemented by the memory allocator used by the explicit memory management API ({@link #memAlloc}, {@link #memFree}, etc). */
    public interface MemoryAllocator {

        /** Returns a pointer to the malloc function. */
        long getMalloc();
        /** Returns a pointer to the calloc function. */
        long getCalloc();
        /** Returns a pointer to the realloc function. */
        long getRealloc();
        /** Returns a pointer to the free function. */
        long getFree();
        /** Returns a pointer to the aligned_alloc function. */
        long getAlignedAlloc();
        /** Returns a pointer to the aligned_free function. */
        long getAlignedFree();

        /** Called by {@link MemoryUtil#memAlloc}. */
        long malloc(long size);
        /** Called by {@link MemoryUtil#memCalloc}. */
        long calloc(long num, long size);
        /** Called by {@link MemoryUtil#memRealloc}. */
        long realloc(long ptr, long size);
        /** Called by {@link MemoryUtil#memFree}. */
        void free(long ptr);

        /** Called by {@link MemoryUtil#memAlignedAlloc}. */
        long aligned_alloc(long alignment, long size);
        /** Called by {@link MemoryUtil#memAlignedFree}. */
        void aligned_free(long ptr);

    }

    /**
     * Returns the {@link MemoryAllocator} instance used internally by the explicit memory management API ({@link #memAlloc}, {@link #memFree}, etc).
     *
     * <p>Allocations made through the returned instance will not be tracked for memory leaks, even if {@link Configuration#DEBUG_MEMORY_ALLOCATOR} is enabled.
     * This can be useful for {@code static final} allocations that live throughout the application's lifetime and will never be freed until the process is
     * terminated. Normally such allocations would be reported as memory leaks by the debug allocator.</p>
     *
     * <p>The expectation is that this method will rarely be used, so it does not have the {@code mem} prefix to avoid pollution of auto-complete lists.</p>
     *
     * @return the {@link MemoryAllocator} instance
     */
    public static MemoryAllocator getAllocator() {
        return getAllocator(false);
    }

    /**
     * Returns the {@link MemoryAllocator} instance used internally by the explicit memory management API ({@link #memAlloc}, {@link #memFree}, etc).
     *
     * @param tracked whether allocations will be tracked for memory leaks, if {@link Configuration#DEBUG_MEMORY_ALLOCATOR} is enabled.
     *
     * @return the {@link MemoryAllocator} instance
     */
    public static MemoryAllocator getAllocator(boolean tracked) {
        return tracked
            ? ALLOCATOR
            : ALLOCATOR_IMPL;
    }

    // --- [ memAlloc ] ---

    /** Unsafe version of {@link #memAlloc}. May return {@link #NULL} if {@code size} is zero or the allocation failed. */
    public static long nmemAlloc(long size) {
        return ALLOCATOR.malloc(size);
    }

    /**
     * Unsafe version of {@link #memAlloc} that checks the returned pointer.
     *
     * @return a pointer to the memory block allocated by the function on success. This pointer will never be {@link #NULL}, even if {@code size} is zero.
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static long nmemAllocChecked(long size) {
        var address = nmemAlloc(size != 0 ? size : 1L);
        if (CHECKS && address == NULL) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    private static long getAllocationSize(int elements, int elementShift) {
        return apiCheckAllocation(elements, Integer.toUnsignedLong(elements) << elementShift, BITS64 ? Long.MAX_VALUE : 0xFFFF_FFFFL);
    }

    /**
     * The standard C malloc function.
     *
     * <p>Allocates a block of {@code size} bytes of memory, returning a pointer to the beginning of the block. The content of the newly allocated block of
     * memory is not initialized, remaining with indeterminate values.</p>
     *
     * <p>Memory allocated with this method must be freed with {@link #memFree}.</p>
     *
     * @param size the size of the memory block to allocate, in bytes. If {@code size} is zero, the returned pointer shall not be dereferenced.
     *
     * @return on success, a pointer to the memory block allocated by the function
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static ByteBuffer memAlloc(int size) {
        return wrapBufferByte(nmemAllocChecked(size), size);
    }

    /**
     * ShortBuffer version of {@link #memAlloc}.
     *
     * @param size the number of short values to allocate.
     */
    public static ShortBuffer memAllocShort(int size) {
        return wrapBufferShort(nmemAllocChecked(getAllocationSize(size, 1)), size);
    }

    /**
     * IntBuffer version of {@link #memAlloc}.
     *
     * @param size the number of int values to allocate.
     */
    public static IntBuffer memAllocInt(int size) {
        return wrapBufferInt(nmemAllocChecked(getAllocationSize(size, 2)), size);
    }

    /**
     * FloatBuffer version of {@link #memAlloc}.
     *
     * @param size the number of float values to allocate.
     */
    public static FloatBuffer memAllocFloat(int size) {
        return wrapBufferFloat(nmemAllocChecked(getAllocationSize(size, 2)), size);
    }

    /**
     * LongBuffer version of {@link #memAlloc}.
     *
     * @param size the number of long values to allocate.
     */
    public static LongBuffer memAllocLong(int size) {
        return wrapBufferLong(nmemAllocChecked(getAllocationSize(size, 3)), size);
    }

    /**
     * {@code CLongBuffer} version of {@link #memAlloc}.
     *
     * @param size the number of C long values to allocate.
     */
    public static CLongBuffer memAllocCLong(int size) {
        return CLongBuffer.create(nmemAllocChecked(getAllocationSize(size, CLONG_SHIFT)), size);
    }

    /**
     * DoubleBuffer version of {@link #memAlloc}.
     *
     * @param size the number of double values to allocate.
     */
    public static DoubleBuffer memAllocDouble(int size) {
        return wrapBufferDouble(nmemAllocChecked(getAllocationSize(size, 3)), size);
    }

    /**
     * PointerBuffer version of {@link #memAlloc}.
     *
     * @param size the number of pointer values to allocate.
     */
    public static PointerBuffer memAllocPointer(int size) {
        return PointerBuffer.create(nmemAllocChecked(getAllocationSize(size, POINTER_SHIFT)), size);
    }

    /** Unsafe version of {@link #memFree}. */
    public static void nmemFree(long ptr) {
        ALLOCATOR.free(ptr);
    }

    /**
     * The standard C free function.
     *
     * <p>A block of memory previously allocated by a call to {@link #memAlloc}, {@link #memCalloc} or {@link #memRealloc} is deallocated, making it available
     * again for further allocations.</p>
     *
     * @param ptr pointer to a memory block previously allocated with {@link #memAlloc}, {@link #memCalloc} or {@link #memRealloc}. If {@code ptr} does not
     *            point to a block of memory allocated with the above functions, it causes undefined behavior. If {@code ptr} is a {@link #NULL} pointer, the
     *            function does nothing.
     */
    public static void memFree(@Nullable Buffer ptr) {
        if (ptr != null) {
            nmemFree(memAddress0(ptr));
        }
    }
    /** {@code ByteBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable ByteBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ptr.position());
        }
    }
    /** {@code ShortBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable ShortBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 1));
        }
    }
    /** {@code CharBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable CharBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 1));
        }
    }
    /** {@code IntBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable IntBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 2));
        }
    }
    /** {@code LongBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable LongBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 3));
        }
    }
    /** {@code FloatBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable FloatBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 2));
        }
    }
    /** {@code DoubleBuffer} version of {@link #memFree(Buffer)}. */
    public static void memFree(@Nullable DoubleBuffer ptr) {
        if (ptr != null) {
            nmemFree(MemorySegment.ofBuffer(ptr).address() - ((long)ptr.position() << 3));
        }
    }

    /** {@code CustomBuffer} version of {@link #memFree}. */
    public static void memFree(@Nullable CustomBuffer<?> ptr) {
        if (ptr != null) {
            nmemFree(ptr.address);
        }
    }

    // --- [ memCalloc ] ---

    /** Unsafe version of {@link #memCalloc}. May return {@link #NULL} if {@code num} or {@code size} are zero or the allocation failed. */
    public static long nmemCalloc(long num, long size) {
        return ALLOCATOR.calloc(num, size);
    }

    /**
     * Unsafe version of {@link #memCalloc} that checks the returned pointer.
     *
     * @return a pointer to the memory block allocated by the function on success. This pointer will never be {@link #NULL}, even if {@code num} or {@code size}
     * are zero.
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static long nmemCallocChecked(long num, long size) {
        if (num == 0L || size == 0L) {
            num = 1L;
            size = 1L;
        }

        var address = nmemCalloc(num, size);
        if (CHECKS && address == NULL) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    /**
     * The standard C calloc function.
     *
     * <p>Allocates a block of memory for an array of {@code num} elements, each of them {@code size} bytes long, and initializes all its bits to zero. The
     * effective result is the allocation of a zero-initialized memory block of {@code (num*size)} bytes.</p>
     *
     * <p>Memory allocated with this method must be freed with {@link #memFree}.</p>
     *
     * @param num  the number of elements to allocate.
     * @param size the size of each element. If {@code size} is zero, the return value depends on the particular library implementation (it may or may not be a
     *             null pointer), but the returned pointer shall not be dereferenced.
     *
     * @return on success, a pointer to the memory block allocated by the function
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static ByteBuffer memCalloc(int num, int size) {
        return wrapBufferByte(nmemCallocChecked(num, size), num * size);
    }

    /**
     * Alternative version of {@link #memCalloc}.
     *
     * @param num the number of bytes to allocate.
     */
    public static ByteBuffer memCalloc(int num) {
        return wrapBufferByte(nmemCallocChecked(num, 1), num);
    }

    /**
     * ShortBuffer version of {@link #memCalloc}.
     *
     * @param num the number of short values to allocate.
     */
    public static ShortBuffer memCallocShort(int num) {
        return wrapBufferShort(nmemCallocChecked(num, 2), num);
    }

    /**
     * IntBuffer version of {@link #memCalloc}.
     *
     * @param num the number of int values to allocate.
     */
    public static IntBuffer memCallocInt(int num) {
        return wrapBufferInt(nmemCallocChecked(num, 4), num);
    }

    /**
     * FloatBuffer version of {@link #memCalloc}.
     *
     * @param num the number of float values to allocate.
     */
    public static FloatBuffer memCallocFloat(int num) {
        return wrapBufferFloat(nmemCallocChecked(num, 4), num);
    }

    /**
     * LongBuffer version of {@link #memCalloc}.
     *
     * @param num the number of long values to allocate.
     */
    public static LongBuffer memCallocLong(int num) {
        return wrapBufferLong(nmemCallocChecked(num, 8), num);
    }

    /**
     * {@code CLongBuffer} version of {@link #memCalloc}.
     *
     * @param num the number of C long values to allocate.
     */
    public static CLongBuffer memCallocCLong(int num) {
        return CLongBuffer.create(nmemCallocChecked(num, CLONG_SIZE), num);
    }

    /**
     * DoubleBuffer version of {@link #memCalloc}.
     *
     * @param num the number of double values to allocate.
     */
    public static DoubleBuffer memCallocDouble(int num) {
        return wrapBufferDouble(nmemCallocChecked(num, 8), num);
    }

    /**
     * PointerBuffer version of {@link #memCalloc}.
     *
     * @param num the number of pointer values to allocate.
     */
    public static PointerBuffer memCallocPointer(int num) {
        return PointerBuffer.create(nmemCallocChecked(num, POINTER_SIZE), num);
    }

    // --- [ memRealloc] ---

    /** Unsafe version of {@link #memRealloc}. May return {@link #NULL} if {@code size} is zero or the allocation failed. */
    public static long nmemRealloc(long ptr, long size) {
        return ALLOCATOR.realloc(ptr, size);
    }

    /**
     * Unsafe version of {@link #memRealloc} that checks the returned pointer.
     *
     * @return a pointer to the memory block reallocated by the function on success. This pointer will never be {@link #NULL}, even if {@code size} is zero.
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static long nmemReallocChecked(long ptr, long size) {
        var address = nmemRealloc(ptr, size != 0 ? size : 1L);
        if (CHECKS && address == NULL) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    private static <T extends Buffer> T realloc(@Nullable T old_p, T new_p, int size) {
        if (old_p != null) {
            new_p.position(min(old_p.position(), size));
        }
        return new_p;
    }

    /**
     * The standard C realloc function.
     *
     * <p>Changes the size of the memory block pointed to by {@code ptr}. The function may move the memory block to a new location (whose address is returned
     * by the function). The content of the memory block is preserved up to the lesser of the new and old sizes, even if the block is moved to a new location.
     * If the new size is larger, the value of the newly allocated portion is indeterminate.</p>
     *
     * <p>The memory address used is always the address at the start of {@code ptr}, so the current position of {@code ptr} does not need to be set to 0 for
     * this function to work. The current position is preserved, even if the memory block is moved to a new location, unless {@code size} is less than the
     * current position in which case position will be equal to capacity. The limit is set to the capacity, and the mark is discarded.</p>
     *
     * @param ptr  a pointer to a memory block previously allocated with {@link #memAlloc}, {@link #memCalloc} or {@link #memRealloc}. Alternatively, this can
     *             be a {@link #NULL} pointer, in which case a new block is allocated (as if {@link #memAlloc} was called).
     * @param size the new size for the memory block, in bytes.
     *
     * @return a pointer to the reallocated memory block, which may be either the same as {@code ptr} or a new location
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory. The memory block pointed to by argument {@code ptr} is not
     *                          deallocated (it is still valid, and with its contents unchanged).
     */
    public static ByteBuffer memRealloc(@Nullable ByteBuffer ptr, int size) {
        return realloc(ptr, memByteBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), size), size), size);
    }

    /**
     * ShortBuffer version of {@link #memRealloc}.
     *
     * @param size the number of short values to allocate.
     */
    public static ShortBuffer memRealloc(@Nullable ShortBuffer ptr, int size) {
        return realloc(ptr, memShortBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), getAllocationSize(size, 1)), size), size);
    }

    /**
     * IntBuffer version of {@link #memRealloc}.
     *
     * @param size the number of int values to allocate.
     */
    public static IntBuffer memRealloc(@Nullable IntBuffer ptr, int size) {
        return realloc(ptr, memIntBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), getAllocationSize(size, 2)), size), size);
    }

    /**
     * LongBuffer version of {@link #memRealloc}.
     *
     * @param size the number of long values to allocate.
     */
    public static LongBuffer memRealloc(@Nullable LongBuffer ptr, int size) {
        return realloc(ptr, memLongBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), getAllocationSize(size, 3)), size), size);
    }

    /**
     * {@code CLongBuffer} version of {@link #memRealloc}.
     *
     * @param size the number of C long values to allocate.
     */
    public static CLongBuffer memRealloc(@Nullable CLongBuffer ptr, int size) {
        var buffer = memCLongBuffer(nmemReallocChecked(ptr == null ? NULL : ptr.address, getAllocationSize(size, CLONG_SIZE)), size);
        if (ptr != null) {
            buffer.position(min(ptr.position(), size));
        }
        return buffer;
    }

    /**
     * FloatBuffer version of {@link #memRealloc}.
     *
     * @param size the number of float values to allocate.
     */
    public static FloatBuffer memRealloc(@Nullable FloatBuffer ptr, int size) {
        return realloc(ptr, memFloatBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), getAllocationSize(size, 2)), size), size);
    }

    /**
     * DoubleBuffer version of {@link #memRealloc}.
     *
     * @param size the number of double values to allocate.
     */
    public static DoubleBuffer memRealloc(@Nullable DoubleBuffer ptr, int size) {
        return realloc(ptr, memDoubleBuffer(nmemReallocChecked(ptr == null ? NULL : memAddress0(ptr), getAllocationSize(size, 3)), size), size);
    }

    /**
     * PointerBuffer version of {@link #memRealloc}.
     *
     * @param size the number of pointer values to allocate.
     */
    public static PointerBuffer memRealloc(@Nullable PointerBuffer ptr, int size) {
        var buffer = memPointerBuffer(nmemReallocChecked(ptr == null ? NULL : ptr.address, getAllocationSize(size, POINTER_SHIFT)), size);
        if (ptr != null) {
            buffer.position(min(ptr.position(), size));
        }
        return buffer;
    }

    // --- [ memAlignedAlloc ] ---

    /** Unsafe version of {@link #memAlignedAlloc}. May return {@link #NULL} if {@code size} is zero or the allocation failed. */
    public static long nmemAlignedAlloc(long alignment, long size) {
        return ALLOCATOR.aligned_alloc(alignment, size);
    }

    /**
     * Unsafe version of {@link #memAlignedAlloc} that checks the returned pointer.
     *
     * @return a pointer to the memory block allocated by the function on success. This pointer will never be {@link #NULL}, even if {@code size} is zero.
     *
     * @throws OutOfMemoryError if the function failed to allocate the requested block of memory
     */
    public static long nmemAlignedAllocChecked(long alignment, long size) {
        var address = nmemAlignedAlloc(alignment, size != 0 ? size : 1L);
        if (CHECKS && address == NULL) {
            throw new OutOfMemoryError();
        }
        return address;
    }

    /**
     * The standard C aligned_alloc function.
     *
     * <p>Allocate {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}. The size parameter must be an integral
     * multiple of alignment. Memory allocated with memAlignedAlloc() must be freed with {@link #memAlignedFree}.</p>
     *
     * @param alignment the alignment. Must be a power of two value and a multiple of {@code sizeof(void *)}.
     * @param size      the number of bytes to allocate. Must be a multiple of {@code alignment}.
     */
    public static ByteBuffer memAlignedAlloc(int alignment, int size) {
        return wrapBufferByte(nmemAlignedAllocChecked(alignment, size), size);
    }

    // --- [ memAlignedFree ] ---

    /** Unsafe version of {@link #memAlignedFree}. */
    public static void nmemAlignedFree(long ptr) {
        ALLOCATOR.aligned_free(ptr);
    }

    /**
     * Frees a block of memory that was allocated with {@link #memAlignedAlloc}. If ptr is {@code NULL}, no operation is performed.
     *
     * @param ptr the aligned block of memory to free
     */
    public static void memAlignedFree(@Nullable ByteBuffer ptr) {
        if (ptr != null) {
            nmemAlignedFree(MemorySegment.ofBuffer(ptr).address() - ptr.position());
        }
    }

    // --- [ DebugAllocator ] ---

    /** The memory allocation report callback. */
    public interface MemoryAllocationReport {

        /**
         * Reports allocated memory.
         *
         * @param address    the address of the memory allocated. May be {@link #NULL}.
         * @param memory     the amount of memory allocated, in bytes
         * @param threadId   id of the thread that allocated the memory. May be {@link #NULL}.
         * @param threadName name of the thread that allocated the memory. May be {@code null}.
         * @param stacktrace the allocation stacktrace. May be {@code null}.
         */
        void invoke(long address, long memory, long threadId, @Nullable String threadName, @Nullable StackTraceElement... stacktrace);

        /** Specifies how to aggregate the reported allocations. */
        enum Aggregate {
            /** Allocations are aggregated over the whole process or thread. */
            ALL,
            /**
             * Allocations are aggregated based on the first stack trace element. This will return an allocation aggregate per method/line number, regardless of
             * how many different code paths lead to that specific method and line number.
             */
            GROUP_BY_METHOD,
            /** The allocations are aggregated based on the full stack trace chain. */
            GROUP_BY_STACKTRACE
        }
    }

    /**
     * Reports all live allocations.
     *
     * <p>This method can only be used if the {@link Configuration#DEBUG_MEMORY_ALLOCATOR} option has been set to true.</p>
     *
     * @param report the report callback
     */
    public static void memReport(MemoryAllocationReport report) {
        DebugAllocator.report(report);
    }

    /**
     * Reports aggregates for the live allocations.
     *
     * <p>This method can only be used if the {@link Configuration#DEBUG_MEMORY_ALLOCATOR} option has been set to true.</p>
     *
     * @param report            the report callback
     * @param groupByStackTrace how to aggregate the reported allocations
     * @param groupByThread     if the reported allocations should be grouped by thread
     */
    public static void memReport(MemoryAllocationReport report, Aggregate groupByStackTrace, boolean groupByThread) {
        DebugAllocator.report(report, groupByStackTrace, groupByThread);
    }

    /*  -------------------------------------
        -------------------------------------
                BUFFER MANAGEMENT API
        -------------------------------------
        ------------------------------------- */

    // --- [ memAddress0 ] ---

    /**
     * Returns the memory address of the specified buffer. [INTERNAL USE ONLY]
     *
     * @param buffer the buffer
     *
     * @return the memory address
     */
    public static long memAddress0(Buffer buffer) {
        var elementShift = switch (buffer) {
            case ByteBuffer _ -> 0;
            case ShortBuffer _, CharBuffer _ -> 1;
            case IntBuffer _, FloatBuffer _ -> 2;
            default -> 3;
        };
        return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << elementShift);
    }
    /** {@code ByteBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(ByteBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - buffer.position(); }
    /** {@code ShortBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(ShortBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 1); }
    /** {@code CharBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(CharBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 1); }
    /** {@code IntBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(IntBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 2); }
    /** {@code LongBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(LongBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 3); }
    /** {@code FloatBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(FloatBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 2); }
    /** {@code DoubleBuffer} version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(DoubleBuffer buffer) { return MemorySegment.ofBuffer(buffer).address() - ((long)buffer.position() << 3); }

    // --- [ Buffer address ] ---

    /**
     * Returns the memory address at the current position of the specified buffer. This is effectively a pointer value that can be used in native function
     * calls.
     *
     * @param buffer the buffer
     *
     * @return the memory address
     */
    public static long memAddress(ByteBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }

    /**
     * Returns the memory address at the specified position of the specified buffer.
     *
     * @param buffer   the buffer
     * @param position the buffer position
     *
     * @return the memory address
     *
     * @see #memAddress(ByteBuffer)
     */
    public static long memAddress(ByteBuffer buffer, int position) {
        return MemorySegment.ofBuffer(buffer).address() + Integer.toUnsignedLong(position) - buffer.position();
    }

    private static long address(Buffer buffer, int position, int elementShift) {
        return MemorySegment.ofBuffer(buffer).address() + ((Integer.toUnsignedLong(position) - buffer.position()) << elementShift);
    }

    /** ShortBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(ShortBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** ShortBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(ShortBuffer buffer, int position) { return address(buffer, position, 1); }

    /** CharBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(CharBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** CharBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(CharBuffer buffer, int position) { return address(buffer, position, 1); }

    /** IntBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(IntBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** IntBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(IntBuffer buffer, int position) { return address(buffer, position, 2); }

    /** FloatBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(FloatBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** FloatBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(FloatBuffer buffer, int position) { return address(buffer, position, 2); }

    /** LongBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(LongBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** LongBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(LongBuffer buffer, int position) { return address(buffer, position, 3); }

    /** DoubleBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(DoubleBuffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }
    /** DoubleBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(DoubleBuffer buffer, int position) { return address(buffer, position, 3); }

    /** Polymorphic version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(Buffer buffer) { return MemorySegment.ofBuffer(buffer).address(); }

    /** CustomBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(CustomBuffer<?> buffer) { return buffer.address(); }
    /** CustomBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(CustomBuffer<?> buffer, int position) { return buffer.address(position); }

    // --- [ Buffer address - Safe ] ---

    /** Null-safe version of {@link #memAddress(ByteBuffer)}. Returns {@link #NULL} if the specified buffer is null. */
    public static long memAddressSafe(@Nullable ByteBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** ShortBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable ShortBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** CharBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable CharBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** IntBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable IntBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** FloatBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable FloatBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** LongBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable LongBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** DoubleBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable DoubleBuffer buffer) { return buffer == null ? NULL : MemorySegment.ofBuffer(buffer).address(); }

    /** Pointer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(@Nullable Pointer pointer) { return pointer == null ? NULL : pointer.address(); }

    // --- [ Buffer allocation ] ---

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has the specified capacity. The returned ByteBuffer instance will be set
     * to the native {@link ByteOrder}.
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferByte(address, capacity);
    }

    /** Like {@link #memByteBuffer(long, int) memByteBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ByteBuffer memByteBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferByte(address, capacity);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link ShortBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asShortBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(ShortBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 1);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link CharBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asCharBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(CharBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 1);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link IntBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asIntBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(IntBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 2);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link LongBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asLongBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(LongBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 3);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link FloatBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asFloatBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(FloatBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 2);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link DoubleBuffer} between its current position and limit.
     *
     * <p>This operation is the inverse of {@link ByteBuffer#asDoubleBuffer()}. The returned {@code ByteBuffer} instance will be set to the native
     * {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(DoubleBuffer buffer) {
        return wrapBufferByte(memAddress(buffer), buffer.remaining() << 3);
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link CustomBuffer} between its current position and limit.
     *
     * <p>The returned {@code ByteBuffer} instance will be set to the native {@link ByteOrder}.</p>
     *
     * @param buffer the source buffer
     *
     * @return the {@code ByteBuffer} view
     */
    public static ByteBuffer memByteBuffer(CustomBuffer<?> buffer) {
        if (CHECKS && (MAX_BUFFER_SIZE / buffer.sizeof()) < buffer.remaining()) {
            throw new IllegalArgumentException("The source buffer range is too wide");
        }
        return wrapBufferByte(memAddress(buffer), buffer.remaining() * buffer.sizeof());
    }

    /**
     * Creates a {@link ByteBuffer} instance as a view of the specified {@link Struct}.
     *
     * <p>The returned {@code ByteBuffer} instance will be set to the native {@link ByteOrder}.</p>
     *
     * @param value the struct value
     *
     * @return the {@code ByteBuffer} view
     */
    public static <T extends Struct<T>> ByteBuffer memByteBuffer(T value) {
        return wrapBufferByte(value.address, value.sizeof());
    }

    /**
     * Creates a new direct ShortBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 2 bytes. If not, use {@code memByteBuffer(address, capacity * 2).asShortBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new ShortBuffer
     */
    public static ShortBuffer memShortBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferShort(address, capacity);
    }

    /** Like {@link #memShortBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ShortBuffer memShortBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferShort(address, capacity);
    }

    /**
     * Creates a new direct CharBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 2 bytes. If not, use {@code memByteBuffer(address, capacity * 2).asCharBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new CharBuffer
     */
    public static CharBuffer memCharBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferChar(address, capacity);
    }

    /** Like {@link #memCharBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static CharBuffer memCharBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferChar(address, capacity);
    }

    /**
     * Creates a new direct IntBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 4 bytes. If not, use {@code memByteBuffer(address, capacity * 4).asIntBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new IntBuffer
     */
    public static IntBuffer memIntBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferInt(address, capacity);
    }

    /** Like {@link #memIntBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static IntBuffer memIntBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferInt(address, capacity);
    }

    /**
     * Creates a new direct LongBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 8 bytes. If not, use {@code memByteBuffer(address, capacity * 8).asLongBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new LongBuffer
     */
    public static LongBuffer memLongBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferLong(address, capacity);
    }

    /** Like {@link #memLongBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static LongBuffer memLongBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferLong(address, capacity);
    }

    /**
     * Creates a new direct {@code CLongBuffer} that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 8 bytes. If not, use {@code memByteBuffer(address, capacity * 8).asLongBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new {@code CLongBuffer}
     */
    public static CLongBuffer memCLongBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return CLongBuffer.create(address, capacity);
    }

    /** Like {@link #memCLongBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static CLongBuffer memCLongBufferSafe(long address, int capacity) {
        return address == NULL ? null : CLongBuffer.create(address, capacity);
    }

    /**
     * Creates a new direct FloatBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 4 bytes. If not, use {@code memByteBuffer(address, capacity * 4).asFloatBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new FloatBuffer
     */
    public static FloatBuffer memFloatBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferFloat(address, capacity);
    }

    /** Like {@link #memFloatBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static FloatBuffer memFloatBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferFloat(address, capacity);
    }

    /**
     * Creates a new direct DoubleBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to 8 bytes. If not, use {@code memByteBuffer(address, capacity * 8).asDoubleBuffer()}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new DoubleBuffer
     */
    public static DoubleBuffer memDoubleBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return wrapBufferDouble(address, capacity);
    }

    /** Like {@link #memDoubleBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static DoubleBuffer memDoubleBufferSafe(long address, int capacity) {
        return address == NULL ? null : wrapBufferDouble(address, capacity);
    }

    /**
     * Creates a new PointerBuffer that starts at the specified memory address and has the specified capacity.
     *
     * <p>The {@code address} specified must be aligned to the pointer size. If not, use {@code PointerBuffer.create(memByteBuffer(address, capacity *
     * POINTER_SIZE))}.</p>
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new PointerBuffer
     */
    public static PointerBuffer memPointerBuffer(long address, int capacity) {
        if (CHECKS) {
            check(address);
        }
        return PointerBuffer.create(address, capacity);
    }

    /** Like {@link #memPointerBuffer}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static PointerBuffer memPointerBufferSafe(long address, int capacity) {
        return address == NULL ? null : PointerBuffer.create(address, capacity);
    }

    // --- [ Buffer duplication ] ---

    /**
     * Duplicates the specified buffer. The returned buffer will have the same {@link ByteOrder} as the source buffer.
     *
     * <p>This method should be preferred over {@link ByteBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static ByteBuffer memDuplicate(ByteBuffer buffer) { return buffer.duplicate().order(buffer.order()); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link ShortBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static ShortBuffer memDuplicate(ShortBuffer buffer) { return buffer.duplicate(); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link CharBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static CharBuffer memDuplicate(CharBuffer buffer) { return buffer.duplicate(); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link IntBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static IntBuffer memDuplicate(IntBuffer buffer) { return buffer.duplicate(); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link LongBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static LongBuffer memDuplicate(LongBuffer buffer) { return buffer.duplicate(); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link FloatBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static FloatBuffer memDuplicate(FloatBuffer buffer) { return buffer.duplicate(); }

    /**
     * Duplicates the specified buffer.
     *
     * <p>This method should be preferred over {@link DoubleBuffer#duplicate} because it has a much shorter call chain. Long call chains may fail to inline due
     * to JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to duplicate
     *
     * @return the duplicated buffer
     */
    public static DoubleBuffer memDuplicate(DoubleBuffer buffer) { return buffer.duplicate(); }

    // --- [ Buffer slicing ] ---

    /**
     * Slices the specified buffer. The returned buffer will have the same {@link ByteOrder} as the source buffer.
     *
     * <p>This method should be preferred over {@link ByteBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static ByteBuffer memSlice(ByteBuffer buffer) {
        return buffer.slice().order(NATIVE_ORDER);
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link ShortBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static ShortBuffer memSlice(ShortBuffer buffer) {
        return buffer.slice();
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link CharBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static CharBuffer memSlice(CharBuffer buffer) {
        return buffer.slice();
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link IntBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static IntBuffer memSlice(IntBuffer buffer) {
        return buffer.slice();
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link LongBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static LongBuffer memSlice(LongBuffer buffer) {
        return buffer.slice();
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link FloatBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static FloatBuffer memSlice(FloatBuffer buffer) {
        return buffer.slice();
    }

    /**
     * Slices the specified buffer.
     *
     * <p>This method should be preferred over {@link DoubleBuffer#slice} because it has a much shorter call chain. Long call chains may fail to inline due to
     * JVM limits, disabling important optimizations (e.g. scalar replacement via Escape Analysis).</p>
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     */
    public static DoubleBuffer memSlice(DoubleBuffer buffer) {
        return buffer.slice();
    }
    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}. The returned
     * buffer will have the same {@link ByteOrder} as the original buffer.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static ByteBuffer memSlice(ByteBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity).order(NATIVE_ORDER);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static ShortBuffer memSlice(ShortBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static CharBuffer memSlice(CharBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static IntBuffer memSlice(IntBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static LongBuffer memSlice(LongBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static FloatBuffer memSlice(FloatBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static DoubleBuffer memSlice(DoubleBuffer buffer, int offset, int capacity) {
        return buffer.slice(buffer.position() + offset, capacity);
    }

    /**
     * Returns a slice of the specified buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of the original buffer are preserved after a call to this method.</p>
     *
     * @param buffer   the buffer to slice
     * @param offset   the slice offset, it must be &le; {@code buffer.remaining()}
     * @param capacity the slice length, it must be &le; {@code buffer.capacity() - (buffer.position() + offset)}
     *
     * @return the sliced buffer
     */
    public static <T extends CustomBuffer<T>> T memSlice(T buffer, int offset, int capacity) { return buffer.slice(offset, capacity); }

    // --- [ memset ] ---

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(ByteBuffer ptr, int value) { memSet(memAddress(ptr), value, ptr.remaining()); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(ShortBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 1)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(CharBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 1)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(IntBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 2)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(LongBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 3)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(FloatBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 2)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     */
    public static void memSet(DoubleBuffer ptr, int value) { memSet(memAddress(ptr), value, apiGetBytes(ptr.remaining(), 3)); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     * @param <T>   the buffer type
     */
    public static <T extends CustomBuffer<T>> void memSet(T ptr, int value) { memSet(memAddress(ptr), value, Integer.toUnsignedLong(ptr.remaining()) * ptr.sizeof()); }

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     * @param <T>   the struct type
     */
    public static <T extends Struct<T>> void memSet(T ptr, int value) { memSet(ptr.address, value, ptr.sizeof()); }

    // --- [ memcpy ] ---

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(ByteBuffer src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), src.remaining());
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(ShortBuffer src, ShortBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 1));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(CharBuffer src, CharBuffer dst) {
        if (CHECKS) {
            check((Buffer)dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 1));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(IntBuffer src, IntBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 2));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(LongBuffer src, LongBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 3));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(FloatBuffer src, FloatBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 2));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     */
    public static void memCopy(DoubleBuffer src, DoubleBuffer dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), apiGetBytes(src.remaining(), 3));
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src the source memory address
     * @param dst the destination memory address
     * @param <T> the buffer type
     */
    public static <T extends CustomBuffer<T>> void memCopy(T src, T dst) {
        if (CHECKS) {
            check(dst, src.remaining());
        }
        memcpy(memAddress(src), memAddress(dst), Integer.toUnsignedLong(src.remaining()) * src.sizeof());
    }

    /**
     * Sets all bytes of a struct to a copy of another struct.
     *
     * @param src the source struct
     * @param dst the destination struct
     * @param <T> the struct type
     */
    public static <T extends Struct<T>> void memCopy(T src, T dst) {
        memcpy(src.address, dst.address, src.sizeof());
    }

    // --- [ Array to Buffer memcpy ] ---

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(byte[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(short[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, apiGetBytes(src.length, 1));
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }
    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(short[] src, ShortBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(int[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, apiGetBytes(src.length, 2));
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }
    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(int[] src, IntBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(long[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, apiGetBytes(src.length, 3));
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }
    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(long[] src, LongBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(float[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, apiGetBytes(src.length, 2));
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }
    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(float[] src, FloatBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(double[] src, ByteBuffer dst) {
        if (CHECKS) {
            check(dst, apiGetBytes(src.length, 3));
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }
    /**
     * Copies the source array to the current position of the destination buffer.
     *
     * @param src the source array
     * @param dst the destination buffer
     */
    public static void memCopy(double[] src, DoubleBuffer dst) {
        if (CHECKS) {
            check(dst, src.length);
        }
        memcpy(src, memAddress(dst), 0, src.length);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(byte[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(short[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, apiGetBytes(size, 1));
        }
        memcpy(src, memAddress(dst), offset, size);
    }
    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(short[] src, ShortBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(int[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, apiGetBytes(size, 2));
        }
        memcpy(src, memAddress(dst), offset, size);
    }
    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(int[] src, IntBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(long[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, apiGetBytes(size, 3));
        }
        memcpy(src, memAddress(dst), offset, size);
    }
    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(long[] src, LongBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(float[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, apiGetBytes(size, 2));
        }
        memcpy(src, memAddress(dst), offset, size);
    }
    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(float[] src, FloatBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(double[] src, ByteBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, apiGetBytes(size, 3));
        }
        memcpy(src, memAddress(dst), offset, size);
    }
    /**
     * Copies {@code size} elements from the source array, starting at {@code offset}, to the current position of the destination buffer.
     *
     * @param src    the source array
     * @param dst    the destination buffer
     * @param offset the offset into the source array
     * @param size   the number of elements to copy
     */
    public static void memCopy(double[] src, DoubleBuffer dst, int offset, int size) {
        if (CHECKS) {
            check(dst, size);
        }
        memcpy(src, memAddress(dst), offset, size);
    }

    // --- [ Buffer to Array memcpy ] ---

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, byte[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, short[] dst) {
        if (CHECKS) {
            check(src, apiGetBytes(dst.length, 1));
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }
    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ShortBuffer src, short[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, int[] dst) {
        if (CHECKS) {
            check(src, apiGetBytes(dst.length, 2));
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }
    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(IntBuffer src, int[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, long[] dst) {
        if (CHECKS) {
            check(src, apiGetBytes(dst.length, 3));
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }
    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(LongBuffer src, long[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, float[] dst) {
        if (CHECKS) {
            check(src, apiGetBytes(dst.length, 2));
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }
    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(FloatBuffer src, float[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(ByteBuffer src, double[] dst) {
        if (CHECKS) {
            check(src, apiGetBytes(dst.length, 3));
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }
    /**
     * Copies the source buffer to the destination array.
     *
     * @param src the source buffer
     * @param dst the destination array
     */
    public static void memCopy(DoubleBuffer src, double[] dst) {
        if (CHECKS) {
            check(src, dst.length);
        }
        memcpy(memAddress(src), dst, 0, dst.length);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, byte[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, short[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, apiGetBytes(size, 1));
        }
        memcpy(memAddress(src), dst, offset, size);
    }
    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ShortBuffer src, short[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, int[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, apiGetBytes(size, 2));
        }
        memcpy(memAddress(src), dst, offset, size);
    }
    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(IntBuffer src, int[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, long[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, apiGetBytes(size, 3));
        }
        memcpy(memAddress(src), dst, offset, size);
    }
    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(LongBuffer src, long[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, float[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, apiGetBytes(size, 2));
        }
        memcpy(memAddress(src), dst, offset, size);
    }
    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(FloatBuffer src, float[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(ByteBuffer src, double[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, apiGetBytes(size, 3));
        }
        memcpy(memAddress(src), dst, offset, size);
    }
    /**
     * Copies {@code size} elements from the source buffer to the destination array, starting at {@code offset}.
     *
     * @param src    the source buffer
     * @param dst    the destination array
     * @param offset the offset into the destination array
     * @param size   the number of elements to copy
     */
    public static void memCopy(DoubleBuffer src, double[] dst, int offset, int size) {
        if (CHECKS) {
            check(src, size);
        }
        memcpy(memAddress(src), dst, offset, size);
    }

    /*  -------------------------------------
        -------------------------------------
               UNSAFE MEMORY ACCESS API
        -------------------------------------
        ------------------------------------- */

    /**
     * Sets all bytes in a specified block of memory to a fixed value (usually zero).
     *
     * @param ptr   the starting memory address
     * @param value the value to set (memSet will convert it to unsigned byte)
     * @param bytes the number of bytes to set
     */
    public static void memSet(long ptr, int value, long bytes) {
        if (DEBUG && (ptr == NULL || bytes < 0)) {
            throw new IllegalArgumentException();
        }
        memset(ptr, value, bytes);
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src   the source memory address
     * @param dst   the destination memory address
     * @param bytes the number of bytes to copy
     */
    public static void memCopy(long src, long dst, long bytes) {
        if (DEBUG && (src == NULL || dst == NULL || bytes < 0)) {
            throw new IllegalArgumentException();
        }
        memcpy(src, dst, bytes);
    }

    public static void memCopy(byte[] src, long dst)                         { memcpy(src, dst, 0, src.length); }
    public static void memCopy(short[] src, long dst)                        { memcpy(src, dst, 0, src.length); }
    public static void memCopy(int[] src, long dst)                          { memcpy(src, dst, 0, src.length); }
    public static void memCopy(long[] src, long dst)                         { memcpy(src, dst, 0, src.length); }
    public static void memCopy(float[] src, long dst)                        { memcpy(src, dst, 0, src.length); }
    public static void memCopy(double[] src, long dst)                       { memcpy(src, dst, 0, src.length); }

    public static void memCopy(byte[] src, long dst, int offset, int size)   { memcpy(src, dst, offset, size); }
    public static void memCopy(short[] src, long dst, int offset, int size)  { memcpy(src, dst, offset, size); }
    public static void memCopy(int[] src, long dst, int offset, int size)    { memcpy(src, dst, offset, size); }
    public static void memCopy(long[] src, long dst, int offset, int size)   { memcpy(src, dst, offset, size); }
    public static void memCopy(float[] src, long dst, int offset, int size)  { memcpy(src, dst, offset, size); }
    public static void memCopy(double[] src, long dst, int offset, int size) { memcpy(src, dst, offset, size); }

    public static void memCopy(long src, byte[] dst)                         { memcpy(src, dst, 0, dst.length); }
    public static void memCopy(long src, short[] dst)                        { memcpy(src, dst, 0, dst.length); }
    public static void memCopy(long src, int[] dst)                          { memcpy(src, dst, 0, dst.length); }
    public static void memCopy(long src, long[] dst)                         { memcpy(src, dst, 0, dst.length); }
    public static void memCopy(long src, float[] dst)                        { memcpy(src, dst, 0, dst.length); }
    public static void memCopy(long src, double[] dst)                       { memcpy(src, dst, 0, dst.length); }

    public static void memCopy(long src, byte[] dst, int offset, int size)   { memcpy(src, dst, offset, size); }
    public static void memCopy(long src, short[] dst, int offset, int size)  { memcpy(src, dst, offset, size); }
    public static void memCopy(long src, int[] dst, int offset, int size)    { memcpy(src, dst, offset, size); }
    public static void memCopy(long src, long[] dst, int offset, int size)   { memcpy(src, dst, offset, size); }
    public static void memCopy(long src, float[] dst, int offset, int size)  { memcpy(src, dst, offset, size); }
    public static void memCopy(long src, double[] dst, int offset, int size) { memcpy(src, dst, offset, size); }

    // --

    /*
    private static final ValueLayout.OfShort  JAVA_SHORT  = DEBUG ? ValueLayout.JAVA_SHORT : ValueLayout.JAVA_SHORT_UNALIGNED;
    private static final ValueLayout.OfInt    JAVA_INT    = DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED;
    private static final ValueLayout.OfLong   JAVA_LONG   = DEBUG ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_LONG_UNALIGNED;
    private static final ValueLayout.OfFloat  JAVA_FLOAT  = DEBUG ? ValueLayout.JAVA_FLOAT : ValueLayout.JAVA_FLOAT_UNALIGNED;
    private static final ValueLayout.OfDouble JAVA_DOUBLE = DEBUG ? ValueLayout.JAVA_DOUBLE : ValueLayout.JAVA_DOUBLE_UNALIGNED;

    public static boolean memGetBoolean(long ptr)           { return MemorySegment.ofAddress(ptr).reinterpret(1L).get(ValueLayout.JAVA_BYTE, 0L) != 0; }
    public static byte memGetByte(long ptr)                 { return MemorySegment.ofAddress(ptr).reinterpret(1L).get(ValueLayout.JAVA_BYTE, 0L); }
    public static short memGetShort(long ptr)               { return MemorySegment.ofAddress(ptr).reinterpret(2L).get(JAVA_SHORT, 0L); }
    public static int memGetInt(long ptr)                   { return MemorySegment.ofAddress(ptr).reinterpret(4L).get(JAVA_INT, 0L); }
    public static long memGetLong(long ptr)                 { return MemorySegment.ofAddress(ptr).reinterpret(8L).get(JAVA_LONG, 0L); }
    public static float memGetFloat(long ptr)               { return MemorySegment.ofAddress(ptr).reinterpret(4L).get(JAVA_FLOAT, 0L); }
    public static double memGetDouble(long ptr)             { return MemorySegment.ofAddress(ptr).reinterpret(8L).get(JAVA_DOUBLE, 0L); }

    public static void memPutByte(long ptr, byte value)     { MemorySegment.ofAddress(ptr).reinterpret(1L).set(ValueLayout.JAVA_BYTE, 0L, value); }
    public static void memPutShort(long ptr, short value)   { MemorySegment.ofAddress(ptr).reinterpret(2L).set(JAVA_SHORT, 0L, value); }
    public static void memPutInt(long ptr, int value)       { MemorySegment.ofAddress(ptr).reinterpret(4L).set(JAVA_INT, 0L, value); }
    public static void memPutLong(long ptr, long value)     { MemorySegment.ofAddress(ptr).reinterpret(8L).set(JAVA_LONG, 0L, value); }
    public static void memPutFloat(long ptr, float value)   { MemorySegment.ofAddress(ptr).reinterpret(4L).set(JAVA_FLOAT, 0L, value); }
    public static void memPutDouble(long ptr, double value) { MemorySegment.ofAddress(ptr).reinterpret(8L).set(JAVA_DOUBLE, 0L, value); }
    */

    private static final VarHandle VH_JAVA_BYTE;
    private static final VarHandle VH_JAVA_SHORT;
    private static final VarHandle VH_JAVA_INT;
    private static final VarHandle VH_JAVA_LONG;
    private static final VarHandle VH_JAVA_FLOAT;
    private static final VarHandle VH_JAVA_DOUBLE;

    private static final VarHandle VH_CLONG;
    private static final VarHandle VH_ADDRESS;

    static {
        try {
            var lookup = MethodHandles.lookup();

            var ofAddress = lookup
                .findStatic(MemorySegment.class, "ofAddress", MethodType.methodType(MemorySegment.class, long.class));

            var reinterpret = lookup
                .findVirtual(MemorySegment.class, "reinterpret", MethodType.methodType(MemorySegment.class, long.class));

            VH_JAVA_BYTE = createMemoryAccessVH(ValueLayout.JAVA_BYTE, ofAddress, reinterpret)
                .withInvokeExactBehavior();
            VH_JAVA_SHORT = createMemoryAccessVH(DEBUG ? ValueLayout.JAVA_SHORT : ValueLayout.JAVA_SHORT_UNALIGNED, ofAddress, reinterpret)
                .withInvokeExactBehavior();
            VH_JAVA_INT = createMemoryAccessVH(DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED, ofAddress, reinterpret)
                .withInvokeExactBehavior();
            VH_JAVA_LONG = createMemoryAccessVH(DEBUG ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_LONG_UNALIGNED, ofAddress, reinterpret)
                .withInvokeExactBehavior();
            VH_JAVA_FLOAT = createMemoryAccessVH(DEBUG ? ValueLayout.JAVA_FLOAT : ValueLayout.JAVA_FLOAT_UNALIGNED, ofAddress, reinterpret)
                .withInvokeExactBehavior();
            VH_JAVA_DOUBLE = createMemoryAccessVH(DEBUG ? ValueLayout.JAVA_DOUBLE : ValueLayout.JAVA_DOUBLE_UNALIGNED, ofAddress, reinterpret)
                .withInvokeExactBehavior();

            var vh = createMemoryAccessVH(
                CLONG_SIZE == 8
                    ? (DEBUG ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_LONG_UNALIGNED)
                    : (DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED), ofAddress, reinterpret);

            if (CLONG_SIZE == 4) {
                vh = MethodHandles.filterValue(vh,
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(int.class),
                        MethodType.methodType(int.class, long.class)
                    ),
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(long.class),
                        MethodType.methodType(long.class, int.class)
                    )
                );
            }

            VH_CLONG = vh.withInvokeExactBehavior();

            vh = createMemoryAccessVH(BITS64
                ? (DEBUG ? ValueLayout.JAVA_LONG : ValueLayout.JAVA_LONG_UNALIGNED)
                : (DEBUG ? ValueLayout.JAVA_INT : ValueLayout.JAVA_INT_UNALIGNED), ofAddress, reinterpret);

            if (BITS32) {
                vh = MethodHandles.filterValue(vh,
                    MethodHandles.explicitCastArguments(
                        MethodHandles.identity(int.class),
                        MethodType.methodType(int.class, long.class)
                    ),
                    lookup.findStatic(
                        MemoryUtil.class, "castAddress32",
                        MethodType.methodType(long.class, int.class)
                    )
                );
            }

            VH_ADDRESS = vh.withInvokeExactBehavior();
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static VarHandle createMemoryAccessVH(ValueLayout layout, MethodHandle ofAddress, MethodHandle reinterpret) {
        var vh = layout.varHandle();

        vh = MethodHandles.insertCoordinates(vh, 1, 0L);
        vh = MethodHandles.filterCoordinates(vh, 0, MethodHandles.filterReturnValue(
            ofAddress,
            MethodHandles.insertArguments(reinterpret, 1, layout.byteSize())
        ));

        return vh;
    }

    private static long castAddress32(int ptr) {
        return ptr & 0xFFFF_FFFFL;
    }

    public static boolean memGetBoolean(long ptr)           { return (byte)VH_JAVA_BYTE.get(ptr) != 0; }
    public static byte memGetByte(long ptr)                 { return (byte)VH_JAVA_BYTE.get(ptr); }
    public static short memGetShort(long ptr)               { return (short)VH_JAVA_SHORT.get(ptr); }
    public static int memGetInt(long ptr)                   { return (int)VH_JAVA_INT.get(ptr); }
    public static long memGetLong(long ptr)                 { return (long)VH_JAVA_LONG.get(ptr); }
    public static float memGetFloat(long ptr)               { return (float)VH_JAVA_FLOAT.get(ptr); }
    public static double memGetDouble(long ptr)             { return (double)VH_JAVA_DOUBLE.get(ptr); }

    public static void memPutByte(long ptr, byte value)     { VH_JAVA_BYTE.set(ptr, value); }
    public static void memPutShort(long ptr, short value)   { VH_JAVA_SHORT.set(ptr, value); }
    public static void memPutInt(long ptr, int value)       { VH_JAVA_INT.set(ptr, value); }
    public static void memPutLong(long ptr, long value)     { VH_JAVA_LONG.set(ptr, value); }
    public static void memPutFloat(long ptr, float value)   { VH_JAVA_FLOAT.set(ptr, value); }
    public static void memPutDouble(long ptr, double value) { VH_JAVA_DOUBLE.set(ptr, value); }

    public static long memGetCLong(long ptr) {
        return (long)VH_CLONG.get(ptr);
        /*return CLONG_SIZE == 8
            ? memGetLong(ptr)
            : memGetInt(ptr);*/
    }

    public static long memGetAddress(long ptr) {
        return (long)VH_ADDRESS.get(ptr);
        /*return BITS64
            ? memGetLong(ptr)
            : memGetInt(ptr) & 0xFFFF_FFFFL;*/
    }

    public static void memPutCLong(long ptr, long value) {
        VH_CLONG.set(ptr, value);
        /*if (CLONG_SIZE == 8) {
            memPutLong(ptr, value);
        } else {
            memPutInt(ptr, (int)value);
        }*/
    }

    public static void memPutAddress(long ptr, long value) {
        VH_ADDRESS.set(ptr, value);
        /*if (BITS64) {
            memPutLong(ptr, value);
        } else {
            memPutInt(ptr, (int)value);
        }*/
    }

    /*  -------------------------------------
        -------------------------------------
              MemorySegment UTILITIES API
        -------------------------------------
        ------------------------------------- */

    public static boolean memGetBoolean(MemorySegment segment, long offset)                 { return memGetBoolean(segment.address() + offset); }
    public static byte memGetByte(MemorySegment segment, long offset)                       { return memGetByte(segment.address() + offset); }
    public static short memGetShort(MemorySegment segment, long offset)                     { return memGetShort(segment.address() + offset); }
    public static int memGetInt(MemorySegment segment, long offset)                         { return memGetInt(segment.address() + offset); }
    public static long memGetLong(MemorySegment segment, long offset)                       { return memGetLong(segment.address() + offset); }
    public static float memGetFloat(MemorySegment segment, long offset)                     { return memGetFloat(segment.address() + offset); }
    public static double memGetDouble(MemorySegment segment, long offset)                   { return memGetDouble(segment.address() + offset); }
    public static long memGetCLong(MemorySegment segment, long offset)                      { return memGetCLong(segment.address() + offset); }
    public static long memGetAddress(MemorySegment segment, long offset)                    { return memGetAddress(segment.address() + offset); }

    public static void memPutByte(MemorySegment segment, long offset, byte value)           { memPutByte(segment.address() + offset, value); }
    public static void memPutShort(MemorySegment segment, long offset, short value)         { memPutShort(segment.address() + offset, value); }
    public static void memPutInt(MemorySegment segment, long offset, int value)             { memPutInt(segment.address() + offset, value); }
    public static void memPutLong(MemorySegment segment, long offset, long value)           { memPutLong(segment.address() + offset, value); }
    public static void memPutFloat(MemorySegment segment, long offset, float value)         { memPutFloat(segment.address() + offset, value); }
    public static void memPutDouble(MemorySegment segment, long offset, double value)       { memPutDouble(segment.address() + offset, value); }
    public static void memPutCLong(MemorySegment segment, long offset, long value)          { memPutCLong(segment.address() + offset, value); }
    public static void memPutAddress(MemorySegment segment, long offset, long value)        { memPutAddress(segment.address() + offset, value); }

    public static short memGetShortAtIndex(MemorySegment segment, long index)               { return memGetShort(segment.address() + (index << 1)); }
    public static int memGetIntAtIndex(MemorySegment segment, long index)                   { return memGetInt(segment.address() + (index << 2)); }
    public static long memGetLongAtIndex(MemorySegment segment, long index)                 { return memGetLong(segment.address() + (index << 3)); }
    public static float memGetFloatAtIndex(MemorySegment segment, long index)               { return memGetFloat(segment.address() + (index << 2)); }
    public static double memGetDoubleAtIndex(MemorySegment segment, long index)             { return memGetDouble(segment.address() + (index << 3)); }
    public static long memGetCLongAtIndex(MemorySegment segment, long index)                { return memGetCLong(segment.address() + (index << CLONG_SHIFT)); }
    public static long memGetAddressAtIndex(MemorySegment segment, long index)              { return memGetAddress(segment.address() + (index << POINTER_SHIFT)); }

    public static void memPutShortAtIndex(MemorySegment segment, long index, short value)   { memPutShort(segment.address() + (index << 1), value); }
    public static void memPutIntAtIndex(MemorySegment segment, long index, int value)       { memPutInt(segment.address() + (index << 2), value); }
    public static void memPutLongAtIndex(MemorySegment segment, long index, long value)     { memPutLong(segment.address() + (index << 3), value); }
    public static void memPutFloatAtIndex(MemorySegment segment, long index, float value)   { memPutFloat(segment.address() + (index << 2), value); }
    public static void memPutDoubleAtIndex(MemorySegment segment, long index, double value) { memPutDouble(segment.address() + (index << 3), value); }
    public static void memPutCLongAtIndex(MemorySegment segment, long index, long value)    { memPutCLong(segment.address() + (index << CLONG_SHIFT), value); }
    public static void memPutAddressAtIndex(MemorySegment segment, long index, long value)  { memPutAddress(segment.address() + (index << POINTER_SHIFT), value); }

    /*  -------------------------------------
        -------------------------------------
                  JNI UTILITIES API
        -------------------------------------
        ------------------------------------- */

    /**
     * Returns the object that the specified global reference points to.
     *
     * @param globalRef the global reference
     * @param <T>       the object type
     *
     * @return the object pointed to by {@code globalRef}
     */
    public static native <T> T memGlobalRefToObject(long globalRef);

    /*  -------------------------------------
        -------------------------------------
                  TEXT ENCODING API
        -------------------------------------
        ------------------------------------- */

    private static int write8(long target, int offset, int value) {
        memPutByte(target + Integer.toUnsignedLong(offset), (byte)value);
        return offset + 1;
    }
    private static int write8Safe(long target, int offset, int maxLength, int value) {
        if (offset == maxLength) {
            throw new BufferOverflowException();
        }
        memPutByte(target + Integer.toUnsignedLong(offset), (byte)value);
        return offset + 1;
    }
    private static int write16(long target, int offset, char value) {
        memPutShort(target + Integer.toUnsignedLong(offset), (short)value);
        return offset + 2;
    }

    /**
     * Returns a ByteBuffer containing the specified text ASCII encoded and null-terminated.
     *
     * @param text the text to encode
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memASCII(CharSequence text) {
        return memASCII(text, true);
    }

    /** Like {@link #memASCII(CharSequence) memASCII}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memASCIISafe(@Nullable CharSequence text) {
        return text == null ? null : memASCII(text, true);
    }

    /**
     * Returns a {@link ByteBuffer} containing the specified text ASCII encoded and optionally null-terminated.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memASCII(CharSequence text, boolean nullTerminated) {
        var length = memLengthASCII(text, nullTerminated);
        var target = nmemAlloc(length);
        if (CHECKS && target == NULL) {
            throw new OutOfMemoryError();
        }
        encodeASCIIUnsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    /** Like {@link #memASCII(CharSequence, boolean) memASCII}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memASCIISafe(@Nullable CharSequence text, boolean nullTerminated) {
        return text == null ? null : memASCII(text, nullTerminated);
    }

    /**
     * Encodes and optionally null-terminates the specified text using ASCII encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * current buffer position. The current buffer position is not modified by this operation.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'
     * @param target         the buffer where the encoded text should be stored
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.remaining()} bytes are required to encode the text.
     */
    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        var address = memAddress(target);
        return encodeASCIIUnsafe(text, nullTerminated, address);
    }

    /**
     * Encodes and optionally null-terminates the specified text using ASCII encoding. The encoded text is stored in the specified {@link ByteBuffer} at the
     * specified {@code position} offset. The current buffer position is not modified by this operation.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param offset         the buffer position to which the string will be encoded
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.capacity() - offset} bytes are required to encode the text.
     */
    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeASCIIUnsafe(text, nullTerminated, memAddress(target, offset));
    }

    static int encodeASCIIUnsafe(CharSequence text, boolean nullTerminated, long target) {
        int i = 0, len = text.length();

        while (i < len) {
            i = write8(target, i, text.charAt(i));
        }

        if (nullTerminated) {
            i = write8(target, i, 0);
        }

        return i;
    }

    /**
     * Returns the number of bytes required to encode the specified text in the ASCII encoding.
     *
     * @param value          the text to encode
     * @param nullTerminated if true, add the number of bytes required for null-termination
     *
     * @return the number of bytes
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static int memLengthASCII(CharSequence value, boolean nullTerminated) {
        var len = value.length() + (nullTerminated ? 1 : 0);
        if (len < 0) {
            throw new BufferOverflowException();
        }
        return len;
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-8 encoded and null-terminated.
     *
     * @param text the text to encode
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memUTF8(CharSequence text) {
        return memUTF8(text, true);
    }

    /** Like {@link #memUTF8(CharSequence) memUTF8}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memUTF8Safe(@Nullable CharSequence text) {
        return text == null ? null : memUTF8(text, true);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-8 encoded and optionally null-terminated.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memUTF8(CharSequence text, boolean nullTerminated) {
        var length = memLengthUTF8(text, nullTerminated);
        var target = nmemAlloc(length);
        if (CHECKS && target == NULL) {
            throw new OutOfMemoryError();
        }
        encodeUTF8Unsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    /** Like {@link #memUTF8(CharSequence, boolean) memUTF8}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memUTF8Safe(@Nullable CharSequence text, boolean nullTerminated) {
        return text == null ? null : memUTF8(text, nullTerminated);
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-8 encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * current buffer position. The current buffer position is not modified by this operation.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.remaining} bytes are required to encode the text.
     */
    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeUTF8Safe(text, nullTerminated, memAddress(target), target.remaining());
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-8 encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * specified {@code position} offset. The current buffer position is not modified by this operation.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     * @param offset         the buffer position to which the string will be encoded
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.capacity() - offset} bytes are required to encode the text.
     */
    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthASCII(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        return encodeUTF8Safe(text, nullTerminated, memAddress(target, offset), target.capacity() - offset);
    }

    static int encodeUTF8Unsafe(CharSequence text, boolean nullTerminated, long target) {
        int p = 0, i = 0, len = text.length();

        while (i < len) {
            var c = text.charAt(i++);
            if (c < 0x80) {
                p = write8(target, p, c);
            } else {
                int cp = c;
                if (c < 0x800) {
                    p = write8(target, p, 0xC0 | cp >> 6);
                } else {
                    if (!isHighSurrogate(c)) {
                        p = write8(target, p, 0xE0 | cp >> 12);
                    } else {
                        cp = toCodePoint(c, text.charAt(i++));

                        p = write8(target, p, 0xF0 | cp >> 18);
                        p = write8(target, p, 0x80 | cp >> 12 & 0x3F);
                    }
                    p = write8(target, p, 0x80 | cp >> 6 & 0x3F);
                }
                p = write8(target, p, 0x80 | cp & 0x3F);
            }
        }

        if (nullTerminated) {
            p = write8(target, p, 0);
        }

        return p;
    }

    static int encodeUTF8Safe(CharSequence text, boolean nullTerminated, long target, int maxLength) {
        int p = 0, i = 0, length = text.length();

        // ASCII fast path
        while (i < length) {
            var c = text.charAt(i);
            if (0x80 <= c) {
                break;
            }
            p = write8(target, p, c); // have already checked that text.length() <= maxLength
            i++;
        }

        // Slow path
        while (i < length) {
            var c = text.charAt(i++);
            if (c < 0x80) {
                p = write8Safe(target, p, maxLength, c);
            } else {
                int cp = c;
                if (c < 0x800) {
                    p = write8Safe(target, p, maxLength, 0xC0 | cp >> 6);
                } else {
                    if (!isHighSurrogate(c)) {
                        p = write8Safe(target, p, maxLength, 0xE0 | cp >> 12);
                    } else {
                        cp = toCodePoint(c, text.charAt(i++));

                        p = write8Safe(target, p, maxLength, 0xF0 | cp >> 18);
                        p = write8Safe(target, p, maxLength, 0x80 | cp >> 12 & 0x3F);
                    }
                    p = write8Safe(target, p, maxLength, 0x80 | cp >> 6 & 0x3F);
                }
                p = write8Safe(target, p, maxLength, 0x80 | cp & 0x3F);
            }
        }

        if (nullTerminated) {
            p = write8Safe(target, p, maxLength, 0);
        }

        return p;
    }

    /**
     * Returns the number of bytes required to encode the specified text in the UTF-8 encoding.
     *
     * @param value          the text to encode
     * @param nullTerminated if true, add the number of bytes required for null-termination
     *
     * @return the number of bytes
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static int memLengthUTF8(CharSequence value, boolean nullTerminated) {
        var len   = value.length();
        var bytes = len + (nullTerminated ? 1 : 0); // start with 1:1

        for (var i = 0; i < len; i++) {
            var c = value.charAt(i);

            if (c < 0x80) {
                // 1 input char -> 1 output byte
            } else {
                if (c < 0x800) {
                    // c <= 127: 0 (1 input char -> 1 output byte)
                    // c >= 128: 1 (1 input char -> 2 output bytes)
                    bytes += (0x7F - c) >>> 31;
                } else {
                    // non-high-surrogate: 1 input char  -> 3 output bytes
                    //     surrogate-pair: 2 input chars -> 4 output bytes
                    bytes += 2;
                    if (isHighSurrogate(c)) {
                        i++;
                    }
                }
                if (bytes < 0) {
                    throw new BufferOverflowException();
                }
            }
        }

        if (bytes < 0) {
            throw new BufferOverflowException();
        }

        return bytes;
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-16 encoded and null-terminated.
     *
     * @param text the text to encode
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memUTF16(CharSequence text) {
        return memUTF16(text, true);
    }

    /** Like {@link #memUTF16(CharSequence) memUTF16}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memUTF16Safe(@Nullable CharSequence text) {
        return text == null ? null : memUTF16(text, true);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-16 encoded and optionally null-terminated.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text. The returned buffer must be deallocated manually with {@link #memFree}.
     *
     * @throws BufferOverflowException if more than {@link Integer#MAX_VALUE} bytes are required to encode the text.
     */
    public static ByteBuffer memUTF16(CharSequence text, boolean nullTerminated) {
        var length = memLengthUTF16(text, nullTerminated);
        var target = nmemAlloc(length);
        if (CHECKS && target == NULL) {
            throw new OutOfMemoryError();
        }
        encodeUTF16Unsafe(text, nullTerminated, target);
        return wrapBufferByte(target, length);
    }

    /** Like {@link #memUTF16(CharSequence, boolean) memUTF16}, but returns {@code null} if {@code text} is {@code null}. */
    @Nullable
    public static ByteBuffer memUTF16Safe(@Nullable CharSequence text, boolean nullTerminated) {
        return text == null ? null : memUTF16(text, nullTerminated);
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-16 encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * current buffer position. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough remaining
     * space to store the encoded text.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.remaining()} bytes are required to encode the text.
     */
    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        if (target.remaining() < memLengthUTF16(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        var address = memAddress(target);
        return encodeUTF16Unsafe(text, nullTerminated, address);
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-16 encoding. The encoded text is stored in the specified {@link ByteBuffer} at the
     * specified {@code position} offset. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough
     * remaining space to store the encoded text.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     * @param offset         the buffer position to which the string will be encoded
     *
     * @return the number of bytes of the encoded string
     *
     * @throws BufferOverflowException if more than {@code target.capacity() - offset} bytes are required to encode the text.
     */
    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        if (target.capacity() - offset < memLengthUTF16(text, nullTerminated)) {
            throw new BufferOverflowException();
        }
        var address = memAddress(target, offset);
        return encodeUTF16Unsafe(text, nullTerminated, address);
    }

    static int encodeUTF16Unsafe(CharSequence text, boolean nullTerminated, long target) {
        int p = 0, i = 0, len = text.length();

        while (i < len) {
            p = write16(target, p, text.charAt(i++));
        }

        if (nullTerminated) {
            p = write16(target, p, '\0');
        }

        return p;
    }

    /**
     * Returns the number of bytes required to encode the specified text in the UTF-16 encoding.
     *
     * @param value          the text to encode
     * @param nullTerminated if true, add the number of bytes required for null-termination
     *
     * @return the number of bytes
     */
    public static int memLengthUTF16(CharSequence value, boolean nullTerminated) {
        var len = value.length() + (nullTerminated ? 1 : 0);
        if (len < 0 || 0x3FFFFFFF < len) {
            throw new BufferOverflowException();
        }
        return len << 1;
    }

    /*  -------------------------------------
        -------------------------------------
                  TEXT DECODING API
        -------------------------------------
        ------------------------------------- */

    private static int memLengthNT1(long address, int maxLength) {
        if (CHECKS) {
            check(address);
        }
        return BITS64
            ? strlen64NT1(address, maxLength)
            : strlen32NT1(address, maxLength);
    }

    private static int strlen64NT1(long address, int maxLength) {
        var i = 0;

        if (8 <= maxLength) {
            var misalignment = (int)address & 7;
            if (misalignment != 0) {
                // Align to 8 bytes
                for (var len = 8 - misalignment; i < len; i++) {
                    if (memGetByte(address + i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned longs for performance
            for (; i <= maxLength - 8; i += 8) {
                if (mathHasZeroByte(memGetLong(address + i))) {
                    break;
                }
            }
        }

        // Tail
        for (; i < maxLength; i++) {
            if (memGetByte(address + i) == 0) {
                break;
            }
        }

        return i;
    }

    private static int strlen32NT1(long address, int maxLength) {
        var i = 0;

        if (4 <= maxLength) {
            var misalignment = (int)address & 3;
            if (misalignment != 0) {
                // Align to 4 bytes
                for (var len = 4 - misalignment; i < len; i++) {
                    if (memGetByte(address + i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned ints for performance
            for (; i <= maxLength - 4; i += 4) {
                if (mathHasZeroByte(memGetInt(address + i))) {
                    break;
                }
            }
        }

        // Tail
        for (; i < maxLength; i++) {
            if (memGetByte(address + i) == 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Calculates the length, in bytes, of the null-terminated string that starts at the current position of the specified buffer. A single \0 character will
     * terminate the string. The returned length will NOT include the \0 byte.
     *
     * <p>This method is useful for reading ASCII and UTF8 encoded text.</p>
     *
     * @param buffer the buffer containing the null-terminated string
     *
     * @return the string length, in bytes
     */
    public static int memLengthNT1(ByteBuffer buffer) {
        return memLengthNT1(memAddress(buffer), buffer.remaining());
    }

    private static int memLengthNT2(long address, int maxLength) {
        if (CHECKS) {
            check(address);
        }
        return BITS64
            ? strlen64NT2(address, maxLength)
            : strlen32NT2((int)address, maxLength);
    }

    private static int strlen64NT2(long address, int maxLength) {
        var i = 0;

        if (8 <= maxLength) {
            var misalignment = (int)address & 7;
            if (misalignment != 0) {
                // Align to 8 bytes
                for (var len = 8 - misalignment; i < len; i += 2) {
                    if (memGetShort(address + i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned longs for performance
            for (; i <= maxLength - 8; i += 8) {
                if (mathHasZeroShort(memGetLong(address + i))) {
                    break;
                }
            }
        }

        // Tail
        for (; i < maxLength; i += 2) {
            if (memGetShort(address + i) == 0) {
                break;
            }
        }

        return i;
    }

    private static int strlen32NT2(long address, int maxLength) {
        var i = 0;

        if (4 <= maxLength) {
            var misalignment = (int)address & 3;
            if (misalignment != 0) {
                // Align to 4 bytes
                for (var len = 4 - misalignment; i < len; i += 2) {
                    if (memGetShort(address + i) == 0) {
                        return i;
                    }
                }
            }

            // Aligned longs for performance
            while (i <= maxLength - 4) {
                if (mathHasZeroShort(memGetInt(address + i))) {
                    break;
                }
                i += 4;
            }
        }

        // Tail
        for (; i < maxLength; i += 2) {
            if (memGetShort(address + i) == 0) {
                break;
            }
        }

        return i;
    }

    /**
     * Calculates the length, in bytes, of the null-terminated string that starts at the current position of the specified buffer. Two \0 characters will
     * terminate the string. The returned buffer will NOT include the \0 bytes.
     *
     * <p>This method is useful for reading UTF16 encoded text.</p>
     *
     * @param buffer the buffer containing the null-terminated string
     *
     * @return the string length, in bytes
     */
    public static int memLengthNT2(ByteBuffer buffer) {
        return memLengthNT2(memAddress(buffer), buffer.remaining());
    }

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has capacity equal to the null-terminated string starting at that
     * address. A single \0 character will terminate the string. The returned buffer will NOT include the \0 byte.
     *
     * <p>This method is useful for reading ASCII and UTF8 encoded text.</p>
     *
     * @param address the starting memory address
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBufferNT1(long address) {
        return memByteBuffer(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has capacity equal to the null-terminated string starting at that
     * address, up to a maximum of {@code maxLength} bytes. A single \0 character will terminate the string. The returned buffer will NOT include the \0 byte.
     *
     * <p>This method is useful for reading ASCII and UTF8 encoded text.</p>
     *
     * @param address   the starting memory address
     * @param maxLength the maximum string length, in bytes
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBufferNT1(long address, int maxLength) {
        return memByteBuffer(address, memLengthNT1(address, maxLength));
    }

    /** Like {@link #memByteBufferNT1(long) memByteBufferNT1}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ByteBuffer memByteBufferNT1Safe(long address) {
        return address == NULL ? null : memByteBuffer(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /** Like {@link #memByteBufferNT1(long, int) memByteBufferNT1}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ByteBuffer memByteBufferNT1Safe(long address, int maxLength) {
        return address == NULL ? null : memByteBuffer(address, memLengthNT1(address, maxLength));
    }

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has capacity equal to the null-terminated string starting at that
     * address. Two \0 characters will terminate the string. The returned buffer will NOT include the \0 bytes.
     *
     * <p>This method is useful for reading UTF16 encoded text.</p>
     *
     * @param address the starting memory address
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBufferNT2(long address) {
        return memByteBufferNT2(address, MAX_BUFFER_SIZE - 1);
    }

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has capacity equal to the null-terminated string starting at that
     * address, up to a maximum of {@code maxLength} bytes. Two \0 characters will terminate the string. The returned buffer will NOT include the \0 bytes.
     *
     * <p>This method is useful for reading UTF16 encoded text.</p>
     *
     * @param address the starting memory address
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBufferNT2(long address, int maxLength) {
        if (DEBUG) {
            if ((maxLength & 1) != 0) {
                throw new IllegalArgumentException("The maximum length must be an even number.");
            }
        }
        return memByteBuffer(address, memLengthNT2(address, maxLength));
    }

    /** Like {@link #memByteBufferNT2(long) memByteBufferNT2}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ByteBuffer memByteBufferNT2Safe(long address) {
        return address == NULL ? null : memByteBufferNT2(address, MAX_BUFFER_SIZE - 1);
    }

    /** Like {@link #memByteBufferNT2(long, int) memByteBufferNT2}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static ByteBuffer memByteBufferNT2Safe(long address, int maxLength) {
        return address == NULL ? null : memByteBufferNT2(address, maxLength);
    }

    /**
     * Converts the null-terminated ASCII encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String}
     */
    public static String memASCII(long address) {
        return memASCII(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /**
     * Converts the ASCII encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     * @param length  the number of bytes to decode
     *
     * @return the decoded {@link String}
     */
    @SuppressWarnings("deprecation")
    public static String memASCII(long address, int length) {
        if (length <= 0) {
            return "";
        }

        var ascii = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memByteBuffer(address, length).get(ascii, 0, length);
        return new String(ascii, 0, 0, length);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as an ASCII string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     *
     * @return the decoded {@link String}
     */
    public static String memASCII(ByteBuffer buffer) {
        return memASCII(memAddress(buffer), buffer.remaining());
    }

    /** Like {@link #memASCII(long) memASCII}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memASCIISafe(long address) {
        return address == NULL ? null : memASCII(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /** Like {@link #memASCII(long, int) memASCII}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memASCIISafe(long address, int length) {
        return address == NULL ? null : memASCII(address, length);
    }

    /** Like {@link #memASCII(ByteBuffer) memASCII}, but returns {@code null} if {@code buffer} is {@code null}. */
    @Nullable
    public static String memASCIISafe(@Nullable ByteBuffer buffer) {
        return buffer == null ? null : memASCII(memAddress(buffer), buffer.remaining());
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, as an ASCII string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of bytes to decode
     *
     * @return the decoded {@link String}
     */
    public static String memASCII(ByteBuffer buffer, int length) {
        return memASCII(memAddress(buffer), length);
    }

    /**
     * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, as an ASCII string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of bytes to decode
     * @param offset the offset at which to start decoding.
     *
     * @return the decoded {@link String}
     */
    public static String memASCII(ByteBuffer buffer, int length, int offset) {
        return memASCII(memAddress(buffer, offset), length);
    }

    /**
     * Converts the null-terminated UTF-8 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String}
     */
    public static String memUTF8(long address) {
        return MultiReleaseTextDecoding.decodeUTF8(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /**
     * Converts the UTF-8 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     * @param length  the number of bytes to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF8(long address, int length) {
        return MultiReleaseTextDecoding.decodeUTF8(address, length);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-8 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF8(ByteBuffer buffer) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), buffer.remaining());
    }

    /** Like {@link #memUTF8(long) memUTF8}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memUTF8Safe(long address) {
        return address == NULL ? null : MultiReleaseTextDecoding.decodeUTF8(address, memLengthNT1(address, MAX_BUFFER_SIZE));
    }

    /** Like {@link #memUTF8(long, int) memUTF8}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memUTF8Safe(long address, int length) {
        return address == NULL ? null : MultiReleaseTextDecoding.decodeUTF8(address, length);
    }

    /** Like {@link #memUTF8(ByteBuffer) memUTF8}, but returns {@code null} if {@code buffer} is {@code null}. */
    @Nullable
    public static String memUTF8Safe(@Nullable ByteBuffer buffer) {
        return buffer == null ? null : MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), buffer.remaining());
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+length}) in {@code buffer}, as a UTF-8 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of bytes to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF8(ByteBuffer buffer, int length) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer), length);
    }

    /**
     * Decodes the bytes with index {@code [offset, offset+length}) in {@code buffer}, as a UTF-8 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of bytes to decode
     * @param offset the offset at which to start decoding.
     *
     * @return the decoded {@link String}
     */
    public static String memUTF8(ByteBuffer buffer, int length, int offset) {
        return MultiReleaseTextDecoding.decodeUTF8(memAddress(buffer, offset), length);
    }

    /**
     * Converts the null-terminated UTF-16 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(long address) {
        return memUTF16(address, memLengthNT2(address, MAX_BUFFER_SIZE - 1) >> 1);
    }

    /**
     * Converts the UTF-16 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     * @param length  the number of characters to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(long address, int length) {
        if (length <= 0) {
            return "";
        }

        if (DEBUG) {
            // The implementation below does no codepoint validation.
            var len   = length << 1;
            var bytes = len <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[len];
            memByteBuffer(address, len).get(bytes, 0, len);
            return new String(bytes, 0, len, UTF16);
        }

        var chars = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_CHAR.get() : new char[length];
        memCharBuffer(address, length).get(chars, 0, length);
        return new String(chars, 0, length);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-16 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(ByteBuffer buffer) {
        return memUTF16(memAddress(buffer), buffer.remaining() >> 1);
    }

    /** Like {@link #memUTF16(long) memUTF16}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memUTF16Safe(long address) {
        return address == NULL ? null : memUTF16(address, memLengthNT2(address, MAX_BUFFER_SIZE - 1) >> 1);
    }

    /** Like {@link #memUTF16(long, int) memUTF16}, but returns {@code null} if {@code address} is {@link #NULL}. */
    @Nullable
    public static String memUTF16Safe(long address, int length) {
        return address == NULL ? null : memUTF16(address, length);
    }

    /** Like {@link #memUTF16(ByteBuffer) memUTF16}, but returns {@code null} if {@code buffer} is {@code null}. */
    @Nullable
    public static String memUTF16Safe(@Nullable ByteBuffer buffer) {
        return buffer == null ? null : memUTF16(memAddress(buffer), buffer.remaining() >> 1);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+(length*2)}) in {@code buffer}, as a UTF-16 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of characters to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(ByteBuffer buffer, int length) {
        return memUTF16(memAddress(buffer), length);
    }

    /**
     * Decodes the bytes with index {@code [offset, offset+(length*2)}) in {@code buffer}, as a UTF-16 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of characters to decode
     * @param offset the offset at which to start decoding, in bytes.
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(ByteBuffer buffer, int length, int offset) {
        return memUTF16(memAddress(buffer, offset), length);
    }

    // -------------------------------------------------
    // -------------------------------------------------
    // -------------------------------------------------


    static ByteBuffer wrapBufferByte(long address, int capacity) {
        /*VIRTUAL_MEMORY
            .asSlice(address,capacity & 0xFFFF_FFFFL)*/
        return MemorySegment.ofAddress(address)
            .reinterpret(capacity & 0xFFFF_FFFFL)
            .asByteBuffer()
            .order(ByteOrder.nativeOrder());
    }
    static ShortBuffer wrapBufferShort(long address, int capacity)   { return wrapBufferByte(address, capacity << 1).asShortBuffer(); }
    static CharBuffer wrapBufferChar(long address, int capacity)     { return wrapBufferByte(address, capacity << 1).asCharBuffer(); }
    static IntBuffer wrapBufferInt(long address, int capacity)       { return wrapBufferByte(address, capacity << 2).asIntBuffer(); }
    static LongBuffer wrapBufferLong(long address, int capacity)     { return wrapBufferByte(address, capacity << 3).asLongBuffer(); }
    static FloatBuffer wrapBufferFloat(long address, int capacity)   { return wrapBufferByte(address, capacity << 2).asFloatBuffer(); }
    static DoubleBuffer wrapBufferDouble(long address, int capacity) { return wrapBufferByte(address, capacity << 3).asDoubleBuffer(); }

}
