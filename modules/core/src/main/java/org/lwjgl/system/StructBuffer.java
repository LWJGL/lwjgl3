/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This is the base class of struct data container implementations. Its interface mirrors the NIO API for convenience. */
public abstract class StructBuffer<T extends Struct, SELF extends StructBuffer<T, SELF>> implements Comparable<SELF>, Pointer {

	protected final ByteBuffer container;

	protected StructBuffer(ByteBuffer container, int SIZEOF) {
		if ( Checks.CHECKS )
			checkBuffer(container, SIZEOF);

		this.container = container;
	}

	// --------------------------------------

	protected abstract SELF self();

	protected abstract SELF newBufferInstance(ByteBuffer buffer);

	protected abstract T newInstance(long address);

	protected abstract int sizeof();

	/** Returns the buffer's base address. [INTERNAL USE ONLY] */
	public long address0() {
		return memAddress0(container);
	}

	/** Returns the memory address at the current buffer position. */
	@Override
	public long address() {
		return memAddress(container);
	}

	/**
	 * Returns this buffer's capacity.
	 *
	 * @return the capacity of this buffer
	 */
	public int capacity() {
		return container.capacity() / sizeof();
	}

	/**
	 * Returns this buffer's position.
	 *
	 * @return the position of this buffer
	 */
	public int position() {
		return container.position() / sizeof();
	}

	/**
	 * Sets this buffer's position. If the mark is defined and larger than the new position then it is discarded.
	 *
	 * @param newPosition the new position value; must be non-negative and no larger than the current limit
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newPosition</tt> do not hold
	 */
	public SELF position(int newPosition) {
		container.position(newPosition * sizeof());
		return self();
	}

	/**
	 * Returns this buffer's limit.
	 *
	 * @return the limit of this buffer
	 */
	public int limit() {
		return container.limit() / sizeof();
	}

	/**
	 * Sets this buffer's limit. If the position is larger than the new limit then it is set to the new limit. If the mark is defined and larger than the new
	 * limit then it is discarded.
	 *
	 * @param newLimit the new limit value; must be non-negative and no larger than this buffer's capacity
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newLimit</tt> do not hold
	 */
	public SELF limit(int newLimit) {
		container.limit(newLimit * sizeof());
		return self();
	}

	/**
	 * Sets this buffer's mark at its position.
	 *
	 * @return This buffer
	 */
	public SELF mark() {
		container.mark();
		return self();
	}

	/**
	 * Resets this buffer's position to the previously-marked position.
	 *
	 * <p>Invoking this method neither changes nor discards the mark's value.</p>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.InvalidMarkException If the mark has not been set
	 */
	public SELF reset() {
		container.reset();
		return self();
	}

	/**
	 * Clears this buffer. The position is set to zero, the limit is set to the capacity, and the mark is discarded.
	 *
	 * <p>Invoke this method before using a sequence of channel-read or <i>put</i> operations to fill this buffer. For example:</p>
	 *
	 * <blockquote><pre>
	 * buf.clear();     // Prepare buffer for reading
	 * in.read(buf);    // Read data</pre></blockquote>
	 *
	 * <p>This method does not actually erase the data in the buffer, but it is named as if it did because it will most often be used in situations in which
	 * that might as well be the case.</p>
	 *
	 * @return This buffer
	 */
	public SELF clear() {
		container.clear();
		return self();
	}

	/**
	 * Flips this buffer. The limit is set to the current position and then the position is set to zero. If the mark is defined then it is discarded.
	 *
	 * <p>After a sequence of channel-read or <i>put</i> operations, invoke this method to prepare for a sequence of channel-write or relative <i>get</i>
	 * operations. For example:</p>
	 *
	 * <blockquote><pre>
	 * buf.put(magic);    // Prepend header
	 * in.read(buf);      // Read data into rest of buffer
	 * buf.flip();        // Flip buffer
	 * out.write(buf);    // Write header + data to channel</pre></blockquote>
	 *
	 * <p>This method is often used in conjunction with the {@link #compact} method when transferring data from one place to another.</p>
	 *
	 * @return This buffer
	 */
	public SELF flip() {
		container.flip();
		return self();
	}

	/**
	 * Rewinds this buffer. The position is set to zero and the mark is discarded.
	 *
	 * <p>Invoke this method before a sequence of channel-write or <i>get</i> operations, assuming that the limit has already been set appropriately. For
	 * example:</p>
	 *
	 * <blockquote><pre>
	 * out.write(buf);    // Write remaining data
	 * buf.rewind();      // Rewind buffer
	 * buf.get(array);    // Copy data into array</pre></blockquote>
	 *
	 * @return This buffer
	 */
	public SELF rewind() {
		container.rewind();
		return self();
	}

