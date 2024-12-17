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
 * struct VkDedicatedAllocationImageCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 dedicatedAllocation;
 * }}</pre>
 */
public class VkDedicatedAllocationImageCreateInfoNV extends Struct<VkDedicatedAllocationImageCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEDICATEDALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEDICATEDALLOCATION = layout.offsetof(2);
    }

    protected VkDedicatedAllocationImageCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDedicatedAllocationImageCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkDedicatedAllocationImageCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkDedicatedAllocationImageCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDedicatedAllocationImageCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code dedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean dedicatedAllocation() { return ndedicatedAllocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDedicatedAllocationImageCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkDedicatedAllocationImageCreateInfoNV sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDedicatedAllocationImageCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dedicatedAllocation} field. */
    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(@NativeType("VkBool32") boolean value) { ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDedicatedAllocationImageCreateInfoNV set(
        int sType,
        long pNext,
        boolean dedicatedAllocation
    ) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocation(dedicatedAllocation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDedicatedAllocationImageCreateInfoNV set(VkDedicatedAllocationImageCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationImageCreateInfoNV malloc() {
        return new VkDedicatedAllocationImageCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationImageCreateInfoNV calloc() {
        return new VkDedicatedAllocationImageCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkDedicatedAllocationImageCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDedicatedAllocationImageCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance for the specified memory address. */
    public static VkDedicatedAllocationImageCreateInfoNV create(long address) {
        return new VkDedicatedAllocationImageCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDedicatedAllocationImageCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkDedicatedAllocationImageCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDedicatedAllocationImageCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationImageCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationImageCreateInfoNV malloc(MemoryStack stack) {
        return new VkDedicatedAllocationImageCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDedicatedAllocationImageCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationImageCreateInfoNV calloc(MemoryStack stack) {
        return new VkDedicatedAllocationImageCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationImageCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationImageCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDedicatedAllocationImageCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #dedicatedAllocation}. */
    public static int ndedicatedAllocation(long struct) { return memGetInt(struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDedicatedAllocationImageCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationImageCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #dedicatedAllocation(boolean) dedicatedAllocation}. */
    public static void ndedicatedAllocation(long struct, int value) { memPutInt(struct + VkDedicatedAllocationImageCreateInfoNV.DEDICATEDALLOCATION, value); }

    // -----------------------------------

    /** An array of {@link VkDedicatedAllocationImageCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationImageCreateInfoNV, Buffer> implements NativeResource {

        private static final VkDedicatedAllocationImageCreateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationImageCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkDedicatedAllocationImageCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDedicatedAllocationImageCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDedicatedAllocationImageCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDedicatedAllocationImageCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDedicatedAllocationImageCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code dedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean dedicatedAllocation() { return VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDedicatedAllocationImageCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkDedicatedAllocationImageCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dedicatedAllocation} field. */
        public VkDedicatedAllocationImageCreateInfoNV.Buffer dedicatedAllocation(@NativeType("VkBool32") boolean value) { VkDedicatedAllocationImageCreateInfoNV.ndedicatedAllocation(address(), value ? 1 : 0); return this; }

    }

}