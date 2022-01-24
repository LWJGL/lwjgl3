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
 * Structure specifying vertex motion in a bottom-level acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} is included in the {@code pNext} chain of a {@link VkAccelerationStructureGeometryTrianglesDataKHR} structure, the basic vertex positions are used for the position of the triangles in the geometry at time 0.0 and the {@code vertexData} in {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} is used for the vertex positions at time 1.0, with positions linearly interpolated at intermediate times.</p>
 * 
 * <p>Indexing for {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} {@code vertexData} is equivalent to the basic vertex position data.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureGeometryMotionTrianglesDataNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #vertexData};
 * }</code></pre>
 */
public class VkAccelerationStructureGeometryMotionTrianglesDataNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a pointer to vertex data for this geometry at time 1.0 */
    public VkDeviceOrHostAddressConstKHR vertexData() { return nvertexData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV} value to the {@link #sType} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #vertexData} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(VkDeviceOrHostAddressConstKHR value) { nvertexData(address(), value); return this; }
    /** Passes the {@link #vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR vertexData
    ) {
        sType(sType);
        pNext(pNext);
        vertexData(vertexData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(VkAccelerationStructureGeometryMotionTrianglesDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc() {
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc() {
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create(long address) {
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureGeometryMotionTrianglesDataNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.PNEXT); }
    /** Unsafe version of {@link #vertexData}. */
    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.VERTEXDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexData(VkDeviceOrHostAddressConstKHR) vertexData}. */
    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryMotionTrianglesDataNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryMotionTrianglesDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometryMotionTrianglesDataNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureGeometryMotionTrianglesDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#vertexData} field. */
        public VkDeviceOrHostAddressConstKHR vertexData() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#sType} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV} value to the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#sType} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV); }
        /** Sets the specified value to the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#pNext} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#vertexData} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer vertexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address(), value); return this; }
        /** Passes the {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }

    }

}