/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.lwjgl.system.*;

import javax.annotation.*;
import java.nio.*;

import static org.lwjgl.system.CheckIntrinsics.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class is a container for C {@code long} data. Its interface mirrors the {@link LongBuffer} API for convenience.
 *
 * <p>The size of the C {@code long} type depends on the platform and CPU architecture. On Windows it is always 32-bit. On other platforms, it is 32-bit on
 * 32-bit architectures and 64-bit on 64-bit architectures. Most APIs prefer portable sizes, so this class is rarely needed.</p>
 */
public class CLongBuffer extends CustomBuffer<CLongBuffer> implements Comparable<CLongBuffer> {

    protected CLongBuffer(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    /**
     * Allocates a new long buffer.
     *
     * <p>The new buffer's position will be zero, its limit will be its capacity, and its mark will be undefined.</p>
     *
     * @param capacity the new buffer's capacity, in longs
     *
     * @return the new long buffer
     *
     * @throws IllegalArgumentException If the {@code capacity} is a negative integer
     */
    public static CLongBuffer allocateDirect(int capacity) {
        ByteBuffer source = BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(capacity, CLONG_SHIFT));
        return wrap(CLongBuffer.class, memAddress(source), capacity, source);
    }

    /**
     * Creates a new {@code CLongBuffer} that starts at the specified memory address and has the specified capacity.
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity, in number of longs
     */
    public static CLongBuffer create(long address, int capacity) {
        return wrap(CLongBuffer.class, address, capacity);
    }

    /**
     * Creates a new {@code CLongBuffer} using the specified ByteBuffer as its long data source.
     *
     * @param source the source buffer
     */
    public static CLongBuffer create(ByteBuffer source) {
        int capacity = source.remaining() >> CLONG_SHIFT;
        return wrap(CLongBuffer.class, memAddress(source), capacity, source);
    }

    @Override
    protected CLongBuffer self() {
        return this;
    }

    @Override
    public int sizeof() {
        return CLONG_SIZE;
    }

    /**
     * Relative <i>get</i> method. Reads the long at this buffer's current position, and then increments the position.
     *
     * @return the long at the buffer's current position
     *
     * @throws BufferUnderflowException If the buffer's current position is not smaller than its limit
     */
    public long get() {
        return memGetCLong(address + Integer.toUnsignedLong(nextGetIndex()) * CLONG_SIZE);
    }

    /**
     * Convenience relative get from a source ByteBuffer.
     *
     * @param source the source ByteBuffer
     */
    public static long get(ByteBuffer source) {
        if (source.remaining() < CLONG_SIZE) {
            throw new BufferUnderflowException();
        }

        try {
            return memGetCLong(memAddress(source));
        } finally {
            source.position(source.position() + CLONG_SIZE);
        }
    }

    /**
     * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified long into this buffer at the current position, and then increments the position.</p>
     *
     * @param p the long to be written
     *
     * @return This buffer
     *
     * @throws BufferOverflowException If this buffer's current position is not smaller than its limit
     */
    public CLongBuffer put(long p) {
        memPutCLong(address + Integer.toUnsignedLong(nextPutIndex()) * CLONG_SIZE, p);
        return this;
    }

    /**
     * Convenience relative put on a target ByteBuffer.
     *
     * @param target the target ByteBuffer
     * @param p      the long value to be written
     */
    public static void put(ByteBuffer target, long p) {
        if (target.remaining() < CLONG_SIZE) {
            throw new BufferOverflowException();
        }

        try {
            memPutCLong(memAddress(target), p);
        } finally {
            target.position(target.position() + CLONG_SIZE);
        }
    }

    /**
     * Absolute <i>get</i> method. Reads the long at the specified {@code index}.
     *
     * @param index the index from which the long will be read
     *
     * @return the long at the specified {@code index}
     *
     * @throws IndexOutOfBoundsException If {@code index} is negative or not smaller than the buffer's limit
     */
    public long get(int index) {
        return memGetCLong(address + check(index, limit) * CLONG_SIZE);
    }

