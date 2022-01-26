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
 * Structure specifying a three-dimensional extent.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferImageCopy}, {@link VkBufferImageCopy2}, {@link VkImageCopy}, {@link VkImageCopy2}, {@link VkImageCreateInfo}, {@link VkImageFormatProperties}, {@link VkImageResolve}, {@link VkImageResolve2}, {@link VkQueueFamilyProperties}, {@link VkSparseImageFormatProperties}, {@link VkSparseImageMemoryBind}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExtent3D {
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 *     uint32_t {@link #depth};
 * }</code></pre>
 */
public class VkExtent3D extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkExtent3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExtent3D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the width of the extent. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the height of the extent. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** the depth of the extent. */
    @NativeType("uint32_t")
    public int depth() { return ndepth(address()); }

    /** Sets the specified value to the {@link #width} field. */
    public VkExtent3D width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public VkExtent3D height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #depth} field. */
    public VkExtent3D depth(@NativeType("uint32_t") int value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExtent3D set(
        int width,
        int height,
        int depth
    ) {
        width(width);
        height(height);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExtent3D set(VkExtent3D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExtent3D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExtent3D malloc() {
        return wrap(VkExtent3D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExtent3D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExtent3D calloc() {
        return wrap(VkExtent3D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExtent3D} instance allocated with {@link BufferUtils}. */
    public static VkExtent3D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExtent3D.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExtent3D} instance for the specified memory address. */
    public static VkExtent3D create(long address) {
        return wrap(VkExtent3D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExtent3D createSafe(long address) {
        return address == NULL ? null : wrap(VkExtent3D.class, address);
    }

    /**
     * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtent3D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExtent3D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExtent3D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent3D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent3D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent3D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent3D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent3D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent3D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent3D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent3D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExtent3D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtent3D malloc(MemoryStack stack) {
        return wrap(VkExtent3D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExtent3D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtent3D calloc(MemoryStack stack) {
        return wrap(VkExtent3D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExtent3D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtent3D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtent3D.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + VkExtent3D.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + VkExtent3D.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + VkExtent3D.DEPTH); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + VkExtent3D.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + VkExtent3D.HEIGHT, value); }
    /** Unsafe version of {@link #depth(int) depth}. */
    public static void ndepth(long struct, int value) { UNSAFE.putInt(null, struct + VkExtent3D.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkExtent3D} structs. */
    public static class Buffer extends StructBuffer<VkExtent3D, Buffer> implements NativeResource {

        private static final VkExtent3D ELEMENT_FACTORY = VkExtent3D.create(-1L);

        /**
         * Creates a new {@code VkExtent3D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExtent3D#SIZEOF}, and its mark will be undefined.
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
        protected VkExtent3D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExtent3D#width} field. */
        @NativeType("uint32_t")
        public int width() { return VkExtent3D.nwidth(address()); }
        /** @return the value of the {@link VkExtent3D#height} field. */
        @NativeType("uint32_t")
        public int height() { return VkExtent3D.nheight(address()); }
        /** @return the value of the {@link VkExtent3D#depth} field. */
        @NativeType("uint32_t")
        public int depth() { return VkExtent3D.ndepth(address()); }

        /** Sets the specified value to the {@link VkExtent3D#width} field. */
        public VkExtent3D.Buffer width(@NativeType("uint32_t") int value) { VkExtent3D.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link VkExtent3D#height} field. */
        public VkExtent3D.Buffer height(@NativeType("uint32_t") int value) { VkExtent3D.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link VkExtent3D#depth} field. */
        public VkExtent3D.Buffer depth(@NativeType("uint32_t") int value) { VkExtent3D.ndepth(address(), value); return this; }

    }

}