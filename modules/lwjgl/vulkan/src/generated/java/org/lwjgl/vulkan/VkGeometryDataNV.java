/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying geometry in a bottom-level acceleration structure.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code triangles} <b>must</b> be a valid {@link VkGeometryTrianglesNV} structure</li>
 * <li>{@code aabbs} <b>must</b> be a valid {@link VkGeometryAABBNV} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeometryAABBNV}, {@link VkGeometryNV}, {@link VkGeometryTrianglesNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryDataNV {
 *     {@link VkGeometryTrianglesNV VkGeometryTrianglesNV} {@link #triangles};
 *     {@link VkGeometryAABBNV VkGeometryAABBNV} {@link #aabbs};
 * }</code></pre>
 */
public class VkGeometryDataNV extends Struct<VkGeometryDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRIANGLES,
        AABBS;

    static {
        Layout layout = __struct(
            __member(VkGeometryTrianglesNV.SIZEOF, VkGeometryTrianglesNV.ALIGNOF),
            __member(VkGeometryAABBNV.SIZEOF, VkGeometryAABBNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRIANGLES = layout.offsetof(0);
        AABBS = layout.offsetof(1);
    }

    protected VkGeometryDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeometryDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeometryDataNV(address, container);
    }

    /**
     * Creates a {@code VkGeometryDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** contains triangle data if {@link VkGeometryNV}{@code ::geometryType} is {@link NVRayTracing#VK_GEOMETRY_TYPE_TRIANGLES_NV GEOMETRY_TYPE_TRIANGLES_NV}. */
    public VkGeometryTrianglesNV triangles() { return ntriangles(address()); }
    /** contains axis-aligned bounding box data if {@link VkGeometryNV}{@code ::geometryType} is {@link NVRayTracing#VK_GEOMETRY_TYPE_AABBS_NV GEOMETRY_TYPE_AABBS_NV}. */
    public VkGeometryAABBNV aabbs() { return naabbs(address()); }

    /** Copies the specified {@link VkGeometryTrianglesNV} to the {@link #triangles} field. */
    public VkGeometryDataNV triangles(VkGeometryTrianglesNV value) { ntriangles(address(), value); return this; }
    /** Passes the {@link #triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryDataNV triangles(java.util.function.Consumer<VkGeometryTrianglesNV> consumer) { consumer.accept(triangles()); return this; }
    /** Copies the specified {@link VkGeometryAABBNV} to the {@link #aabbs} field. */
    public VkGeometryDataNV aabbs(VkGeometryAABBNV value) { naabbs(address(), value); return this; }
    /** Passes the {@link #aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryDataNV aabbs(java.util.function.Consumer<VkGeometryAABBNV> consumer) { consumer.accept(aabbs()); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryDataNV set(
        VkGeometryTrianglesNV triangles,
        VkGeometryAABBNV aabbs
    ) {
        triangles(triangles);
        aabbs(aabbs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeometryDataNV set(VkGeometryDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryDataNV malloc() {
        return new VkGeometryDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryDataNV calloc() {
        return new VkGeometryDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryDataNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryDataNV} instance for the specified memory address. */
    public static VkGeometryDataNV create(long address) {
        return new VkGeometryDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeometryDataNV createSafe(long address) {
        return address == NULL ? null : new VkGeometryDataNV(address, null);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeometryDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeometryDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryDataNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGeometryDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNV malloc(MemoryStack stack) {
        return new VkGeometryDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeometryDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNV calloc(MemoryStack stack) {
        return new VkGeometryDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #triangles}. */
    public static VkGeometryTrianglesNV ntriangles(long struct) { return VkGeometryTrianglesNV.create(struct + VkGeometryDataNV.TRIANGLES); }
    /** Unsafe version of {@link #aabbs}. */
    public static VkGeometryAABBNV naabbs(long struct) { return VkGeometryAABBNV.create(struct + VkGeometryDataNV.AABBS); }

    /** Unsafe version of {@link #triangles(VkGeometryTrianglesNV) triangles}. */
    public static void ntriangles(long struct, VkGeometryTrianglesNV value) { memCopy(value.address(), struct + VkGeometryDataNV.TRIANGLES, VkGeometryTrianglesNV.SIZEOF); }
    /** Unsafe version of {@link #aabbs(VkGeometryAABBNV) aabbs}. */
    public static void naabbs(long struct, VkGeometryAABBNV value) { memCopy(value.address(), struct + VkGeometryDataNV.AABBS, VkGeometryAABBNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkGeometryDataNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryDataNV, Buffer> implements NativeResource {

        private static final VkGeometryDataNV ELEMENT_FACTORY = VkGeometryDataNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkGeometryDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkGeometryTrianglesNV} view of the {@link VkGeometryDataNV#triangles} field. */
        public VkGeometryTrianglesNV triangles() { return VkGeometryDataNV.ntriangles(address()); }
        /** @return a {@link VkGeometryAABBNV} view of the {@link VkGeometryDataNV#aabbs} field. */
        public VkGeometryAABBNV aabbs() { return VkGeometryDataNV.naabbs(address()); }

        /** Copies the specified {@link VkGeometryTrianglesNV} to the {@link VkGeometryDataNV#triangles} field. */
        public VkGeometryDataNV.Buffer triangles(VkGeometryTrianglesNV value) { VkGeometryDataNV.ntriangles(address(), value); return this; }
        /** Passes the {@link VkGeometryDataNV#triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNV.Buffer triangles(java.util.function.Consumer<VkGeometryTrianglesNV> consumer) { consumer.accept(triangles()); return this; }
        /** Copies the specified {@link VkGeometryAABBNV} to the {@link VkGeometryDataNV#aabbs} field. */
        public VkGeometryDataNV.Buffer aabbs(VkGeometryAABBNV value) { VkGeometryDataNV.naabbs(address(), value); return this; }
        /** Passes the {@link VkGeometryDataNV#aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNV.Buffer aabbs(java.util.function.Consumer<VkGeometryAABBNV> consumer) { consumer.accept(aabbs()); return this; }

    }

}