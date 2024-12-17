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
 * struct VkExecutionGraphPipelineCreateInfoAMDX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     {@link VkPipelineLibraryCreateInfoKHR VkPipelineLibraryCreateInfoKHR} const * pLibraryInfo;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }}</pre>
 */
public class VkExecutionGraphPipelineCreateInfoAMDX extends Struct<VkExecutionGraphPipelineCreateInfoAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGECOUNT,
        PSTAGES,
        PLIBRARYINFO,
        LAYOUT,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGECOUNT = layout.offsetof(3);
        PSTAGES = layout.offsetof(4);
        PLIBRARYINFO = layout.offsetof(5);
        LAYOUT = layout.offsetof(6);
        BASEPIPELINEHANDLE = layout.offsetof(7);
        BASEPIPELINEINDEX = layout.offsetof(8);
    }

    protected VkExecutionGraphPipelineCreateInfoAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExecutionGraphPipelineCreateInfoAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, container);
    }

    /**
     * Creates a {@code VkExecutionGraphPipelineCreateInfoAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExecutionGraphPipelineCreateInfoAMDX(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return npStages(address()); }
    /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInfo} field. */
    @NativeType("VkPipelineLibraryCreateInfoKHR const *")
    public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return npLibraryInfo(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** @return the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX} value to the {@code sType} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkExecutionGraphPipelineCreateInfoAMDX pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code stageCount} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX stageCount(@NativeType("uint32_t") int value) { nstageCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@code pLibraryInfo} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { npLibraryInfo(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkExecutionGraphPipelineCreateInfoAMDX basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExecutionGraphPipelineCreateInfoAMDX set(
        int sType,
        long pNext,
        int flags,
        int stageCount,
        VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages,
        @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pLibraryInfo(pLibraryInfo);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExecutionGraphPipelineCreateInfoAMDX set(VkExecutionGraphPipelineCreateInfoAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineCreateInfoAMDX malloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExecutionGraphPipelineCreateInfoAMDX calloc() {
        return new VkExecutionGraphPipelineCreateInfoAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated with {@link BufferUtils}. */
    public static VkExecutionGraphPipelineCreateInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExecutionGraphPipelineCreateInfoAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance for the specified memory address. */
    public static VkExecutionGraphPipelineCreateInfoAMDX create(long address) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExecutionGraphPipelineCreateInfoAMDX createSafe(long address) {
        return address == NULL ? null : new VkExecutionGraphPipelineCreateInfoAMDX(address, null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExecutionGraphPipelineCreateInfoAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX malloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExecutionGraphPipelineCreateInfoAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX calloc(MemoryStack stack) {
        return new VkExecutionGraphPipelineCreateInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExecutionGraphPipelineCreateInfoAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.@Nullable Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.createSafe(memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pLibraryInfo}. */
    public static @Nullable VkPipelineLibraryCreateInfoKHR npLibraryInfo(long struct) { return VkPipelineLibraryCreateInfoKHR.createSafe(memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO)); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkExecutionGraphPipelineCreateInfoAMDX.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PSTAGES, memAddressSafe(value)); if (value != null) { nstageCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pLibraryInfo(VkPipelineLibraryCreateInfoKHR) pLibraryInfo}. */
    public static void npLibraryInfo(long struct, @Nullable VkPipelineLibraryCreateInfoKHR value) { memPutAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO, memAddressSafe(value)); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkExecutionGraphPipelineCreateInfoAMDX.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkExecutionGraphPipelineCreateInfoAMDX.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pLibraryInfo = memGetAddress(struct + VkExecutionGraphPipelineCreateInfoAMDX.PLIBRARYINFO);
        if (pLibraryInfo != NULL) {
            VkPipelineLibraryCreateInfoKHR.validate(pLibraryInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkExecutionGraphPipelineCreateInfoAMDX} structs. */
    public static class Buffer extends StructBuffer<VkExecutionGraphPipelineCreateInfoAMDX, Buffer> implements NativeResource {

        private static final VkExecutionGraphPipelineCreateInfoAMDX ELEMENT_FACTORY = VkExecutionGraphPipelineCreateInfoAMDX.create(-1L);

        /**
         * Creates a new {@code VkExecutionGraphPipelineCreateInfoAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExecutionGraphPipelineCreateInfoAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExecutionGraphPipelineCreateInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExecutionGraphPipelineCreateInfoAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExecutionGraphPipelineCreateInfoAMDX.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkExecutionGraphPipelineCreateInfoAMDX.nflags(address()); }
        /** @return the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.@Nullable Buffer pStages() { return VkExecutionGraphPipelineCreateInfoAMDX.npStages(address()); }
        /** @return a {@link VkPipelineLibraryCreateInfoKHR} view of the struct pointed to by the {@code pLibraryInfo} field. */
        @NativeType("VkPipelineLibraryCreateInfoKHR const *")
        public @Nullable VkPipelineLibraryCreateInfoKHR pLibraryInfo() { return VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address()); }
        /** @return the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address()); }
        /** @return the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX} value to the {@code sType} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(@NativeType("void const *") long value) { VkExecutionGraphPipelineCreateInfoAMDX.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code stageCount} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer stageCount(@NativeType("uint32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nstageCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.@Nullable Buffer value) { VkExecutionGraphPipelineCreateInfoAMDX.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineLibraryCreateInfoKHR} to the {@code pLibraryInfo} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer pLibraryInfo(@Nullable @NativeType("VkPipelineLibraryCreateInfoKHR const *") VkPipelineLibraryCreateInfoKHR value) { VkExecutionGraphPipelineCreateInfoAMDX.npLibraryInfo(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkExecutionGraphPipelineCreateInfoAMDX.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkExecutionGraphPipelineCreateInfoAMDX.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkExecutionGraphPipelineCreateInfoAMDX.nbasePipelineIndex(address(), value); return this; }

    }

}