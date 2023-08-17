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
 * struct StdVideoEncodeH265ReferenceModificationFlags {
 *     uint32_t ref_pic_list_modification_flag_l0 : 1;
 *     uint32_t ref_pic_list_modification_flag_l1 : 1;
 *     uint32_t reserved : 30;
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceModificationFlags extends Struct<StdVideoEncodeH265ReferenceModificationFlags> implements NativeResource {

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

    protected StdVideoEncodeH265ReferenceModificationFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265ReferenceModificationFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceModificationFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265ReferenceModificationFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265ReferenceModificationFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ref_pic_list_modification_flag_l0} field. */
    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_flag_l0() { return nref_pic_list_modification_flag_l0(address()) != 0; }
    /** @return the value of the {@code ref_pic_list_modification_flag_l1} field. */
    @NativeType("uint32_t")
    public boolean ref_pic_list_modification_flag_l1() { return nref_pic_list_modification_flag_l1(address()) != 0; }

    /** Sets the specified value to the {@code ref_pic_list_modification_flag_l0} field. */
    public StdVideoEncodeH265ReferenceModificationFlags ref_pic_list_modification_flag_l0(@NativeType("uint32_t") boolean value) { nref_pic_list_modification_flag_l0(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code ref_pic_list_modification_flag_l1} field. */
    public StdVideoEncodeH265ReferenceModificationFlags ref_pic_list_modification_flag_l1(@NativeType("uint32_t") boolean value) { nref_pic_list_modification_flag_l1(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceModificationFlags set(
        boolean ref_pic_list_modification_flag_l0,
        boolean ref_pic_list_modification_flag_l1
    ) {
        ref_pic_list_modification_flag_l0(ref_pic_list_modification_flag_l0);
        ref_pic_list_modification_flag_l1(ref_pic_list_modification_flag_l1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265ReferenceModificationFlags set(StdVideoEncodeH265ReferenceModificationFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModificationFlags malloc() {
        return new StdVideoEncodeH265ReferenceModificationFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceModificationFlags calloc() {
        return new StdVideoEncodeH265ReferenceModificationFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceModificationFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceModificationFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceModificationFlags create(long address) {
        return new StdVideoEncodeH265ReferenceModificationFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModificationFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265ReferenceModificationFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModificationFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModificationFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceModificationFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceModificationFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceModificationFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceModificationFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265ReferenceModificationFlags.BITFIELD0); }
    /** Unsafe version of {@link #ref_pic_list_modification_flag_l0}. */
    public static int nref_pic_list_modification_flag_l0(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #ref_pic_list_modification_flag_l1}. */
    public static int nref_pic_list_modification_flag_l1(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nreserved(long struct) { return nbitfield0(struct) >>> 2; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265ReferenceModificationFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #ref_pic_list_modification_flag_l0(boolean) ref_pic_list_modification_flag_l0}. */
    public static void nref_pic_list_modification_flag_l0(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #ref_pic_list_modification_flag_l1(boolean) ref_pic_list_modification_flag_l1}. */
    public static void nref_pic_list_modification_flag_l1(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nreserved(long struct, int value) { nbitfield0(struct, (value << 2) | (nbitfield0(struct) & 0x00_00_00_03)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceModificationFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceModificationFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceModificationFlags ELEMENT_FACTORY = StdVideoEncodeH265ReferenceModificationFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceModificationFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceModificationFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265ReferenceModificationFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ref_pic_list_modification_flag_l0} field. */
        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_flag_l0() { return StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l0(address()) != 0; }
        /** @return the value of the {@code ref_pic_list_modification_flag_l1} field. */
        @NativeType("uint32_t")
        public boolean ref_pic_list_modification_flag_l1() { return StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l1(address()) != 0; }

        /** Sets the specified value to the {@code ref_pic_list_modification_flag_l0} field. */
        public StdVideoEncodeH265ReferenceModificationFlags.Buffer ref_pic_list_modification_flag_l0(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l0(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code ref_pic_list_modification_flag_l1} field. */
        public StdVideoEncodeH265ReferenceModificationFlags.Buffer ref_pic_list_modification_flag_l1(@NativeType("uint32_t") boolean value) { StdVideoEncodeH265ReferenceModificationFlags.nref_pic_list_modification_flag_l1(address(), value ? 1 : 0); return this; }

    }

}