	/**
	 * Returns the number of elements between the current position and the limit.
	 *
	 * @return the number of elements remaining in this buffer
	 */
	public int remaining() {
		return container.remaining() / sizeof();
	}

	/**
	 * Tells whether there are any elements between the current position and the limit.
	 *
	 * @return <tt>true</tt> if, and only if, there is at least one element remaining in this buffer
	 */
	public boolean hasRemaining() {
		return container.hasRemaining();
	}

	/**
	 * Creates a new struct buffer whose content is a shared subsequence of this buffer's content.
	 *
	 * <p>The content of the new buffer will start at this buffer's current position. Changes to this buffer's content will be visible in the new buffer, and
	 * vice versa; the two buffers' position, limit, and mark values will be independent.</p>
	 *
	 * <p>The new buffer's position will be zero, its capacity and its limit will be the number of structs remaining in this buffer, and its mark will be
	 * undefined. The new buffer will be read-only if, and only if, this buffer is read-only.</p>
	 *
	 * @return the new struct buffer
	 */
	public SELF slice() {
		return newBufferInstance(container.slice());
	}

	/**
	 * Creates a new struct buffer that shares this buffer's content.
	 *
	 * <p>The content of the new buffer will be that of this buffer. Changes to this buffer's content will be visible in the new buffer, and vice versa; the
	 * two buffers' position, limit, and mark values will be independent.
	 *
	 * <p>The new buffer's capacity, limit and position will be identical to those of this buffer.</p>
	 *
	 * @return the new struct buffer
	 */
	public SELF duplicate() {
		return newBufferInstance(container.duplicate());
	}

	/**
	 * Creates a new, read-only struct buffer that shares this buffer's content.
	 *
	 * <p>The content of the new buffer will be that of this buffer. Changes to this buffer's content will be visible in the new buffer; the new buffer itself,
	 * however, will be read-only and will not allow the shared content to be modified. The two buffers' position, limit, and mark values will be independent.
	 *
	 * <p>The new buffer's capacity, limit and position will be identical to those of this buffer.</p>
	 *
	 * <p>If this buffer is itself read-only then this method behaves in exactly the same way as the {@link #duplicate duplicate} method.</p>
	 *
	 * @return the new, read-only struct buffer
	 */
	public SELF asReadOnlyBuffer() {
		return newBufferInstance(container.asReadOnlyBuffer());
	}

	/**
	 * Tells whether or not this buffer is read-only.
	 *
	 * @return <tt>true</tt> if, and only if, this buffer is read-only
	 */
	public boolean isReadOnly() {
		return container.isReadOnly();
	}

	/**
	 * Relative <i>get</i> method. Reads the struct at this buffer's current position, and then increments the position.
	 *
	 * <p>The struct instance returned is a view of the buffer at the current position. Changes to this buffer's content will be visible in the struct instance
	 * and vice versa.</p>
	 *
	 * @return the struct at the buffer's current position
	 *
	 * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
	 */
	public T get() {
		int curr = container.position();
		int next = curr + sizeof();
		if ( container.limit() < next )
			throw new BufferUnderflowException();

		T value = newInstance(address0() + curr);
		container.position(next);
		return value;
	}

	/**
	 * Relative <i>get</i> method. Reads the struct data at this buffer's current position into the specified struct, and then increments the position.
	 *
	 * @return the struct at the buffer's current position
	 *
	 * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
	 */
	public SELF get(T value) {
		int sizeof = sizeof();
		memCopy(address0() + nextGetIndex(container, sizeof), value.address(), sizeof);
		return self();
	}

	/**
	 * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>Writes the specified struct into this buffer at the current position, and then increments the position.</p>
	 *
	 * @param value the struct to be written
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If this buffer's current position is not smaller than its limit
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF put(T value) {
		int sizeof = sizeof();
		memCopy(value.address(), address0() + nextPutIndex(container, sizeof), sizeof);
		return self();
	}

	/**
	 * Absolute <i>get</i> method. Reads the struct at the specified index.
	 *
	 * <p>The struct instance returned is a view of the buffer at the specified position. Changes to this buffer's content will be visible in the struct
	 * instance and vice versa.</p>
	 *
	 * @param index the index from which the struct will be read
	 *
	 * @return the struct at the specified index
	 *
	 * @throws IndexOutOfBoundsException If <tt>index</tt> is negative or not smaller than the buffer's limit
	 */
	public T get(int index) {
		return newInstance(address0() + checkIndex(container, index * sizeof()));
	}

