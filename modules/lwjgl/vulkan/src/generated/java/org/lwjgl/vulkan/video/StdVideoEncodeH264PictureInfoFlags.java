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
 * struct StdVideoEncodeH264PictureInfoFlags {
 *     uint32_t IdrPicFlag : 1;
 *     uint32_t is_reference : 1;
 *     uint32_t no_output_of_prior_pics_flag : 1;
 *     uint32_t long_term_reference_flag : 1;
 *     uint32_t adaptive_ref_pic_marking_mode_flag : 1;
 *     uint32_t reserved : 27;
 * }</code></pre>
 */
public class StdVideoEncodeH264PictureInfoFlags extends Struct<StdVideoEncodeH264PictureInfoFlags> implements NativeResource {

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

    protected StdVideoEncodeH264PictureInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264PictureInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264PictureInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code IdrPicFlag} field. */
    @NativeType("uint32_t")
    public boolean IdrPicFlag() { return nIdrPicFlag(address()) != 0; }
    /** @return the value of the {@code is_reference} field. */
    @NativeType("uint32_t")
    public boolean is_reference() { return nis_reference(address()) != 0; }
    /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
    @NativeType("uint32_t")
    public boolean no_output_of_prior_pics_flag() { return nno_output_of_prior_pics_flag(address()) != 0; }
    /** @return the value of the {@code long_term_reference_flag} field. */
    @NativeType("uint32_t")
    public boolean long_term_reference_flag() { return nlong_term_reference_flag(address()) != 0; }
    /** @return the value of the {@code adaptive_ref_pic_marking_mode_flag} field. */
    @NativeType("uint32_t")
    public boolean adaptive_ref_pic_marking_mode_flag() { return nadaptive_ref_pic_marking_mode_flag(address()) != 0; }

    /** Sets the specified value to the {@code IdrPicFlag} field. */
    public StdVideoEncodeH264PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) { nIdrPicFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code is_reference} field. */
    public StdVideoEncodeH264PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) { nis_reference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
    public StdVideoEncodeH264PictureInfoFlags no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code long_term_reference_flag} field. */
    public StdVideoEncodeH264PictureInfoFlags long_term_reference_flag(@NativeType("uint32_t") boolean value) { nlong_term_reference_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code adaptive_ref_pic_marking_mode_flag} field. */
    public StdVideoEncodeH264PictureInfoFlags adaptive_ref_pic_marking_mode_flag(@NativeType("uint32_t") boolean value) { nadaptive_ref_pic_marking_mode_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264PictureInfoFlags set(
        boolean IdrPicFlag,
        boolean is_reference,
        boolean no_output_of_prior_pics_flag,
        boolean long_term_reference_flag,
        boolean adaptive_ref_pic_marking_mode_flag
    ) {
        IdrPicFlag(IdrPicFlag);
        is_reference(is_reference);
        no_output_of_prior_pics_flag(no_output_of_prior_pics_flag);
        long_term_reference_flag(long_term_reference_flag);
        adaptive_ref_pic_marking_mode_flag(adaptive_ref_pic_marking_mode_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264PictureInfoFlags set(StdVideoEncodeH264PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfoFlags malloc() {
        return new StdVideoEncodeH264PictureInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfoFlags calloc() {
        return new StdVideoEncodeH264PictureInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264PictureInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeH264PictureInfoFlags create(long address) {
        return new StdVideoEncodeH264PictureInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264PictureInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #IdrPicFlag}. */
    public static int nIdrPicFlag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #is_reference}. */
    public static int nis_reference(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag}. */
    public static int nno_output_of_prior_pics_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #long_term_reference_flag}. */
    public static int nlong_term_reference_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #adaptive_ref_pic_marking_mode_flag}. */
    public static int nadaptive_ref_pic_marking_mode_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    public static int nreserved(long struct) { return nbitfield0(struct) >>> 5; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #IdrPicFlag(boolean) IdrPicFlag}. */
    public static void nIdrPicFlag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #is_reference(boolean) is_reference}. */
    public static void nis_reference(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #no_output_of_prior_pics_flag(boolean) no_output_of_prior_pics_flag}. */
    public static void nno_output_of_prior_pics_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #long_term_reference_flag(boolean) long_term_reference_flag}. */
    public static void nlong_term_reference_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #adaptive_ref_pic_marking_mode_flag(boolean) adaptive_ref_pic_marking_mode_flag}. */
    public static void nadaptive_ref_pic_marking_mode_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    public static void nreserved(long struct, int value) { nbitfield0(struct, (value << 5) | (nbitfield0(struct) & 0x00_00_00_1F)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264PictureInfoFlags ELEMENT_FACTORY = StdVideoEncodeH264PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264PictureInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code IdrPicFlag} field. */
        @NativeType("uint32_t")
        public boolean IdrPicFlag() { return StdVideoEncodeH264PictureInfoFlags.nIdrPicFlag(address()) != 0; }
        /** @return the value of the {@code is_reference} field. */
        @NativeType("uint32_t")
        public boolean is_reference() { return StdVideoEncodeH264PictureInfoFlags.nis_reference(address()) != 0; }
        /** @return the value of the {@code no_output_of_prior_pics_flag} field. */
        @NativeType("uint32_t")
        public boolean no_output_of_prior_pics_flag() { return StdVideoEncodeH264PictureInfoFlags.nno_output_of_prior_pics_flag(address()) != 0; }
        /** @return the value of the {@code long_term_reference_flag} field. */
        @NativeType("uint32_t")
        public boolean long_term_reference_flag() { return StdVideoEncodeH264PictureInfoFlags.nlong_term_reference_flag(address()) != 0; }
        /** @return the value of the {@code adaptive_ref_pic_marking_mode_flag} field. */
        @NativeType("uint32_t")
        public boolean adaptive_ref_pic_marking_mode_flag() { return StdVideoEncodeH264PictureInfoFlags.nadaptive_ref_pic_marking_mode_flag(address()) != 0; }

        /** Sets the specified value to the {@code IdrPicFlag} field. */
        public StdVideoEncodeH264PictureInfoFlags.Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code is_reference} field. */
        public StdVideoEncodeH264PictureInfoFlags.Buffer is_reference(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264PictureInfoFlags.nis_reference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code no_output_of_prior_pics_flag} field. */
        public StdVideoEncodeH264PictureInfoFlags.Buffer no_output_of_prior_pics_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264PictureInfoFlags.nno_output_of_prior_pics_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code long_term_reference_flag} field. */
        public StdVideoEncodeH264PictureInfoFlags.Buffer long_term_reference_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264PictureInfoFlags.nlong_term_reference_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code adaptive_ref_pic_marking_mode_flag} field. */
        public StdVideoEncodeH264PictureInfoFlags.Buffer adaptive_ref_pic_marking_mode_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264PictureInfoFlags.nadaptive_ref_pic_marking_mode_flag(address(), value ? 1 : 0); return this; }

    }

}