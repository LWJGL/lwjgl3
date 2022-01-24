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
 * struct StdVideoEncodeH265PictureInfoFlags {
 *     uint32_t is_reference_flag : 1;
 *     uint32_t IrapPicFlag : 1;
 *     uint32_t long_term_flag : 1;
 * }</code></pre>
 */
public class StdVideoEncodeH265PictureInfoFlags extends Struct implements NativeResource {

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

    /**
     * Creates a {@code StdVideoEncodeH265PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code is_reference_flag} field. */
    @NativeType("uint32_t")
    public int is_reference_flag() { return nis_reference_flag(address()); }
    /** @return the value of the {@code IrapPicFlag} field. */
    @NativeType("uint32_t")
    public int IrapPicFlag() { return nIrapPicFlag(address()); }
    /** @return the value of the {@code long_term_flag} field. */
    @NativeType("uint32_t")
    public int long_term_flag() { return nlong_term_flag(address()); }

    /** Sets the specified value to the {@code is_reference_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags is_reference_flag(@NativeType("uint32_t") int value) { nis_reference_flag(address(), value); return this; }
    /** Sets the specified value to the {@code IrapPicFlag} field. */
    public StdVideoEncodeH265PictureInfoFlags IrapPicFlag(@NativeType("uint32_t") int value) { nIrapPicFlag(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_flag} field. */
    public StdVideoEncodeH265PictureInfoFlags long_term_flag(@NativeType("uint32_t") int value) { nlong_term_flag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265PictureInfoFlags set(
        int is_reference_flag,
        int IrapPicFlag,
        int long_term_flag
    ) {
        is_reference_flag(is_reference_flag);
        IrapPicFlag(IrapPicFlag);
        long_term_flag(long_term_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265PictureInfoFlags set(StdVideoEncodeH265PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfoFlags malloc() {
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265PictureInfoFlags calloc() {
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265PictureInfoFlags create(long address) {
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH265PictureInfoFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265PictureInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfoFlags malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH265PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265PictureInfoFlags calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH265PictureInfoFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #is_reference_flag}. */
    public static int nis_reference_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #IrapPicFlag}. */
    public static int nIrapPicFlag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #long_term_flag}. */
    public static int nlong_term_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #is_reference_flag(int) is_reference_flag}. */
    public static void nis_reference_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #IrapPicFlag(int) IrapPicFlag}. */
    public static void nIrapPicFlag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #long_term_flag(int) long_term_flag}. */
    public static void nlong_term_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeH265PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265PictureInfoFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH265PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code is_reference_flag} field. */
        @NativeType("uint32_t")
        public int is_reference_flag() { return StdVideoEncodeH265PictureInfoFlags.nis_reference_flag(address()); }
        /** @return the value of the {@code IrapPicFlag} field. */
        @NativeType("uint32_t")
        public int IrapPicFlag() { return StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address()); }
        /** @return the value of the {@code long_term_flag} field. */
        @NativeType("uint32_t")
        public int long_term_flag() { return StdVideoEncodeH265PictureInfoFlags.nlong_term_flag(address()); }

        /** Sets the specified value to the {@code is_reference_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer is_reference_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265PictureInfoFlags.nis_reference_flag(address(), value); return this; }
        /** Sets the specified value to the {@code IrapPicFlag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer IrapPicFlag(@NativeType("uint32_t") int value) { StdVideoEncodeH265PictureInfoFlags.nIrapPicFlag(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_flag} field. */
        public StdVideoEncodeH265PictureInfoFlags.Buffer long_term_flag(@NativeType("uint32_t") int value) { StdVideoEncodeH265PictureInfoFlags.nlong_term_flag(address(), value); return this; }

    }

}