	/**
	 * Absolute <i>get</i> method. Reads the struct data at the specified index into the specified struct.
	 *
	 * @param index the index from which the struct will be read
	 *
	 * @return the struct at the specified index
	 *
	 * @throws IndexOutOfBoundsException If <tt>index</tt> is negative or not smaller than the buffer's limit
	 */
	public SELF get(int index, T value) {
		int sizeof = sizeof();
		memCopy(address0() + checkIndex(container, index * sizeof), value.address(), sizeof);
		return self();
	}

	/**
	 * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>Writes the specified struct into this buffer at the specified index.</p>
	 *
	 * @param index the index at which the struct will be written
	 * @param value the struct value to be written
	 *
	 * @return This buffer
	 *
	 * @throws IndexOutOfBoundsException        If <tt>index</tt> is negative or not smaller than the buffer's limit
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF put(int index, T value) {
		int sizeof = sizeof();
		memCopy(value.address(), address0() + checkIndex(container, index * sizeof), sizeof);
		return self();
	}

	// -- Bulk get operations --

	/**
	 * Relative bulk <i>get</i> method.
	 *
	 * <p>This method transfers structs from this buffer into the specified destination array. An invocation of this method of the form <tt>src.get(a)</tt>
	 * behaves in exactly the same way as the invocation
	 *
	 * <pre>src.get(a, 0, a.length / src.sizeof())</pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> structs remaining in this buffer
	 */
	public SELF get(byte[] dst) {
		return get(dst, 0, dst.length / sizeof());
	}

