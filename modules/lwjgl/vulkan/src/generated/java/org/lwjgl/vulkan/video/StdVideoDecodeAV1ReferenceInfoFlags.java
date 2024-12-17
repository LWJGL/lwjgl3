/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoDecodeAV1ReferenceInfoFlags {
 *     uint32_t disable_frame_end_update_cdf : 1;
 *     uint32_t segmentation_enabled : 1;
 *     uint32_t reserved : 30;
 * }}</pre>
 */
public class StdVideoDecodeAV1ReferenceInfoFlags extends Struct<StdVideoDecodeAV1ReferenceInfoFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoDecodeAV1ReferenceInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeAV1ReferenceInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeAV1ReferenceInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeAV1ReferenceInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code disable_frame_end_update_cdf} field. */
    @NativeType("uint32_t")
    public boolean disable_frame_end_update_cdf() { return ndisable_frame_end_update_cdf(address()) != 0; }
    /** @return the value of the {@code segmentation_enabled} field. */
    @NativeType("uint32_t")
    public boolean segmentation_enabled() { return nsegmentation_enabled(address()) != 0; }

    /** Sets the specified value to the {@code disable_frame_end_update_cdf} field. */
    public StdVideoDecodeAV1ReferenceInfoFlags disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) { ndisable_frame_end_update_cdf(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_enabled} field. */
    public StdVideoDecodeAV1ReferenceInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) { nsegmentation_enabled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeAV1ReferenceInfoFlags set(
        boolean disable_frame_end_update_cdf,
        boolean segmentation_enabled
    ) {
        disable_frame_end_update_cdf(disable_frame_end_update_cdf);
        segmentation_enabled(segmentation_enabled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeAV1ReferenceInfoFlags set(StdVideoDecodeAV1ReferenceInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1ReferenceInfoFlags malloc() {
        return new StdVideoDecodeAV1ReferenceInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1ReferenceInfoFlags calloc() {
        return new StdVideoDecodeAV1ReferenceInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeAV1ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1ReferenceInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeAV1ReferenceInfoFlags create(long address) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeAV1ReferenceInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeAV1ReferenceInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeAV1ReferenceInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1ReferenceInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoDecodeAV1ReferenceInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #disable_frame_end_update_cdf}. */
    public static int ndisable_frame_end_update_cdf(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #segmentation_enabled}. */
    public static int nsegmentation_enabled(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoDecodeAV1ReferenceInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x3F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1ReferenceInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #disable_frame_end_update_cdf(boolean) disable_frame_end_update_cdf}. */
    public static void ndisable_frame_end_update_cdf(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #segmentation_enabled(boolean) segmentation_enabled}. */
    public static void nsegmentation_enabled(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1ReferenceInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xC0_00_00_00) | (value & 0x3F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeAV1ReferenceInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1ReferenceInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeAV1ReferenceInfoFlags ELEMENT_FACTORY = StdVideoDecodeAV1ReferenceInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeAV1ReferenceInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeAV1ReferenceInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected StdVideoDecodeAV1ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code disable_frame_end_update_cdf} field. */
        @NativeType("uint32_t")
        public boolean disable_frame_end_update_cdf() { return StdVideoDecodeAV1ReferenceInfoFlags.ndisable_frame_end_update_cdf(address()) != 0; }
        /** @return the value of the {@code segmentation_enabled} field. */
        @NativeType("uint32_t")
        public boolean segmentation_enabled() { return StdVideoDecodeAV1ReferenceInfoFlags.nsegmentation_enabled(address()) != 0; }

        /** Sets the specified value to the {@code disable_frame_end_update_cdf} field. */
        public StdVideoDecodeAV1ReferenceInfoFlags.Buffer disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1ReferenceInfoFlags.ndisable_frame_end_update_cdf(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_enabled} field. */
        public StdVideoDecodeAV1ReferenceInfoFlags.Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1ReferenceInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0); return this; }

    }

}