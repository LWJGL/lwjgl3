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
 * struct FMOD_CPU_USAGE {
 *     float dsp;
 *     float stream;
 *     float geometry;
 *     float update;
 *     float convolution1;
 *     float convolution2;
 * }</code></pre>
 */
public class FMOD_CPU_USAGE extends Struct<FMOD_CPU_USAGE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DSP,
        STREAM,
        GEOMETRY,
        UPDATE,
        CONVOLUTION1,
        CONVOLUTION2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DSP = layout.offsetof(0);
        STREAM = layout.offsetof(1);
        GEOMETRY = layout.offsetof(2);
        UPDATE = layout.offsetof(3);
        CONVOLUTION1 = layout.offsetof(4);
        CONVOLUTION2 = layout.offsetof(5);
    }

    protected FMOD_CPU_USAGE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CPU_USAGE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CPU_USAGE(address, container);
    }

    /**
     * Creates a {@code FMOD_CPU_USAGE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CPU_USAGE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dsp} field. */
    public float dsp() { return ndsp(address()); }
    /** @return the value of the {@code stream} field. */
    public float stream$() { return nstream$(address()); }
    /** @return the value of the {@code geometry} field. */
    public float geometry() { return ngeometry(address()); }
    /** @return the value of the {@code update} field. */
    public float update() { return nupdate(address()); }
    /** @return the value of the {@code convolution1} field. */
    public float convolution1() { return nconvolution1(address()); }
    /** @return the value of the {@code convolution2} field. */
    public float convolution2() { return nconvolution2(address()); }

    /** Sets the specified value to the {@code dsp} field. */
    public FMOD_CPU_USAGE dsp(float value) { ndsp(address(), value); return this; }
    /** Sets the specified value to the {@code stream} field. */
    public FMOD_CPU_USAGE stream$(float value) { nstream$(address(), value); return this; }
    /** Sets the specified value to the {@code geometry} field. */
    public FMOD_CPU_USAGE geometry(float value) { ngeometry(address(), value); return this; }
    /** Sets the specified value to the {@code update} field. */
    public FMOD_CPU_USAGE update(float value) { nupdate(address(), value); return this; }
    /** Sets the specified value to the {@code convolution1} field. */
    public FMOD_CPU_USAGE convolution1(float value) { nconvolution1(address(), value); return this; }
    /** Sets the specified value to the {@code convolution2} field. */
    public FMOD_CPU_USAGE convolution2(float value) { nconvolution2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CPU_USAGE set(
        float dsp,
        float stream$,
        float geometry,
        float update,
        float convolution1,
        float convolution2
    ) {
        dsp(dsp);
        stream$(stream$);
        geometry(geometry);
        update(update);
        convolution1(convolution1);
        convolution2(convolution2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CPU_USAGE set(FMOD_CPU_USAGE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CPU_USAGE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CPU_USAGE malloc() {
        return new FMOD_CPU_USAGE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CPU_USAGE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CPU_USAGE calloc() {
        return new FMOD_CPU_USAGE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CPU_USAGE} instance allocated with {@link BufferUtils}. */
    public static FMOD_CPU_USAGE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CPU_USAGE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CPU_USAGE} instance for the specified memory address. */
    public static FMOD_CPU_USAGE create(long address) {
        return new FMOD_CPU_USAGE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CPU_USAGE createSafe(long address) {
        return address == NULL ? null : new FMOD_CPU_USAGE(address, null);
    }

    /**
     * Returns a new {@link FMOD_CPU_USAGE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CPU_USAGE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CPU_USAGE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CPU_USAGE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CPU_USAGE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CPU_USAGE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CPU_USAGE malloc(MemoryStack stack) {
        return new FMOD_CPU_USAGE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CPU_USAGE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CPU_USAGE calloc(MemoryStack stack) {
        return new FMOD_CPU_USAGE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CPU_USAGE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CPU_USAGE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CPU_USAGE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dsp}. */
    public static float ndsp(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.DSP); }
    /** Unsafe version of {@link #stream$}. */
    public static float nstream$(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.STREAM); }
    /** Unsafe version of {@link #geometry}. */
    public static float ngeometry(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.GEOMETRY); }
    /** Unsafe version of {@link #update}. */
    public static float nupdate(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.UPDATE); }
    /** Unsafe version of {@link #convolution1}. */
    public static float nconvolution1(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.CONVOLUTION1); }
    /** Unsafe version of {@link #convolution2}. */
    public static float nconvolution2(long struct) { return UNSAFE.getFloat(null, struct + FMOD_CPU_USAGE.CONVOLUTION2); }

    /** Unsafe version of {@link #dsp(float) dsp}. */
    public static void ndsp(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.DSP, value); }
    /** Unsafe version of {@link #stream$(float) stream$}. */
    public static void nstream$(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.STREAM, value); }
    /** Unsafe version of {@link #geometry(float) geometry}. */
    public static void ngeometry(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.GEOMETRY, value); }
    /** Unsafe version of {@link #update(float) update}. */
    public static void nupdate(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.UPDATE, value); }
    /** Unsafe version of {@link #convolution1(float) convolution1}. */
    public static void nconvolution1(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.CONVOLUTION1, value); }
    /** Unsafe version of {@link #convolution2(float) convolution2}. */
    public static void nconvolution2(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_CPU_USAGE.CONVOLUTION2, value); }

    // -----------------------------------

    /** An array of {@link FMOD_CPU_USAGE} structs. */
    public static class Buffer extends StructBuffer<FMOD_CPU_USAGE, Buffer> implements NativeResource {

        private static final FMOD_CPU_USAGE ELEMENT_FACTORY = FMOD_CPU_USAGE.create(-1L);

        /**
         * Creates a new {@code FMOD_CPU_USAGE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CPU_USAGE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_CPU_USAGE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dsp} field. */
        public float dsp() { return FMOD_CPU_USAGE.ndsp(address()); }
        /** @return the value of the {@code stream} field. */
        public float stream$() { return FMOD_CPU_USAGE.nstream$(address()); }
        /** @return the value of the {@code geometry} field. */
        public float geometry() { return FMOD_CPU_USAGE.ngeometry(address()); }
        /** @return the value of the {@code update} field. */
        public float update() { return FMOD_CPU_USAGE.nupdate(address()); }
        /** @return the value of the {@code convolution1} field. */
        public float convolution1() { return FMOD_CPU_USAGE.nconvolution1(address()); }
        /** @return the value of the {@code convolution2} field. */
        public float convolution2() { return FMOD_CPU_USAGE.nconvolution2(address()); }

        /** Sets the specified value to the {@code dsp} field. */
        public FMOD_CPU_USAGE.Buffer dsp(float value) { FMOD_CPU_USAGE.ndsp(address(), value); return this; }
        /** Sets the specified value to the {@code stream} field. */
        public FMOD_CPU_USAGE.Buffer stream$(float value) { FMOD_CPU_USAGE.nstream$(address(), value); return this; }
        /** Sets the specified value to the {@code geometry} field. */
        public FMOD_CPU_USAGE.Buffer geometry(float value) { FMOD_CPU_USAGE.ngeometry(address(), value); return this; }
        /** Sets the specified value to the {@code update} field. */
        public FMOD_CPU_USAGE.Buffer update(float value) { FMOD_CPU_USAGE.nupdate(address(), value); return this; }
        /** Sets the specified value to the {@code convolution1} field. */
        public FMOD_CPU_USAGE.Buffer convolution1(float value) { FMOD_CPU_USAGE.nconvolution1(address(), value); return this; }
        /** Sets the specified value to the {@code convolution2} field. */
        public FMOD_CPU_USAGE.Buffer convolution2(float value) { FMOD_CPU_USAGE.nconvolution2(address(), value); return this; }

    }

}