/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_PARAMETER_SIDECHAIN {
 *     FMOD_BOOL sidechainenable;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_SIDECHAIN extends Struct<FMOD_DSP_PARAMETER_SIDECHAIN> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIDECHAINENABLE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIDECHAINENABLE = layout.offsetof(0);
    }

    protected FMOD_DSP_PARAMETER_SIDECHAIN(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_SIDECHAIN create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_SIDECHAIN(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sidechainenable} field. */
    @NativeType("FMOD_BOOL")
    public int sidechainenable() { return nsidechainenable(address()); }

    /** Sets the specified value to the {@code sidechainenable} field. */
    public FMOD_DSP_PARAMETER_SIDECHAIN sidechainenable(@NativeType("FMOD_BOOL") int value) { nsidechainenable(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_SIDECHAIN set(FMOD_DSP_PARAMETER_SIDECHAIN src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN malloc() {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN calloc() {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_SIDECHAIN(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN create(long address) {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FMOD_DSP_PARAMETER_SIDECHAIN createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_SIDECHAIN(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_SIDECHAIN(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sidechainenable}. */
    public static int nsidechainenable(long struct) { return memGetInt(struct + FMOD_DSP_PARAMETER_SIDECHAIN.SIDECHAINENABLE); }

    /** Unsafe version of {@link #sidechainenable(int) sidechainenable}. */
    public static void nsidechainenable(long struct, int value) { memPutInt(struct + FMOD_DSP_PARAMETER_SIDECHAIN.SIDECHAINENABLE, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_SIDECHAIN} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_SIDECHAIN, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_SIDECHAIN ELEMENT_FACTORY = FMOD_DSP_PARAMETER_SIDECHAIN.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_SIDECHAIN#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_SIDECHAIN getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sidechainenable} field. */
        @NativeType("FMOD_BOOL")
        public int sidechainenable() { return FMOD_DSP_PARAMETER_SIDECHAIN.nsidechainenable(address()); }

        /** Sets the specified value to the {@code sidechainenable} field. */
        public FMOD_DSP_PARAMETER_SIDECHAIN.Buffer sidechainenable(@NativeType("FMOD_BOOL") int value) { FMOD_DSP_PARAMETER_SIDECHAIN.nsidechainenable(address(), value); return this; }

    }

}