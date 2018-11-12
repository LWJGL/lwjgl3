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
 * Structure describing mesh shading properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMeshShaderPropertiesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code maxDrawMeshTasksCount} &ndash; the maximum number of local workgroups that <b>can</b> be launched by a single draw mesh tasks command. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#drawing-mesh-shading">the “Programmable Mesh Shading” section</a>.</li>
 * <li>{@code maxTaskWorkGroupInvocations} &ndash; the maximum total number of task shader invocations in a single local workgroup. The product of the X, Y, and Z sizes as specified by the {@code LocalSize} execution mode in shader modules and by the object decorated by the {@code WorkgroupSize} decoration <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxTaskWorkGroupSize} &ndash; the maximum size of a local task workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes specified by the {@code LocalSize} execution mode and by the object decorated by the {@code WorkgroupSize} decoration in shader modules <b>must</b> be less than or equal to the corresponding limit.</li>
 * <li>{@code maxTaskTotalMemorySize} &ndash; the maximum number of bytes that the task shader can use in total for shared and output memory combined.</li>
 * <li>{@code maxTaskOutputCount} &ndash; the maximum number of output tasks a single task shader workgroup can emit.</li>
 * <li>{@code maxMeshWorkGroupInvocations} &ndash; the maximum total number of mesh shader invocations in a single local workgroup. The product of the X, Y, and Z sizes as specified by the {@code LocalSize} execution mode in shader modules and by the object decorated by the {@code WorkgroupSize} decoration <b>must</b> be less than or equal to this limit.</li>
 * <li>{@code maxMeshWorkGroupSize} &ndash; the maximum size of a local mesh workgroup. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes specified by the {@code LocalSize} execution mode and by the object decorated by the {@code WorkgroupSize} decoration in shader modules <b>must</b> be less than or equal to the corresponding limit.</li>
 * <li>{@code maxMeshTotalMemorySize} &ndash; the maximum number of bytes that the mesh shader can use in total for shared and output memory combined.</li>
 * <li>{@code maxMeshOutputVertices} &ndash; the maximum number of vertices a mesh shader output can store.</li>
 * <li>{@code maxMeshOutputPrimitives} &ndash; the maximum number of primitives a mesh shader output can store.</li>
 * <li>{@code maxMeshMultiviewViewCount} &ndash; the maximum number of multi-view views a mesh shader can use.</li>
 * <li>{@code meshOutputPerVertexGranularity} &ndash; the granularity with which mesh vertex outputs are allocated. The value can be used to compute the memory size used by the mesh shader, which must be less than or equal to {@code maxMeshTotalMemorySize}.</li>
 * <li>{@code meshOutputPerPrimitiveGranularity} &ndash; the granularity with which mesh outputs qualified as per-primitive are allocated. The value can be used to compute the memory size used by the mesh shader, which must be less than or equal to {@code maxMeshTotalMemorySize}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMeshShaderPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxDrawMeshTasksCount;
 *     uint32_t maxTaskWorkGroupInvocations;
 *     uint32_t maxTaskWorkGroupSize[3];
 *     uint32_t maxTaskTotalMemorySize;
 *     uint32_t maxTaskOutputCount;
 *     uint32_t maxMeshWorkGroupInvocations;
 *     uint32_t maxMeshWorkGroupSize[3];
 *     uint32_t maxMeshTotalMemorySize;
 *     uint32_t maxMeshOutputVertices;
 *     uint32_t maxMeshOutputPrimitives;
 *     uint32_t maxMeshMultiviewViewCount;
 *     uint32_t meshOutputPerVertexGranularity;
 *     uint32_t meshOutputPerPrimitiveGranularity;
 * }</code></pre>
 */
