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
 * Request for feedback about the creation of a pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>An implementation <b>should</b> write pipeline creation feedback to {@code pPipelineCreationFeedback} and <b>may</b> write pipeline stage creation feedback to {@code pPipelineStageCreationFeedbacks}. An implementation <b>must</b> set or clear the {@link VK13#VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT PIPELINE_CREATION_FEEDBACK_VALID_BIT} in {@link VkPipelineCreationFeedback}{@code ::flags} for {@code pPipelineCreationFeedback} and every element of {@code pPipelineStageCreationFeedbacks}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>One common scenario for an implementation to skip per-stage feedback is when {@link VK13#VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT} is set in {@code pPipelineCreationFeedback}.</p>
 * </div>
 * 
 * <p>When chained to {@link VkRayTracingPipelineCreateInfoKHR}, {@link VkRayTracingPipelineCreateInfoNV}, or {@link VkGraphicsPipelineCreateInfo}, the {@code i} element of {@code pPipelineStageCreationFeedbacks} corresponds to the {@code i} element of {@link VkRayTracingPipelineCreateInfoKHR}{@code ::pStages}, {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages}, or {@link VkGraphicsPipelineCreateInfo}{@code ::pStages}. When chained to {@link VkComputePipelineCreateInfo}, the first element of {@code pPipelineStageCreationFeedbacks} corresponds to {@link VkComputePipelineCreateInfo}{@code ::stage}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>When chained to {@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineCreationFeedback}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal {@link VkGraphicsPipelineCreateInfo}{@code ::stageCount}</li>
 * <li>When chained to {@link VkComputePipelineCreateInfo}, {@link VkPipelineCreationFeedback}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal 1</li>
 * <li>When chained to {@link VkRayTracingPipelineCreateInfoKHR}, {@link VkPipelineCreationFeedback}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal {@link VkRayTracingPipelineCreateInfoKHR}{@code ::stageCount}</li>
 * <li>When chained to {@link VkRayTracingPipelineCreateInfoNV}, {@link VkPipelineCreationFeedback}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal {@link VkRayTracingPipelineCreateInfoNV}{@code ::stageCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO}</li>
 * <li>{@code pPipelineCreationFeedback} <b>must</b> be a valid pointer to a {@link VkPipelineCreationFeedback} structure</li>
 * <li>{@code pPipelineStageCreationFeedbacks} <b>must</b> be a valid pointer to an array of {@code pipelineStageCreationFeedbackCount} {@link VkPipelineCreationFeedback} structures</li>
 * <li>{@code pipelineStageCreationFeedbackCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComputePipelineCreateInfo}, {@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineCreationFeedback}, {@link VkRayTracingPipelineCreateInfoKHR}, {@link VkRayTracingPipelineCreateInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCreationFeedbackCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkPipelineCreationFeedback VkPipelineCreationFeedback} * {@link #pPipelineCreationFeedback};
 *     uint32_t {@link #pipelineStageCreationFeedbackCount};
 *     {@link VkPipelineCreationFeedback VkPipelineCreationFeedback} * {@link #pPipelineStageCreationFeedbacks};
 * }</code></pre>
 */
public class VkPipelineCreationFeedbackCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PPIPELINECREATIONFEEDBACK,
        PIPELINESTAGECREATIONFEEDBACKCOUNT,
        PPIPELINESTAGECREATIONFEEDBACKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PPIPELINECREATIONFEEDBACK = layout.offsetof(2);
        PIPELINESTAGECREATIONFEEDBACKCOUNT = layout.offsetof(3);
        PPIPELINESTAGECREATIONFEEDBACKS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineCreationFeedbackCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreationFeedbackCreateInfo(ByteBuffer container) {
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
    /** a pointer to a {@link VkPipelineCreationFeedback} structure. */
    @NativeType("VkPipelineCreationFeedback *")
    public VkPipelineCreationFeedback pPipelineCreationFeedback() { return npPipelineCreationFeedback(address()); }
    /** the number of elements in {@code pPipelineStageCreationFeedbacks}. */
    @NativeType("uint32_t")
    public int pipelineStageCreationFeedbackCount() { return npipelineStageCreationFeedbackCount(address()); }
    /** a pointer to an array of {@code pipelineStageCreationFeedbackCount} {@link VkPipelineCreationFeedback} structures. */
    @NativeType("VkPipelineCreationFeedback *")
    public VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks() { return npPipelineStageCreationFeedbacks(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineCreationFeedbackCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO} value to the {@link #sType} field. */
    public VkPipelineCreationFeedbackCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineCreationFeedbackCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedback} to the {@link #pPipelineCreationFeedback} field. */
    public VkPipelineCreationFeedbackCreateInfo pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) { npPipelineCreationFeedback(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedback.Buffer} to the {@link #pPipelineStageCreationFeedbacks} field. */
    public VkPipelineCreationFeedbackCreateInfo pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) { npPipelineStageCreationFeedbacks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCreationFeedbackCreateInfo set(
        int sType,
        long pNext,
        VkPipelineCreationFeedback pPipelineCreationFeedback,
        VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks
    ) {
        sType(sType);
        pNext(pNext);
        pPipelineCreationFeedback(pPipelineCreationFeedback);
        pPipelineStageCreationFeedbacks(pPipelineStageCreationFeedbacks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCreationFeedbackCreateInfo set(VkPipelineCreationFeedbackCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCreationFeedbackCreateInfo malloc() {
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCreationFeedbackCreateInfo calloc() {
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCreationFeedbackCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance for the specified memory address. */
    public static VkPipelineCreationFeedbackCreateInfo create(long address) {
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCreationFeedbackCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfo malloc(MemoryStack stack) {
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfo calloc(MemoryStack stack) {
        return wrap(VkPipelineCreationFeedbackCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCreationFeedbackCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCreationFeedbackCreateInfo.PNEXT); }
    /** Unsafe version of {@link #pPipelineCreationFeedback}. */
    public static VkPipelineCreationFeedback npPipelineCreationFeedback(long struct) { return VkPipelineCreationFeedback.create(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINECREATIONFEEDBACK)); }
    /** Unsafe version of {@link #pipelineStageCreationFeedbackCount}. */
    public static int npipelineStageCreationFeedbackCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCreationFeedbackCreateInfo.PIPELINESTAGECREATIONFEEDBACKCOUNT); }
    /** Unsafe version of {@link #pPipelineStageCreationFeedbacks}. */
    public static VkPipelineCreationFeedback.Buffer npPipelineStageCreationFeedbacks(long struct) { return VkPipelineCreationFeedback.create(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINESTAGECREATIONFEEDBACKS), npipelineStageCreationFeedbackCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCreationFeedbackCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #pPipelineCreationFeedback(VkPipelineCreationFeedback) pPipelineCreationFeedback}. */
    public static void npPipelineCreationFeedback(long struct, VkPipelineCreationFeedback value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINECREATIONFEEDBACK, value.address()); }
    /** Sets the specified value to the {@code pipelineStageCreationFeedbackCount} field of the specified {@code struct}. */
    public static void npipelineStageCreationFeedbackCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCreationFeedbackCreateInfo.PIPELINESTAGECREATIONFEEDBACKCOUNT, value); }
    /** Unsafe version of {@link #pPipelineStageCreationFeedbacks(VkPipelineCreationFeedback.Buffer) pPipelineStageCreationFeedbacks}. */
    public static void npPipelineStageCreationFeedbacks(long struct, VkPipelineCreationFeedback.Buffer value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINESTAGECREATIONFEEDBACKS, value.address()); npipelineStageCreationFeedbackCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINECREATIONFEEDBACK));
        check(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfo.PPIPELINESTAGECREATIONFEEDBACKS));
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCreationFeedbackCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedbackCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineCreationFeedbackCreateInfo ELEMENT_FACTORY = VkPipelineCreationFeedbackCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreationFeedbackCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreationFeedbackCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCreationFeedbackCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCreationFeedbackCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCreationFeedbackCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkPipelineCreationFeedbackCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCreationFeedbackCreateInfo.npNext(address()); }
        /** @return a {@link VkPipelineCreationFeedback} view of the struct pointed to by the {@link VkPipelineCreationFeedbackCreateInfo#pPipelineCreationFeedback} field. */
        @NativeType("VkPipelineCreationFeedback *")
        public VkPipelineCreationFeedback pPipelineCreationFeedback() { return VkPipelineCreationFeedbackCreateInfo.npPipelineCreationFeedback(address()); }
        /** @return the value of the {@link VkPipelineCreationFeedbackCreateInfo#pipelineStageCreationFeedbackCount} field. */
        @NativeType("uint32_t")
        public int pipelineStageCreationFeedbackCount() { return VkPipelineCreationFeedbackCreateInfo.npipelineStageCreationFeedbackCount(address()); }
        /** @return a {@link VkPipelineCreationFeedback.Buffer} view of the struct array pointed to by the {@link VkPipelineCreationFeedbackCreateInfo#pPipelineStageCreationFeedbacks} field. */
        @NativeType("VkPipelineCreationFeedback *")
        public VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks() { return VkPipelineCreationFeedbackCreateInfo.npPipelineStageCreationFeedbacks(address()); }

        /** Sets the specified value to the {@link VkPipelineCreationFeedbackCreateInfo#sType} field. */
        public VkPipelineCreationFeedbackCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO} value to the {@link VkPipelineCreationFeedbackCreateInfo#sType} field. */
        public VkPipelineCreationFeedbackCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO); }
        /** Sets the specified value to the {@link VkPipelineCreationFeedbackCreateInfo#pNext} field. */
        public VkPipelineCreationFeedbackCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCreationFeedbackCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedback} to the {@link VkPipelineCreationFeedbackCreateInfo#pPipelineCreationFeedback} field. */
        public VkPipelineCreationFeedbackCreateInfo.Buffer pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) { VkPipelineCreationFeedbackCreateInfo.npPipelineCreationFeedback(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedback.Buffer} to the {@link VkPipelineCreationFeedbackCreateInfo#pPipelineStageCreationFeedbacks} field. */
        public VkPipelineCreationFeedbackCreateInfo.Buffer pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) { VkPipelineCreationFeedbackCreateInfo.npPipelineStageCreationFeedbacks(address(), value); return this; }

    }

}