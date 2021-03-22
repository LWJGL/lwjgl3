/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used to return the post-distortion UVs for each color channel.
 * 
 * <p>UVs range from 0 to 1 with 0,0 in the upper left corner of the source render target. The 0,0 to 1,1 range covers a single eye.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct DistortionCoordinates_t {
 *     float {@link #rfRed}[2];
 *     float {@link #rfGreen}[2];
 *     float {@link #rfBlue}[2];
 * }</code></pre>
 */
@NativeType("struct DistortionCoordinates_t")
public class DistortionCoordinates extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RFRED,
        RFGREEN,
        RFBLUE;

    static {
        Layout layout = __struct(
            __array(4, 2),
            __array(4, 2),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RFRED = layout.offsetof(0);
        RFGREEN = layout.offsetof(1);
        RFBLUE = layout.offsetof(2);
    }

    /**
     * Creates a {@code DistortionCoordinates} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DistortionCoordinates(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the UVs for the red channel */
    @NativeType("float[2]")
    public FloatBuffer rfRed() { return nrfRed(address()); }
    /** the UVs for the red channel */
    public float rfRed(int index) { return nrfRed(address(), index); }
    /** the UVs for the green channel */
    @NativeType("float[2]")
    public FloatBuffer rfGreen() { return nrfGreen(address()); }
    /** the UVs for the green channel */
    public float rfGreen(int index) { return nrfGreen(address(), index); }
    /** the UVs for the blue channel */
    @NativeType("float[2]")
    public FloatBuffer rfBlue() { return nrfBlue(address()); }
    /** the UVs for the blue channel */
    public float rfBlue(int index) { return nrfBlue(address(), index); }

    // -----------------------------------

    /** Returns a new {@code DistortionCoordinates} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DistortionCoordinates malloc() {
        return wrap(DistortionCoordinates.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DistortionCoordinates} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DistortionCoordinates calloc() {
        return wrap(DistortionCoordinates.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DistortionCoordinates} instance allocated with {@link BufferUtils}. */
    public static DistortionCoordinates create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DistortionCoordinates.class, memAddress(container), container);
    }

    /** Returns a new {@code DistortionCoordinates} instance for the specified memory address. */
    public static DistortionCoordinates create(long address) {
        return wrap(DistortionCoordinates.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DistortionCoordinates createSafe(long address) {
        return address == NULL ? null : wrap(DistortionCoordinates.class, address);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DistortionCoordinates.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DistortionCoordinates.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code DistortionCoordinates} instance allocated on the thread-local {@link MemoryStack}. */
    public static DistortionCoordinates mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code DistortionCoordinates} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DistortionCoordinates callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code DistortionCoordinates} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DistortionCoordinates mallocStack(MemoryStack stack) {
        return wrap(DistortionCoordinates.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DistortionCoordinates} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DistortionCoordinates callocStack(MemoryStack stack) {
        return wrap(DistortionCoordinates.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DistortionCoordinates.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DistortionCoordinates.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rfRed}. */
    public static FloatBuffer nrfRed(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFRED, 2); }
    /** Unsafe version of {@link #rfRed(int) rfRed}. */
    public static float nrfRed(long struct, int index) {
        return UNSAFE.getFloat(null, struct + DistortionCoordinates.RFRED + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #rfGreen}. */
    public static FloatBuffer nrfGreen(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFGREEN, 2); }
    /** Unsafe version of {@link #rfGreen(int) rfGreen}. */
    public static float nrfGreen(long struct, int index) {
        return UNSAFE.getFloat(null, struct + DistortionCoordinates.RFGREEN + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #rfBlue}. */
    public static FloatBuffer nrfBlue(long struct) { return memFloatBuffer(struct + DistortionCoordinates.RFBLUE, 2); }
    /** Unsafe version of {@link #rfBlue(int) rfBlue}. */
    public static float nrfBlue(long struct, int index) {
        return UNSAFE.getFloat(null, struct + DistortionCoordinates.RFBLUE + check(index, 2) * 4);
    }

    // -----------------------------------

    /** An array of {@link DistortionCoordinates} structs. */
    public static class Buffer extends StructBuffer<DistortionCoordinates, Buffer> implements NativeResource {

        private static final DistortionCoordinates ELEMENT_FACTORY = DistortionCoordinates.create(-1L);

        /**
         * Creates a new {@code DistortionCoordinates.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DistortionCoordinates#SIZEOF}, and its mark will be undefined.
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
        protected DistortionCoordinates getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@link DistortionCoordinates#rfRed} field. */
        @NativeType("float[2]")
        public FloatBuffer rfRed() { return DistortionCoordinates.nrfRed(address()); }
        /** @return the value at the specified index of the {@link DistortionCoordinates#rfRed} field. */
        public float rfRed(int index) { return DistortionCoordinates.nrfRed(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link DistortionCoordinates#rfGreen} field. */
        @NativeType("float[2]")
        public FloatBuffer rfGreen() { return DistortionCoordinates.nrfGreen(address()); }
        /** @return the value at the specified index of the {@link DistortionCoordinates#rfGreen} field. */
        public float rfGreen(int index) { return DistortionCoordinates.nrfGreen(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link DistortionCoordinates#rfBlue} field. */
        @NativeType("float[2]")
        public FloatBuffer rfBlue() { return DistortionCoordinates.nrfBlue(address()); }
        /** @return the value at the specified index of the {@link DistortionCoordinates#rfBlue} field. */
        public float rfBlue(int index) { return DistortionCoordinates.nrfBlue(address(), index); }

    }

}