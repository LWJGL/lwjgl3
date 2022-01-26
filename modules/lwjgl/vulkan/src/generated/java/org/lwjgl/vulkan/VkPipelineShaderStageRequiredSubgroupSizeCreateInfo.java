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
 * Structure specifying the required subgroup size of a newly created pipeline shader stage.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure is included in the {@code pNext} chain of {@link VkPipelineShaderStageCreateInfo}, it specifies that the pipeline shader stage being compiled has a required subgroup size.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code requiredSubgroupSize} <b>must</b> be a power-of-two integer</li>
 * <li>{@code requiredSubgroupSize} <b>must</b> be greater or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-minSubgroupSize">minSubgroupSize</a></li>
 * <li>{@code requiredSubgroupSize} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxSubgroupSize">maxSubgroupSize</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #requiredSubgroupSize};
 * }</code></pre>
 */
public class VkPipelineShaderStageRequiredSubgroupSizeCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REQUIREDSUBGROUPSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REQUIREDSUBGROUPSIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an unsigned integer value specifying the required subgroup size for the newly created pipeline shader stage. */
    @NativeType("uint32_t")
    public int requiredSubgroupSize() { return nrequiredSubgroupSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo set(
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
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo set(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo malloc() {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc() {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance for the specified memory address. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create(long address) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #requiredSubgroupSize}. */
    public static int nrequiredSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.REQUIREDSUBGROUPSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageRequiredSubgroupSizeCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#requiredSubgroupSize} field. */
        @NativeType("uint32_t")
        public int requiredSubgroupSize() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nrequiredSubgroupSize(address()); }

        /** Sets the specified value to the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#sType} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#sType} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#pNext} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer pNext(@NativeType("void *") long value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address(), value); return this; }

    }

}