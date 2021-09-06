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
 * Structure specifying a viewport swizzle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code x} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code y} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code z} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * <li>{@code w} <b>must</b> be a valid {@code VkViewportCoordinateSwizzleNV} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineViewportSwizzleStateCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkViewportSwizzleNV {
 *     VkViewportCoordinateSwizzleNV {@link #x};
 *     VkViewportCoordinateSwizzleNV {@link #y};
 *     VkViewportCoordinateSwizzleNV {@link #z};
 *     VkViewportCoordinateSwizzleNV {@link #w};
 * }</code></pre>
 */
public class VkViewportSwizzleNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z,
        W;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        W = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkViewportSwizzleNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkViewportSwizzleNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the x component of the primitive */
    @NativeType("VkViewportCoordinateSwizzleNV")
    public int x() { return nx(address()); }
    /** a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the y component of the primitive */
    @NativeType("VkViewportCoordinateSwizzleNV")
    public int y() { return ny(address()); }
    /** a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the z component of the primitive */
    @NativeType("VkViewportCoordinateSwizzleNV")
    public int z() { return nz(address()); }
    /** a {@code VkViewportCoordinateSwizzleNV} value specifying the swizzle operation to apply to the w component of the primitive */
    @NativeType("VkViewportCoordinateSwizzleNV")
    public int w() { return nw(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public VkViewportSwizzleNV x(@NativeType("VkViewportCoordinateSwizzleNV") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public VkViewportSwizzleNV y(@NativeType("VkViewportCoordinateSwizzleNV") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public VkViewportSwizzleNV z(@NativeType("VkViewportCoordinateSwizzleNV") int value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@link #w} field. */
    public VkViewportSwizzleNV w(@NativeType("VkViewportCoordinateSwizzleNV") int value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkViewportSwizzleNV set(
        int x,
        int y,
        int z,
        int w
    ) {
        x(x);
        y(y);
        z(z);
        w(w);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkViewportSwizzleNV set(VkViewportSwizzleNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkViewportSwizzleNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkViewportSwizzleNV malloc() {
        return wrap(VkViewportSwizzleNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkViewportSwizzleNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkViewportSwizzleNV calloc() {
        return wrap(VkViewportSwizzleNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkViewportSwizzleNV} instance allocated with {@link BufferUtils}. */
    public static VkViewportSwizzleNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkViewportSwizzleNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkViewportSwizzleNV} instance for the specified memory address. */
    public static VkViewportSwizzleNV create(long address) {
        return wrap(VkViewportSwizzleNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewportSwizzleNV createSafe(long address) {
        return address == NULL ? null : wrap(VkViewportSwizzleNV.class, address);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkViewportSwizzleNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewportSwizzleNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportSwizzleNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkViewportSwizzleNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportSwizzleNV malloc(MemoryStack stack) {
        return wrap(VkViewportSwizzleNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkViewportSwizzleNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportSwizzleNV calloc(MemoryStack stack) {
        return wrap(VkViewportSwizzleNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportSwizzleNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewportSwizzleNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + VkViewportSwizzleNV.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + VkViewportSwizzleNV.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return UNSAFE.getInt(null, struct + VkViewportSwizzleNV.Z); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + VkViewportSwizzleNV.W); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + VkViewportSwizzleNV.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + VkViewportSwizzleNV.Y, value); }
    /** Unsafe version of {@link #z(int) z}. */
    public static void nz(long struct, int value) { UNSAFE.putInt(null, struct + VkViewportSwizzleNV.Z, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + VkViewportSwizzleNV.W, value); }

    // -----------------------------------

    /** An array of {@link VkViewportSwizzleNV} structs. */
    public static class Buffer extends StructBuffer<VkViewportSwizzleNV, Buffer> implements NativeResource {

        private static final VkViewportSwizzleNV ELEMENT_FACTORY = VkViewportSwizzleNV.create(-1L);

        /**
         * Creates a new {@code VkViewportSwizzleNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkViewportSwizzleNV#SIZEOF}, and its mark will be undefined.
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
        protected VkViewportSwizzleNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkViewportSwizzleNV#x} field. */
        @NativeType("VkViewportCoordinateSwizzleNV")
        public int x() { return VkViewportSwizzleNV.nx(address()); }
        /** @return the value of the {@link VkViewportSwizzleNV#y} field. */
        @NativeType("VkViewportCoordinateSwizzleNV")
        public int y() { return VkViewportSwizzleNV.ny(address()); }
        /** @return the value of the {@link VkViewportSwizzleNV#z} field. */
        @NativeType("VkViewportCoordinateSwizzleNV")
        public int z() { return VkViewportSwizzleNV.nz(address()); }
        /** @return the value of the {@link VkViewportSwizzleNV#w} field. */
        @NativeType("VkViewportCoordinateSwizzleNV")
        public int w() { return VkViewportSwizzleNV.nw(address()); }

        /** Sets the specified value to the {@link VkViewportSwizzleNV#x} field. */
        public VkViewportSwizzleNV.Buffer x(@NativeType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.nx(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewportSwizzleNV#y} field. */
        public VkViewportSwizzleNV.Buffer y(@NativeType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.ny(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewportSwizzleNV#z} field. */
        public VkViewportSwizzleNV.Buffer z(@NativeType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.nz(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewportSwizzleNV#w} field. */
        public VkViewportSwizzleNV.Buffer w(@NativeType("VkViewportCoordinateSwizzleNV") int value) { VkViewportSwizzleNV.nw(address(), value); return this; }

    }

}