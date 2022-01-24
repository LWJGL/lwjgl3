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
 * struct StdVideoEncodeH264RefListModEntry {
 *     StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc;
 *     uint16_t abs_diff_pic_num_minus1;
 *     uint16_t long_term_pic_num;
 * }</code></pre>
 */
public class StdVideoEncodeH264RefListModEntry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MODIFICATION_OF_PIC_NUMS_IDC,
        ABS_DIFF_PIC_NUM_MINUS1,
        LONG_TERM_PIC_NUM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MODIFICATION_OF_PIC_NUMS_IDC = layout.offsetof(0);
        ABS_DIFF_PIC_NUM_MINUS1 = layout.offsetof(1);
        LONG_TERM_PIC_NUM = layout.offsetof(2);
    }

    /**
     * Creates a {@code StdVideoEncodeH264RefListModEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264RefListModEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code modification_of_pic_nums_idc} field. */
    @NativeType("StdVideoH264ModificationOfPicNumsIdc")
    public int modification_of_pic_nums_idc() { return nmodification_of_pic_nums_idc(address()); }
    /** @return the value of the {@code abs_diff_pic_num_minus1} field. */
    @NativeType("uint16_t")
    public short abs_diff_pic_num_minus1() { return nabs_diff_pic_num_minus1(address()); }
    /** @return the value of the {@code long_term_pic_num} field. */
    @NativeType("uint16_t")
    public short long_term_pic_num() { return nlong_term_pic_num(address()); }

    /** Sets the specified value to the {@code modification_of_pic_nums_idc} field. */
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(@NativeType("StdVideoH264ModificationOfPicNumsIdc") int value) { nmodification_of_pic_nums_idc(address(), value); return this; }
    /** Sets the specified value to the {@code abs_diff_pic_num_minus1} field. */
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(@NativeType("uint16_t") short value) { nabs_diff_pic_num_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_pic_num} field. */
    public StdVideoEncodeH264RefListModEntry long_term_pic_num(@NativeType("uint16_t") short value) { nlong_term_pic_num(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264RefListModEntry set(
        int modification_of_pic_nums_idc,
        short abs_diff_pic_num_minus1,
        short long_term_pic_num
    ) {
        modification_of_pic_nums_idc(modification_of_pic_nums_idc);
        abs_diff_pic_num_minus1(abs_diff_pic_num_minus1);
        long_term_pic_num(long_term_pic_num);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264RefListModEntry set(StdVideoEncodeH264RefListModEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264RefListModEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefListModEntry malloc() {
        return wrap(StdVideoEncodeH264RefListModEntry.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefListModEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefListModEntry calloc() {
        return wrap(StdVideoEncodeH264RefListModEntry.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264RefListModEntry} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264RefListModEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264RefListModEntry.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264RefListModEntry} instance for the specified memory address. */
    public static StdVideoEncodeH264RefListModEntry create(long address) {
        return wrap(StdVideoEncodeH264RefListModEntry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefListModEntry createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264RefListModEntry.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefListModEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefListModEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefListModEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264RefListModEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264RefListModEntry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefListModEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefListModEntry malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefListModEntry.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefListModEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefListModEntry calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264RefListModEntry.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefListModEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefListModEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefListModEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #modification_of_pic_nums_idc}. */
    public static int nmodification_of_pic_nums_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264RefListModEntry.MODIFICATION_OF_PIC_NUMS_IDC); }
    /** Unsafe version of {@link #abs_diff_pic_num_minus1}. */
    public static short nabs_diff_pic_num_minus1(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264RefListModEntry.ABS_DIFF_PIC_NUM_MINUS1); }
    /** Unsafe version of {@link #long_term_pic_num}. */
    public static short nlong_term_pic_num(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264RefListModEntry.LONG_TERM_PIC_NUM); }

    /** Unsafe version of {@link #modification_of_pic_nums_idc(int) modification_of_pic_nums_idc}. */
    public static void nmodification_of_pic_nums_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264RefListModEntry.MODIFICATION_OF_PIC_NUMS_IDC, value); }
    /** Unsafe version of {@link #abs_diff_pic_num_minus1(short) abs_diff_pic_num_minus1}. */
    public static void nabs_diff_pic_num_minus1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264RefListModEntry.ABS_DIFF_PIC_NUM_MINUS1, value); }
    /** Unsafe version of {@link #long_term_pic_num(short) long_term_pic_num}. */
    public static void nlong_term_pic_num(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264RefListModEntry.LONG_TERM_PIC_NUM, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264RefListModEntry} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefListModEntry, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264RefListModEntry ELEMENT_FACTORY = StdVideoEncodeH264RefListModEntry.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264RefListModEntry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264RefListModEntry#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264RefListModEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code modification_of_pic_nums_idc} field. */
        @NativeType("StdVideoH264ModificationOfPicNumsIdc")
        public int modification_of_pic_nums_idc() { return StdVideoEncodeH264RefListModEntry.nmodification_of_pic_nums_idc(address()); }
        /** @return the value of the {@code abs_diff_pic_num_minus1} field. */
        @NativeType("uint16_t")
        public short abs_diff_pic_num_minus1() { return StdVideoEncodeH264RefListModEntry.nabs_diff_pic_num_minus1(address()); }
        /** @return the value of the {@code long_term_pic_num} field. */
        @NativeType("uint16_t")
        public short long_term_pic_num() { return StdVideoEncodeH264RefListModEntry.nlong_term_pic_num(address()); }

        /** Sets the specified value to the {@code modification_of_pic_nums_idc} field. */
        public StdVideoEncodeH264RefListModEntry.Buffer modification_of_pic_nums_idc(@NativeType("StdVideoH264ModificationOfPicNumsIdc") int value) { StdVideoEncodeH264RefListModEntry.nmodification_of_pic_nums_idc(address(), value); return this; }
        /** Sets the specified value to the {@code abs_diff_pic_num_minus1} field. */
        public StdVideoEncodeH264RefListModEntry.Buffer abs_diff_pic_num_minus1(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.nabs_diff_pic_num_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_pic_num} field. */
        public StdVideoEncodeH264RefListModEntry.Buffer long_term_pic_num(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefListModEntry.nlong_term_pic_num(address(), value); return this; }

    }

}