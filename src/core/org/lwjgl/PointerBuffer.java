/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a container for architecture-independent pointer data. Its interface mirrors the {@link LongBuffer} API for convenience. */
public class PointerBuffer implements Comparable {

	static {
		Sys.touch();
	}

	protected final ByteBuffer pointers;

	protected final Buffer     view;
	protected final IntBuffer  view32;
	protected final LongBuffer view64;

	/**
	 * Creates a new PointerBuffer with the specified capacity.
	 *
	 * @param capacity the PointerBuffer size, in number of pointers
	 */
	public PointerBuffer(int capacity) {
		this(BufferUtils.createByteBuffer(capacity * POINTER_SIZE), false);
	}

	/**
	 * Creates a new PointerBuffer using the specified ByteBuffer as its pointer
	 * data source. This is useful for users that do their own memory management
	 * over a big ByteBuffer, instead of allocating many small ones.
	 *
	 * @param source the source buffer
	 */
	public PointerBuffer(ByteBuffer source) {
		this(checkSource(source).slice().order(source.order()), false);
	}

	private PointerBuffer(ByteBuffer source, boolean dummy) {
		pointers = source;

		if ( BITS64 ) {
			view32 = null;
			view = view64 = pointers.asLongBuffer();
		} else {
			view = view32 = pointers.asIntBuffer();
			view64 = null;
		}
	}

	private static ByteBuffer checkSource(ByteBuffer source) {
		if ( !LWJGLUtil.CHECKS )
			return source;

		if ( !source.isDirect() )
			throw new IllegalArgumentException("The source buffer is not direct.");

		int mask = POINTER_SIZE - 1;
		if ( (memAddress(source) & mask) != 0 || (source.remaining() & mask) != 0 )
			throw new IllegalArgumentException("The source buffer is not aligned to " + POINTER_SIZE + " bytes.");

		return source;
	}

	/**
	 * Returns the ByteBuffer that backs this PointerBuffer.
	 *
	 * @return the pointer ByteBuffer
	 */
	public ByteBuffer getBuffer() {
		return pointers;
	}

	/**
	 * Returns this buffer's capacity. </p>
	 *
	 * @return the capacity of this buffer
	 */
	public final int capacity() {
		return view.capacity();
	}

	/**
	 * Returns this buffer's position. </p>
	 *
	 * @return the position of this buffer
	 */
	public final int position() {
		return view.position();
	}

	/**
	 * Returns this buffer's position, in bytes. </p>
	 *
	 * @return the position of this buffer in bytes.
	 */
	public final int positionByte() {
		return position() * POINTER_SIZE;
	}

	/**
	 * Sets this buffer's position.  If the mark is defined and larger than the
	 * new position then it is discarded. </p>
	 *
	 * @param newPosition The new position value; must be non-negative
	 *                    and no larger than the current limit
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newPosition</tt> do not hold
	 */
	public final PointerBuffer position(int newPosition) {
		view.position(newPosition);
		return this;
	}

	/**
	 * Returns this buffer's limit. </p>
	 *
	 * @return the limit of this buffer
	 */
	public final int limit() {
		return view.limit();
	}

	/**
	 * Sets this buffer's limit.  If the position is larger than the new limit
	 * then it is set to the new limit.  If the mark is defined and larger than
	 * the new limit then it is discarded. </p>
	 *
	 * @param newLimit The new limit value; must be non-negative
	 *                 and no larger than this buffer's capacity
	 *
	 * @return This buffer
	 *
	 * @throws IllegalArgumentException If the preconditions on <tt>newLimit</tt> do not hold
	 */
	public final PointerBuffer limit(int newLimit) {
		view.limit(newLimit);
		return this;
	}

