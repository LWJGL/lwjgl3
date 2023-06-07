/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265PredictorPaletteEntries {
 *     uint16_t PredictorPaletteEntries[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE];
 * }</code></pre>
 */
public class StdVideoH265PredictorPaletteEntries extends Struct<StdVideoH265PredictorPaletteEntries> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PREDICTORPALETTEENTRIES;

    static {
        Layout layout = __struct(
            __array(2, STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PREDICTORPALETTEENTRIES = layout.offsetof(0);
    }

    protected StdVideoH265PredictorPaletteEntries(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265PredictorPaletteEntries create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265PredictorPaletteEntries(address, container);
    }

    /**
     * Creates a {@code StdVideoH265PredictorPaletteEntries} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265PredictorPaletteEntries(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ShortBuffer} view of the {@code PredictorPaletteEntries} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
    public ShortBuffer PredictorPaletteEntries() { return nPredictorPaletteEntries(address()); }
    /** @return the value at the specified index of the {@code PredictorPaletteEntries} field. */
    @NativeType("uint16_t")
    public short PredictorPaletteEntries(int index) { return nPredictorPaletteEntries(address(), index); }

    /** Copies the specified {@link ShortBuffer} to the {@code PredictorPaletteEntries} field. */
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(@NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") ShortBuffer value) { nPredictorPaletteEntries(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code PredictorPaletteEntries} field. */
    public StdVideoH265PredictorPaletteEntries PredictorPaletteEntries(int index, @NativeType("uint16_t") short value) { nPredictorPaletteEntries(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265PredictorPaletteEntries set(StdVideoH265PredictorPaletteEntries src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265PredictorPaletteEntries} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265PredictorPaletteEntries malloc() {
        return new StdVideoH265PredictorPaletteEntries(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265PredictorPaletteEntries} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265PredictorPaletteEntries calloc() {
        return new StdVideoH265PredictorPaletteEntries(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265PredictorPaletteEntries} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265PredictorPaletteEntries create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265PredictorPaletteEntries(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265PredictorPaletteEntries} instance for the specified memory address. */
    public static StdVideoH265PredictorPaletteEntries create(long address) {
        return new StdVideoH265PredictorPaletteEntries(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PredictorPaletteEntries createSafe(long address) {
        return address == NULL ? null : new StdVideoH265PredictorPaletteEntries(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265PredictorPaletteEntries.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PredictorPaletteEntries.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PredictorPaletteEntries.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265PredictorPaletteEntries.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PredictorPaletteEntries.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265PredictorPaletteEntries} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PredictorPaletteEntries malloc(MemoryStack stack) {
        return new StdVideoH265PredictorPaletteEntries(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265PredictorPaletteEntries} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PredictorPaletteEntries calloc(MemoryStack stack) {
        return new StdVideoH265PredictorPaletteEntries(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265PredictorPaletteEntries.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PredictorPaletteEntries.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PredictorPaletteEntries.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #PredictorPaletteEntries}. */
    public static ShortBuffer nPredictorPaletteEntries(long struct) { return memShortBuffer(struct + StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES, STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE); }
    /** Unsafe version of {@link #PredictorPaletteEntries(int) PredictorPaletteEntries}. */
    public static short nPredictorPaletteEntries(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES + check(index, STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE) * 2);
    }

    /** Unsafe version of {@link #PredictorPaletteEntries(ShortBuffer) PredictorPaletteEntries}. */
    public static void nPredictorPaletteEntries(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES, value.remaining() * 2);
    }
    /** Unsafe version of {@link #PredictorPaletteEntries(int, short) PredictorPaletteEntries}. */
    public static void nPredictorPaletteEntries(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265PredictorPaletteEntries.PREDICTORPALETTEENTRIES + check(index, STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265PredictorPaletteEntries} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265PredictorPaletteEntries, Buffer> implements NativeResource {

        private static final StdVideoH265PredictorPaletteEntries ELEMENT_FACTORY = StdVideoH265PredictorPaletteEntries.create(-1L);

        /**
         * Creates a new {@code StdVideoH265PredictorPaletteEntries.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265PredictorPaletteEntries#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265PredictorPaletteEntries getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ShortBuffer} view of the {@code PredictorPaletteEntries} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]")
        public ShortBuffer PredictorPaletteEntries() { return StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address()); }
        /** @return the value at the specified index of the {@code PredictorPaletteEntries} field. */
        @NativeType("uint16_t")
        public short PredictorPaletteEntries(int index) { return StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), index); }

        /** Copies the specified {@link ShortBuffer} to the {@code PredictorPaletteEntries} field. */
        public StdVideoH265PredictorPaletteEntries.Buffer PredictorPaletteEntries(@NativeType("uint16_t[STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE]") ShortBuffer value) { StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code PredictorPaletteEntries} field. */
        public StdVideoH265PredictorPaletteEntries.Buffer PredictorPaletteEntries(int index, @NativeType("uint16_t") short value) { StdVideoH265PredictorPaletteEntries.nPredictorPaletteEntries(address(), index, value); return this; }

    }

}