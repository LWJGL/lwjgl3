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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code triangles} &ndash; contains triangle data if {@link VkGeometryNV}{@code ::geometryType} is {@link NVRayTracing#VK_GEOMETRY_TYPE_TRIANGLES_NV GEOMETRY_TYPE_TRIANGLES_NV}.</li>
 * <li>{@code aabbs} &ndash; contains axis-aligned bounding box data if {@link VkGeometryNV}{@code ::geometryType} is {@link NVRayTracing#VK_GEOMETRY_TYPE_AABBS_NV GEOMETRY_TYPE_AABBS_NV}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryDataNV {
 *     {@link VkGeometryTrianglesNV VkGeometryTrianglesNV} triangles;
 *     {@link VkGeometryAABBNV VkGeometryAABBNV} aabbs;
 * }</code></pre>
 */
public class VkGeometryDataNV extends Struct implements NativeResource {

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

    /** Returns a {@link VkGeometryTrianglesNV} view of the {@code triangles} field. */
    public VkGeometryTrianglesNV triangles() { return ntriangles(address()); }
    /** Returns a {@link VkGeometryAABBNV} view of the {@code aabbs} field. */
    public VkGeometryAABBNV aabbs() { return naabbs(address()); }

    /** Copies the specified {@link VkGeometryTrianglesNV} to the {@code triangles} field. */
    public VkGeometryDataNV triangles(VkGeometryTrianglesNV value) { ntriangles(address(), value); return this; }
    /** Passes the {@code triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryDataNV triangles(java.util.function.Consumer<VkGeometryTrianglesNV> consumer) { consumer.accept(triangles()); return this; }
    /** Copies the specified {@link VkGeometryAABBNV} to the {@code aabbs} field. */
    public VkGeometryDataNV aabbs(VkGeometryAABBNV value) { naabbs(address(), value); return this; }
    /** Passes the {@code aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
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
        return wrap(VkGeometryDataNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGeometryDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryDataNV calloc() {
        return wrap(VkGeometryDataNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGeometryDataNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryDataNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryDataNV} instance for the specified memory address. */
    public static VkGeometryDataNV create(long address) {
        return wrap(VkGeometryDataNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryDataNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryDataNV.class, address);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryDataNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryDataNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryDataNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkGeometryDataNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryDataNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkGeometryDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNV mallocStack(MemoryStack stack) {
        return wrap(VkGeometryDataNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGeometryDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNV callocStack(MemoryStack stack) {
        return wrap(VkGeometryDataNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryDataNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkGeometryTrianglesNV} view of the {@code triangles} field. */
        public VkGeometryTrianglesNV triangles() { return VkGeometryDataNV.ntriangles(address()); }
        /** Returns a {@link VkGeometryAABBNV} view of the {@code aabbs} field. */
        public VkGeometryAABBNV aabbs() { return VkGeometryDataNV.naabbs(address()); }

        /** Copies the specified {@link VkGeometryTrianglesNV} to the {@code triangles} field. */
        public VkGeometryDataNV.Buffer triangles(VkGeometryTrianglesNV value) { VkGeometryDataNV.ntriangles(address(), value); return this; }
        /** Passes the {@code triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNV.Buffer triangles(java.util.function.Consumer<VkGeometryTrianglesNV> consumer) { consumer.accept(triangles()); return this; }
        /** Copies the specified {@link VkGeometryAABBNV} to the {@code aabbs} field. */
        public VkGeometryDataNV.Buffer aabbs(VkGeometryAABBNV value) { VkGeometryDataNV.naabbs(address(), value); return this; }
        /** Passes the {@code aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNV.Buffer aabbs(java.util.function.Consumer<VkGeometryAABBNV> consumer) { consumer.accept(aabbs()); return this; }

    }

}