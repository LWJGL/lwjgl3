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
 * Structure specifying descriptor buffer offsets to set in a command buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code stageFlags} specifies a subset of all stages corresponding to one or more pipeline bind points, the binding operation still affects all stages corresponding to the given pipeline bind point(s) as if the equivalent original version of this command had been called with the same parameters. For example, specifying a {@code stageFlags} value of {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} | {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} | {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} is equivalent to calling the original version of this command once with {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} and once with {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The offsets in {@code pOffsets} <b>must</b> be aligned to {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::descriptorBufferOffsetAlignment}</li>
 * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any descriptor binding referenced by {@code layout} without the {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT} flag computes a valid address inside the underlying {@code VkBuffer}</li>
 * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a sampler descriptor <b>must</b> be within {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxSamplerDescriptorBufferRange} of the sampler descriptor buffer binding</li>
 * <li>The offsets in {@code pOffsets} <b>must</b> be small enough such that any location accessed by a shader as a resource descriptor <b>must</b> be within {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxResourceDescriptorBufferRange} of the resource descriptor buffer binding</li>
 * <li>Each element of {@code pBufferIndices} <b>must</b> be less than {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT}{@code ::maxDescriptorBufferBindings}</li>
 * <li>Each element of {@code pBufferIndices} <b>must</b> reference a valid descriptor buffer binding set by a previous call to {@link EXTDescriptorBuffer#vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT} in {@code commandBuffer}</li>
 * <li>The sum of {@code firstSet} and {@code setCount} <b>must</b> be less than or equal to {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
 * <li>The {@code VkDescriptorSetLayout} for each set from {@code firstSet} to <code>firstSet + setCount</code> when {@code layout} was created <b>must</b> have been created with the {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT} bit set</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is not enabled, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>If {@code layout} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code pNext} chain <b>must</b> include a valid {@link VkPipelineLayoutCreateInfo} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineLayoutCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * <li>If {@code layout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code pBufferIndices} <b>must</b> be a valid pointer to an array of {@code setCount} {@code uint32_t} values</li>
 * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code setCount} {@code VkDeviceSize} values</li>
 * <li>{@code setCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRMaintenance6#vkCmdSetDescriptorBufferOffsets2EXT CmdSetDescriptorBufferOffsets2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSetDescriptorBufferOffsetsInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkShaderStageFlags {@link #stageFlags};
 *     VkPipelineLayout {@link #layout};
 *     uint32_t {@link #firstSet};
 *     uint32_t {@link #setCount};
 *     uint32_t const * {@link #pBufferIndices};
 *     VkDeviceSize const * {@link #pOffsets};
 * }</code></pre>
 */
public class VkSetDescriptorBufferOffsetsInfoEXT extends Struct<VkSetDescriptorBufferOffsetsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGEFLAGS,
        LAYOUT,
        FIRSTSET,
        SETCOUNT,
        PBUFFERINDICES,
        POFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        FIRSTSET = layout.offsetof(4);
        SETCOUNT = layout.offsetof(5);
        PBUFFERINDICES = layout.offsetof(6);
        POFFSETS = layout.offsetof(7);
    }

    protected VkSetDescriptorBufferOffsetsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSetDescriptorBufferOffsetsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSetDescriptorBufferOffsetsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSetDescriptorBufferOffsetsInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages the descriptor sets will be bound to */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** a {@code VkPipelineLayout} object used to program the bindings. If the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is enabled, {@code layout} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the layout <b>must</b> be specified by chaining {@link VkPipelineLayoutCreateInfo} structure off the {@code pNext} */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** the number of the first set to be bound. */
    @NativeType("uint32_t")
    public int firstSet() { return nfirstSet(address()); }
    /** the number of elements in the {@code pBufferIndices} and {@code pOffsets} arrays. */
    @NativeType("uint32_t")
    public int setCount() { return nsetCount(address()); }
    /** a pointer to an array of indices into the descriptor buffer binding points set by {@link EXTDescriptorBuffer#vkCmdBindDescriptorBuffersEXT CmdBindDescriptorBuffersEXT}. */
    @NativeType("uint32_t const *")
    public IntBuffer pBufferIndices() { return npBufferIndices(address()); }
    /** a pointer to an array of {@code VkDeviceSize} offsets to apply to the bound descriptor buffers. */
    @NativeType("VkDeviceSize const *")
    public LongBuffer pOffsets() { return npOffsets(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT} value to the {@link #sType} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #stageFlags} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #firstSet} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(@NativeType("uint32_t") int value) { nfirstSet(address(), value); return this; }
    /** Sets the specified value to the {@link #setCount} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(@NativeType("uint32_t") int value) { nsetCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pBufferIndices} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) { npBufferIndices(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pOffsets} field. */
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) { npOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSetDescriptorBufferOffsetsInfoEXT set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int firstSet,
        int setCount,
        IntBuffer pBufferIndices,
        LongBuffer pOffsets
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        setCount(setCount);
        pBufferIndices(pBufferIndices);
        pOffsets(pOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSetDescriptorBufferOffsetsInfoEXT set(VkSetDescriptorBufferOffsetsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSetDescriptorBufferOffsetsInfoEXT malloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSetDescriptorBufferOffsetsInfoEXT calloc() {
        return new VkSetDescriptorBufferOffsetsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSetDescriptorBufferOffsetsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetDescriptorBufferOffsetsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance for the specified memory address. */
    public static VkSetDescriptorBufferOffsetsInfoEXT create(long address) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSetDescriptorBufferOffsetsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSetDescriptorBufferOffsetsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSetDescriptorBufferOffsetsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT malloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSetDescriptorBufferOffsetsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT calloc(MemoryStack stack) {
        return new VkSetDescriptorBufferOffsetsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetDescriptorBufferOffsetsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT); }
    /** Unsafe version of {@link #firstSet}. */
    public static int nfirstSet(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.FIRSTSET); }
    /** Unsafe version of {@link #setCount}. */
    public static int nsetCount(long struct) { return memGetInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.SETCOUNT); }
    /** Unsafe version of {@link #pBufferIndices() pBufferIndices}. */
    public static IntBuffer npBufferIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES), nsetCount(struct)); }
    /** Unsafe version of {@link #pOffsets() pOffsets}. */
    public static LongBuffer npOffsets(long struct) { return memLongBuffer(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS), nsetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT, value); }
    /** Unsafe version of {@link #firstSet(int) firstSet}. */
    public static void nfirstSet(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.FIRSTSET, value); }
    /** Sets the specified value to the {@code setCount} field of the specified {@code struct}. */
    public static void nsetCount(long struct, int value) { memPutInt(struct + VkSetDescriptorBufferOffsetsInfoEXT.SETCOUNT, value); }
    /** Unsafe version of {@link #pBufferIndices(IntBuffer) pBufferIndices}. */
    public static void npBufferIndices(long struct, IntBuffer value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES, memAddress(value)); }
    /** Unsafe version of {@link #pOffsets(LongBuffer) pOffsets}. */
    public static void npOffsets(long struct, LongBuffer value) { memPutAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.PBUFFERINDICES));
        check(memGetAddress(struct + VkSetDescriptorBufferOffsetsInfoEXT.POFFSETS));
    }

    // -----------------------------------

    /** An array of {@link VkSetDescriptorBufferOffsetsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSetDescriptorBufferOffsetsInfoEXT, Buffer> implements NativeResource {

        private static final VkSetDescriptorBufferOffsetsInfoEXT ELEMENT_FACTORY = VkSetDescriptorBufferOffsetsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSetDescriptorBufferOffsetsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSetDescriptorBufferOffsetsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSetDescriptorBufferOffsetsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSetDescriptorBufferOffsetsInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSetDescriptorBufferOffsetsInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address()); }
        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address()); }
        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#firstSet} field. */
        @NativeType("uint32_t")
        public int firstSet() { return VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address()); }
        /** @return the value of the {@link VkSetDescriptorBufferOffsetsInfoEXT#setCount} field. */
        @NativeType("uint32_t")
        public int setCount() { return VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSetDescriptorBufferOffsetsInfoEXT#pBufferIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pBufferIndices() { return VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkSetDescriptorBufferOffsetsInfoEXT#pOffsets} field. */
        @NativeType("VkDeviceSize const *")
        public LongBuffer pOffsets() { return VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address()); }

        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#sType} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT} value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#sType} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT); }
        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#pNext} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSetDescriptorBufferOffsetsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#stageFlags} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#layout} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkSetDescriptorBufferOffsetsInfoEXT.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#firstSet} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer firstSet(@NativeType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nfirstSet(address(), value); return this; }
        /** Sets the specified value to the {@link VkSetDescriptorBufferOffsetsInfoEXT#setCount} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer setCount(@NativeType("uint32_t") int value) { VkSetDescriptorBufferOffsetsInfoEXT.nsetCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSetDescriptorBufferOffsetsInfoEXT#pBufferIndices} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pBufferIndices(@NativeType("uint32_t const *") IntBuffer value) { VkSetDescriptorBufferOffsetsInfoEXT.npBufferIndices(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkSetDescriptorBufferOffsetsInfoEXT#pOffsets} field. */
        public VkSetDescriptorBufferOffsetsInfoEXT.Buffer pOffsets(@NativeType("VkDeviceSize const *") LongBuffer value) { VkSetDescriptorBufferOffsetsInfoEXT.npOffsets(address(), value); return this; }

    }

}