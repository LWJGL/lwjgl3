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
 * <p>An implementation <b>should</b> write pipeline creation feedback to {@code pPipelineCreationFeedback} and <b>may</b> write pipeline stage creation feedback to {@code pPipelineStageCreationFeedbacks}. An implementation <b>must</b> set or clear the {@link EXTPipelineCreationFeedback#VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT} in {@link VkPipelineCreationFeedbackEXT}{@code ::flags} for {@code pPipelineCreationFeedback} and every element of {@code pPipelineStageCreationFeedbacks}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>One common scenario for an implementation to skip per-stage feedback is when {@link EXTPipelineCreationFeedback#VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT} is set in {@code pPipelineCreationFeedback}.</p>
 * </div>
 * 
 * <p>When chained to {@link VkRayTracingPipelineCreateInfoNV} or {@link VkGraphicsPipelineCreateInfo}, the {@code i} element of {@code pPipelineStageCreationFeedbacks} corresponds to the {@code i} element of {@link VkRayTracingPipelineCreateInfoNV}{@code ::pStages} or {@link VkGraphicsPipelineCreateInfo}{@code ::pStages}. When chained to {@link VkComputePipelineCreateInfo}, the first element of {@code pPipelineStageCreationFeedbacks} corresponds to {@link VkComputePipelineCreateInfo}{@code ::stage}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>When chained to {@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineCreationFeedbackEXT}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal {@link VkGraphicsPipelineCreateInfo}{@code ::stageCount}</li>
 * <li>When chained to {@link VkComputePipelineCreateInfo}, {@link VkPipelineCreationFeedbackEXT}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal 1</li>
 * <li>When chained to {@link VkRayTracingPipelineCreateInfoNV}, {@link VkPipelineCreationFeedbackEXT}{@code ::pipelineStageCreationFeedbackCount} <b>must</b> equal {@link VkRayTracingPipelineCreateInfoNV}{@code ::stageCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineCreationFeedback#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO_EXT}</li>
 * <li>{@code pPipelineCreationFeedback} <b>must</b> be a valid pointer to a {@link VkPipelineCreationFeedbackEXT} structure</li>
 * <li>{@code pPipelineStageCreationFeedbacks} <b>must</b> be a valid pointer to an array of {@code pipelineStageCreationFeedbackCount} {@link VkPipelineCreationFeedbackEXT} structures</li>
 * <li>{@code pipelineStageCreationFeedbackCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComputePipelineCreateInfo}, {@link VkGraphicsPipelineCreateInfo}, {@link VkPipelineCreationFeedbackEXT}, {@link VkRayTracingPipelineCreateInfoNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pPipelineCreationFeedback} &ndash; a pointer to a {@link VkPipelineCreationFeedbackEXT} structure.</li>
 * <li>{@code pipelineStageCreationFeedbackCount} &ndash; the number of elements in {@code pPipelineStageCreationFeedbacks}.</li>
 * <li>{@code pPipelineStageCreationFeedbacks} &ndash; a pointer to an array of {@code pipelineStageCreationFeedbackCount} {@link VkPipelineCreationFeedbackEXT} structures.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCreationFeedbackCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkPipelineCreationFeedbackEXT VkPipelineCreationFeedbackEXT} * pPipelineCreationFeedback;
 *     uint32_t pipelineStageCreationFeedbackCount;
 *     {@link VkPipelineCreationFeedbackEXT VkPipelineCreationFeedbackEXT} * pPipelineStageCreationFeedbacks;
 * }</code></pre>
 */
public class VkPipelineCreationFeedbackCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPipelineCreationFeedbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreationFeedbackCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkPipelineCreationFeedbackEXT} view of the struct pointed to by the {@code pPipelineCreationFeedback} field. */
    @NativeType("VkPipelineCreationFeedbackEXT *")
    public VkPipelineCreationFeedbackEXT pPipelineCreationFeedback() { return npPipelineCreationFeedback(address()); }
    /** Returns the value of the {@code pipelineStageCreationFeedbackCount} field. */
    @NativeType("uint32_t")
    public int pipelineStageCreationFeedbackCount() { return npipelineStageCreationFeedbackCount(address()); }
    /** Returns a {@link VkPipelineCreationFeedbackEXT.Buffer} view of the struct array pointed to by the {@code pPipelineStageCreationFeedbacks} field. */
    @NativeType("VkPipelineCreationFeedbackEXT *")
    public VkPipelineCreationFeedbackEXT.Buffer pPipelineStageCreationFeedbacks() { return npPipelineStageCreationFeedbacks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineCreationFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineCreationFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedbackEXT} to the {@code pPipelineCreationFeedback} field. */
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedbackEXT *") VkPipelineCreationFeedbackEXT value) { npPipelineCreationFeedback(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedbackEXT.Buffer} to the {@code pPipelineStageCreationFeedbacks} field. */
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedbackEXT *") VkPipelineCreationFeedbackEXT.Buffer value) { npPipelineStageCreationFeedbacks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCreationFeedbackCreateInfoEXT set(
        int sType,
        long pNext,
        VkPipelineCreationFeedbackEXT pPipelineCreationFeedback,
        VkPipelineCreationFeedbackEXT.Buffer pPipelineStageCreationFeedbacks
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
    public VkPipelineCreationFeedbackCreateInfoEXT set(VkPipelineCreationFeedbackCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCreationFeedbackCreateInfoEXT malloc() {
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCreationFeedbackCreateInfoEXT calloc() {
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCreationFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineCreationFeedbackCreateInfoEXT create(long address) {
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineCreationFeedbackCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineCreationFeedbackCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkPipelineCreationFeedbackCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCreationFeedbackCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pPipelineCreationFeedback}. */
    public static VkPipelineCreationFeedbackEXT npPipelineCreationFeedback(long struct) { return VkPipelineCreationFeedbackEXT.create(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINECREATIONFEEDBACK)); }
    /** Unsafe version of {@link #pipelineStageCreationFeedbackCount}. */
    public static int npipelineStageCreationFeedbackCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCreationFeedbackCreateInfoEXT.PIPELINESTAGECREATIONFEEDBACKCOUNT); }
    /** Unsafe version of {@link #pPipelineStageCreationFeedbacks}. */
    public static VkPipelineCreationFeedbackEXT.Buffer npPipelineStageCreationFeedbacks(long struct) { return VkPipelineCreationFeedbackEXT.create(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINESTAGECREATIONFEEDBACKS), npipelineStageCreationFeedbackCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCreationFeedbackCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pPipelineCreationFeedback(VkPipelineCreationFeedbackEXT) pPipelineCreationFeedback}. */
    public static void npPipelineCreationFeedback(long struct, VkPipelineCreationFeedbackEXT value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINECREATIONFEEDBACK, value.address()); }
    /** Sets the specified value to the {@code pipelineStageCreationFeedbackCount} field of the specified {@code struct}. */
    public static void npipelineStageCreationFeedbackCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCreationFeedbackCreateInfoEXT.PIPELINESTAGECREATIONFEEDBACKCOUNT, value); }
    /** Unsafe version of {@link #pPipelineStageCreationFeedbacks(VkPipelineCreationFeedbackEXT.Buffer) pPipelineStageCreationFeedbacks}. */
    public static void npPipelineStageCreationFeedbacks(long struct, VkPipelineCreationFeedbackEXT.Buffer value) { memPutAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINESTAGECREATIONFEEDBACKS, value.address()); npipelineStageCreationFeedbackCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINECREATIONFEEDBACK));
        check(memGetAddress(struct + VkPipelineCreationFeedbackCreateInfoEXT.PPIPELINESTAGECREATIONFEEDBACKS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCreationFeedbackCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCreationFeedbackCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineCreationFeedbackCreateInfoEXT ELEMENT_FACTORY = VkPipelineCreationFeedbackCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreationFeedbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCreationFeedbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCreationFeedbackCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCreationFeedbackCreateInfoEXT.npNext(address()); }
        /** Returns a {@link VkPipelineCreationFeedbackEXT} view of the struct pointed to by the {@code pPipelineCreationFeedback} field. */
        @NativeType("VkPipelineCreationFeedbackEXT *")
        public VkPipelineCreationFeedbackEXT pPipelineCreationFeedback() { return VkPipelineCreationFeedbackCreateInfoEXT.npPipelineCreationFeedback(address()); }
        /** Returns the value of the {@code pipelineStageCreationFeedbackCount} field. */
        @NativeType("uint32_t")
        public int pipelineStageCreationFeedbackCount() { return VkPipelineCreationFeedbackCreateInfoEXT.npipelineStageCreationFeedbackCount(address()); }
        /** Returns a {@link VkPipelineCreationFeedbackEXT.Buffer} view of the struct array pointed to by the {@code pPipelineStageCreationFeedbacks} field. */
        @NativeType("VkPipelineCreationFeedbackEXT *")
        public VkPipelineCreationFeedbackEXT.Buffer pPipelineStageCreationFeedbacks() { return VkPipelineCreationFeedbackCreateInfoEXT.npPipelineStageCreationFeedbacks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCreationFeedbackCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedbackEXT} to the {@code pPipelineCreationFeedback} field. */
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedbackEXT *") VkPipelineCreationFeedbackEXT value) { VkPipelineCreationFeedbackCreateInfoEXT.npPipelineCreationFeedback(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedbackEXT.Buffer} to the {@code pPipelineStageCreationFeedbacks} field. */
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pPipelineStageCreationFeedbacks(@NativeType("VkPipelineCreationFeedbackEXT *") VkPipelineCreationFeedbackEXT.Buffer value) { VkPipelineCreationFeedbackCreateInfoEXT.npPipelineStageCreationFeedbacks(address(), value); return this; }

    }

}