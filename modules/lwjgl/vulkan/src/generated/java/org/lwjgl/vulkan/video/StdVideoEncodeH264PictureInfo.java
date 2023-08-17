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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264PictureInfo {
 *     {@link StdVideoEncodeH264PictureInfoFlags StdVideoEncodeH264PictureInfoFlags} flags;
 *     uint8_t seq_parameter_set_id;
 *     uint8_t pic_parameter_set_id;
 *     uint16_t idr_pic_id;
 *     StdVideoH264PictureType primary_pic_type;
 *     uint32_t frame_num;
 *     int32_t PicOrderCnt;
 *     uint8_t temporal_id;
 *     uint8_t reserved1[3];
 *     {@link StdVideoEncodeH264ReferenceListsInfo StdVideoEncodeH264ReferenceListsInfo} const * pRefLists;
 * }</code></pre>
 */
public class StdVideoEncodeH264PictureInfo extends Struct<StdVideoEncodeH264PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        SEQ_PARAMETER_SET_ID,
        PIC_PARAMETER_SET_ID,
        IDR_PIC_ID,
        PRIMARY_PIC_TYPE,
        FRAME_NUM,
        PICORDERCNT,
        TEMPORAL_ID,
        RESERVED1,
        PREFLISTS;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264PictureInfoFlags.SIZEOF, StdVideoEncodeH264PictureInfoFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __array(1, 3),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PIC_PARAMETER_SET_ID = layout.offsetof(2);
        IDR_PIC_ID = layout.offsetof(3);
        PRIMARY_PIC_TYPE = layout.offsetof(4);
        FRAME_NUM = layout.offsetof(5);
        PICORDERCNT = layout.offsetof(6);
        TEMPORAL_ID = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLISTS = layout.offsetof(9);
    }

    protected StdVideoEncodeH264PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264PictureInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte seq_parameter_set_id() { return nseq_parameter_set_id(address()); }
    /** @return the value of the {@code pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pic_parameter_set_id() { return npic_parameter_set_id(address()); }
    /** @return the value of the {@code idr_pic_id} field. */
    @NativeType("uint16_t")
    public short idr_pic_id() { return nidr_pic_id(address()); }
    /** @return the value of the {@code primary_pic_type} field. */
    @NativeType("StdVideoH264PictureType")
    public int primary_pic_type() { return nprimary_pic_type(address()); }
    /** @return the value of the {@code frame_num} field. */
    @NativeType("uint32_t")
    public int frame_num() { return nframe_num(address()); }
    /** @return the value of the {@code PicOrderCnt} field. */
    @NativeType("int32_t")
    public int PicOrderCnt() { return nPicOrderCnt(address()); }
    /** @return the value of the {@code temporal_id} field. */
    @NativeType("uint8_t")
    public byte temporal_id() { return ntemporal_id(address()); }
    /** @return a {@link StdVideoEncodeH264ReferenceListsInfo} view of the struct pointed to by the {@code pRefLists} field. */
    @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
    public StdVideoEncodeH264ReferenceListsInfo pRefLists() { return npRefLists(address()); }

    /** Copies the specified {@link StdVideoEncodeH264PictureInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264PictureInfo flags(StdVideoEncodeH264PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264PictureInfo flags(java.util.function.Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code seq_parameter_set_id} field. */
    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(@NativeType("uint8_t") byte value) { nseq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pic_parameter_set_id} field. */
    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(@NativeType("uint8_t") byte value) { npic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code idr_pic_id} field. */
    public StdVideoEncodeH264PictureInfo idr_pic_id(@NativeType("uint16_t") short value) { nidr_pic_id(address(), value); return this; }
    /** Sets the specified value to the {@code primary_pic_type} field. */
    public StdVideoEncodeH264PictureInfo primary_pic_type(@NativeType("StdVideoH264PictureType") int value) { nprimary_pic_type(address(), value); return this; }
    /** Sets the specified value to the {@code frame_num} field. */
    public StdVideoEncodeH264PictureInfo frame_num(@NativeType("uint32_t") int value) { nframe_num(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCnt} field. */
    public StdVideoEncodeH264PictureInfo PicOrderCnt(@NativeType("int32_t") int value) { nPicOrderCnt(address(), value); return this; }
    /** Sets the specified value to the {@code temporal_id} field. */
    public StdVideoEncodeH264PictureInfo temporal_id(@NativeType("uint8_t") byte value) { ntemporal_id(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceListsInfo} to the {@code pRefLists} field. */
    public StdVideoEncodeH264PictureInfo pRefLists(@NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) { npRefLists(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264PictureInfo set(
        StdVideoEncodeH264PictureInfoFlags flags,
        byte seq_parameter_set_id,
        byte pic_parameter_set_id,
        short idr_pic_id,
        int primary_pic_type,
        int frame_num,
        int PicOrderCnt,
        byte temporal_id,
        StdVideoEncodeH264ReferenceListsInfo pRefLists
    ) {
        flags(flags);
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        idr_pic_id(idr_pic_id);
        primary_pic_type(primary_pic_type);
        frame_num(frame_num);
        PicOrderCnt(PicOrderCnt);
        temporal_id(temporal_id);
        pRefLists(pRefLists);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264PictureInfo set(StdVideoEncodeH264PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfo malloc() {
        return new StdVideoEncodeH264PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfo calloc() {
        return new StdVideoEncodeH264PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264PictureInfo create(long address) {
        return new StdVideoEncodeH264PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264PictureInfoFlags nflags(long struct) { return StdVideoEncodeH264PictureInfoFlags.create(struct + StdVideoEncodeH264PictureInfo.FLAGS); }
    /** Unsafe version of {@link #seq_parameter_set_id}. */
    public static byte nseq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264PictureInfo.SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pic_parameter_set_id}. */
    public static byte npic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264PictureInfo.PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #idr_pic_id}. */
    public static short nidr_pic_id(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264PictureInfo.IDR_PIC_ID); }
    /** Unsafe version of {@link #primary_pic_type}. */
    public static int nprimary_pic_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.PRIMARY_PIC_TYPE); }
    /** Unsafe version of {@link #frame_num}. */
    public static int nframe_num(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.FRAME_NUM); }
    /** Unsafe version of {@link #PicOrderCnt}. */
    public static int nPicOrderCnt(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.PICORDERCNT); }
    /** Unsafe version of {@link #temporal_id}. */
    public static byte ntemporal_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264PictureInfo.TEMPORAL_ID); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264PictureInfo.RESERVED1, 3); }
    public static byte nreserved1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264PictureInfo.RESERVED1 + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #pRefLists}. */
    public static StdVideoEncodeH264ReferenceListsInfo npRefLists(long struct) { return StdVideoEncodeH264ReferenceListsInfo.create(memGetAddress(struct + StdVideoEncodeH264PictureInfo.PREFLISTS)); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264PictureInfo.FLAGS, StdVideoEncodeH264PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #seq_parameter_set_id(byte) seq_parameter_set_id}. */
    public static void nseq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264PictureInfo.SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pic_parameter_set_id(byte) pic_parameter_set_id}. */
    public static void npic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264PictureInfo.PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #idr_pic_id(short) idr_pic_id}. */
    public static void nidr_pic_id(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264PictureInfo.IDR_PIC_ID, value); }
    /** Unsafe version of {@link #primary_pic_type(int) primary_pic_type}. */
    public static void nprimary_pic_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.PRIMARY_PIC_TYPE, value); }
    /** Unsafe version of {@link #frame_num(int) frame_num}. */
    public static void nframe_num(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.FRAME_NUM, value); }
    /** Unsafe version of {@link #PicOrderCnt(int) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.PICORDERCNT, value); }
    /** Unsafe version of {@link #temporal_id(byte) temporal_id}. */
    public static void ntemporal_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264PictureInfo.TEMPORAL_ID, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264PictureInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264PictureInfo.RESERVED1 + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #pRefLists(StdVideoEncodeH264ReferenceListsInfo) pRefLists}. */
    public static void npRefLists(long struct, StdVideoEncodeH264ReferenceListsInfo value) { memPutAddress(struct + StdVideoEncodeH264PictureInfo.PREFLISTS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pRefLists = memGetAddress(struct + StdVideoEncodeH264PictureInfo.PREFLISTS);
        check(pRefLists);
        StdVideoEncodeH264ReferenceListsInfo.validate(pRefLists);
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264PictureInfo ELEMENT_FACTORY = StdVideoEncodeH264PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264PictureInfoFlags flags() { return StdVideoEncodeH264PictureInfo.nflags(address()); }
        /** @return the value of the {@code seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte seq_parameter_set_id() { return StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(address()); }
        /** @return the value of the {@code pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pic_parameter_set_id() { return StdVideoEncodeH264PictureInfo.npic_parameter_set_id(address()); }
        /** @return the value of the {@code idr_pic_id} field. */
        @NativeType("uint16_t")
        public short idr_pic_id() { return StdVideoEncodeH264PictureInfo.nidr_pic_id(address()); }
        /** @return the value of the {@code primary_pic_type} field. */
        @NativeType("StdVideoH264PictureType")
        public int primary_pic_type() { return StdVideoEncodeH264PictureInfo.nprimary_pic_type(address()); }
        /** @return the value of the {@code frame_num} field. */
        @NativeType("uint32_t")
        public int frame_num() { return StdVideoEncodeH264PictureInfo.nframe_num(address()); }
        /** @return the value of the {@code PicOrderCnt} field. */
        @NativeType("int32_t")
        public int PicOrderCnt() { return StdVideoEncodeH264PictureInfo.nPicOrderCnt(address()); }
        /** @return the value of the {@code temporal_id} field. */
        @NativeType("uint8_t")
        public byte temporal_id() { return StdVideoEncodeH264PictureInfo.ntemporal_id(address()); }
        /** @return a {@link StdVideoEncodeH264ReferenceListsInfo} view of the struct pointed to by the {@code pRefLists} field. */
        @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
        public StdVideoEncodeH264ReferenceListsInfo pRefLists() { return StdVideoEncodeH264PictureInfo.npRefLists(address()); }

        /** Copies the specified {@link StdVideoEncodeH264PictureInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264PictureInfo.Buffer flags(StdVideoEncodeH264PictureInfoFlags value) { StdVideoEncodeH264PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code seq_parameter_set_id} field. */
        public StdVideoEncodeH264PictureInfo.Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pic_parameter_set_id} field. */
        public StdVideoEncodeH264PictureInfo.Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.npic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code idr_pic_id} field. */
        public StdVideoEncodeH264PictureInfo.Buffer idr_pic_id(@NativeType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.nidr_pic_id(address(), value); return this; }
        /** Sets the specified value to the {@code primary_pic_type} field. */
        public StdVideoEncodeH264PictureInfo.Buffer primary_pic_type(@NativeType("StdVideoH264PictureType") int value) { StdVideoEncodeH264PictureInfo.nprimary_pic_type(address(), value); return this; }
        /** Sets the specified value to the {@code frame_num} field. */
        public StdVideoEncodeH264PictureInfo.Buffer frame_num(@NativeType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.nframe_num(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCnt} field. */
        public StdVideoEncodeH264PictureInfo.Buffer PicOrderCnt(@NativeType("int32_t") int value) { StdVideoEncodeH264PictureInfo.nPicOrderCnt(address(), value); return this; }
        /** Sets the specified value to the {@code temporal_id} field. */
        public StdVideoEncodeH264PictureInfo.Buffer temporal_id(@NativeType("uint8_t") byte value) { StdVideoEncodeH264PictureInfo.ntemporal_id(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH264ReferenceListsInfo} to the {@code pRefLists} field. */
        public StdVideoEncodeH264PictureInfo.Buffer pRefLists(@NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) { StdVideoEncodeH264PictureInfo.npRefLists(address(), value); return this; }

    }

}