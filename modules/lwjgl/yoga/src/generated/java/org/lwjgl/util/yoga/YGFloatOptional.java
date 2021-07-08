/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGFloatOptional {
 *     float value;
 * }</code></pre>
 */
public class YGFloatOptional extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(0);
    }

    /**
     * Creates a {@code YGFloatOptional} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGFloatOptional(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code value} field. */
    public float value() { return nvalue(address()); }

    // -----------------------------------

    /** Returns a new {@code YGFloatOptional} instance for the specified memory address. */
    public static YGFloatOptional create(long address) {
        return wrap(YGFloatOptional.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGFloatOptional createSafe(long address) {
        return address == NULL ? null : wrap(YGFloatOptional.class, address);
    }

    /**
     * Create a {@link YGFloatOptional.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGFloatOptional.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGFloatOptional.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return UNSAFE.getFloat(null, struct + YGFloatOptional.VALUE); }

    public boolean isUndefined() {
        return Float.isNaN(value());
    }

    // -----------------------------------

    /** An array of {@link YGFloatOptional} structs. */
    public static class Buffer extends StructBuffer<YGFloatOptional, Buffer> {

        private static final YGFloatOptional ELEMENT_FACTORY = YGFloatOptional.create(-1L);

        /**
         * Creates a new {@code YGFloatOptional.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGFloatOptional#SIZEOF}, and its mark will be undefined.
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
        protected YGFloatOptional getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code value} field. */
        public float value() { return YGFloatOptional.nvalue(address()); }

    }

}