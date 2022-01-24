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
 * struct StdVideoDecodeH264MvcElementFlags {
 *     uint32_t non_idr : 1;
 *     uint32_t anchor_pic : 1;
 *     uint32_t inter_view : 1;
 * }</code></pre>
 */
public class StdVideoDecodeH264MvcElementFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoDecodeH264MvcElementFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeH264MvcElementFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code non_idr} field. */
    @NativeType("uint32_t")
    public boolean non_idr() { return nnon_idr(address()) != 0; }
    /** @return the value of the {@code anchor_pic} field. */
    @NativeType("uint32_t")
    public boolean anchor_pic() { return nanchor_pic(address()) != 0; }
    /** @return the value of the {@code inter_view} field. */
    @NativeType("uint32_t")
    public boolean inter_view() { return ninter_view(address()) != 0; }

    /** Sets the specified value to the {@code non_idr} field. */
    public StdVideoDecodeH264MvcElementFlags non_idr(@NativeType("uint32_t") boolean value) { nnon_idr(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code anchor_pic} field. */
    public StdVideoDecodeH264MvcElementFlags anchor_pic(@NativeType("uint32_t") boolean value) { nanchor_pic(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code inter_view} field. */
    public StdVideoDecodeH264MvcElementFlags inter_view(@NativeType("uint32_t") boolean value) { ninter_view(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeH264MvcElementFlags set(
        boolean non_idr,
        boolean anchor_pic,
        boolean inter_view
    ) {
        non_idr(non_idr);
        anchor_pic(anchor_pic);
        inter_view(inter_view);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeH264MvcElementFlags set(StdVideoDecodeH264MvcElementFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264MvcElementFlags malloc() {
        return wrap(StdVideoDecodeH264MvcElementFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeH264MvcElementFlags calloc() {
        return wrap(StdVideoDecodeH264MvcElementFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeH264MvcElementFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoDecodeH264MvcElementFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance for the specified memory address. */
    public static StdVideoDecodeH264MvcElementFlags create(long address) {
        return wrap(StdVideoDecodeH264MvcElementFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264MvcElementFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoDecodeH264MvcElementFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoDecodeH264MvcElementFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264MvcElementFlags malloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264MvcElementFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoDecodeH264MvcElementFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeH264MvcElementFlags calloc(MemoryStack stack) {
        return wrap(StdVideoDecodeH264MvcElementFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeH264MvcElementFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeH264MvcElementFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoDecodeH264MvcElementFlags.BITFIELD0); }
    /** Unsafe version of {@link #non_idr}. */
    public static int nnon_idr(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #anchor_pic}. */
    public static int nanchor_pic(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #inter_view}. */
    public static int ninter_view(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoDecodeH264MvcElementFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #non_idr(boolean) non_idr}. */
    public static void nnon_idr(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #anchor_pic(boolean) anchor_pic}. */
    public static void nanchor_pic(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #inter_view(boolean) inter_view}. */
    public static void ninter_view(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeH264MvcElementFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264MvcElementFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeH264MvcElementFlags ELEMENT_FACTORY = StdVideoDecodeH264MvcElementFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeH264MvcElementFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeH264MvcElementFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoDecodeH264MvcElementFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code non_idr} field. */
        @NativeType("uint32_t")
        public boolean non_idr() { return StdVideoDecodeH264MvcElementFlags.nnon_idr(address()) != 0; }
        /** @return the value of the {@code anchor_pic} field. */
        @NativeType("uint32_t")
        public boolean anchor_pic() { return StdVideoDecodeH264MvcElementFlags.nanchor_pic(address()) != 0; }
        /** @return the value of the {@code inter_view} field. */
        @NativeType("uint32_t")
        public boolean inter_view() { return StdVideoDecodeH264MvcElementFlags.ninter_view(address()) != 0; }

        /** Sets the specified value to the {@code non_idr} field. */
        public StdVideoDecodeH264MvcElementFlags.Buffer non_idr(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264MvcElementFlags.nnon_idr(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code anchor_pic} field. */
        public StdVideoDecodeH264MvcElementFlags.Buffer anchor_pic(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264MvcElementFlags.nanchor_pic(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code inter_view} field. */
        public StdVideoDecodeH264MvcElementFlags.Buffer inter_view(@NativeType("uint32_t") boolean value) { StdVideoDecodeH264MvcElementFlags.ninter_view(address(), value ? 1 : 0); return this; }

    }

}