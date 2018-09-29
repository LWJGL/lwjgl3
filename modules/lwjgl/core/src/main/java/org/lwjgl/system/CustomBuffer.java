/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Base class of custom buffers with an API that mirrors {@code java.nio} for convenience. */
public abstract class CustomBuffer<SELF extends CustomBuffer<SELF>> extends Pointer.Default {

    @Nullable
    protected ByteBuffer container;

    protected int
        mark,
        position,
        limit,
        capacity;

    protected CustomBuffer(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address);

        this.container = container;

        this.mark = mark;
        this.position = position;
        this.limit = limit;
        this.capacity = capacity;
    }

    /** Returns the {@code sizeof} a single element in the buffer. */
    public abstract int sizeof();

    /** Returns the buffer's base address. [INTERNAL USE ONLY] */
    public long address0() {
        return address;
    }

    /** Returns the memory address at the current buffer position. */
    @Override
    public long address() {
        return address + Integer.toUnsignedLong(position) * sizeof();
    }

    /** Returns the memory address at the specified buffer position. */
    public long address(int position) {
        return address + Integer.toUnsignedLong(position) * sizeof();
    }

    /**
     * Frees the buffer allocation.
     *
     * <p>This method should not be used if the memory backing this buffer is not owned by the buffer.</p>
     */
    public void free() {
        nmemFree(address);
    }

    /**
     * Returns this buffer's capacity.
     *
     * @return the capacity of this buffer
     */
    public int capacity() {
        return capacity;
    }

    /**
     * Returns this buffer's position.
     *
     * @return the position of this buffer
     */
    public int position() {
        return position;
    }

    /**
     * Sets this buffer's position. If the mark is defined and larger than the new position then it is discarded.
     *
     * @param position the new position value; must be non-negative and no larger than the current limit
     *
     * @return This buffer
     *
     * @throws IllegalArgumentException If the preconditions on {@code newPosition} do not hold
     */
    public SELF position(int position) {
        if (position < 0 || limit < position) {
            throw new IllegalArgumentException();
        }
        this.position = position;
        if (position < mark) {
            mark = -1;
        }
        return self();
    }

    /**
     * Returns this buffer's limit.
     *
     * @return the limit of this buffer
     */
    public int limit() {
        return limit;
    }

    /**
     * Sets this buffer's limit. If the position is larger than the new limit then it is set to the new limit. If the mark is defined and larger than the new
     * limit then it is discarded.
     *
     * @param limit the new limit value; must be non-negative and no larger than this buffer's capacity
     *
     * @return This buffer
     *
     * @throws IllegalArgumentException If the preconditions on {@code newLimit} do not hold
     */
    public SELF limit(int limit) {
        if (limit < 0 || capacity < limit) {
            throw new IllegalArgumentException();
        }
        this.limit = limit;
        if (limit < position) {
            position = limit;
        }
        if (limit < mark) {
            mark = -1;
        }
        return self();
    }

    /**
     * Sets this buffer's mark at its position.
     *
     * @return This buffer
     */
    public SELF mark() {
        mark = position;
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
        int m = mark;
        if (m < 0) {
            throw new InvalidMarkException();
        }
        position = m;
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
        position = 0;
        limit = capacity;
        mark = -1;
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
        limit = position;
        position = 0;
        mark = -1;
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
        position = 0;
        mark = -1;
        return self();
    }

    /**
     * Returns the number of elements between the current position and the limit.
     *
     * @return the number of elements remaining in this buffer
     */
    public int remaining() {
        return limit - position;
    }

    /**
     * Tells whether there are any elements between the current position and the limit.
     *
     * @return {@code true} if, and only if, there is at least one element remaining in this buffer
     */
    public boolean hasRemaining() {
        return position < limit;
    }

    /**
     * Creates a new buffer whose content is a shared subsequence of this buffer's content.
     *
     * <p>The content of the new buffer will start at this buffer's current position. Changes to this buffer's content will be visible in the new buffer, and
     * vice versa; the two buffers' position, limit, and mark values will be independent.</p>
     *
     * <p>The new buffer's position will be zero, its capacity and its limit will be the number of elements remaining in this buffer, and its mark will be
     * undefined. The new buffer will be read-only if, and only if, this buffer is read-only.</p>
     *
     * @return the new buffer
     */
    @SuppressWarnings("unchecked")
    public SELF slice() {
        SELF slice;
        try {
            slice = (SELF)UNSAFE.allocateInstance(this.getClass());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(slice, ADDRESS, address + Integer.toUnsignedLong(position) * sizeof());
        UNSAFE.putInt(slice, BUFFER_MARK, -1);
        UNSAFE.putInt(slice, BUFFER_LIMIT, remaining());
        UNSAFE.putInt(slice, BUFFER_CAPACITY, remaining());
        UNSAFE.putObject(slice, BUFFER_CONTAINER, container);

        return slice;
    }

    /**
     * Returns a slice of this buffer between {@code (buffer.position() + offset)} and {@code (buffer.position() + offset + capacity)}.
     *
     * <p>The position and limit of this buffer are preserved after a call to this method.</p>
     *
     * @param offset   the slice offset, it must be &le; {@code this.remaining()}
     * @param capacity the slice length, it must be &le; {@code this.capacity() - (this.position() + offset)}
     *
     * @return the sliced buffer
     */
    @SuppressWarnings("unchecked")
    public SELF slice(int offset, int capacity) {
        int position = this.position + offset;
        if (offset < 0 || this.limit < offset) {
            throw new IllegalArgumentException();
        }

        if (capacity < 0 || this.capacity - position < capacity) {
            throw new IllegalArgumentException();
        }

        SELF slice;
        try {
            slice = (SELF)UNSAFE.allocateInstance(this.getClass());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(slice, ADDRESS, address + Integer.toUnsignedLong(position) * sizeof());
        UNSAFE.putInt(slice, BUFFER_MARK, -1);
        UNSAFE.putInt(slice, BUFFER_LIMIT, capacity);
        UNSAFE.putInt(slice, BUFFER_CAPACITY, capacity);
        UNSAFE.putObject(slice, BUFFER_CONTAINER, container);

        return slice;
    }

    /**
     * Creates a new buffer that shares this buffer's content.
     *
     * <p>The content of the new buffer will be that of this buffer. Changes to this buffer's content will be visible in the new buffer, and vice versa; the
     * two buffers' position, limit, and mark values will be independent.
     *
     * <p>The new buffer's capacity, limit and position will be identical to those of this buffer.</p>
     *
     * @return the new buffer
     */
    @SuppressWarnings("unchecked")
    public SELF duplicate() {
        SELF dup;
        try {
            dup = (SELF)UNSAFE.allocateInstance(this.getClass());
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(dup, ADDRESS, address);
        UNSAFE.putInt(dup, BUFFER_MARK, mark);
        UNSAFE.putInt(dup, BUFFER_POSITION, position);
        UNSAFE.putInt(dup, BUFFER_LIMIT, limit);
        UNSAFE.putInt(dup, BUFFER_CAPACITY, capacity);
        UNSAFE.putObject(dup, BUFFER_CONTAINER, container);

        return dup;
    }

    // -- Bulk get operations --

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>This method transfers the elements remaining in the specified source buffer into this buffer. If there are more elements remaining in the source
     * buffer than in this buffer, that is, if {@code src.remaining()}&nbsp;{@code &gt;}&nbsp;{@code remaining()}, then no elements are transferred and a
     * {@link java.nio.BufferOverflowException} is thrown.
     *
     * <p>Otherwise, this method copies <i>n</i>&nbsp;=&nbsp;{@code src.remaining()} elements from the specified buffer into this buffer, starting at each
     * buffer's current position. The positions of both buffers are then incremented by <i>n</i>.</p>
     *
     * <p>In other words, an invocation of this method of the form {@code dst.put(src)} has exactly the same effect as the loop</p>
     *
     * <pre>
     *     while (src.hasRemaining())
     *         dst.put(src.get()); </pre>
     *
     * <p>except that it first checks that there is sufficient space in this buffer and it is potentially much more efficient. </p>
     *
     * @param src the source buffer from which elements are to be read; must not be this buffer
     *
     * @return This buffer
     *
     * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer for the remaining elements in the source buffer
     * @throws IllegalArgumentException         If the source buffer is this buffer
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public SELF put(SELF src) {
        if (src == this) {
            throw new IllegalArgumentException();
        }
        int n = src.remaining();
        if (remaining() < n) {
            throw new BufferOverflowException();
        }

        memCopy(src.address(), this.address(), Integer.toUnsignedLong(n) * sizeof());
        position += n;

        return self();
    }

    /**
     * Compacts this buffer&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>The elements between the buffer's current position and its limit, if any, are copied to the beginning of the buffer. That is, the element at index
     * <i>p</i>&nbsp;=&nbsp;{@code position()} is copied to index zero, the element at index <i>p</i>&nbsp;+&nbsp;1 is copied to index one, and so forth until
     * the element at index {@code limit()}&nbsp;-&nbsp;1 is copied to index <i>n</i>&nbsp;=&nbsp;{@code limit()}&nbsp;-&nbsp;{@code 1}&nbsp;-&nbsp;
     * <i>p</i>.
     * The buffer's position is then set to <i>n+1</i> and its limit is set to its capacity. The mark, if defined, is discarded.
     *
     * <p>The buffer's position is set to the number of elements copied, rather than to zero, so that an invocation of this method can be followed
     * immediately by an invocation of another relative <i>put</i> method.</p>
     *
     * @return This buffer
     *
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public SELF compact() {
        memCopy(address(), address, Integer.toUnsignedLong(remaining()) * sizeof());
        position(remaining());
        limit(capacity());
        mark = -1;

        return self();
    }

    /**
     * Returns a string summarizing the state of this buffer.
     *
     * @return A summary string
     */
    public String toString() {
        return getClass().getName() + "[pos=" + position() + " lim=" + limit() + " cap=" + capacity() + "]";
    }

    // -----------------------------

    protected abstract SELF self();

    protected final int nextGetIndex() {
        if (position < limit) {
            return position++;
        }
        throw new BufferUnderflowException();
    }

    protected final int nextPutIndex() {
        if (position < limit) {
            return position++;
        }
        throw new BufferOverflowException();
    }

}