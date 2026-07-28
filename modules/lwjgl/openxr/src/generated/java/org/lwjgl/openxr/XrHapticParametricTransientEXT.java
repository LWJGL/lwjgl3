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
 * struct XrHapticParametricTransientEXT {
 *     XrDuration time;
 *     float amplitude;
 *     float frequency;
 * }}</pre>
 */
public class XrHapticParametricTransientEXT extends Struct<XrHapticParametricTransientEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TIME,
        AMPLITUDE,
        FREQUENCY;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TIME = layout.offsetof(0);
        AMPLITUDE = layout.offsetof(1);
        FREQUENCY = layout.offsetof(2);
    }

    protected XrHapticParametricTransientEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHapticParametricTransientEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHapticParametricTransientEXT(address, container);
    }

    /**
     * Creates a {@code XrHapticParametricTransientEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticParametricTransientEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code time} field. */
    @NativeType("XrDuration")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code amplitude} field. */
    public float amplitude() { return namplitude(address()); }
    /** @return the value of the {@code frequency} field. */
    public float frequency() { return nfrequency(address()); }

    /** Sets the specified value to the {@code time} field. */
    public XrHapticParametricTransientEXT time(@NativeType("XrDuration") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code amplitude} field. */
    public XrHapticParametricTransientEXT amplitude(float value) { namplitude(address(), value); return this; }
    /** Sets the specified value to the {@code frequency} field. */
    public XrHapticParametricTransientEXT frequency(float value) { nfrequency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticParametricTransientEXT set(
        long time,
        float amplitude,
        float frequency
    ) {
        time(time);
        amplitude(amplitude);
        frequency(frequency);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHapticParametricTransientEXT set(XrHapticParametricTransientEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticParametricTransientEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticParametricTransientEXT malloc() {
        return new XrHapticParametricTransientEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricTransientEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticParametricTransientEXT calloc() {
        return new XrHapticParametricTransientEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHapticParametricTransientEXT} instance allocated with {@link BufferUtils}. */
    public static XrHapticParametricTransientEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHapticParametricTransientEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHapticParametricTransientEXT} instance for the specified memory address. */
    public static XrHapticParametricTransientEXT create(long address) {
        return new XrHapticParametricTransientEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHapticParametricTransientEXT createSafe(long address) {
        return address == NULL ? null : new XrHapticParametricTransientEXT(address, null);
    }

    /**
     * Returns a new {@link XrHapticParametricTransientEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricTransientEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricTransientEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHapticParametricTransientEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHapticParametricTransientEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHapticParametricTransientEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricTransientEXT malloc(MemoryStack stack) {
        return new XrHapticParametricTransientEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHapticParametricTransientEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticParametricTransientEXT calloc(MemoryStack stack) {
        return new XrHapticParametricTransientEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHapticParametricTransientEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticParametricTransientEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticParametricTransientEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrHapticParametricTransientEXT.TIME); }
    /** Unsafe version of {@link #amplitude}. */
    public static float namplitude(long struct) { return memGetFloat(struct + XrHapticParametricTransientEXT.AMPLITUDE); }
    /** Unsafe version of {@link #frequency}. */
    public static float nfrequency(long struct) { return memGetFloat(struct + XrHapticParametricTransientEXT.FREQUENCY); }

    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrHapticParametricTransientEXT.TIME, value); }
    /** Unsafe version of {@link #amplitude(float) amplitude}. */
    public static void namplitude(long struct, float value) { memPutFloat(struct + XrHapticParametricTransientEXT.AMPLITUDE, value); }
    /** Unsafe version of {@link #frequency(float) frequency}. */
    public static void nfrequency(long struct, float value) { memPutFloat(struct + XrHapticParametricTransientEXT.FREQUENCY, value); }

    // -----------------------------------

    /** An array of {@link XrHapticParametricTransientEXT} structs. */
    public static class Buffer extends StructBuffer<XrHapticParametricTransientEXT, Buffer> implements NativeResource {

        private static final XrHapticParametricTransientEXT ELEMENT_FACTORY = XrHapticParametricTransientEXT.create(-1L);

        /**
         * Creates a new {@code XrHapticParametricTransientEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticParametricTransientEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHapticParametricTransientEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code time} field. */
        @NativeType("XrDuration")
        public long time() { return XrHapticParametricTransientEXT.ntime(address()); }
        /** @return the value of the {@code amplitude} field. */
        public float amplitude() { return XrHapticParametricTransientEXT.namplitude(address()); }
        /** @return the value of the {@code frequency} field. */
        public float frequency() { return XrHapticParametricTransientEXT.nfrequency(address()); }

        /** Sets the specified value to the {@code time} field. */
        public XrHapticParametricTransientEXT.Buffer time(@NativeType("XrDuration") long value) { XrHapticParametricTransientEXT.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code amplitude} field. */
        public XrHapticParametricTransientEXT.Buffer amplitude(float value) { XrHapticParametricTransientEXT.namplitude(address(), value); return this; }
        /** Sets the specified value to the {@code frequency} field. */
        public XrHapticParametricTransientEXT.Buffer frequency(float value) { XrHapticParametricTransientEXT.nfrequency(address(), value); return this; }

    }

}