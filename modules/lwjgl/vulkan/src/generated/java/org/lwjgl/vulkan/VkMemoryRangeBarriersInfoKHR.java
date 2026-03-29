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
 * struct VkMemoryRangeBarriersInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t memoryRangeBarrierCount;
 *     {@link VkMemoryRangeBarrierKHR VkMemoryRangeBarrierKHR} const * pMemoryRangeBarriers;
 * }</code></pre>
 */
public class VkMemoryRangeBarriersInfoKHR extends Struct<VkMemoryRangeBarriersInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYRANGEBARRIERCOUNT,
        PMEMORYRANGEBARRIERS;

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
        MEMORYRANGEBARRIERCOUNT = layout.offsetof(2);
        PMEMORYRANGEBARRIERS = layout.offsetof(3);
    }

    protected VkMemoryRangeBarriersInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryRangeBarriersInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryRangeBarriersInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryRangeBarriersInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryRangeBarriersInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code memoryRangeBarrierCount} field. */
    @NativeType("uint32_t")
    public int memoryRangeBarrierCount() { return nmemoryRangeBarrierCount(address()); }
    /** @return a {@link VkMemoryRangeBarrierKHR.Buffer} view of the struct array pointed to by the {@code pMemoryRangeBarriers} field. */
    @NativeType("VkMemoryRangeBarrierKHR const *")
    public VkMemoryRangeBarrierKHR.@Nullable Buffer pMemoryRangeBarriers() { return npMemoryRangeBarriers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryRangeBarriersInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR} value to the {@code sType} field. */
    public VkMemoryRangeBarriersInfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryRangeBarriersInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryRangeBarrierKHR.Buffer} to the {@code pMemoryRangeBarriers} field. */
    public VkMemoryRangeBarriersInfoKHR pMemoryRangeBarriers(@NativeType("VkMemoryRangeBarrierKHR const *") VkMemoryRangeBarrierKHR.@Nullable Buffer value) { npMemoryRangeBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryRangeBarriersInfoKHR set(
        int sType,
        long pNext,
        VkMemoryRangeBarrierKHR.@Nullable Buffer pMemoryRangeBarriers
    ) {
        sType(sType);
        pNext(pNext);
        pMemoryRangeBarriers(pMemoryRangeBarriers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryRangeBarriersInfoKHR set(VkMemoryRangeBarriersInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryRangeBarriersInfoKHR malloc() {
        return new VkMemoryRangeBarriersInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryRangeBarriersInfoKHR calloc() {
        return new VkMemoryRangeBarriersInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryRangeBarriersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryRangeBarriersInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance for the specified memory address. */
    public static VkMemoryRangeBarriersInfoKHR create(long address) {
        return new VkMemoryRangeBarriersInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryRangeBarriersInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryRangeBarriersInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryRangeBarriersInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRangeBarriersInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryRangeBarriersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryRangeBarriersInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRangeBarriersInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryRangeBarriersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarriersInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarriersInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryRangeBarriersInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryRangeBarriersInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memoryRangeBarrierCount}. */
    public static int nmemoryRangeBarrierCount(long struct) { return memGetInt(struct + VkMemoryRangeBarriersInfoKHR.MEMORYRANGEBARRIERCOUNT); }
    /** Unsafe version of {@link #pMemoryRangeBarriers}. */
    public static VkMemoryRangeBarrierKHR.@Nullable Buffer npMemoryRangeBarriers(long struct) { return VkMemoryRangeBarrierKHR.createSafe(memGetAddress(struct + VkMemoryRangeBarriersInfoKHR.PMEMORYRANGEBARRIERS), nmemoryRangeBarrierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryRangeBarriersInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryRangeBarriersInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code memoryRangeBarrierCount} field of the specified {@code struct}. */
    public static void nmemoryRangeBarrierCount(long struct, int value) { memPutInt(struct + VkMemoryRangeBarriersInfoKHR.MEMORYRANGEBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pMemoryRangeBarriers(VkMemoryRangeBarrierKHR.Buffer) pMemoryRangeBarriers}. */
    public static void npMemoryRangeBarriers(long struct, VkMemoryRangeBarrierKHR.@Nullable Buffer value) { memPutAddress(struct + VkMemoryRangeBarriersInfoKHR.PMEMORYRANGEBARRIERS, memAddressSafe(value)); nmemoryRangeBarrierCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmemoryRangeBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkMemoryRangeBarriersInfoKHR.PMEMORYRANGEBARRIERS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkMemoryRangeBarriersInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryRangeBarriersInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryRangeBarriersInfoKHR ELEMENT_FACTORY = VkMemoryRangeBarriersInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryRangeBarriersInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryRangeBarriersInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryRangeBarriersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryRangeBarriersInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryRangeBarriersInfoKHR.npNext(address()); }
        /** @return the value of the {@code memoryRangeBarrierCount} field. */
        @NativeType("uint32_t")
        public int memoryRangeBarrierCount() { return VkMemoryRangeBarriersInfoKHR.nmemoryRangeBarrierCount(address()); }
        /** @return a {@link VkMemoryRangeBarrierKHR.Buffer} view of the struct array pointed to by the {@code pMemoryRangeBarriers} field. */
        @NativeType("VkMemoryRangeBarrierKHR const *")
        public VkMemoryRangeBarrierKHR.@Nullable Buffer pMemoryRangeBarriers() { return VkMemoryRangeBarriersInfoKHR.npMemoryRangeBarriers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryRangeBarriersInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryRangeBarriersInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR} value to the {@code sType} field. */
        public VkMemoryRangeBarriersInfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIERS_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryRangeBarriersInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryRangeBarriersInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryRangeBarrierKHR.Buffer} to the {@code pMemoryRangeBarriers} field. */
        public VkMemoryRangeBarriersInfoKHR.Buffer pMemoryRangeBarriers(@NativeType("VkMemoryRangeBarrierKHR const *") VkMemoryRangeBarrierKHR.@Nullable Buffer value) { VkMemoryRangeBarriersInfoKHR.npMemoryRangeBarriers(address(), value); return this; }

    }

}