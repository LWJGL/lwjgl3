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
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code triangles} <b>must</b> be a valid {@link VkGeometryTrianglesNVX} structure</li>
 * <li>{@code aabbs} <b>must</b> be a valid {@link VkGeometryAABBNVX} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeometryAABBNVX}, {@link VkGeometryNVX}, {@link VkGeometryTrianglesNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code triangles} &ndash; contains triangle data if {@code geometryType} is {@link NVXRaytracing#VK_GEOMETRY_TYPE_TRIANGLES_NVX GEOMETRY_TYPE_TRIANGLES_NVX}.</li>
 * <li>{@code aabbs} &ndash; contains axis-aligned bounding box data if {@code geometryType} is {@link NVXRaytracing#VK_GEOMETRY_TYPE_AABBS_NVX GEOMETRY_TYPE_AABBS_NVX}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryDataNVX {
 *     {@link VkGeometryTrianglesNVX VkGeometryTrianglesNVX} triangles;
 *     {@link VkGeometryAABBNVX VkGeometryAABBNVX} aabbs;
 * }</code></pre>
 */
public class VkGeometryDataNVX extends Struct implements NativeResource {

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
            __member(VkGeometryTrianglesNVX.SIZEOF, VkGeometryTrianglesNVX.ALIGNOF),
            __member(VkGeometryAABBNVX.SIZEOF, VkGeometryAABBNVX.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRIANGLES = layout.offsetof(0);
        AABBS = layout.offsetof(1);
    }

    /**
     * Creates a {@link VkGeometryDataNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryDataNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkGeometryTrianglesNVX} view of the {@code triangles} field. */
    public VkGeometryTrianglesNVX triangles() { return ntriangles(address()); }
    /** Passes the {@code triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryDataNVX triangles(java.util.function.Consumer<VkGeometryTrianglesNVX> consumer) { consumer.accept(triangles()); return this; }
    /** Returns a {@link VkGeometryAABBNVX} view of the {@code aabbs} field. */
    public VkGeometryAABBNVX aabbs() { return naabbs(address()); }
    /** Passes the {@code aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkGeometryDataNVX aabbs(java.util.function.Consumer<VkGeometryAABBNVX> consumer) { consumer.accept(aabbs()); return this; }

    /** Copies the specified {@link VkGeometryTrianglesNVX} to the {@code triangles} field. */
    public VkGeometryDataNVX triangles(VkGeometryTrianglesNVX value) { ntriangles(address(), value); return this; }
    /** Copies the specified {@link VkGeometryAABBNVX} to the {@code aabbs} field. */
    public VkGeometryDataNVX aabbs(VkGeometryAABBNVX value) { naabbs(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryDataNVX set(
        VkGeometryTrianglesNVX triangles,
        VkGeometryAABBNVX aabbs
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
    public VkGeometryDataNVX set(VkGeometryDataNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryDataNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryDataNVX malloc() {
        return wrap(VkGeometryDataNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkGeometryDataNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryDataNVX calloc() {
        return wrap(VkGeometryDataNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkGeometryDataNVX} instance allocated with {@link BufferUtils}. */
    public static VkGeometryDataNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryDataNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkGeometryDataNVX} instance for the specified memory address. */
    public static VkGeometryDataNVX create(long address) {
        return wrap(VkGeometryDataNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryDataNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryDataNVX.class, address);
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryDataNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryDataNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryDataNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryDataNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkGeometryDataNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryDataNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkGeometryDataNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNVX mallocStack(MemoryStack stack) {
        return wrap(VkGeometryDataNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryDataNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryDataNVX callocStack(MemoryStack stack) {
        return wrap(VkGeometryDataNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryDataNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryDataNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #triangles}. */
    public static VkGeometryTrianglesNVX ntriangles(long struct) { return VkGeometryTrianglesNVX.create(struct + VkGeometryDataNVX.TRIANGLES); }
    /** Unsafe version of {@link #aabbs}. */
    public static VkGeometryAABBNVX naabbs(long struct) { return VkGeometryAABBNVX.create(struct + VkGeometryDataNVX.AABBS); }

    /** Unsafe version of {@link #triangles(VkGeometryTrianglesNVX) triangles}. */
    public static void ntriangles(long struct, VkGeometryTrianglesNVX value) { memCopy(value.address(), struct + VkGeometryDataNVX.TRIANGLES, VkGeometryTrianglesNVX.SIZEOF); }
    /** Unsafe version of {@link #aabbs(VkGeometryAABBNVX) aabbs}. */
    public static void naabbs(long struct, VkGeometryAABBNVX value) { memCopy(value.address(), struct + VkGeometryDataNVX.AABBS, VkGeometryAABBNVX.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkGeometryDataNVX} structs. */
    public static class Buffer extends StructBuffer<VkGeometryDataNVX, Buffer> implements NativeResource {

        private static final VkGeometryDataNVX ELEMENT_FACTORY = VkGeometryDataNVX.create(-1L);

        /**
         * Creates a new {@link VkGeometryDataNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryDataNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryDataNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkGeometryTrianglesNVX} view of the {@code triangles} field. */
        public VkGeometryTrianglesNVX triangles() { return VkGeometryDataNVX.ntriangles(address()); }
        /** Passes the {@code triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNVX.Buffer triangles(java.util.function.Consumer<VkGeometryTrianglesNVX> consumer) { consumer.accept(triangles()); return this; }
        /** Returns a {@link VkGeometryAABBNVX} view of the {@code aabbs} field. */
        public VkGeometryAABBNVX aabbs() { return VkGeometryDataNVX.naabbs(address()); }
        /** Passes the {@code aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkGeometryDataNVX.Buffer aabbs(java.util.function.Consumer<VkGeometryAABBNVX> consumer) { consumer.accept(aabbs()); return this; }

        /** Copies the specified {@link VkGeometryTrianglesNVX} to the {@code triangles} field. */
        public VkGeometryDataNVX.Buffer triangles(VkGeometryTrianglesNVX value) { VkGeometryDataNVX.ntriangles(address(), value); return this; }
        /** Copies the specified {@link VkGeometryAABBNVX} to the {@code aabbs} field. */
        public VkGeometryDataNVX.Buffer aabbs(VkGeometryAABBNVX value) { VkGeometryDataNVX.naabbs(address(), value); return this; }

    }

}