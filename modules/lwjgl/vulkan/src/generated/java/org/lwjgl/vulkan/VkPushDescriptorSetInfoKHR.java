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
 * Structure specifying a descriptor set push operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code stageFlags} specifies a subset of all stages corresponding to one or more pipeline bind points, the binding operation still affects all stages corresponding to the given pipeline bind point(s) as if the equivalent original version of this command had been called with the same parameters. For example, specifying a {@code stageFlags} value of {@link VK10#VK_SHADER_STAGE_VERTEX_BIT SHADER_STAGE_VERTEX_BIT} | {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT} | {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} is equivalent to calling the original version of this command once with {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS} and once with {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code set} <b>must</b> be less than {@link VkPipelineLayoutCreateInfo}{@code ::setLayoutCount} provided when {@code layout} was created</li>
 * <li>{@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}</li>
 * <li>For each element <code>i</code> where {@code pDescriptorWrites}[i].{@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, {@code pDescriptorWrites}[i].{@code pImageInfo} <b>must</b> be a valid pointer to an array of {@code pDescriptorWrites}[i].{@code descriptorCount} valid {@link VkDescriptorImageInfo} structures</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is not enabled, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>If {@code layout} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the {@code pNext} chain <b>must</b> include a valid {@link VkPipelineLayoutCreateInfo} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineLayoutCreateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * <li>If {@code layout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code pDescriptorWrites} <b>must</b> be a valid pointer to an array of {@code descriptorWriteCount} valid {@link VkWriteDescriptorSet} structures</li>
 * <li>{@code descriptorWriteCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkWriteDescriptorSet}, {@link KHRMaintenance6#vkCmdPushDescriptorSet2KHR CmdPushDescriptorSet2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPushDescriptorSetInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkShaderStageFlags {@link #stageFlags};
 *     VkPipelineLayout {@link #layout};
 *     uint32_t {@link #set};
 *     uint32_t {@link #descriptorWriteCount};
 *     {@link VkWriteDescriptorSet VkWriteDescriptorSet} const * {@link #pDescriptorWrites};
 * }</code></pre>
 */
public class VkPushDescriptorSetInfoKHR extends Struct<VkPushDescriptorSetInfoKHR> implements NativeResource {

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
        SET,
        DESCRIPTORWRITECOUNT,
        PDESCRIPTORWRITES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGEFLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
        DESCRIPTORWRITECOUNT = layout.offsetof(5);
        PDESCRIPTORWRITES = layout.offsetof(6);
    }

    protected VkPushDescriptorSetInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDescriptorSetInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPushDescriptorSetInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPushDescriptorSetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDescriptorSetInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkShaderStageFlagBits} specifying the shader stages that will use the descriptors. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** a {@code VkPipelineLayout} object used to program the bindings. If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-dynamicPipelineLayout">{@code dynamicPipelineLayout}</a> feature is enabled, {@code layout} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and the layout <b>must</b> be specified by chaining {@link VkPipelineLayoutCreateInfo} structure off the {@code pNext} */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** the set number of the descriptor set in the pipeline layout that will be updated. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }
    /** the number of elements in the {@code pDescriptorWrites} array. */
    @NativeType("uint32_t")
    public int descriptorWriteCount() { return ndescriptorWriteCount(address()); }
    /** a pointer to an array of {@link VkWriteDescriptorSet} structures describing the descriptors to be updated. */
    @NativeType("VkWriteDescriptorSet const *")
    public VkWriteDescriptorSet.Buffer pDescriptorWrites() { return npDescriptorWrites(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPushDescriptorSetInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR} value to the {@link #sType} field. */
    public VkPushDescriptorSetInfoKHR sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPushDescriptorSetInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkPushDescriptorSetInfoKHR pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #stageFlags} field. */
    public VkPushDescriptorSetInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #layout} field. */
    public VkPushDescriptorSetInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@link #set} field. */
    public VkPushDescriptorSetInfoKHR set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@link #pDescriptorWrites} field. */
    public VkPushDescriptorSetInfoKHR pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { npDescriptorWrites(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushDescriptorSetInfoKHR set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int set,
        VkWriteDescriptorSet.Buffer pDescriptorWrites
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        pDescriptorWrites(pDescriptorWrites);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDescriptorSetInfoKHR set(VkPushDescriptorSetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfoKHR malloc() {
        return new VkPushDescriptorSetInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfoKHR calloc() {
        return new VkPushDescriptorSetInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPushDescriptorSetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance for the specified memory address. */
    public static VkPushDescriptorSetInfoKHR create(long address) {
        return new VkPushDescriptorSetInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPushDescriptorSetInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPushDescriptorSetInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDescriptorSetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPushDescriptorSetInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfoKHR malloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfoKHR calloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPushDescriptorSetInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushDescriptorSetInfoKHR.PNEXT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return UNSAFE.getInt(null, struct + VkPushDescriptorSetInfoKHR.STAGEFLAGS); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return UNSAFE.getLong(null, struct + VkPushDescriptorSetInfoKHR.LAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return UNSAFE.getInt(null, struct + VkPushDescriptorSetInfoKHR.SET); }
    /** Unsafe version of {@link #descriptorWriteCount}. */
    public static int ndescriptorWriteCount(long struct) { return UNSAFE.getInt(null, struct + VkPushDescriptorSetInfoKHR.DESCRIPTORWRITECOUNT); }
    /** Unsafe version of {@link #pDescriptorWrites}. */
    public static VkWriteDescriptorSet.Buffer npDescriptorWrites(long struct) { return VkWriteDescriptorSet.create(memGetAddress(struct + VkPushDescriptorSetInfoKHR.PDESCRIPTORWRITES), ndescriptorWriteCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPushDescriptorSetInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushDescriptorSetInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkPushDescriptorSetInfoKHR.STAGEFLAGS, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { UNSAFE.putLong(null, struct + VkPushDescriptorSetInfoKHR.LAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { UNSAFE.putInt(null, struct + VkPushDescriptorSetInfoKHR.SET, value); }
    /** Sets the specified value to the {@code descriptorWriteCount} field of the specified {@code struct}. */
    public static void ndescriptorWriteCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPushDescriptorSetInfoKHR.DESCRIPTORWRITECOUNT, value); }
    /** Unsafe version of {@link #pDescriptorWrites(VkWriteDescriptorSet.Buffer) pDescriptorWrites}. */
    public static void npDescriptorWrites(long struct, VkWriteDescriptorSet.Buffer value) { memPutAddress(struct + VkPushDescriptorSetInfoKHR.PDESCRIPTORWRITES, value.address()); ndescriptorWriteCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPushDescriptorSetInfoKHR.PDESCRIPTORWRITES));
    }

    // -----------------------------------

    /** An array of {@link VkPushDescriptorSetInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPushDescriptorSetInfoKHR, Buffer> implements NativeResource {

        private static final VkPushDescriptorSetInfoKHR ELEMENT_FACTORY = VkPushDescriptorSetInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPushDescriptorSetInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDescriptorSetInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDescriptorSetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushDescriptorSetInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushDescriptorSetInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushDescriptorSetInfoKHR.nstageFlags(address()); }
        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkPushDescriptorSetInfoKHR.nlayout(address()); }
        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#set} field. */
        @NativeType("uint32_t")
        public int set() { return VkPushDescriptorSetInfoKHR.nset(address()); }
        /** @return the value of the {@link VkPushDescriptorSetInfoKHR#descriptorWriteCount} field. */
        @NativeType("uint32_t")
        public int descriptorWriteCount() { return VkPushDescriptorSetInfoKHR.ndescriptorWriteCount(address()); }
        /** @return a {@link VkWriteDescriptorSet.Buffer} view of the struct array pointed to by the {@link VkPushDescriptorSetInfoKHR#pDescriptorWrites} field. */
        @NativeType("VkWriteDescriptorSet const *")
        public VkWriteDescriptorSet.Buffer pDescriptorWrites() { return VkPushDescriptorSetInfoKHR.npDescriptorWrites(address()); }

        /** Sets the specified value to the {@link VkPushDescriptorSetInfoKHR#sType} field. */
        public VkPushDescriptorSetInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDescriptorSetInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance6#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR} value to the {@link VkPushDescriptorSetInfoKHR#sType} field. */
        public VkPushDescriptorSetInfoKHR.Buffer sType$Default() { return sType(KHRMaintenance6.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR); }
        /** Sets the specified value to the {@link VkPushDescriptorSetInfoKHR#pNext} field. */
        public VkPushDescriptorSetInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPushDescriptorSetInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkPushDescriptorSetInfoKHR.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPushDescriptorSetInfoKHR#stageFlags} field. */
        public VkPushDescriptorSetInfoKHR.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfoKHR.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushDescriptorSetInfoKHR#layout} field. */
        public VkPushDescriptorSetInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushDescriptorSetInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushDescriptorSetInfoKHR#set} field. */
        public VkPushDescriptorSetInfoKHR.Buffer set(@NativeType("uint32_t") int value) { VkPushDescriptorSetInfoKHR.nset(address(), value); return this; }
        /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@link VkPushDescriptorSetInfoKHR#pDescriptorWrites} field. */
        public VkPushDescriptorSetInfoKHR.Buffer pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { VkPushDescriptorSetInfoKHR.npDescriptorWrites(address(), value); return this; }

    }

}