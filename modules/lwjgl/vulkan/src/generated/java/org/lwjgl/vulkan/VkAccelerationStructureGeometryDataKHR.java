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
 * Union specifying acceleration structure geometry data.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureGeometryAabbsDataKHR}, {@link VkAccelerationStructureGeometryInstancesDataKHR}, {@link VkAccelerationStructureGeometryKHR}, {@link VkAccelerationStructureGeometryTrianglesDataKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkAccelerationStructureGeometryDataKHR {
 *     {@link VkAccelerationStructureGeometryTrianglesDataKHR VkAccelerationStructureGeometryTrianglesDataKHR} {@link #triangles};
 *     {@link VkAccelerationStructureGeometryAabbsDataKHR VkAccelerationStructureGeometryAabbsDataKHR} {@link #aabbs};
 *     {@link VkAccelerationStructureGeometryInstancesDataKHR VkAccelerationStructureGeometryInstancesDataKHR} {@link #instances};
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryDataKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRIANGLES,
        AABBS,
        INSTANCES;

    static {
        Layout layout = __union(
            __member(VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF, VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF),
            __member(VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF, VkAccelerationStructureGeometryAabbsDataKHR.ALIGNOF),
            __member(VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF, VkAccelerationStructureGeometryInstancesDataKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRIANGLES = layout.offsetof(0);
        AABBS = layout.offsetof(1);
        INSTANCES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryDataKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure. */
    public VkAccelerationStructureGeometryTrianglesDataKHR triangles() { return ntriangles(address()); }
    /** a {@link VkAccelerationStructureGeometryAabbsDataKHR} struture. */
    public VkAccelerationStructureGeometryAabbsDataKHR aabbs() { return naabbs(address()); }
    /** a {@link VkAccelerationStructureGeometryInstancesDataKHR} structure. */
    public VkAccelerationStructureGeometryInstancesDataKHR instances() { return ninstances(address()); }

    /** Copies the specified {@link VkAccelerationStructureGeometryTrianglesDataKHR} to the {@link #triangles} field. */
    public VkAccelerationStructureGeometryDataKHR triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) { ntriangles(address(), value); return this; }
    /** Passes the {@link #triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryDataKHR triangles(java.util.function.Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> consumer) { consumer.accept(triangles()); return this; }
    /** Copies the specified {@link VkAccelerationStructureGeometryAabbsDataKHR} to the {@link #aabbs} field. */
    public VkAccelerationStructureGeometryDataKHR aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) { naabbs(address(), value); return this; }
    /** Passes the {@link #aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryDataKHR aabbs(java.util.function.Consumer<VkAccelerationStructureGeometryAabbsDataKHR> consumer) { consumer.accept(aabbs()); return this; }
    /** Copies the specified {@link VkAccelerationStructureGeometryInstancesDataKHR} to the {@link #instances} field. */
    public VkAccelerationStructureGeometryDataKHR instances(VkAccelerationStructureGeometryInstancesDataKHR value) { ninstances(address(), value); return this; }
    /** Passes the {@link #instances} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryDataKHR instances(java.util.function.Consumer<VkAccelerationStructureGeometryInstancesDataKHR> consumer) { consumer.accept(instances()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryDataKHR set(VkAccelerationStructureGeometryDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryDataKHR malloc() {
        return wrap(VkAccelerationStructureGeometryDataKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryDataKHR calloc() {
        return wrap(VkAccelerationStructureGeometryDataKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureGeometryDataKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryDataKHR create(long address) {
        return wrap(VkAccelerationStructureGeometryDataKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryDataKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureGeometryDataKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryDataKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryDataKHR malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryDataKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryDataKHR calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryDataKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #triangles}. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR ntriangles(long struct) { return VkAccelerationStructureGeometryTrianglesDataKHR.create(struct + VkAccelerationStructureGeometryDataKHR.TRIANGLES); }
    /** Unsafe version of {@link #aabbs}. */
    public static VkAccelerationStructureGeometryAabbsDataKHR naabbs(long struct) { return VkAccelerationStructureGeometryAabbsDataKHR.create(struct + VkAccelerationStructureGeometryDataKHR.AABBS); }
    /** Unsafe version of {@link #instances}. */
    public static VkAccelerationStructureGeometryInstancesDataKHR ninstances(long struct) { return VkAccelerationStructureGeometryInstancesDataKHR.create(struct + VkAccelerationStructureGeometryDataKHR.INSTANCES); }

    /** Unsafe version of {@link #triangles(VkAccelerationStructureGeometryTrianglesDataKHR) triangles}. */
    public static void ntriangles(long struct, VkAccelerationStructureGeometryTrianglesDataKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryDataKHR.TRIANGLES, VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF); }
    /** Unsafe version of {@link #aabbs(VkAccelerationStructureGeometryAabbsDataKHR) aabbs}. */
    public static void naabbs(long struct, VkAccelerationStructureGeometryAabbsDataKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryDataKHR.AABBS, VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF); }
    /** Unsafe version of {@link #instances(VkAccelerationStructureGeometryInstancesDataKHR) instances}. */
    public static void ninstances(long struct, VkAccelerationStructureGeometryInstancesDataKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryDataKHR.INSTANCES, VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryDataKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryDataKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryDataKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryDataKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureGeometryDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkAccelerationStructureGeometryTrianglesDataKHR} view of the {@link VkAccelerationStructureGeometryDataKHR#triangles} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR triangles() { return VkAccelerationStructureGeometryDataKHR.ntriangles(address()); }
        /** @return a {@link VkAccelerationStructureGeometryAabbsDataKHR} view of the {@link VkAccelerationStructureGeometryDataKHR#aabbs} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR aabbs() { return VkAccelerationStructureGeometryDataKHR.naabbs(address()); }
        /** @return a {@link VkAccelerationStructureGeometryInstancesDataKHR} view of the {@link VkAccelerationStructureGeometryDataKHR#instances} field. */
        public VkAccelerationStructureGeometryInstancesDataKHR instances() { return VkAccelerationStructureGeometryDataKHR.ninstances(address()); }

        /** Copies the specified {@link VkAccelerationStructureGeometryTrianglesDataKHR} to the {@link VkAccelerationStructureGeometryDataKHR#triangles} field. */
        public VkAccelerationStructureGeometryDataKHR.Buffer triangles(VkAccelerationStructureGeometryTrianglesDataKHR value) { VkAccelerationStructureGeometryDataKHR.ntriangles(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryDataKHR#triangles} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryDataKHR.Buffer triangles(java.util.function.Consumer<VkAccelerationStructureGeometryTrianglesDataKHR> consumer) { consumer.accept(triangles()); return this; }
        /** Copies the specified {@link VkAccelerationStructureGeometryAabbsDataKHR} to the {@link VkAccelerationStructureGeometryDataKHR#aabbs} field. */
        public VkAccelerationStructureGeometryDataKHR.Buffer aabbs(VkAccelerationStructureGeometryAabbsDataKHR value) { VkAccelerationStructureGeometryDataKHR.naabbs(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryDataKHR#aabbs} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryDataKHR.Buffer aabbs(java.util.function.Consumer<VkAccelerationStructureGeometryAabbsDataKHR> consumer) { consumer.accept(aabbs()); return this; }
        /** Copies the specified {@link VkAccelerationStructureGeometryInstancesDataKHR} to the {@link VkAccelerationStructureGeometryDataKHR#instances} field. */
        public VkAccelerationStructureGeometryDataKHR.Buffer instances(VkAccelerationStructureGeometryInstancesDataKHR value) { VkAccelerationStructureGeometryDataKHR.ninstances(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryDataKHR#instances} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryDataKHR.Buffer instances(java.util.function.Consumer<VkAccelerationStructureGeometryInstancesDataKHR> consumer) { consumer.accept(instances()); return this; }

    }

}