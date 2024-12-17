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
 * struct VkMemoryDedicatedRequirements {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 prefersDedicatedAllocation;
 *     VkBool32 requiresDedicatedAllocation;
 * }}</pre>
 */
public class VkMemoryDedicatedRequirements extends Struct<VkMemoryDedicatedRequirements> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERSDEDICATEDALLOCATION,
        REQUIRESDEDICATEDALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERSDEDICATEDALLOCATION = layout.offsetof(2);
        REQUIRESDEDICATEDALLOCATION = layout.offsetof(3);
    }

    protected VkMemoryDedicatedRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryDedicatedRequirements create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryDedicatedRequirements(address, container);
    }

    /**
     * Creates a {@code VkMemoryDedicatedRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedRequirements(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code prefersDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean prefersDedicatedAllocation() { return nprefersDedicatedAllocation(address()) != 0; }
    /** @return the value of the {@code requiresDedicatedAllocation} field. */
    @NativeType("VkBool32")
    public boolean requiresDedicatedAllocation() { return nrequiresDedicatedAllocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryDedicatedRequirements sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS} value to the {@code sType} field. */
    public VkMemoryDedicatedRequirements sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryDedicatedRequirements pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryDedicatedRequirements set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryDedicatedRequirements set(VkMemoryDedicatedRequirements src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirements malloc() {
        return new VkMemoryDedicatedRequirements(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedRequirements calloc() {
        return new VkMemoryDedicatedRequirements(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryDedicatedRequirements(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedRequirements} instance for the specified memory address. */
    public static VkMemoryDedicatedRequirements create(long address) {
        return new VkMemoryDedicatedRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryDedicatedRequirements createSafe(long address) {
        return address == NULL ? null : new VkMemoryDedicatedRequirements(address, null);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryDedicatedRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryDedicatedRequirements.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedRequirements.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirements malloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryDedicatedRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedRequirements calloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedRequirements.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirements.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryDedicatedRequirements.PNEXT); }
    /** Unsafe version of {@link #prefersDedicatedAllocation}. */
    public static int nprefersDedicatedAllocation(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirements.PREFERSDEDICATEDALLOCATION); }
    /** Unsafe version of {@link #requiresDedicatedAllocation}. */
    public static int nrequiresDedicatedAllocation(long struct) { return memGetInt(struct + VkMemoryDedicatedRequirements.REQUIRESDEDICATEDALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryDedicatedRequirements.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryDedicatedRequirements.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedRequirements} structs. */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedRequirements, Buffer> implements NativeResource {

        private static final VkMemoryDedicatedRequirements ELEMENT_FACTORY = VkMemoryDedicatedRequirements.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedRequirements.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedRequirements#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryDedicatedRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryDedicatedRequirements.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMemoryDedicatedRequirements.npNext(address()); }
        /** @return the value of the {@code prefersDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean prefersDedicatedAllocation() { return VkMemoryDedicatedRequirements.nprefersDedicatedAllocation(address()) != 0; }
        /** @return the value of the {@code requiresDedicatedAllocation} field. */
        @NativeType("VkBool32")
        public boolean requiresDedicatedAllocation() { return VkMemoryDedicatedRequirements.nrequiresDedicatedAllocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryDedicatedRequirements.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedRequirements.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS} value to the {@code sType} field. */
        public VkMemoryDedicatedRequirements.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryDedicatedRequirements.Buffer pNext(@NativeType("void *") long value) { VkMemoryDedicatedRequirements.npNext(address(), value); return this; }

    }

}