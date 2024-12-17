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
 * struct XrFovf {
 *     float angleLeft;
 *     float angleRight;
 *     float angleUp;
 *     float angleDown;
 * }}</pre>
 */
public class XrFovf extends Struct<XrFovf> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ANGLELEFT,
        ANGLERIGHT,
        ANGLEUP,
        ANGLEDOWN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ANGLELEFT = layout.offsetof(0);
        ANGLERIGHT = layout.offsetof(1);
        ANGLEUP = layout.offsetof(2);
        ANGLEDOWN = layout.offsetof(3);
    }

    protected XrFovf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFovf create(long address, @Nullable ByteBuffer container) {
        return new XrFovf(address, container);
    }

    /**
     * Creates a {@code XrFovf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFovf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code angleLeft} field. */
    public float angleLeft() { return nangleLeft(address()); }
    /** @return the value of the {@code angleRight} field. */
    public float angleRight() { return nangleRight(address()); }
    /** @return the value of the {@code angleUp} field. */
    public float angleUp() { return nangleUp(address()); }
    /** @return the value of the {@code angleDown} field. */
    public float angleDown() { return nangleDown(address()); }

    /** Sets the specified value to the {@code angleLeft} field. */
    public XrFovf angleLeft(float value) { nangleLeft(address(), value); return this; }
    /** Sets the specified value to the {@code angleRight} field. */
    public XrFovf angleRight(float value) { nangleRight(address(), value); return this; }
    /** Sets the specified value to the {@code angleUp} field. */
    public XrFovf angleUp(float value) { nangleUp(address(), value); return this; }
    /** Sets the specified value to the {@code angleDown} field. */
    public XrFovf angleDown(float value) { nangleDown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFovf set(
        float angleLeft,
        float angleRight,
        float angleUp,
        float angleDown
    ) {
        angleLeft(angleLeft);
        angleRight(angleRight);
        angleUp(angleUp);
        angleDown(angleDown);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFovf set(XrFovf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFovf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFovf malloc() {
        return new XrFovf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFovf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFovf calloc() {
        return new XrFovf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFovf} instance allocated with {@link BufferUtils}. */
    public static XrFovf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFovf(memAddress(container), container);
    }

    /** Returns a new {@code XrFovf} instance for the specified memory address. */
    public static XrFovf create(long address) {
        return new XrFovf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFovf createSafe(long address) {
        return address == NULL ? null : new XrFovf(address, null);
    }

    /**
     * Returns a new {@link XrFovf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFovf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFovf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFovf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFovf.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFovf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFovf malloc(MemoryStack stack) {
        return new XrFovf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFovf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFovf calloc(MemoryStack stack) {
        return new XrFovf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFovf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFovf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFovf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #angleLeft}. */
    public static float nangleLeft(long struct) { return memGetFloat(struct + XrFovf.ANGLELEFT); }
    /** Unsafe version of {@link #angleRight}. */
    public static float nangleRight(long struct) { return memGetFloat(struct + XrFovf.ANGLERIGHT); }
    /** Unsafe version of {@link #angleUp}. */
    public static float nangleUp(long struct) { return memGetFloat(struct + XrFovf.ANGLEUP); }
    /** Unsafe version of {@link #angleDown}. */
    public static float nangleDown(long struct) { return memGetFloat(struct + XrFovf.ANGLEDOWN); }

    /** Unsafe version of {@link #angleLeft(float) angleLeft}. */
    public static void nangleLeft(long struct, float value) { memPutFloat(struct + XrFovf.ANGLELEFT, value); }
    /** Unsafe version of {@link #angleRight(float) angleRight}. */
    public static void nangleRight(long struct, float value) { memPutFloat(struct + XrFovf.ANGLERIGHT, value); }
    /** Unsafe version of {@link #angleUp(float) angleUp}. */
    public static void nangleUp(long struct, float value) { memPutFloat(struct + XrFovf.ANGLEUP, value); }
    /** Unsafe version of {@link #angleDown(float) angleDown}. */
    public static void nangleDown(long struct, float value) { memPutFloat(struct + XrFovf.ANGLEDOWN, value); }

    // -----------------------------------

    /** An array of {@link XrFovf} structs. */
    public static class Buffer extends StructBuffer<XrFovf, Buffer> implements NativeResource {

        private static final XrFovf ELEMENT_FACTORY = XrFovf.create(-1L);

        /**
         * Creates a new {@code XrFovf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFovf#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFovf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code angleLeft} field. */
        public float angleLeft() { return XrFovf.nangleLeft(address()); }
        /** @return the value of the {@code angleRight} field. */
        public float angleRight() { return XrFovf.nangleRight(address()); }
        /** @return the value of the {@code angleUp} field. */
        public float angleUp() { return XrFovf.nangleUp(address()); }
        /** @return the value of the {@code angleDown} field. */
        public float angleDown() { return XrFovf.nangleDown(address()); }

        /** Sets the specified value to the {@code angleLeft} field. */
        public XrFovf.Buffer angleLeft(float value) { XrFovf.nangleLeft(address(), value); return this; }
        /** Sets the specified value to the {@code angleRight} field. */
        public XrFovf.Buffer angleRight(float value) { XrFovf.nangleRight(address(), value); return this; }
        /** Sets the specified value to the {@code angleUp} field. */
        public XrFovf.Buffer angleUp(float value) { XrFovf.nangleUp(address(), value); return this; }
        /** Sets the specified value to the {@code angleDown} field. */
        public XrFovf.Buffer angleDown(float value) { XrFovf.nangleDown(address(), value); return this; }

    }

}