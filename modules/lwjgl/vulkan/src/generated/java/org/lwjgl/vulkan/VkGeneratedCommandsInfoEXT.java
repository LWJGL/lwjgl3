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
 * Structure specifying parameters for the generation of commands.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code sequenceCountAddress} is not {@code NULL}, then {@code maxSequenceCount} is the maximum number of sequences that can be executed. The actual number is {@code min(maxSequenceCount, *sequenceCountAddress)}. If {@code sequenceCountAddress} is {@code NULL}, then {@code maxSequenceCount} is the exact number of sequences to execute.</p>
 * 
 * <p>If the action command token for the layout is not a COUNT-type multi-draw indirect token, {@code maxDrawCount} is ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link EXTDeviceGeneratedCommands#vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT} returns a non-zero size, {@code preprocessAddress} <b>must</b> not be {@code NULL}</li>
 * <li>{@code VkDeviceMemory} objects bound to the underlying buffer for {@code preprocessAddress} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned by {@link EXTDeviceGeneratedCommands#vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT}</li>
 * <li>If the {@code indirectCommandsLayout} uses a token of {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT}, then the {@code indirectExecutionSet}’s push constant layout <b>must</b> contain the {@code updateRange} specified in {@link VkIndirectCommandsPushConstantTokenEXT}</li>
 * <li>If the {@code indirectCommandsLayout} uses a token of {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT}, then the {@code indirectExecutionSet}’s push constant layout <b>must</b> contain the {@code updateRange} specified in {@link VkIndirectCommandsPushConstantTokenEXT}</li>
 * <li>{@code maxSequenceCount} <b>must</b> be less or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectSequenceCount} and {@link VkGeneratedCommandsMemoryRequirementsInfoEXT}{@code ::maxSequencesCount} that was used to determine the {@code preprocessSize}</li>
 * <li>If {@code sequenceCountAddress} is not {@code NULL}, the value contained in the address <b>must</b> be less or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectSequenceCount} and {@link VkGeneratedCommandsMemoryRequirementsInfoEXT}{@code ::maxSequencesCount} that was used to determine the {@code preprocessSize}</li>
 * <li>The underlying buffer for {@code preprocessAddress} <b>must</b> have the {@link EXTDeviceGeneratedCommands#VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT} bit set in its usage flag</li>
 * <li>If the underlying buffer for {@code preprocessAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If the {@code indirectCommandsLayout} contains a {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, then the descriptor and push constant layout info provided either by {@code pipelineLayout} or through a {@link VkPipelineLayoutCreateInfo} in {@code pNext} of the {@link VkIndirectCommandsLayoutCreateInfoEXT} used to create {@code indirectCommandsLayout} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">compatible</a> with the descriptor and push constant layout info used by {@code indirectExecutionSet}</li>
 * <li>If {@code indirectCommandsLayout} was created with a token sequence that contained the {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, the shader stages used to create the initial shader state of {@code indirectExecutionSet} <b>must</b> equal the {@link VkIndirectCommandsExecutionSetTokenEXT}{@code ::shaderStages} used to create {@code indirectCommandsLayout}</li>
 * <li>{@code preprocessSize} <b>must</b> be greater than or equal to the memory requirement’s size returned by {@link EXTDeviceGeneratedCommands#vkGetGeneratedCommandsMemoryRequirementsEXT GetGeneratedCommandsMemoryRequirementsEXT} using the matching inputs ({@code indirectCommandsLayout}, …​) as within this structure</li>
 * <li>The underlying buffer for {@code sequenceCountAddress} <b>must</b> have the {@link EXTDeviceGeneratedCommands#VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT} bit set in its usage flag</li>
 * <li>If {@code sequenceCountAddress} is not {@code NULL}, {@code sequenceCountAddress} <b>must</b> be aligned to 4</li>
 * <li>{@code indirectAddress} <b>must</b> be aligned to 4</li>
 * <li>If the underlying buffer for {@code sequenceCountAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code indirectAddress} <b>must</b> not be {@code NULL}</li>
 * <li>{@code indirectAddressSize} <b>must</b> be greater than zero</li>
 * <li>When not ignored, <code>maxDrawCount × maxSequenceCount</code> <b>must</b> be less than <code>2^24</code></li>
 * <li>If {@code indirectCommandsLayout} was created using a {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT} token and shader objects are not bound then the currently bound graphics pipeline <b>must</b> have been created with {@link VK13#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE} in {@code pDynamicStates}</li>
 * <li>If the token sequence of the passed {@code indirectCommandsLayout} contains a {@link EXTDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT} token, the {@code indirectExecutionSet} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code indirectExecutionSet} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, a {@link VkGeneratedCommandsPipelineInfoEXT} or {@link VkGeneratedCommandsShaderInfoEXT} <b>must</b> be included in the {@code pNext} chain</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT}</li>
 * <li>{@code shaderStages} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code shaderStages} <b>must</b> not be 0</li>
 * <li>If {@code indirectExecutionSet} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code indirectExecutionSet} <b>must</b> be a valid {@code VkIndirectExecutionSetEXT} handle</li>
 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutEXT} handle</li>
 * <li>Both of {@code indirectCommandsLayout}, and {@code indirectExecutionSet} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDeviceGeneratedCommands#vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT}, {@link EXTDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsEXT CmdPreprocessGeneratedCommandsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeneratedCommandsInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkShaderStageFlags {@link #shaderStages};
 *     VkIndirectExecutionSetEXT {@link #indirectExecutionSet};
 *     VkIndirectCommandsLayoutEXT {@link #indirectCommandsLayout};
 *     VkDeviceAddress {@link #indirectAddress};
 *     VkDeviceSize {@link #indirectAddressSize};
 *     VkDeviceAddress {@link #preprocessAddress};
 *     VkDeviceSize {@link #preprocessSize};
 *     uint32_t {@link #maxSequenceCount};
 *     VkDeviceAddress {@link #sequenceCountAddress};
 *     uint32_t {@link #maxDrawCount};
 * }</code></pre>
 */
public class VkGeneratedCommandsInfoEXT extends Struct<VkGeneratedCommandsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSTAGES,
        INDIRECTEXECUTIONSET,
        INDIRECTCOMMANDSLAYOUT,
        INDIRECTADDRESS,
        INDIRECTADDRESSSIZE,
        PREPROCESSADDRESS,
        PREPROCESSSIZE,
        MAXSEQUENCECOUNT,
        SEQUENCECOUNTADDRESS,
        MAXDRAWCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSTAGES = layout.offsetof(2);
        INDIRECTEXECUTIONSET = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        INDIRECTADDRESS = layout.offsetof(5);
        INDIRECTADDRESSSIZE = layout.offsetof(6);
        PREPROCESSADDRESS = layout.offsetof(7);
        PREPROCESSSIZE = layout.offsetof(8);
        MAXSEQUENCECOUNT = layout.offsetof(9);
        SEQUENCECOUNTADDRESS = layout.offsetof(10);
        MAXDRAWCOUNT = layout.offsetof(11);
    }

    protected VkGeneratedCommandsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsInfoEXT(ByteBuffer container) {
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
    /** the mask of shader stages used by the commands. */
    @NativeType("VkShaderStageFlags")
    public int shaderStages() { return nshaderStages(address()); }
    /** the indirect execution set to be used for binding shaders. */
    @NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() { return nindirectExecutionSet(address()); }
    /** the {@code VkIndirectCommandsLayoutEXT} that specifies the command sequence data. */
    @NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** an address that holds the indirect buffer data. */
    @NativeType("VkDeviceAddress")
    public long indirectAddress() { return nindirectAddress(address()); }
    /** the size in bytes of indirect buffer data starting at {@code indirectAddress}. */
    @NativeType("VkDeviceSize")
    public long indirectAddressSize() { return nindirectAddressSize(address()); }
    /** specifies a physical address of the {@code VkBuffer} used for preprocessing the input data for execution. If this structure is used with {@link EXTDeviceGeneratedCommands#vkCmdExecuteGeneratedCommandsEXT CmdExecuteGeneratedCommandsEXT} with its {@code isPreprocessed} set to {@link VK10#VK_TRUE TRUE}, then the preprocessing step is skipped but data in this address <b>may</b> still be modified. The contents and the layout of this address are opaque to applications and <b>must</b> not be modified outside functions related to device-generated commands or copied to another buffer for reuse. */
    @NativeType("VkDeviceAddress")
    public long preprocessAddress() { return npreprocessAddress(address()); }
    /** the maximum byte size within {@code preprocessAddress} that is available for preprocessing. */
    @NativeType("VkDeviceSize")
    public long preprocessSize() { return npreprocessSize(address()); }
    /** used to determine the number of sequences to execute. */
    @NativeType("uint32_t")
    public int maxSequenceCount() { return nmaxSequenceCount(address()); }
    /** specifies an optional physical address of a single {@code uint32_t} value containing the requested number of sequences to execute. */
    @NativeType("VkDeviceAddress")
    public long sequenceCountAddress() { return nsequenceCountAddress(address()); }
    /** the maximum number of indirect draws that can be executed by any COUNT-type multi-draw indirect tokens. The draw count in the indirect buffer is clamped to this value for these token types. */
    @NativeType("uint32_t")
    public int maxDrawCount() { return nmaxDrawCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGeneratedCommandsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT} value to the {@link #sType} field. */
    public VkGeneratedCommandsInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGeneratedCommandsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #shaderStages} field. */
    public VkGeneratedCommandsInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) { nshaderStages(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectExecutionSet} field. */
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { nindirectExecutionSet(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectCommandsLayout} field. */
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectAddress} field. */
    public VkGeneratedCommandsInfoEXT indirectAddress(@NativeType("VkDeviceAddress") long value) { nindirectAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectAddressSize} field. */
    public VkGeneratedCommandsInfoEXT indirectAddressSize(@NativeType("VkDeviceSize") long value) { nindirectAddressSize(address(), value); return this; }
    /** Sets the specified value to the {@link #preprocessAddress} field. */
    public VkGeneratedCommandsInfoEXT preprocessAddress(@NativeType("VkDeviceAddress") long value) { npreprocessAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #preprocessSize} field. */
    public VkGeneratedCommandsInfoEXT preprocessSize(@NativeType("VkDeviceSize") long value) { npreprocessSize(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSequenceCount} field. */
    public VkGeneratedCommandsInfoEXT maxSequenceCount(@NativeType("uint32_t") int value) { nmaxSequenceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #sequenceCountAddress} field. */
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(@NativeType("VkDeviceAddress") long value) { nsequenceCountAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #maxDrawCount} field. */
    public VkGeneratedCommandsInfoEXT maxDrawCount(@NativeType("uint32_t") int value) { nmaxDrawCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsInfoEXT set(
        int sType,
        long pNext,
        int shaderStages,
        long indirectExecutionSet,
        long indirectCommandsLayout,
        long indirectAddress,
        long indirectAddressSize,
        long preprocessAddress,
        long preprocessSize,
        int maxSequenceCount,
        long sequenceCountAddress,
        int maxDrawCount
    ) {
        sType(sType);
        pNext(pNext);
        shaderStages(shaderStages);
        indirectExecutionSet(indirectExecutionSet);
        indirectCommandsLayout(indirectCommandsLayout);
        indirectAddress(indirectAddress);
        indirectAddressSize(indirectAddressSize);
        preprocessAddress(preprocessAddress);
        preprocessSize(preprocessSize);
        maxSequenceCount(maxSequenceCount);
        sequenceCountAddress(sequenceCountAddress);
        maxDrawCount(maxDrawCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsInfoEXT set(VkGeneratedCommandsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoEXT malloc() {
        return new VkGeneratedCommandsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoEXT calloc() {
        return new VkGeneratedCommandsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance for the specified memory address. */
    public static VkGeneratedCommandsInfoEXT create(long address) {
        return new VkGeneratedCommandsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #shaderStages}. */
    public static int nshaderStages(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoEXT.SHADERSTAGES); }
    /** Unsafe version of {@link #indirectExecutionSet}. */
    public static long nindirectExecutionSet(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #indirectAddress}. */
    public static long nindirectAddress(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESS); }
    /** Unsafe version of {@link #indirectAddressSize}. */
    public static long nindirectAddressSize(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE); }
    /** Unsafe version of {@link #preprocessAddress}. */
    public static long npreprocessAddress(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS); }
    /** Unsafe version of {@link #preprocessSize}. */
    public static long npreprocessSize(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.PREPROCESSSIZE); }
    /** Unsafe version of {@link #maxSequenceCount}. */
    public static int nmaxSequenceCount(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT); }
    /** Unsafe version of {@link #sequenceCountAddress}. */
    public static long nsequenceCountAddress(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS); }
    /** Unsafe version of {@link #maxDrawCount}. */
    public static int nmaxDrawCount(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderStages(int) shaderStages}. */
    public static void nshaderStages(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoEXT.SHADERSTAGES, value); }
    /** Unsafe version of {@link #indirectExecutionSet(long) indirectExecutionSet}. */
    public static void nindirectExecutionSet(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #indirectAddress(long) indirectAddress}. */
    public static void nindirectAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESS, value); }
    /** Unsafe version of {@link #indirectAddressSize(long) indirectAddressSize}. */
    public static void nindirectAddressSize(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE, value); }
    /** Unsafe version of {@link #preprocessAddress(long) preprocessAddress}. */
    public static void npreprocessAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS, value); }
    /** Unsafe version of {@link #preprocessSize(long) preprocessSize}. */
    public static void npreprocessSize(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.PREPROCESSSIZE, value); }
    /** Unsafe version of {@link #maxSequenceCount(int) maxSequenceCount}. */
    public static void nmaxSequenceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT, value); }
    /** Unsafe version of {@link #sequenceCountAddress(long) sequenceCountAddress}. */
    public static void nsequenceCountAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS, value); }
    /** Unsafe version of {@link #maxDrawCount(int) maxDrawCount}. */
    public static void nmaxDrawCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoEXT, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#shaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStages() { return VkGeneratedCommandsInfoEXT.nshaderStages(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#indirectExecutionSet} field. */
        @NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() { return VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() { return VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#indirectAddress} field. */
        @NativeType("VkDeviceAddress")
        public long indirectAddress() { return VkGeneratedCommandsInfoEXT.nindirectAddress(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#indirectAddressSize} field. */
        @NativeType("VkDeviceSize")
        public long indirectAddressSize() { return VkGeneratedCommandsInfoEXT.nindirectAddressSize(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#preprocessAddress} field. */
        @NativeType("VkDeviceAddress")
        public long preprocessAddress() { return VkGeneratedCommandsInfoEXT.npreprocessAddress(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#preprocessSize} field. */
        @NativeType("VkDeviceSize")
        public long preprocessSize() { return VkGeneratedCommandsInfoEXT.npreprocessSize(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#maxSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxSequenceCount() { return VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#sequenceCountAddress} field. */
        @NativeType("VkDeviceAddress")
        public long sequenceCountAddress() { return VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoEXT#maxDrawCount} field. */
        @NativeType("uint32_t")
        public int maxDrawCount() { return VkGeneratedCommandsInfoEXT.nmaxDrawCount(address()); }

        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#sType} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT} value to the {@link VkGeneratedCommandsInfoEXT#sType} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT); }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#pNext} field. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#shaderStages} field. */
        public VkGeneratedCommandsInfoEXT.Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) { VkGeneratedCommandsInfoEXT.nshaderStages(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#indirectExecutionSet} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#indirectCommandsLayout} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#indirectAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.nindirectAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#indirectAddressSize} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectAddressSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.nindirectAddressSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#preprocessAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer preprocessAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.npreprocessAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#preprocessSize} field. */
        public VkGeneratedCommandsInfoEXT.Buffer preprocessSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.npreprocessSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#maxSequenceCount} field. */
        public VkGeneratedCommandsInfoEXT.Buffer maxSequenceCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#sequenceCountAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sequenceCountAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoEXT#maxDrawCount} field. */
        public VkGeneratedCommandsInfoEXT.Buffer maxDrawCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.nmaxDrawCount(address(), value); return this; }

    }

}