/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrHapticParametricPointEXT {
 *     XrDuration time;
 *     float value;
 * }}</pre>
 */
public class XrHapticParametricPointEXT extends Struct<XrHapticParametricPointEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TIME,
        VALUE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TIME = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected XrHapticParametricPointEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticParametricPointEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHapticParametricPointEXT(address, container);
    }

    /**
     * Creates a {@code XrHapticParametricPointEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticParametricPointEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code time} field. */
    @NativeType("XrDuration")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code value} field. */
    public float value() { return nvalue(address()); }

    /** Sets the specified value to the {@code time} field. */
    public XrHapticParametricPointEXT time(@NativeType("XrDuration") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public XrHapticParametricPointEXT value(float value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticParametricPointEXT set(
        long time,
        float value
    ) {
        time(time);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticParametricPointEXT set(XrHapticParametricPointEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticParametricPointEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticParametricPointEXT malloc() {
        return new XrHapticParametricPointEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricPointEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticParametricPointEXT calloc() {
        return new XrHapticParametricPointEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricPointEXT} instance allocated with {@link BufferUtils}. */
    public static XrHapticParametricPointEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticParametricPointEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticParametricPointEXT} instance for the specified memory address. */
    public static XrHapticParametricPointEXT create(long address) {
        return new XrHapticParametricPointEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticParametricPointEXT createSafe(long address) {
        return address == NULL ? null : new XrHapticParametricPointEXT(address, null);
    }

    /**
     * Returns a new {@link XrHapticParametricPointEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPointEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPointEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticParametricPointEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticParametricPointEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHapticParametricPointEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricPointEXT malloc(MemoryStack stack) {
        return new XrHapticParametricPointEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticParametricPointEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricPointEXT calloc(MemoryStack stack) {
        return new XrHapticParametricPointEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticParametricPointEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricPointEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricPointEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrHapticParametricPointEXT.TIME); }
    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return memGetFloat(struct + XrHapticParametricPointEXT.VALUE); }

    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrHapticParametricPointEXT.TIME, value); }
    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { memPutFloat(struct + XrHapticParametricPointEXT.VALUE, value); }

    // -----------------------------------

    /** An array of {@link XrHapticParametricPointEXT} structs. */
    public static class Buffer extends StructBuffer<XrHapticParametricPointEXT, Buffer> implements NativeResource {

        private static final XrHapticParametricPointEXT ELEMENT_FACTORY = XrHapticParametricPointEXT.create(-1L);

        /**
         * Creates a new {@code XrHapticParametricPointEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticParametricPointEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticParametricPointEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code time} field. */
        @NativeType("XrDuration")
        public long time() { return XrHapticParametricPointEXT.ntime(address()); }
        /** @return the value of the {@code value} field. */
        public float value() { return XrHapticParametricPointEXT.nvalue(address()); }

        /** Sets the specified value to the {@code time} field. */
        public XrHapticParametricPointEXT.Buffer time(@NativeType("XrDuration") long value) { XrHapticParametricPointEXT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public XrHapticParametricPointEXT.Buffer value(float value) { XrHapticParametricPointEXT.nvalue(address(), value); return this; }

    }

}