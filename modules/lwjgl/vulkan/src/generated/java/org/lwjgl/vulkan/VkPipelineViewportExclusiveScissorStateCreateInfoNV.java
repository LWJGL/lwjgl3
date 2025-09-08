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
 * <pre><code>
 * struct VkPipelineViewportExclusiveScissorStateCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t exclusiveScissorCount;
 *     {@link VkRect2D VkRect2D} const * pExclusiveScissors;
 * }</code></pre>
 */
public class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends Struct<VkPipelineViewportExclusiveScissorStateCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXCLUSIVESCISSORCOUNT,
        PEXCLUSIVESCISSORS;

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
        EXCLUSIVESCISSORCOUNT = layout.offsetof(2);
        PEXCLUSIVESCISSORS = layout.offsetof(3);
    }

    protected VkPipelineViewportExclusiveScissorStateCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportExclusiveScissorStateCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code exclusiveScissorCount} field. */
    @NativeType("uint32_t")
    public int exclusiveScissorCount() { return nexclusiveScissorCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pExclusiveScissors} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pExclusiveScissors() { return npExclusiveScissors(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVScissorExclusive#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType$Default() { return sType(NVScissorExclusive.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code exclusiveScissorCount} field. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCount(@NativeType("uint32_t") int value) { nexclusiveScissorCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pExclusiveScissors} field. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissors(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npExclusiveScissors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(
        int sType,
        long pNext,
        int exclusiveScissorCount,
        VkRect2D.@Nullable Buffer pExclusiveScissors
    ) {
        sType(sType);
        pNext(pNext);
        exclusiveScissorCount(exclusiveScissorCount);
        pExclusiveScissors(pExclusiveScissors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(VkPipelineViewportExclusiveScissorStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV malloc() {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV calloc() {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV create(long address) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportExclusiveScissorStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportExclusiveScissorStateCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #exclusiveScissorCount}. */
    public static int nexclusiveScissorCount(long struct) { return memGetInt(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.EXCLUSIVESCISSORCOUNT); }
    /** Unsafe version of {@link #pExclusiveScissors}. */
    public static VkRect2D.@Nullable Buffer npExclusiveScissors(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.PEXCLUSIVESCISSORS), nexclusiveScissorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code exclusiveScissorCount} field of the specified {@code struct}. */
    public static void nexclusiveScissorCount(long struct, int value) { memPutInt(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.EXCLUSIVESCISSORCOUNT, value); }
    /** Unsafe version of {@link #pExclusiveScissors(VkRect2D.Buffer) pExclusiveScissors}. */
    public static void npExclusiveScissors(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkPipelineViewportExclusiveScissorStateCreateInfoNV.PEXCLUSIVESCISSORS, memAddressSafe(value)); if (value != null) { nexclusiveScissorCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportExclusiveScissorStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineViewportExclusiveScissorStateCreateInfoNV ELEMENT_FACTORY = VkPipelineViewportExclusiveScissorStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportExclusiveScissorStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code exclusiveScissorCount} field. */
        @NativeType("uint32_t")
        public int exclusiveScissorCount() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.nexclusiveScissorCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pExclusiveScissors} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pExclusiveScissors() { return VkPipelineViewportExclusiveScissorStateCreateInfoNV.npExclusiveScissors(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVScissorExclusive#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer sType$Default() { return sType(NVScissorExclusive.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code exclusiveScissorCount} field. */
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer exclusiveScissorCount(@NativeType("uint32_t") int value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.nexclusiveScissorCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pExclusiveScissors} field. */
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV.Buffer pExclusiveScissors(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkPipelineViewportExclusiveScissorStateCreateInfoNV.npExclusiveScissors(address(), value); return this; }

    }

}