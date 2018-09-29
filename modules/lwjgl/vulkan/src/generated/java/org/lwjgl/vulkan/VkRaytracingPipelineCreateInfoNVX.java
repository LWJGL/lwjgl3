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
 * Structure specifying parameters of a newly created raytracing pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX STRUCTURE_TYPE_RAYTRACING_PIPELINE_CREATE_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code pStages} <b>must</b> be a valid pointer to an array of {@code stageCount} valid {@link VkPipelineShaderStageCreateInfo} structures</li>
 * <li>{@code pGroupNumbers} <b>must</b> be a valid pointer to an array of {@code stageCount} {@code uint32_t} values</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code stageCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineShaderStageCreateInfo}, {@link NVXRaytracing#vkCreateRaytracingPipelinesNVX CreateRaytracingPipelinesNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.</li>
 * <li>{@code stageCount} &ndash; the number of entries in the {@code pStages} and {@code pGroupNumbers} arrays.</li>
 * <li>{@code pStages} &ndash; an array of size {@code stageCount} structures of type {@link VkPipelineShaderStageCreateInfo} describing the set of the shader stages to be included in the raytracing pipeline.</li>
 * <li>{@code pGroupNumbers} &ndash; an array of size {@code stageCount} integers, where each integer indicates the hit group that the corresponding shader belongs to.</li>
 * <li>{@code maxRecursionDepth} &ndash; the maximum recursion that will be called from this pipeline.</li>
 * <li>{@code layout} &ndash; the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.</li>
 * <li>{@code basePipelineHandle} &ndash; a pipeline to derive from.</li>
 * <li>{@code basePipelineIndex} &ndash; an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRaytracingPipelineCreateInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     uint32_t stageCount;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo const} * pStages;
 *     uint32_t const * pGroupNumbers;
 *     uint32_t maxRecursionDepth;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkRaytracingPipelineCreateInfoNVX extends Struct implements NativeResource {

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
        PGROUPNUMBERS,
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
        PGROUPNUMBERS = layout.offsetof(5);
        MAXRECURSIONDEPTH = layout.offsetof(6);
        LAYOUT = layout.offsetof(7);
        BASEPIPELINEHANDLE = layout.offsetof(8);
        BASEPIPELINEINDEX = layout.offsetof(9);
    }

    VkRaytracingPipelineCreateInfoNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRaytracingPipelineCreateInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRaytracingPipelineCreateInfoNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code stageCount} field. */
    @NativeType("uint32_t")
    public int stageCount() { return nstageCount(address()); }
    /** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
    @NativeType("VkPipelineShaderStageCreateInfo const *")
    public VkPipelineShaderStageCreateInfo.Buffer pStages() { return npStages(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pGroupNumbers} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pGroupNumbers() { return npGroupNumbers(address()); }
    /** Returns the value of the {@code maxRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
    /** Returns the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** Returns the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** Returns the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRaytracingPipelineCreateInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRaytracingPipelineCreateInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRaytracingPipelineCreateInfoNVX flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code stageCount} field. */
    public VkRaytracingPipelineCreateInfoNVX stageCount(@NativeType("uint32_t") int value) { nstageCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
    public VkRaytracingPipelineCreateInfoNVX pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { npStages(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pGroupNumbers} field. */
    public VkRaytracingPipelineCreateInfoNVX pGroupNumbers(@NativeType("uint32_t const *") IntBuffer value) { npGroupNumbers(address(), value); return this; }
    /** Sets the specified value to the {@code maxRecursionDepth} field. */
    public VkRaytracingPipelineCreateInfoNVX maxRecursionDepth(@NativeType("uint32_t") int value) { nmaxRecursionDepth(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkRaytracingPipelineCreateInfoNVX layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkRaytracingPipelineCreateInfoNVX basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkRaytracingPipelineCreateInfoNVX basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRaytracingPipelineCreateInfoNVX set(
        int sType,
        long pNext,
        int flags,
        int stageCount,
        VkPipelineShaderStageCreateInfo.Buffer pStages,
        IntBuffer pGroupNumbers,
        int maxRecursionDepth,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stageCount(stageCount);
        pStages(pStages);
        pGroupNumbers(pGroupNumbers);
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
    public VkRaytracingPipelineCreateInfoNVX set(VkRaytracingPipelineCreateInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRaytracingPipelineCreateInfoNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRaytracingPipelineCreateInfoNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkRaytracingPipelineCreateInfoNVX create() {
        return new VkRaytracingPipelineCreateInfoNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance for the specified memory address. */
    public static VkRaytracingPipelineCreateInfoNVX create(long address) {
        return new VkRaytracingPipelineCreateInfoNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRaytracingPipelineCreateInfoNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRaytracingPipelineCreateInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRaytracingPipelineCreateInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRaytracingPipelineCreateInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRaytracingPipelineCreateInfoNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRaytracingPipelineCreateInfoNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRaytracingPipelineCreateInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRaytracingPipelineCreateInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRaytracingPipelineCreateInfoNVX.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRaytracingPipelineCreateInfoNVX.FLAGS); }
    /** Unsafe version of {@link #stageCount}. */
    public static int nstageCount(long struct) { return memGetInt(struct + VkRaytracingPipelineCreateInfoNVX.STAGECOUNT); }
    /** Unsafe version of {@link #pStages}. */
    public static VkPipelineShaderStageCreateInfo.Buffer npStages(long struct) { return VkPipelineShaderStageCreateInfo.create(memGetAddress(struct + VkRaytracingPipelineCreateInfoNVX.PSTAGES), nstageCount(struct)); }
    /** Unsafe version of {@link #pGroupNumbers() pGroupNumbers}. */
    public static IntBuffer npGroupNumbers(long struct) { return memIntBuffer(memGetAddress(struct + VkRaytracingPipelineCreateInfoNVX.PGROUPNUMBERS), nstageCount(struct)); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return memGetInt(struct + VkRaytracingPipelineCreateInfoNVX.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkRaytracingPipelineCreateInfoNVX.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkRaytracingPipelineCreateInfoNVX.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkRaytracingPipelineCreateInfoNVX.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRaytracingPipelineCreateInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRaytracingPipelineCreateInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRaytracingPipelineCreateInfoNVX.FLAGS, value); }
    /** Sets the specified value to the {@code stageCount} field of the specified {@code struct}. */
    public static void nstageCount(long struct, int value) { memPutInt(struct + VkRaytracingPipelineCreateInfoNVX.STAGECOUNT, value); }
    /** Unsafe version of {@link #pStages(VkPipelineShaderStageCreateInfo.Buffer) pStages}. */
    public static void npStages(long struct, VkPipelineShaderStageCreateInfo.Buffer value) { memPutAddress(struct + VkRaytracingPipelineCreateInfoNVX.PSTAGES, value.address()); }
    /** Unsafe version of {@link #pGroupNumbers(IntBuffer) pGroupNumbers}. */
    public static void npGroupNumbers(long struct, IntBuffer value) { memPutAddress(struct + VkRaytracingPipelineCreateInfoNVX.PGROUPNUMBERS, memAddress(value)); }
    /** Unsafe version of {@link #maxRecursionDepth(int) maxRecursionDepth}. */
    public static void nmaxRecursionDepth(long struct, int value) { memPutInt(struct + VkRaytracingPipelineCreateInfoNVX.MAXRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkRaytracingPipelineCreateInfoNVX.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkRaytracingPipelineCreateInfoNVX.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkRaytracingPipelineCreateInfoNVX.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int stageCount = nstageCount(struct);
        long pStages = memGetAddress(struct + VkRaytracingPipelineCreateInfoNVX.PSTAGES);
        check(pStages);
        VkPipelineShaderStageCreateInfo.validate(pStages, stageCount);
        check(memGetAddress(struct + VkRaytracingPipelineCreateInfoNVX.PGROUPNUMBERS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRaytracingPipelineCreateInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkRaytracingPipelineCreateInfoNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRaytracingPipelineCreateInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRaytracingPipelineCreateInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkRaytracingPipelineCreateInfoNVX newInstance(long address) {
            return new VkRaytracingPipelineCreateInfoNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRaytracingPipelineCreateInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRaytracingPipelineCreateInfoNVX.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkRaytracingPipelineCreateInfoNVX.nflags(address()); }
        /** Returns the value of the {@code stageCount} field. */
        @NativeType("uint32_t")
        public int stageCount() { return VkRaytracingPipelineCreateInfoNVX.nstageCount(address()); }
        /** Returns a {@link VkPipelineShaderStageCreateInfo.Buffer} view of the struct array pointed to by the {@code pStages} field. */
        @NativeType("VkPipelineShaderStageCreateInfo const *")
        public VkPipelineShaderStageCreateInfo.Buffer pStages() { return VkRaytracingPipelineCreateInfoNVX.npStages(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pGroupNumbers} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pGroupNumbers() { return VkRaytracingPipelineCreateInfoNVX.npGroupNumbers(address()); }
        /** Returns the value of the {@code maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkRaytracingPipelineCreateInfoNVX.nmaxRecursionDepth(address()); }
        /** Returns the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkRaytracingPipelineCreateInfoNVX.nlayout(address()); }
        /** Returns the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkRaytracingPipelineCreateInfoNVX.nbasePipelineHandle(address()); }
        /** Returns the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkRaytracingPipelineCreateInfoNVX.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkRaytracingPipelineCreateInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkRaytracingPipelineCreateInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkRaytracingPipelineCreateInfoNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code stageCount} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer stageCount(@NativeType("uint32_t") int value) { VkRaytracingPipelineCreateInfoNVX.nstageCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineShaderStageCreateInfo.Buffer} to the {@code pStages} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer pStages(@NativeType("VkPipelineShaderStageCreateInfo const *") VkPipelineShaderStageCreateInfo.Buffer value) { VkRaytracingPipelineCreateInfoNVX.npStages(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pGroupNumbers} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer pGroupNumbers(@NativeType("uint32_t const *") IntBuffer value) { VkRaytracingPipelineCreateInfoNVX.npGroupNumbers(address(), value); return this; }
        /** Sets the specified value to the {@code maxRecursionDepth} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer maxRecursionDepth(@NativeType("uint32_t") int value) { VkRaytracingPipelineCreateInfoNVX.nmaxRecursionDepth(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkRaytracingPipelineCreateInfoNVX.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkRaytracingPipelineCreateInfoNVX.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkRaytracingPipelineCreateInfoNVX.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkRaytracingPipelineCreateInfoNVX.nbasePipelineIndex(address(), value); return this; }

    }

}