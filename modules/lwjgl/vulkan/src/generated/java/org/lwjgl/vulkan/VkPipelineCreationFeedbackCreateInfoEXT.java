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
 * See {@link VkPipelineCreationFeedbackCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCreationFeedbackCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkPipelineCreationFeedback VkPipelineCreationFeedback} * pPipelineCreationFeedback;
 *     uint32_t pipelineStageCreationFeedbackCount;
 *     {@link VkPipelineCreationFeedback VkPipelineCreationFeedback} * pPipelineStageCreationFeedbacks;
 * }</code></pre>
 */
public class VkPipelineCreationFeedbackCreateInfoEXT extends VkPipelineCreationFeedbackCreateInfo {

    protected VkPipelineCreationFeedbackCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCreationFeedbackCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineCreationFeedbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCreationFeedbackCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedback} to the {@code pPipelineCreationFeedback} field. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) { npPipelineCreationFeedback(address(), value); return this; }
    /** Sets the address of the specified {@link VkPipelineCreationFeedback.Buffer} to the {@code pPipelineStageCreationFeedbacks} field. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT pPipelineStageCreationFeedbacks(@Nullable @NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) { npPipelineStageCreationFeedbacks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineCreationFeedbackCreateInfoEXT set(
        int sType,
        long pNext,
        VkPipelineCreationFeedback pPipelineCreationFeedback,
        @Nullable VkPipelineCreationFeedback.Buffer pPipelineStageCreationFeedbacks
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
        return new VkPipelineCreationFeedbackCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCreationFeedbackCreateInfoEXT calloc() {
        return new VkPipelineCreationFeedbackCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCreationFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCreationFeedbackCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineCreationFeedbackCreateInfoEXT create(long address) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineCreationFeedbackCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineCreationFeedbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCreationFeedbackCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCreationFeedbackCreateInfoEXT} structs. */
    public static class Buffer extends VkPipelineCreationFeedbackCreateInfo.Buffer {

        private static final VkPipelineCreationFeedbackCreateInfoEXT ELEMENT_FACTORY = VkPipelineCreationFeedbackCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineCreationFeedbackCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCreationFeedbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCreationFeedbackCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCreationFeedbackCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedback} to the {@code pPipelineCreationFeedback} field. */
        @Override
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pPipelineCreationFeedback(@NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback value) { VkPipelineCreationFeedbackCreateInfoEXT.npPipelineCreationFeedback(address(), value); return this; }
        /** Sets the address of the specified {@link VkPipelineCreationFeedback.Buffer} to the {@code pPipelineStageCreationFeedbacks} field. */
        @Override
        public VkPipelineCreationFeedbackCreateInfoEXT.Buffer pPipelineStageCreationFeedbacks(@Nullable @NativeType("VkPipelineCreationFeedback *") VkPipelineCreationFeedback.Buffer value) { VkPipelineCreationFeedbackCreateInfoEXT.npPipelineStageCreationFeedbacks(address(), value); return this; }

    }

}