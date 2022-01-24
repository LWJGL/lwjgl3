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
 * struct StdVideoDecodeH265ReferenceInfo {
 *     int32_t PicOrderCntVal;
 *     {@link StdVideoDecodeH265ReferenceInfoFlags StdVideoDecodeH265ReferenceInfoFlags} flags;
 * }</code></pre>
 */
public class StdVideoDecodeH265ReferenceInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PICORDERCNTVAL,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(StdVideoDecodeH265ReferenceInfoFlags.SIZEOF, StdVideoDecodeH265ReferenceInfoFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PICORDERCNTVAL = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    /**
     * Creates a {@code StdVideoDecodeH265ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH265ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code PicOrderCntVal} field. */
    @NativeType("int32_t")
    public int PicOrderCntVal() { return nPicOrderCntVal(address()); }
    /** @return a {@link StdVideoDecodeH265ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeH265ReferenceInfoFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code PicOrderCntVal} field. */
    public StdVideoDecodeH265ReferenceInfo PicOrderCntVal(@NativeType("int32_t") int value) { nPicOrderCntVal(address(), value); return this; }
    /** Copies the specified {@link StdVideoDecodeH265ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeH265ReferenceInfo flags(StdVideoDecodeH265ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeH265ReferenceInfo flags(java.util.function.Consumer<StdVideoDecodeH265ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH265ReferenceInfo set(
        int PicOrderCntVal,
        StdVideoDecodeH265ReferenceInfoFlags flags
    ) {
        PicOrderCntVal(PicOrderCntVal);
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
    public StdVideoDecodeH265ReferenceInfo set(StdVideoDecodeH265ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265ReferenceInfo malloc() {
        return wrap(StdVideoDecodeH265ReferenceInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH265ReferenceInfo calloc() {
        return wrap(StdVideoDecodeH265ReferenceInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH265ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH265ReferenceInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance for the specified memory address. */
    public static StdVideoDecodeH265ReferenceInfo create(long address) {
        return wrap(StdVideoDecodeH265ReferenceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265ReferenceInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH265ReferenceInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH265ReferenceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265ReferenceInfo malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH265ReferenceInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH265ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH265ReferenceInfo calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH265ReferenceInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH265ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH265ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #PicOrderCntVal}. */
    public static int nPicOrderCntVal(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH265ReferenceInfo.PICORDERCNTVAL); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeH265ReferenceInfoFlags nflags(long struct) { return StdVideoDecodeH265ReferenceInfoFlags.create(struct + StdVideoDecodeH265ReferenceInfo.FLAGS); }

    /** Unsafe version of {@link #PicOrderCntVal(int) PicOrderCntVal}. */
    public static void nPicOrderCntVal(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH265ReferenceInfo.PICORDERCNTVAL, value); }
    /** Unsafe version of {@link #flags(StdVideoDecodeH265ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeH265ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeH265ReferenceInfo.FLAGS, StdVideoDecodeH265ReferenceInfoFlags.SIZEOF); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH265ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeH265ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeH265ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH265ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH265ReferenceInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH265ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code PicOrderCntVal} field. */
        @NativeType("int32_t")
        public int PicOrderCntVal() { return StdVideoDecodeH265ReferenceInfo.nPicOrderCntVal(address()); }
        /** @return a {@link StdVideoDecodeH265ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeH265ReferenceInfoFlags flags() { return StdVideoDecodeH265ReferenceInfo.nflags(address()); }

        /** Sets the specified value to the {@code PicOrderCntVal} field. */
        public StdVideoDecodeH265ReferenceInfo.Buffer PicOrderCntVal(@NativeType("int32_t") int value) { StdVideoDecodeH265ReferenceInfo.nPicOrderCntVal(address(), value); return this; }
        /** Copies the specified {@link StdVideoDecodeH265ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeH265ReferenceInfo.Buffer flags(StdVideoDecodeH265ReferenceInfoFlags value) { StdVideoDecodeH265ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeH265ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeH265ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }

    }

}