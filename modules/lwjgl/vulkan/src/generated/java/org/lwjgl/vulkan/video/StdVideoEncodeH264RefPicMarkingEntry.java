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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264RefPicMarkingEntry {
 *     StdVideoH264MemMgmtControlOp memory_management_control_operation;
 *     uint16_t difference_of_pic_nums_minus1;
 *     uint16_t long_term_pic_num;
 *     uint16_t long_term_frame_idx;
 *     uint16_t max_long_term_frame_idx_plus1;
 * }</code></pre>
 */
public class StdVideoEncodeH264RefPicMarkingEntry extends Struct<StdVideoEncodeH264RefPicMarkingEntry> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORY_MANAGEMENT_CONTROL_OPERATION,
        DIFFERENCE_OF_PIC_NUMS_MINUS1,
        LONG_TERM_PIC_NUM,
        LONG_TERM_FRAME_IDX,
        MAX_LONG_TERM_FRAME_IDX_PLUS1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORY_MANAGEMENT_CONTROL_OPERATION = layout.offsetof(0);
        DIFFERENCE_OF_PIC_NUMS_MINUS1 = layout.offsetof(1);
        LONG_TERM_PIC_NUM = layout.offsetof(2);
        LONG_TERM_FRAME_IDX = layout.offsetof(3);
        MAX_LONG_TERM_FRAME_IDX_PLUS1 = layout.offsetof(4);
    }

    protected StdVideoEncodeH264RefPicMarkingEntry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264RefPicMarkingEntry create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264RefPicMarkingEntry(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264RefPicMarkingEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264RefPicMarkingEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code memory_management_control_operation} field. */
    @NativeType("StdVideoH264MemMgmtControlOp")
    public int memory_management_control_operation() { return nmemory_management_control_operation(address()); }
    /** @return the value of the {@code difference_of_pic_nums_minus1} field. */
    @NativeType("uint16_t")
    public short difference_of_pic_nums_minus1() { return ndifference_of_pic_nums_minus1(address()); }
    /** @return the value of the {@code long_term_pic_num} field. */
    @NativeType("uint16_t")
    public short long_term_pic_num() { return nlong_term_pic_num(address()); }
    /** @return the value of the {@code long_term_frame_idx} field. */
    @NativeType("uint16_t")
    public short long_term_frame_idx() { return nlong_term_frame_idx(address()); }
    /** @return the value of the {@code max_long_term_frame_idx_plus1} field. */
    @NativeType("uint16_t")
    public short max_long_term_frame_idx_plus1() { return nmax_long_term_frame_idx_plus1(address()); }

    /** Sets the specified value to the {@code memory_management_control_operation} field. */
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(@NativeType("StdVideoH264MemMgmtControlOp") int value) { nmemory_management_control_operation(address(), value); return this; }
    /** Sets the specified value to the {@code difference_of_pic_nums_minus1} field. */
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(@NativeType("uint16_t") short value) { ndifference_of_pic_nums_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_pic_num} field. */
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(@NativeType("uint16_t") short value) { nlong_term_pic_num(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_frame_idx} field. */
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(@NativeType("uint16_t") short value) { nlong_term_frame_idx(address(), value); return this; }
    /** Sets the specified value to the {@code max_long_term_frame_idx_plus1} field. */
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(@NativeType("uint16_t") short value) { nmax_long_term_frame_idx_plus1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264RefPicMarkingEntry set(
        int memory_management_control_operation,
        short difference_of_pic_nums_minus1,
        short long_term_pic_num,
        short long_term_frame_idx,
        short max_long_term_frame_idx_plus1
    ) {
        memory_management_control_operation(memory_management_control_operation);
        difference_of_pic_nums_minus1(difference_of_pic_nums_minus1);
        long_term_pic_num(long_term_pic_num);
        long_term_frame_idx(long_term_frame_idx);
        max_long_term_frame_idx_plus1(max_long_term_frame_idx_plus1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264RefPicMarkingEntry set(StdVideoEncodeH264RefPicMarkingEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefPicMarkingEntry malloc() {
        return new StdVideoEncodeH264RefPicMarkingEntry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264RefPicMarkingEntry calloc() {
        return new StdVideoEncodeH264RefPicMarkingEntry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264RefPicMarkingEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264RefPicMarkingEntry(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance for the specified memory address. */
    public static StdVideoEncodeH264RefPicMarkingEntry create(long address) {
        return new StdVideoEncodeH264RefPicMarkingEntry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeH264RefPicMarkingEntry createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264RefPicMarkingEntry(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeH264RefPicMarkingEntry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefPicMarkingEntry malloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefPicMarkingEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264RefPicMarkingEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264RefPicMarkingEntry calloc(MemoryStack stack) {
        return new StdVideoEncodeH264RefPicMarkingEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264RefPicMarkingEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memory_management_control_operation}. */
    public static int nmemory_management_control_operation(long struct) { return memGetInt(struct + StdVideoEncodeH264RefPicMarkingEntry.MEMORY_MANAGEMENT_CONTROL_OPERATION); }
    /** Unsafe version of {@link #difference_of_pic_nums_minus1}. */
    public static short ndifference_of_pic_nums_minus1(long struct) { return memGetShort(struct + StdVideoEncodeH264RefPicMarkingEntry.DIFFERENCE_OF_PIC_NUMS_MINUS1); }
    /** Unsafe version of {@link #long_term_pic_num}. */
    public static short nlong_term_pic_num(long struct) { return memGetShort(struct + StdVideoEncodeH264RefPicMarkingEntry.LONG_TERM_PIC_NUM); }
    /** Unsafe version of {@link #long_term_frame_idx}. */
    public static short nlong_term_frame_idx(long struct) { return memGetShort(struct + StdVideoEncodeH264RefPicMarkingEntry.LONG_TERM_FRAME_IDX); }
    /** Unsafe version of {@link #max_long_term_frame_idx_plus1}. */
    public static short nmax_long_term_frame_idx_plus1(long struct) { return memGetShort(struct + StdVideoEncodeH264RefPicMarkingEntry.MAX_LONG_TERM_FRAME_IDX_PLUS1); }

    /** Unsafe version of {@link #memory_management_control_operation(int) memory_management_control_operation}. */
    public static void nmemory_management_control_operation(long struct, int value) { memPutInt(struct + StdVideoEncodeH264RefPicMarkingEntry.MEMORY_MANAGEMENT_CONTROL_OPERATION, value); }
    /** Unsafe version of {@link #difference_of_pic_nums_minus1(short) difference_of_pic_nums_minus1}. */
    public static void ndifference_of_pic_nums_minus1(long struct, short value) { memPutShort(struct + StdVideoEncodeH264RefPicMarkingEntry.DIFFERENCE_OF_PIC_NUMS_MINUS1, value); }
    /** Unsafe version of {@link #long_term_pic_num(short) long_term_pic_num}. */
    public static void nlong_term_pic_num(long struct, short value) { memPutShort(struct + StdVideoEncodeH264RefPicMarkingEntry.LONG_TERM_PIC_NUM, value); }
    /** Unsafe version of {@link #long_term_frame_idx(short) long_term_frame_idx}. */
    public static void nlong_term_frame_idx(long struct, short value) { memPutShort(struct + StdVideoEncodeH264RefPicMarkingEntry.LONG_TERM_FRAME_IDX, value); }
    /** Unsafe version of {@link #max_long_term_frame_idx_plus1(short) max_long_term_frame_idx_plus1}. */
    public static void nmax_long_term_frame_idx_plus1(long struct, short value) { memPutShort(struct + StdVideoEncodeH264RefPicMarkingEntry.MAX_LONG_TERM_FRAME_IDX_PLUS1, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264RefPicMarkingEntry} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264RefPicMarkingEntry, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264RefPicMarkingEntry ELEMENT_FACTORY = StdVideoEncodeH264RefPicMarkingEntry.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264RefPicMarkingEntry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264RefPicMarkingEntry#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264RefPicMarkingEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code memory_management_control_operation} field. */
        @NativeType("StdVideoH264MemMgmtControlOp")
        public int memory_management_control_operation() { return StdVideoEncodeH264RefPicMarkingEntry.nmemory_management_control_operation(address()); }
        /** @return the value of the {@code difference_of_pic_nums_minus1} field. */
        @NativeType("uint16_t")
        public short difference_of_pic_nums_minus1() { return StdVideoEncodeH264RefPicMarkingEntry.ndifference_of_pic_nums_minus1(address()); }
        /** @return the value of the {@code long_term_pic_num} field. */
        @NativeType("uint16_t")
        public short long_term_pic_num() { return StdVideoEncodeH264RefPicMarkingEntry.nlong_term_pic_num(address()); }
        /** @return the value of the {@code long_term_frame_idx} field. */
        @NativeType("uint16_t")
        public short long_term_frame_idx() { return StdVideoEncodeH264RefPicMarkingEntry.nlong_term_frame_idx(address()); }
        /** @return the value of the {@code max_long_term_frame_idx_plus1} field. */
        @NativeType("uint16_t")
        public short max_long_term_frame_idx_plus1() { return StdVideoEncodeH264RefPicMarkingEntry.nmax_long_term_frame_idx_plus1(address()); }

        /** Sets the specified value to the {@code memory_management_control_operation} field. */
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer memory_management_control_operation(@NativeType("StdVideoH264MemMgmtControlOp") int value) { StdVideoEncodeH264RefPicMarkingEntry.nmemory_management_control_operation(address(), value); return this; }
        /** Sets the specified value to the {@code difference_of_pic_nums_minus1} field. */
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer difference_of_pic_nums_minus1(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.ndifference_of_pic_nums_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_pic_num} field. */
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer long_term_pic_num(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.nlong_term_pic_num(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_frame_idx} field. */
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer long_term_frame_idx(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.nlong_term_frame_idx(address(), value); return this; }
        /** Sets the specified value to the {@code max_long_term_frame_idx_plus1} field. */
        public StdVideoEncodeH264RefPicMarkingEntry.Buffer max_long_term_frame_idx_plus1(@NativeType("uint16_t") short value) { StdVideoEncodeH264RefPicMarkingEntry.nmax_long_term_frame_idx_plus1(address(), value); return this; }

    }

}