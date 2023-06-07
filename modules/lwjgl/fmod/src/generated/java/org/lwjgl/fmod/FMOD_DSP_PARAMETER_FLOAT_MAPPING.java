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
 * struct FMOD_DSP_PARAMETER_FLOAT_MAPPING {
 *     FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE type;
 *     {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} piecewiselinearmapping;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_FLOAT_MAPPING extends Struct<FMOD_DSP_PARAMETER_FLOAT_MAPPING> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        PIECEWISELINEARMAPPING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.SIZEOF, FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        PIECEWISELINEARMAPPING = layout.offsetof(1);
    }

    protected FMOD_DSP_PARAMETER_FLOAT_MAPPING(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_FLOAT_MAPPING create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE")
    public int type() { return ntype(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} view of the {@code piecewiselinearmapping} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR piecewiselinearmapping() { return npiecewiselinearmapping(address()); }

    /** Sets the specified value to the {@code type} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING type(@NativeType("FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} to the {@code piecewiselinearmapping} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING piecewiselinearmapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR value) { npiecewiselinearmapping(address(), value); return this; }
    /** Passes the {@code piecewiselinearmapping} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING piecewiselinearmapping(java.util.function.Consumer<FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR> consumer) { consumer.accept(piecewiselinearmapping()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING set(
        int type,
        FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR piecewiselinearmapping
    ) {
        type(type);
        piecewiselinearmapping(piecewiselinearmapping);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING set(FMOD_DSP_PARAMETER_FLOAT_MAPPING src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING malloc() {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING calloc() {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING create(long address) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_FLOAT_MAPPING(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING.TYPE); }
    /** Unsafe version of {@link #piecewiselinearmapping}. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR npiecewiselinearmapping(long struct) { return FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.create(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING.PIECEWISELINEARMAPPING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING.TYPE, value); }
    /** Unsafe version of {@link #piecewiselinearmapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR) piecewiselinearmapping}. */
    public static void npiecewiselinearmapping(long struct, FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING.PIECEWISELINEARMAPPING, FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.validate(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING.PIECEWISELINEARMAPPING);
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_FLOAT_MAPPING, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_FLOAT_MAPPING ELEMENT_FACTORY = FMOD_DSP_PARAMETER_FLOAT_MAPPING.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_FLOAT_MAPPING getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE")
        public int type() { return FMOD_DSP_PARAMETER_FLOAT_MAPPING.ntype(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} view of the {@code piecewiselinearmapping} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR piecewiselinearmapping() { return FMOD_DSP_PARAMETER_FLOAT_MAPPING.npiecewiselinearmapping(address()); }

        /** Sets the specified value to the {@code type} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer type(@NativeType("FMOD_DSP_PARAMETER_FLOAT_MAPPING_TYPE") int value) { FMOD_DSP_PARAMETER_FLOAT_MAPPING.ntype(address(), value); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} to the {@code piecewiselinearmapping} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer piecewiselinearmapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR value) { FMOD_DSP_PARAMETER_FLOAT_MAPPING.npiecewiselinearmapping(address(), value); return this; }
        /** Passes the {@code piecewiselinearmapping} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING.Buffer piecewiselinearmapping(java.util.function.Consumer<FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR> consumer) { consumer.accept(piecewiselinearmapping()); return this; }

    }

}