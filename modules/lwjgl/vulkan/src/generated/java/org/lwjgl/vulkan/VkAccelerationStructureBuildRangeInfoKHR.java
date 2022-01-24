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
 * Structure specifying build offsets and counts for acceleration structure builds.
 * 
 * <h5>Description</h5>
 * 
 * <p>The primitive count and primitive offset are interpreted differently depending on the {@code VkGeometryTypeKHR} used:</p>
 * 
 * <ul>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, {@code primitiveCount} is the number of triangles to be built, where each triangle is treated as 3 vertices.
 * 
 * <ul>
 * <li>If the geometry uses indices, <code>primitiveCount × 3</code> indices are consumed from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::indexData}, starting at an offset of {@code primitiveOffset}. The value of {@code firstVertex} is added to the index values before fetching vertices.</li>
 * <li>If the geometry does not use indices, <code>primitiveCount × 3</code> vertices are consumed from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::vertexData}, starting at an offset of <code>primitiveOffset + {@link VkAccelerationStructureGeometryTrianglesDataKHR}::vertexStride × firstVertex</code>.</li>
 * <li>If {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::transformData} is not {@code NULL}, a single {@link VkTransformMatrixKHR} structure is consumed from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::transformData}, at an offset of {@code transformOffset}. This matrix describes a transformation from the space in which the vertices for all triangles in this geometry are described to the space in which the acceleration structure is defined.</li>
 * </ul>
 * </li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, {@code primitiveCount} is the number of axis-aligned bounding boxes. {@code primitiveCount} {@link VkAabbPositionsKHR} structures are consumed from {@link VkAccelerationStructureGeometryAabbsDataKHR}{@code ::data}, starting at an offset of {@code primitiveOffset}.</li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, {@code primitiveCount} is the number of acceleration structures. {@code primitiveCount} {@link VkAccelerationStructureInstanceKHR} or {@link VkAccelerationStructureMotionInstanceNV} structures are consumed from {@link VkAccelerationStructureGeometryInstancesDataKHR}{@code ::data}, starting at an offset of {@code primitiveOffset}.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if the geometry uses indices, the offset {@code primitiveOffset} from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::indexData} <b>must</b> be a multiple of the element size of {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::indexType}</li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, if the geometry does not use indices, the offset {@code primitiveOffset} from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::vertexData} <b>must</b> be a multiple of the component size of {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::vertexFormat}</li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_TRIANGLES_KHR GEOMETRY_TYPE_TRIANGLES_KHR}, the offset {@code transformOffset} from {@link VkAccelerationStructureGeometryTrianglesDataKHR}{@code ::transformData} <b>must</b> be a multiple of 16</li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_AABBS_KHR GEOMETRY_TYPE_AABBS_KHR}, the offset {@code primitiveOffset} from {@link VkAccelerationStructureGeometryAabbsDataKHR}{@code ::data} <b>must</b> be a multiple of 8</li>
 * <li>For geometries of type {@link KHRAccelerationStructure#VK_GEOMETRY_TYPE_INSTANCES_KHR GEOMETRY_TYPE_INSTANCES_KHR}, the offset {@code primitiveOffset} from {@link VkAccelerationStructureGeometryInstancesDataKHR}{@code ::data} <b>must</b> be a multiple of 16</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR}, {@link KHRAccelerationStructure#vkCmdBuildAccelerationStructuresKHR CmdBuildAccelerationStructuresKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureBuildRangeInfoKHR {
 *     uint32_t {@link #primitiveCount};
 *     uint32_t {@link #primitiveOffset};
 *     uint32_t {@link #firstVertex};
 *     uint32_t {@link #transformOffset};
 * }</code></pre>
 */
public class VkAccelerationStructureBuildRangeInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRIMITIVECOUNT,
        PRIMITIVEOFFSET,
        FIRSTVERTEX,
        TRANSFORMOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRIMITIVECOUNT = layout.offsetof(0);
        PRIMITIVEOFFSET = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        TRANSFORMOFFSET = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkAccelerationStructureBuildRangeInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureBuildRangeInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** defines the number of primitives for a corresponding acceleration structure geometry. */
    @NativeType("uint32_t")
    public int primitiveCount() { return nprimitiveCount(address()); }
    /** defines an offset in bytes into the memory where primitive data is defined. */
    @NativeType("uint32_t")
    public int primitiveOffset() { return nprimitiveOffset(address()); }
    /** the index of the first vertex to build from for triangle geometry. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** defines an offset in bytes into the memory where a transform matrix is defined. */
    @NativeType("uint32_t")
    public int transformOffset() { return ntransformOffset(address()); }

    /** Sets the specified value to the {@link #primitiveCount} field. */
    public VkAccelerationStructureBuildRangeInfoKHR primitiveCount(@NativeType("uint32_t") int value) { nprimitiveCount(address(), value); return this; }
    /** Sets the specified value to the {@link #primitiveOffset} field. */
    public VkAccelerationStructureBuildRangeInfoKHR primitiveOffset(@NativeType("uint32_t") int value) { nprimitiveOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #firstVertex} field. */
    public VkAccelerationStructureBuildRangeInfoKHR firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@link #transformOffset} field. */
    public VkAccelerationStructureBuildRangeInfoKHR transformOffset(@NativeType("uint32_t") int value) { ntransformOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureBuildRangeInfoKHR set(
        int primitiveCount,
        int primitiveOffset,
        int firstVertex,
        int transformOffset
    ) {
        primitiveCount(primitiveCount);
        primitiveOffset(primitiveOffset);
        firstVertex(firstVertex);
        transformOffset(transformOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureBuildRangeInfoKHR set(VkAccelerationStructureBuildRangeInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildRangeInfoKHR malloc() {
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureBuildRangeInfoKHR calloc() {
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureBuildRangeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureBuildRangeInfoKHR create(long address) {
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildRangeInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureBuildRangeInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildRangeInfoKHR malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureBuildRangeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureBuildRangeInfoKHR calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureBuildRangeInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureBuildRangeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #primitiveCount}. */
    public static int nprimitiveCount(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVECOUNT); }
    /** Unsafe version of {@link #primitiveOffset}. */
    public static int nprimitiveOffset(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVEOFFSET); }
    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.FIRSTVERTEX); }
    /** Unsafe version of {@link #transformOffset}. */
    public static int ntransformOffset(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.TRANSFORMOFFSET); }

    /** Unsafe version of {@link #primitiveCount(int) primitiveCount}. */
    public static void nprimitiveCount(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVECOUNT, value); }
    /** Unsafe version of {@link #primitiveOffset(int) primitiveOffset}. */
    public static void nprimitiveOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.PRIMITIVEOFFSET, value); }
    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #transformOffset(int) transformOffset}. */
    public static void ntransformOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureBuildRangeInfoKHR.TRANSFORMOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureBuildRangeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureBuildRangeInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureBuildRangeInfoKHR ELEMENT_FACTORY = VkAccelerationStructureBuildRangeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureBuildRangeInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureBuildRangeInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureBuildRangeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureBuildRangeInfoKHR#primitiveCount} field. */
        @NativeType("uint32_t")
        public int primitiveCount() { return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildRangeInfoKHR#primitiveOffset} field. */
        @NativeType("uint32_t")
        public int primitiveOffset() { return VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildRangeInfoKHR#firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address()); }
        /** @return the value of the {@link VkAccelerationStructureBuildRangeInfoKHR#transformOffset} field. */
        @NativeType("uint32_t")
        public int transformOffset() { return VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureBuildRangeInfoKHR#primitiveCount} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer primitiveCount(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nprimitiveCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildRangeInfoKHR#primitiveOffset} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer primitiveOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nprimitiveOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildRangeInfoKHR#firstVertex} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer firstVertex(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureBuildRangeInfoKHR#transformOffset} field. */
        public VkAccelerationStructureBuildRangeInfoKHR.Buffer transformOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureBuildRangeInfoKHR.ntransformOffset(address(), value); return this; }

    }

}