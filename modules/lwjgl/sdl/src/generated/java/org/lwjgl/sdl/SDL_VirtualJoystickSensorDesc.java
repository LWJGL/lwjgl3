/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_VirtualJoystickSensorDesc {
 *     SDL_SensorType type;
 *     float rate;
 * }}</pre>
 */
public class SDL_VirtualJoystickSensorDesc extends Struct<SDL_VirtualJoystickSensorDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RATE = layout.offsetof(1);
    }

    protected SDL_VirtualJoystickSensorDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_VirtualJoystickSensorDesc create(long address, @Nullable ByteBuffer container) {
        return new SDL_VirtualJoystickSensorDesc(address, container);
    }

    /**
     * Creates a {@code SDL_VirtualJoystickSensorDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_VirtualJoystickSensorDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_SensorType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code rate} field. */
    public float rate() { return nrate(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_VirtualJoystickSensorDesc type(@NativeType("SDL_SensorType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code rate} field. */
    public SDL_VirtualJoystickSensorDesc rate(float value) { nrate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_VirtualJoystickSensorDesc set(
        int type,
        float rate
    ) {
        type(type);
        rate(rate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_VirtualJoystickSensorDesc set(SDL_VirtualJoystickSensorDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_VirtualJoystickSensorDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickSensorDesc malloc() {
        return new SDL_VirtualJoystickSensorDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickSensorDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickSensorDesc calloc() {
        return new SDL_VirtualJoystickSensorDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickSensorDesc} instance allocated with {@link BufferUtils}. */
    public static SDL_VirtualJoystickSensorDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickSensorDesc(memAddress(container), container);
    }

    /** Returns a new {@code SDL_VirtualJoystickSensorDesc} instance for the specified memory address. */
    public static SDL_VirtualJoystickSensorDesc create(long address) {
        return new SDL_VirtualJoystickSensorDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickSensorDesc createSafe(long address) {
        return address == NULL ? null : new SDL_VirtualJoystickSensorDesc(address, null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickSensorDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickSensorDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickSensorDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_VirtualJoystickSensorDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_VirtualJoystickSensorDesc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickSensorDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickSensorDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickSensorDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickSensorDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickSensorDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickSensorDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickSensorDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickSensorDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickSensorDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_VirtualJoystickSensorDesc.TYPE); }
    /** Unsafe version of {@link #rate}. */
    public static float nrate(long struct) { return memGetFloat(struct + SDL_VirtualJoystickSensorDesc.RATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_VirtualJoystickSensorDesc.TYPE, value); }
    /** Unsafe version of {@link #rate(float) rate}. */
    public static void nrate(long struct, float value) { memPutFloat(struct + SDL_VirtualJoystickSensorDesc.RATE, value); }

    // -----------------------------------

    /** An array of {@link SDL_VirtualJoystickSensorDesc} structs. */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickSensorDesc, Buffer> implements NativeResource {

        private static final SDL_VirtualJoystickSensorDesc ELEMENT_FACTORY = SDL_VirtualJoystickSensorDesc.create(-1L);

        /**
         * Creates a new {@code SDL_VirtualJoystickSensorDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_VirtualJoystickSensorDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_VirtualJoystickSensorDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_SensorType")
        public int type() { return SDL_VirtualJoystickSensorDesc.ntype(address()); }
        /** @return the value of the {@code rate} field. */
        public float rate() { return SDL_VirtualJoystickSensorDesc.nrate(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_VirtualJoystickSensorDesc.Buffer type(@NativeType("SDL_SensorType") int value) { SDL_VirtualJoystickSensorDesc.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code rate} field. */
        public SDL_VirtualJoystickSensorDesc.Buffer rate(float value) { SDL_VirtualJoystickSensorDesc.nrate(address(), value); return this; }

    }

}