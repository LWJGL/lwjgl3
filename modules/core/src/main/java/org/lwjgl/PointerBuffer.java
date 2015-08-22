/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** This class is a container for architecture-independent pointer data. Its interface mirrors the {@link LongBuffer} API for convenience. */
public abstract class PointerBuffer implements Comparable<PointerBuffer> {

	// We use a (static) factory instance to create the concrete implementation, to avoid
	// type profiling in hot methods (cheaper for the JVM to inline).
	private interface Factory {
		PointerBuffer allocateDirect(int capacity);
		PointerBuffer create(long address, int capacity);
		PointerBuffer create(ByteBuffer source);

		long get(ByteBuffer source);
		long get(ByteBuffer source, int index);

		void put(ByteBuffer source, long p);
		void put(ByteBuffer source, int index, long p);
	}

	private static final Factory factory = Pointer.BITS64 ? x64.FACTORY : x32.FACTORY;

	// disallow other implementations
	PointerBuffer() {
	}

	/**
	 * Allocates a new pointer buffer.
	 * <p/>
	 * <p> The new buffer's position will be zero, its limit will be its
	 * capacity, and its mark will be undefined.  </p>
	 *
	 * @param capacity the new buffer's capacity, in pointers
	 *
	 * @return the new pointer buffer
	 *
	 * @throws IllegalArgumentException If the <tt>capacity</tt> is a negative integer
	 */
	public static PointerBuffer allocateDirect(int capacity) {
		return factory.allocateDirect(capacity);
	}

	/**
	 * Creates a new PointerBuffer that starts at the specified memory address and has the specified capacity.
	 *
	 * @param address  the starting memory address
	 * @param capacity the buffer capacity, in number of pointers
	 */
	public static PointerBuffer create(long address, int capacity) {
		return factory.create(address, capacity);
	}

	/**
	 * Creates a new PointerBuffer using the specified ByteBuffer as its pointer
	 * data source. This is useful for users that do their own memory management
	 * over a big ByteBuffer, instead of allocating many small ones.
	 *
	 * @param source the source buffer
	 */
	public static PointerBuffer create(ByteBuffer source) {
		return factory.create(source);
	}

	protected abstract Buffer buffer();

	public abstract long address();

	public long address0() {
		return memAddress0(buffer());
	}

	/**
	 * Returns this buffer's capacity. </p>
	 *
	 * @return the capacity of this buffer
	 */
	public int capacity() {
		return buffer().capacity();
	}

	/**
	 * Returns this buffer's position. </p>
	 *
	 * @return the position of this buffer
	 */
	public int position() {
		return buffer().position();
	}

	/**
	 * Sets this buffer's position.  If the mark is defined and larger than the
	 * new position then it is discarded. </p>
	 *
	 * @param newPosition the new position value; must be non-negative
	 *                    and no larger than the current limit
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newPosition</tt> do not hold
	 */
	public PointerBuffer position(int newPosition) {
		buffer().position(newPosition);
		return this;
	}

	/**
	 * Returns this buffer's limit. </p>
	 *
	 * @return the limit of this buffer
	 */
	public int limit() {
		return buffer().limit();
	}

	/**
	 * Sets this buffer's limit.  If the position is larger than the new limit
	 * then it is set to the new limit.  If the mark is defined and larger than
	 * the new limit then it is discarded. </p>
	 *
	 * @param newLimit the new limit value; must be non-negative
	 *                 and no larger than this buffer's capacity
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newLimit</tt> do not hold
	 */
	public PointerBuffer limit(int newLimit) {
		buffer().limit(newLimit);
		return this;
	}

	/**
	 * Sets this buffer's mark at its position. </p>
	 *
	 * @return This buffer
	 */
	public PointerBuffer mark() {
		buffer().mark();
		return this;
	}

	/**
	 * Resets this buffer's position to the previously-marked position.
	 * <p/>
	 * <p> Invoking this method neither changes nor discards the mark's
	 * value. </p>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.InvalidMarkException If the mark has not been set
	 */
	public PointerBuffer reset() {
		buffer().reset();
		return this;
	}

