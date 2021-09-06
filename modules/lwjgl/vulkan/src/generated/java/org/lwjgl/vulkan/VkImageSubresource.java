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
 * Structure specifying an image subresource.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseImageMemoryBind}, {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageSubresource {
 *     VkImageAspectFlags {@link #aspectMask};
 *     uint32_t {@link #mipLevel};
 *     uint32_t {@link #arrayLayer};
 * }</code></pre>
 */
public class VkImageSubresource extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        MIPLEVEL,
        ARRAYLAYER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        MIPLEVEL = layout.offsetof(1);
        ARRAYLAYER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageSubresource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkImageAspectFlags} value selecting the image <em>aspect</em>. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** selects the mipmap level. */
    @NativeType("uint32_t")
    public int mipLevel() { return nmipLevel(address()); }
    /** selects the array layer. */
    @NativeType("uint32_t")
    public int arrayLayer() { return narrayLayer(address()); }

    /** Sets the specified value to the {@link #aspectMask} field. */
    public VkImageSubresource aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@link #mipLevel} field. */
    public VkImageSubresource mipLevel(@NativeType("uint32_t") int value) { nmipLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #arrayLayer} field. */
    public VkImageSubresource arrayLayer(@NativeType("uint32_t") int value) { narrayLayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresource set(
        int aspectMask,
        int mipLevel,
        int arrayLayer
    ) {
        aspectMask(aspectMask);
        mipLevel(mipLevel);
        arrayLayer(arrayLayer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresource set(VkImageSubresource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresource malloc() {
        return wrap(VkImageSubresource.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageSubresource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresource calloc() {
        return wrap(VkImageSubresource.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageSubresource} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageSubresource.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresource} instance for the specified memory address. */
    public static VkImageSubresource create(long address) {
        return wrap(VkImageSubresource.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresource createSafe(long address) {
        return address == NULL ? null : wrap(VkImageSubresource.class, address);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageSubresource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresource.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresource.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageSubresource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource malloc(MemoryStack stack) {
        return wrap(VkImageSubresource.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageSubresource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource calloc(MemoryStack stack) {
        return wrap(VkImageSubresource.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresource.ASPECTMASK); }
    /** Unsafe version of {@link #mipLevel}. */
    public static int nmipLevel(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresource.MIPLEVEL); }
    /** Unsafe version of {@link #arrayLayer}. */
    public static int narrayLayer(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresource.ARRAYLAYER); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresource.ASPECTMASK, value); }
    /** Unsafe version of {@link #mipLevel(int) mipLevel}. */
    public static void nmipLevel(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresource.MIPLEVEL, value); }
    /** Unsafe version of {@link #arrayLayer(int) arrayLayer}. */
    public static void narrayLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresource.ARRAYLAYER, value); }

    // -----------------------------------

    /** An array of {@link VkImageSubresource} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresource, Buffer> implements NativeResource {

        private static final VkImageSubresource ELEMENT_FACTORY = VkImageSubresource.create(-1L);

        /**
         * Creates a new {@code VkImageSubresource.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresource#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSubresource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageSubresource#aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkImageSubresource.naspectMask(address()); }
        /** @return the value of the {@link VkImageSubresource#mipLevel} field. */
        @NativeType("uint32_t")
        public int mipLevel() { return VkImageSubresource.nmipLevel(address()); }
        /** @return the value of the {@link VkImageSubresource#arrayLayer} field. */
        @NativeType("uint32_t")
        public int arrayLayer() { return VkImageSubresource.narrayLayer(address()); }

        /** Sets the specified value to the {@link VkImageSubresource#aspectMask} field. */
        public VkImageSubresource.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkImageSubresource.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresource#mipLevel} field. */
        public VkImageSubresource.Buffer mipLevel(@NativeType("uint32_t") int value) { VkImageSubresource.nmipLevel(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresource#arrayLayer} field. */
        public VkImageSubresource.Buffer arrayLayer(@NativeType("uint32_t") int value) { VkImageSubresource.narrayLayer(address(), value); return this; }

    }

}