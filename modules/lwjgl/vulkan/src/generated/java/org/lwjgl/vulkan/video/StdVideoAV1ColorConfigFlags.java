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
 * struct StdVideoAV1ColorConfigFlags {
 *     uint32_t mono_chrome : 1;
 *     uint32_t color_range : 1;
 *     uint32_t separate_uv_delta_q : 1;
 *     uint32_t color_description_present_flag : 1;
 *     uint32_t reserved : 28;
 * }}</pre>
 */
public class StdVideoAV1ColorConfigFlags extends Struct<StdVideoAV1ColorConfigFlags> implements NativeResource {

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

    protected StdVideoAV1ColorConfigFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1ColorConfigFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1ColorConfigFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1ColorConfigFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1ColorConfigFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mono_chrome} field. */
    @NativeType("uint32_t")
    public boolean mono_chrome() { return nmono_chrome(address()) != 0; }
    /** @return the value of the {@code color_range} field. */
    @NativeType("uint32_t")
    public boolean color_range() { return ncolor_range(address()) != 0; }
    /** @return the value of the {@code separate_uv_delta_q} field. */
    @NativeType("uint32_t")
    public boolean separate_uv_delta_q() { return nseparate_uv_delta_q(address()) != 0; }
    /** @return the value of the {@code color_description_present_flag} field. */
    @NativeType("uint32_t")
    public boolean color_description_present_flag() { return ncolor_description_present_flag(address()) != 0; }

    /** Sets the specified value to the {@code mono_chrome} field. */
    public StdVideoAV1ColorConfigFlags mono_chrome(@NativeType("uint32_t") boolean value) { nmono_chrome(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code color_range} field. */
    public StdVideoAV1ColorConfigFlags color_range(@NativeType("uint32_t") boolean value) { ncolor_range(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separate_uv_delta_q} field. */
    public StdVideoAV1ColorConfigFlags separate_uv_delta_q(@NativeType("uint32_t") boolean value) { nseparate_uv_delta_q(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code color_description_present_flag} field. */
    public StdVideoAV1ColorConfigFlags color_description_present_flag(@NativeType("uint32_t") boolean value) { ncolor_description_present_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1ColorConfigFlags set(
        boolean mono_chrome,
        boolean color_range,
        boolean separate_uv_delta_q,
        boolean color_description_present_flag
    ) {
        mono_chrome(mono_chrome);
        color_range(color_range);
        separate_uv_delta_q(separate_uv_delta_q);
        color_description_present_flag(color_description_present_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1ColorConfigFlags set(StdVideoAV1ColorConfigFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1ColorConfigFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1ColorConfigFlags malloc() {
        return new StdVideoAV1ColorConfigFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1ColorConfigFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1ColorConfigFlags calloc() {
        return new StdVideoAV1ColorConfigFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1ColorConfigFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1ColorConfigFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1ColorConfigFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1ColorConfigFlags} instance for the specified memory address. */
    public static StdVideoAV1ColorConfigFlags create(long address) {
        return new StdVideoAV1ColorConfigFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1ColorConfigFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1ColorConfigFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfigFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfigFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfigFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1ColorConfigFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1ColorConfigFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1ColorConfigFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1ColorConfigFlags malloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfigFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1ColorConfigFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1ColorConfigFlags calloc(MemoryStack stack) {
        return new StdVideoAV1ColorConfigFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfigFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1ColorConfigFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1ColorConfigFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1ColorConfigFlags.BITFIELD0); }
    /** Unsafe version of {@link #mono_chrome}. */
    public static int nmono_chrome(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #color_range}. */
    public static int ncolor_range(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #separate_uv_delta_q}. */
    public static int nseparate_uv_delta_q(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #color_description_present_flag}. */
    public static int ncolor_description_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1ColorConfigFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x0F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfigFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #mono_chrome(boolean) mono_chrome}. */
    public static void nmono_chrome(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #color_range(boolean) color_range}. */
    public static void ncolor_range(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #separate_uv_delta_q(boolean) separate_uv_delta_q}. */
    public static void nseparate_uv_delta_q(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #color_description_present_flag(boolean) color_description_present_flag}. */
    public static void ncolor_description_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1ColorConfigFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xF0_00_00_00) | (value & 0x0F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1ColorConfigFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1ColorConfigFlags, Buffer> implements NativeResource {

        private static final StdVideoAV1ColorConfigFlags ELEMENT_FACTORY = StdVideoAV1ColorConfigFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1ColorConfigFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1ColorConfigFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1ColorConfigFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mono_chrome} field. */
        @NativeType("uint32_t")
        public boolean mono_chrome() { return StdVideoAV1ColorConfigFlags.nmono_chrome(address()) != 0; }
        /** @return the value of the {@code color_range} field. */
        @NativeType("uint32_t")
        public boolean color_range() { return StdVideoAV1ColorConfigFlags.ncolor_range(address()) != 0; }
        /** @return the value of the {@code separate_uv_delta_q} field. */
        @NativeType("uint32_t")
        public boolean separate_uv_delta_q() { return StdVideoAV1ColorConfigFlags.nseparate_uv_delta_q(address()) != 0; }
        /** @return the value of the {@code color_description_present_flag} field. */
        @NativeType("uint32_t")
        public boolean color_description_present_flag() { return StdVideoAV1ColorConfigFlags.ncolor_description_present_flag(address()) != 0; }

        /** Sets the specified value to the {@code mono_chrome} field. */
        public StdVideoAV1ColorConfigFlags.Buffer mono_chrome(@NativeType("uint32_t") boolean value) { StdVideoAV1ColorConfigFlags.nmono_chrome(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code color_range} field. */
        public StdVideoAV1ColorConfigFlags.Buffer color_range(@NativeType("uint32_t") boolean value) { StdVideoAV1ColorConfigFlags.ncolor_range(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separate_uv_delta_q} field. */
        public StdVideoAV1ColorConfigFlags.Buffer separate_uv_delta_q(@NativeType("uint32_t") boolean value) { StdVideoAV1ColorConfigFlags.nseparate_uv_delta_q(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code color_description_present_flag} field. */
        public StdVideoAV1ColorConfigFlags.Buffer color_description_present_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1ColorConfigFlags.ncolor_description_present_flag(address(), value ? 1 : 0); return this; }

    }

}