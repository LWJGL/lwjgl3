/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;

import java.nio.*;

import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.ThreadLocalUtil.*;

/**
 * Off-heap, resizable, stack implementation. Should be used in a thread-local manner for stack allocations.
 *
 * <p>The stack state is not managed by LWJGL. The user is responsible for maintaining invariants (match every push with a pop, don't pop at zero level, etc)
 * such that this class works like a real thread stack.</p>
 */
public class MemoryStack {

	// Protect against exceessive allocations or pushes.
	private static final int MAX_DEPTH = 32;
	private static final int MAX_SIZE  = 32 * 1024 * 1024;

	private long address;

	private int size;

	private int[] stack;
	private int   depth;

	private int offset;

	public MemoryStack() {
		this.stack = new int[MAX_DEPTH];
	}

	public static MemoryStack stackGet() {
		return tlsGet().stack;
	}

	public static MemoryStack stackPush() {
		return tlsGet().stack.push();
	}

	public static MemoryStack stackPop() {
		return tlsGet().stack.pop();
	}

	public MemoryStack push() {
		stack[depth++] = offset;
		return this;
	}

	public MemoryStack pop() {
		offset = stack[--depth];
		return this;
	}

	public MemoryStack purge() {
		nmemFree(address);
		address = NULL;
		size = 0;

		depth = 0;
		offset = 0;

		return this;
	}

	public int getSize() {
		return size;
	}

	public int getDepth() {
		return depth;
	}

	public int getOffset() {
		return offset;
	}

	private void ensureCapacity(int capacity) {
		if ( capacity <= size )
			return;

		if ( MAX_SIZE < capacity )
			throw new OutOfMemoryError("The maximum stack size has been reached: " + MAX_SIZE);

		int newSize = mathRoundPoT(capacity);
		long newAddress = nmemRealloc(address, newSize);
		if ( newAddress == NULL )
			throw new OutOfMemoryError("Failed to resize the stack: " + newSize);

		address = newAddress;
		size = newSize;
	}

	public long nmalloc(int alignment, int size) {
		// Upward align the current offset to the specified alignment
		int from = (offset + (alignment - 1)) & -alignment;
		int to = from + size;

		ensureCapacity(to);
		offset = to;

		return this.address + from;
	}

	public long ncalloc(int alignment, int num, int size) {
		int bytes = num * size;
		long address = nmalloc(alignment, bytes);
		memSet(address, 0, bytes);
		return address;
	}

	public ByteBuffer malloc(int size) { return memByteBuffer(nmalloc(1, size), size); }
	public ByteBuffer calloc(int size) { return memByteBuffer(ncalloc(1, size, 1), size); }

	public ShortBuffer mallocShort(int size) { return memShortBuffer(nmalloc(2, size << 1), size); }
	public ShortBuffer callocShort(int size) { return memShortBuffer(ncalloc(2, size, 2), size); }

	public IntBuffer mallocInt(int size) { return memIntBuffer(nmalloc(4, size << 2), size); }
	public IntBuffer callocInt(int size) { return memIntBuffer(ncalloc(4, size, 4), size); }

	public LongBuffer mallocLong(int size) { return memLongBuffer(nmalloc(8, size << 3), size); }
	public LongBuffer callocLong(int size) { return memLongBuffer(ncalloc(8, size, 8), size); }

	public FloatBuffer mallocFloat(int size) { return memFloatBuffer(nmalloc(4, size << 2), size); }
	public FloatBuffer callocFloat(int size) { return memFloatBuffer(ncalloc(4, size, 4), size); }

	public DoubleBuffer mallocDouble(int size) { return memDoubleBuffer(nmalloc(8, size << 3), size); }
	public DoubleBuffer callocDouble(int size) { return memDoubleBuffer(ncalloc(8, size, 8), size); }

	public PointerBuffer mallocPointer(int size) { return memPointerBuffer(nmalloc(POINTER_SIZE, size << POINTER_SHIFT), size); }
	public PointerBuffer callocPointer(int size) { return memPointerBuffer(ncalloc(POINTER_SIZE, size, POINTER_SHIFT), size); }

}