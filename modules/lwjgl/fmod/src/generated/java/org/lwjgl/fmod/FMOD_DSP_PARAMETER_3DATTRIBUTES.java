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
 * struct FMOD_DSP_PARAMETER_3DATTRIBUTES {
 *     {@link FMOD_3D_ATTRIBUTES FMOD_3D_ATTRIBUTES} relative;
 *     {@link FMOD_3D_ATTRIBUTES FMOD_3D_ATTRIBUTES} absolute;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_3DATTRIBUTES extends Struct<FMOD_DSP_PARAMETER_3DATTRIBUTES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RELATIVE,
        ABSOLUTE;

    static {
        Layout layout = __struct(
            __member(FMOD_3D_ATTRIBUTES.SIZEOF, FMOD_3D_ATTRIBUTES.ALIGNOF),
            __member(FMOD_3D_ATTRIBUTES.SIZEOF, FMOD_3D_ATTRIBUTES.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RELATIVE = layout.offsetof(0);
        ABSOLUTE = layout.offsetof(1);
    }

    protected FMOD_DSP_PARAMETER_3DATTRIBUTES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_3DATTRIBUTES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code relative} field. */
    public FMOD_3D_ATTRIBUTES relative() { return nrelative(address()); }
    /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code absolute} field. */
    public FMOD_3D_ATTRIBUTES absolute() { return nabsolute(address()); }

    /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code relative} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES relative(FMOD_3D_ATTRIBUTES value) { nrelative(address(), value); return this; }
    /** Passes the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES relative(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(relative()); return this; }
    /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code absolute} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES absolute(FMOD_3D_ATTRIBUTES value) { nabsolute(address(), value); return this; }
    /** Passes the {@code absolute} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES absolute(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(absolute()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES set(
        FMOD_3D_ATTRIBUTES relative,
        FMOD_3D_ATTRIBUTES absolute
    ) {
        relative(relative);
        absolute(absolute);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES set(FMOD_DSP_PARAMETER_3DATTRIBUTES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES malloc() {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES calloc() {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES create(long address) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_3DATTRIBUTES(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #relative}. */
    public static FMOD_3D_ATTRIBUTES nrelative(long struct) { return FMOD_3D_ATTRIBUTES.create(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES.RELATIVE); }
    /** Unsafe version of {@link #absolute}. */
    public static FMOD_3D_ATTRIBUTES nabsolute(long struct) { return FMOD_3D_ATTRIBUTES.create(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES.ABSOLUTE); }

    /** Unsafe version of {@link #relative(FMOD_3D_ATTRIBUTES) relative}. */
    public static void nrelative(long struct, FMOD_3D_ATTRIBUTES value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES.RELATIVE, FMOD_3D_ATTRIBUTES.SIZEOF); }
    /** Unsafe version of {@link #absolute(FMOD_3D_ATTRIBUTES) absolute}. */
    public static void nabsolute(long struct, FMOD_3D_ATTRIBUTES value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES.ABSOLUTE, FMOD_3D_ATTRIBUTES.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_3DATTRIBUTES} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_3DATTRIBUTES, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_3DATTRIBUTES ELEMENT_FACTORY = FMOD_DSP_PARAMETER_3DATTRIBUTES.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_3DATTRIBUTES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_3DATTRIBUTES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code relative} field. */
        public FMOD_3D_ATTRIBUTES relative() { return FMOD_DSP_PARAMETER_3DATTRIBUTES.nrelative(address()); }
        /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code absolute} field. */
        public FMOD_3D_ATTRIBUTES absolute() { return FMOD_DSP_PARAMETER_3DATTRIBUTES.nabsolute(address()); }

        /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code relative} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer relative(FMOD_3D_ATTRIBUTES value) { FMOD_DSP_PARAMETER_3DATTRIBUTES.nrelative(address(), value); return this; }
        /** Passes the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer relative(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(relative()); return this; }
        /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code absolute} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer absolute(FMOD_3D_ATTRIBUTES value) { FMOD_DSP_PARAMETER_3DATTRIBUTES.nabsolute(address(), value); return this; }
        /** Passes the {@code absolute} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES.Buffer absolute(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(absolute()); return this; }

    }

}