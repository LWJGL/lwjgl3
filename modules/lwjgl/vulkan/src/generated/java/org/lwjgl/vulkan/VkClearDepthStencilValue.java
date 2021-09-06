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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkClearDepthStencilValue {
 *     float {@link #depth};
 *     uint32_t {@link #stencil};
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

    /**
     * Creates a {@code VkClearDepthStencilValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearDepthStencilValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the clear value for the depth aspect of the depth/stencil attachment. It is a floating-point value which is automatically converted to the attachment’s format. */
    public float depth() { return ndepth(address()); }
    /** the clear value for the stencil aspect of the depth/stencil attachment. It is a 32-bit integer value which is converted to the attachment’s format by taking the appropriate number of LSBs. */
    @NativeType("uint32_t")
    public int stencil() { return nstencil(address()); }

    /** Sets the specified value to the {@link #depth} field. */
    public VkClearDepthStencilValue depth(float value) { ndepth(address(), value); return this; }
    /** Sets the specified value to the {@link #stencil} field. */
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

    /** Returns a new {@code VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearDepthStencilValue malloc() {
        return wrap(VkClearDepthStencilValue.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkClearDepthStencilValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearDepthStencilValue calloc() {
        return wrap(VkClearDepthStencilValue.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkClearDepthStencilValue} instance allocated with {@link BufferUtils}. */
    public static VkClearDepthStencilValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkClearDepthStencilValue.class, memAddress(container), container);
    }

    /** Returns a new {@code VkClearDepthStencilValue} instance for the specified memory address. */
    public static VkClearDepthStencilValue create(long address) {
        return wrap(VkClearDepthStencilValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearDepthStencilValue createSafe(long address) {
        return address == NULL ? null : wrap(VkClearDepthStencilValue.class, address);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkClearDepthStencilValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkClearDepthStencilValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearDepthStencilValue.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkClearDepthStencilValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearDepthStencilValue malloc(MemoryStack stack) {
        return wrap(VkClearDepthStencilValue.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkClearDepthStencilValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearDepthStencilValue calloc(MemoryStack stack) {
        return wrap(VkClearDepthStencilValue.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearDepthStencilValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearDepthStencilValue.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return UNSAFE.getFloat(null, struct + VkClearDepthStencilValue.DEPTH); }
    /** Unsafe version of {@link #stencil}. */
    public static int nstencil(long struct) { return UNSAFE.getInt(null, struct + VkClearDepthStencilValue.STENCIL); }

    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { UNSAFE.putFloat(null, struct + VkClearDepthStencilValue.DEPTH, value); }
    /** Unsafe version of {@link #stencil(int) stencil}. */
    public static void nstencil(long struct, int value) { UNSAFE.putInt(null, struct + VkClearDepthStencilValue.STENCIL, value); }

    // -----------------------------------

    /** An array of {@link VkClearDepthStencilValue} structs. */
    public static class Buffer extends StructBuffer<VkClearDepthStencilValue, Buffer> implements NativeResource {

        private static final VkClearDepthStencilValue ELEMENT_FACTORY = VkClearDepthStencilValue.create(-1L);

        /**
         * Creates a new {@code VkClearDepthStencilValue.Buffer} instance backed by the specified container.
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
        protected VkClearDepthStencilValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkClearDepthStencilValue#depth} field. */
        public float depth() { return VkClearDepthStencilValue.ndepth(address()); }
        /** @return the value of the {@link VkClearDepthStencilValue#stencil} field. */
        @NativeType("uint32_t")
        public int stencil() { return VkClearDepthStencilValue.nstencil(address()); }

        /** Sets the specified value to the {@link VkClearDepthStencilValue#depth} field. */
        public VkClearDepthStencilValue.Buffer depth(float value) { VkClearDepthStencilValue.ndepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkClearDepthStencilValue#stencil} field. */
        public VkClearDepthStencilValue.Buffer stencil(@NativeType("uint32_t") int value) { VkClearDepthStencilValue.nstencil(address(), value); return this; }

    }

}