    /**
     * Convenience absolute get from a source ByteBuffer.
     *
     * @param source the source ByteBuffer
     * @param index  the index at which the long will be read
     */
    public static long get(ByteBuffer source, int index) {
        checkFromIndexSize(index, CLONG_SIZE, source.limit());
        return memGetCLong(memAddress0(source) + index);
    }

    /**
     * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified long into this buffer at the specified {@code index}.</p>
     *
     * @param index the index at which the long will be written
     * @param p     the long value to be written
     *
     * @return This buffer
     *
     * @throws IndexOutOfBoundsException If {@code index} is negative or not smaller than the buffer's limit
     */
    public CLongBuffer put(int index, long p) {
        memPutCLong(address + check(index, limit) * CLONG_SIZE, p);
        return this;
    }

    /**
     * Convenience absolute put on a target ByteBuffer.
     *
     * @param target the target ByteBuffer
     * @param index  the index at which the long will be written
     * @param p      the long value to be written
     */
    public static void put(ByteBuffer target, int index, long p) {
        checkFromIndexSize(index, CLONG_SIZE, target.limit());
        memPutCLong(memAddress0(target) + index, p);
    }

    // -- Bulk get operations --

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p>This method transfers longs from this buffer into the specified destination array. An invocation of this method of the form {@code src.get(a)}
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     src.get(a, 0, a.length) </pre>
     *
     * @return This buffer
     *
     * @throws BufferUnderflowException If there are fewer than {@code length} longs remaining in this buffer
     */
    public CLongBuffer get(long[] dst) {
        return get(dst, 0, dst.length);
    }

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p>This method transfers longs from this buffer into the specified destination array. If there are fewer longs remaining in the buffer than are
     * required to satisfy the request, that is, if {@code length}&nbsp;{@code &gt;}&nbsp;{@code remaining()}, then no longs are transferred and a
     * {@link BufferUnderflowException} is thrown.
     *
     * <p>Otherwise, this method copies {@code length} longs from this buffer into the specified array, starting at the current position of this buffer and
     * at the specified offset in the array. The position of this buffer is then incremented by {@code length}.
     *
     * <p>In other words, an invocation of this method of the form {@code src.get(dst,&nbsp;off,&nbsp;len)} has exactly the same effect as the loop</p>
     *
     * <pre>
     *     for (int i = off; i &lt; off + len; i++)
     *         dst[i] = src.get(); </pre>
     *
     * <p>except that it first checks that there are sufficient longs in this buffer and it is potentially much more efficient. </p>
     *
     * @param dst    the array into which longs are to be written
     * @param offset the offset within the array of the first long to be written; must be non-negative and no larger than {@code dst.length}
     * @param length the maximum number of longs to be written to the specified array; must be non-negative and no larger than {@code dst.length - offset}
     *
     * @return This buffer
     *
     * @throws BufferUnderflowException  If there are fewer than {@code length} longs remaining in this buffer
     * @throws IndexOutOfBoundsException If the preconditions on the {@code offset} and {@code length} parameters do not hold
     */
    public CLongBuffer get(long[] dst, int offset, int length) {
        if (CLONG_SIZE == 8) {
            memLongBuffer(address(), remaining()).get(dst, offset, length);
            position(position() + length);
        } else {
            get32(dst, offset, length);
        }

        return this;
    }

