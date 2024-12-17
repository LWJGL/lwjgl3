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
 * struct VkDependencyInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDependencyFlags dependencyFlags;
 *     uint32_t memoryBarrierCount;
 *     {@link VkMemoryBarrier2 VkMemoryBarrier2} const * pMemoryBarriers;
 *     uint32_t bufferMemoryBarrierCount;
 *     {@link VkBufferMemoryBarrier2 VkBufferMemoryBarrier2} const * pBufferMemoryBarriers;
 *     uint32_t imageMemoryBarrierCount;
 *     {@link VkImageMemoryBarrier2 VkImageMemoryBarrier2} const * pImageMemoryBarriers;
 * }}</pre>
 */
public class VkDependencyInfo extends Struct<VkDependencyInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPENDENCYFLAGS,
        MEMORYBARRIERCOUNT,
        PMEMORYBARRIERS,
        BUFFERMEMORYBARRIERCOUNT,
        PBUFFERMEMORYBARRIERS,
        IMAGEMEMORYBARRIERCOUNT,
        PIMAGEMEMORYBARRIERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPENDENCYFLAGS = layout.offsetof(2);
        MEMORYBARRIERCOUNT = layout.offsetof(3);
        PMEMORYBARRIERS = layout.offsetof(4);
        BUFFERMEMORYBARRIERCOUNT = layout.offsetof(5);
        PBUFFERMEMORYBARRIERS = layout.offsetof(6);
        IMAGEMEMORYBARRIERCOUNT = layout.offsetof(7);
        PIMAGEMEMORYBARRIERS = layout.offsetof(8);
    }

    protected VkDependencyInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDependencyInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDependencyInfo(address, container);
    }

    /**
     * Creates a {@code VkDependencyInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDependencyInfo(ByteBuffer container) {
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
    /** @return the value of the {@code dependencyFlags} field. */
    @NativeType("VkDependencyFlags")
    public int dependencyFlags() { return ndependencyFlags(address()); }
    /** @return the value of the {@code memoryBarrierCount} field. */
    @NativeType("uint32_t")
    public int memoryBarrierCount() { return nmemoryBarrierCount(address()); }
    /** @return a {@link VkMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pMemoryBarriers} field. */
    @NativeType("VkMemoryBarrier2 const *")
    public VkMemoryBarrier2.@Nullable Buffer pMemoryBarriers() { return npMemoryBarriers(address()); }
    /** @return the value of the {@code bufferMemoryBarrierCount} field. */
    @NativeType("uint32_t")
    public int bufferMemoryBarrierCount() { return nbufferMemoryBarrierCount(address()); }
    /** @return a {@link VkBufferMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pBufferMemoryBarriers} field. */
    @NativeType("VkBufferMemoryBarrier2 const *")
    public VkBufferMemoryBarrier2.@Nullable Buffer pBufferMemoryBarriers() { return npBufferMemoryBarriers(address()); }
    /** @return the value of the {@code imageMemoryBarrierCount} field. */
    @NativeType("uint32_t")
    public int imageMemoryBarrierCount() { return nimageMemoryBarrierCount(address()); }
    /** @return a {@link VkImageMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pImageMemoryBarriers} field. */
    @NativeType("VkImageMemoryBarrier2 const *")
    public VkImageMemoryBarrier2.@Nullable Buffer pImageMemoryBarriers() { return npImageMemoryBarriers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDependencyInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@code sType} field. */
    public VkDependencyInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDependencyInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    public VkDependencyInfo dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@code pMemoryBarriers} field. */
    public VkDependencyInfo pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.@Nullable Buffer value) { npMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@code pBufferMemoryBarriers} field. */
    public VkDependencyInfo pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.@Nullable Buffer value) { npBufferMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@code pImageMemoryBarriers} field. */
    public VkDependencyInfo pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.@Nullable Buffer value) { npImageMemoryBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDependencyInfo set(
        int sType,
        long pNext,
        int dependencyFlags,
        VkMemoryBarrier2.@Nullable Buffer pMemoryBarriers,
        VkBufferMemoryBarrier2.@Nullable Buffer pBufferMemoryBarriers,
        VkImageMemoryBarrier2.@Nullable Buffer pImageMemoryBarriers
    ) {
        sType(sType);
        pNext(pNext);
        dependencyFlags(dependencyFlags);
        pMemoryBarriers(pMemoryBarriers);
        pBufferMemoryBarriers(pBufferMemoryBarriers);
        pImageMemoryBarriers(pImageMemoryBarriers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDependencyInfo set(VkDependencyInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDependencyInfo malloc() {
        return new VkDependencyInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDependencyInfo calloc() {
        return new VkDependencyInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDependencyInfo} instance allocated with {@link BufferUtils}. */
    public static VkDependencyInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDependencyInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDependencyInfo} instance for the specified memory address. */
    public static VkDependencyInfo create(long address) {
        return new VkDependencyInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDependencyInfo createSafe(long address) {
        return address == NULL ? null : new VkDependencyInfo(address, null);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDependencyInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDependencyInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDependencyInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfo malloc(MemoryStack stack) {
        return new VkDependencyInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDependencyInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfo calloc(MemoryStack stack) {
        return new VkDependencyInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDependencyInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDependencyInfo.PNEXT); }
    /** Unsafe version of {@link #dependencyFlags}. */
    public static int ndependencyFlags(long struct) { return memGetInt(struct + VkDependencyInfo.DEPENDENCYFLAGS); }
    /** Unsafe version of {@link #memoryBarrierCount}. */
    public static int nmemoryBarrierCount(long struct) { return memGetInt(struct + VkDependencyInfo.MEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pMemoryBarriers}. */
    public static VkMemoryBarrier2.@Nullable Buffer npMemoryBarriers(long struct) { return VkMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PMEMORYBARRIERS), nmemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #bufferMemoryBarrierCount}. */
    public static int nbufferMemoryBarrierCount(long struct) { return memGetInt(struct + VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pBufferMemoryBarriers}. */
    public static VkBufferMemoryBarrier2.@Nullable Buffer npBufferMemoryBarriers(long struct) { return VkBufferMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS), nbufferMemoryBarrierCount(struct)); }
    /** Unsafe version of {@link #imageMemoryBarrierCount}. */
    public static int nimageMemoryBarrierCount(long struct) { return memGetInt(struct + VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pImageMemoryBarriers}. */
    public static VkImageMemoryBarrier2.@Nullable Buffer npImageMemoryBarriers(long struct) { return VkImageMemoryBarrier2.createSafe(memGetAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS), nimageMemoryBarrierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDependencyInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDependencyInfo.PNEXT, value); }
    /** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
    public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkDependencyInfo.DEPENDENCYFLAGS, value); }
    /** Sets the specified value to the {@code memoryBarrierCount} field of the specified {@code struct}. */
    public static void nmemoryBarrierCount(long struct, int value) { memPutInt(struct + VkDependencyInfo.MEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pMemoryBarriers(VkMemoryBarrier2.Buffer) pMemoryBarriers}. */
    public static void npMemoryBarriers(long struct, VkMemoryBarrier2.@Nullable Buffer value) { memPutAddress(struct + VkDependencyInfo.PMEMORYBARRIERS, memAddressSafe(value)); nmemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nbufferMemoryBarrierCount(long struct, int value) { memPutInt(struct + VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pBufferMemoryBarriers(VkBufferMemoryBarrier2.Buffer) pBufferMemoryBarriers}. */
    public static void npBufferMemoryBarriers(long struct, VkBufferMemoryBarrier2.@Nullable Buffer value) { memPutAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS, memAddressSafe(value)); nbufferMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageMemoryBarrierCount} field of the specified {@code struct}. */
    public static void nimageMemoryBarrierCount(long struct, int value) { memPutInt(struct + VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pImageMemoryBarriers(VkImageMemoryBarrier2.Buffer) pImageMemoryBarriers}. */
    public static void npImageMemoryBarriers(long struct, VkImageMemoryBarrier2.@Nullable Buffer value) { memPutAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS, memAddressSafe(value)); nimageMemoryBarrierCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nmemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PMEMORYBARRIERS));
        }
        if (nbufferMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PBUFFERMEMORYBARRIERS));
        }
        if (nimageMemoryBarrierCount(struct) != 0) {
            check(memGetAddress(struct + VkDependencyInfo.PIMAGEMEMORYBARRIERS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDependencyInfo} structs. */
    public static class Buffer extends StructBuffer<VkDependencyInfo, Buffer> implements NativeResource {

        private static final VkDependencyInfo ELEMENT_FACTORY = VkDependencyInfo.create(-1L);

        /**
         * Creates a new {@code VkDependencyInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDependencyInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDependencyInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDependencyInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDependencyInfo.npNext(address()); }
        /** @return the value of the {@code dependencyFlags} field. */
        @NativeType("VkDependencyFlags")
        public int dependencyFlags() { return VkDependencyInfo.ndependencyFlags(address()); }
        /** @return the value of the {@code memoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int memoryBarrierCount() { return VkDependencyInfo.nmemoryBarrierCount(address()); }
        /** @return a {@link VkMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pMemoryBarriers} field. */
        @NativeType("VkMemoryBarrier2 const *")
        public VkMemoryBarrier2.@Nullable Buffer pMemoryBarriers() { return VkDependencyInfo.npMemoryBarriers(address()); }
        /** @return the value of the {@code bufferMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int bufferMemoryBarrierCount() { return VkDependencyInfo.nbufferMemoryBarrierCount(address()); }
        /** @return a {@link VkBufferMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pBufferMemoryBarriers} field. */
        @NativeType("VkBufferMemoryBarrier2 const *")
        public VkBufferMemoryBarrier2.@Nullable Buffer pBufferMemoryBarriers() { return VkDependencyInfo.npBufferMemoryBarriers(address()); }
        /** @return the value of the {@code imageMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int imageMemoryBarrierCount() { return VkDependencyInfo.nimageMemoryBarrierCount(address()); }
        /** @return a {@link VkImageMemoryBarrier2.Buffer} view of the struct array pointed to by the {@code pImageMemoryBarriers} field. */
        @NativeType("VkImageMemoryBarrier2 const *")
        public VkImageMemoryBarrier2.@Nullable Buffer pImageMemoryBarriers() { return VkDependencyInfo.npImageMemoryBarriers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDependencyInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDependencyInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@code sType} field. */
        public VkDependencyInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDependencyInfo.Buffer pNext(@NativeType("void const *") long value) { VkDependencyInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        public VkDependencyInfo.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkDependencyInfo.ndependencyFlags(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@code pMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfo.npMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@code pBufferMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfo.npBufferMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@code pImageMemoryBarriers} field. */
        public VkDependencyInfo.Buffer pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfo.npImageMemoryBarriers(address(), value); return this; }

    }

}