	/**
	 * Sets this buffer's mark at its position. </p>
	 *
	 * @return This buffer
	 */
	public final PointerBuffer mark() {
		view.mark();
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
	public final PointerBuffer reset() {
		view.reset();
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
	public final PointerBuffer clear() {
		view.clear();
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
	 * <p> This method is often used in conjunction with the {@link
	 * java.nio.ByteBuffer#compact compact} method when transferring data from
	 * one place to another.  </p>
	 *
	 * @return This buffer
	 */
	public final PointerBuffer flip() {
		view.flip();
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
	public final PointerBuffer rewind() {
		view.rewind();
		return this;
	}

	/**
	 * Returns the number of elements between the current position and the
	 * limit. </p>
	 *
	 * @return the number of elements remaining in this buffer
	 */
	public final int remaining() {
		return view.remaining();
	}

	/**
	 * Returns the number of bytes between the current position and the
	 * limit. </p>
	 *
	 * @return the number of bytes remaining in this buffer
	 */
	public final int remainingByte() {
		return remaining() * POINTER_SIZE;
	}

	/**
	 * Tells whether there are any elements between the current position and
	 * the limit. </p>
	 *
	 * @return <tt>true</tt> if, and only if, there is at least one element
	 *         remaining in this buffer
	 */
	public final boolean hasRemaining() {
		return view.hasRemaining();
	}

	/**
	 * Allocates a new pointer buffer.
	 * <p/>
	 * <p> The new buffer's position will be zero, its limit will be its
	 * capacity, and its mark will be undefined.  </p>
	 *
	 * @param capacity The new buffer's capacity, in pointers
	 *
	 * @return the new pointer buffer
	 *
	 * @throws IllegalArgumentException If the <tt>capacity</tt> is a negative integer
	 */
	public static PointerBuffer allocateDirect(int capacity) {
		return new PointerBuffer(capacity);
	}

	/**
	 * This method is used in slice and duplicate instead of normal object construction,
	 * so that subclasses can return themselves.
	 *
	 * @param source
	 *
	 * @return A new PointerBuffer instance
	 */
	protected PointerBuffer newInstance(ByteBuffer source) {
		return new PointerBuffer(source, false);
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
	 * will be the number of longs remaining in this buffer, and its mark
	 * will be undefined.  The new buffer will be direct if, and only if, this
	 * buffer is direct, and it will be read-only if, and only if, this buffer
	 * is read-only.  </p>
	 *
	 * @return the new pointer buffer
	 */
	public PointerBuffer slice() {
		pointers.position(view.position() << POINTER_SIZE);
		pointers.limit(view.limit() << POINTER_SIZE);

		try {
			return newInstance(pointers.slice().order(pointers.order()));
		} finally {
			pointers.clear();
		}
	}

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
	public PointerBuffer duplicate() {
		PointerBuffer buffer = newInstance(pointers);

		buffer.position(view.position());
		buffer.limit(view.limit());

		return buffer;
	}

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
	public PointerBuffer asReadOnlyBuffer() {
		PointerBuffer buffer = new PointerBufferR(pointers);

		buffer.position(view.position());
		buffer.limit(view.limit());

		return buffer;
	}

	public boolean isReadOnly() {
		return false;
	}

	/**
	 * Relative <i>get</i> method.  Reads the pointer at this buffer's
	 * current position, and then increments the position. </p>
	 *
	 * @return the long at the buffer's current position
	 *
	 * @throws java.nio.BufferUnderflowException
	 *          If the buffer's current position is not smaller than its limit
	 */
	public long get() {
		return BITS64
		       ? view64.get()
		       : view32.get() & 0x00000000FFFFFFFFL;
	}

	/**
	 * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> Writes the given pointer into this buffer at the current
	 * position, and then increments the position. </p>
	 *
	 * @param l The long to be written
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException
	 *          If this buffer's current position is not smaller than its limit
	 * @throws java.nio.ReadOnlyBufferException
	 *          If this buffer is read-only
	 */
	public PointerBuffer put(long l) {
		if ( BITS64 )
			view64.put(l);
		else
			view32.put((int)l);
		return this;
	}

	/**
	 * Convenience put on a target ByteBuffer.
	 *
	 * @param target the target ByteBuffer
	 * @param l      the long value to be written
	 */
	public static void put(ByteBuffer target, long l) {
		if ( BITS64 )
			target.putLong(l);
		else
			target.putInt((int)l);
	}

	/**
	 * Absolute <i>get</i> method.  Reads the pointer at the given
	 * index. </p>
	 *
	 * @param index The index from which the long will be read
	 *
	 * @return the long at the given index
	 *
	 * @throws IndexOutOfBoundsException If <tt>index</tt> is negative
	 *                                   or not smaller than the buffer's limit
	 */
	public long get(int index) {
		return BITS64
		       ? view64.get(index)
		       : view32.get(index) & 0x00000000FFFFFFFFL;
	}

	/**
	 * Convenience get from a source ByteBuffer.
	 *
	 * @param target the source ByteBuffer
	 * @param index  the index at which the long will be read
	 */
	public static long get(ByteBuffer target, int index) {
		return BITS64
		       ? target.getLong(index)
		       : target.getInt(index) & 0x00000000FFFFFFFFL;
	}

	/**
	 * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> Writes the given pointer into this buffer at the given
	 * index. </p>
	 *
	 * @param index The index at which the long will be written
	 * @param l     The long value to be written
	 *
	 * @return This buffer
	 *
	 * @throws IndexOutOfBoundsException If <tt>index</tt> is negative
	 *                                   or not smaller than the buffer's limit
	 * @throws java.nio.ReadOnlyBufferException
	 *                                   If this buffer is read-only
	 */
	public PointerBuffer put(int index, long l) {
		if ( BITS64 )
			view64.put(index, l);
		else
			view32.put(index, (int)l);
		return this;
	}

	/**
	 * Convenience put on a target ByteBuffer.
	 *
	 * @param target the target ByteBuffer
	 * @param index  the index at which the long will be written
	 * @param l      the long value to be written
	 */
	public static void put(ByteBuffer target, int index, long l) {
		if ( BITS64 )
			target.putLong(index, l);
		else
			target.putInt(index, (int)l);
	}

	// -- Buffer address operations --

	/** Puts the pointer to the given buffer at the current position and the increments the position. */
	public void putPointer(ByteBuffer buffer) { put(memAddress(buffer)); }

	/** Puts the pointer to the given buffer at the given index. */
	public void putPointer(int index, ByteBuffer buffer) { put(index, memAddress(buffer)); }

	/** Returns a ByteBuffer instance that starts at the address found at the current position and has capacity equal to the given size. */
	public ByteBuffer getByteBuffer(int size) { return memByteBuffer(get(), size); }

	/** Returns a ByteBuffer instance that starts at the address found at the given index and has capacity equal to the given size. */
	public ByteBuffer getByteBuffer(int index, int size) { return memByteBuffer(get(index), size); }

	// -- Bulk get operations --

	/**
	 * Relative bulk <i>get</i> method.
	 * <p/>
	 * <p> This method transfers longs from this buffer into the given
	 * destination array.  If there are fewer longs remaining in the
	 * buffer than are required to satisfy the request, that is, if
	 * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
	 * longs are transferred and a {@link java.nio.BufferUnderflowException} is
	 * thrown.
	 * <p/>
	 * <p> Otherwise, this method copies <tt>length</tt> longs from this
	 * buffer into the given array, starting at the current position of this
	 * buffer and at the given offset in the array.  The position of this
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
	 * except that it first checks that there are sufficient longs in
	 * this buffer and it is potentially much more efficient. </p>
	 *
	 * @param dst    The array into which longs are to be written
	 * @param offset The offset within the array of the first long to be
	 *               written; must be non-negative and no larger than
	 *               <tt>dst.length</tt>
	 * @param length The maximum number of longs to be written to the given
	 *               array; must be non-negative and no larger than
	 *               <tt>dst.length - offset</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException
	 *                                   If there are fewer than <tt>length</tt> longs
	 *                                   remaining in this buffer
	 * @throws IndexOutOfBoundsException If the preconditions on the <tt>offset</tt> and <tt>length</tt>
	 *                                   parameters do not hold
	 */
	public PointerBuffer get(long[] dst, int offset, int length) {
		if ( BITS64 )
			view64.get(dst, offset, length);
		else {
			checkBounds(offset, length, dst.length);
			if ( length > view32.remaining() )
				throw new BufferUnderflowException();
			int end = offset + length;
			for ( int i = offset; i < end; i++ )
				dst[i] = view32.get() & 0x00000000FFFFFFFFL;
		}

		return this;
	}

	/**
	 * Relative bulk <i>get</i> method.
	 * <p/>
	 * <p> This method transfers longs from this buffer into the given
	 * destination array.  An invocation of this method of the form
	 * <tt>src.get(a)</tt> behaves in exactly the same way as the invocation
	 * <p/>
	 * <pre>
	 *     src.get(a, 0, a.length) </pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferUnderflowException
	 *          If there are fewer than <tt>length</tt> longs
	 *          remaining in this buffer
	 */
	public PointerBuffer get(long[] dst) {
		return get(dst, 0, dst.length);
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers the longs remaining in the given source
	 * buffer into this buffer.  If there are more longs remaining in the
	 * source buffer than in this buffer, that is, if
	 * <tt>src.remaining()</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>,
	 * then no longs are transferred and a {@link
	 * java.nio.BufferOverflowException} is thrown.
	 * <p/>
	 * <p> Otherwise, this method copies
	 * <i>n</i>&nbsp;=&nbsp;<tt>src.remaining()</tt> longs from the given
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
	 * @param src The source buffer from which longs are to be read;
	 *            must not be this buffer
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException
	 *                                  If there is insufficient space in this buffer
	 *                                  for the remaining longs in the source buffer
	 * @throws IllegalArgumentException If the source buffer is this buffer
	 * @throws java.nio.ReadOnlyBufferException
	 *                                  If this buffer is read-only
	 */
	public PointerBuffer put(PointerBuffer src) {
		if ( BITS64 )
			view64.put(src.view64);
		else
			view32.put(src.view32);
		return this;
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers longs into this buffer from the given
	 * source array.  If there are more longs to be copied from the array
	 * than remain in this buffer, that is, if
	 * <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no
	 * longs are transferred and a {@link java.nio.BufferOverflowException} is
	 * thrown.
	 * <p/>
	 * <p> Otherwise, this method copies <tt>length</tt> longs from the
	 * given array into this buffer, starting at the given offset in the array
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
	 * @param src    The array from which longs are to be read
	 * @param offset The offset within the array of the first long to be read;
	 *               must be non-negative and no larger than <tt>array.length</tt>
	 * @param length The number of longs to be read from the given array;
	 *               must be non-negative and no larger than
	 *               <tt>array.length - offset</tt>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException
	 *                                   If there is insufficient space in this buffer
	 * @throws IndexOutOfBoundsException If the preconditions on the <tt>offset</tt> and <tt>length</tt>
	 *                                   parameters do not hold
	 * @throws java.nio.ReadOnlyBufferException
	 *                                   If this buffer is read-only
	 */
	public PointerBuffer put(long[] src, int offset, int length) {
		if ( BITS64 )
			view64.put(src, offset, length);
		else {
			checkBounds(offset, length, src.length);
			if ( length > view32.remaining() )
				throw new BufferOverflowException();
			int end = offset + length;
			for ( int i = offset; i < end; i++ )
				view32.put((int)src[i]);
		}

		return this;
	}

	/**
	 * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> This method transfers the entire content of the given source
	 * long array into this buffer.  An invocation of this method of the
	 * form <tt>dst.put(a)</tt> behaves in exactly the same way as the
	 * invocation
	 * <p/>
	 * <pre>
	 *     dst.put(a, 0, a.length) </pre>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.BufferOverflowException
	 *          If there is insufficient space in this buffer
	 * @throws java.nio.ReadOnlyBufferException
	 *          If this buffer is read-only
	 */
	public final PointerBuffer put(long[] src) {
		return put(src, 0, src.length);
	}

	/**
	 * Compacts this buffer&nbsp;&nbsp;<i>(optional operation)</i>.
	 * <p/>
	 * <p> The longs between the buffer's current position and its limit,
	 * if any, are copied to the beginning of the buffer.  That is, the
	 * long at index <i>p</i>&nbsp;=&nbsp;<tt>position()</tt> is copied
	 * to index zero, the long at index <i>p</i>&nbsp;+&nbsp;1 is copied
	 * to index one, and so forth until the long at index
	 * <tt>limit()</tt>&nbsp;-&nbsp;1 is copied to index
	 * <i>n</i>&nbsp;=&nbsp;<tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>&nbsp;-&nbsp;<i>p</i>.
	 * The buffer's position is then set to <i>n+1</i> and its limit is set to
	 * its capacity.  The mark, if defined, is discarded.
	 * <p/>
	 * <p> The buffer's position is set to the number of longs copied,
	 * rather than to zero, so that an invocation of this method can be
	 * followed immediately by an invocation of another relative <i>put</i>
	 * method. </p>
	 *
	 * @return This buffer
	 *
	 * @throws java.nio.ReadOnlyBufferException
	 *          If this buffer is read-only
	 */
	public PointerBuffer compact() {
		if ( BITS64 )
			view64.compact();
		else
			view32.compact();
		return this;
	}

	/**
	 * Retrieves this buffer's byte order.
	 * <p/>
	 * <p> The byte order of a pointer buffer created by allocation or by
	 * wrapping an existing <tt>long</tt> array is the {@link
	 * java.nio.ByteOrder#nativeOrder </code>native order<code>} of the underlying
	 * hardware.  The byte order of a pointer buffer created as a <a
	 * href="ByteBuffer.html#views">view</a> of a byte buffer is that of the
	 * byte buffer at the moment that the view is created.  </p>
	 *
	 * @return This buffer's byte order
	 */
	public ByteOrder order() {
		if ( BITS64 )
			return view64.order();
		else
			return view32.order();
	}

	/**
	 * Returns a string summarizing the state of this buffer.  </p>
	 *
	 * @return A summary string
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder(48);
		sb.append(getClass().getName());
		sb.append("[pos=");
		sb.append(position());
		sb.append(" lim=");
		sb.append(limit());
		sb.append(" cap=");
		sb.append(capacity());
		sb.append("]");
		return sb.toString();
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
	 * @param ob The object to which this buffer is to be compared
	 *
	 * @return <tt>true</tt> if, and only if, this buffer is equal to the
	 *         given object
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
	 *         is less than, equal to, or greater than the given buffer
	 */
	@Override
	public int compareTo(Object o) {
		PointerBuffer that = (PointerBuffer)o;
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

	/** Read-only version of PointerBuffer. */
	private static final class PointerBufferR extends PointerBuffer {

		PointerBufferR(ByteBuffer source) {
			super(source, false);
		}

		@Override
		public boolean isReadOnly() {
			return true;
		}

		@Override
		protected PointerBuffer newInstance(ByteBuffer source) {
			return new PointerBufferR(source);
		}

		@Override
		public PointerBuffer asReadOnlyBuffer() {
			return duplicate();
		}

		@Override
		public PointerBuffer put(long l) {
			throw new ReadOnlyBufferException();
		}

		@Override
		public PointerBuffer put(int index, long l) {
			throw new ReadOnlyBufferException();
		}

		@Override
		public PointerBuffer put(PointerBuffer src) {
			throw new ReadOnlyBufferException();
		}

		@Override
		public PointerBuffer put(long[] src, int offset, int length) {
			throw new ReadOnlyBufferException();
		}

		@Override
		public PointerBuffer compact() {
			throw new ReadOnlyBufferException();
		}

	}

}