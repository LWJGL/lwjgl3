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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a newly created indirect commands layout object.
 * 
 * <h5>Description</h5>
 * 
 * <p>The following code illustrates some of the flags:</p>
 * 
 * <pre><code>
 * void cmdProcessAllSequences(cmd, indirectExecutionSet, indirectCommandsLayout, indirectAddress, sequencesCount)
 * {
 *   for (s = 0; s &lt; sequencesCount; s++)
 *   {
 *     sUsed = s;
 * 
 *     if (indirectCommandsLayout.flags &amp; VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT) {
 *       sUsed = incoherent_implementation_dependent_permutation[ sUsed ];
 *     }
 * 
 *     cmdProcessSequence( cmd, indirectExecutionSet, indirectCommandsLayout, indirectAddress, sUsed );
 *   }
 * }</code></pre>
 * 
 * <p>When tokens are consumed, an offset is computed based on token offset and stream stride. The resulting offset is required to be aligned. The alignment for a specific token is equal to the scalar alignment of the data type as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#interfaces-alignment-requirements">Alignment Requirements</a>, or 4, whichever is lower.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code indirectStride} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectCommandsIndirectStride}</li>
 * <li>{@code shaderStages} <b>must</b> only contain stages supported by <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-supportedIndirectCommandsShaderStages">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStages}</a></li>
 * <li>{@code tokenCount} <b>must</b> less than or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectCommandsTokenCount}</li>
 * <li>The number of tokens in the {@code pTokens} array with {@code type} equal to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} <b>must</b> be less than or equal to 1</li>
 * <li>The number of tokens in the {@code pTokens} array with {@code type} equal to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT} <b>must</b> be less than or equal to 1</li>
 * <li>The number of tokens in the {@code pTokens} array with {@code type} equal to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT} <b>must</b> be less than or equal to 1</li>
 * <li>If the action command token in the {@code pTokens} array is not an indexed draw token, then {@code pTokens} <b>must</b> not contain a member with {@code type} set to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT}</li>
 * <li>If the action command token in the {@code pTokens} array is not a non-mesh draw token, then {@code pTokens} <b>must</b> not contain a member with {@code type} set to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT}</li>
 * <li>If the {@code pTokens} array contains multiple tokens with {@code type} equal to {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT}, then there <b>must</b> be no duplicate {@link VkIndirectCommandsVertexBufferTokenEXT}{@code ::vertexBindingUnit} values</li>
 * <li>For all {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT} and {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT} type tokens in {@code pTokens}, there <b>must</b> be no overlapping ranges between any specified push constant ranges</li>
 * <li>The action command token <b>must</b> be the last token in the {@code pTokens} array</li>
 * <li>If the {@code pTokens} array contains a {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, then this token <b>must</b> be the first token in the array</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT} or {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT} and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicGeneratedPipelineLayout">{@code dynamicGeneratedPipelineLayout}</a> is not enabled, then the {@code pipelineLayout} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>For any element of {@code pTokens}, if {@code type} is either {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT} or {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT} and {@code pipelineLayout} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the {@code pNext} chain <b>must</b> include a {@link VkPipelineLayoutCreateInfo} struct</li>
 * <li>For any element of {@code pTokens}, the {@code offset} <b>must</b> be greater than or equal to the {@code offset} member of the previous tokens</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT}, {@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT}, {@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT}, {@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT}, {@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT}, or {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT}, then {@code shaderStages} <b>must</b> contain graphics stages</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT}, then {@code shaderStages} <b>must</b> be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT} or {@link EXTMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT}, then {@code shaderStages} <b>must</b> contain {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT} or {@link NVMeshShader#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT}, then the {@code shaderStages} <b>must</b> contain {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
 * <li>For any element of {@code pTokens}, if {@code type} is {@link KHRRayTracingMaintenance1#VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT}, then {@code shaderStages} <b>must</b> contain ray tracing stages</li>
 * <li>If {@code shaderStages} contains graphics stages then the state tokens in {@code pTokens} <b>must</b> not include {@link KHRRayTracingMaintenance1#VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT}</li>
 * <li>If {@code shaderStages} is {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} then the state tokens in {@code pTokens} <b>must</b> only include {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT}, or {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT}</li>
 * <li>If {@code shaderStages} contains ray tracing stages then the state tokens in {@code pTokens} <b>must</b> only include {@link KHRRayTracingMaintenance1#VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT}, {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT}, or {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT}</li>
 * <li>The {@code shaderStages} <b>must</b> only contain stages from one of the following:
 * 
 * <ul>
 * <li>graphics stages</li>
 * <li>{@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>mesh stages and {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>ray tracing stages</li>
 * </ul>
 * </li>
 * <li>If {@code shaderStages} contains {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, then {@code shaderStages} <b>must</b> also contain {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} or {@link EXTMeshShader#VK_SHADER_STAGE_MESH_BIT_EXT SHADER_STAGE_MESH_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineLayoutCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkIndirectCommandsLayoutUsageFlagBitsEXT} values</li>
 * <li>{@code shaderStages} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code shaderStages} <b>must</b> not be 0</li>
 * <li>If {@code pipelineLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code pTokens} <b>must</b> be a valid pointer to an array of {@code tokenCount} valid {@link VkIndirectCommandsLayoutTokenEXT} structures</li>
 * <li>{@code tokenCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsLayoutTokenEXT}, {@link EXTDeviceGeneratedCommands#vkCreateIndirectCommandsLayoutEXT CreateIndirectCommandsLayoutEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsLayoutCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkIndirectCommandsLayoutUsageFlagsEXT {@link #flags};
 *     VkShaderStageFlags {@link #shaderStages};
 *     uint32_t {@link #indirectStride};
 *     VkPipelineLayout {@link #pipelineLayout};
 *     uint32_t {@link #tokenCount};
 *     {@link VkIndirectCommandsLayoutTokenEXT VkIndirectCommandsLayoutTokenEXT} const * {@link #pTokens};
 * }</code></pre>
 */
public class VkIndirectCommandsLayoutCreateInfoEXT extends Struct<VkIndirectCommandsLayoutCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SHADERSTAGES,
        INDIRECTSTRIDE,
        PIPELINELAYOUT,
        TOKENCOUNT,
        PTOKENS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SHADERSTAGES = layout.offsetof(3);
        INDIRECTSTRIDE = layout.offsetof(4);
        PIPELINELAYOUT = layout.offsetof(5);
        TOKENCOUNT = layout.offsetof(6);
        PTOKENS = layout.offsetof(7);
    }

    protected VkIndirectCommandsLayoutCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkIndirectCommandsLayoutUsageFlagBitsEXT} specifying usage rules for this layout. */
    @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the {@code VkShaderStageFlags} that this layout supports. */
    @NativeType("VkShaderStageFlags")
    public int shaderStages() { return nshaderStages(address()); }
    /** the distance in bytes between sequences in the indirect buffer */
    @NativeType("uint32_t")
    public int indirectStride() { return nindirectStride(address()); }
    /** the optional {@code VkPipelineLayout} that tokens in this layout use. If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicGeneratedPipelineLayout">{@code dynamicGeneratedPipelineLayout}</a> feature is enabled, {@code pipelineLayout} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the layout <b>must</b> be specified by chaining the {@link VkPipelineLayoutCreateInfo} structure off the {@code pNext} */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** the length of the individual command sequence. */
    @NativeType("uint32_t")
    public int tokenCount() { return ntokenCount(address()); }
    /** a pointer to an array of {@link VkIndirectCommandsLayoutTokenEXT} describing each command token in detail. */
    @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
    public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() { return npTokens(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderStages} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) { nshaderStages(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectStride} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(@NativeType("uint32_t") int value) { nindirectStride(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineLayout} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenEXT.Buffer} to the {@link #pTokens} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) { npTokens(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int shaderStages,
        int indirectStride,
        long pipelineLayout,
        VkIndirectCommandsLayoutTokenEXT.Buffer pTokens
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        shaderStages(shaderStages);
        indirectStride(indirectStride);
        pipelineLayout(pipelineLayout);
        pTokens(pTokens);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutCreateInfoEXT set(VkIndirectCommandsLayoutCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoEXT malloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoEXT calloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutCreateInfoEXT create(long address) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #shaderStages}. */
    public static int nshaderStages(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.SHADERSTAGES); }
    /** Unsafe version of {@link #indirectStride}. */
    public static int nindirectStride(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.INDIRECTSTRIDE); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return memGetLong(struct + VkIndirectCommandsLayoutCreateInfoEXT.PIPELINELAYOUT); }
    /** Unsafe version of {@link #tokenCount}. */
    public static int ntokenCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.TOKENCOUNT); }
    /** Unsafe version of {@link #pTokens}. */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer npTokens(long struct) { return VkIndirectCommandsLayoutTokenEXT.create(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS), ntokenCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #shaderStages(int) shaderStages}. */
    public static void nshaderStages(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.SHADERSTAGES, value); }
    /** Unsafe version of {@link #indirectStride(int) indirectStride}. */
    public static void nindirectStride(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.INDIRECTSTRIDE, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkIndirectCommandsLayoutCreateInfoEXT.PIPELINELAYOUT, value); }
    /** Sets the specified value to the {@code tokenCount} field of the specified {@code struct}. */
    public static void ntokenCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.TOKENCOUNT, value); }
    /** Unsafe version of {@link #pTokens(VkIndirectCommandsLayoutTokenEXT.Buffer) pTokens}. */
    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenEXT.Buffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS, value.address()); ntokenCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS));
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutCreateInfoEXT ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#flags} field. */
        @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
        public int flags() { return VkIndirectCommandsLayoutCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#shaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStages() { return VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#indirectStride} field. */
        @NativeType("uint32_t")
        public int indirectStride() { return VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address()); }
        /** @return the value of the {@link VkIndirectCommandsLayoutCreateInfoEXT#tokenCount} field. */
        @NativeType("uint32_t")
        public int tokenCount() { return VkIndirectCommandsLayoutCreateInfoEXT.ntokenCount(address()); }
        /** @return a {@link VkIndirectCommandsLayoutTokenEXT.Buffer} view of the struct array pointed to by the {@link VkIndirectCommandsLayoutCreateInfoEXT#pTokens} field. */
        @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
        public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() { return VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address()); }

        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#sType} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT} value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#sType} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#pNext} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutCreateInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#flags} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#shaderStages} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#indirectStride} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer indirectStride(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsLayoutCreateInfoEXT#pipelineLayout} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenEXT.Buffer} to the {@link VkIndirectCommandsLayoutCreateInfoEXT#pTokens} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) { VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address(), value); return this; }

    }

}