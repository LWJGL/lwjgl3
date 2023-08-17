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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing cluster culling shader properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxWorkGroupCount}[3];
 *     uint32_t {@link #maxWorkGroupSize}[3];
 *     uint32_t {@link #maxOutputClusterCount};
 *     VkDeviceSize {@link #indirectBufferOffsetAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends Struct<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXWORKGROUPCOUNT,
        MAXWORKGROUPSIZE,
        MAXOUTPUTCLUSTERCOUNT,
        INDIRECTBUFFEROFFSETALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(4, 3),
            __array(4, 3),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXWORKGROUPCOUNT = layout.offsetof(2);
        MAXWORKGROUPSIZE = layout.offsetof(3);
        MAXOUTPUTCLUSTERCOUNT = layout.offsetof(4);
        INDIRECTBUFFEROFFSETALIGNMENT = layout.offsetof(5);
    }

    protected VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum number of local workgroups that can be launched by a single command. These three value represent the maximum local workgroup count in the X, Y and Z dimensions, respectively. In the current implementation, the values of Y and Z are both implicitly set as one. groupCountX of DrawCluster command must be less than or equal to maxWorkGroupCount[0]. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxWorkGroupCount() { return nmaxWorkGroupCount(address()); }
    /** the maximum number of local workgroups that can be launched by a single command. These three value represent the maximum local workgroup count in the X, Y and Z dimensions, respectively. In the current implementation, the values of Y and Z are both implicitly set as one. groupCountX of DrawCluster command must be less than or equal to maxWorkGroupCount[0]. */
    @NativeType("uint32_t")
    public int maxWorkGroupCount(int index) { return nmaxWorkGroupCount(address(), index); }
    /** the maximum size of a local workgroup. These three value represent the maximum local workgroup size in the X, Y and Z dimensions, respectively. The x, y and z sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the WorkgroupSize decoration in shader modules, must be less than or equal to the corresponding limit. In the current implementation, the maximum workgroup size of the X dimension is 32, the others are 1. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxWorkGroupSize() { return nmaxWorkGroupSize(address()); }
    /** the maximum size of a local workgroup. These three value represent the maximum local workgroup size in the X, Y and Z dimensions, respectively. The x, y and z sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the WorkgroupSize decoration in shader modules, must be less than or equal to the corresponding limit. In the current implementation, the maximum workgroup size of the X dimension is 32, the others are 1. */
    @NativeType("uint32_t")
    public int maxWorkGroupSize(int index) { return nmaxWorkGroupSize(address(), index); }
    /** the maximum number of output cluster a single cluster culling shader workgroup can emit. */
    @NativeType("uint32_t")
    public int maxOutputClusterCount() { return nmaxOutputClusterCount(address()); }
    /** indicates the alignment for cluster drawing command buffer stride. {@link HUAWEIClusterCullingShader#vkCmdDrawClusterIndirectHUAWEI CmdDrawClusterIndirectHUAWEI}{@code ::offset} must be a multiple of this value. */
    @NativeType("VkDeviceSize")
    public long indirectBufferOffsetAlignment() { return nindirectBufferOffsetAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI} value to the {@link #sType} field. */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI set(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI malloc() {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI calloc() {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create(long address) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #maxWorkGroupCount}. */
    public static IntBuffer nmaxWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.MAXWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxWorkGroupCount(int) maxWorkGroupCount}. */
    public static int nmaxWorkGroupCount(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.MAXWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxWorkGroupSize}. */
    public static IntBuffer nmaxWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.MAXWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxWorkGroupSize(int) maxWorkGroupSize}. */
    public static int nmaxWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.MAXWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxOutputClusterCount}. */
    public static int nmaxOutputClusterCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.MAXOUTPUTCLUSTERCOUNT); }
    /** Unsafe version of {@link #indirectBufferOffsetAlignment}. */
    public static long nindirectBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.INDIRECTBUFFEROFFSETALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.npNext(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#maxWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxWorkGroupCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupCount(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#maxWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxWorkGroupCount(int index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupCount(address(), index); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#maxWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxWorkGroupSize() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#maxWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxWorkGroupSize(int index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxWorkGroupSize(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#maxOutputClusterCount} field. */
        @NativeType("uint32_t")
        public int maxOutputClusterCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nmaxOutputClusterCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#indirectBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long indirectBufferOffsetAlignment() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nindirectBufferOffsetAlignment(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#sType} field. */
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIClusterCullingShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI} value to the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#sType} field. */
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer sType$Default() { return sType(HUAWEIClusterCullingShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI); }
        /** Sets the specified value to the {@link VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI#pNext} field. */
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.npNext(address(), value); return this; }

    }

}