	/**
	 * Relative bulk <i>get</i> method.
	 *
	 * <p>This method transfers structs from this buffer into the specified destination array. If there are fewer structs remaining in the buffer than are
	 * required to satisfy the request, that is, if <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no structs are transferred and a
	 * {@link java.nio.BufferUnderflowException} is thrown.
	 *
	 * <p>Otherwise, this method copies <tt>length</tt> structs from this buffer into the specified array, starting at the current position of this buffer and
	 * at the specified offset in the array. The position of this buffer is then incremented by <tt>length</tt>.
	 *
	 * @param dst    the array into which structs are to be written
	 * @param offset the offset within the array of the first struct to be written; must be non-negative and no larger than <tt>dst.length</tt>
	 * @param length the maximum number of structs to be written to the specified array; must be non-negative and no larger than
	 *               <tt>(dst.length - offset) / src.sizeof()</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> structs remaining in this buffer
	 * @throws IndexOutOfBoundsException         If the preconditions on the <tt>offset</tt> and <tt>length</tt> parameters do not hold
	 */
	public SELF get(byte[] dst, int offset, int length) {
		container.get(dst, offset, length * sizeof());
		return self();
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>This method transfers the structs remaining in the specified source buffer into this buffer. If there are more structs remaining in the source
	 * buffer than in this buffer, that is, if <tt>src.remaining()</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no structs are transferred and a
	 * {@link java.nio.BufferOverflowException} is thrown.
	 *
	 * <p>Otherwise, this method copies <i>n</i>&nbsp;=&nbsp;<tt>src.remaining()</tt> structs from the specified buffer into this buffer, starting at each
	 * buffer's current position. The positions of both buffers are then incremented by <i>n</i>.</p>
	 *
	 * <p>In other words, an invocation of this method of the form <tt>dst.put(src)</tt> has exactly the same effect as the loop</p>
	 *
	 * <pre>
	 *     while (src.hasRemaining())
	 *         dst.put(src.get()); </pre>
	 *
	 * <p>except that it first checks that there is sufficient space in this buffer and it is potentially much more efficient. </p>
	 *
	 * @param src the source buffer from which structs are to be read; must not be this buffer
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer for the remaining structs in the source buffer
	 * @throws IllegalArgumentException         If the source buffer is this buffer
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF put(SELF src) {
		container.put(src.container);
		return self();
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>This method transfers the entire content of the specified source struct array into this buffer. An invocation of this method of the form
	 * <tt>dst.put(a)</tt> behaves in exactly the same way as the invocation</p>
	 *
	 * <pre>
	 *     dst.put(a, 0, a.length) </pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF put(byte[] src) {
		return put(src, 0, src.length / sizeof());
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>This method transfers structs into this buffer from the specified source array. If there are more structs to be copied from the array than remain
	 * in this buffer, that is, if <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no structs are transferred and a
	 * {@link java.nio.BufferOverflowException} is thrown.
	 *
	 * <p>Otherwise, this method copies <tt>length</tt> structs from the specified array into this buffer, starting at the specified offset in the array and
	 * at the current position of this buffer. The position of this buffer is then incremented by <tt>length</tt>.</p>
	 *
	 * @param src    the array from which structs are to be read
	 * @param offset the offset within the array of the first struct to be read; must be non-negative and no larger than <tt>array.length</tt>
	 * @param length the number of structs to be read from the specified array; must be non-negative and no larger than
	 *               <tt>(array.length - offset) / dst.sizeof()</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
	 * @throws IndexOutOfBoundsException        If the preconditions on the <tt>offset</tt> and <tt>length</tt> parameters do not hold
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF put(byte[] src, int offset, int length) {
		container.put(src, offset, length * sizeof());
		return self();
	}

	/**
	 * Compacts this buffer&nbsp;&nbsp;<i>(optional operation)</i>.
	 *
	 * <p>The structs between the buffer's current position and its limit, if any, are copied to the beginning of the buffer. That is, the struct at index
	 * <i>p</i>&nbsp;=&nbsp;<tt>position()</tt> is copied to index zero, the struct at index <i>p</i>&nbsp;+&nbsp;1 is copied to index one, and so forth until
	 * the struct at index <tt>limit()</tt>&nbsp;-&nbsp;1 is copied to index <i>n</i>&nbsp;=&nbsp;<tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>&nbsp;-&nbsp;
	 * <i>p</i>.
	 * The buffer's position is then set to <i>n+1</i> and its limit is set to its capacity. The mark, if defined, is discarded.
	 *
	 * <p>The buffer's position is set to the number of structs copied, rather than to zero, so that an invocation of this method can be followed
	 * immediately by an invocation of another relative <i>put</i> method.</p>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
	 */
	public SELF compact() {
		container.compact();
		return self();
	}

	/**
	 * Retrieves this buffer's byte order.
	 *
	 * @return This buffer's byte order
	 */
	public ByteOrder order() {
		return container.order();
	}

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
	 *
	 * <p>The hash code of a struct buffer depends only upon its remaining elements; that is, upon the elements from <tt>position()</tt> up to, and including,
	 * the element at <tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>.</p>
	 *
	 * <p>Because buffer hash codes are content-dependent, it is inadvisable to use buffers as keys in hash maps or similar data structures unless it is known
	 * that their contents will not change.</p>
	 *
	 * @return the current hash code of this buffer
	 */
	public int hashCode() {
		return container.hashCode();
	}

	/**
	 * Tells whether or not this buffer is equal to another object.
	 *
	 * <p>Two struct buffers are equal if, and only if,</p>
	 *
	 * <ol>
	 * <li>They have the same number of remaining elements, and</li>
	 * <li>The two sequences of remaining elements, considered independently of their starting positions, are pointwise equal.</li>
	 * </ol>
	 *
	 * <p>A struct buffer is not equal to any other type of object.</p>
	 *
	 * @param ob the object to which this buffer is to be compared
	 *
	 * @return <tt>true</tt> if, and only if, this buffer is equal to the
	 * given object
	 */
	public boolean equals(Object ob) {
		if ( !(ob instanceof StructBuffer) )
			return false;
		StructBuffer<?, ?> that = (StructBuffer<?, ?>)ob;
		return this.container.equals(that.container);
	}

	/**
	 * Compares this buffer to another.
	 *
	 * <p>Two struct buffers are compared by comparing their sequences of remaining elements lexicographically, without regard to the starting position of
	 * each sequence within its corresponding buffer.</p>
	 *
	 * <p>A struct buffer is not comparable to any other type of object.</p>
	 *
	 * @return A negative integer, zero, or a positive integer as this buffer is less than, equal to, or greater than the specified buffer
	 */
	@Override
	public int compareTo(SELF that) {
		return this.container.compareTo(that.container);
	}

	// -----------------------------

	private static int nextGetIndex(ByteBuffer container, int sizeof) {
		int curr = container.position();
		int next = curr + sizeof;
		if ( container.limit() < next )
			throw new BufferUnderflowException();
		container.position(next);
		return curr;
	}

	private static int nextPutIndex(ByteBuffer container, int sizeof) {
		int curr = container.position();
		int next = curr + sizeof;
		if ( container.limit() < next )
			throw new BufferOverflowException();
		container.position(next);
		return curr;
	}

	private static int checkIndex(ByteBuffer container, int index) {
		if ( (index < 0) || (container.limit() < index) )
			throw new IndexOutOfBoundsException();
		return index;
	}

}