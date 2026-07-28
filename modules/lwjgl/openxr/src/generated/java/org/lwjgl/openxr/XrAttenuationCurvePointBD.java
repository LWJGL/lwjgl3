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
 * struct XrAttenuationCurvePointBD {
 *     float distance;
 *     float gain;
 * }}</pre>
 */
public class XrAttenuationCurvePointBD extends Struct<XrAttenuationCurvePointBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DISTANCE,
        GAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DISTANCE = layout.offsetof(0);
        GAIN = layout.offsetof(1);
    }

    protected XrAttenuationCurvePointBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAttenuationCurvePointBD create(long address, @Nullable ByteBuffer container) {
        return new XrAttenuationCurvePointBD(address, container);
    }

    /**
     * Creates a {@code XrAttenuationCurvePointBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAttenuationCurvePointBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code distance} field. */
    public float distance() { return ndistance(address()); }
    /** @return the value of the {@code gain} field. */
    public float gain() { return ngain(address()); }

    /** Sets the specified value to the {@code distance} field. */
    public XrAttenuationCurvePointBD distance(float value) { ndistance(address(), value); return this; }
    /** Sets the specified value to the {@code gain} field. */
    public XrAttenuationCurvePointBD gain(float value) { ngain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrAttenuationCurvePointBD set(
        float distance,
        float gain
    ) {
        distance(distance);
        gain(gain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAttenuationCurvePointBD set(XrAttenuationCurvePointBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAttenuationCurvePointBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAttenuationCurvePointBD malloc() {
        return new XrAttenuationCurvePointBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAttenuationCurvePointBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAttenuationCurvePointBD calloc() {
        return new XrAttenuationCurvePointBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAttenuationCurvePointBD} instance allocated with {@link BufferUtils}. */
    public static XrAttenuationCurvePointBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAttenuationCurvePointBD(memAddress(container), container);
    }

    /** Returns a new {@code XrAttenuationCurvePointBD} instance for the specified memory address. */
    public static XrAttenuationCurvePointBD create(long address) {
        return new XrAttenuationCurvePointBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAttenuationCurvePointBD createSafe(long address) {
        return address == NULL ? null : new XrAttenuationCurvePointBD(address, null);
    }

    /**
     * Returns a new {@link XrAttenuationCurvePointBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAttenuationCurvePointBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAttenuationCurvePointBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAttenuationCurvePointBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAttenuationCurvePointBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAttenuationCurvePointBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAttenuationCurvePointBD malloc(MemoryStack stack) {
        return new XrAttenuationCurvePointBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAttenuationCurvePointBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAttenuationCurvePointBD calloc(MemoryStack stack) {
        return new XrAttenuationCurvePointBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAttenuationCurvePointBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAttenuationCurvePointBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAttenuationCurvePointBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #distance}. */
    public static float ndistance(long struct) { return memGetFloat(struct + XrAttenuationCurvePointBD.DISTANCE); }
    /** Unsafe version of {@link #gain}. */
    public static float ngain(long struct) { return memGetFloat(struct + XrAttenuationCurvePointBD.GAIN); }

    /** Unsafe version of {@link #distance(float) distance}. */
    public static void ndistance(long struct, float value) { memPutFloat(struct + XrAttenuationCurvePointBD.DISTANCE, value); }
    /** Unsafe version of {@link #gain(float) gain}. */
    public static void ngain(long struct, float value) { memPutFloat(struct + XrAttenuationCurvePointBD.GAIN, value); }

    // -----------------------------------

    /** An array of {@link XrAttenuationCurvePointBD} structs. */
    public static class Buffer extends StructBuffer<XrAttenuationCurvePointBD, Buffer> implements NativeResource {

        private static final XrAttenuationCurvePointBD ELEMENT_FACTORY = XrAttenuationCurvePointBD.create(-1L);

        /**
         * Creates a new {@code XrAttenuationCurvePointBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAttenuationCurvePointBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAttenuationCurvePointBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code distance} field. */
        public float distance() { return XrAttenuationCurvePointBD.ndistance(address()); }
        /** @return the value of the {@code gain} field. */
        public float gain() { return XrAttenuationCurvePointBD.ngain(address()); }

        /** Sets the specified value to the {@code distance} field. */
        public XrAttenuationCurvePointBD.Buffer distance(float value) { XrAttenuationCurvePointBD.ndistance(address(), value); return this; }
        /** Sets the specified value to the {@code gain} field. */
        public XrAttenuationCurvePointBD.Buffer gain(float value) { XrAttenuationCurvePointBD.ngain(address(), value); return this; }

    }

}