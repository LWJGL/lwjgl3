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
 * <pre>{@code
 * struct VkGraphicsShaderGroupCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     {@link VkPipelineVertexInputStateCreateInfo VkPipelineVertexInputStateCreateInfo} const * pVertexInputState;
 *     {@link VkPipelineTessellationStateCreateInfo VkPipelineTessellationStateCreateInfo} const * pTessellationState;
 * }}</pre>
 */
public class VkGraphicsShaderGroupCreateInfoNV extends Struct<VkGraphicsShaderGroupCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGECOUNT,
        PSTAGES,
        PVERTEXINPUTSTATE,
        PTESSELLATIONSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGECOUNT = layout.offsetof(2);
        PSTAGES = layout.offsetof(3);
        PVERTEXINPUTSTATE = layout.offsetof(4);
        PTESSELLATIONSTATE = layout.offsetof(5);
    }

    protected VkGraphicsShaderGroupCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGraphicsShaderGroupCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGraphicsShaderGroupCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGraphicsShaderGroupCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGraphicsShaderGroupCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** @return a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
    @NativeType("VkPipelineVertexInputStateCreateInfo const *")
    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() { return npVertexInputState(address()); }
    /** @return a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
    @NativeType("VkPipelineTessellationStateCreateInfo const *")
    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() { return npTessellationState(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGraphicsShaderGroupCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkGraphicsShaderGroupCreateInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGraphicsShaderGroupCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkGraphicsShaderGroupCreateInfoNV pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { npVertexInputState(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { npTessellationState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGraphicsShaderGroupCreateInfoNV set(
        int sType,
        long pNext,
        VkPipelineShaderStageCreateInfo.Buffer pStages,
        @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState,
        @Nullable VkPipelineTessellationStateCreateInfo pTessellationState
    ) {
        sType(sType);
        pNext(pNext);
        pStages(pStages);
        pVertexInputState(pVertexInputState);
        pTessellationState(pTessellationState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGraphicsShaderGroupCreateInfoNV set(VkGraphicsShaderGroupCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGraphicsShaderGroupCreateInfoNV malloc() {
        return new VkGraphicsShaderGroupCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGraphicsShaderGroupCreateInfoNV calloc() {
        return new VkGraphicsShaderGroupCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGraphicsShaderGroupCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGraphicsShaderGroupCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance for the specified memory address. */
    public static VkGraphicsShaderGroupCreateInfoNV create(long address) {
        return new VkGraphicsShaderGroupCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGraphicsShaderGroupCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGraphicsShaderGroupCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGraphicsShaderGroupCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsShaderGroupCreateInfoNV malloc(MemoryStack stack) {
        return new VkGraphicsShaderGroupCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGraphicsShaderGroupCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGraphicsShaderGroupCreateInfoNV calloc(MemoryStack stack) {
        return new VkGraphicsShaderGroupCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGraphicsShaderGroupCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGraphicsShaderGroupCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGraphicsShaderGroupCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkGraphicsShaderGroupCreateInfoNV.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pVertexInputState}. */
    public static @Nullable VkPipelineVertexInputStateCreateInfo npVertexInputState(long struct) { return VkPipelineVertexInputStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PVERTEXINPUTSTATE)); }
    /** Unsafe version of {@link #pTessellationState}. */
    public static @Nullable VkPipelineTessellationStateCreateInfo npTessellationState(long struct) { return VkPipelineTessellationStateCreateInfo.createSafe(memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PTESSELLATIONSTATE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGraphicsShaderGroupCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkGraphicsShaderGroupCreateInfoNV.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PSTAGES, value.address()); nstageCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pVertexInputState(VkPipelineVertexInputStateCreateInfo) pVertexInputState}. */
    public static void npVertexInputState(long struct, @Nullable VkPipelineVertexInputStateCreateInfo value) { memPutAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PVERTEXINPUTSTATE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pTessellationState(VkPipelineTessellationStateCreateInfo) pTessellationState}. */
    public static void npTessellationState(long struct, @Nullable VkPipelineTessellationStateCreateInfo value) { memPutAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PTESSELLATIONSTATE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PSTAGES);
        check(pStages);
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        long pVertexInputState = memGetAddress(struct + VkGraphicsShaderGroupCreateInfoNV.PVERTEXINPUTSTATE);
        if (pVertexInputState != NULL) {
            VkPipelineVertexInputStateCreateInfo.validate(pVertexInputState);
        }
    }

    // -----------------------------------

    /** An array of {@link VkGraphicsShaderGroupCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGraphicsShaderGroupCreateInfoNV, Buffer> implements NativeResource {

        private static final VkGraphicsShaderGroupCreateInfoNV ELEMENT_FACTORY = VkGraphicsShaderGroupCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGraphicsShaderGroupCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGraphicsShaderGroupCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGraphicsShaderGroupCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGraphicsShaderGroupCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGraphicsShaderGroupCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkGraphicsShaderGroupCreateInfoNV.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkGraphicsShaderGroupCreateInfoNV.npStages(address()); }
        /** @return a {@link VkPipelineVertexInputStateCreateInfo} view of the struct pointed to by the {@code pVertexInputState} field. */
        @NativeType("VkPipelineVertexInputStateCreateInfo const *")
        public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() { return VkGraphicsShaderGroupCreateInfoNV.npVertexInputState(address()); }
        /** @return a {@link VkPipelineTessellationStateCreateInfo} view of the struct pointed to by the {@code pTessellationState} field. */
        @NativeType("VkPipelineTessellationStateCreateInfo const *")
        public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() { return VkGraphicsShaderGroupCreateInfoNV.npTessellationState(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGraphicsShaderGroupCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGraphicsShaderGroupCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkGraphicsShaderGroupCreateInfoNV.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineVertexInputStateCreateInfo} to the {@code pVertexInputState} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pVertexInputState(@Nullable @NativeType("VkPipelineVertexInputStateCreateInfo const *") VkPipelineVertexInputStateCreateInfo value) { VkGraphicsShaderGroupCreateInfoNV.npVertexInputState(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineTessellationStateCreateInfo} to the {@code pTessellationState} field. */
        public VkGraphicsShaderGroupCreateInfoNV.Buffer pTessellationState(@Nullable @NativeType("VkPipelineTessellationStateCreateInfo const *") VkPipelineTessellationStateCreateInfo value) { VkGraphicsShaderGroupCreateInfoNV.npTessellationState(address(), value); return this; }

    }

}