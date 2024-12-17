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
 * struct VkPipelineVertexInputDivisorStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t vertexBindingDivisorCount;
 *     {@link VkVertexInputBindingDivisorDescription VkVertexInputBindingDivisorDescription} const * pVertexBindingDivisors;
 * }}</pre>
 */
public class VkPipelineVertexInputDivisorStateCreateInfo extends Struct<VkPipelineVertexInputDivisorStateCreateInfo> implements NativeResource {

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

    protected VkPipelineVertexInputDivisorStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineVertexInputDivisorStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineVertexInputDivisorStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputDivisorStateCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code vertexBindingDivisorCount} field. */
    @NativeType("uint32_t")
    public int vertexBindingDivisorCount() { return nvertexBindingDivisorCount(address()); }
    /** @return a {@link VkVertexInputBindingDivisorDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDivisors} field. */
    @NativeType("VkVertexInputBindingDivisorDescription const *")
    public VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() { return npVertexBindingDivisors(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineVertexInputDivisorStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
    public VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { npVertexBindingDivisors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineVertexInputDivisorStateCreateInfo set(
        int sType,
        long pNext,
        VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors
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
    public VkPipelineVertexInputDivisorStateCreateInfo set(VkPipelineVertexInputDivisorStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfo malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfo calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputDivisorStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineVertexInputDivisorStateCreateInfo create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineVertexInputDivisorStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineVertexInputDivisorStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineVertexInputDivisorStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineVertexInputDivisorStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #vertexBindingDivisorCount}. */
    public static int nvertexBindingDivisorCount(long struct) { return memGetInt(struct + VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT); }
    /** Unsafe version of {@link #pVertexBindingDivisors}. */
    public static VkVertexInputBindingDivisorDescription.Buffer npVertexBindingDivisors(long struct) { return VkVertexInputBindingDivisorDescription.create(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS), nvertexBindingDivisorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineVertexInputDivisorStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code vertexBindingDivisorCount} field of the specified {@code struct}. */
    public static void nvertexBindingDivisorCount(long struct, int value) { memPutInt(struct + VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT, value); }
    /** Unsafe version of {@link #pVertexBindingDivisors(VkVertexInputBindingDivisorDescription.Buffer) pVertexBindingDivisors}. */
    public static void npVertexBindingDivisors(long struct, VkVertexInputBindingDivisorDescription.Buffer value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS, value.address()); nvertexBindingDivisorCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS));
    }

    // -----------------------------------

    /** An array of {@link VkPipelineVertexInputDivisorStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputDivisorStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineVertexInputDivisorStateCreateInfo ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputDivisorStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputDivisorStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineVertexInputDivisorStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineVertexInputDivisorStateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineVertexInputDivisorStateCreateInfo.npNext(address()); }
        /** @return the value of the {@code vertexBindingDivisorCount} field. */
        @NativeType("uint32_t")
        public int vertexBindingDivisorCount() { return VkPipelineVertexInputDivisorStateCreateInfo.nvertexBindingDivisorCount(address()); }
        /** @return a {@link VkVertexInputBindingDivisorDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDivisors} field. */
        @NativeType("VkVertexInputBindingDivisorDescription const *")
        public VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() { return VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineVertexInputDivisorStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputDivisorStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
        public VkPipelineVertexInputDivisorStateCreateInfo.Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(address(), value); return this; }

    }

}