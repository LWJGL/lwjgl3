/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

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
public class FMOD_DSP_PARAMETER_SIDECHAIN extends Struct implements NativeResource {

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
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN calloc() {
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_SIDECHAIN create(long address) {
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_SIDECHAIN createSafe(long address) {
        return address == NULL ? null : wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, address);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN malloc(MemoryStack stack) {
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_SIDECHAIN} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN calloc(MemoryStack stack) {
        return wrap(FMOD_DSP_PARAMETER_SIDECHAIN.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_SIDECHAIN.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sidechainenable}. */
    public static int nsidechainenable(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_SIDECHAIN.SIDECHAINENABLE); }

    /** Unsafe version of {@link #sidechainenable(int) sidechainenable}. */
    public static void nsidechainenable(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_SIDECHAIN.SIDECHAINENABLE, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_SIDECHAIN} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_SIDECHAIN, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_SIDECHAIN ELEMENT_FACTORY = FMOD_DSP_PARAMETER_SIDECHAIN.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_SIDECHAIN.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_SIDECHAIN#SIZEOF}, and its mark will be undefined.
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