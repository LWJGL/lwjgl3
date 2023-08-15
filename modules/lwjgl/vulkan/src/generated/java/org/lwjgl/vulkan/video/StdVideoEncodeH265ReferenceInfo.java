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
 * struct StdVideoEncodeH265ReferenceInfo {
 *     {@link StdVideoEncodeH265ReferenceInfoFlags StdVideoEncodeH265ReferenceInfoFlags} flags;
 *     StdVideoH265PictureType pic_type;
 *     int32_t PicOrderCntVal;
 *     uint8_t TemporalId;
 * }</code></pre>
 */
public class StdVideoEncodeH265ReferenceInfo extends Struct<StdVideoEncodeH265ReferenceInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PIC_TYPE,
        PICORDERCNTVAL,
        TEMPORALID;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265ReferenceInfoFlags.SIZEOF, StdVideoEncodeH265ReferenceInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PIC_TYPE = layout.offsetof(1);
        PICORDERCNTVAL = layout.offsetof(2);
        TEMPORALID = layout.offsetof(3);
    }

    protected StdVideoEncodeH265ReferenceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265ReferenceInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH265ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265ReferenceInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code pic_type} field. */
    @NativeType("StdVideoH265PictureType")
    public int pic_type() { return npic_type(address()); }
    /** @return the value of the {@code PicOrderCntVal} field. */
    @NativeType("int32_t")
    public int PicOrderCntVal() { return nPicOrderCntVal(address()); }
    /** @return the value of the {@code TemporalId} field. */
    @NativeType("uint8_t")
    public byte TemporalId() { return nTemporalId(address()); }

    /** Copies the specified {@link StdVideoEncodeH265ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH265ReferenceInfo flags(StdVideoEncodeH265ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265ReferenceInfo flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code pic_type} field. */
    public StdVideoEncodeH265ReferenceInfo pic_type(@NativeType("StdVideoH265PictureType") int value) { npic_type(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCntVal} field. */
    public StdVideoEncodeH265ReferenceInfo PicOrderCntVal(@NativeType("int32_t") int value) { nPicOrderCntVal(address(), value); return this; }
    /** Sets the specified value to the {@code TemporalId} field. */
    public StdVideoEncodeH265ReferenceInfo TemporalId(@NativeType("uint8_t") byte value) { nTemporalId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265ReferenceInfo set(
        StdVideoEncodeH265ReferenceInfoFlags flags,
        int pic_type,
        int PicOrderCntVal,
        byte TemporalId
    ) {
        flags(flags);
        pic_type(pic_type);
        PicOrderCntVal(PicOrderCntVal);
        TemporalId(TemporalId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265ReferenceInfo set(StdVideoEncodeH265ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceInfo malloc() {
        return new StdVideoEncodeH265ReferenceInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265ReferenceInfo calloc() {
        return new StdVideoEncodeH265ReferenceInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance for the specified memory address. */
    public static StdVideoEncodeH265ReferenceInfo create(long address) {
        return new StdVideoEncodeH265ReferenceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265ReferenceInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265ReferenceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265ReferenceInfoFlags nflags(long struct) { return StdVideoEncodeH265ReferenceInfoFlags.create(struct + StdVideoEncodeH265ReferenceInfo.FLAGS); }
    /** Unsafe version of {@link #pic_type}. */
    public static int npic_type(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265ReferenceInfo.PIC_TYPE); }
    /** Unsafe version of {@link #PicOrderCntVal}. */
    public static int nPicOrderCntVal(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH265ReferenceInfo.PICORDERCNTVAL); }
    /** Unsafe version of {@link #TemporalId}. */
    public static byte nTemporalId(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265ReferenceInfo.TEMPORALID); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265ReferenceInfo.FLAGS, StdVideoEncodeH265ReferenceInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #pic_type(int) pic_type}. */
    public static void npic_type(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265ReferenceInfo.PIC_TYPE, value); }
    /** Unsafe version of {@link #PicOrderCntVal(int) PicOrderCntVal}. */
    public static void nPicOrderCntVal(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH265ReferenceInfo.PICORDERCNTVAL, value); }
    /** Unsafe version of {@link #TemporalId(byte) TemporalId}. */
    public static void nTemporalId(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265ReferenceInfo.TEMPORALID, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeH265ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265ReferenceInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH265ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265ReferenceInfoFlags flags() { return StdVideoEncodeH265ReferenceInfo.nflags(address()); }
        /** @return the value of the {@code pic_type} field. */
        @NativeType("StdVideoH265PictureType")
        public int pic_type() { return StdVideoEncodeH265ReferenceInfo.npic_type(address()); }
        /** @return the value of the {@code PicOrderCntVal} field. */
        @NativeType("int32_t")
        public int PicOrderCntVal() { return StdVideoEncodeH265ReferenceInfo.nPicOrderCntVal(address()); }
        /** @return the value of the {@code TemporalId} field. */
        @NativeType("uint8_t")
        public byte TemporalId() { return StdVideoEncodeH265ReferenceInfo.nTemporalId(address()); }

        /** Copies the specified {@link StdVideoEncodeH265ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH265ReferenceInfo.Buffer flags(StdVideoEncodeH265ReferenceInfoFlags value) { StdVideoEncodeH265ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code pic_type} field. */
        public StdVideoEncodeH265ReferenceInfo.Buffer pic_type(@NativeType("StdVideoH265PictureType") int value) { StdVideoEncodeH265ReferenceInfo.npic_type(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCntVal} field. */
        public StdVideoEncodeH265ReferenceInfo.Buffer PicOrderCntVal(@NativeType("int32_t") int value) { StdVideoEncodeH265ReferenceInfo.nPicOrderCntVal(address(), value); return this; }
        /** Sets the specified value to the {@code TemporalId} field. */
        public StdVideoEncodeH265ReferenceInfo.Buffer TemporalId(@NativeType("uint8_t") byte value) { StdVideoEncodeH265ReferenceInfo.nTemporalId(address(), value); return this; }

    }

}