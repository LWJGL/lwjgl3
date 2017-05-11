/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.MemoryAccess.*;
import org.lwjgl.system.MemoryManage.*;
import org.lwjgl.system.MemoryUtil.MemoryAllocationReport.*;
import org.lwjgl.system.jni.*;

import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.LazyInit.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

/**
 * This class provides functionality for managing native memory.
 *
 * <p>All methods in this class will make use of {@link sun.misc.Unsafe} if it's available, for performance. If Unsafe is not available, the fallback
 * implementations make use of reflection and, in the worst-case, JNI.</p>
 *
 * <p>Method names in this class are prefixed with {@code mem} to avoid ambiguities when used with static imports.</p>
 *
 * <h3>Text encoding/decoding</h3>
 *
 * Three codecs are available, each with a different postfix:
 * <ul>
 * <li>UTF16 - Direct mapping of 2 bytes to Java char and vice versa</li>
 * <li>UTF8 - custom UTF-8 codec without intermediate allocations</li>
 * <li>ASCII - Not the original 7bit ASCII, but any character set with a single byte encoding (ISO 8859-1, Windows-1252, etc.)</li>
 * </ul>
 *
 * <p>Methods in bindings that accept/return {@code CharSequence}/{@code String} also support {@code ByteBuffer}, so custom codecs can be used if necessary.</p>
 *
 * @see Configuration#MEMORY_ALLOCATOR
 * @see Configuration#DEBUG_MEMORY_ALLOCATOR
 */
public final class MemoryUtil {

    /** Alias for the null pointer address. */
    public static final long NULL = 0L;

    private static final MemoryAccessor ACCESSOR;
    private static final MemoryTextUtil TEXT_UTIL;

    /** The memory page size, in bytes. This value is always a power-of-two. */
    public static final int PAGE_SIZE;

    /** The cache-line size, in bytes. This value is always a power-of-two. */
    public static final int CACHE_LINE_SIZE;

    static {
        Library.initialize();

        ACCESSOR = MemoryAccess.getInstance();
        TEXT_UTIL = ACCESSOR.getTextUtil();

        PAGE_SIZE = ACCESSOR.getPageSize();
        CACHE_LINE_SIZE = ACCESSOR.getCacheLineSize();

        apiLog("MemoryUtil accessor: " + ACCESSOR.getClass().getSimpleName());
    }

    static final class LazyInit {

        private LazyInit() {
        }

        static final MemoryAllocator ALLOCATOR_IMPL;
        static final MemoryAllocator ALLOCATOR;

        static {
            ALLOCATOR_IMPL = MemoryManage.getInstance();
            ALLOCATOR = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false)
                ? new DebugAllocator(ALLOCATOR_IMPL)
                : ALLOCATOR_IMPL;

            apiLog("MemoryUtil allocator: " + ALLOCATOR.getClass().getSimpleName());
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
        return ALLOCATOR_IMPL;
    }

    // --- [ memAlloc ] ---

    /** Unsafe version of {@link #memAlloc}. */
    public static long nmemAlloc(long size) {
        return ALLOCATOR.malloc(size);
    }

    /**
     * The standard C malloc function.
     *
     * <p>Allocates a block of {@code size} bytes of memory, returning a pointer to the beginning of the block. The content of the newly allocated block of
     * memory is not initialized, remaining with indeterminate values.</p>
     *
     * <p>Memory allocated with this method must be freed with {@link #memFree}.</p>
     *
     * @param size the size of the memory block to allocate, in bytes. If {@code size} is zero, the return value depends on the particular library
     *             implementation (it may or may not be a null pointer), but the returned pointer shall not be dereferenced.
     *
     * @return on success, a pointer to the memory block allocated by the function. If the function failed to allocate the requested block of memory, a {@link
     * #NULL} pointer is returned.
     */
    public static ByteBuffer memAlloc(int size) {
        return memByteBuffer(nmemAlloc(size), size);
    }

    /**
     * ShortBuffer version of {@link #memAlloc}.
     *
     * @param size the number of short values to allocate.
     */
    public static ShortBuffer memAllocShort(int size) {
        return memShortBuffer(nmemAlloc(size << 1), size);
    }