    private void get32(long[] dst, int offset, int length) {
        checkFromIndexSize(offset, length, dst.length);
        if (remaining() < length) {
            throw new BufferUnderflowException();
        }
        for (int i = offset, end = offset + length; i < end; i++) {
            dst[i] = get();
        }
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>This method transfers the entire content of the specified source long array into this buffer. An invocation of this method of the form
     * {@code dst.put(a)} behaves in exactly the same way as the invocation</p>
     *
     * <pre>
     *     dst.put(a, 0, a.length) </pre>
     *
     * @return This buffer
     *
     * @throws BufferOverflowException If there is insufficient space in this buffer
     */
    public CLongBuffer put(long[] src) {
        return put(src, 0, src.length);
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>This method transfers longs into this buffer from the specified source array. If there are more longs to be copied from the array than remain
     * in this buffer, that is, if {@code length}&nbsp;{@code &gt;}&nbsp;{@code remaining()}, then no longs are transferred and a
     * {@link BufferOverflowException} is thrown.
     *
     * <p>Otherwise, this method copies {@code length} longs from the specified array into this buffer, starting at the specified offset in the array and
     * at the current position of this buffer. The position of this buffer is then incremented by {@code length}.</p>
     *
     * <p>In other words, an invocation of this method of the form {@code dst.put(src,&nbsp;off,&nbsp;len)} has exactly the same effect as the loop</p>
     *
     * <pre>
     *     for (int i = off; i &lt; off + len; i++)
     *         dst.put(a[i]); </pre>
     *
     * <p>except that it first checks that there is sufficient space in this buffer and it is potentially much more efficient.</p>
     *
     * @param src    the array from which longs are to be read
     * @param offset the offset within the array of the first long to be read; must be non-negative and no larger than {@code array.length}
     * @param length the number of longs to be read from the specified array; must be non-negative and no larger than {@code array.length - offset}
     *
     * @return This buffer
     *
     * @throws BufferOverflowException   If there is insufficient space in this buffer
     * @throws IndexOutOfBoundsException If the preconditions on the {@code offset} and {@code length} parameters do not hold
     */
    public CLongBuffer put(long[] src, int offset, int length) {
        if (CLONG_SIZE == 8) {
            memLongBuffer(address(), remaining()).put(src, offset, length);
            position(position() + length);
        } else {
            put32(src, offset, length);
        }

        return this;
    }

    private void put32(long[] src, int offset, int length) {
        checkFromIndexSize(offset, length, src.length);
        if (remaining() < length) {
            throw new BufferOverflowException();
        }
        int end = offset + length;
        for (int i = offset; i < end; i++) {
            put(src[i]);
        }
    }

    /**
     * Returns the current hash code of this buffer.
     *
     * <p>The hash code of a long buffer depends only upon its remaining elements; that is, upon the elements from {@code position()} up to, and including,
     * the element at {@code limit()}&nbsp;-&nbsp;{@code 1}.</p>
     *
     * <p>Because buffer hash codes are content-dependent, it is inadvisable to use buffers as keys in hash maps or similar data structures unless it is known
     * that their contents will not change.</p>
     *
     * @return the current hash code of this buffer
     */
    public int hashCode() {
        int h = 1;
        int p = position();
        for (int i = limit() - 1; i >= p; i--) {
            h = 31 * h + (int)get(i);
        }
        return h;
    }

    /**
     * Tells whether or not this buffer is equal to another object.
     *
     * <p>Two long buffers are equal if, and only if,</p>
     *
     * <ol>
     * <li>They have the same element type,</li>
     * <li>They have the same number of remaining elements, and</li>
     * <li>The two sequences of remaining elements, considered
     * independently of their starting positions, are pointwise equal.</li>
     * </ol>
     *
     * <p>A long buffer is not equal to any other type of object.</p>
     *
     * @param ob the object to which this buffer is to be compared
     *
     * @return {@code true} if, and only if, this buffer is equal to the
     * given object
     */
    public boolean equals(Object ob) {
        if (!(ob instanceof CLongBuffer)) {
            return false;
        }
        CLongBuffer that = (CLongBuffer)ob;
        if (this.remaining() != that.remaining()) {
            return false;
        }
        int p = this.position();
        for (int i = this.limit() - 1, j = that.limit() - 1; i >= p; i--, j--) {
            long v1 = this.get(i);
            long v2 = that.get(j);
            if (v1 != v2) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compares this buffer to another.
     *
     * <p>Two long buffers are compared by comparing their sequences of remaining elements lexicographically, without regard to the starting position of
     * each sequence within its corresponding buffer.</p>
     *
     * <p>A long buffer is not comparable to any other type of object.</p>
     *
     * @return A negative integer, zero, or a positive integer as this buffer is less than, equal to, or greater than the specified buffer
     */
    @Override
    public int compareTo(CLongBuffer that) {
        int n = this.position() + Math.min(this.remaining(), that.remaining());
        for (int i = this.position(), j = that.position(); i < n; i++, j++) {
            long v1 = this.get(i);
            long v2 = that.get(j);
            if (v1 == v2) {
                continue;
            }
            if (v1 < v2) {
                return -1;
            }
            return +1;
        }
        return this.remaining() - that.remaining();
    }

}