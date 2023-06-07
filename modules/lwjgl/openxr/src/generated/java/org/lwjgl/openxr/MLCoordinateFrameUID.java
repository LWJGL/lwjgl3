/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MLCoordinateFrameUID {
 *     uint64_t data[2];
 * }</code></pre>
 */
public class MLCoordinateFrameUID extends Struct<MLCoordinateFrameUID> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(8, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    protected MLCoordinateFrameUID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MLCoordinateFrameUID create(long address, @Nullable ByteBuffer container) {
        return new MLCoordinateFrameUID(address, container);
    }

    /**
     * Creates a {@code MLCoordinateFrameUID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MLCoordinateFrameUID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link LongBuffer} view of the {@code data} field. */
    @NativeType("uint64_t[2]")
    public LongBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    @NativeType("uint64_t")
    public long data(int index) { return ndata(address(), index); }

    // -----------------------------------

    /** Returns a new {@code MLCoordinateFrameUID} instance for the specified memory address. */
    public static MLCoordinateFrameUID create(long address) {
        return new MLCoordinateFrameUID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MLCoordinateFrameUID createSafe(long address) {
        return address == NULL ? null : new MLCoordinateFrameUID(address, null);
    }

    /**
     * Create a {@link MLCoordinateFrameUID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MLCoordinateFrameUID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MLCoordinateFrameUID.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static LongBuffer ndata(long struct) { return memLongBuffer(struct + MLCoordinateFrameUID.DATA, 2); }
    /** Unsafe version of {@link #data(int) data}. */
    public static long ndata(long struct, int index) {
        return UNSAFE.getLong(null, struct + MLCoordinateFrameUID.DATA + check(index, 2) * 8);
    }

    // -----------------------------------

    /** An array of {@link MLCoordinateFrameUID} structs. */
    public static class Buffer extends StructBuffer<MLCoordinateFrameUID, Buffer> {

        private static final MLCoordinateFrameUID ELEMENT_FACTORY = MLCoordinateFrameUID.create(-1L);

        /**
         * Creates a new {@code MLCoordinateFrameUID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MLCoordinateFrameUID#SIZEOF}, and its mark will be undefined.</p>
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
        protected MLCoordinateFrameUID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link LongBuffer} view of the {@code data} field. */
        @NativeType("uint64_t[2]")
        public LongBuffer data() { return MLCoordinateFrameUID.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        @NativeType("uint64_t")
        public long data(int index) { return MLCoordinateFrameUID.ndata(address(), index); }

    }

}