public class VkPhysicalDeviceMeshShaderPropertiesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXDRAWMESHTASKSCOUNT,
        MAXTASKWORKGROUPINVOCATIONS,
        MAXTASKWORKGROUPSIZE,
        MAXTASKTOTALMEMORYSIZE,
        MAXTASKOUTPUTCOUNT,
        MAXMESHWORKGROUPINVOCATIONS,
        MAXMESHWORKGROUPSIZE,
        MAXMESHTOTALMEMORYSIZE,
        MAXMESHOUTPUTVERTICES,
        MAXMESHOUTPUTPRIMITIVES,
        MAXMESHMULTIVIEWVIEWCOUNT,
        MESHOUTPUTPERVERTEXGRANULARITY,
        MESHOUTPUTPERPRIMITIVEGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXDRAWMESHTASKSCOUNT = layout.offsetof(2);
        MAXTASKWORKGROUPINVOCATIONS = layout.offsetof(3);
        MAXTASKWORKGROUPSIZE = layout.offsetof(4);
        MAXTASKTOTALMEMORYSIZE = layout.offsetof(5);
        MAXTASKOUTPUTCOUNT = layout.offsetof(6);
        MAXMESHWORKGROUPINVOCATIONS = layout.offsetof(7);
        MAXMESHWORKGROUPSIZE = layout.offsetof(8);
        MAXMESHTOTALMEMORYSIZE = layout.offsetof(9);
        MAXMESHOUTPUTVERTICES = layout.offsetof(10);
        MAXMESHOUTPUTPRIMITIVES = layout.offsetof(11);
        MAXMESHMULTIVIEWVIEWCOUNT = layout.offsetof(12);
        MESHOUTPUTPERVERTEXGRANULARITY = layout.offsetof(13);
        MESHOUTPUTPERPRIMITIVEGRANULARITY = layout.offsetof(14);
    }

    /**
     * Creates a {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMeshShaderPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code maxDrawMeshTasksCount} field. */
    @NativeType("uint32_t")
    public int maxDrawMeshTasksCount() { return nmaxDrawMeshTasksCount(address()); }
    /** Returns the value of the {@code maxTaskWorkGroupInvocations} field. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupInvocations() { return nmaxTaskWorkGroupInvocations(address()); }
    /** Returns a {@link IntBuffer} view of the {@code maxTaskWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxTaskWorkGroupSize() { return nmaxTaskWorkGroupSize(address()); }
    /** Returns the value at the specified index of the {@code maxTaskWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupSize(int index) { return nmaxTaskWorkGroupSize(address(), index); }
    /** Returns the value of the {@code maxTaskTotalMemorySize} field. */
    @NativeType("uint32_t")
    public int maxTaskTotalMemorySize() { return nmaxTaskTotalMemorySize(address()); }
    /** Returns the value of the {@code maxTaskOutputCount} field. */
    @NativeType("uint32_t")
    public int maxTaskOutputCount() { return nmaxTaskOutputCount(address()); }
    /** Returns the value of the {@code maxMeshWorkGroupInvocations} field. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupInvocations() { return nmaxMeshWorkGroupInvocations(address()); }
    /** Returns a {@link IntBuffer} view of the {@code maxMeshWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxMeshWorkGroupSize() { return nmaxMeshWorkGroupSize(address()); }
    /** Returns the value at the specified index of the {@code maxMeshWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupSize(int index) { return nmaxMeshWorkGroupSize(address(), index); }
    /** Returns the value of the {@code maxMeshTotalMemorySize} field. */
    @NativeType("uint32_t")
    public int maxMeshTotalMemorySize() { return nmaxMeshTotalMemorySize(address()); }
    /** Returns the value of the {@code maxMeshOutputVertices} field. */
    @NativeType("uint32_t")
    public int maxMeshOutputVertices() { return nmaxMeshOutputVertices(address()); }
    /** Returns the value of the {@code maxMeshOutputPrimitives} field. */
    @NativeType("uint32_t")
    public int maxMeshOutputPrimitives() { return nmaxMeshOutputPrimitives(address()); }
    /** Returns the value of the {@code maxMeshMultiviewViewCount} field. */
    @NativeType("uint32_t")
    public int maxMeshMultiviewViewCount() { return nmaxMeshMultiviewViewCount(address()); }
    /** Returns the value of the {@code meshOutputPerVertexGranularity} field. */
    @NativeType("uint32_t")
    public int meshOutputPerVertexGranularity() { return nmeshOutputPerVertexGranularity(address()); }
    /** Returns the value of the {@code meshOutputPerPrimitiveGranularity} field. */
    @NativeType("uint32_t")
    public int meshOutputPerPrimitiveGranularity() { return nmeshOutputPerPrimitiveGranularity(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxDrawMeshTasksCount} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCount(@NativeType("uint32_t") int value) { nmaxDrawMeshTasksCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxTaskWorkGroupInvocations} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocations(@NativeType("uint32_t") int value) { nmaxTaskWorkGroupInvocations(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code maxTaskWorkGroupSize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(@NativeType("uint32_t[3]") IntBuffer value) { nmaxTaskWorkGroupSize(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code maxTaskWorkGroupSize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(int index, @NativeType("uint32_t") int value) { nmaxTaskWorkGroupSize(address(), index, value); return this; }
    /** Sets the specified value to the {@code maxTaskTotalMemorySize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySize(@NativeType("uint32_t") int value) { nmaxTaskTotalMemorySize(address(), value); return this; }
    /** Sets the specified value to the {@code maxTaskOutputCount} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCount(@NativeType("uint32_t") int value) { nmaxTaskOutputCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxMeshWorkGroupInvocations} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocations(@NativeType("uint32_t") int value) { nmaxMeshWorkGroupInvocations(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code maxMeshWorkGroupSize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(@NativeType("uint32_t[3]") IntBuffer value) { nmaxMeshWorkGroupSize(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code maxMeshWorkGroupSize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(int index, @NativeType("uint32_t") int value) { nmaxMeshWorkGroupSize(address(), index, value); return this; }
    /** Sets the specified value to the {@code maxMeshTotalMemorySize} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySize(@NativeType("uint32_t") int value) { nmaxMeshTotalMemorySize(address(), value); return this; }
    /** Sets the specified value to the {@code maxMeshOutputVertices} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVertices(@NativeType("uint32_t") int value) { nmaxMeshOutputVertices(address(), value); return this; }
    /** Sets the specified value to the {@code maxMeshOutputPrimitives} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitives(@NativeType("uint32_t") int value) { nmaxMeshOutputPrimitives(address(), value); return this; }
    /** Sets the specified value to the {@code maxMeshMultiviewViewCount} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCount(@NativeType("uint32_t") int value) { nmaxMeshMultiviewViewCount(address(), value); return this; }
    /** Sets the specified value to the {@code meshOutputPerVertexGranularity} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularity(@NativeType("uint32_t") int value) { nmeshOutputPerVertexGranularity(address(), value); return this; }
    /** Sets the specified value to the {@code meshOutputPerPrimitiveGranularity} field. */
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularity(@NativeType("uint32_t") int value) { nmeshOutputPerPrimitiveGranularity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMeshShaderPropertiesNV set(
        int sType,
        long pNext,
        int maxDrawMeshTasksCount,
        int maxTaskWorkGroupInvocations,
        IntBuffer maxTaskWorkGroupSize,
        int maxTaskTotalMemorySize,
        int maxTaskOutputCount,
        int maxMeshWorkGroupInvocations,
        IntBuffer maxMeshWorkGroupSize,
        int maxMeshTotalMemorySize,
        int maxMeshOutputVertices,
        int maxMeshOutputPrimitives,
        int maxMeshMultiviewViewCount,
        int meshOutputPerVertexGranularity,
        int meshOutputPerPrimitiveGranularity
    ) {
        sType(sType);
        pNext(pNext);
        maxDrawMeshTasksCount(maxDrawMeshTasksCount);
        maxTaskWorkGroupInvocations(maxTaskWorkGroupInvocations);
        maxTaskWorkGroupSize(maxTaskWorkGroupSize);
        maxTaskTotalMemorySize(maxTaskTotalMemorySize);
        maxTaskOutputCount(maxTaskOutputCount);
        maxMeshWorkGroupInvocations(maxMeshWorkGroupInvocations);
        maxMeshWorkGroupSize(maxMeshWorkGroupSize);
        maxMeshTotalMemorySize(maxMeshTotalMemorySize);
        maxMeshOutputVertices(maxMeshOutputVertices);
        maxMeshOutputPrimitives(maxMeshOutputPrimitives);
        maxMeshMultiviewViewCount(maxMeshMultiviewViewCount);
        meshOutputPerVertexGranularity(meshOutputPerVertexGranularity);
        meshOutputPerPrimitiveGranularity(meshOutputPerPrimitiveGranularity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMeshShaderPropertiesNV set(VkPhysicalDeviceMeshShaderPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV malloc() {
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceMeshShaderPropertiesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMeshShaderPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMeshShaderPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxDrawMeshTasksCount}. */
    public static int nmaxDrawMeshTasksCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXDRAWMESHTASKSCOUNT); }
    /** Unsafe version of {@link #maxTaskWorkGroupInvocations}. */
    public static int nmaxTaskWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxTaskWorkGroupSize}. */
    public static IntBuffer nmaxTaskWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxTaskWorkGroupSize(int) maxTaskWorkGroupSize}. */
    public static int nmaxTaskWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxTaskTotalMemorySize}. */
    public static int nmaxTaskTotalMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKTOTALMEMORYSIZE); }
    /** Unsafe version of {@link #maxTaskOutputCount}. */
    public static int nmaxTaskOutputCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKOUTPUTCOUNT); }
    /** Unsafe version of {@link #maxMeshWorkGroupInvocations}. */
    public static int nmaxMeshWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxMeshWorkGroupSize}. */
    public static IntBuffer nmaxMeshWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxMeshWorkGroupSize(int) maxMeshWorkGroupSize}. */
    public static int nmaxMeshWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxMeshTotalMemorySize}. */
    public static int nmaxMeshTotalMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHTOTALMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshOutputVertices}. */
    public static int nmaxMeshOutputVertices(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHOUTPUTVERTICES); }
    /** Unsafe version of {@link #maxMeshOutputPrimitives}. */
    public static int nmaxMeshOutputPrimitives(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHOUTPUTPRIMITIVES); }
    /** Unsafe version of {@link #maxMeshMultiviewViewCount}. */
    public static int nmaxMeshMultiviewViewCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHMULTIVIEWVIEWCOUNT); }
    /** Unsafe version of {@link #meshOutputPerVertexGranularity}. */
    public static int nmeshOutputPerVertexGranularity(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MESHOUTPUTPERVERTEXGRANULARITY); }
    /** Unsafe version of {@link #meshOutputPerPrimitiveGranularity}. */
    public static int nmeshOutputPerPrimitiveGranularity(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MESHOUTPUTPERPRIMITIVEGRANULARITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMeshShaderPropertiesNV.PNEXT, value); }
    /** Unsafe version of {@link #maxDrawMeshTasksCount(int) maxDrawMeshTasksCount}. */
    public static void nmaxDrawMeshTasksCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXDRAWMESHTASKSCOUNT, value); }
    /** Unsafe version of {@link #maxTaskWorkGroupInvocations(int) maxTaskWorkGroupInvocations}. */
    public static void nmaxTaskWorkGroupInvocations(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPINVOCATIONS, value); }
    /** Unsafe version of {@link #maxTaskWorkGroupSize(IntBuffer) maxTaskWorkGroupSize}. */
    public static void nmaxTaskWorkGroupSize(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPSIZE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #maxTaskWorkGroupSize(int, int) maxTaskWorkGroupSize}. */
    public static void nmaxTaskWorkGroupSize(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKWORKGROUPSIZE + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #maxTaskTotalMemorySize(int) maxTaskTotalMemorySize}. */
    public static void nmaxTaskTotalMemorySize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKTOTALMEMORYSIZE, value); }
    /** Unsafe version of {@link #maxTaskOutputCount(int) maxTaskOutputCount}. */
    public static void nmaxTaskOutputCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXTASKOUTPUTCOUNT, value); }
    /** Unsafe version of {@link #maxMeshWorkGroupInvocations(int) maxMeshWorkGroupInvocations}. */
    public static void nmaxMeshWorkGroupInvocations(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPINVOCATIONS, value); }
    /** Unsafe version of {@link #maxMeshWorkGroupSize(IntBuffer) maxMeshWorkGroupSize}. */
    public static void nmaxMeshWorkGroupSize(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPSIZE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #maxMeshWorkGroupSize(int, int) maxMeshWorkGroupSize}. */
    public static void nmaxMeshWorkGroupSize(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHWORKGROUPSIZE + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #maxMeshTotalMemorySize(int) maxMeshTotalMemorySize}. */
    public static void nmaxMeshTotalMemorySize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHTOTALMEMORYSIZE, value); }
    /** Unsafe version of {@link #maxMeshOutputVertices(int) maxMeshOutputVertices}. */
    public static void nmaxMeshOutputVertices(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHOUTPUTVERTICES, value); }
    /** Unsafe version of {@link #maxMeshOutputPrimitives(int) maxMeshOutputPrimitives}. */
    public static void nmaxMeshOutputPrimitives(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHOUTPUTPRIMITIVES, value); }
    /** Unsafe version of {@link #maxMeshMultiviewViewCount(int) maxMeshMultiviewViewCount}. */
    public static void nmaxMeshMultiviewViewCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MAXMESHMULTIVIEWVIEWCOUNT, value); }
    /** Unsafe version of {@link #meshOutputPerVertexGranularity(int) meshOutputPerVertexGranularity}. */
    public static void nmeshOutputPerVertexGranularity(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MESHOUTPUTPERVERTEXGRANULARITY, value); }
    /** Unsafe version of {@link #meshOutputPerPrimitiveGranularity(int) meshOutputPerPrimitiveGranularity}. */
    public static void nmeshOutputPerPrimitiveGranularity(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesNV.MESHOUTPUTPERPRIMITIVEGRANULARITY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMeshShaderPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMeshShaderPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderPropertiesNV.create(-1L);

        /**
         * Creates a new {@link VkPhysicalDeviceMeshShaderPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMeshShaderPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMeshShaderPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMeshShaderPropertiesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMeshShaderPropertiesNV.npNext(address()); }
        /** Returns the value of the {@code maxDrawMeshTasksCount} field. */
        @NativeType("uint32_t")
        public int maxDrawMeshTasksCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxDrawMeshTasksCount(address()); }
        /** Returns the value of the {@code maxTaskWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupInvocations(address()); }
        /** Returns a {@link IntBuffer} view of the {@code maxTaskWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address()); }
        /** Returns the value at the specified index of the {@code maxTaskWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupSize(int index) { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address(), index); }
        /** Returns the value of the {@code maxTaskTotalMemorySize} field. */
        @NativeType("uint32_t")
        public int maxTaskTotalMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskTotalMemorySize(address()); }
        /** Returns the value of the {@code maxTaskOutputCount} field. */
        @NativeType("uint32_t")
        public int maxTaskOutputCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskOutputCount(address()); }
        /** Returns the value of the {@code maxMeshWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupInvocations(address()); }
        /** Returns a {@link IntBuffer} view of the {@code maxMeshWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address()); }
        /** Returns the value at the specified index of the {@code maxMeshWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupSize(int index) { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address(), index); }
        /** Returns the value of the {@code maxMeshTotalMemorySize} field. */
        @NativeType("uint32_t")
        public int maxMeshTotalMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshTotalMemorySize(address()); }
        /** Returns the value of the {@code maxMeshOutputVertices} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputVertices() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputVertices(address()); }
        /** Returns the value of the {@code maxMeshOutputPrimitives} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputPrimitives() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputPrimitives(address()); }
        /** Returns the value of the {@code maxMeshMultiviewViewCount} field. */
        @NativeType("uint32_t")
        public int maxMeshMultiviewViewCount() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshMultiviewViewCount(address()); }
        /** Returns the value of the {@code meshOutputPerVertexGranularity} field. */
        @NativeType("uint32_t")
        public int meshOutputPerVertexGranularity() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerVertexGranularity(address()); }
        /** Returns the value of the {@code meshOutputPerPrimitiveGranularity} field. */
        @NativeType("uint32_t")
        public int meshOutputPerPrimitiveGranularity() { return VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerPrimitiveGranularity(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMeshShaderPropertiesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxDrawMeshTasksCount} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxDrawMeshTasksCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxDrawMeshTasksCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxTaskWorkGroupInvocations} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxTaskWorkGroupInvocations(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupInvocations(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code maxTaskWorkGroupSize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxTaskWorkGroupSize(@NativeType("uint32_t[3]") IntBuffer value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code maxTaskWorkGroupSize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxTaskWorkGroupSize(int index, @NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskWorkGroupSize(address(), index, value); return this; }
        /** Sets the specified value to the {@code maxTaskTotalMemorySize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxTaskTotalMemorySize(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskTotalMemorySize(address(), value); return this; }
        /** Sets the specified value to the {@code maxTaskOutputCount} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxTaskOutputCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxTaskOutputCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxMeshWorkGroupInvocations} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshWorkGroupInvocations(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupInvocations(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code maxMeshWorkGroupSize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshWorkGroupSize(@NativeType("uint32_t[3]") IntBuffer value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code maxMeshWorkGroupSize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshWorkGroupSize(int index, @NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshWorkGroupSize(address(), index, value); return this; }
        /** Sets the specified value to the {@code maxMeshTotalMemorySize} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshTotalMemorySize(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshTotalMemorySize(address(), value); return this; }
        /** Sets the specified value to the {@code maxMeshOutputVertices} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshOutputVertices(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputVertices(address(), value); return this; }
        /** Sets the specified value to the {@code maxMeshOutputPrimitives} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshOutputPrimitives(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshOutputPrimitives(address(), value); return this; }
        /** Sets the specified value to the {@code maxMeshMultiviewViewCount} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer maxMeshMultiviewViewCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmaxMeshMultiviewViewCount(address(), value); return this; }
        /** Sets the specified value to the {@code meshOutputPerVertexGranularity} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer meshOutputPerVertexGranularity(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerVertexGranularity(address(), value); return this; }
        /** Sets the specified value to the {@code meshOutputPerPrimitiveGranularity} field. */
        public VkPhysicalDeviceMeshShaderPropertiesNV.Buffer meshOutputPerPrimitiveGranularity(@NativeType("uint32_t") int value) { VkPhysicalDeviceMeshShaderPropertiesNV.nmeshOutputPerPrimitiveGranularity(address(), value); return this; }

    }

}