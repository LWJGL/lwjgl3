/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** This class is a container for architecture-independent pointer data. Its interface mirrors the {@link LongBuffer} API for convenience. */
public class PointerBuffer extends CustomBuffer<PointerBuffer> implements Comparable<PointerBuffer> {

    protected PointerBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
    }

    /**
     * Allocates a new pointer buffer.
     *
     * <p>The new buffer's position will be zero, its limit will be its capacity, and its mark will be undefined.</p>
     *
     * @param capacity the new buffer's capacity, in pointers
     *
     * @return the new pointer buffer
     *
     * @throws IllegalArgumentException If the <tt>capacity</tt> is a negative integer
     */
    public static PointerBuffer allocateDirect(int capacity) {
        ByteBuffer source = BufferUtils.createByteBuffer(capacity << POINTER_SHIFT);
        return new PointerBuffer(memAddress(source), source, -1, 0, capacity, capacity);
    }

    /**
     * Creates a new PointerBuffer that starts at the specified memory address and has the specified capacity.
     *
     * @param address  the starting memory address
     * @param capacity the buffer capacity, in number of pointers
     */
    public static PointerBuffer create(long address, int capacity) {
        return new PointerBuffer(address, null, -1, 0, capacity, capacity);
    }

    /**
     * Creates a new PointerBuffer using the specified ByteBuffer as its pointer data source.
     *
     * @param source the source buffer
     */
    public static PointerBuffer create(ByteBuffer source) {
        int capacity = source.remaining() >> POINTER_SHIFT;
        return new PointerBuffer(memAddress(source), source, -1, 0, capacity, capacity);
    }

    @Override
    protected PointerBuffer self() {
        return this;
    }

    @Override
    protected int sizeof() {
        return Pointer.POINTER_SIZE;
    }

    @Override
    protected PointerBuffer newBufferInstance(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        return new PointerBuffer(address, container, mark, position, limit, capacity);
    }

    /**
     * Relative <i>get</i> method. Reads the pointer at this buffer's current position, and then increments the position.
     *
     * @return the pointer at the buffer's current position
     *
     * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
     */
    public long get() {
        return memGetAddress(address + (nextGetIndex() << POINTER_SHIFT));
    }

    /**
     * Convenience relative get from a source ByteBuffer.
     *
     * @param source the source ByteBuffer
     */
    public static long get(ByteBuffer source) {
        if (source.limit() < source.position() + POINTER_SIZE) {
            throw new BufferUnderflowException();
        }

        try {
            return memGetAddress(memAddress(source));
        } finally {
            source.position(source.position() + POINTER_SIZE);
        }
    }

    /**
     * Relative <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified pointer into this buffer at the current position, and then increments the position.</p>
     *
     * @param p the pointer to be written
     *
     * @return This buffer
     *
     * @throws java.nio.BufferOverflowException If this buffer's current position is not smaller than its limit
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public PointerBuffer put(long p) {
        memPutAddress(address + (nextPutIndex() << POINTER_SHIFT), p);
        return this;
    }

    /**
     * Convenience relative put on a target ByteBuffer.
     *
     * @param target the target ByteBuffer
     * @param p      the pointer value to be written
     */
    public static void put(ByteBuffer target, long p) {
        if (target.limit() < target.position() + POINTER_SIZE) {
            throw new BufferOverflowException();
        }

        try {
            memPutAddress(memAddress(target), p);
        } finally {
            target.position(target.position() + POINTER_SIZE);
        }
    }

    /**
     * Absolute <i>get</i> method. Reads the pointer at the specified index.
     *
     * @param index the index from which the pointer will be read
     *
     * @return the pointer at the specified index
     *
     * @throws IndexOutOfBoundsException If <tt>index</tt> is negative or not smaller than the buffer's limit
     */
    public long get(int index) {
        return memGetAddress(address + (checkIndex(index) << POINTER_SHIFT));
    }

    /**
     * Convenience absolute get from a source ByteBuffer.
     *
     * @param source the source ByteBuffer
     * @param index  the index at which the pointer will be read
     */
    public static long get(ByteBuffer source, int index) {
        if (index < 0 || source.limit() < index + POINTER_SIZE) {
            throw new IndexOutOfBoundsException();
        }

        return memGetAddress(memAddress0(source) + index);
    }

    /**
     * Absolute <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>Writes the specified pointer into this buffer at the specified index.</p>
     *
     * @param index the index at which the pointer will be written
     * @param p     the pointer value to be written
     *
     * @return This buffer
     *
     * @throws IndexOutOfBoundsException        If <tt>index</tt> is negative or not smaller than the buffer's limit
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public PointerBuffer put(int index, long p) {
        memPutAddress(address + (checkIndex(index) << POINTER_SHIFT), p);
        return this;
    }

    /**
     * Convenience absolute put on a target ByteBuffer.
     *
     * @param target the target ByteBuffer
     * @param index  the index at which the pointer will be written
     * @param p      the pointer value to be written
     */
    public static void put(ByteBuffer target, int index, long p) {
        if (index < 0 || target.limit() < index + POINTER_SIZE) {
            throw new IndexOutOfBoundsException();
        }

        memPutAddress(memAddress0(target) + index, p);
    }

    // -- PointerWrapper operations --

    /** Puts the pointer value of the specified {@link Pointer} at the current position and then increments the position. */
    public PointerBuffer put(Pointer pointer) {
        put(pointer.address());
        return this;
    }

    /** Puts the pointer value of the specified {@link Pointer} at the specified index. */
    public PointerBuffer put(int index, Pointer pointer) {
        put(index, pointer.address());
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

    /** Decodes the ASCII string that starts at the address found at the current position. */
    public String getStringASCII() { return memASCII(get()); }

    /** Decodes the UTF-8 string that starts at the address found at the current position. */
    public String getStringUTF8() { return memUTF8(get()); }

    /** Decodes the UTF-16 string that starts at the address found at the current position. */
    public String getStringUTF16() { return memUTF16(get()); }

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

    /** Decodes the ASCII string that starts at the address found at the specified index. */
    public String getStringASCII(int index) { return memASCII(get(index)); }

    /** Decodes the UTF-8 string that starts at the address found at the specified index. */
    public String getStringUTF8(int index) { return memUTF8(get(index)); }

    /** Decodes the UTF-16 string that starts at the address found at the specified index. */
    public String getStringUTF16(int index) { return memUTF16(get(index)); }

    // -- Bulk get operations --

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p>This method transfers pointers from this buffer into the specified destination array. An invocation of this method of the form <tt>src.get(a)</tt>
     * behaves in exactly the same way as the invocation
     *
     * <pre>
     *     src.get(a, 0, a.length) </pre>
     *
     * @return This buffer
     *
     * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> pointers remaining in this buffer
     */
    public PointerBuffer get(long[] dst) {
        return get(dst, 0, dst.length);
    }

    /**
     * Relative bulk <i>get</i> method.
     *
     * <p>This method transfers pointers from this buffer into the specified destination array. If there are fewer pointers remaining in the buffer than are
     * required to satisfy the request, that is, if <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no pointers are transferred and a
     * {@link java.nio.BufferUnderflowException} is thrown.
     *
     * <p>Otherwise, this method copies <tt>length</tt> pointers from this buffer into the specified array, starting at the current position of this buffer and
     * at the specified offset in the array. The position of this buffer is then incremented by <tt>length</tt>.
     *
     * <p>In other words, an invocation of this method of the form <tt>src.get(dst,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as the loop</p>
     *
     * <pre>
     *     for (int i = off; i < off + len; i++)
     *         dst[i] = src.get(); </pre>
     *
     * <p>except that it first checks that there are sufficient pointers in this buffer and it is potentially much more efficient. </p>
     *
     * @param dst    the array into which pointers are to be written
     * @param offset the offset within the array of the first pointer to be written; must be non-negative and no larger than <tt>dst.length</tt>
     * @param length the maximum number of pointers to be written to the specified array; must be non-negative and no larger than <tt>dst.length - offset</tt>
     *
     * @return This buffer
     *
     * @throws java.nio.BufferUnderflowException If there are fewer than <tt>length</tt> pointers remaining in this buffer
     * @throws IndexOutOfBoundsException         If the preconditions on the <tt>offset</tt> and <tt>length</tt> parameters do not hold
     */
    public PointerBuffer get(long[] dst, int offset, int length) {
        checkBounds(offset, length, dst.length);
        if (remaining() < length) {
            throw new BufferUnderflowException();
        }

        int end = offset + length;
        for (int i = offset; i < end; i++) {
            dst[i] = get();
        }

        return this;
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>This method transfers the entire content of the specified source pointer array into this buffer. An invocation of this method of the form
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
    public PointerBuffer put(long[] src) {
        return put(src, 0, src.length);
    }

    /**
     * Relative bulk <i>put</i> method&nbsp;&nbsp;<i>(optional operation)</i>.
     *
     * <p>This method transfers pointers into this buffer from the specified source array. If there are more pointers to be copied from the array than remain
     * in this buffer, that is, if <tt>length</tt>&nbsp;<tt>&gt;</tt>&nbsp;<tt>remaining()</tt>, then no pointers are transferred and a
     * {@link java.nio.BufferOverflowException} is thrown.
     *
     * <p>Otherwise, this method copies <tt>length</tt> pointers from the specified array into this buffer, starting at the specified offset in the array and
     * at the current position of this buffer. The position of this buffer is then incremented by <tt>length</tt>.</p>
     *
     * <p>In other words, an invocation of this method of the form <tt>dst.put(src,&nbsp;off,&nbsp;len)</tt> has exactly the same effect as the loop</p>
     *
     * <pre>
     *     for (int i = off; i < off + len; i++)
     *         dst.put(a[i]); </pre>
     *
     * <p>except that it first checks that there is sufficient space in this buffer and it is potentially much more efficient.</p>
     *
     * @param src    the array from which pointers are to be read
     * @param offset the offset within the array of the first pointer to be read; must be non-negative and no larger than <tt>array.length</tt>
     * @param length the number of pointers to be read from the specified array; must be non-negative and no larger than <tt>array.length - offset</tt>
     *
     * @return This buffer
     *
     * @throws java.nio.BufferOverflowException If there is insufficient space in this buffer
     * @throws IndexOutOfBoundsException        If the preconditions on the <tt>offset</tt> and <tt>length</tt> parameters do not hold
     * @throws java.nio.ReadOnlyBufferException If this buffer is read-only
     */
    public PointerBuffer put(long[] src, int offset, int length) {
        checkBounds(offset, length, src.length);
        if (remaining() < length) {
            throw new BufferOverflowException();
        }
        int end = offset + length;
        for (int i = offset; i < end; i++) {
            put(src[i]);
        }

        return this;
    }

    /**
     * Returns the current hash code of this buffer.
     *
     * <p>The hash code of a pointer buffer depends only upon its remaining elements; that is, upon the elements from <tt>position()</tt> up to, and including,
     * the element at <tt>limit()</tt>&nbsp;-&nbsp;<tt>1</tt>.</p>
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
     * <p>Two pointer buffers are equal if, and only if,</p>
     *
     * <ol>
     * <li>They have the same element type,</li>
     * <li>They have the same number of remaining elements, and</li>
     * <li>The two sequences of remaining elements, considered
     * independently of their starting positions, are pointwise equal.</li>
     * </ol>
     *
     * <p>A pointer buffer is not equal to any other type of object.</p>
     *
     * @param ob the object to which this buffer is to be compared
     *
     * @return <tt>true</tt> if, and only if, this buffer is equal to the
     * given object
     */
    public boolean equals(Object ob) {
        if (!(ob instanceof PointerBuffer)) {
            return false;
        }
        PointerBuffer that = (PointerBuffer)ob;
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
     * <p>Two pointer buffers are compared by comparing their sequences of remaining elements lexicographically, without regard to the starting position of
     * each sequence within its corresponding buffer.</p>
     *
     * <p>A pointer buffer is not comparable to any other type of object.</p>
     *
     * @return A negative integer, zero, or a positive integer as this buffer is less than, equal to, or greater than the specified buffer
     */
    @Override
    public int compareTo(PointerBuffer that) {
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

    private static void checkBounds(int off, int len, int size) {
        if ((off | len | (off + len) | (size - (off + len))) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

}