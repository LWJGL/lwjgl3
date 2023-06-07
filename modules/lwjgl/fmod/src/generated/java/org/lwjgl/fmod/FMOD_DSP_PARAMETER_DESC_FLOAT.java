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
 * struct FMOD_DSP_PARAMETER_DESC_FLOAT {
 *     float min;
 *     float max;
 *     float defaultval;
 *     {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING FMOD_DSP_PARAMETER_FLOAT_MAPPING} mapping;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_DESC_FLOAT extends Struct<FMOD_DSP_PARAMETER_DESC_FLOAT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN,
        MAX,
        DEFAULTVAL,
        MAPPING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(FMOD_DSP_PARAMETER_FLOAT_MAPPING.SIZEOF, FMOD_DSP_PARAMETER_FLOAT_MAPPING.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN = layout.offsetof(0);
        MAX = layout.offsetof(1);
        DEFAULTVAL = layout.offsetof(2);
        MAPPING = layout.offsetof(3);
    }

    protected FMOD_DSP_PARAMETER_DESC_FLOAT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DESC_FLOAT create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DESC_FLOAT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min} field. */
    public float min() { return nmin(address()); }
    /** @return the value of the {@code max} field. */
    public float max() { return nmax(address()); }
    /** @return the value of the {@code defaultval} field. */
    public float defaultval() { return ndefaultval(address()); }
    /** @return a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING} view of the {@code mapping} field. */
    public FMOD_DSP_PARAMETER_FLOAT_MAPPING mapping() { return nmapping(address()); }

    /** Sets the specified value to the {@code min} field. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT min(float value) { nmin(address(), value); return this; }
    /** Sets the specified value to the {@code max} field. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT max(float value) { nmax(address(), value); return this; }
    /** Sets the specified value to the {@code defaultval} field. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT defaultval(float value) { ndefaultval(address(), value); return this; }
    /** Copies the specified {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING} to the {@code mapping} field. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT mapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING value) { nmapping(address(), value); return this; }
    /** Passes the {@code mapping} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT mapping(java.util.function.Consumer<FMOD_DSP_PARAMETER_FLOAT_MAPPING> consumer) { consumer.accept(mapping()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_DESC_FLOAT set(
        float min,
        float max,
        float defaultval,
        FMOD_DSP_PARAMETER_FLOAT_MAPPING mapping
    ) {
        min(min);
        max(max);
        defaultval(defaultval);
        mapping(mapping);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_DESC_FLOAT set(FMOD_DSP_PARAMETER_DESC_FLOAT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT malloc() {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT calloc() {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT create(long address) {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_FLOAT createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DESC_FLOAT(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_FLOAT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min}. */
    public static float nmin(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MIN); }
    /** Unsafe version of {@link #max}. */
    public static float nmax(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MAX); }
    /** Unsafe version of {@link #defaultval}. */
    public static float ndefaultval(long struct) { return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.DEFAULTVAL); }
    /** Unsafe version of {@link #mapping}. */
    public static FMOD_DSP_PARAMETER_FLOAT_MAPPING nmapping(long struct) { return FMOD_DSP_PARAMETER_FLOAT_MAPPING.create(struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MAPPING); }

    /** Unsafe version of {@link #min(float) min}. */
    public static void nmin(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MIN, value); }
    /** Unsafe version of {@link #max(float) max}. */
    public static void nmax(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MAX, value); }
    /** Unsafe version of {@link #defaultval(float) defaultval}. */
    public static void ndefaultval(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_DESC_FLOAT.DEFAULTVAL, value); }
    /** Unsafe version of {@link #mapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING) mapping}. */
    public static void nmapping(long struct, FMOD_DSP_PARAMETER_FLOAT_MAPPING value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MAPPING, FMOD_DSP_PARAMETER_FLOAT_MAPPING.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        FMOD_DSP_PARAMETER_FLOAT_MAPPING.validate(struct + FMOD_DSP_PARAMETER_DESC_FLOAT.MAPPING);
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DESC_FLOAT} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DESC_FLOAT, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DESC_FLOAT ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DESC_FLOAT.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DESC_FLOAT#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DESC_FLOAT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min} field. */
        public float min() { return FMOD_DSP_PARAMETER_DESC_FLOAT.nmin(address()); }
        /** @return the value of the {@code max} field. */
        public float max() { return FMOD_DSP_PARAMETER_DESC_FLOAT.nmax(address()); }
        /** @return the value of the {@code defaultval} field. */
        public float defaultval() { return FMOD_DSP_PARAMETER_DESC_FLOAT.ndefaultval(address()); }
        /** @return a {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING} view of the {@code mapping} field. */
        public FMOD_DSP_PARAMETER_FLOAT_MAPPING mapping() { return FMOD_DSP_PARAMETER_DESC_FLOAT.nmapping(address()); }

        /** Sets the specified value to the {@code min} field. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer min(float value) { FMOD_DSP_PARAMETER_DESC_FLOAT.nmin(address(), value); return this; }
        /** Sets the specified value to the {@code max} field. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer max(float value) { FMOD_DSP_PARAMETER_DESC_FLOAT.nmax(address(), value); return this; }
        /** Sets the specified value to the {@code defaultval} field. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer defaultval(float value) { FMOD_DSP_PARAMETER_DESC_FLOAT.ndefaultval(address(), value); return this; }
        /** Copies the specified {@link FMOD_DSP_PARAMETER_FLOAT_MAPPING} to the {@code mapping} field. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer mapping(FMOD_DSP_PARAMETER_FLOAT_MAPPING value) { FMOD_DSP_PARAMETER_DESC_FLOAT.nmapping(address(), value); return this; }
        /** Passes the {@code mapping} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_DESC_FLOAT.Buffer mapping(java.util.function.Consumer<FMOD_DSP_PARAMETER_FLOAT_MAPPING> consumer) { consumer.accept(mapping()); return this; }

    }

}