/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryAccess.MemoryAccessor;
import org.lwjgl.system.MemoryManage.DebugAllocator;
import org.lwjgl.system.MemoryUtil.MemoryAllocationReport.Aggregate;

import java.nio.*;

import static org.lwjgl.Pointer.*;

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
 */
public final class MemoryUtil {

	/** Alias for the null pointer address. */
	public static final long NULL = 0L;

	private static final MemoryAccessor ACCESSOR;

	private static final MemoryAllocator ALLOCATOR_IMPL;
	private static final MemoryAllocator ALLOCATOR;

	/** The memory page size, in bytes. This value is always a power-of-two. */
	public static final int PAGE_SIZE;

	/** The cache-line size, in bytes. This value is always a power-of-two. */
	public static final int CACHE_LINE_SIZE;

	static {
		LWJGLUtil.initialize();

		ACCESSOR = MemoryAccess.getInstance();

		PAGE_SIZE = ACCESSOR.getPageSize();
		CACHE_LINE_SIZE = ACCESSOR.getCacheLineSize();

		LWJGLUtil.log("MemoryUtil accessor: " + ACCESSOR.getClass().getSimpleName());

		ALLOCATOR_IMPL = MemoryManage.getInstance();
		ALLOCATOR = Boolean.getBoolean("org.lwjgl.util.DebugAllocator")
			? new DebugAllocator(ALLOCATOR_IMPL)
			: ALLOCATOR_IMPL;

		LWJGLUtil.log("MemoryUtil allocator: " + ALLOCATOR.getClass().getSimpleName());
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

	/** This enum can be passed to APIs that support configurable memory allocators. */
	public enum BufferAllocator {
		/** Allocate memory using {@link BufferUtils}, i.e. {@link ByteBuffer#allocateDirect}. */
		NIO {
			@Override
			public ByteBuffer allocate(int size) {
				return BufferUtils.createByteBuffer(size);
			}
		},
		/**
		 * Allocate memory using {@link MemoryUtil#memAlloc}. {@link ByteBuffer} instances allocated using this allocator must be explicitly freed using
		 * {@link MemoryUtil#memFree}.
		 */
		MALLOC {
			@Override
			public ByteBuffer allocate(int size) {
				return MemoryUtil.memAlloc(size);
			}
		};

		public abstract ByteBuffer allocate(int size);
	}

	/**
	 * Returns the {@link MemoryAllocator} instance used internally by the explicit memory management API ({@link #memAlloc}, {@link #memFree}, etc).
	 *
	 * <p>Allocations made through the returned instance will not be tracked for memory leaks, even if {@code org.lwjgl.util.DebugAllocator} is enabled. This
	 * can be useful for {@code static final} allocations that live throughout the application's lifetime and will never be freed until the process is
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

	/**
	 * The standard C realloc function.
	 *
	 * <p>Changes the size of the memory block pointed to by {@code ptr}. The function may move the memory block to a new location (whose address is returned
	 * by the function). The content of the memory block is preserved up to the lesser of the new and old sizes, even if the block is moved to a new location.
	 * If the new size is larger, the value of the newly allocated portion is indeterminate.</p>
	 *
	 * <p>In case that {@code ptr} is a {@link #NULL} pointer, the function behaves like {@link #memAlloc}, assigning a new block of size bytes and returning a
	 * pointer to its beginning.</p>
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
		return memByteBuffer(nmemRealloc(memAddress0Safe(ptr), size), size);
	}

	/**
	 * ShortBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of short values to allocate.
	 */
	public static ShortBuffer memRealloc(ShortBuffer ptr, int size) {
		return memShortBuffer(nmemRealloc(memAddress0Safe(ptr), size << 1), size);
	}

	/**
	 * IntBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of int values to allocate.
	 */
	public static IntBuffer memRealloc(IntBuffer ptr, int size) {
		return memIntBuffer(nmemRealloc(memAddress0Safe(ptr), size << 2), size);
	}

	/**
	 * FloatBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of float values to allocate.
	 */
	public static FloatBuffer memRealloc(FloatBuffer ptr, int size) {
		return memFloatBuffer(nmemRealloc(memAddress0Safe(ptr), size << 2), size);
	}

	/**
	 * LongBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of long values to allocate.
	 */
	public static LongBuffer memRealloc(LongBuffer ptr, int size) {
		return memLongBuffer(nmemRealloc(memAddress0Safe(ptr), size << 3), size);
	}

	/**
	 * DoubleBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of double values to allocate.
	 */
	public static DoubleBuffer memRealloc(DoubleBuffer ptr, int size) {
		return memDoubleBuffer(nmemRealloc(memAddress0Safe(ptr), size << 3), size);
	}

	/**
	 * PointerBuffer version of {@link #memRealloc}.
	 *
	 * @param size the number of pointer values to allocate.
	 */
	public static PointerBuffer memRealloc(PointerBuffer ptr, int size) {
		return memPointerBuffer(nmemRealloc(memAddress0Safe(ptr), size << POINTER_SHIFT), size);
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
	 * <p>This method can only be used if the {@code org.lwjgl.util.DebugAllocator} system property has been set to true.</p>
	 *
	 * @param report the report callback
	 */
	public static void memReport(MemoryAllocationReport report) {
		DebugAllocator.report(report);
	}

	/**
	 * Reports aggregates for the live allocations.
	 *
	 * <p>This method can only be used if the {@code org.lwjgl.util.DebugAllocator} system property has been set to true.</p>
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

	/** PointerBuffer version of {@link #memAddress0(Buffer)}. */
	public static long memAddress0(PointerBuffer buffer) { return buffer.address0(); }

	/** PointerBuffer version of {@link #memAddress0Safe(Buffer)}. */
	public static long memAddress0Safe(PointerBuffer buffer) { return buffer == null ? NULL : buffer.address0(); }

	// --- [ Buffer address ] ---

	/**
	 * Returns the memory address at the current position of the specified buffer. This is effectively a pointer value that can be used in native function
	 * calls.
	 *
	 * <p><b>WARNING</b>: Direct use of pointer values is inherently unsafe. In addition to the dangers of pointer arithmetic, the user must also ensure that
	 * the memory backing the specified buffer is not deallocated before the returned address is used. For example, this code may lead to a crash:</p>
	 * <pre><code>
	 * nativeFunction(memAddress(memEncodeASCII("test"));
	 * </code></pre>
	 * <p>because a GC execution between <code>memAddress</code> and <code>nativeFunction</code> might deallocate the ByteBuffer returned by
	 * <code>memEncodeASCII</code>. On the other hand, this code is safe on current JVMs:</p>
	 * <pre><code>
	 * ByteBuffer encoded = memEncodeASCII("test");
	 * nativeFunction(memAddress(encoded));</code><pre>
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

	/** PointerBuffer version of {@link #memAddress(ByteBuffer)}. */
	public static long memAddress(PointerBuffer buffer) { return memAddress(buffer, buffer.position()); }

	/** PointerBuffer version of {@link #memAddress(ByteBuffer, int)}. */
	public static long memAddress(PointerBuffer buffer, int position) { return memAddress0(buffer) + (position << POINTER_SHIFT); }

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

	/** PointerBuffer version of {@link #memAddressSafe(ByteBuffer)}. */
	public static long memAddressSafe(PointerBuffer buffer) { return buffer == null ? NULL : memAddress(buffer); }

	/** PointerBuffer version of {@link #memAddressSafe(ByteBuffer, int)}. */
	public static long memAddressSafe(PointerBuffer buffer, int position) { return buffer == null ? NULL : memAddress(buffer, position); }

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
		if ( address == NULL )
			return null;

		return ACCESSOR.memByteBuffer(address, capacity);
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
		if ( address == NULL )
			return null;

		ByteBuffer string = ACCESSOR.memByteBuffer(address, maxLength);

		return memSetupBuffer(string, address, memStrLen1(string, 0));
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
		return memByteBufferNT2(address, Integer.MAX_VALUE);
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
		if ( address == NULL )
			return null;

		ByteBuffer string = ACCESSOR.memByteBuffer(address, maxLength);

		return memSetupBuffer(string, address, memStrLen2(string, 0) << 1);
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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (2 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (2 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (4 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (8 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (4 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		if ( LWJGLUtil.DEBUG && (address & (8 - 1)) != 0L )
			throw new IllegalArgumentException("Unaligned memory address");

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
		if ( address == NULL )
			return null;

		return PointerBuffer.create(address, capacity);
	}

	/**
	 * This method is an alternative to {@link #memByteBuffer} that allows the reuse of an existing direct ByteBuffer instance. It modifies that instance so
	 * that it starts at the specified memory address and has the specified capacity. The instance passed to this method should not own native memory, i.e. it
	 * should not be an instance created using {@link ByteBuffer#allocateDirect}. Using such an instance will cause an exception to be thrown. Other instances
	 * are allowed and their parent reference will be cleared before this method returns.
	 *
	 * <p>ByteBuffer instance modification might not be possible. In that case this method behaves exactly like {@link #memByteBuffer}, so the returned
	 * instance should always replace the input one.</p>
	 *
	 * @param buffer   the ByteBuffer to modify
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity
	 *
	 * @return the modified ByteBuffer
	 */
	public static ByteBuffer memSetupBuffer(ByteBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** ShortBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static ShortBuffer memSetupBuffer(ShortBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** CharBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static CharBuffer memSetupBuffer(CharBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** IntBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static IntBuffer memSetupBuffer(IntBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** LongBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static LongBuffer memSetupBuffer(LongBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** FloatBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static FloatBuffer memSetupBuffer(FloatBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
	}

	/** DoubleBuffer version of: {@link #memSetupBuffer(java.nio.ByteBuffer, long, int)} */
	public static DoubleBuffer memSetupBuffer(DoubleBuffer buffer, long address, int capacity) {
		if ( address == NULL )
			return null;

		return ACCESSOR.memSetupBuffer(buffer, address, capacity);
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
	 * Returns a slice of the specified buffer, starting at the buffer's current position and ending at {@code buffer.position() + capacity}. The returned
	 * buffer will have the same {@link ByteOrder} as the source buffer.
	 *
	 * <p>The position and limit of the source buffer are preserved after a call to this method.</p>
	 *
	 * @param buffer   the buffer to slice
	 * @param capacity the slice length, it must be &le; {@code buffer.capacity() - buffer.position()}
	 *
	 * @return the sliced buffer
	 */
	public static ByteBuffer memSlice(ByteBuffer buffer, int capacity) {
		return memSlice(buffer, 0, capacity);
	}

	/**
	 * Returns a slice of the specified buffer, starting at {@code buffer.position() + offset} and ending at {@code buffer.position() + offset + capacity}. The
	 * returned buffer will have the same {@link ByteOrder} as the original buffer.
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
		int limit = buffer.limit();

		try {
			buffer.position(position + offset);
			buffer.limit(position + offset + capacity);

			return memSlice(buffer);
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
		if ( LWJGLUtil.DEBUG && (ptr == NULL || bytes < 0) )
			throw new IllegalArgumentException();

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
		if ( LWJGLUtil.DEBUG && (src == NULL || dst == NULL || bytes < 0) )
			throw new IllegalArgumentException();

		ACCESSOR.memCopy(src, dst, bytes);
	}

	public static byte memGetByte(long ptr) {
		return ACCESSOR.memGetByte(ptr);
	}

	public static short memGetShort(long ptr) {
		return ACCESSOR.memGetShort(ptr);
	}

	public static int memGetInt(long ptr) {
		return ACCESSOR.memGetInt(ptr);
	}

	public static long memGetLong(long ptr) {
		return ACCESSOR.memGetLong(ptr);
	}

	public static float memGetFloat(long ptr) {
		return ACCESSOR.memGetFloat(ptr);
	}

	public static double memGetDouble(long ptr) {
		return ACCESSOR.memGetDouble(ptr);
	}

	public static long memGetAddress(long ptr) {
		return ACCESSOR.memGetAddress(ptr);
	}

	public static void memPutByte(long ptr, byte value) {
		ACCESSOR.memPutByte(ptr, value);
	}

	public static void memPutShort(long ptr, short value) {
		ACCESSOR.memPutShort(ptr, value);
	}

	public static void memPutInt(long ptr, int value) {
		ACCESSOR.memPutInt(ptr, value);
	}

	public static void memPutLong(long ptr, long value) {
		ACCESSOR.memPutLong(ptr, value);
	}

	public static void memPutFloat(long ptr, float value) {
		ACCESSOR.memPutFloat(ptr, value);
	}

	public static void memPutDouble(long ptr, double value) {
		ACCESSOR.memPutDouble(ptr, value);
	}

	public static void memPutAddress(long ptr, long value) {
		ACCESSOR.memPutAddress(ptr, value);
	}

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

	/**
	 * Creates a new global reference to the specified object. This method is a simpler wrapper over the JNI {@code NewGlobalRef} function.
	 *
	 * @param obj the object
	 *
	 * @return the global reference memory address
	 */
	public static native long memNewGlobalRef(Object obj);

	/**
	 * Deletes a global reference. This method is a simpler wrapper over the JNI {@code DeleteGlobalRef} function.
	 *
	 * @param globalRef the memory address of the global reference to delete
	 */
	public static native void memDeleteGlobalRef(long globalRef);

	/**
	 * Creates a new weak global reference to the specified object. This method is a simpler wrapper over the JNI {@code NewWeakGlobalRef} function.
	 *
	 * @param obj the object
	 *
	 * @return the weak global reference memory address
	 */
	public static native long memNewWeakGlobalRef(Object obj);

	/**
	 * Deletes a weak global reference. This method is a simpler wrapper over the JNI {@code DeleteWeakGlobalRef} function.
	 *
	 * @param globalRef the memory address of the weak global reference to delete
	 */
	public static native void memDeleteWeakGlobalRef(long globalRef);

	/*  -------------------------------------
		-------------------------------------
			TEXT ENCODING/DECODING API
		-------------------------------------
	    ------------------------------------- */

	/**
	 * Returns a ByteBuffer containing the specified text ASCII encoded and null-terminated. If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text) {
		return memEncodeASCII(text, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeASCII(CharSequence)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text      the text to encode
	 * @param allocator the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text, BufferAllocator allocator) {
		return memEncodeASCII(text, true, allocator);
	}

	/**
	 * Returns a ByteBuffer containing the specified text ASCII encoded and optionally null-terminated. If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text, boolean nullTerminated) {
		return memEncodeASCII(text, nullTerminated, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeASCII(CharSequence, boolean)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 * @param allocator      the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeASCII(CharSequence text, boolean nullTerminated, BufferAllocator allocator) {
		if ( text == null )
			return null;

		ByteBuffer target = allocator.allocate(text.length() + (nullTerminated ? 1 : 0));
		memEncodeASCII(text, nullTerminated, target);
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
	 * @return the encoded text or null
	 */
	public static int memEncodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target) {
		return memEncodeASCII(text, nullTerminated, target, target.position());
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
	public static int memEncodeASCII(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int p = offset;

		for ( int i = 0; i < text.length(); i++, p++ )
			target.put(p, (byte)text.charAt(i));

		if ( nullTerminated )
			target.put(p++, (byte)0);

		return p - offset;
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-8 encoded and null-terminated. If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text) {
		return memEncodeUTF8(text, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeUTF8(CharSequence)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text      the text to encode
	 * @param allocator the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text, BufferAllocator allocator) {
		return memEncodeUTF8(text, true, allocator);
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-8 encoded and optionally null-terminated. If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text, boolean nullTerminated) {
		return memEncodeUTF8(text, nullTerminated, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeUTF8(CharSequence, boolean)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 * @param allocator      the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF8(CharSequence text, boolean nullTerminated, BufferAllocator allocator) {
		if ( text == null )
			return null;

		ByteBuffer target = allocator.allocate(memEncodedLengthUTF8(text) + (nullTerminated ? 1 : 0));
		memEncodeUTF8(text, nullTerminated, target);
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
	public static int memEncodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target) {
		return memEncodeUTF8(text, nullTerminated, target, target.position());
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
	public static int memEncodeUTF8(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int i = 0, p = offset;

		// Fast path
		while ( i < text.length() ) {
			char c = text.charAt(i);
			if ( 128 <= c )
				break;
			target.put(p++, (byte)c);
			i++;
		}

		// Slow path
		while ( i < text.length() ) {
			char c = text.charAt(i++);
			if ( c < 128 ) {
				target.put(p++, (byte)c);
			} else {
				int cp = c;
				if ( c < 2048 ) {
					target.put(p++, (byte)(0xC0 | cp >> 6));
				} else {
					if ( !Character.isHighSurrogate(c) ) {
						target.put(p++, (byte)(0xE0 | cp >> 12));
					} else {
						cp = Character.toCodePoint(c, text.charAt(i++));

						target.put(p++, (byte)(0xF0 | cp >> 18));
						target.put(p++, (byte)(0x80 | cp >> 12 & 0x3F));
					}
					target.put(p++, (byte)(0x80 | cp >> 6 & 0x3F));
				}
				target.put(p++, (byte)(0x80 | cp & 0x3F));
			}
		}

		if ( nullTerminated )
			target.put(p++, (byte)0);

		return p - offset;
	}

	/**
	 * Returns the number of bytes required to encode the specified text in the UTF-8 encoding.
	 *
	 * @param value the text to encode
	 *
	 * @return the number of bytes in UTF-8
	 */
	public static int memEncodedLengthUTF8(CharSequence value) {
		int i = 0, len = value.length(), bytes = 0;
		while ( i < len ) {
			char c = value.charAt(i++);
			if ( c < 128 )
				bytes += 1;
			else if ( c < 2048 )
				bytes += 2;
			else if ( c < Character.MIN_SURROGATE || Character.MAX_SURROGATE < c ) {
				bytes += 3;
			} else {
				if ( LWJGLUtil.DEBUG && (len <= i || !Character.isHighSurrogate(c) || !Character.isLowSurrogate(value.charAt(i))) )
					throw new RuntimeException("Malformed character sequence");

				bytes += 4;
				i++;
			}
		}
		return bytes;
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-16 encoded and null-terminated. If text is null, null is returned.
	 *
	 * @param text the text to encode
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text) {
		return memEncodeUTF16(text, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeUTF16(CharSequence)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text      the text to encode
	 * @param allocator the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text, BufferAllocator allocator) {
		return memEncodeUTF16(text, true, allocator);
	}

	/**
	 * Returns a ByteBuffer containing the specified text UTF-16 encoded and optionally null-terminated. If text is null, null is returned.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 *
	 * @return the encoded text
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text, boolean nullTerminated) {
		return memEncodeUTF16(text, nullTerminated, BufferAllocator.NIO);
	}

	/**
	 * Same as {@link #memEncodeUTF16(CharSequence, boolean)}, with an explicit allocator to use for allocating the returned buffer.
	 *
	 * @param text           the text to encode
	 * @param nullTerminated if true, the text will be terminated with a '\0'.
	 * @param allocator      the allocator to use
	 *
	 * @return the encoded text or null
	 */
	public static ByteBuffer memEncodeUTF16(CharSequence text, boolean nullTerminated, BufferAllocator allocator) {
		if ( text == null )
			return null;

		ByteBuffer target = allocator.allocate((text.length() + (nullTerminated ? 1 : 0)) << 1);
		memEncodeUTF16(text, nullTerminated, target);
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
	public static int memEncodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target) {
		return memEncodeUTF16(text, nullTerminated, target, target.position());
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
	public static int memEncodeUTF16(CharSequence text, boolean nullTerminated, ByteBuffer target, int offset) {
		int p = offset;
		for ( int i = 0; i < text.length(); i++, p += 2 )
			target.putChar(p, text.charAt(i));

		if ( nullTerminated ) {
			target.putChar(p, '\0');
			p += 2;
		}
		return p - offset;
	}

	/**
	 * Calculates the byte count of the null-terminated string in {@code buffer} that starts at the current {@code buffer} position. The null-terminator is
	 * assumed to be a single {@code \0} character.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen1(ByteBuffer buffer) {
		return memStrLen1(buffer, buffer.position());
	}

	/**
	 * Calculates the byte count of the null-terminated string in {@code buffer} that starts at index {@code from}. The null-terminator is assumed to be a
	 * single {@code \0} character.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 * @param from   the index at which to start the search
	 *
	 * @return the string length, <strong>in bytes</strong>
	 */
	public static int memStrLen1(ByteBuffer buffer, int from) {
		int to = from;
		while ( to < buffer.limit() ) {
			if ( buffer.get(to) == 0 )
				break;
			to++;
		}
		return to - from;
	}

	/**
	 * Calculates the number of UTF16 code units of the null-terminated string in {@code buffer} that starts at the current {@code buffer} position. The
	 * null-terminator is assumed to be 2 consecutive {@code \0} characters.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 *
	 * @return the string length, <strong>in UTF16 code units</strong>
	 */
	public static int memStrLen2(ByteBuffer buffer) {
		return memStrLen2(buffer, buffer.position());
	}

	/**
	 * Calculates the number of UTF16 code units of the null-terminated string in {@code buffer} that starts at index {@code from}. The null-terminator is
	 * assumed to be 2 consecutive {@code \0} characters.
	 *
	 * @param buffer the {@link ByteBuffer} that contains the string
	 * @param from   the index at which to start the search
	 *
	 * @return the string length, <strong>in UTF16 code units</strong>
	 */
	public static int memStrLen2(ByteBuffer buffer, int from) {
		int to = from;
		while ( to < buffer.limit() ) {
			if ( buffer.get(to) == 0 && to < buffer.limit() - 1 && buffer.get(to + 1) == 0 )
				break;
			to += 2;
		}
		return (to - from) >> 1;
	}

	/**
	 * Converts the null-terminated ASCII encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeASCII(long address) {
		return address == NULL ? null : memDecodeASCII(memByteBufferNT1(address));
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
	public static String memDecodeASCII(ByteBuffer buffer) {
		if ( buffer == null )
			return null;

		return memDecodeASCII(buffer, buffer.remaining());
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
	public static String memDecodeASCII(ByteBuffer buffer, int length) {
		return memDecodeASCII(buffer, length, buffer.position());
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
	public static String memDecodeASCII(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length];

		for ( int i = 0; i < length; i++ )
			chars[i] = (char)buffer.get(offset + i);

		return new String(chars);
	}

	/**
	 * Converts the null-terminated UTF-8 encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeUTF8(long address) {
		return address == NULL ? null : memDecodeUTF8(memByteBufferNT1(address));
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
	public static String memDecodeUTF8(ByteBuffer buffer) {
		return memDecodeUTF8(buffer, buffer.remaining());
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
	public static String memDecodeUTF8(ByteBuffer buffer, int length) {
		return memDecodeUTF8(buffer, length, buffer.position());
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
	public static String memDecodeUTF8(ByteBuffer buffer, int length, int offset) {
		char[] string = new char[length];

		int i = 0, position = offset, limit = offset + length;

		// fast path
		while ( position < limit ) {
			int c = buffer.get(position);
			if ( c < 0 )
				break;

			string[i++] = (char)c;
			position++;
		}

		// slow path
		while ( position < limit ) {
			int b0 = buffer.get(position++);
			if ( 0 <= b0 ) {
				string[i++] = (char)b0;
			} else if ( (b0 >> 5) == -2 && (b0 & 0x1E) != 0 ) {
				int b1 = buffer.get(position++);
				if ( LWJGLUtil.DEBUG && (b1 & 0xC0) != 0x80 )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = (char)(((b0 << 6) ^ b1) ^ (((byte)0xC0 << 6) ^ ((byte)0x80 << 0)));
			} else if ( (b0 >> 4) == -2 ) {
				int b1 = buffer.get(position++);
				int b2 = buffer.get(position++);
				if ( LWJGLUtil.DEBUG && isMalformed3(b0, b1, b2) )
					throw new RuntimeException("Malformed character sequence");

				char c = (char)((b0 << 12) ^ (b1 << 6) ^ (b2 ^ (((byte)0xE0 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
				if ( LWJGLUtil.DEBUG && Character.MIN_SURROGATE <= c && c <= Character.MAX_SURROGATE )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = c;
			} else if ( (b0 >> 3) == -2 ) {
				int b1 = buffer.get(position++);
				int b2 = buffer.get(position++);
				int b3 = buffer.get(position++);
				int cp = ((b0 << 18) ^ (b1 << 12) ^ (b2 << 6) ^ (b3 ^ ((byte)0xF0 << 18 ^ ((byte)0x80 << 12) ^ ((byte)0x80 << 6) ^ ((byte)0x80 << 0))));
				if ( LWJGLUtil.DEBUG && (isMalformed4(b1, b2, b3) || !Character.isSupplementaryCodePoint(cp)) )
					throw new RuntimeException("Malformed character sequence");

				string[i++] = (char)((cp >>> 10) + Character.MIN_HIGH_SURROGATE - (Character.MIN_SUPPLEMENTARY_CODE_POINT >>> 10));
				string[i++] = (char)((cp & 0x3FF) + Character.MIN_LOW_SURROGATE);
			} else if ( LWJGLUtil.DEBUG )
				throw new RuntimeException("Malformed character sequence");
		}

		return new String(string, 0, i);
	}

	private static boolean isMalformed3(int b1, int b2, int b3) {
		return (b1 == (byte)0xE0 && (b2 & 0xE0) == 0x80) || (b2 & 0xC0) != 0x80 || (b3 & 0xC0) != 0x80;
	}

	private static boolean isMalformed4(int b2, int b3, int b4) {
		return (b2 & 0xC0) != 0x80 || (b3 & 0xC0) != 0x80 || (b4 & 0xC0) != 0x80;
	}

	/**
	 * Converts the null-terminated UTF-16 encoded string at the specified memory address to a {@link String}.
	 *
	 * @param address the string memory address
	 *
	 * @return the decode {@link String} or null if the specified {@code address} is null
	 */
	public static String memDecodeUTF16(long address) {
		return address == NULL ? null : memDecodeUTF16(memByteBufferNT2(address));
	}

	/**
	 * Decodes the bytes with index {@code [position(), position()+remaining()}) in {@code buffer}, as a UTF-16 string.
	 *
	 * <p>The current {@code position} and {@code limit} of the specified {@code buffer} are not affected by this operation.</p>
	 *
	 * @param buffer the {@link ByteBuffer} to decode, or null
	 *
	 * @return the decoded {@link String} or null if the specified {@code } is null
	 */
	public static String memDecodeUTF16(ByteBuffer buffer) {
		if ( buffer == null )
			return null;

		return memDecodeUTF16(buffer, buffer.remaining() >> 1);
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
	public static String memDecodeUTF16(ByteBuffer buffer, int length) {
		return memDecodeUTF16(buffer, length, buffer.position());
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
	public static String memDecodeUTF16(ByteBuffer buffer, int length, int offset) {
		char[] chars = new char[length];

		for ( int i = 0; i < chars.length; i++ ) {
			chars[i] = buffer.getChar(offset + (i << 1));
		}

		return new String(chars);
	}

}