	/**
	 * Clears this buffer.  The position is set to zero, the limit is set to
	 * the capacity, and the mark is discarded.
	 * <p/>
	 * <p> Invoke this method before using a sequence of channel-read or
	 * <i>put</i> operations to fill this buffer.  For example:
	 * <p/>
	 * <blockquote><pre>
	 * buf.clear();     // Prepare buffer for reading
	 * in.read(buf);    // Read data</pre></blockquote>
	 * <p/>
	 * <p> This method does not actually erase the data in the buffer, but it
	 * is named as if it did because it will most often be used in situations
	 * in which that might as well be the case. </p>
	 *
	 * @return This buffer
	 */
	public PointerBuffer clear() {
		buffer().clear();
		return this;
	}

	/**
	 * Flips this buffer.  The limit is set to the current position and then
	 * the position is set to zero.  If the mark is defined then it is
	 * discarded.
	 * <p/>
	 * <p> After a sequence of channel-read or <i>put</i> operations, invoke
	 * this method to prepare for a sequence of channel-write or relative
	 * <i>get</i> operations.  For example:
	 * <p/>
	 * <blockquote><pre>
	 * buf.put(magic);    // Prepend header
	 * in.read(buf);      // Read data into rest of buffer
	 * buf.flip();        // Flip buffer
	 * out.write(buf);    // Write header + data to channel</pre></blockquote>
	 * <p/>
	 * <p> This method is often used in conjunction with the {@link #compact} method when transferring data from
	 * one place to another.  </p>
	 *
	 * @return This buffer
	 */
	public PointerBuffer flip() {
		buffer().flip();
		return this;
	}

	/**
	 * Rewinds this buffer.  The position is set to zero and the mark is
	 * discarded.
	 * <p/>
	 * <p> Invoke this method before a sequence of channel-write or <i>get</i>
	 * operations, assuming that the limit has already been set
	 * appropriately.  For example:
	 * <p/>
	 * <blockquote><pre>
	 * out.write(buf);    // Write remaining data
	 * buf.rewind();      // Rewind buffer
	 * buf.get(array);    // Copy data into array</pre></blockquote>
	 *
	 * @return This buffer
	 */
	public PointerBuffer rewind() {
		buffer().rewind();
		return this;
	}

	/**
	 * Returns the number of elements between the current position and the
	 * limit. </p>
	 *
	 * @return the number of elements remaining in this buffer
	 */
	public int remaining() {
		return buffer().remaining();
	}

	/**
	 * Tells whether there are any elements between the current position and
	 * the limit. </p>
	 *
	 * @return <tt>true</tt> if, and only if, there is at least one element
	 * remaining in this buffer
	 */
	public boolean hasRemaining() {
		return buffer().hasRemaining();
	}

	/**
	 * Creates a new pointer buffer whose content is a shared subsequence of
	 * this buffer's content.
	 * <p/>
	 * <p> The content of the new buffer will start at this buffer's current
	 * position.  Changes to this buffer's content will be visible in the new
	 * buffer, and vice versa; the two buffers' position, limit, and mark
	 * values will be independent.
	 * <p/>
	 * <p> The new buffer's position will be zero, its capacity and its limit
	 * will be the number of pointers remaining in this buffer, and its mark
	 * will be undefined.  The new buffer will be direct if, and only if, this
	 * buffer is direct, and it will be read-only if, and only if, this buffer
	 * is read-only.  </p>
	 *
	 * @return the new pointer buffer
	 */
	public abstract PointerBuffer slice();

	/**
	 * Creates a new pointer buffer that shares this buffer's content.
	 * <p/>
	 * <p> The content of the new buffer will be that of this buffer.  Changes
	 * to this buffer's content will be visible in the new buffer, and vice
	 * versa; the two buffers' position, limit, and mark values will be
	 * independent.
	 * <p/>
	 * <p> The new buffer's capacity, limit and position will be
	 * identical to those of this buffer. </p>
	 *
	 * @return the new pointer buffer
	 */
	public abstract PointerBuffer duplicate();

	/**
	 * Creates a new, read-only pointer buffer that shares this buffer's
	 * content.
	 * <p/>
	 * <p> The content of the new buffer will be that of this buffer.  Changes
	 * to this buffer's content will be visible in the new buffer; the new
	 * buffer itself, however, will be read-only and will not allow the shared
	 * content to be modified.  The two buffers' position, limit, and mark
	 * values will be independent.
	 * <p/>
	 * <p> The new buffer's capacity, limit and position will be
	 * identical to those of this buffer.
	 * <p/>
	 * <p> If this buffer is itself read-only then this method behaves in
	 * exactly the same way as the {@link #duplicate duplicate} method.  </p>
	 *
	 * @return the new, read-only pointer buffer
	 */
	public abstract PointerBuffer asReadOnlyBuffer();

