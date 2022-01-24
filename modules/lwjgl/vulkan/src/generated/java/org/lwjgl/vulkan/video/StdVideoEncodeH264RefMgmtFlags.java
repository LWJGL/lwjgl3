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
 * struct StdVideoEncodeH264RefMgmtFlags {
 *     uint32_t ref_pic_list_modification_l0_flag : 1;
 *     uint32_t ref_pic_list_modification_l1_flag : 1;
 * }</code></pre>
 */
public class StdVideoEncodeH264RefMgmtFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoEncodeH264RefMgmtFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264RefMgmtFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ref_pic_list_modification_l0_flag} field. */
    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_l0_flag() { return nref_pic_list_modification_l0_flag(address()) != 0; }
    /** @return the value of the {@code ref_pic_list_modification_l1_flag} field. */
    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_l1_flag() { return nref_pic_list_modification_l1_flag(address()) != 0; }

    /** Sets the specified value to the {@code ref_pic_list_modification_l0_flag} field. */
    public StdVideoEncodeH264RefMgmtFlags ref_pic_list_modification_l0_flag(@NativeType("uint32_t") boolean value) { nref_pic_list_modification_l0_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code ref_pic_list_modification_l1_flag} field. */
    public StdVideoEncodeH264RefMgmtFlags ref_pic_list_modification_l1_flag(@NativeType("uint32_t") boolean value) { nref_pic_list_modification_l1_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264RefMgmtFlags set(
        boolean ref_pic_list_modification_l0_flag,
        boolean ref_pic_list_modification_l1_flag
    ) {
        ref_pic_list_modification_l0_flag(ref_pic_list_modification_l0_flag);
        ref_pic_list_modification_l1_flag(ref_pic_list_modification_l1_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264RefMgmtFlags set(StdVideoEncodeH264RefMgmtFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefMgmtFlags malloc() {
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefMgmtFlags calloc() {
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264RefMgmtFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance for the specified memory address. */
    public static StdVideoEncodeH264RefMgmtFlags create(long address) {
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefMgmtFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264RefMgmtFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefMgmtFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefMgmtFlags malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefMgmtFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefMgmtFlags calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefMgmtFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefMgmtFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefMgmtFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264RefMgmtFlags.BITFIELD0); }
    /** Unsafe version of {@link #ref_pic_list_modification_l0_flag}. */
    public static int nref_pic_list_modification_l0_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #ref_pic_list_modification_l1_flag}. */
    public static int nref_pic_list_modification_l1_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264RefMgmtFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #ref_pic_list_modification_l0_flag(boolean) ref_pic_list_modification_l0_flag}. */
    public static void nref_pic_list_modification_l0_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #ref_pic_list_modification_l1_flag(boolean) ref_pic_list_modification_l1_flag}. */
    public static void nref_pic_list_modification_l1_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264RefMgmtFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefMgmtFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264RefMgmtFlags ELEMENT_FACTORY = StdVideoEncodeH264RefMgmtFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264RefMgmtFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264RefMgmtFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264RefMgmtFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ref_pic_list_modification_l0_flag} field. */
        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_l0_flag() { return StdVideoEncodeH264RefMgmtFlags.nref_pic_list_modification_l0_flag(address()) != 0; }
        /** @return the value of the {@code ref_pic_list_modification_l1_flag} field. */
        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_l1_flag() { return StdVideoEncodeH264RefMgmtFlags.nref_pic_list_modification_l1_flag(address()) != 0; }

        /** Sets the specified value to the {@code ref_pic_list_modification_l0_flag} field. */
        public StdVideoEncodeH264RefMgmtFlags.Buffer ref_pic_list_modification_l0_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264RefMgmtFlags.nref_pic_list_modification_l0_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code ref_pic_list_modification_l1_flag} field. */
        public StdVideoEncodeH264RefMgmtFlags.Buffer ref_pic_list_modification_l1_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264RefMgmtFlags.nref_pic_list_modification_l1_flag(address(), value ? 1 : 0); return this; }

    }

}