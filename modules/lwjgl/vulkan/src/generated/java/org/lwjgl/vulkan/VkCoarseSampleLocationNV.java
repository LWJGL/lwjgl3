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
 * Structure specifying parameters controlling shading rate image usage.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pixelX} <b>must</b> be less than the width (in pixels) of the fragment</li>
 * <li>{@code pixelY} <b>must</b> be less than the height (in pixels) of the fragment</li>
 * <li>{@code sample} <b>must</b> be less than the number of coverage samples in each pixel belonging to the fragment</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCoarseSampleOrderCustomNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCoarseSampleLocationNV {
 *     uint32_t {@link #pixelX};
 *     uint32_t {@link #pixelY};
 *     uint32_t {@link #sample};
 * }</code></pre>
 */
public class VkCoarseSampleLocationNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIXELX,
        PIXELY,
        SAMPLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIXELX = layout.offsetof(0);
        PIXELY = layout.offsetof(1);
        SAMPLE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkCoarseSampleLocationNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCoarseSampleLocationNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** added to the x coordinate of the upper-leftmost pixel of each fragment to identify the pixel containing the coverage sample. */
    @NativeType("uint32_t")
    public int pixelX() { return npixelX(address()); }
    /** added to the y coordinate of the upper-leftmost pixel of each fragment to identify the pixel containing the coverage sample. */
    @NativeType("uint32_t")
    public int pixelY() { return npixelY(address()); }
    /** the number of the coverage sample in the pixel identified by {@code pixelX} and {@code pixelY}. */
    @NativeType("uint32_t")
    public int sample() { return nsample(address()); }

    /** Sets the specified value to the {@link #pixelX} field. */
    public VkCoarseSampleLocationNV pixelX(@NativeType("uint32_t") int value) { npixelX(address(), value); return this; }
    /** Sets the specified value to the {@link #pixelY} field. */
    public VkCoarseSampleLocationNV pixelY(@NativeType("uint32_t") int value) { npixelY(address(), value); return this; }
    /** Sets the specified value to the {@link #sample} field. */
    public VkCoarseSampleLocationNV sample(@NativeType("uint32_t") int value) { nsample(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCoarseSampleLocationNV set(
        int pixelX,
        int pixelY,
        int sample
    ) {
        pixelX(pixelX);
        pixelY(pixelY);
        sample(sample);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCoarseSampleLocationNV set(VkCoarseSampleLocationNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCoarseSampleLocationNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleLocationNV malloc() {
        return wrap(VkCoarseSampleLocationNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCoarseSampleLocationNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCoarseSampleLocationNV calloc() {
        return wrap(VkCoarseSampleLocationNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCoarseSampleLocationNV} instance allocated with {@link BufferUtils}. */
    public static VkCoarseSampleLocationNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCoarseSampleLocationNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCoarseSampleLocationNV} instance for the specified memory address. */
    public static VkCoarseSampleLocationNV create(long address) {
        return wrap(VkCoarseSampleLocationNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCoarseSampleLocationNV createSafe(long address) {
        return address == NULL ? null : wrap(VkCoarseSampleLocationNV.class, address);
    }

    /**
     * Returns a new {@link VkCoarseSampleLocationNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleLocationNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleLocationNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCoarseSampleLocationNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCoarseSampleLocationNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCoarseSampleLocationNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCoarseSampleLocationNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleLocationNV malloc(MemoryStack stack) {
        return wrap(VkCoarseSampleLocationNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCoarseSampleLocationNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCoarseSampleLocationNV calloc(MemoryStack stack) {
        return wrap(VkCoarseSampleLocationNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCoarseSampleLocationNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCoarseSampleLocationNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCoarseSampleLocationNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pixelX}. */
    public static int npixelX(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleLocationNV.PIXELX); }
    /** Unsafe version of {@link #pixelY}. */
    public static int npixelY(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleLocationNV.PIXELY); }
    /** Unsafe version of {@link #sample}. */
    public static int nsample(long struct) { return UNSAFE.getInt(null, struct + VkCoarseSampleLocationNV.SAMPLE); }

    /** Unsafe version of {@link #pixelX(int) pixelX}. */
    public static void npixelX(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleLocationNV.PIXELX, value); }
    /** Unsafe version of {@link #pixelY(int) pixelY}. */
    public static void npixelY(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleLocationNV.PIXELY, value); }
    /** Unsafe version of {@link #sample(int) sample}. */
    public static void nsample(long struct, int value) { UNSAFE.putInt(null, struct + VkCoarseSampleLocationNV.SAMPLE, value); }

    // -----------------------------------

    /** An array of {@link VkCoarseSampleLocationNV} structs. */
    public static class Buffer extends StructBuffer<VkCoarseSampleLocationNV, Buffer> implements NativeResource {

        private static final VkCoarseSampleLocationNV ELEMENT_FACTORY = VkCoarseSampleLocationNV.create(-1L);

        /**
         * Creates a new {@code VkCoarseSampleLocationNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCoarseSampleLocationNV#SIZEOF}, and its mark will be undefined.
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
        protected VkCoarseSampleLocationNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCoarseSampleLocationNV#pixelX} field. */
        @NativeType("uint32_t")
        public int pixelX() { return VkCoarseSampleLocationNV.npixelX(address()); }
        /** @return the value of the {@link VkCoarseSampleLocationNV#pixelY} field. */
        @NativeType("uint32_t")
        public int pixelY() { return VkCoarseSampleLocationNV.npixelY(address()); }
        /** @return the value of the {@link VkCoarseSampleLocationNV#sample} field. */
        @NativeType("uint32_t")
        public int sample() { return VkCoarseSampleLocationNV.nsample(address()); }

        /** Sets the specified value to the {@link VkCoarseSampleLocationNV#pixelX} field. */
        public VkCoarseSampleLocationNV.Buffer pixelX(@NativeType("uint32_t") int value) { VkCoarseSampleLocationNV.npixelX(address(), value); return this; }
        /** Sets the specified value to the {@link VkCoarseSampleLocationNV#pixelY} field. */
        public VkCoarseSampleLocationNV.Buffer pixelY(@NativeType("uint32_t") int value) { VkCoarseSampleLocationNV.npixelY(address(), value); return this; }
        /** Sets the specified value to the {@link VkCoarseSampleLocationNV#sample} field. */
        public VkCoarseSampleLocationNV.Buffer sample(@NativeType("uint32_t") int value) { VkCoarseSampleLocationNV.nsample(address(), value); return this; }

    }

}