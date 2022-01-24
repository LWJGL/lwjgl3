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
 * struct StdVideoDecodeH264PictureInfoFlags {
 *     uint32_t {@link #field_pic_flag} : 1;
 *     uint32_t {@link #is_intra} : 1;
 *     uint32_t {@link #IdrPicFlag} : 1;
 *     uint32_t {@link #bottom_field_flag} : 1;
 *     uint32_t {@link #is_reference} : 1;
 *     uint32_t {@link #complementary_field_pair} : 1;
 * }</code></pre>
 */
public class StdVideoDecodeH264PictureInfoFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoDecodeH264PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** is field picture */
    @NativeType("uint32_t")
    public boolean field_pic_flag() { return nfield_pic_flag(address()) != 0; }
    /** is intra picture */
    @NativeType("uint32_t")
    public boolean is_intra() { return nis_intra(address()) != 0; }
    /** instantaneous decoding refresh (IDR) picture */
    @NativeType("uint32_t")
    public boolean IdrPicFlag() { return nIdrPicFlag(address()) != 0; }
    /** bottom (true) or top (false) field if field_pic_flag is set */
    @NativeType("uint32_t")
    public boolean bottom_field_flag() { return nbottom_field_flag(address()) != 0; }
    /** this only applies to picture info, and not to the DPB lists */
    @NativeType("uint32_t")
    public boolean is_reference() { return nis_reference(address()) != 0; }
    /** complementary field pair, complementary non-reference field pair, complementary reference field pair */
    @NativeType("uint32_t")
    public boolean complementary_field_pair() { return ncomplementary_field_pair(address()) != 0; }

    /** Sets the specified value to the {@link #field_pic_flag} field. */
    public StdVideoDecodeH264PictureInfoFlags field_pic_flag(@NativeType("uint32_t") boolean value) { nfield_pic_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #is_intra} field. */
    public StdVideoDecodeH264PictureInfoFlags is_intra(@NativeType("uint32_t") boolean value) { nis_intra(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #IdrPicFlag} field. */
    public StdVideoDecodeH264PictureInfoFlags IdrPicFlag(@NativeType("uint32_t") boolean value) { nIdrPicFlag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bottom_field_flag} field. */
    public StdVideoDecodeH264PictureInfoFlags bottom_field_flag(@NativeType("uint32_t") boolean value) { nbottom_field_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #is_reference} field. */
    public StdVideoDecodeH264PictureInfoFlags is_reference(@NativeType("uint32_t") boolean value) { nis_reference(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #complementary_field_pair} field. */
    public StdVideoDecodeH264PictureInfoFlags complementary_field_pair(@NativeType("uint32_t") boolean value) { ncomplementary_field_pair(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264PictureInfoFlags set(
        boolean field_pic_flag,
        boolean is_intra,
        boolean IdrPicFlag,
        boolean bottom_field_flag,
        boolean is_reference,
        boolean complementary_field_pair
    ) {
        field_pic_flag(field_pic_flag);
        is_intra(is_intra);
        IdrPicFlag(IdrPicFlag);
        bottom_field_flag(bottom_field_flag);
        is_reference(is_reference);
        complementary_field_pair(complementary_field_pair);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264PictureInfoFlags set(StdVideoDecodeH264PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264PictureInfoFlags malloc() {
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264PictureInfoFlags calloc() {
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeH264PictureInfoFlags create(long address) {
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264PictureInfoFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264PictureInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264PictureInfoFlags malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264PictureInfoFlags calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264PictureInfoFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH264PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #field_pic_flag}. */
    public static int nfield_pic_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #is_intra}. */
    public static int nis_intra(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #IdrPicFlag}. */
    public static int nIdrPicFlag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #bottom_field_flag}. */
    public static int nbottom_field_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #is_reference}. */
    public static int nis_reference(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #complementary_field_pair}. */
    public static int ncomplementary_field_pair(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH264PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #field_pic_flag(boolean) field_pic_flag}. */
    public static void nfield_pic_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #is_intra(boolean) is_intra}. */
    public static void nis_intra(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #IdrPicFlag(boolean) IdrPicFlag}. */
    public static void nIdrPicFlag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #bottom_field_flag(boolean) bottom_field_flag}. */
    public static void nbottom_field_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #is_reference(boolean) is_reference}. */
    public static void nis_reference(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #complementary_field_pair(boolean) complementary_field_pair}. */
    public static void ncomplementary_field_pair(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeH264PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264PictureInfoFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#field_pic_flag} field. */
        @NativeType("uint32_t")
        public boolean field_pic_flag() { return StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#is_intra} field. */
        @NativeType("uint32_t")
        public boolean is_intra() { return StdVideoDecodeH264PictureInfoFlags.nis_intra(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#IdrPicFlag} field. */
        @NativeType("uint32_t")
        public boolean IdrPicFlag() { return StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#bottom_field_flag} field. */
        @NativeType("uint32_t")
        public boolean bottom_field_flag() { return StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#is_reference} field. */
        @NativeType("uint32_t")
        public boolean is_reference() { return StdVideoDecodeH264PictureInfoFlags.nis_reference(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264PictureInfoFlags#complementary_field_pair} field. */
        @NativeType("uint32_t")
        public boolean complementary_field_pair() { return StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(address()) != 0; }

        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#field_pic_flag} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer field_pic_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.nfield_pic_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#is_intra} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer is_intra(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.nis_intra(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#IdrPicFlag} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer IdrPicFlag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.nIdrPicFlag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#bottom_field_flag} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer bottom_field_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.nbottom_field_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#is_reference} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer is_reference(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.nis_reference(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264PictureInfoFlags#complementary_field_pair} field. */
        public StdVideoDecodeH264PictureInfoFlags.Buffer complementary_field_pair(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264PictureInfoFlags.ncomplementary_field_pair(address(), value ? 1 : 0); return this; }

    }

}