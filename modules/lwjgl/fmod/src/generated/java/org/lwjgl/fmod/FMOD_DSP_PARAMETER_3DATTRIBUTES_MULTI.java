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
 * struct FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI {
 *     int numlisteners;
 *     {@link FMOD_3D_ATTRIBUTES FMOD_3D_ATTRIBUTES} relative[8];
 *     float weight[8];
 *     {@link FMOD_3D_ATTRIBUTES FMOD_3D_ATTRIBUTES} absolute;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI extends Struct<FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMLISTENERS,
        RELATIVE,
        WEIGHT,
        ABSOLUTE;

    static {
        Layout layout = __struct(
            __member(4),
            __array(FMOD_3D_ATTRIBUTES.SIZEOF, FMOD_3D_ATTRIBUTES.ALIGNOF, 8),
            __array(4, 8),
            __member(FMOD_3D_ATTRIBUTES.SIZEOF, FMOD_3D_ATTRIBUTES.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMLISTENERS = layout.offsetof(0);
        RELATIVE = layout.offsetof(1);
        WEIGHT = layout.offsetof(2);
        ABSOLUTE = layout.offsetof(3);
    }

    protected FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numlisteners} field. */
    public int numlisteners() { return nnumlisteners(address()); }
    /** @return a {@link FMOD_3D_ATTRIBUTES}.Buffer view of the {@code relative} field. */
    @NativeType("FMOD_3D_ATTRIBUTES[8]")
    public FMOD_3D_ATTRIBUTES.Buffer relative() { return nrelative(address()); }
    /** @return a {@link FMOD_3D_ATTRIBUTES} view of the struct at the specified index of the {@code relative} field. */
    public FMOD_3D_ATTRIBUTES relative(int index) { return nrelative(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code weight} field. */
    @NativeType("float[8]")
    public FloatBuffer weight() { return nweight(address()); }
    /** @return the value at the specified index of the {@code weight} field. */
    public float weight(int index) { return nweight(address(), index); }
    /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code absolute} field. */
    public FMOD_3D_ATTRIBUTES absolute() { return nabsolute(address()); }

    /** Sets the specified value to the {@code numlisteners} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI numlisteners(int value) { nnumlisteners(address(), value); return this; }
    /** Copies the specified {@link FMOD_3D_ATTRIBUTES.Buffer} to the {@code relative} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI relative(@NativeType("FMOD_3D_ATTRIBUTES[8]") FMOD_3D_ATTRIBUTES.Buffer value) { nrelative(address(), value); return this; }
    /** Copies the specified {@link FMOD_3D_ATTRIBUTES} at the specified index of the {@code relative} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI relative(int index, FMOD_3D_ATTRIBUTES value) { nrelative(address(), index, value); return this; }
    /** Passes the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI relative(java.util.function.Consumer<FMOD_3D_ATTRIBUTES.Buffer> consumer) { consumer.accept(relative()); return this; }
    /** Passes the element at {@code index} of the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI relative(int index, java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(relative(index)); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code weight} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI weight(@NativeType("float[8]") FloatBuffer value) { nweight(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code weight} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI weight(int index, float value) { nweight(address(), index, value); return this; }
    /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code absolute} field. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI absolute(FMOD_3D_ATTRIBUTES value) { nabsolute(address(), value); return this; }
    /** Passes the {@code absolute} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI absolute(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(absolute()); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI set(
        int numlisteners,
        FMOD_3D_ATTRIBUTES.Buffer relative,
        FloatBuffer weight,
        FMOD_3D_ATTRIBUTES absolute
    ) {
        numlisteners(numlisteners);
        relative(relative);
        weight(weight);
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
    public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI set(FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI malloc() {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI calloc() {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI create(long address) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numlisteners}. */
    public static int nnumlisteners(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.NUMLISTENERS); }
    /** Unsafe version of {@link #relative}. */
    public static FMOD_3D_ATTRIBUTES.Buffer nrelative(long struct) { return FMOD_3D_ATTRIBUTES.create(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.RELATIVE, 8); }
    /** Unsafe version of {@link #relative(int) relative}. */
    public static FMOD_3D_ATTRIBUTES nrelative(long struct, int index) {
        return FMOD_3D_ATTRIBUTES.create(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.RELATIVE + check(index, 8) * FMOD_3D_ATTRIBUTES.SIZEOF);
    }
    /** Unsafe version of {@link #weight}. */
    public static FloatBuffer nweight(long struct) { return memFloatBuffer(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.WEIGHT, 8); }
    /** Unsafe version of {@link #weight(int) weight}. */
    public static float nweight(long struct, int index) {
        return UNSAFE.getFloat(null, struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.WEIGHT + check(index, 8) * 4);
    }
    /** Unsafe version of {@link #absolute}. */
    public static FMOD_3D_ATTRIBUTES nabsolute(long struct) { return FMOD_3D_ATTRIBUTES.create(struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.ABSOLUTE); }

    /** Unsafe version of {@link #numlisteners(int) numlisteners}. */
    public static void nnumlisteners(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.NUMLISTENERS, value); }
    /** Unsafe version of {@link #relative(FMOD_3D_ATTRIBUTES.Buffer) relative}. */
    public static void nrelative(long struct, FMOD_3D_ATTRIBUTES.Buffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(value.address(), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.RELATIVE, value.remaining() * FMOD_3D_ATTRIBUTES.SIZEOF);
    }
    /** Unsafe version of {@link #relative(int, FMOD_3D_ATTRIBUTES) relative}. */
    public static void nrelative(long struct, int index, FMOD_3D_ATTRIBUTES value) {
        memCopy(value.address(), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.RELATIVE + check(index, 8) * FMOD_3D_ATTRIBUTES.SIZEOF, FMOD_3D_ATTRIBUTES.SIZEOF);
    }
    /** Unsafe version of {@link #weight(FloatBuffer) weight}. */
    public static void nweight(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(memAddress(value), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.WEIGHT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #weight(int, float) weight}. */
    public static void nweight(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.WEIGHT + check(index, 8) * 4, value);
    }
    /** Unsafe version of {@link #absolute(FMOD_3D_ATTRIBUTES) absolute}. */
    public static void nabsolute(long struct, FMOD_3D_ATTRIBUTES value) { memCopy(value.address(), struct + FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.ABSOLUTE, FMOD_3D_ATTRIBUTES.SIZEOF); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI ELEMENT_FACTORY = FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numlisteners} field. */
        public int numlisteners() { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nnumlisteners(address()); }
        /** @return a {@link FMOD_3D_ATTRIBUTES}.Buffer view of the {@code relative} field. */
        @NativeType("FMOD_3D_ATTRIBUTES[8]")
        public FMOD_3D_ATTRIBUTES.Buffer relative() { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nrelative(address()); }
        /** @return a {@link FMOD_3D_ATTRIBUTES} view of the struct at the specified index of the {@code relative} field. */
        public FMOD_3D_ATTRIBUTES relative(int index) { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nrelative(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code weight} field. */
        @NativeType("float[8]")
        public FloatBuffer weight() { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nweight(address()); }
        /** @return the value at the specified index of the {@code weight} field. */
        public float weight(int index) { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nweight(address(), index); }
        /** @return a {@link FMOD_3D_ATTRIBUTES} view of the {@code absolute} field. */
        public FMOD_3D_ATTRIBUTES absolute() { return FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nabsolute(address()); }

        /** Sets the specified value to the {@code numlisteners} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer numlisteners(int value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nnumlisteners(address(), value); return this; }
        /** Copies the specified {@link FMOD_3D_ATTRIBUTES.Buffer} to the {@code relative} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer relative(@NativeType("FMOD_3D_ATTRIBUTES[8]") FMOD_3D_ATTRIBUTES.Buffer value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nrelative(address(), value); return this; }
        /** Copies the specified {@link FMOD_3D_ATTRIBUTES} at the specified index of the {@code relative} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer relative(int index, FMOD_3D_ATTRIBUTES value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nrelative(address(), index, value); return this; }
        /** Passes the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer relative(java.util.function.Consumer<FMOD_3D_ATTRIBUTES.Buffer> consumer) { consumer.accept(relative()); return this; }
        /** Passes the element at {@code index} of the {@code relative} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer relative(int index, java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(relative(index)); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code weight} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer weight(@NativeType("float[8]") FloatBuffer value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nweight(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code weight} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer weight(int index, float value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nweight(address(), index, value); return this; }
        /** Copies the specified {@link FMOD_3D_ATTRIBUTES} to the {@code absolute} field. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer absolute(FMOD_3D_ATTRIBUTES value) { FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.nabsolute(address(), value); return this; }
        /** Passes the {@code absolute} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_DSP_PARAMETER_3DATTRIBUTES_MULTI.Buffer absolute(java.util.function.Consumer<FMOD_3D_ATTRIBUTES> consumer) { consumer.accept(absolute()); return this; }

    }

}