    /**
     * IntBuffer version of {@link #memAlloc}.
     *
     * @param size the number of int values to allocate.
     */
    public static IntBuffer memAllocInt(int size) {
        return memIntBuffer(nmemAlloc(size << 2), size);
    }

    /**
     * FloatBuffer version of {@link #memAlloc}.
     *
     * @param size the number of float values to allocate.
     */
    public static FloatBuffer memAllocFloat(int size) {
        return memFloatBuffer(nmemAlloc(size << 2), size);
    }

    /**
     * LongBuffer version of {@link #memAlloc}.
     *
     * @param size the number of long values to allocate.
     */
    public static LongBuffer memAllocLong(int size) {
        return memLongBuffer(nmemAlloc(size << 3), size);
    }

    /**
     * DoubleBuffer version of {@link #memAlloc}.
     *
     * @param size the number of double values to allocate.
     */
    public static DoubleBuffer memAllocDouble(int size) {
        return memDoubleBuffer(nmemAlloc(size << 3), size);
    }

    /**
     * PointerBuffer version of {@link #memAlloc}.
     *
     * @param size the number of pointer values to allocate.
     */
    public static PointerBuffer memAllocPointer(int size) {
        return memPointerBuffer(nmemAlloc(size << POINTER_SHIFT), size);
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
    public static void memFree(Buffer ptr) {
        nmemFree(memAddress0Safe(ptr));
    }

    /** PointerBuffer version of {@link #memFree}. */
    public static void memFree(PointerBuffer ptr) {
        nmemFree(memAddress0Safe(ptr));
    }

    // --- [ memCalloc ] ---

    /** Unsafe version of {@link #memCalloc}. */
    public static long nmemCalloc(long num, long size) {
        return ALLOCATOR.calloc(num, size);
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
     * @param size the size of each element. If {@code size} is zero, the return value depends on the particular library implementation (it may or may not be
     *             a null pointer), but the returned pointer shall not be dereferenced.
     *
     * @return on success, a pointer to the memory block allocated by the function. If the function failed to allocate the requested block of memory, a {@link
     * #NULL} pointer is returned.
     */
    public static ByteBuffer memCalloc(int num, int size) {
        return memByteBuffer(nmemCalloc(num, size), num * size);
    }

    /**
     * Alternative version of {@link #memCalloc}.
     *
     * @param num the number of bytes to allocate.
     */
    public static ByteBuffer memCalloc(int num) {
        return memByteBuffer(nmemCalloc(num, 1), num);
    }

    /**
     * ShortBuffer version of {@link #memCalloc}.
     *
     * @param num the number of short values to allocate.
     */
    public static ShortBuffer memCallocShort(int num) {
        return memShortBuffer(nmemCalloc(num, 2), num);
    }

    /**
     * IntBuffer version of {@link #memCalloc}.
     *
     * @param num the number of int values to allocate.
     */
    public static IntBuffer memCallocInt(int num) {
        return memIntBuffer(nmemCalloc(num, 4), num);
    }

    /**
     * FloatBuffer version of {@link #memCalloc}.
     *
     * @param num the number of float values to allocate.
     */
    public static FloatBuffer memCallocFloat(int num) {
        return memFloatBuffer(nmemCalloc(num, 4), num);
    }

    /**
     * LongBuffer version of {@link #memCalloc}.
     *
     * @param num the number of long values to allocate.
     */
    public static LongBuffer memCallocLong(int num) {
        return memLongBuffer(nmemCalloc(num, 8), num);
    }

    /**
     * DoubleBuffer version of {@link #memCalloc}.
     *
     * @param num the number of double values to allocate.
     */
    public static DoubleBuffer memCallocDouble(int num) {
        return memDoubleBuffer(nmemCalloc(num, 8), num);
    }

    /**
     * PointerBuffer version of {@link #memCalloc}.
     *
     * @param num the number of pointer values to allocate.
     */
    public static PointerBuffer memCallocPointer(int num) {
        return memPointerBuffer(nmemCalloc(num, POINTER_SIZE), num);
    }

    // --- [ memRealloc] ---

    /** Unsafe version of {@link #memRealloc}. */
    public static long nmemRealloc(long ptr, long size) {
        return ALLOCATOR.realloc(ptr, size);
    }

    private static <T extends Buffer> T realloc(T old_p, T new_p, int size) {
        if (old_p != null && new_p != null) {
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
     * @return a pointer to the reallocated memory block, which may be either the same as {@code ptr} or a new location. If the function fails to allocate the
     * requested block of memory, a {@link #NULL} pointer is returned, and the memory block pointed to by argument {@code ptr} is not deallocated (it is still
     * valid, and with its contents unchanged).
     */
    public static ByteBuffer memRealloc(ByteBuffer ptr, int size) {
        return realloc(ptr, memByteBuffer(nmemRealloc(memAddress0Safe(ptr), size), size), size);
    }

    /**
     * ShortBuffer version of {@link #memRealloc}.
     *
     * @param size the number of short values to allocate.
     */
    public static ShortBuffer memRealloc(ShortBuffer ptr, int size) {
        return realloc(ptr, memShortBuffer(nmemRealloc(memAddress0Safe(ptr), size << 1), size), size);
    }

    /**
     * IntBuffer version of {@link #memRealloc}.
     *
     * @param size the number of int values to allocate.
     */
    public static IntBuffer memRealloc(IntBuffer ptr, int size) {
        return realloc(ptr, memIntBuffer(nmemRealloc(memAddress0Safe(ptr), size << 2), size), size);
    }

    /**
     * LongBuffer version of {@link #memRealloc}.
     *
     * @param size the number of long values to allocate.
     */
    public static LongBuffer memRealloc(LongBuffer ptr, int size) {
        return realloc(ptr, memLongBuffer(nmemRealloc(memAddress0Safe(ptr), size << 3), size), size);
    }

    /**
     * FloatBuffer version of {@link #memRealloc}.
     *
     * @param size the number of float values to allocate.
     */
    public static FloatBuffer memRealloc(FloatBuffer ptr, int size) {
        return realloc(ptr, memFloatBuffer(nmemRealloc(memAddress0Safe(ptr), size << 2), size), size);
    }

    /**
     * DoubleBuffer version of {@link #memRealloc}.
     *
     * @param size the number of double values to allocate.
     */
    public static DoubleBuffer memRealloc(DoubleBuffer ptr, int size) {
        return realloc(ptr, memDoubleBuffer(nmemRealloc(memAddress0Safe(ptr), size << 3), size), size);
    }

    /**
     * PointerBuffer version of {@link #memRealloc}.
     *
     * @param size the number of pointer values to allocate.
     */
    public static PointerBuffer memRealloc(PointerBuffer ptr, int size) {
        PointerBuffer buffer = memPointerBuffer(nmemRealloc(memAddress0Safe(ptr), size << POINTER_SHIFT), size);
        if (ptr != null && buffer != null) {
            buffer.position(min(ptr.position(), size));
        }
        return buffer;
    }

    // --- [ memAlignedAlloc ] ---

    /** Unsafe version of {@link #memAlignedAlloc}. */
    public static long nmemAlignedAlloc(long alignment, long size) {
        return ALLOCATOR.aligned_alloc(alignment, size);
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
        return memByteBuffer(ALLOCATOR.aligned_alloc(alignment, size), size);
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
    public static void memAlignedFree(ByteBuffer ptr) {
        nmemAlignedFree(memAddress0Safe(ptr));
    }

    // --- [ DebugAllocator ] ---

    /** The memory allocation report callback. */
    public interface MemoryAllocationReport {

        /**
         * Reports allocated memory.
         *
         * @param memory     the amount of memory allocated, in bytes
         * @param threadId   id of the thread that allocated the memory. May be {@link #NULL}.
         * @param threadName name of the thread that allocated the memory. May be {@code null}.
         * @param stacktrace the allocation stacktrace. May be null.
         */
        void invoke(long memory, long threadId, String threadName, StackTraceElement... stacktrace);

        /** Specifies how to aggregate the reported allocations. */
        enum Aggregate {
            /** Allocations are aggregated over the whole process or thread. */
            ALL,
            /**
             * Allocations are aggregated based on the first stack trace element. This will return an allocation aggregate per method/line number, regardless
             * of how many different code paths lead to that specific method and line number.
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
    public static long memAddress0(Buffer buffer) { return ACCESSOR.memAddress0(buffer); }

    /** Null-safe version of {@link #memAddress0(Buffer)}. Returns {@link #NULL} if the specified buffer is null. */
    public static long memAddress0Safe(Buffer buffer) { return buffer == null ? NULL : ACCESSOR.memAddress0(buffer); }

    /** CustomBuffer version of {@link #memAddress0(Buffer)}. */
    public static long memAddress0(CustomBuffer<?> buffer) { return buffer.address0(); }

    /** CustomBuffer version of {@link #memAddress0Safe(Buffer)}. */
    public static long memAddress0Safe(CustomBuffer<?> buffer) { return buffer == null ? NULL : buffer.address0(); }

    // --- [ Buffer address ] ---

    /**
     * Returns the memory address at the current position of the specified buffer. This is effectively a pointer value that can be used in native function
     * calls.
     *
     * @param buffer the buffer
     *
     * @return the memory address
     */
    public static long memAddress(ByteBuffer buffer) { return memAddress(buffer, buffer.position()); }

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
    public static long memAddress(ByteBuffer buffer, int position) { return memAddress0(buffer) + position; }
    /** ShortBuffer version of {@link #memAddress(ByteBuffer)}. */

    public static long memAddress(ShortBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** ShortBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(ShortBuffer buffer, int position) { return memAddress0(buffer) + (position << 1); }

    /** CharBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(CharBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** CharBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(CharBuffer buffer, int position) { return memAddress0(buffer) + (position << 1); }

    /** IntBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(IntBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** IntBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(IntBuffer buffer, int position) { return memAddress0(buffer) + (position << 2); }

    /** FloatBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(FloatBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** FloatBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(FloatBuffer buffer, int position) { return memAddress0(buffer) + (position << 2); }

    /** LongBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(LongBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** LongBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(LongBuffer buffer, int position) { return memAddress0(buffer) + (position << 3); }

    /** DoubleBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(DoubleBuffer buffer) { return memAddress(buffer, buffer.position()); }
    /** DoubleBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(DoubleBuffer buffer, int position) { return memAddress0(buffer) + (position << 3); }

    /** CustomBuffer version of {@link #memAddress(ByteBuffer)}. */
    public static long memAddress(CustomBuffer<?> buffer) { return buffer.address(); }
    /** CustomBuffer version of {@link #memAddress(ByteBuffer, int)}. */
    public static long memAddress(CustomBuffer<?> buffer, int position) { return buffer.address(position); }

    // --- [ Buffer address - Safe ] ---

    /** Null-safe version of {@link #memAddress(ByteBuffer)}. Returns {@link #NULL} if the specified buffer is null. */
    public static long memAddressSafe(ByteBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** Null-safe version of {@link #memAddress(ByteBuffer, int)}. Returns {@link #NULL} if the specified buffer is null. */
    public static long memAddressSafe(ByteBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** ShortBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(ShortBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** ShortBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(ShortBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** CharBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(CharBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** CharBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(CharBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** IntBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(IntBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** IntBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(IntBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** FloatBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(FloatBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** FloatBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(FloatBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** LongBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(LongBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** LongBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(LongBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** DoubleBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(DoubleBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }
    /** DoubleBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(DoubleBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

    /** CustomBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
    public static long memAddressSafe(CustomBuffer<?> buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }
    /** Pointer version of {@link #memAddressSafe(ByteBuffer)}. */
    public static long memAddressSafe(Pointer pointer) { return pointer == null ? NULL : pointer.address(); }

    // --- [ Buffer allocation ] ---

    /**
     * Creates a new direct ByteBuffer that starts at the specified memory address and has the specified capacity. The returned ByteBuffer instance will be set
     * to the native ByteOrder.
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity
     *
     * @return the new ByteBuffer
     */
    public static ByteBuffer memByteBuffer(long address, int capacity) {
        if (address == NULL) {
            return null;
        }

        return ACCESSOR.memByteBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (2 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memShortBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (2 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memCharBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (4 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memIntBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (8 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memLongBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (4 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memFloatBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG && (address & (8 - 1)) != 0L) {
            throw new IllegalArgumentException("Unaligned memory address");
        }

        return ACCESSOR.memDoubleBuffer(address, capacity);
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
        if (address == NULL) {
            return null;
        }

        return PointerBuffer.create(address, capacity);
    }

    // --- [ Buffer slicing ] ---

    /**
     * Slices the specified buffer. The returned buffer will have the same {@link ByteOrder} as the source buffer.
     *
     * @param buffer the buffer to slice
     *
     * @return the sliced buffer
     *
     * @see ByteBuffer#slice()
     */
    public static ByteBuffer memSlice(ByteBuffer buffer) {
        return buffer.slice().order(buffer.order());
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return memSlice(buffer);
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
    public static PointerBuffer memSlice(PointerBuffer buffer, int offset, int capacity) {
        int position = buffer.position();
        int limit    = buffer.limit();

        try {
            buffer.position(position + offset);
            buffer.limit(position + offset + capacity);

            return buffer.slice();
        } finally {
            buffer.position(position);
            buffer.limit(limit);
        }
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
    public static void memSet(long ptr, int value, int bytes) {
        if (Checks.DEBUG && (ptr == NULL || bytes < 0)) {
            throw new IllegalArgumentException();
        }

        ACCESSOR.memSet(ptr, value, bytes);
    }

    /**
     * Sets all bytes in a specified block of memory to a copy of another block.
     *
     * @param src   the source memory address
     * @param dst   the destination memory address
     * @param bytes the number of bytes to copy
     */
    public static void memCopy(long src, long dst, int bytes) {
        if (Checks.DEBUG && (src == NULL || dst == NULL || bytes < 0)) {
            throw new IllegalArgumentException();
        }

        ACCESSOR.memCopy(src, dst, bytes);
    }

    public static boolean memGetBoolean(long ptr)           { return ACCESSOR.memGetByte(ptr) != 0; }
    public static byte memGetByte(long ptr)                 { return ACCESSOR.memGetByte(ptr); }
    public static short memGetShort(long ptr)               { return ACCESSOR.memGetShort(ptr); }
    public static int memGetInt(long ptr)                   { return ACCESSOR.memGetInt(ptr); }
    public static long memGetLong(long ptr)                 { return ACCESSOR.memGetLong(ptr);}
    public static float memGetFloat(long ptr)               { return ACCESSOR.memGetFloat(ptr);}
    public static double memGetDouble(long ptr)             { return ACCESSOR.memGetDouble(ptr);}
    public static long memGetAddress(long ptr)              { return ACCESSOR.memGetAddress(ptr);}

    public static void memPutByte(long ptr, byte value)     { ACCESSOR.memPutByte(ptr, value);}
    public static void memPutShort(long ptr, short value)   { ACCESSOR.memPutShort(ptr, value);}
    public static void memPutInt(long ptr, int value)       { ACCESSOR.memPutInt(ptr, value);}
    public static void memPutLong(long ptr, long value)     { ACCESSOR.memPutLong(ptr, value);}
    public static void memPutFloat(long ptr, float value)   { ACCESSOR.memPutFloat(ptr, value);}
    public static void memPutDouble(long ptr, double value) { ACCESSOR.memPutDouble(ptr, value);}
    public static void memPutAddress(long ptr, long value)  { ACCESSOR.memPutAddress(ptr, value);}

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

    /** Deprecated, use {@link JNINativeInterface#NewGlobalRef} instead. */
    @Deprecated public static long memNewGlobalRef(Object obj) { return NewGlobalRef(obj); }

    /** Deprecated, use {@link JNINativeInterface#DeleteGlobalRef} instead. */
    @Deprecated public static void memDeleteGlobalRef(long globalRef) { DeleteGlobalRef(globalRef); }

    /** Deprecated, use {@link JNINativeInterface#NewWeakGlobalRef} instead. */
    @Deprecated public static long memNewWeakGlobalRef(Object obj) { return NewWeakGlobalRef(obj); }

    /** Deprecated, use {@link JNINativeInterface#DeleteWeakGlobalRef} instead. */
    @Deprecated public static void memDeleteWeakGlobalRef(long globalRef) { DeleteWeakGlobalRef(globalRef);}

    /*  -------------------------------------
        -------------------------------------
                  TEXT ENCODING API
        -------------------------------------
        ------------------------------------- */

    /**
     * Returns a ByteBuffer containing the specified text ASCII encoded and null-terminated. If text is null, null is returned.
     *
     * @param text the text to encode
     *
     * @return the encoded text or null
     */
    public static ByteBuffer memASCII(CharSequence text) {
        return memASCII(text, true);
    }

    /**
     * Returns a ByteBuffer containing the specified text ASCII encoded and optionally null-terminated. If text is null, null is returned.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text or null
     */
    public static ByteBuffer memASCII(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer target = memAlloc(memLengthASCII(text, nullTerminated));
        memASCII(text, nullTerminated, target);
        return target;
    }

    /**
     * Encodes and optionally null-terminates the specified text using ASCII encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * current buffer position. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough remaining
     * space to store the encoded text.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the number of bytes of the encoded string
     */
    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        return memASCII(text, nullTerminated, target, target.position());
    }

    /**
     * Encodes and optionally null-terminates the specified text using ASCII encoding. The encoded text is stored in the specified {@link ByteBuffer} at the
     * specified {@code position} offset. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough
     * remaining space to store the encoded text.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param offset         the buffer position to which the string will be encoded
     *
     * @return the number of bytes of the encoded string
     */
    public static int memASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        return TEXT_UTIL.encodeASCII(text, nullTerminated, target, offset);
    }

    /**
     * Returns the number of bytes required to encode the specified text in the ASCII encoding.
     *
     * @param value          the text to encode
     * @param nullTerminated if true, add the number of bytes required for null-termination
     *
     * @return the number of bytes
     */
    public static int memLengthASCII(CharSequence value, boolean nullTerminated) {
        return value.length() + (nullTerminated ? 1 : 0);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-8 encoded and null-terminated. If text is null, null is returned.
     *
     * @param text the text to encode
     *
     * @return the encoded text or null
     */
    public static ByteBuffer memUTF8(CharSequence text) {
        return memUTF8(text, true);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-8 encoded and optionally null-terminated. If text is null, null is returned.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text or null
     */
    public static ByteBuffer memUTF8(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer target = memAlloc(memLengthUTF8(text, nullTerminated));
        memUTF8(text, nullTerminated, target);
        return target;
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-8 encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * current buffer position. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough remaining
     * space to store the encoded text. The specified text is assumed to be a valid UTF-16 string.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     *
     * @return the number of bytes of the encoded string
     */
    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        return memUTF8(text, nullTerminated, target, target.position());
    }

    /**
     * Encodes and optionally null-terminates the specified text using UTF-8 encoding. The encoded text is stored in the specified {@link ByteBuffer}, at the
     * specified {@code position} offset. The current buffer position is not modified by this operation. The {@code target} buffer is assumed to have enough
     * remaining space to store the encoded text. The specified text is assumed to be a valid UTF-16 string.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     * @param target         the buffer in which to store the encoded text
     * @param offset         the buffer position to which the string will be encoded
     *
     * @return the number of bytes of the encoded string
     */
    public static int memUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        return TEXT_UTIL.encodeUTF8(text, nullTerminated, target, offset);
    }

    /**
     * Returns the number of bytes required to encode the specified text in the UTF-8 encoding.
     *
     * @param value          the text to encode
     * @param nullTerminated if true, add the number of bytes required for null-termination
     *
     * @return the number of bytes
     */
    public static int memLengthUTF8(CharSequence value, boolean nullTerminated) {
        return MemoryTextUtil.encodeUTF8Length(value) + (nullTerminated ? 1 : 0);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-16 encoded and null-terminated. If text is null, null is returned.
     *
     * @param text the text to encode
     *
     * @return the encoded text
     */
    public static ByteBuffer memUTF16(CharSequence text) {
        return memUTF16(text, true);
    }

    /**
     * Returns a ByteBuffer containing the specified text UTF-16 encoded and optionally null-terminated. If text is null, null is returned.
     *
     * @param text           the text to encode
     * @param nullTerminated if true, the text will be terminated with a '\0'.
     *
     * @return the encoded text
     */
    public static ByteBuffer memUTF16(CharSequence text, boolean nullTerminated) {
        if (text == null) {
            return null;
        }

        ByteBuffer target = memAlloc(memLengthUTF16(text, nullTerminated));
        memUTF16(text, nullTerminated, target);
        return target;
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
     */
    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target) {
        return memUTF16(text, nullTerminated, target, target.position());
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
     */
    public static int memUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
        return TEXT_UTIL.encodeUTF16(text, nullTerminated, target, offset);
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
        return (value.length() + (nullTerminated ? 1 : 0)) << 1;
    }

    /*  -------------------------------------
        -------------------------------------
                  TEXT DECODING API
        -------------------------------------
        ------------------------------------- */

    private static int memLengthNT1(long address, int maxLength) {
        return BITS64
            ? TEXT_UTIL.strlen64NT1(address, maxLength)
            : TEXT_UTIL.strlen32NT1(address, maxLength);
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
        return BITS64
            ? TEXT_UTIL.strlen64NT2(address, maxLength)
            : TEXT_UTIL.strlen32NT2(address, maxLength);
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
        return memByteBufferNT1(address, Integer.MAX_VALUE);
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
        if (address == NULL) {
            return null;
        }

        return memByteBuffer(address, memLengthNT1(address, maxLength));
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
        return memByteBufferNT2(address, Integer.MAX_VALUE - 1);
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
        if (address == NULL) {
            return null;
        }

        if (Checks.DEBUG) {
            if ((address & 1L) != 0L) {
                throw new IllegalArgumentException("The string address is not aligned.");
            }

            if ((maxLength & 1) != 0) {
                throw new IllegalArgumentException("The maximum length must be an even number.");
            }
        }

        return memByteBuffer(address, memLengthNT2(address, maxLength));
    }

    /**
     * Converts the null-terminated ASCII encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String} or null if the specified {@code address} is null
     */
    public static String memASCII(long address) {
        if (address == NULL) {
            return null;
        }

        ByteBuffer buffer = memByteBufferNT1(address);
        return memASCII(buffer, buffer.remaining(), 0);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as an ASCII string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode, or null
     *
     * @return the decoded {@link String} or null if the specified {@code buffer} is null
     */
    public static String memASCII(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }

        return memASCII(buffer, buffer.remaining());
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
        return MemoryTextUtil.decodeASCII(buffer, length, buffer.position());
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
        Objects.requireNonNull(buffer);
        return MemoryTextUtil.decodeASCII(buffer, length, offset);
    }

    /**
     * Converts the null-terminated UTF-8 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String} or null if the specified {@code address} is null
     */
    public static String memUTF8(long address) {
        if (address == NULL) {
            return null;
        }

        ByteBuffer buffer = memByteBufferNT1(address);
        return memUTF8(buffer, buffer.remaining(), 0);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-8 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode, or null
     *
     * @return the decoded {@link String} or null if the specified {@code buffer} is null
     */
    public static String memUTF8(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }

        return memUTF8(buffer, buffer.remaining());
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
        return MemoryTextUtil.decodeUTF8(buffer, length, buffer.position());
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
        Objects.requireNonNull(buffer);
        return MemoryTextUtil.decodeUTF8(buffer, length, offset);
    }

    /**
     * Converts the null-terminated UTF-16 encoded string at the specified memory address to a {@link String}.
     *
     * @param address the string memory address
     *
     * @return the decoded {@link String} or null if the specified {@code address} is null
     */
    public static String memUTF16(long address) {
        return address == NULL ? null : memUTF16(memByteBufferNT2(address));
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-16 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
     *
     * @param buffer the {@link ByteBuffer} to decode, or null
     *
     * @return the decoded {@link String} or null if the specified {@code buffer} is null
     */
    public static String memUTF16(ByteBuffer buffer) {
        if (buffer == null) {
            return null;
        }

        return memUTF16(buffer, buffer.remaining() >> 1);
    }

    /**
     * Decodes the bytes with index {@code [position(), position()+(length*2)}) in {@code buffer}, as a UTF-16 string.
     *
     * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.></p>
     *
     * @param buffer the {@link ByteBuffer} to decode
     * @param length the number of characters to decode
     *
     * @return the decoded {@link String}
     */
    public static String memUTF16(ByteBuffer buffer, int length) {
        return MemoryTextUtil.decodeUTF16(buffer, length, buffer.position());
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
        Objects.requireNonNull(buffer);
        return MemoryTextUtil.decodeUTF16(buffer, length, offset);
    }

}
