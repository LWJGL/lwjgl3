/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Base class of struct custom buffers. */
public abstract class StructBuffer<T extends Struct, SELF extends StructBuffer<T, SELF>> extends CustomBuffer<SELF> {

    protected StructBuffer(ByteBuffer container, int remaining) {
        this(memAddress(container), container, -1, 0, remaining, remaining);
    }

    protected StructBuffer(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
        super(address, container, mark, position, limit, capacity);
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
        return newInstance(address + nextGetIndex() * sizeof());
    }

    /**
     * Relative <i>get</i> method. Reads the struct data at this buffer's current position into the specified struct, and then increments the position.
     *
     * @return the struct at the buffer's current position
     *
     * @throws java.nio.BufferUnderflowException If the buffer's current position is not smaller than its limit
     */
    public SELF get(T value) {
        memCopy(address + nextGetIndex() * sizeof(), value.address(), sizeof());
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
        memCopy(value.address(), address + nextPutIndex() * sizeof(), sizeof());
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
        return newInstance(address + checkIndex(index) * sizeof());
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
        memCopy(address + checkIndex(index) * sizeof(), value.address(), sizeof());
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
        memCopy(value.address(), address + checkIndex(index) * sizeof(), sizeof());
        return self();
    }

    // --------------------------------------

    protected abstract T newInstance(long address);

}