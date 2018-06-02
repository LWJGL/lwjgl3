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
 * Structure specifying a clear depth stencil value.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Unless the {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} extension is enabled {@code depth} <b>must</b> be between {@code 0.0} and {@code 1.0}, inclusive</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkClearValue}, {@link VK10#vkCmdClearDepthStencilImage CmdClearDepthStencilImage}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code depth} &ndash; the clear value for the depth aspect of the depth/stencil attachment. It is a floating-point value which is automatically converted to the attachment&#8217;s format.</li>
 * <li>{@code stencil} &ndash; the clear value for the stencil aspect of the depth/stencil attachment. It is a 32-bit integer value which is converted to the attachment&#8217;s format by taking the appropriate number of LSBs.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkClearDepthStencilValue {
 *     float depth;
 *     uint32_t stencil;
 * }</code></pre>
 */
public class VkClearDepthStencilValue extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEPTH,
        STENCIL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEPTH = layout.offsetof(0);
        STENCIL = layout.offsetof(1);
    }

    VkClearDepthStencilValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkClearDepthStencilValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearDepthStencilValue(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code depth} field. */
    public float depth() { return ndepth(address()); }
    /** Returns the value of the {@code stencil} field. */
    @NativeType("uint32_t")
    public int stencil() { return nstencil(address()); }

    /** Sets the specified value to the {@code depth} field. */
    public VkClearDepthStencilValue depth(float value) { ndepth(address(), value); return this; }
    /** Sets the specified value to the {@code stencil} field. */
    public VkClearDepthStencilValue stencil(@NativeType("uint32_t") int value) { nstencil(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClearDepthStencilValue set(
        float depth,
        int stencil
    ) {
        depth(depth);
        stencil(stencil);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearDepthStencilValue set(VkClearDepthStencilValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearDepthStencilValue malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearDepthStencilValue calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkClearDepthStencilValue} instance allocated with {@link BufferUtils}. */
    public static VkClearDepthStencilValue create() {
        return new VkClearDepthStencilValue(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkClearDepthStencilValue} instance for the specified memory address. */
    public static VkClearDepthStencilValue create(long address) {
        return new VkClearDepthStencilValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearDepthStencilValue createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkClearDepthStencilValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearDepthStencilValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkClearDepthStencilValue} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkClearDepthStencilValue mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkClearDepthStencilValue} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkClearDepthStencilValue callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearDepthStencilValue mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearDepthStencilValue callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return memGetFloat(struct + VkClearDepthStencilValue.DEPTH); }
    /** Unsafe version of {@link #stencil}. */
    public static int nstencil(long struct) { return memGetInt(struct + VkClearDepthStencilValue.STENCIL); }

    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { memPutFloat(struct + VkClearDepthStencilValue.DEPTH, value); }
    /** Unsafe version of {@link #stencil(int) stencil}. */
    public static void nstencil(long struct, int value) { memPutInt(struct + VkClearDepthStencilValue.STENCIL, value); }

    // -----------------------------------

    /** An array of {@link VkClearDepthStencilValue} structs. */
    public static class Buffer extends StructBuffer<VkClearDepthStencilValue, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkClearDepthStencilValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearDepthStencilValue#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkClearDepthStencilValue newInstance(long address) {
            return new VkClearDepthStencilValue(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code depth} field. */
        public float depth() { return VkClearDepthStencilValue.ndepth(address()); }
        /** Returns the value of the {@code stencil} field. */
        @NativeType("uint32_t")
        public int stencil() { return VkClearDepthStencilValue.nstencil(address()); }

        /** Sets the specified value to the {@code depth} field. */
        public VkClearDepthStencilValue.Buffer depth(float value) { VkClearDepthStencilValue.ndepth(address(), value); return this; }
        /** Sets the specified value to the {@code stencil} field. */
        public VkClearDepthStencilValue.Buffer stencil(@NativeType("uint32_t") int value) { VkClearDepthStencilValue.nstencil(address(), value); return this; }

    }

}