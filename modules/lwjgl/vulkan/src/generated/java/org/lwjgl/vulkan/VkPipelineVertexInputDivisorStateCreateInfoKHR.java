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
 * Structure specifying vertex attributes assignment during instanced rendering.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR}</li>
 * <li>{@code pVertexBindingDivisors} <b>must</b> be a valid pointer to an array of {@code vertexBindingDivisorCount} {@link VkVertexInputBindingDivisorDescriptionKHR} structures</li>
 * <li>{@code vertexBindingDivisorCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVertexInputBindingDivisorDescriptionKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineVertexInputDivisorStateCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #vertexBindingDivisorCount};
 *     {@link VkVertexInputBindingDivisorDescriptionKHR VkVertexInputBindingDivisorDescriptionKHR} const * {@link #pVertexBindingDivisors};
 * }</code></pre>
 */
public class VkPipelineVertexInputDivisorStateCreateInfoKHR extends Struct<VkPipelineVertexInputDivisorStateCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXBINDINGDIVISORCOUNT,
        PVERTEXBINDINGDIVISORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXBINDINGDIVISORCOUNT = layout.offsetof(2);
        PVERTEXBINDINGDIVISORS = layout.offsetof(3);
    }

    protected VkPipelineVertexInputDivisorStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineVertexInputDivisorStateCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR(ByteBuffer container) {
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
    /** the number of elements in the {@code pVertexBindingDivisors} array. */
    @NativeType("uint32_t")
    public int vertexBindingDivisorCount() { return nvertexBindingDivisorCount(address()); }
    /** a pointer to an array of {@link VkVertexInputBindingDivisorDescriptionKHR} structures specifying the divisor value for each binding. */
    @NativeType("VkVertexInputBindingDivisorDescriptionKHR const *")
    public VkVertexInputBindingDivisorDescriptionKHR.Buffer pVertexBindingDivisors() { return npVertexBindingDivisors(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR sType$Default() { return sType(KHRVertexAttributeDivisor.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} to the {@link #pVertexBindingDivisors} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescriptionKHR const *") VkVertexInputBindingDivisorDescriptionKHR.Buffer value) { npVertexBindingDivisors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR set(
        int sType,
        long pNext,
        VkVertexInputBindingDivisorDescriptionKHR.Buffer pVertexBindingDivisors
    ) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineVertexInputDivisorStateCreateInfoKHR set(VkPipelineVertexInputDivisorStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineVertexInputDivisorStateCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #vertexBindingDivisorCount}. */
    public static int nvertexBindingDivisorCount(long struct) { return memGetInt(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.VERTEXBINDINGDIVISORCOUNT); }
    /** Unsafe version of {@link #pVertexBindingDivisors}. */
    public static VkVertexInputBindingDivisorDescriptionKHR.Buffer npVertexBindingDivisors(long struct) { return VkVertexInputBindingDivisorDescriptionKHR.create(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.PVERTEXBINDINGDIVISORS), nvertexBindingDivisorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code vertexBindingDivisorCount} field of the specified {@code struct}. */
    public static void nvertexBindingDivisorCount(long struct, int value) { memPutInt(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.VERTEXBINDINGDIVISORCOUNT, value); }
    /** Unsafe version of {@link #pVertexBindingDivisors(VkVertexInputBindingDivisorDescriptionKHR.Buffer) pVertexBindingDivisors}. */
    public static void npVertexBindingDivisors(long struct, VkVertexInputBindingDivisorDescriptionKHR.Buffer value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.PVERTEXBINDINGDIVISORS, value.address()); nvertexBindingDivisorCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoKHR.PVERTEXBINDINGDIVISORS));
    }

    // -----------------------------------

    /** An array of {@link VkPipelineVertexInputDivisorStateCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputDivisorStateCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineVertexInputDivisorStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineVertexInputDivisorStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineVertexInputDivisorStateCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineVertexInputDivisorStateCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#vertexBindingDivisorCount} field. */
        @NativeType("uint32_t")
        public int vertexBindingDivisorCount() { return VkPipelineVertexInputDivisorStateCreateInfoKHR.nvertexBindingDivisorCount(address()); }
        /** @return a {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} view of the struct array pointed to by the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#pVertexBindingDivisors} field. */
        @NativeType("VkVertexInputBindingDivisorDescriptionKHR const *")
        public VkVertexInputBindingDivisorDescriptionKHR.Buffer pVertexBindingDivisors() { return VkPipelineVertexInputDivisorStateCreateInfoKHR.npVertexBindingDivisors(address()); }

        /** Sets the specified value to the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR} value to the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer sType$Default() { return sType(KHRVertexAttributeDivisor.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#pNext} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescriptionKHR.Buffer} to the {@link VkPipelineVertexInputDivisorStateCreateInfoKHR#pVertexBindingDivisors} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoKHR.Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescriptionKHR const *") VkVertexInputBindingDivisorDescriptionKHR.Buffer value) { VkPipelineVertexInputDivisorStateCreateInfoKHR.npVertexBindingDivisors(address(), value); return this; }

    }

}