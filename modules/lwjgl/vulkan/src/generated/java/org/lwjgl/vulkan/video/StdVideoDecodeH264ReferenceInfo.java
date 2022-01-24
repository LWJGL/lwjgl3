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
 * struct StdVideoDecodeH264ReferenceInfo {
 *     uint16_t {@link #FrameNum};
 *     uint16_t {@link #reserved};
 *     int32_t {@link #PicOrderCnt}[2];
 *     {@link StdVideoDecodeH264ReferenceInfoFlags StdVideoDecodeH264ReferenceInfoFlags} flags;
 * }</code></pre>
 */
public class StdVideoDecodeH264ReferenceInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMENUM,
        RESERVED,
        PICORDERCNT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __array(4, 2),
            __member(StdVideoDecodeH264ReferenceInfoFlags.SIZEOF, StdVideoDecodeH264ReferenceInfoFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMENUM = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        PICORDERCNT = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    /**
     * Creates a {@code StdVideoDecodeH264ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** 7.4.3.3 Decoded reference picture marking semantics */
    @NativeType("uint16_t")
    public short FrameNum() { return nFrameNum(address()); }
    /** for structure members 32-bit packing/alignment */
    @NativeType("uint16_t")
    public short reserved() { return nreserved(address()); }
    /** topFieldOrderCnt and BottomFieldOrderCnt fields */
    @NativeType("int32_t[2]")
    public IntBuffer PicOrderCnt() { return nPicOrderCnt(address()); }
    /** topFieldOrderCnt and BottomFieldOrderCnt fields */
    @NativeType("int32_t")
    public int PicOrderCnt(int index) { return nPicOrderCnt(address(), index); }
    /** @return a {@link StdVideoDecodeH264ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeH264ReferenceInfoFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #FrameNum} field. */
    public StdVideoDecodeH264ReferenceInfo FrameNum(@NativeType("uint16_t") short value) { nFrameNum(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved} field. */
    public StdVideoDecodeH264ReferenceInfo reserved(@NativeType("uint16_t") short value) { nreserved(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #PicOrderCnt} field. */
    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(@NativeType("int32_t[2]") IntBuffer value) { nPicOrderCnt(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #PicOrderCnt} field. */
    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(int index, @NativeType("int32_t") int value) { nPicOrderCnt(address(), index, value); return this; }
    /** Copies the specified {@link StdVideoDecodeH264ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeH264ReferenceInfo flags(StdVideoDecodeH264ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeH264ReferenceInfo flags(java.util.function.Consumer<StdVideoDecodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264ReferenceInfo set(
        short FrameNum,
        short reserved,
        IntBuffer PicOrderCnt,
        StdVideoDecodeH264ReferenceInfoFlags flags
    ) {
        FrameNum(FrameNum);
        reserved(reserved);
        PicOrderCnt(PicOrderCnt);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264ReferenceInfo set(StdVideoDecodeH264ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264ReferenceInfo malloc() {
        return wrap(StdVideoDecodeH264ReferenceInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264ReferenceInfo calloc() {
        return wrap(StdVideoDecodeH264ReferenceInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264ReferenceInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance for the specified memory address. */
    public static StdVideoDecodeH264ReferenceInfo create(long address) {
        return wrap(StdVideoDecodeH264ReferenceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264ReferenceInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264ReferenceInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264ReferenceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264ReferenceInfo malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264ReferenceInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264ReferenceInfo calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264ReferenceInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FrameNum}. */
    public static short nFrameNum(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264ReferenceInfo.FRAMENUM); }
    /** Unsafe version of {@link #reserved}. */
    public static short nreserved(long struct) { return UNSAFE.getShort(null, struct + StdVideoDecodeH264ReferenceInfo.RESERVED); }
    /** Unsafe version of {@link #PicOrderCnt}. */
    public static IntBuffer nPicOrderCnt(long struct) { return memIntBuffer(struct + StdVideoDecodeH264ReferenceInfo.PICORDERCNT, 2); }
    /** Unsafe version of {@link #PicOrderCnt(int) PicOrderCnt}. */
    public static int nPicOrderCnt(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoDecodeH264ReferenceInfo.PICORDERCNT + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeH264ReferenceInfoFlags nflags(long struct) { return StdVideoDecodeH264ReferenceInfoFlags.create(struct + StdVideoDecodeH264ReferenceInfo.FLAGS); }

    /** Unsafe version of {@link #FrameNum(short) FrameNum}. */
    public static void nFrameNum(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264ReferenceInfo.FRAMENUM, value); }
    /** Unsafe version of {@link #reserved(short) reserved}. */
    public static void nreserved(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoDecodeH264ReferenceInfo.RESERVED, value); }
    /** Unsafe version of {@link #PicOrderCnt(IntBuffer) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + StdVideoDecodeH264ReferenceInfo.PICORDERCNT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #PicOrderCnt(int, int) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoDecodeH264ReferenceInfo.PICORDERCNT + check(index, 2) * 4, value);
    }
    /** Unsafe version of {@link #flags(StdVideoDecodeH264ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeH264ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeH264ReferenceInfo.FLAGS, StdVideoDecodeH264ReferenceInfoFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeH264ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264ReferenceInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfo#FrameNum} field. */
        @NativeType("uint16_t")
        public short FrameNum() { return StdVideoDecodeH264ReferenceInfo.nFrameNum(address()); }
        /** @return the value of the {@link StdVideoDecodeH264ReferenceInfo#reserved} field. */
        @NativeType("uint16_t")
        public short reserved() { return StdVideoDecodeH264ReferenceInfo.nreserved(address()); }
        /** @return a {@link IntBuffer} view of the {@link StdVideoDecodeH264ReferenceInfo#PicOrderCnt} field. */
        @NativeType("int32_t[2]")
        public IntBuffer PicOrderCnt() { return StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address()); }
        /** @return the value at the specified index of the {@link StdVideoDecodeH264ReferenceInfo#PicOrderCnt} field. */
        @NativeType("int32_t")
        public int PicOrderCnt(int index) { return StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), index); }
        /** @return a {@link StdVideoDecodeH264ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeH264ReferenceInfoFlags flags() { return StdVideoDecodeH264ReferenceInfo.nflags(address()); }

        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfo#FrameNum} field. */
        public StdVideoDecodeH264ReferenceInfo.Buffer FrameNum(@NativeType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.nFrameNum(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoDecodeH264ReferenceInfo#reserved} field. */
        public StdVideoDecodeH264ReferenceInfo.Buffer reserved(@NativeType("uint16_t") short value) { StdVideoDecodeH264ReferenceInfo.nreserved(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link StdVideoDecodeH264ReferenceInfo#PicOrderCnt} field. */
        public StdVideoDecodeH264ReferenceInfo.Buffer PicOrderCnt(@NativeType("int32_t[2]") IntBuffer value) { StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link StdVideoDecodeH264ReferenceInfo#PicOrderCnt} field. */
        public StdVideoDecodeH264ReferenceInfo.Buffer PicOrderCnt(int index, @NativeType("int32_t") int value) { StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), index, value); return this; }
        /** Copies the specified {@link StdVideoDecodeH264ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeH264ReferenceInfo.Buffer flags(StdVideoDecodeH264ReferenceInfoFlags value) { StdVideoDecodeH264ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeH264ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }

    }

}