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
 * Structure specifying geometries to be built into an acceleration structure.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code geometryType} <b>must</b> be a valid {@code VkGeometryTypeKHR} value</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the {@code triangles} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, the {@code aabbs} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryAabbsDataKHR} structure</li>
 * <li>If {@code geometryType} is {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the {@code instances} member of {@code geometry} <b>must</b> be a valid {@link VkAccelerationStructureGeometryInstancesDataKHR} structure</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkGeometryFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkAccelerationStructureGeometryDataKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureGeometryKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkGeometryTypeKHR {@link #geometryType};
 *     {@link VkAccelerationStructureGeometryDataKHR VkAccelerationStructureGeometryDataKHR} {@link #geometry};
 *     VkGeometryFlagsKHR {@link #flags};
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryKHR extends Struct<VkAccelerationStructureGeometryKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GEOMETRYTYPE,
        GEOMETRY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkAccelerationStructureGeometryDataKHR.SIZEOF, VkAccelerationStructureGeometryDataKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GEOMETRYTYPE = layout.offsetof(2);
        GEOMETRY = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkAccelerationStructureGeometryKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** describes which type of geometry this {@link VkAccelerationStructureGeometryKHR} refers to. */
    @NativeType("VkGeometryTypeKHR")
    public int geometryType() { return ngeometryType(address()); }
    /** a {@link VkAccelerationStructureGeometryDataKHR} union describing the geometry data for the relevant geometry type. */
    public VkAccelerationStructureGeometryDataKHR geometry() { return ngeometry(address()); }
    /** a bitmask of {@code VkGeometryFlagBitsKHR} values describing additional properties of how the geometry should be built. */
    @NativeType("VkGeometryFlagsKHR")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR} value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureGeometryKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #geometryType} field. */
    public VkAccelerationStructureGeometryKHR geometryType(@NativeType("VkGeometryTypeKHR") int value) { ngeometryType(address(), value); return this; }
    /** Copies the specified {@link VkAccelerationStructureGeometryDataKHR} to the {@link #geometry} field. */
    public VkAccelerationStructureGeometryKHR geometry(VkAccelerationStructureGeometryDataKHR value) { ngeometry(address(), value); return this; }
    /** Passes the {@link #geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryKHR geometry(java.util.function.Consumer<VkAccelerationStructureGeometryDataKHR> consumer) { consumer.accept(geometry()); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkAccelerationStructureGeometryKHR flags(@NativeType("VkGeometryFlagsKHR") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryKHR set(
        int sType,
        long pNext,
        int geometryType,
        VkAccelerationStructureGeometryDataKHR geometry,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        geometryType(geometryType);
        geometry(geometry);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryKHR set(VkAccelerationStructureGeometryKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryKHR malloc() {
        return new VkAccelerationStructureGeometryKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryKHR calloc() {
        return new VkAccelerationStructureGeometryKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryKHR create(long address) {
        return new VkAccelerationStructureGeometryKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryKHR.PNEXT); }
    /** Unsafe version of {@link #geometryType}. */
    public static int ngeometryType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryKHR.GEOMETRYTYPE); }
    /** Unsafe version of {@link #geometry}. */
    public static VkAccelerationStructureGeometryDataKHR ngeometry(long struct) { return VkAccelerationStructureGeometryDataKHR.create(struct + VkAccelerationStructureGeometryKHR.GEOMETRY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryKHR.PNEXT, value); }
    /** Unsafe version of {@link #geometryType(int) geometryType}. */
    public static void ngeometryType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryKHR.GEOMETRYTYPE, value); }
    /** Unsafe version of {@link #geometry(VkAccelerationStructureGeometryDataKHR) geometry}. */
    public static void ngeometry(long struct, VkAccelerationStructureGeometryDataKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryKHR.GEOMETRY, VkAccelerationStructureGeometryDataKHR.SIZEOF); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryKHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureGeometryKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryKHR#geometryType} field. */
        @NativeType("VkGeometryTypeKHR")
        public int geometryType() { return VkAccelerationStructureGeometryKHR.ngeometryType(address()); }
        /** @return a {@link VkAccelerationStructureGeometryDataKHR} view of the {@link VkAccelerationStructureGeometryKHR#geometry} field. */
        public VkAccelerationStructureGeometryDataKHR geometry() { return VkAccelerationStructureGeometryKHR.ngeometry(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryKHR#flags} field. */
        @NativeType("VkGeometryFlagsKHR")
        public int flags() { return VkAccelerationStructureGeometryKHR.nflags(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureGeometryKHR#sType} field. */
        public VkAccelerationStructureGeometryKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR} value to the {@link VkAccelerationStructureGeometryKHR#sType} field. */
        public VkAccelerationStructureGeometryKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_KHR); }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryKHR#pNext} field. */
        public VkAccelerationStructureGeometryKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryKHR#geometryType} field. */
        public VkAccelerationStructureGeometryKHR.Buffer geometryType(@NativeType("VkGeometryTypeKHR") int value) { VkAccelerationStructureGeometryKHR.ngeometryType(address(), value); return this; }
        /** Copies the specified {@link VkAccelerationStructureGeometryDataKHR} to the {@link VkAccelerationStructureGeometryKHR#geometry} field. */
        public VkAccelerationStructureGeometryKHR.Buffer geometry(VkAccelerationStructureGeometryDataKHR value) { VkAccelerationStructureGeometryKHR.ngeometry(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryKHR#geometry} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryKHR.Buffer geometry(java.util.function.Consumer<VkAccelerationStructureGeometryDataKHR> consumer) { consumer.accept(geometry()); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryKHR#flags} field. */
        public VkAccelerationStructureGeometryKHR.Buffer flags(@NativeType("VkGeometryFlagsKHR") int value) { VkAccelerationStructureGeometryKHR.nflags(address(), value); return this; }

    }

}