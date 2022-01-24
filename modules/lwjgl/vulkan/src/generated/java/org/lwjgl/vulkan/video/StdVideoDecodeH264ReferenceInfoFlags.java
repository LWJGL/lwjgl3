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
 * struct StdVideoDecodeH264ReferenceInfoFlags {
 *     uint32_t {@link #top_field_flag} : 1;
 *     uint32_t {@link #bottom_field_flag} : 1;
 *     uint32_t {@link #is_long_term} : 1;
 *     uint32_t {@link #is_non_existing} : 1;
 * }</code></pre>
 */
public class StdVideoDecodeH264ReferenceInfoFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoDecodeH264ReferenceInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264ReferenceInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** reference is used for top field reference */
    @NativeType("uint32_t")
    public boolean top_field_flag() { return ntop_field_flag(address()) != 0; }
    /** reference is used for bottom field reference */
    @NativeType("uint32_t")
    public boolean bottom_field_flag() { return nbottom_field_flag(address()) != 0; }
    /** this is a long term reference */
    @NativeType("uint32_t")
    public boolean is_long_term() { return nis_long_term(address()) != 0; }
    /** must be handled in accordance with 8.2.5.2: Decoding process for gaps in frame_num */
    @NativeType("uint32_t")
    public boolean is_non_existing() { return nis_non_existing(address()) != 0; }

    /** Sets the specified value to the {@link #top_field_flag} field. */
    public StdVideoDecodeH264ReferenceInfoFlags top_field_flag(@NativeType("uint32_t") boolean value) { ntop_field_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bottom_field_flag} field. */
    public StdVideoDecodeH264ReferenceInfoFlags bottom_field_flag(@NativeType("uint32_t") boolean value) { nbottom_field_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #is_long_term} field. */
    public StdVideoDecodeH264ReferenceInfoFlags is_long_term(@NativeType("uint32_t") boolean value) { nis_long_term(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #is_non_existing} field. */
    public StdVideoDecodeH264ReferenceInfoFlags is_non_existing(@NativeType("uint32_t") boolean value) { nis_non_existing(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264ReferenceInfoFlags set(
        boolean top_field_flag,
        boolean bottom_field_flag,
        boolean is_long_term,
        boolean is_non_existing
    ) {
        top_field_flag(top_field_flag);
        bottom_field_flag(bottom_field_flag);
        is_long_term(is_long_term);
        is_non_existing(is_non_existing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264ReferenceInfoFlags set(StdVideoDecodeH264ReferenceInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264ReferenceInfoFlags malloc() {
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264ReferenceInfoFlags calloc() {
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264ReferenceInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeH264ReferenceInfoFlags create(long address) {
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264ReferenceInfoFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264ReferenceInfoFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264ReferenceInfoFlags malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264ReferenceInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264ReferenceInfoFlags calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264ReferenceInfoFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH264ReferenceInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #top_field_flag}. */
    public static int ntop_field_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #bottom_field_flag}. */
    public static int nbottom_field_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #is_long_term}. */
    public static int nis_long_term(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #is_non_existing}. */
    public static int nis_non_existing(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH264ReferenceInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #top_field_flag(boolean) top_field_flag}. */
    public static void ntop_field_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #bottom_field_flag(boolean) bottom_field_flag}. */
    public static void nbottom_field_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #is_long_term(boolean) is_long_term}. */
    public static void nis_long_term(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #is_non_existing(boolean) is_non_existing}. */
    public static void nis_non_existing(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264ReferenceInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264ReferenceInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264ReferenceInfoFlags ELEMENT_FACTORY = StdVideoDecodeH264ReferenceInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264ReferenceInfoFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264ReferenceInfoFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264ReferenceInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfoFlags#top_field_flag} field. */
        @NativeType("uint32_t")
        public boolean top_field_flag() { return StdVideoDecodeH264ReferenceInfoFlags.ntop_field_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfoFlags#bottom_field_flag} field. */
        @NativeType("uint32_t")
        public boolean bottom_field_flag() { return StdVideoDecodeH264ReferenceInfoFlags.nbottom_field_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfoFlags#is_long_term} field. */
        @NativeType("uint32_t")
        public boolean is_long_term() { return StdVideoDecodeH264ReferenceInfoFlags.nis_long_term(address()) != 0; }
        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfoFlags#is_non_existing} field. */
        @NativeType("uint32_t")
        public boolean is_non_existing() { return StdVideoDecodeH264ReferenceInfoFlags.nis_non_existing(address()) != 0; }

        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfoFlags#top_field_flag} field. */
        public StdVideoDecodeH264ReferenceInfoFlags.Buffer top_field_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264ReferenceInfoFlags.ntop_field_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfoFlags#bottom_field_flag} field. */
        public StdVideoDecodeH264ReferenceInfoFlags.Buffer bottom_field_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264ReferenceInfoFlags.nbottom_field_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfoFlags#is_long_term} field. */
        public StdVideoDecodeH264ReferenceInfoFlags.Buffer is_long_term(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264ReferenceInfoFlags.nis_long_term(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfoFlags#is_non_existing} field. */
        public StdVideoDecodeH264ReferenceInfoFlags.Buffer is_non_existing(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264ReferenceInfoFlags.nis_non_existing(address(), value ? 1 : 0); return this; }

    }

}