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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoDecodeH265PictureInfoFlags {
 *     uint32_t IrapPicFlag : 1;
 *     uint32_t IdrPicFlag : 1;
 *     uint32_t IsReference : 1;
 *     uint32_t short_term_ref_pic_set_sps_flag : 1;
 * }</code></pre>
 */
public class StdVideoDecodeH265PictureInfoFlags extends Struct<StdVideoDecodeH265PictureInfoFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoDecodeH265PictureInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeH265PictureInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeH265PictureInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeH265PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH265PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code IrapPicFlag} field. */
    @NativeType("uint32_t")
    public boolean IrapPicFlag() { return nIrapPicFlag(address()) != 0; }
    /** @return the value of the {@code IdrPicFlag} field. */
    @NativeType("uint32_t")
    public boolean IdrPicFlag() { return nIdrPicFlag(address()) != 0; }
    /** @return the value of the {@code IsReference} field. */
    @NativeType("uint32_t")
    public boolean IsReference() { return nIsReference(address()) != 0; }
    /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
    @NativeType("uint32_t")
    public boolean short_term_ref_pic_set_sps_flag() { return nshort_term_ref_pic_set_sps_flag(address()) != 0; }

    /** Sets the specified value to the {@code IrapPicFlag} field. */
    public StdVideoDecodeH265PictureInfoFlags IrapPicFlag(@NativeType("uint32_t") boolean value) { nIrapPicFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code IdrPicFlag} field. */
    public StdVideoDecodeH265PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) { nIdrPicFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code IsReference} field. */
    public StdVideoDecodeH265PictureInfoFlags IsReference(@NativeType("uint32_t") boolean value) { nIsReference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
    public StdVideoDecodeH265PictureInfoFlags short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH265PictureInfoFlags set(
        boolean IrapPicFlag,
        boolean IdrPicFlag,
        boolean IsReference,
        boolean short_term_ref_pic_set_sps_flag
    ) {
        IrapPicFlag(IrapPicFlag);
        IdrPicFlag(IdrPicFlag);
        IsReference(IsReference);
        short_term_ref_pic_set_sps_flag(short_term_ref_pic_set_sps_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH265PictureInfoFlags set(StdVideoDecodeH265PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265PictureInfoFlags malloc() {
        return new StdVideoDecodeH265PictureInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265PictureInfoFlags calloc() {
        return new StdVideoDecodeH265PictureInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH265PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265PictureInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeH265PictureInfoFlags create(long address) {
        return new StdVideoDecodeH265PictureInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeH265PictureInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265PictureInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeH265PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH265PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #IrapPicFlag}. */
    public static int nIrapPicFlag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #IdrPicFlag}. */
    public static int nIdrPicFlag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #IsReference}. */
    public static int nIsReference(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag}. */
    public static int nshort_term_ref_pic_set_sps_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH265PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #IrapPicFlag(boolean) IrapPicFlag}. */
    public static void nIrapPicFlag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #IdrPicFlag(boolean) IdrPicFlag}. */
    public static void nIdrPicFlag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #IsReference(boolean) IsReference}. */
    public static void nIsReference(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #short_term_ref_pic_set_sps_flag(boolean) short_term_ref_pic_set_sps_flag}. */
    public static void nshort_term_ref_pic_set_sps_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH265PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeH265PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeH265PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH265PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH265PictureInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeH265PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code IrapPicFlag} field. */
        @NativeType("uint32_t")
        public boolean IrapPicFlag() { return StdVideoDecodeH265PictureInfoFlags.nIrapPicFlag(address()) != 0; }
        /** @return the value of the {@code IdrPicFlag} field. */
        @NativeType("uint32_t")
        public boolean IdrPicFlag() { return StdVideoDecodeH265PictureInfoFlags.nIdrPicFlag(address()) != 0; }
        /** @return the value of the {@code IsReference} field. */
        @NativeType("uint32_t")
        public boolean IsReference() { return StdVideoDecodeH265PictureInfoFlags.nIsReference(address()) != 0; }
        /** @return the value of the {@code short_term_ref_pic_set_sps_flag} field. */
        @NativeType("uint32_t")
        public boolean short_term_ref_pic_set_sps_flag() { return StdVideoDecodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address()) != 0; }

        /** Sets the specified value to the {@code IrapPicFlag} field. */
        public StdVideoDecodeH265PictureInfoFlags.Buffer IrapPicFlag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH265PictureInfoFlags.nIrapPicFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code IdrPicFlag} field. */
        public StdVideoDecodeH265PictureInfoFlags.Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH265PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code IsReference} field. */
        public StdVideoDecodeH265PictureInfoFlags.Buffer IsReference(@NativeType("uint32_t") boolean value) { StdVideoDecodeH265PictureInfoFlags.nIsReference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code short_term_ref_pic_set_sps_flag} field. */
        public StdVideoDecodeH265PictureInfoFlags.Buffer short_term_ref_pic_set_sps_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH265PictureInfoFlags.nshort_term_ref_pic_set_sps_flag(address(), value ? 1 : 0); return this; }

    }

}