	public boolean isReadOnly() {
		return buffer().isReadOnly();
	}

	/**
	 * Relative <i>get</i> method.  Reads the pointer at this buffer's
	 * current position, and then increments the position. </p>
	 *
	 * @return the pointer at the buffer's current position
	 *
	 * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
	 */
	public abstract long get();

	/**
	 * Convenience relative get from a source ByteBuffer.
	 *
	 * @param source the source ByteBuffer
	 */
	public static long get(ByteBuffer source) {
		return factory.get(source);
	}

	/**
	 * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> Writes the specified pointer into this buffer at the current
	 * position, and then increments the position. </p>
	 *
	 * @param p the pointer to be written
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If this buffer's current position is not smaller than its limit
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public abstract PointerBuffer put(long p);

	/**
	 * Convenience relative put on a target ByteBuffer.
	 *
	 * @param target the target ByteBuffer
	 * @param p      the pointer value to be written
	 */
	public static void put(ByteBuffer target, long p) {
		factory.put(target, p);
	}

	/**
	 * Absolute <i>get</i> method.  Reads the pointer at the specified
	 * index. </p>
	 *
	 * @param index the index from which the pointer will be read
	 *
	 * @return the pointer at the specified index
	 *
	 * @throws IndexOutOfBoundsException If <tt>index</tt> is negative
	 *                                   or not smaller than the buffer's limit
	 */
	public abstract long get(int index);

	/**
	 * Convenience absolute get from a source ByteBuffer.
	 *
	 * @param source the source ByteBuffer
	 * @param index  the index at which the pointer will be read
	 */
	public static long get(ByteBuffer source, int index) {
		return factory.get(source, index);
	}

	/**
	 * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> Writes the specified pointer into this buffer at the specified
	 * index. </p>
	 *
	 * @param index the index at which the pointer will be written
	 * @param p     the pointer value to be written
	 *
	 * @return This buffer
	 *
	 * @throws IndexOutOfBoundsException        If <tt>index</tt> is negative
	 *                                          or not smaller than the buffer's limit
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public abstract PointerBuffer put(int index, long p);

	/**
	 * Convenience absolute put on a target ByteBuffer.
	 *
	 * @param target the target ByteBuffer
	 * @param index  the index at which the pointer will be written
	 * @param p      the pointer value to be written
	 */
	public static void put(ByteBuffer target, int index, long p) {
		factory.put(target, index, p);
	}

	// -- PointerWrapper operations --

	/** Puts the pointer value of the specified {@link Pointer} at the current position and then increments the position. */
	public PointerBuffer put(Pointer wrapper) {
		put(wrapper.getPointer());
		return this;
	}

	/** Puts the pointer value of the specified {@link Pointer} at the specified index. */
	public PointerBuffer put(int index, Pointer wrapper) {
		put(index, wrapper.getPointer());
		return this;
	}

