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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR {
 *     int numpoints;
 *     float * pointparamvalues;
 *     float * pointpositions;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR extends Struct<FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMPOINTS,
        POINTPARAMVALUES,
        POINTPOSITIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMPOINTS = layout.offsetof(0);
        POINTPARAMVALUES = layout.offsetof(1);
        POINTPOSITIONS = layout.offsetof(2);
    }

    protected FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numpoints} field. */
    public int numpoints() { return nnumpoints(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pointparamvalues} field. */
    @NativeType("float *")
    public FloatBuffer pointparamvalues() { return npointparamvalues(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pointpositions} field. */
    @Nullable
    @NativeType("float *")
    public FloatBuffer pointpositions() { return npointpositions(address()); }

    /** Sets the specified value to the {@code numpoints} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR numpoints(int value) { nnumpoints(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code pointparamvalues} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR pointparamvalues(@NativeType("float *") FloatBuffer value) { npointparamvalues(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code pointpositions} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR pointpositions(@Nullable @NativeType("float *") FloatBuffer value) { npointpositions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR set(
        int numpoints,
        FloatBuffer pointparamvalues,
        @Nullable FloatBuffer pointpositions
    ) {
        numpoints(numpoints);
        pointparamvalues(pointparamvalues);
        pointpositions(pointpositions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR set(FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR malloc() {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR calloc() {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR create(long address) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numpoints}. */
    public static int nnumpoints(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.NUMPOINTS); }
    /** Unsafe version of {@link #pointparamvalues() pointparamvalues}. */
    public static FloatBuffer npointparamvalues(long struct) { return memFloatBuffer(memGetAddress(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.POINTPARAMVALUES), nnumpoints(struct)); }
    /** Unsafe version of {@link #pointpositions() pointpositions}. */
    @Nullable public static FloatBuffer npointpositions(long struct) { return memFloatBufferSafe(memGetAddress(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.POINTPOSITIONS), nnumpoints(struct)); }

    /** Sets the specified value to the {@code numpoints} field of the specified {@code struct}. */
    public static void nnumpoints(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.NUMPOINTS, value); }
    /** Unsafe version of {@link #pointparamvalues(FloatBuffer) pointparamvalues}. */
    public static void npointparamvalues(long struct, FloatBuffer value) { memPutAddress(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.POINTPARAMVALUES, memAddress(value)); }
    /** Unsafe version of {@link #pointpositions(FloatBuffer) pointpositions}. */
    public static void npointpositions(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.POINTPOSITIONS, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.POINTPARAMVALUES));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR ELEMENT_FACTORY = FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numpoints} field. */
        public int numpoints() { return FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.nnumpoints(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pointparamvalues} field. */
        @NativeType("float *")
        public FloatBuffer pointparamvalues() { return FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.npointparamvalues(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pointpositions} field. */
        @Nullable
        @NativeType("float *")
        public FloatBuffer pointpositions() { return FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.npointpositions(address()); }

        /** Sets the specified value to the {@code numpoints} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer numpoints(int value) { FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.nnumpoints(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code pointparamvalues} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer pointparamvalues(@NativeType("float *") FloatBuffer value) { FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.npointparamvalues(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code pointpositions} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.Buffer pointpositions(@Nullable @NativeType("float *") FloatBuffer value) { FMOD_DSP_PARAMETER_FLOAT_MAPPING_PIECEWISE_LINEAR.npointpositions(address(), value); return this; }

    }

}