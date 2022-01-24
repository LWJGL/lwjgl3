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
 * Structure specifying parameters for the generation of commands.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The provided {@code pipeline} <b>must</b> match the pipeline bound at execution time</li>
 * <li>If the {@code indirectCommandsLayout} uses a token of {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV}, then the {@code pipeline} <b>must</b> have been created with multiple shader groups</li>
 * <li>If the {@code indirectCommandsLayout} uses a token of {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV}, then the {@code pipeline} <b>must</b> have been created with {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV} set in {@link VkGraphicsPipelineCreateInfo}{@code ::flags}</li>
 * <li>If the {@code indirectCommandsLayout} uses a token of {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV}, then the {@code pipeline}`s {@code VkPipelineLayout} <b>must</b> match the {@link VkIndirectCommandsLayoutTokenNV}{@code ::pushconstantPipelineLayout}</li>
 * <li>{@code streamCount} <b>must</b> match the {@code indirectCommandsLayout}’s {@code streamCount}</li>
 * <li>{@code sequencesCount} <b>must</b> be less or equal to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::maxIndirectSequenceCount} and {@link VkGeneratedCommandsMemoryRequirementsInfoNV}{@code ::maxSequencesCount} that was used to determine the {@code preprocessSize}</li>
 * <li>{@code preprocessBuffer} <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set in its usage flag</li>
 * <li>{@code preprocessOffset} <b>must</b> be aligned to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::minIndirectCommandsBufferOffsetAlignment}</li>
 * <li>If {@code preprocessBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code preprocessSize} <b>must</b> be at least equal to the memory requirement`s size returned by {@link NVDeviceGeneratedCommands#vkGetGeneratedCommandsMemoryRequirementsNV GetGeneratedCommandsMemoryRequirementsNV} using the matching inputs ({@code indirectCommandsLayout}, …​) as within this structure</li>
 * <li>{@code sequencesCountBuffer} <b>can</b> be set if the actual used count of sequences is sourced from the provided buffer. In that case the {@code sequencesCount} serves as upper bound</li>
 * <li>If {@code sequencesCountBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, its usage flag <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
 * <li>If {@code sequencesCountBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesCountOffset} <b>must</b> be aligned to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::minSequencesCountBufferOffsetAlignment}</li>
 * <li>If {@code sequencesCountBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code indirectCommandsLayout}’s {@link NVDeviceGeneratedCommands#VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV} is set, {@code sequencesIndexBuffer} <b>must</b> be set otherwise it <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code sequencesIndexBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, its usage flag <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
 * <li>If {@code sequencesIndexBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesIndexOffset} <b>must</b> be aligned to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::minSequencesIndexBufferOffsetAlignment}</li>
 * <li>If {@code sequencesIndexBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNV} handle</li>
 * <li>{@code pStreams} <b>must</b> be a valid pointer to an array of {@code streamCount} valid {@link VkIndirectCommandsStreamNV} structures</li>
 * <li>{@code preprocessBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>If {@code sequencesCountBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesCountBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>If {@code sequencesIndexBuffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code sequencesIndexBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code streamCount} <b>must</b> be greater than 0</li>
 * <li>Each of {@code indirectCommandsLayout}, {@code pipeline}, {@code preprocessBuffer}, {@code sequencesCountBuffer}, and {@code sequencesIndexBuffer} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsStreamNV}, {@link NVDeviceGeneratedCommands#vkCmdExecuteGeneratedCommandsNV CmdExecuteGeneratedCommandsNV}, {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeneratedCommandsInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineBindPoint {@link #pipelineBindPoint};
 *     VkPipeline {@link #pipeline};
 *     VkIndirectCommandsLayoutNV {@link #indirectCommandsLayout};
 *     uint32_t {@link #streamCount};
 *     {@link VkIndirectCommandsStreamNV VkIndirectCommandsStreamNV} const * {@link #pStreams};
 *     uint32_t {@link #sequencesCount};
 *     VkBuffer {@link #preprocessBuffer};
 *     VkDeviceSize {@link #preprocessOffset};
 *     VkDeviceSize {@link #preprocessSize};
 *     VkBuffer {@link #sequencesCountBuffer};
 *     VkDeviceSize {@link #sequencesCountOffset};
 *     VkBuffer {@link #sequencesIndexBuffer};
 *     VkDeviceSize {@link #sequencesIndexOffset};
 * }</code></pre>
 */
public class VkGeneratedCommandsInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        PIPELINE,
        INDIRECTCOMMANDSLAYOUT,
        STREAMCOUNT,
        PSTREAMS,
        SEQUENCESCOUNT,
        PREPROCESSBUFFER,
        PREPROCESSOFFSET,
        PREPROCESSSIZE,
        SEQUENCESCOUNTBUFFER,
        SEQUENCESCOUNTOFFSET,
        SEQUENCESINDEXBUFFER,
        SEQUENCESINDEXOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        STREAMCOUNT = layout.offsetof(5);
        PSTREAMS = layout.offsetof(6);
        SEQUENCESCOUNT = layout.offsetof(7);
        PREPROCESSBUFFER = layout.offsetof(8);
        PREPROCESSOFFSET = layout.offsetof(9);
        PREPROCESSSIZE = layout.offsetof(10);
        SEQUENCESCOUNTBUFFER = layout.offsetof(11);
        SEQUENCESCOUNTOFFSET = layout.offsetof(12);
        SEQUENCESINDEXBUFFER = layout.offsetof(13);
        SEQUENCESINDEXOFFSET = layout.offsetof(14);
    }

    /**
     * Creates a {@code VkGeneratedCommandsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsInfoNV(ByteBuffer container) {
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
    /** the {@code VkPipelineBindPoint} used for the {@code pipeline}. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** the {@code VkPipeline} used in the generation and execution process. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** the {@code VkIndirectCommandsLayoutNV} that provides the command sequence to generate. */
    @NativeType("VkIndirectCommandsLayoutNV")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** defines the number of input streams */
    @NativeType("uint32_t")
    public int streamCount() { return nstreamCount(address()); }
    /** a pointer to an array of {@code streamCount} {@link VkIndirectCommandsStreamNV} structures providing the input data for the tokens used in {@code indirectCommandsLayout}. */
    @NativeType("VkIndirectCommandsStreamNV const *")
    public VkIndirectCommandsStreamNV.Buffer pStreams() { return npStreams(address()); }
    /** the maximum number of sequences to reserve. If {@code sequencesCountBuffer} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, this is also the actual number of sequences generated. */
    @NativeType("uint32_t")
    public int sequencesCount() { return nsequencesCount(address()); }
    /** the {@code VkBuffer} that is used for preprocessing the input data for execution. If this structure is used with {@link NVDeviceGeneratedCommands#vkCmdExecuteGeneratedCommandsNV CmdExecuteGeneratedCommandsNV} with its {@code isPreprocessed} set to {@code VK_TRUE}, then the preprocessing step is skipped and data is only read from this buffer. */
    @NativeType("VkBuffer")
    public long preprocessBuffer() { return npreprocessBuffer(address()); }
    /** the byte offset into {@code preprocessBuffer} where the preprocessed data is stored. */
    @NativeType("VkDeviceSize")
    public long preprocessOffset() { return npreprocessOffset(address()); }
    /** the maximum byte size within the {@code preprocessBuffer} after the {@code preprocessOffset} that is available for preprocessing. */
    @NativeType("VkDeviceSize")
    public long preprocessSize() { return npreprocessSize(address()); }
    /** a {@code VkBuffer} in which the actual number of sequences is provided as single {@code uint32_t} value. */
    @NativeType("VkBuffer")
    public long sequencesCountBuffer() { return nsequencesCountBuffer(address()); }
    /** the byte offset into {@code sequencesCountBuffer} where the count value is stored. */
    @NativeType("VkDeviceSize")
    public long sequencesCountOffset() { return nsequencesCountOffset(address()); }
    /** a {@code VkBuffer} that encodes the used sequence indices as {@code uint32_t} array. */
    @NativeType("VkBuffer")
    public long sequencesIndexBuffer() { return nsequencesIndexBuffer(address()); }
    /** the byte offset into {@code sequencesIndexBuffer} where the index values start. */
    @NativeType("VkDeviceSize")
    public long sequencesIndexOffset() { return nsequencesIndexOffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGeneratedCommandsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV} value to the {@link #sType} field. */
    public VkGeneratedCommandsInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGeneratedCommandsInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBindPoint} field. */
    public VkGeneratedCommandsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkGeneratedCommandsInfoNV pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@link #indirectCommandsLayout} field. */
    public VkGeneratedCommandsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsStreamNV.Buffer} to the {@link #pStreams} field. */
    public VkGeneratedCommandsInfoNV pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) { npStreams(address(), value); return this; }
    /** Sets the specified value to the {@link #sequencesCount} field. */
    public VkGeneratedCommandsInfoNV sequencesCount(@NativeType("uint32_t") int value) { nsequencesCount(address(), value); return this; }
    /** Sets the specified value to the {@link #preprocessBuffer} field. */
    public VkGeneratedCommandsInfoNV preprocessBuffer(@NativeType("VkBuffer") long value) { npreprocessBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #preprocessOffset} field. */
    public VkGeneratedCommandsInfoNV preprocessOffset(@NativeType("VkDeviceSize") long value) { npreprocessOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #preprocessSize} field. */
    public VkGeneratedCommandsInfoNV preprocessSize(@NativeType("VkDeviceSize") long value) { npreprocessSize(address(), value); return this; }
    /** Sets the specified value to the {@link #sequencesCountBuffer} field. */
    public VkGeneratedCommandsInfoNV sequencesCountBuffer(@NativeType("VkBuffer") long value) { nsequencesCountBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #sequencesCountOffset} field. */
    public VkGeneratedCommandsInfoNV sequencesCountOffset(@NativeType("VkDeviceSize") long value) { nsequencesCountOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #sequencesIndexBuffer} field. */
    public VkGeneratedCommandsInfoNV sequencesIndexBuffer(@NativeType("VkBuffer") long value) { nsequencesIndexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #sequencesIndexOffset} field. */
    public VkGeneratedCommandsInfoNV sequencesIndexOffset(@NativeType("VkDeviceSize") long value) { nsequencesIndexOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsInfoNV set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        long pipeline,
        long indirectCommandsLayout,
        VkIndirectCommandsStreamNV.Buffer pStreams,
        int sequencesCount,
        long preprocessBuffer,
        long preprocessOffset,
        long preprocessSize,
        long sequencesCountBuffer,
        long sequencesCountOffset,
        long sequencesIndexBuffer,
        long sequencesIndexOffset
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        pStreams(pStreams);
        sequencesCount(sequencesCount);
        preprocessBuffer(preprocessBuffer);
        preprocessOffset(preprocessOffset);
        preprocessSize(preprocessSize);
        sequencesCountBuffer(sequencesCountBuffer);
        sequencesCountOffset(sequencesCountOffset);
        sequencesIndexBuffer(sequencesIndexBuffer);
        sequencesIndexOffset(sequencesIndexOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsInfoNV set(VkGeneratedCommandsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoNV malloc() {
        return wrap(VkGeneratedCommandsInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoNV calloc() {
        return wrap(VkGeneratedCommandsInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeneratedCommandsInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoNV} instance for the specified memory address. */
    public static VkGeneratedCommandsInfoNV create(long address) {
        return wrap(VkGeneratedCommandsInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGeneratedCommandsInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeneratedCommandsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeneratedCommandsInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoNV malloc(MemoryStack stack) {
        return wrap(VkGeneratedCommandsInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoNV calloc(MemoryStack stack) {
        return wrap(VkGeneratedCommandsInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsInfoNV.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.PIPELINE); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #streamCount}. */
    public static int nstreamCount(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoNV.STREAMCOUNT); }
    /** Unsafe version of {@link #pStreams}. */
    public static VkIndirectCommandsStreamNV.Buffer npStreams(long struct) { return VkIndirectCommandsStreamNV.create(memGetAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS), nstreamCount(struct)); }
    /** Unsafe version of {@link #sequencesCount}. */
    public static int nsequencesCount(long struct) { return UNSAFE.getInt(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNT); }
    /** Unsafe version of {@link #preprocessBuffer}. */
    public static long npreprocessBuffer(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSBUFFER); }
    /** Unsafe version of {@link #preprocessOffset}. */
    public static long npreprocessOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSOFFSET); }
    /** Unsafe version of {@link #preprocessSize}. */
    public static long npreprocessSize(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSSIZE); }
    /** Unsafe version of {@link #sequencesCountBuffer}. */
    public static long nsequencesCountBuffer(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTBUFFER); }
    /** Unsafe version of {@link #sequencesCountOffset}. */
    public static long nsequencesCountOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTOFFSET); }
    /** Unsafe version of {@link #sequencesIndexBuffer}. */
    public static long nsequencesIndexBuffer(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXBUFFER); }
    /** Unsafe version of {@link #sequencesIndexOffset}. */
    public static long nsequencesIndexOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoNV.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.PIPELINE, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.INDIRECTCOMMANDSLAYOUT, value); }
    /** Sets the specified value to the {@code streamCount} field of the specified {@code struct}. */
    public static void nstreamCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoNV.STREAMCOUNT, value); }
    /** Unsafe version of {@link #pStreams(VkIndirectCommandsStreamNV.Buffer) pStreams}. */
    public static void npStreams(long struct, VkIndirectCommandsStreamNV.Buffer value) { memPutAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS, value.address()); nstreamCount(struct, value.remaining()); }
    /** Unsafe version of {@link #sequencesCount(int) sequencesCount}. */
    public static void nsequencesCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNT, value); }
    /** Unsafe version of {@link #preprocessBuffer(long) preprocessBuffer}. */
    public static void npreprocessBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSBUFFER, value); }
    /** Unsafe version of {@link #preprocessOffset(long) preprocessOffset}. */
    public static void npreprocessOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSOFFSET, value); }
    /** Unsafe version of {@link #preprocessSize(long) preprocessSize}. */
    public static void npreprocessSize(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.PREPROCESSSIZE, value); }
    /** Unsafe version of {@link #sequencesCountBuffer(long) sequencesCountBuffer}. */
    public static void nsequencesCountBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTBUFFER, value); }
    /** Unsafe version of {@link #sequencesCountOffset(long) sequencesCountOffset}. */
    public static void nsequencesCountOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESCOUNTOFFSET, value); }
    /** Unsafe version of {@link #sequencesIndexBuffer(long) sequencesIndexBuffer}. */
    public static void nsequencesIndexBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXBUFFER, value); }
    /** Unsafe version of {@link #sequencesIndexOffset(long) sequencesIndexOffset}. */
    public static void nsequencesIndexOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeneratedCommandsInfoNV.SEQUENCESINDEXOFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkGeneratedCommandsInfoNV.PSTREAMS));
    }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoNV, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGeneratedCommandsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsInfoNV.nsType(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsInfoNV.npNext(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkGeneratedCommandsInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkGeneratedCommandsInfoNV.npipeline(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() { return VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#streamCount} field. */
        @NativeType("uint32_t")
        public int streamCount() { return VkGeneratedCommandsInfoNV.nstreamCount(address()); }
        /** @return a {@link VkIndirectCommandsStreamNV.Buffer} view of the struct array pointed to by the {@link VkGeneratedCommandsInfoNV#pStreams} field. */
        @NativeType("VkIndirectCommandsStreamNV const *")
        public VkIndirectCommandsStreamNV.Buffer pStreams() { return VkGeneratedCommandsInfoNV.npStreams(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sequencesCount} field. */
        @NativeType("uint32_t")
        public int sequencesCount() { return VkGeneratedCommandsInfoNV.nsequencesCount(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#preprocessBuffer} field. */
        @NativeType("VkBuffer")
        public long preprocessBuffer() { return VkGeneratedCommandsInfoNV.npreprocessBuffer(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#preprocessOffset} field. */
        @NativeType("VkDeviceSize")
        public long preprocessOffset() { return VkGeneratedCommandsInfoNV.npreprocessOffset(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#preprocessSize} field. */
        @NativeType("VkDeviceSize")
        public long preprocessSize() { return VkGeneratedCommandsInfoNV.npreprocessSize(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sequencesCountBuffer} field. */
        @NativeType("VkBuffer")
        public long sequencesCountBuffer() { return VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sequencesCountOffset} field. */
        @NativeType("VkDeviceSize")
        public long sequencesCountOffset() { return VkGeneratedCommandsInfoNV.nsequencesCountOffset(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sequencesIndexBuffer} field. */
        @NativeType("VkBuffer")
        public long sequencesIndexBuffer() { return VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address()); }
        /** @return the value of the {@link VkGeneratedCommandsInfoNV#sequencesIndexOffset} field. */
        @NativeType("VkDeviceSize")
        public long sequencesIndexOffset() { return VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address()); }

        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sType} field. */
        public VkGeneratedCommandsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV} value to the {@link VkGeneratedCommandsInfoNV#sType} field. */
        public VkGeneratedCommandsInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV); }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#pNext} field. */
        public VkGeneratedCommandsInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#pipelineBindPoint} field. */
        public VkGeneratedCommandsInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkGeneratedCommandsInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#pipeline} field. */
        public VkGeneratedCommandsInfoNV.Buffer pipeline(@NativeType("VkPipeline") long value) { VkGeneratedCommandsInfoNV.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#indirectCommandsLayout} field. */
        public VkGeneratedCommandsInfoNV.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { VkGeneratedCommandsInfoNV.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsStreamNV.Buffer} to the {@link VkGeneratedCommandsInfoNV#pStreams} field. */
        public VkGeneratedCommandsInfoNV.Buffer pStreams(@NativeType("VkIndirectCommandsStreamNV const *") VkIndirectCommandsStreamNV.Buffer value) { VkGeneratedCommandsInfoNV.npStreams(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sequencesCount} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoNV.nsequencesCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#preprocessBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.npreprocessBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#preprocessOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.npreprocessOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#preprocessSize} field. */
        public VkGeneratedCommandsInfoNV.Buffer preprocessSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.npreprocessSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sequencesCountBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCountBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.nsequencesCountBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sequencesCountOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesCountOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.nsequencesCountOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sequencesIndexBuffer} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesIndexBuffer(@NativeType("VkBuffer") long value) { VkGeneratedCommandsInfoNV.nsequencesIndexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeneratedCommandsInfoNV#sequencesIndexOffset} field. */
        public VkGeneratedCommandsInfoNV.Buffer sequencesIndexOffset(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoNV.nsequencesIndexOffset(address(), value); return this; }

    }

}