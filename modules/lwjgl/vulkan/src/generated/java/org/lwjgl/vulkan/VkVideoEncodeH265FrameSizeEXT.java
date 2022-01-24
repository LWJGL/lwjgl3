/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing frame size values per H.265 picture type.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265RateControlLayerInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265FrameSizeEXT {
 *     uint32_t {@link #frameISize};
 *     uint32_t {@link #framePSize};
 *     uint32_t {@link #frameBSize};
 * }</code></pre>
 */
public class VkVideoEncodeH265FrameSizeEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMEISIZE,
        FRAMEPSIZE,
        FRAMEBSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMEISIZE = layout.offsetof(0);
        FRAMEPSIZE = layout.offsetof(1);
        FRAMEBSIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkVideoEncodeH265FrameSizeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265FrameSizeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the size in bytes to be used for I-frames. */
    @NativeType("uint32_t")
    public int frameISize() { return nframeISize(address()); }
    /** the size in bytes to be used for P-frames. */
    @NativeType("uint32_t")
    public int framePSize() { return nframePSize(address()); }
    /** the size in bytes to be used for B-frames. */
    @NativeType("uint32_t")
    public int frameBSize() { return nframeBSize(address()); }

    /** Sets the specified value to the {@link #frameISize} field. */
    public VkVideoEncodeH265FrameSizeEXT frameISize(@NativeType("uint32_t") int value) { nframeISize(address(), value); return this; }
    /** Sets the specified value to the {@link #framePSize} field. */
    public VkVideoEncodeH265FrameSizeEXT framePSize(@NativeType("uint32_t") int value) { nframePSize(address(), value); return this; }
    /** Sets the specified value to the {@link #frameBSize} field. */
    public VkVideoEncodeH265FrameSizeEXT frameBSize(@NativeType("uint32_t") int value) { nframeBSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265FrameSizeEXT set(
        int frameISize,
        int framePSize,
        int frameBSize
    ) {
        frameISize(frameISize);
        framePSize(framePSize);
        frameBSize(frameBSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265FrameSizeEXT set(VkVideoEncodeH265FrameSizeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265FrameSizeEXT malloc() {
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265FrameSizeEXT calloc() {
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265FrameSizeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265FrameSizeEXT create(long address) {
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265FrameSizeEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoEncodeH265FrameSizeEXT.class, address);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265FrameSizeEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265FrameSizeEXT malloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoEncodeH265FrameSizeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265FrameSizeEXT calloc(MemoryStack stack) {
        return wrap(VkVideoEncodeH265FrameSizeEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265FrameSizeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265FrameSizeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameISize}. */
    public static int nframeISize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEISIZE); }
    /** Unsafe version of {@link #framePSize}. */
    public static int nframePSize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEPSIZE); }
    /** Unsafe version of {@link #frameBSize}. */
    public static int nframeBSize(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEBSIZE); }

    /** Unsafe version of {@link #frameISize(int) frameISize}. */
    public static void nframeISize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEISIZE, value); }
    /** Unsafe version of {@link #framePSize(int) framePSize}. */
    public static void nframePSize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEPSIZE, value); }
    /** Unsafe version of {@link #frameBSize(int) frameBSize}. */
    public static void nframeBSize(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265FrameSizeEXT.FRAMEBSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265FrameSizeEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265FrameSizeEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265FrameSizeEXT ELEMENT_FACTORY = VkVideoEncodeH265FrameSizeEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265FrameSizeEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265FrameSizeEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoEncodeH265FrameSizeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265FrameSizeEXT#frameISize} field. */
        @NativeType("uint32_t")
        public int frameISize() { return VkVideoEncodeH265FrameSizeEXT.nframeISize(address()); }
        /** @return the value of the {@link VkVideoEncodeH265FrameSizeEXT#framePSize} field. */
        @NativeType("uint32_t")
        public int framePSize() { return VkVideoEncodeH265FrameSizeEXT.nframePSize(address()); }
        /** @return the value of the {@link VkVideoEncodeH265FrameSizeEXT#frameBSize} field. */
        @NativeType("uint32_t")
        public int frameBSize() { return VkVideoEncodeH265FrameSizeEXT.nframeBSize(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265FrameSizeEXT#frameISize} field. */
        public VkVideoEncodeH265FrameSizeEXT.Buffer frameISize(@NativeType("uint32_t") int value) { VkVideoEncodeH265FrameSizeEXT.nframeISize(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265FrameSizeEXT#framePSize} field. */
        public VkVideoEncodeH265FrameSizeEXT.Buffer framePSize(@NativeType("uint32_t") int value) { VkVideoEncodeH265FrameSizeEXT.nframePSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265FrameSizeEXT#frameBSize} field. */
        public VkVideoEncodeH265FrameSizeEXT.Buffer frameBSize(@NativeType("uint32_t") int value) { VkVideoEncodeH265FrameSizeEXT.nframeBSize(address(), value); return this; }

    }

}