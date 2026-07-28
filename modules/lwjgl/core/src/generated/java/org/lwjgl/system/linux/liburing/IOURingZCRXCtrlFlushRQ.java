/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct zcrx_ctrl_flush_rq {
 *     __u64 __resv[6];
 * }}</pre>
 */
@NativeType("struct zcrx_ctrl_flush_rq")
public class IOURingZCRXCtrlFlushRQ extends Struct<IOURingZCRXCtrlFlushRQ> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        __RESV;

    static {
        Layout layout = __struct(
            __array(8, 6)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        __RESV = layout.offsetof(0);
    }

    protected IOURingZCRXCtrlFlushRQ(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXCtrlFlushRQ create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXCtrlFlushRQ(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXCtrlFlushRQ} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXCtrlFlushRQ(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXCtrlFlushRQ} instance for the specified memory address. */
    public static IOURingZCRXCtrlFlushRQ create(long address) {
        return new IOURingZCRXCtrlFlushRQ(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXCtrlFlushRQ createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXCtrlFlushRQ(address, null);
    }

    /**
     * Create a {@link IOURingZCRXCtrlFlushRQ.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCtrlFlushRQ.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXCtrlFlushRQ.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    static LongBuffer n__resv(long struct) { return memLongBuffer(struct + IOURingZCRXCtrlFlushRQ.__RESV, 6); }
    static long n__resv(long struct, int index) {
        return memGetLong(struct + IOURingZCRXCtrlFlushRQ.__RESV + check(index, 6) * 8);
    }

    static void n__resv(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + IOURingZCRXCtrlFlushRQ.__RESV, value.remaining() * 8);
    }
    static void n__resv(long struct, int index, long value) {
        memPutLong(struct + IOURingZCRXCtrlFlushRQ.__RESV + check(index, 6) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXCtrlFlushRQ} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXCtrlFlushRQ, Buffer> {

        private static final IOURingZCRXCtrlFlushRQ ELEMENT_FACTORY = IOURingZCRXCtrlFlushRQ.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXCtrlFlushRQ.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXCtrlFlushRQ#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected IOURingZCRXCtrlFlushRQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}