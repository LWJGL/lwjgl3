/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

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
 * struct meshopt_OverdrawStatistics {
 *     unsigned int pixels_covered;
 *     unsigned int pixels_shaded;
 *     float {@link #overdraw};
 * }</code></pre>
 */
@NativeType("struct meshopt_OverdrawStatistics")
public class MeshoptOverdrawStatistics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIXELS_COVERED,
        PIXELS_SHADED,
        OVERDRAW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIXELS_COVERED = layout.offsetof(0);
        PIXELS_SHADED = layout.offsetof(1);
        OVERDRAW = layout.offsetof(2);
    }

    /**
     * Creates a {@code MeshoptOverdrawStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptOverdrawStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pixels_covered} field. */
    @NativeType("unsigned int")
    public int pixels_covered() { return npixels_covered(address()); }
    /** @return the value of the {@code pixels_shaded} field. */
    @NativeType("unsigned int")
    public int pixels_shaded() { return npixels_shaded(address()); }
    /** shaded pixels / covered pixels; best case 1.0 */
    public float overdraw() { return noverdraw(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptOverdrawStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptOverdrawStatistics malloc() {
        return wrap(MeshoptOverdrawStatistics.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MeshoptOverdrawStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptOverdrawStatistics calloc() {
        return wrap(MeshoptOverdrawStatistics.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MeshoptOverdrawStatistics} instance allocated with {@link BufferUtils}. */
    public static MeshoptOverdrawStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeshoptOverdrawStatistics.class, memAddress(container), container);
    }

    /** Returns a new {@code MeshoptOverdrawStatistics} instance for the specified memory address. */
    public static MeshoptOverdrawStatistics create(long address) {
        return wrap(MeshoptOverdrawStatistics.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptOverdrawStatistics createSafe(long address) {
        return address == NULL ? null : wrap(MeshoptOverdrawStatistics.class, address);
    }

    /**
     * Returns a new {@link MeshoptOverdrawStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptOverdrawStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptOverdrawStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeshoptOverdrawStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptOverdrawStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code MeshoptOverdrawStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptOverdrawStatistics malloc(MemoryStack stack) {
        return wrap(MeshoptOverdrawStatistics.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MeshoptOverdrawStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptOverdrawStatistics calloc(MemoryStack stack) {
        return wrap(MeshoptOverdrawStatistics.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeshoptOverdrawStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptOverdrawStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptOverdrawStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pixels_covered}. */
    public static int npixels_covered(long struct) { return UNSAFE.getInt(null, struct + MeshoptOverdrawStatistics.PIXELS_COVERED); }
    /** Unsafe version of {@link #pixels_shaded}. */
    public static int npixels_shaded(long struct) { return UNSAFE.getInt(null, struct + MeshoptOverdrawStatistics.PIXELS_SHADED); }
    /** Unsafe version of {@link #overdraw}. */
    public static float noverdraw(long struct) { return UNSAFE.getFloat(null, struct + MeshoptOverdrawStatistics.OVERDRAW); }

    // -----------------------------------

    /** An array of {@link MeshoptOverdrawStatistics} structs. */
    public static class Buffer extends StructBuffer<MeshoptOverdrawStatistics, Buffer> implements NativeResource {

        private static final MeshoptOverdrawStatistics ELEMENT_FACTORY = MeshoptOverdrawStatistics.create(-1L);

        /**
         * Creates a new {@code MeshoptOverdrawStatistics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptOverdrawStatistics#SIZEOF}, and its mark will be undefined.
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
        protected MeshoptOverdrawStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pixels_covered} field. */
        @NativeType("unsigned int")
        public int pixels_covered() { return MeshoptOverdrawStatistics.npixels_covered(address()); }
        /** @return the value of the {@code pixels_shaded} field. */
        @NativeType("unsigned int")
        public int pixels_shaded() { return MeshoptOverdrawStatistics.npixels_shaded(address()); }
        /** @return the value of the {@link MeshoptOverdrawStatistics#overdraw} field. */
        public float overdraw() { return MeshoptOverdrawStatistics.noverdraw(address()); }

    }

}