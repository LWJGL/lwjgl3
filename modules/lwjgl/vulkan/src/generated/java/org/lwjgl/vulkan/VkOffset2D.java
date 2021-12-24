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
 * Structure specifying a two-dimensional offset.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayPlaneCapabilitiesKHR}, {@link VkRect2D}, {@link VkRectLayerKHR}, {@link VkSubpassFragmentDensityMapOffsetEndInfoQCOM}, {@link VkVideoDecodeH264CapabilitiesEXT}, {@link VkVideoDecodeInfoKHR}, {@link VkVideoPictureResourceKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkOffset2D {
 *     int32_t {@link #x};
 *     int32_t {@link #y};
 * }</code></pre>
 */
public class VkOffset2D extends Struct implements NativeResource {

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
     * Creates a {@code VkOffset2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOffset2D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x offset. */
    @NativeType("int32_t")
    public int x() { return nx(address()); }
    /** the y offset. */
    @NativeType("int32_t")
    public int y() { return ny(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public VkOffset2D x(@NativeType("int32_t") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public VkOffset2D y(@NativeType("int32_t") int value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOffset2D set(
        int x,
        int y
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
    public VkOffset2D set(VkOffset2D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOffset2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOffset2D malloc() {
        return wrap(VkOffset2D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkOffset2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOffset2D calloc() {
        return wrap(VkOffset2D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkOffset2D} instance allocated with {@link BufferUtils}. */
    public static VkOffset2D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkOffset2D.class, memAddress(container), container);
    }

    /** Returns a new {@code VkOffset2D} instance for the specified memory address. */
    public static VkOffset2D create(long address) {
        return wrap(VkOffset2D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOffset2D createSafe(long address) {
        return address == NULL ? null : wrap(VkOffset2D.class, address);
    }

    /**
     * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOffset2D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkOffset2D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOffset2D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkOffset2D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkOffset2D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkOffset2D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkOffset2D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkOffset2D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkOffset2D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkOffset2D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkOffset2D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkOffset2D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOffset2D malloc(MemoryStack stack) {
        return wrap(VkOffset2D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkOffset2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOffset2D calloc(MemoryStack stack) {
        return wrap(VkOffset2D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkOffset2D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOffset2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOffset2D.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + VkOffset2D.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + VkOffset2D.Y); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + VkOffset2D.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + VkOffset2D.Y, value); }

    // -----------------------------------

    /** An array of {@link VkOffset2D} structs. */
    public static class Buffer extends StructBuffer<VkOffset2D, Buffer> implements NativeResource {

        private static final VkOffset2D ELEMENT_FACTORY = VkOffset2D.create(-1L);

        /**
         * Creates a new {@code VkOffset2D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOffset2D#SIZEOF}, and its mark will be undefined.
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
        protected VkOffset2D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkOffset2D#x} field. */
        @NativeType("int32_t")
        public int x() { return VkOffset2D.nx(address()); }
        /** @return the value of the {@link VkOffset2D#y} field. */
        @NativeType("int32_t")
        public int y() { return VkOffset2D.ny(address()); }

        /** Sets the specified value to the {@link VkOffset2D#x} field. */
        public VkOffset2D.Buffer x(@NativeType("int32_t") int value) { VkOffset2D.nx(address(), value); return this; }
        /** Sets the specified value to the {@link VkOffset2D#y} field. */
        public VkOffset2D.Buffer y(@NativeType("int32_t") int value) { VkOffset2D.ny(address(), value); return this; }

    }

}