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
 * <pre><code>
 * struct VkRayTracingPipelineCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} const * pStages;
 *     uint32_t groupCount;
 *     {@link VkRayTracingShaderGroupCreateInfoNV VkRayTracingShaderGroupCreateInfoNV} const * pGroups;
 *     uint32_t maxRecursionDepth;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkRayTracingPipelineCreateInfoNV extends Struct<VkRayTracingPipelineCreateInfoNV> implements NativeResource {

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
        GROUPCOUNT,
        PGROUPS,
        MAXRECURSIONDEPTH,
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
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        GROUPCOUNT = layout.offsetof(5);
        PGROUPS = layout.offsetof(6);
        MAXRECURSIONDEPTH = layout.offsetof(7);
        LAYOUT = layout.offsetof(8);
        BASEPIPELINEHANDLE = layout.offsetof(9);
        BASEPIPELINEINDEX = layout.offsetof(10);
    }

    protected VkRayTracingPipelineCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRayTracingPipelineCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkRayTracingPipelineCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkRayTracingPipelineCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineCreateInfoNV(ByteBuffer container) {
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
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** @return the value of the {@code groupCount} field. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** @return a {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
    @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
    public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() { return npGroups(address()); }
    /** @return the value of the {@code maxRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
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
    public VkRayTracingPipelineCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkRayTracingPipelineCreateInfoNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRayTracingPipelineCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkRayTracingPipelineCreateInfoNV pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkRayTracingPipelineCreateInfoNV flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkRayTracingPipelineCreateInfoNV pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} to the {@code pGroups} field. */
    public VkRayTracingPipelineCreateInfoNV pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) { npGroups(address(), value); return this; }
    /** Sets the specified value to the {@code maxRecursionDepth} field. */
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepth(@NativeType("uint32_t") int value) { nmaxRecursionDepth(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkRayTracingPipelineCreateInfoNV layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkRayTracingPipelineCreateInfoNV basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkRayTracingPipelineCreateInfoNV basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo.Buffer pStages,
        VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups,
        int maxRecursionDepth,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pStages(pStages);
        pGroups(pGroups);
        maxRecursionDepth(maxRecursionDepth);
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
    public VkRayTracingPipelineCreateInfoNV set(VkRayTracingPipelineCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoNV malloc() {
        return new VkRayTracingPipelineCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineCreateInfoNV calloc() {
        return new VkRayTracingPipelineCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingPipelineCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance for the specified memory address. */
    public static VkRayTracingPipelineCreateInfoNV create(long address) {
        return new VkRayTracingPipelineCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRayTracingPipelineCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkRayTracingPipelineCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRayTracingPipelineCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRayTracingPipelineCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoNV malloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineCreateInfoNV calloc(MemoryStack stack) {
        return new VkRayTracingPipelineCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.GROUPCOUNT); }
    /** Unsafe version of {@link #pGroups}. */
    public static VkRayTracingShaderGroupCreateInfoNV.Buffer npGroups(long struct) { return VkRayTracingShaderGroupCreateInfoNV.create(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS), ngroupCount(struct)); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoNV.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES, value.address()); nstageCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.GROUPCOUNT, value); }
    /** Unsafe version of {@link #pGroups(VkRayTracingShaderGroupCreateInfoNV.Buffer) pGroups}. */
    public static void npGroups(long struct, VkRayTracingShaderGroupCreateInfoNV.Buffer value) { memPutAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS, value.address()); ngroupCount(struct, value.remaining()); }
    /** Unsafe version of {@link #maxRecursionDepth(int) maxRecursionDepth}. */
    public static void nmaxRecursionDepth(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.MAXRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoNV.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkRayTracingPipelineCreateInfoNV.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PSTAGES);
        check(pStages);
        validate(pStages, stageCount, VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo::validate);
        check(memGetAddress(struct + VkRayTracingPipelineCreateInfoNV.PGROUPS));
    }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineCreateInfoNV, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineCreateInfoNV ELEMENT_FACTORY = VkRayTracingPipelineCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRayTracingPipelineCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingPipelineCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkRayTracingPipelineCreateInfoNV.nflags(address()); }
        /** @return the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkRayTracingPipelineCreateInfoNV.nstageCount(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkRayTracingPipelineCreateInfoNV.npStages(address()); }
        /** @return the value of the {@code groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return VkRayTracingPipelineCreateInfoNV.ngroupCount(address()); }
        /** @return a {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} view of the struct array pointed to by the {@code pGroups} field. */
        @NativeType("VkRayTracingShaderGroupCreateInfoNV const *")
        public VkRayTracingShaderGroupCreateInfoNV.Buffer pGroups() { return VkRayTracingPipelineCreateInfoNV.npGroups(address()); }
        /** @return the value of the {@code maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkRayTracingPipelineCreateInfoNV.nlayout(address()); }
        /** @return the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address()); }
        /** @return the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingPipelineCreateInfoNV.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkRayTracingPipelineCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkRayTracingPipelineCreateInfoNV.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link VkRayTracingShaderGroupCreateInfoNV.Buffer} to the {@code pGroups} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer pGroups(@NativeType("VkRayTracingShaderGroupCreateInfoNV const *") VkRayTracingShaderGroupCreateInfoNV.Buffer value) { VkRayTracingPipelineCreateInfoNV.npGroups(address(), value); return this; }
        /** Sets the specified value to the {@code maxRecursionDepth} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer maxRecursionDepth(@NativeType("uint32_t") int value) { VkRayTracingPipelineCreateInfoNV.nmaxRecursionDepth(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkRayTracingPipelineCreateInfoNV.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkRayTracingPipelineCreateInfoNV.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkRayTracingPipelineCreateInfoNV.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkRayTracingPipelineCreateInfoNV.nbasePipelineIndex(address(), value); return this; }

    }

}