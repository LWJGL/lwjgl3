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
 * struct SDL_GPUVertexBufferDescription {
 *     Uint32 slot;
 *     Uint32 pitch;
 *     SDL_GPUVertexInputRate input_rate;
 *     Uint32 instance_step_rate;
 * }}</pre>
 */
public class SDL_GPUVertexBufferDescription extends Struct<SDL_GPUVertexBufferDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SLOT,
        PITCH,
        INPUT_RATE,
        INSTANCE_STEP_RATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SLOT = layout.offsetof(0);
        PITCH = layout.offsetof(1);
        INPUT_RATE = layout.offsetof(2);
        INSTANCE_STEP_RATE = layout.offsetof(3);
    }

    protected SDL_GPUVertexBufferDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUVertexBufferDescription create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUVertexBufferDescription(address, container);
    }

    /**
     * Creates a {@code SDL_GPUVertexBufferDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUVertexBufferDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code slot} field. */
    @NativeType("Uint32")
    public int slot() { return nslot(address()); }
    /** @return the value of the {@code pitch} field. */
    @NativeType("Uint32")
    public int pitch() { return npitch(address()); }
    /** @return the value of the {@code input_rate} field. */
    @NativeType("SDL_GPUVertexInputRate")
    public int input_rate() { return ninput_rate(address()); }
    /** @return the value of the {@code instance_step_rate} field. */
    @NativeType("Uint32")
    public int instance_step_rate() { return ninstance_step_rate(address()); }

    /** Sets the specified value to the {@code slot} field. */
    public SDL_GPUVertexBufferDescription slot(@NativeType("Uint32") int value) { nslot(address(), value); return this; }
    /** Sets the specified value to the {@code pitch} field. */
    public SDL_GPUVertexBufferDescription pitch(@NativeType("Uint32") int value) { npitch(address(), value); return this; }
    /** Sets the specified value to the {@code input_rate} field. */
    public SDL_GPUVertexBufferDescription input_rate(@NativeType("SDL_GPUVertexInputRate") int value) { ninput_rate(address(), value); return this; }
    /** Sets the specified value to the {@code instance_step_rate} field. */
    public SDL_GPUVertexBufferDescription instance_step_rate(@NativeType("Uint32") int value) { ninstance_step_rate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUVertexBufferDescription set(
        int slot,
        int pitch,
        int input_rate,
        int instance_step_rate
    ) {
        slot(slot);
        pitch(pitch);
        input_rate(input_rate);
        instance_step_rate(instance_step_rate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUVertexBufferDescription set(SDL_GPUVertexBufferDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUVertexBufferDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexBufferDescription malloc() {
        return new SDL_GPUVertexBufferDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexBufferDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUVertexBufferDescription calloc() {
        return new SDL_GPUVertexBufferDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUVertexBufferDescription} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUVertexBufferDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVertexBufferDescription(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUVertexBufferDescription} instance for the specified memory address. */
    public static SDL_GPUVertexBufferDescription create(long address) {
        return new SDL_GPUVertexBufferDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUVertexBufferDescription createSafe(long address) {
        return address == NULL ? null : new SDL_GPUVertexBufferDescription(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexBufferDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexBufferDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexBufferDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUVertexBufferDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUVertexBufferDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUVertexBufferDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexBufferDescription malloc(MemoryStack stack) {
        return new SDL_GPUVertexBufferDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUVertexBufferDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUVertexBufferDescription calloc(MemoryStack stack) {
        return new SDL_GPUVertexBufferDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUVertexBufferDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUVertexBufferDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUVertexBufferDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #slot}. */
    public static int nslot(long struct) { return memGetInt(struct + SDL_GPUVertexBufferDescription.SLOT); }
    /** Unsafe version of {@link #pitch}. */
    public static int npitch(long struct) { return memGetInt(struct + SDL_GPUVertexBufferDescription.PITCH); }
    /** Unsafe version of {@link #input_rate}. */
    public static int ninput_rate(long struct) { return memGetInt(struct + SDL_GPUVertexBufferDescription.INPUT_RATE); }
    /** Unsafe version of {@link #instance_step_rate}. */
    public static int ninstance_step_rate(long struct) { return memGetInt(struct + SDL_GPUVertexBufferDescription.INSTANCE_STEP_RATE); }

    /** Unsafe version of {@link #slot(int) slot}. */
    public static void nslot(long struct, int value) { memPutInt(struct + SDL_GPUVertexBufferDescription.SLOT, value); }
    /** Unsafe version of {@link #pitch(int) pitch}. */
    public static void npitch(long struct, int value) { memPutInt(struct + SDL_GPUVertexBufferDescription.PITCH, value); }
    /** Unsafe version of {@link #input_rate(int) input_rate}. */
    public static void ninput_rate(long struct, int value) { memPutInt(struct + SDL_GPUVertexBufferDescription.INPUT_RATE, value); }
    /** Unsafe version of {@link #instance_step_rate(int) instance_step_rate}. */
    public static void ninstance_step_rate(long struct, int value) { memPutInt(struct + SDL_GPUVertexBufferDescription.INSTANCE_STEP_RATE, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUVertexBufferDescription} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUVertexBufferDescription, Buffer> implements NativeResource {

        private static final SDL_GPUVertexBufferDescription ELEMENT_FACTORY = SDL_GPUVertexBufferDescription.create(-1L);

        /**
         * Creates a new {@code SDL_GPUVertexBufferDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUVertexBufferDescription#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUVertexBufferDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code slot} field. */
        @NativeType("Uint32")
        public int slot() { return SDL_GPUVertexBufferDescription.nslot(address()); }
        /** @return the value of the {@code pitch} field. */
        @NativeType("Uint32")
        public int pitch() { return SDL_GPUVertexBufferDescription.npitch(address()); }
        /** @return the value of the {@code input_rate} field. */
        @NativeType("SDL_GPUVertexInputRate")
        public int input_rate() { return SDL_GPUVertexBufferDescription.ninput_rate(address()); }
        /** @return the value of the {@code instance_step_rate} field. */
        @NativeType("Uint32")
        public int instance_step_rate() { return SDL_GPUVertexBufferDescription.ninstance_step_rate(address()); }

        /** Sets the specified value to the {@code slot} field. */
        public SDL_GPUVertexBufferDescription.Buffer slot(@NativeType("Uint32") int value) { SDL_GPUVertexBufferDescription.nslot(address(), value); return this; }
        /** Sets the specified value to the {@code pitch} field. */
        public SDL_GPUVertexBufferDescription.Buffer pitch(@NativeType("Uint32") int value) { SDL_GPUVertexBufferDescription.npitch(address(), value); return this; }
        /** Sets the specified value to the {@code input_rate} field. */
        public SDL_GPUVertexBufferDescription.Buffer input_rate(@NativeType("SDL_GPUVertexInputRate") int value) { SDL_GPUVertexBufferDescription.ninput_rate(address(), value); return this; }
        /** Sets the specified value to the {@code instance_step_rate} field. */
        public SDL_GPUVertexBufferDescription.Buffer instance_step_rate(@NativeType("Uint32") int value) { SDL_GPUVertexBufferDescription.ninstance_step_rate(address(), value); return this; }

    }

}