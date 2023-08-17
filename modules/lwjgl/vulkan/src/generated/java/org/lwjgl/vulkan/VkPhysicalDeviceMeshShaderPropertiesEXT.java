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
 * <p>If the {@link VkPhysicalDeviceMeshShaderPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMeshShaderPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxTaskWorkGroupTotalCount};
 *     uint32_t {@link #maxTaskWorkGroupCount}[3];
 *     uint32_t {@link #maxTaskWorkGroupInvocations};
 *     uint32_t {@link #maxTaskWorkGroupSize}[3];
 *     uint32_t {@link #maxTaskPayloadSize};
 *     uint32_t {@link #maxTaskSharedMemorySize};
 *     uint32_t {@link #maxTaskPayloadAndSharedMemorySize};
 *     uint32_t {@link #maxMeshWorkGroupTotalCount};
 *     uint32_t {@link #maxMeshWorkGroupCount}[3];
 *     uint32_t {@link #maxMeshWorkGroupInvocations};
 *     uint32_t {@link #maxMeshWorkGroupSize}[3];
 *     uint32_t {@link #maxMeshSharedMemorySize};
 *     uint32_t {@link #maxMeshPayloadAndSharedMemorySize};
 *     uint32_t {@link #maxMeshOutputMemorySize};
 *     uint32_t {@link #maxMeshPayloadAndOutputMemorySize};
 *     uint32_t {@link #maxMeshOutputComponents};
 *     uint32_t {@link #maxMeshOutputVertices};
 *     uint32_t {@link #maxMeshOutputPrimitives};
 *     uint32_t {@link #maxMeshOutputLayers};
 *     uint32_t {@link #maxMeshMultiviewViewCount};
 *     uint32_t {@link #meshOutputPerVertexGranularity};
 *     uint32_t {@link #meshOutputPerPrimitiveGranularity};
 *     uint32_t {@link #maxPreferredTaskWorkGroupInvocations};
 *     uint32_t {@link #maxPreferredMeshWorkGroupInvocations};
 *     VkBool32 {@link #prefersLocalInvocationVertexOutput};
 *     VkBool32 {@link #prefersLocalInvocationPrimitiveOutput};
 *     VkBool32 {@link #prefersCompactVertexOutput};
 *     VkBool32 {@link #prefersCompactPrimitiveOutput};
 * }</code></pre>
 */
public class VkPhysicalDeviceMeshShaderPropertiesEXT extends Struct<VkPhysicalDeviceMeshShaderPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXTASKWORKGROUPTOTALCOUNT,
        MAXTASKWORKGROUPCOUNT,
        MAXTASKWORKGROUPINVOCATIONS,
        MAXTASKWORKGROUPSIZE,
        MAXTASKPAYLOADSIZE,
        MAXTASKSHAREDMEMORYSIZE,
        MAXTASKPAYLOADANDSHAREDMEMORYSIZE,
        MAXMESHWORKGROUPTOTALCOUNT,
        MAXMESHWORKGROUPCOUNT,
        MAXMESHWORKGROUPINVOCATIONS,
        MAXMESHWORKGROUPSIZE,
        MAXMESHSHAREDMEMORYSIZE,
        MAXMESHPAYLOADANDSHAREDMEMORYSIZE,
        MAXMESHOUTPUTMEMORYSIZE,
        MAXMESHPAYLOADANDOUTPUTMEMORYSIZE,
        MAXMESHOUTPUTCOMPONENTS,
        MAXMESHOUTPUTVERTICES,
        MAXMESHOUTPUTPRIMITIVES,
        MAXMESHOUTPUTLAYERS,
        MAXMESHMULTIVIEWVIEWCOUNT,
        MESHOUTPUTPERVERTEXGRANULARITY,
        MESHOUTPUTPERPRIMITIVEGRANULARITY,
        MAXPREFERREDTASKWORKGROUPINVOCATIONS,
        MAXPREFERREDMESHWORKGROUPINVOCATIONS,
        PREFERSLOCALINVOCATIONVERTEXOUTPUT,
        PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT,
        PREFERSCOMPACTVERTEXOUTPUT,
        PREFERSCOMPACTPRIMITIVEOUTPUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(4, 3),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        MAXTASKWORKGROUPTOTALCOUNT = layout.offsetof(2);
        MAXTASKWORKGROUPCOUNT = layout.offsetof(3);
        MAXTASKWORKGROUPINVOCATIONS = layout.offsetof(4);
        MAXTASKWORKGROUPSIZE = layout.offsetof(5);
        MAXTASKPAYLOADSIZE = layout.offsetof(6);
        MAXTASKSHAREDMEMORYSIZE = layout.offsetof(7);
        MAXTASKPAYLOADANDSHAREDMEMORYSIZE = layout.offsetof(8);
        MAXMESHWORKGROUPTOTALCOUNT = layout.offsetof(9);
        MAXMESHWORKGROUPCOUNT = layout.offsetof(10);
        MAXMESHWORKGROUPINVOCATIONS = layout.offsetof(11);
        MAXMESHWORKGROUPSIZE = layout.offsetof(12);
        MAXMESHSHAREDMEMORYSIZE = layout.offsetof(13);
        MAXMESHPAYLOADANDSHAREDMEMORYSIZE = layout.offsetof(14);
        MAXMESHOUTPUTMEMORYSIZE = layout.offsetof(15);
        MAXMESHPAYLOADANDOUTPUTMEMORYSIZE = layout.offsetof(16);
        MAXMESHOUTPUTCOMPONENTS = layout.offsetof(17);
        MAXMESHOUTPUTVERTICES = layout.offsetof(18);
        MAXMESHOUTPUTPRIMITIVES = layout.offsetof(19);
        MAXMESHOUTPUTLAYERS = layout.offsetof(20);
        MAXMESHMULTIVIEWVIEWCOUNT = layout.offsetof(21);
        MESHOUTPUTPERVERTEXGRANULARITY = layout.offsetof(22);
        MESHOUTPUTPERPRIMITIVEGRANULARITY = layout.offsetof(23);
        MAXPREFERREDTASKWORKGROUPINVOCATIONS = layout.offsetof(24);
        MAXPREFERREDMESHWORKGROUPINVOCATIONS = layout.offsetof(25);
        PREFERSLOCALINVOCATIONVERTEXOUTPUT = layout.offsetof(26);
        PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT = layout.offsetof(27);
        PREFERSCOMPACTVERTEXOUTPUT = layout.offsetof(28);
        PREFERSCOMPACTPRIMITIVEOUTPUT = layout.offsetof(29);
    }

    protected VkPhysicalDeviceMeshShaderPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMeshShaderPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMeshShaderPropertiesEXT(ByteBuffer container) {
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
    /** the maximum number of total local workgroups that <b>can</b> be launched by a single mesh tasks drawing command. See <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-mesh-shading">Programmable Mesh Shading</a>. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupTotalCount() { return nmaxTaskWorkGroupTotalCount(address()); }
    /** the maximum number of local workgroups that <b>can</b> be launched by a single mesh tasks drawing command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the drawing commands <b>must</b> be less than or equal to the corresponding limit. The product of these dimensions <b>must</b> be less than or equal to {@code maxTaskWorkGroupTotalCount}. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxTaskWorkGroupCount() { return nmaxTaskWorkGroupCount(address()); }
    /** the maximum number of local workgroups that <b>can</b> be launched by a single mesh tasks drawing command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the drawing commands <b>must</b> be less than or equal to the corresponding limit. The product of these dimensions <b>must</b> be less than or equal to {@code maxTaskWorkGroupTotalCount}. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupCount(int index) { return nmaxTaskWorkGroupCount(address(), index); }
    /** the maximum total number of task shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupInvocations() { return nmaxTaskWorkGroupInvocations(address()); }
    /** the maximum size of a local task workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxTaskWorkGroupSize() { return nmaxTaskWorkGroupSize(address()); }
    /** the maximum size of a local task workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t")
    public int maxTaskWorkGroupSize(int index) { return nmaxTaskWorkGroupSize(address(), index); }
    /** the maximum total storage size, in bytes, available for variables declared with the {@code TaskPayloadWorkgroupEXT} storage class in shader modules in the task shader stage. */
    @NativeType("uint32_t")
    public int maxTaskPayloadSize() { return nmaxTaskPayloadSize(address()); }
    /** the maximum total storage size, in bytes, available for variables declared with the {@code Workgroup} storage class in shader modules in the task shader stage. */
    @NativeType("uint32_t")
    public int maxTaskSharedMemorySize() { return nmaxTaskSharedMemorySize(address()); }
    /** the maximum total storage size, in bytes, available for variables that are declared with the {@code TaskPayloadWorkgroupEXT} or {@code Workgroup} storage class, in shader modules in the task shader stage. */
    @NativeType("uint32_t")
    public int maxTaskPayloadAndSharedMemorySize() { return nmaxTaskPayloadAndSharedMemorySize(address()); }
    /** the maximum number of local output tasks a single task shader workgroup can emit. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupTotalCount() { return nmaxMeshWorkGroupTotalCount(address()); }
    /** the maximum number of local output tasks a single task shader workgroup can emit, per dimension. These three values represent the maximum number of local output tasks for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the {@code OpEmitMeshTasksEXT} <b>must</b> be less than or equal to the corresponding limit. The product of these dimensions <b>must</b> be less than or equal to {@code maxMeshWorkGroupTotalCount}. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxMeshWorkGroupCount() { return nmaxMeshWorkGroupCount(address()); }
    /** the maximum number of local output tasks a single task shader workgroup can emit, per dimension. These three values represent the maximum number of local output tasks for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the {@code OpEmitMeshTasksEXT} <b>must</b> be less than or equal to the corresponding limit. The product of these dimensions <b>must</b> be less than or equal to {@code maxMeshWorkGroupTotalCount}. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupCount(int index) { return nmaxMeshWorkGroupCount(address(), index); }
    /** the maximum total number of mesh shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupInvocations() { return nmaxMeshWorkGroupInvocations(address()); }
    /** the maximum size of a local mesh workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxMeshWorkGroupSize() { return nmaxMeshWorkGroupSize(address()); }
    /** the maximum size of a local mesh workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t")
    public int maxMeshWorkGroupSize(int index) { return nmaxMeshWorkGroupSize(address(), index); }
    /** the maximum total storage size, in bytes, available for variables declared with the {@code Workgroup} storage class in shader modules in the mesh shader stage. */
    @NativeType("uint32_t")
    public int maxMeshSharedMemorySize() { return nmaxMeshSharedMemorySize(address()); }
    /** the maximum total storage size, in bytes, available for variables that are declared with the {@code TaskPayloadWorkgroupEXT} or {@code Workgroup} storage class in shader modules in the mesh shader stage. */
    @NativeType("uint32_t")
    public int maxMeshPayloadAndSharedMemorySize() { return nmaxMeshPayloadAndSharedMemorySize(address()); }
    /** the maximum total storage size, in bytes, available for output variables in shader modules in the mesh shader stage, according to the formula in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#mesh-output">Mesh Shader Output</a>. */
    @NativeType("uint32_t")
    public int maxMeshOutputMemorySize() { return nmaxMeshOutputMemorySize(address()); }
    /** the maximum total storage size, in bytes, available for variables that are declared with the {@code TaskPayloadWorkgroupEXT} storage class, or output variables in shader modules in the mesh shader stage, according to the formula in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#mesh-output">Mesh Shader Output</a>. */
    @NativeType("uint32_t")
    public int maxMeshPayloadAndOutputMemorySize() { return nmaxMeshPayloadAndOutputMemorySize(address()); }
    /** the maximum number of components of output variables which <b>can</b> be output from the mesh shader stage. */
    @NativeType("uint32_t")
    public int maxMeshOutputComponents() { return nmaxMeshOutputComponents(address()); }
    /** the maximum number of vertices which <b>can</b> be emitted by a single mesh shader workgroup. */
    @NativeType("uint32_t")
    public int maxMeshOutputVertices() { return nmaxMeshOutputVertices(address()); }
    /** the maximum number of primitives which <b>can</b> be emitted by a single mesh shader workgroup. */
    @NativeType("uint32_t")
    public int maxMeshOutputPrimitives() { return nmaxMeshOutputPrimitives(address()); }
    /** one greater than the maximum layer index that <b>can</b> be output from the mesh shader stage. */
    @NativeType("uint32_t")
    public int maxMeshOutputLayers() { return nmaxMeshOutputLayers(address()); }
    /** one greater than the maximum view index that <b>can</b> be used by any mesh shader. */
    @NativeType("uint32_t")
    public int maxMeshMultiviewViewCount() { return nmaxMeshMultiviewViewCount(address()); }
    /** the granularity of vertex allocation. The number of output vertices allocated for the mesh shader stage is padded to a multiple of this number. The value can be used to calculate the required storage size for output variables in shader modules in the mesh shader stage, which <b>must</b> be less than or equal to {@code maxMeshOutputMemorySize}. */
    @NativeType("uint32_t")
    public int meshOutputPerVertexGranularity() { return nmeshOutputPerVertexGranularity(address()); }
    /** the granularity of primitive allocation. The number of output primitives allocated for the mesh shader stage is padded to a multiple of this number. The value can be used to calculate the required storage size for output variables in shader modules in the mesh shader stage, which <b>must</b> be less than or equal to {@code maxMeshOutputMemorySize}. */
    @NativeType("uint32_t")
    public int meshOutputPerPrimitiveGranularity() { return nmeshOutputPerPrimitiveGranularity(address()); }
    /** the maximum number of task shader invocations in a single workgroup that is preferred by the implementation for optimal performance. The value is guaranteed to be a multiple of a supported subgroup size for the task shader stage. */
    @NativeType("uint32_t")
    public int maxPreferredTaskWorkGroupInvocations() { return nmaxPreferredTaskWorkGroupInvocations(address()); }
    /** the maximum number of mesh shader invocations in a single workgroup that is preferred by the implementation for optimal performance. The value is guaranteed to be a multiple of a supported subgroup size for the mesh shader stage. */
    @NativeType("uint32_t")
    public int maxPreferredMeshWorkGroupInvocations() { return nmaxPreferredMeshWorkGroupInvocations(address()); }
    /** specifies whether writes to the vertex output array in a mesh shader yield best performance when the array index matches {@code LocalInvocationIndex}. */
    @NativeType("VkBool32")
    public boolean prefersLocalInvocationVertexOutput() { return nprefersLocalInvocationVertexOutput(address()) != 0; }
    /** specifies whether writes to the primitive output array in a mesh shader yield best performance when the array index matches {@code LocalInvocationIndex}. */
    @NativeType("VkBool32")
    public boolean prefersLocalInvocationPrimitiveOutput() { return nprefersLocalInvocationPrimitiveOutput(address()) != 0; }
    /** specifies whether output vertices should be compacted after custom culling in the mesh shader for best performance, otherwise keeping the vertices at their original location may be better. */
    @NativeType("VkBool32")
    public boolean prefersCompactVertexOutput() { return nprefersCompactVertexOutput(address()) != 0; }
    /** specifies whether output primitives should be compacted after custom culling in the mesh shader for best performance, otherwise the use of {@code CullPrimitiveEXT} may be better. */
    @NativeType("VkBool32")
    public boolean prefersCompactPrimitiveOutput() { return nprefersCompactPrimitiveOutput(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType$Default() { return sType(EXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMeshShaderPropertiesEXT set(
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
    public VkPhysicalDeviceMeshShaderPropertiesEXT set(VkPhysicalDeviceMeshShaderPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT malloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT calloc() {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT create(long address) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMeshShaderPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxTaskWorkGroupTotalCount}. */
    public static int nmaxTaskWorkGroupTotalCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPTOTALCOUNT); }
    /** Unsafe version of {@link #maxTaskWorkGroupCount}. */
    public static IntBuffer nmaxTaskWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxTaskWorkGroupCount(int) maxTaskWorkGroupCount}. */
    public static int nmaxTaskWorkGroupCount(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxTaskWorkGroupInvocations}. */
    public static int nmaxTaskWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxTaskWorkGroupSize}. */
    public static IntBuffer nmaxTaskWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxTaskWorkGroupSize(int) maxTaskWorkGroupSize}. */
    public static int nmaxTaskWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxTaskPayloadSize}. */
    public static int nmaxTaskPayloadSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADSIZE); }
    /** Unsafe version of {@link #maxTaskSharedMemorySize}. */
    public static int nmaxTaskSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKSHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxTaskPayloadAndSharedMemorySize}. */
    public static int nmaxTaskPayloadAndSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADANDSHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshWorkGroupTotalCount}. */
    public static int nmaxMeshWorkGroupTotalCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPTOTALCOUNT); }
    /** Unsafe version of {@link #maxMeshWorkGroupCount}. */
    public static IntBuffer nmaxMeshWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxMeshWorkGroupCount(int) maxMeshWorkGroupCount}. */
    public static int nmaxMeshWorkGroupCount(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxMeshWorkGroupInvocations}. */
    public static int nmaxMeshWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxMeshWorkGroupSize}. */
    public static IntBuffer nmaxMeshWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxMeshWorkGroupSize(int) maxMeshWorkGroupSize}. */
    public static int nmaxMeshWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxMeshSharedMemorySize}. */
    public static int nmaxMeshSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHSHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshPayloadAndSharedMemorySize}. */
    public static int nmaxMeshPayloadAndSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDSHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshOutputMemorySize}. */
    public static int nmaxMeshOutputMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshPayloadAndOutputMemorySize}. */
    public static int nmaxMeshPayloadAndOutputMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDOUTPUTMEMORYSIZE); }
    /** Unsafe version of {@link #maxMeshOutputComponents}. */
    public static int nmaxMeshOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxMeshOutputVertices}. */
    public static int nmaxMeshOutputVertices(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTVERTICES); }
    /** Unsafe version of {@link #maxMeshOutputPrimitives}. */
    public static int nmaxMeshOutputPrimitives(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTPRIMITIVES); }
    /** Unsafe version of {@link #maxMeshOutputLayers}. */
    public static int nmaxMeshOutputLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTLAYERS); }
    /** Unsafe version of {@link #maxMeshMultiviewViewCount}. */
    public static int nmaxMeshMultiviewViewCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHMULTIVIEWVIEWCOUNT); }
    /** Unsafe version of {@link #meshOutputPerVertexGranularity}. */
    public static int nmeshOutputPerVertexGranularity(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERVERTEXGRANULARITY); }
    /** Unsafe version of {@link #meshOutputPerPrimitiveGranularity}. */
    public static int nmeshOutputPerPrimitiveGranularity(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERPRIMITIVEGRANULARITY); }
    /** Unsafe version of {@link #maxPreferredTaskWorkGroupInvocations}. */
    public static int nmaxPreferredTaskWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDTASKWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxPreferredMeshWorkGroupInvocations}. */
    public static int nmaxPreferredMeshWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDMESHWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #prefersLocalInvocationVertexOutput}. */
    public static int nprefersLocalInvocationVertexOutput(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONVERTEXOUTPUT); }
    /** Unsafe version of {@link #prefersLocalInvocationPrimitiveOutput}. */
    public static int nprefersLocalInvocationPrimitiveOutput(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT); }
    /** Unsafe version of {@link #prefersCompactVertexOutput}. */
    public static int nprefersCompactVertexOutput(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTVERTEXOUTPUT); }
    /** Unsafe version of {@link #prefersCompactPrimitiveOutput}. */
    public static int nprefersCompactPrimitiveOutput(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTPRIMITIVEOUTPUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMeshShaderPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMeshShaderPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMeshShaderPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMeshShaderPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMeshShaderPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMeshShaderPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupTotalCount} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupTotalCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupTotalCount(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupCount(int index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupInvocations(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxTaskWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxTaskWorkGroupSize(int index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskPayloadSize} field. */
        @NativeType("uint32_t")
        public int maxTaskPayloadSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxTaskSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskSharedMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxTaskPayloadAndSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxTaskPayloadAndSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadAndSharedMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupTotalCount} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupTotalCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupTotalCount(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupCount(int index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupInvocations(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxMeshWorkGroupSize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxMeshWorkGroupSize(int index) { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxMeshSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshSharedMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshPayloadAndSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxMeshPayloadAndSharedMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndSharedMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshOutputMemorySize} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshPayloadAndOutputMemorySize} field. */
        @NativeType("uint32_t")
        public int maxMeshPayloadAndOutputMemorySize() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndOutputMemorySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputComponents() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshOutputVertices} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputVertices() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputVertices(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshOutputPrimitives} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputPrimitives() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputPrimitives(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshOutputLayers} field. */
        @NativeType("uint32_t")
        public int maxMeshOutputLayers() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputLayers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxMeshMultiviewViewCount} field. */
        @NativeType("uint32_t")
        public int maxMeshMultiviewViewCount() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshMultiviewViewCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#meshOutputPerVertexGranularity} field. */
        @NativeType("uint32_t")
        public int meshOutputPerVertexGranularity() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerVertexGranularity(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#meshOutputPerPrimitiveGranularity} field. */
        @NativeType("uint32_t")
        public int meshOutputPerPrimitiveGranularity() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerPrimitiveGranularity(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxPreferredTaskWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxPreferredTaskWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredTaskWorkGroupInvocations(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#maxPreferredMeshWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxPreferredMeshWorkGroupInvocations() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredMeshWorkGroupInvocations(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#prefersLocalInvocationVertexOutput} field. */
        @NativeType("VkBool32")
        public boolean prefersLocalInvocationVertexOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationVertexOutput(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#prefersLocalInvocationPrimitiveOutput} field. */
        @NativeType("VkBool32")
        public boolean prefersLocalInvocationPrimitiveOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationPrimitiveOutput(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#prefersCompactVertexOutput} field. */
        @NativeType("VkBool32")
        public boolean prefersCompactVertexOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactVertexOutput(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#prefersCompactPrimitiveOutput} field. */
        @NativeType("VkBool32")
        public boolean prefersCompactPrimitiveOutput() { return VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactPrimitiveOutput(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#sType} field. */
        public VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMeshShader#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#sType} field. */
        public VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer sType$Default() { return sType(EXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMeshShaderPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(address(), value); return this; }

    }

}