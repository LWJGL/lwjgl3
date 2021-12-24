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
 * Specify X,Y chromaticity coordinates.
 * 
 * <h5>Description</h5>
 * 
 * <p>Chromaticity coordinates are as specified in CIE 15:2004 “{@code Calculation of chromaticity coordinates}” (Section 7.3) and are limited to between 0 and 1 for real colors for the reference monitor.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkHdrMetadataEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkXYColorEXT {
 *     float {@link #x};
 *     float {@link #y};
 * }</code></pre>
 */
public class VkXYColorEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkXYColorEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkXYColorEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the <code>x</code> chromaticity coordinate. */
    public float x() { return nx(address()); }
    /** the <code>y</code> chromaticity coordinate. */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public VkXYColorEXT x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public VkXYColorEXT y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkXYColorEXT set(
        float x,
        float y
    ) {
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkXYColorEXT set(VkXYColorEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkXYColorEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkXYColorEXT malloc() {
        return wrap(VkXYColorEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkXYColorEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkXYColorEXT calloc() {
        return wrap(VkXYColorEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkXYColorEXT} instance allocated with {@link BufferUtils}. */
    public static VkXYColorEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkXYColorEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkXYColorEXT} instance for the specified memory address. */
    public static VkXYColorEXT create(long address) {
        return wrap(VkXYColorEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXYColorEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkXYColorEXT.class, address);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkXYColorEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkXYColorEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkXYColorEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkXYColorEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXYColorEXT malloc(MemoryStack stack) {
        return wrap(VkXYColorEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkXYColorEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkXYColorEXT calloc(MemoryStack stack) {
        return wrap(VkXYColorEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkXYColorEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkXYColorEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + VkXYColorEXT.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + VkXYColorEXT.Y); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + VkXYColorEXT.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + VkXYColorEXT.Y, value); }

    // -----------------------------------

    /** An array of {@link VkXYColorEXT} structs. */
    public static class Buffer extends StructBuffer<VkXYColorEXT, Buffer> implements NativeResource {

        private static final VkXYColorEXT ELEMENT_FACTORY = VkXYColorEXT.create(-1L);

        /**
         * Creates a new {@code VkXYColorEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkXYColorEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkXYColorEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkXYColorEXT#x} field. */
        public float x() { return VkXYColorEXT.nx(address()); }
        /** @return the value of the {@link VkXYColorEXT#y} field. */
        public float y() { return VkXYColorEXT.ny(address()); }

        /** Sets the specified value to the {@link VkXYColorEXT#x} field. */
        public VkXYColorEXT.Buffer x(float value) { VkXYColorEXT.nx(address(), value); return this; }
        /** Sets the specified value to the {@link VkXYColorEXT#y} field. */
        public VkXYColorEXT.Buffer y(float value) { VkXYColorEXT.ny(address(), value); return this; }

    }

}