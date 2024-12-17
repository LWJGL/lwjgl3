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
 * <pre>{@code
 * struct VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t requiredSubgroupSize;
 * }}</pre>
 */
public class VkPipelineShaderStageRequiredSubgroupSizeCreateInfo extends Struct<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo> implements NativeResource {

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

    protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code requiredSubgroupSize} field. */
    @NativeType("uint32_t")
    public int requiredSubgroupSize() { return nrequiredSubgroupSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
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
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc() {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance for the specified memory address. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo create(long address) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineShaderStageRequiredSubgroupSizeCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineShaderStageRequiredSubgroupSizeCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #requiredSubgroupSize}. */
    public static int nrequiredSubgroupSize(long struct) { return memGetInt(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.REQUIREDSUBGROUPSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageRequiredSubgroupSizeCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageRequiredSubgroupSizeCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineShaderStageRequiredSubgroupSizeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address()); }
        /** @return the value of the {@code requiredSubgroupSize} field. */
        @NativeType("uint32_t")
        public int requiredSubgroupSize() { return VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nrequiredSubgroupSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer pNext(@NativeType("void *") long value) { VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.npNext(address(), value); return this; }

    }

}