	// -- Buffer address operations --

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(ByteBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(ShortBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(IntBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(LongBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(FloatBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer put(DoubleBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the current position and then increments the position. */
	public PointerBuffer putAddressOf(PointerBuffer buffer) {
		put(memAddress(buffer));
		return this;
	}

	// ---

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, ByteBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, ShortBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, IntBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, LongBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, FloatBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer put(int index, DoubleBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	/** Puts the address of the specified buffer at the specified index. */
	public PointerBuffer putAddressOf(int index, PointerBuffer buffer) {
		put(index, memAddress(buffer));
		return this;
	}

	// ---

	/** Returns a ByteBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public ByteBuffer getByteBuffer(int size) { return memByteBuffer(get(), size); }

	/** Returns a ShortBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public ShortBuffer getShortBuffer(int size) { return memShortBuffer(get(), size); }

	/** Returns a IntBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public IntBuffer getIntBuffer(int size) { return memIntBuffer(get(), size); }

	/** Returns a LongBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public LongBuffer getLongBuffer(int size) { return memLongBuffer(get(), size); }

	/** Returns a FloatBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public FloatBuffer getFloatBuffer(int size) { return memFloatBuffer(get(), size); }

	/** Returns a DoubleBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public DoubleBuffer getDoubleBuffer(int size) { return memDoubleBuffer(get(), size); }

	/** Returns a PointerBuffer instance that starts at the address found at the current position and has capacity equal to the specified size. */
	public PointerBuffer getPointerBuffer(int size) { return memPointerBuffer(get(), size); }

	// ---

	/** Returns a ByteBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public ByteBuffer getByteBuffer(int index, int size) { return memByteBuffer(get(index), size); }

	/** Returns a ShortBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public ShortBuffer getShortBuffer(int index, int size) { return memShortBuffer(get(index), size); }

	/** Returns a IntBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public IntBuffer getIntBuffer(int index, int size) { return memIntBuffer(get(index), size); }

	/** Returns a LongBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public LongBuffer getLongBuffer(int index, int size) { return memLongBuffer(get(index), size); }

	/** Returns a FloatBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public FloatBuffer getFloatBuffer(int index, int size) { return memFloatBuffer(get(index), size); }

	/** Returns a DoubleBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public DoubleBuffer getDoubleBuffer(int index, int size) { return memDoubleBuffer(get(index), size); }

	/** Returns a PointerBuffer instance that starts at the address found at the specified index and has capacity equal to the specified size. */
	public PointerBuffer getPointerBuffer(int index, int size) { return memPointerBuffer(get(index), size); }

	// -- Bulk get operations --

	/**
	 * Relative bulk <i>get</i> method.
	 * <p/>
	 * <p> This method transfers pointers from this buffer into the specified
	 * destination array.  If there are fewer pointers remaining in the
	 * buffer than are required to satisfy the request, that is, if
	 * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
	 * pointers are transferred and a {@link java.nio.BufferUnderflowException} is
	 * thrown.
	 * <p/>
	 * <p> Otherwise, this method copies <tt>length</tt> pointers from this
	 * buffer into the specified array, starting at the current position of this
	 * buffer and at the specified offset in the array.  The position of this
	 * buffer is then incremented by <tt>length</tt>.
	 * <p/>
	 * <p> In other words, an invocation of this method of the form
	 * <tt>src.get(dst,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as
	 * the loop
	 * <p/>
	 * <pre>
	 *     for (int i = off; i < off + len; i++)
	 *         dst[i] = src.get(); </pre>
	 * <p/>
	 * except that it first checks that there are sufficient pointers in
	 * this buffer and it is potentially much more efficient. </p>
	 *
	 * @param dst    the array into which pointers are to be written
	 * @param offset the offset within the array of the first pointer to be
	 *               written; must be non-negative and no larger than
	 *               <tt>dst.length</tt>
	 * @param length the maximum number of pointers to be written to the specified
	 *               array; must be non-negative and no larger than
	 *               <tt>dst.length - offset</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> pointers
	 *                                           remaining in this buffer
	 * @throws IndexOutOfBoundsException         If the preconditions on the <tt>offset</tt> and <tt>length</tt>
	 *                                           parameters do not hold
	 */
	public abstract PointerBuffer get(long[] dst, int offset, int length);

	/**
	 * Relative bulk <i>get</i> method.
	 * <p/>
	 * <p> This method transfers pointers from this buffer into the specified
	 * destination array.  An invocation of this method of the form
	 * <tt>src.get(a)</tt> behaves in exactly the same way as the invocation
	 * <p/>
	 * <pre>
	 *     src.get(a, 0, a.length) </pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> pointers
	 *                                           remaining in this buffer
	 */
	public PointerBuffer get(long[] dst) {
		return get(dst, 0, dst.length);
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers the pointers remaining in the specified source
	 * buffer into this buffer.  If there are more pointers remaining in the
	 * source buffer than in this buffer, that is, if
	 * <tt>src.remaining()</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>,
	 * then no pointers are transferred and a {@link
	 * java.nio.BufferOverflowException} is thrown.
	 * <p/>
	 * <p> Otherwise, this method copies
	 * <i>n</i>&nbsp;=&nbsp;<tt>src.remaining()</tt> pointers from the specified
	 * buffer into this buffer, starting at each buffer's current position.
	 * The positions of both buffers are then incremented by <i>n</i>.
	 * <p/>
	 * <p> In other words, an invocation of this method of the form
	 * <tt>dst.put(src)</tt> has exactly the same effect as the loop
	 * <p/>
	 * <pre>
	 *     while (src.hasRemaining())
	 *         dst.put(src.get()); </pre>
	 * <p/>
	 * except that it first checks that there is sufficient space in this
	 * buffer and it is potentially much more efficient. </p>
	 *
	 * @param src the source buffer from which pointers are to be read;
	 *            must not be this buffer
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
	 *                                          for the remaining pointers in the source buffer
	 * @throws IllegalArgumentException         If the source buffer is this buffer
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public abstract PointerBuffer put(PointerBuffer src);

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers the entire content of the specified source
	 * pointer array into this buffer.  An invocation of this method of the
	 * form <tt>dst.put(a)</tt> behaves in exactly the same way as the
	 * invocation
	 * <p/>
	 * <pre>
	 *     dst.put(a, 0, a.length) </pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public PointerBuffer put(long[] src) {
		return put(src, 0, src.length);
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers pointers into this buffer from the specified
	 * source array.  If there are more pointers to be copied from the array
	 * than remain in this buffer, that is, if
	 * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
	 * pointers are transferred and a {@link java.nio.BufferOverflowException} is
	 * thrown.
	 * <p/>
	 * <p> Otherwise, this method copies <tt>length</tt> pointers from the
	 * specified array into this buffer, starting at the specified offset in the array
	 * and at the current position of this buffer.  The position of this buffer
	 * is then incremented by <tt>length</tt>.
	 * <p/>
	 * <p> In other words, an invocation of this method of the form
	 * <tt>dst.put(src,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as
	 * the loop
	 * <p/>
	 * <pre>
	 *     for (int i = off; i < off + len; i++)
	 *         dst.put(a[i]); </pre>
	 * <p/>
	 * except that it first checks that there is sufficient space in this
	 * buffer and it is potentially much more efficient. </p>
	 *
	 * @param src    the array from which pointers are to be read
	 * @param offset the offset within the array of the first pointer to be read;
	 *               must be non-negative and no larger than <tt>array.length</tt>
	 * @param length the number of pointers to be read from the specified array;
	 *               must be non-negative and no larger than
	 *               <tt>array.length - offset</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
	 * @throws IndexOutOfBoundsException        If the preconditions on the <tt>offset</tt> and <tt>length</tt>
	 *                                          parameters do not hold
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public abstract PointerBuffer put(long[] src, int offset, int length);

	/**
	 * Compacts this buffer&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> The pointers between the buffer's current position and its limit,
	 * if any, are copied to the beginning of the buffer.  That is, the
	 * pointer at index <i>p</i>&nbsp;=&nbsp;<tt>position()</tt> is copied
	 * to index zero, the pointer at index <i>p</i>&nbsp;+&nbsp;1 is copied
	 * to index one, and so forth until the pointer at index
	 * <tt>limit()</tt>&nbsp;-&nbsp;1 is copied to index
	 * <i>n</i>&nbsp;=&nbsp;<tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>&nbsp;-&nbsp;<i>p</i>.
	 * The buffer's position is then set to <i>n+1</i> and its limit is set to
	 * its capacity.  The mark, if defined, is discarded.
	 * <p/>
	 * <p> The buffer's position is set to the number of pointers copied,
	 * rather than to zero, so that an invocation of this method can be
	 * followed immediately by an invocation of another relative <i>put</i>
	 * method. </p>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public abstract PointerBuffer compact();

	/**
	 * Retrieves this buffer's byte order.
	 * <p/>
	 * <p> The byte order of a pointer buffer created by allocation or by
	 * wrapping an existing <tt>pointer</tt> array is the {@link
	 * java.nio.ByteOrder#nativeOrder </code>native order<code>} of the underlying
	 * hardware.  The byte order of a pointer buffer created as a <a
	 * href="ByteBuffer.html#views">view</a> of a byte buffer is that of the
	 * byte buffer at the moment that the view is created.  </p>
	 *
	 * @return This buffer's byte order
	 */
	public abstract ByteOrder order();

	/**
	 * Returns a string summarizing the state of this buffer.
	 *
	 * @return A summary string
	 */
	public String toString() {
		return getClass().getName() + "[pos=" + position() + " lim=" + limit() + " cap=" + capacity() + "]";
	}

	/**
	 * Returns the current hash code of this buffer.
	 * <p/>
	 * <p> The hash code of a pointer buffer depends only upon its remaining
	 * elements; that is, upon the elements from <tt>position()</tt> up to, and
	 * including, the element at <tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>.
	 * <p/>
	 * <p> Because buffer hash codes are content-dependent, it is inadvisable
	 * to use buffers as keys in hash maps or similar data structures unless it
	 * is known that their contents will not change.  </p>
	 *
	 * @return the current hash code of this buffer
	 */
	public int hashCode() {
		int h = 1;
		int p = position();
		for ( int i = limit() - 1; i >= p; i-- )
			h = 31 * h + (int)get(i);
		return h;
	}

	/**
	 * Tells whether or not this buffer is equal to another object.
	 * <p/>
	 * <p> Two pointer buffers are equal if, and only if,
	 * <p/>
	 * <p><ol>
	 * <p/>
	 * <li><p> They have the same element type,  </p></li>
	 * <p/>
	 * <li><p> They have the same number of remaining elements, and
	 * </p></li>
	 * <p/>
	 * <li><p> The two sequences of remaining elements, considered
	 * independently of their starting positions, are pointwise equal.
	 * </p></li>
	 * <p/>
	 * </ol>
	 * <p/>
	 * <p> A pointer buffer is not equal to any other type of object.  </p>
	 *
	 * @param ob the object to which this buffer is to be compared
	 *
	 * @return <tt>true</tt> if, and only if, this buffer is equal to the
	 * given object
	 */
	public boolean equals(Object ob) {
		if ( !(ob instanceof PointerBuffer) )
			return false;
		PointerBuffer that = (PointerBuffer)ob;
		if ( this.remaining() != that.remaining() )
			return false;
		int p = this.position();
		for ( int i = this.limit() - 1, j = that.limit() - 1; i >= p; i--, j-- ) {
			long v1 = this.get(i);
			long v2 = that.get(j);
			if ( v1 != v2 ) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Compares this buffer to another.
	 * <p/>
	 * <p> Two pointer buffers are compared by comparing their sequences of
	 * remaining elements lexicographically, without regard to the starting
	 * position of each sequence within its corresponding buffer.
	 * <p/>
	 * <p> A pointer buffer is not comparable to any other type of object.
	 *
	 * @return A negative integer, zero, or a positive integer as this buffer
	 * is less than, equal to, or greater than the specified buffer
	 */
	@Override
	public int compareTo(PointerBuffer that) {
		int n = this.position() + Math.min(this.remaining(), that.remaining());
		for ( int i = this.position(), j = that.position(); i < n; i++, j++ ) {
			long v1 = this.get(i);
			long v2 = that.get(j);
			if ( v1 == v2 )
				continue;
			if ( v1 < v2 )
				return -1;
			return +1;
		}
		return this.remaining() - that.remaining();
	}

	private static void checkBounds(int off, int len, int size) {
		if ( (off | len | (off + len) | (size - (off + len))) < 0 )
			throw new IndexOutOfBoundsException();
	}

	private static class x32 extends PointerBuffer {

		private static final Factory FACTORY = new Factory() {
			@Override
			public PointerBuffer allocateDirect(int capacity) {
				return new x32(BufferUtils.createIntBuffer(capacity));
			}
			@Override
			public PointerBuffer create(long address, int capacity) {
				return new x32(memIntBuffer(address, capacity));
			}
			@Override
			public PointerBuffer create(ByteBuffer source) {
				return new x32(source.slice().order(source.order()).asIntBuffer());
			}

			@Override
			public long get(ByteBuffer source) {
				return source.getInt() & 0xFFFFFFFFL;

			}
			@Override
			public long get(ByteBuffer source, int index) {
				return source.getInt(index) & 0xFFFFFFFFL;
			}

			@Override
			public void put(ByteBuffer target, long p) {
				target.putInt((int)p);
			}

			@Override
			public void put(ByteBuffer target, int index, long p) {
				target.putInt(index, (int)p);
			}
		};

		private final IntBuffer buffer;

		private x32(IntBuffer buffer) {
			this.buffer = buffer;
		}

		@Override
		public Buffer buffer() {
			return buffer;
		}

		@Override
		public long address() {
			return memAddress(buffer);
		}

		@Override
		public PointerBuffer slice() {
			return new x32(buffer.slice());
		}

		@Override
		public PointerBuffer duplicate() {
			return new x32(buffer.duplicate());
		}

		@Override
		public PointerBuffer asReadOnlyBuffer() {
			return new x32(buffer.asReadOnlyBuffer());
		}

		@Override
		public long get() {
			return buffer.get() & 0xFFFFFFFFL;
		}

		@Override
		public PointerBuffer put(long p) {
			buffer.put((int)p);
			return this;
		}

		@Override
		public long get(int index) {
			return buffer.get(index) & 0xFFFFFFFFL;
		}

		@Override
		public PointerBuffer put(int index, long p) {
			buffer.put(index, (int)p);
			return this;
		}

		@Override
		public PointerBuffer get(long[] dst, int offset, int length) {
			checkBounds(offset, length, dst.length);
			if ( length > remaining() )
				throw new BufferUnderflowException();

			int end = offset + length;
			for ( int i = offset; i < end; i++ )
				dst[i] = get();

			return this;
		}

		@Override
		public PointerBuffer put(PointerBuffer src) {
			buffer.put(((x32)src).buffer);
			return this;
		}

		@Override
		public PointerBuffer put(long[] src, int offset, int length) {
			checkBounds(offset, length, src.length);
			if ( length > remaining() )
				throw new BufferOverflowException();
			int end = offset + length;
			for ( int i = offset; i < end; i++ )
				put(src[i]);

			return this;
		}

		@Override
		public PointerBuffer compact() {
			buffer.compact();
			return this;
		}

		@Override
		public ByteOrder order() {
			return buffer.order();
		}
	}

	private static class x64 extends PointerBuffer {

		private static final Factory FACTORY = new Factory() {
			@Override
			public PointerBuffer allocateDirect(int capacity) {
				return new x64(BufferUtils.createLongBuffer(capacity));
			}
			@Override
			public PointerBuffer create(long address, int capacity) {
				return new x64(memLongBuffer(address, capacity));
			}
			@Override
			public PointerBuffer create(ByteBuffer source) {
				return new x64(source.slice().order(source.order()).asLongBuffer());
			}

			@Override
			public long get(ByteBuffer source) {
				return source.getLong();
			}

			@Override
			public long get(ByteBuffer source, int index) {
				return source.getLong(index);
			}

			@Override
			public void put(ByteBuffer target, long p) {
				target.putLong(p);
			}

			@Override
			public void put(ByteBuffer target, int index, long p) {
				target.putLong(index, p);
			}
		};

		private final LongBuffer buffer;

		private x64(LongBuffer buffer) {
			this.buffer = buffer;
		}

		@Override
		public Buffer buffer() {
			return buffer;
		}

		@Override
		public long address() {
			return memAddress(buffer);
		}

		@Override
		public PointerBuffer slice() {
			return new x64(buffer.slice());
		}

		@Override
		public PointerBuffer duplicate() {
			return new x64(buffer.duplicate());
		}

		@Override
		public PointerBuffer asReadOnlyBuffer() {
			return new x64(buffer.asReadOnlyBuffer());
		}

		@Override
		public long get() {
			return buffer.get();
		}

		@Override
		public PointerBuffer put(long p) {
			buffer.put(p);
			return this;
		}

		@Override
		public long get(int index) {
			return buffer.get(index);
		}

		@Override
		public PointerBuffer put(int index, long p) {
			buffer.put(index, p);
			return this;
		}

		@Override
		public PointerBuffer get(long[] dst, int offset, int length) {
			buffer.get(dst, offset, length);
			return this;
		}

		@Override
		public PointerBuffer put(PointerBuffer src) {
			buffer.put(((x64)src).buffer);
			return this;
		}

		@Override
		public PointerBuffer put(long[] src, int offset, int length) {
			buffer.put(src, offset, length);
			return this;
		}

		@Override
		public PointerBuffer compact() {
			buffer.compact();
			return this;
		}

		@Override
		public ByteOrder order() {
			return buffer.order();
		}
	}

}