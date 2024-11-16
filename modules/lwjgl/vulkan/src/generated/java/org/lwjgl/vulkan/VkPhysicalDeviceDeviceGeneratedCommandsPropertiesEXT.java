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
 * Structure describing push descriptor limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxIndirectPipelineCount};
 *     uint32_t {@link #maxIndirectShaderObjectCount};
 *     uint32_t {@link #maxIndirectSequenceCount};
 *     uint32_t {@link #maxIndirectCommandsTokenCount};
 *     uint32_t {@link #maxIndirectCommandsTokenOffset};
 *     uint32_t {@link #maxIndirectCommandsIndirectStride};
 *     VkIndirectCommandsInputModeFlagsEXT {@link #supportedIndirectCommandsInputModes};
 *     VkShaderStageFlags {@link #supportedIndirectCommandsShaderStages};
 *     VkShaderStageFlags {@link #supportedIndirectCommandsShaderStagesPipelineBinding};
 *     VkShaderStageFlags {@link #supportedIndirectCommandsShaderStagesShaderBinding};
 *     VkBool32 {@link #deviceGeneratedCommandsTransformFeedback};
 *     VkBool32 {@link #deviceGeneratedCommandsMultiDrawIndirectCount};
 * }</code></pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXINDIRECTPIPELINECOUNT,
        MAXINDIRECTSHADEROBJECTCOUNT,
        MAXINDIRECTSEQUENCECOUNT,
        MAXINDIRECTCOMMANDSTOKENCOUNT,
        MAXINDIRECTCOMMANDSTOKENOFFSET,
        MAXINDIRECTCOMMANDSINDIRECTSTRIDE,
        SUPPORTEDINDIRECTCOMMANDSINPUTMODES,
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES,
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING,
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING,
        DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK,
        DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        MAXINDIRECTPIPELINECOUNT = layout.offsetof(2);
        MAXINDIRECTSHADEROBJECTCOUNT = layout.offsetof(3);
        MAXINDIRECTSEQUENCECOUNT = layout.offsetof(4);
        MAXINDIRECTCOMMANDSTOKENCOUNT = layout.offsetof(5);
        MAXINDIRECTCOMMANDSTOKENOFFSET = layout.offsetof(6);
        MAXINDIRECTCOMMANDSINDIRECTSTRIDE = layout.offsetof(7);
        SUPPORTEDINDIRECTCOMMANDSINPUTMODES = layout.offsetof(8);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES = layout.offsetof(9);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING = layout.offsetof(10);
        SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING = layout.offsetof(11);
        DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK = layout.offsetof(12);
        DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT = layout.offsetof(13);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(ByteBuffer container) {
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
    /** the maximum number of pipelines passed to {@link EXTDeviceGeneratedCommands#vkCreateIndirectExecutionSetEXT CreateIndirectExecutionSetEXT}. */
    @NativeType("uint32_t")
    public int maxIndirectPipelineCount() { return nmaxIndirectPipelineCount(address()); }
    /** the maximum number of shader objects passed to {@link EXTDeviceGeneratedCommands#vkCreateIndirectExecutionSetEXT CreateIndirectExecutionSetEXT}. If this value is zero, binding shader objects indirectly is not supported. */
    @NativeType("uint32_t")
    public int maxIndirectShaderObjectCount() { return nmaxIndirectShaderObjectCount(address()); }
    /** the maximum number of sequences in {@link VkGeneratedCommandsInfoEXT} and in {@link VkGeneratedCommandsMemoryRequirementsInfoEXT}. */
    @NativeType("uint32_t")
    public int maxIndirectSequenceCount() { return nmaxIndirectSequenceCount(address()); }
    /** the maximum number of tokens in {@link VkIndirectCommandsLayoutCreateInfoEXT}. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() { return nmaxIndirectCommandsTokenCount(address()); }
    /** the maximum offset in {@link VkIndirectCommandsLayoutTokenEXT}. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() { return nmaxIndirectCommandsTokenOffset(address()); }
    /** the maximum stream stride in {@link VkIndirectCommandsLayoutCreateInfoEXT}. */
    @NativeType("uint32_t")
    public int maxIndirectCommandsIndirectStride() { return nmaxIndirectCommandsIndirectStride(address()); }
    /** indicates the supported input modes. */
    @NativeType("VkIndirectCommandsInputModeFlagsEXT")
    public int supportedIndirectCommandsInputModes() { return nsupportedIndirectCommandsInputModes(address()); }
    /** indicates the stages which <b>can</b> be used to generate indirect commands. Implementations are required to support, at minimum: {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT}, {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}. */
    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStages() { return nsupportedIndirectCommandsShaderStages(address()); }
    /** indicates the stages which <b>can</b> be used within indirect execution sets for indirectly binding shader stages using pipelines. */
    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesPipelineBinding() { return nsupportedIndirectCommandsShaderStagesPipelineBinding(address()); }
    /** indicates the stages which <b>can</b> be used within indirect execution sets for indirectly binding shader stages using shader objects. */
    @NativeType("VkShaderStageFlags")
    public int supportedIndirectCommandsShaderStagesShaderBinding() { return nsupportedIndirectCommandsShaderStagesShaderBinding(address()); }
    /** indicates whether the implementation supports interactions with {@link EXTTransformFeedback VK_EXT_transform_feedback} for pipelines not created with {@link EXTDeviceGeneratedCommands#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT}. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedCommandsTransformFeedback() { return ndeviceGeneratedCommandsTransformFeedback(address()) != 0; }
    /** indicates whether the implementation supports COUNT variants of multi-draw indirect tokens. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedCommandsMultiDrawIndirectCount() { return ndeviceGeneratedCommandsMultiDrawIndirectCount(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(
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
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxIndirectPipelineCount}. */
    public static int nmaxIndirectPipelineCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTPIPELINECOUNT); }
    /** Unsafe version of {@link #maxIndirectShaderObjectCount}. */
    public static int nmaxIndirectShaderObjectCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSHADEROBJECTCOUNT); }
    /** Unsafe version of {@link #maxIndirectSequenceCount}. */
    public static int nmaxIndirectSequenceCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTSEQUENCECOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenCount}. */
    public static int nmaxIndirectCommandsTokenCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENCOUNT); }
    /** Unsafe version of {@link #maxIndirectCommandsTokenOffset}. */
    public static int nmaxIndirectCommandsTokenOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSTOKENOFFSET); }
    /** Unsafe version of {@link #maxIndirectCommandsIndirectStride}. */
    public static int nmaxIndirectCommandsIndirectStride(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.MAXINDIRECTCOMMANDSINDIRECTSTRIDE); }
    /** Unsafe version of {@link #supportedIndirectCommandsInputModes}. */
    public static int nsupportedIndirectCommandsInputModes(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSINPUTMODES); }
    /** Unsafe version of {@link #supportedIndirectCommandsShaderStages}. */
    public static int nsupportedIndirectCommandsShaderStages(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGES); }
    /** Unsafe version of {@link #supportedIndirectCommandsShaderStagesPipelineBinding}. */
    public static int nsupportedIndirectCommandsShaderStagesPipelineBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESPIPELINEBINDING); }
    /** Unsafe version of {@link #supportedIndirectCommandsShaderStagesShaderBinding}. */
    public static int nsupportedIndirectCommandsShaderStagesShaderBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.SUPPORTEDINDIRECTCOMMANDSSHADERSTAGESSHADERBINDING); }
    /** Unsafe version of {@link #deviceGeneratedCommandsTransformFeedback}. */
    public static int ndeviceGeneratedCommandsTransformFeedback(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSTRANSFORMFEEDBACK); }
    /** Unsafe version of {@link #deviceGeneratedCommandsMultiDrawIndirectCount}. */
    public static int ndeviceGeneratedCommandsMultiDrawIndirectCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.DEVICEGENERATEDCOMMANDSMULTIDRAWINDIRECTCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectPipelineCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectPipelineCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectPipelineCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectShaderObjectCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectShaderObjectCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectShaderObjectCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectSequenceCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectSequenceCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectCommandsTokenCount} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectCommandsTokenOffset} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsTokenOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#maxIndirectCommandsIndirectStride} field. */
        @NativeType("uint32_t")
        public int maxIndirectCommandsIndirectStride() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nmaxIndirectCommandsIndirectStride(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#supportedIndirectCommandsInputModes} field. */
        @NativeType("VkIndirectCommandsInputModeFlagsEXT")
        public int supportedIndirectCommandsInputModes() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsInputModes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#supportedIndirectCommandsShaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStages() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#supportedIndirectCommandsShaderStagesPipelineBinding} field. */
        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesPipelineBinding() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesPipelineBinding(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#supportedIndirectCommandsShaderStagesShaderBinding} field. */
        @NativeType("VkShaderStageFlags")
        public int supportedIndirectCommandsShaderStagesShaderBinding() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsupportedIndirectCommandsShaderStagesShaderBinding(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#deviceGeneratedCommandsTransformFeedback} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedCommandsTransformFeedback() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsTransformFeedback(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#deviceGeneratedCommandsMultiDrawIndirectCount} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedCommandsMultiDrawIndirectCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.ndeviceGeneratedCommandsMultiDrawIndirectCount(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.npNext(address(), value); return this; }

    }

}