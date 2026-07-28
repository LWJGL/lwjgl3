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
 * struct VkPhysicalDevicePushConstantBankPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxGraphicsPushConstantBanks;
 *     uint32_t maxComputePushConstantBanks;
 *     uint32_t maxGraphicsPushDataBanks;
 *     uint32_t maxComputePushDataBanks;
 * }}</pre>
 */
public class VkPhysicalDevicePushConstantBankPropertiesNV extends Struct<VkPhysicalDevicePushConstantBankPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXGRAPHICSPUSHCONSTANTBANKS,
        MAXCOMPUTEPUSHCONSTANTBANKS,
        MAXGRAPHICSPUSHDATABANKS,
        MAXCOMPUTEPUSHDATABANKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXGRAPHICSPUSHCONSTANTBANKS = layout.offsetof(2);
        MAXCOMPUTEPUSHCONSTANTBANKS = layout.offsetof(3);
        MAXGRAPHICSPUSHDATABANKS = layout.offsetof(4);
        MAXCOMPUTEPUSHDATABANKS = layout.offsetof(5);
    }

    protected VkPhysicalDevicePushConstantBankPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePushConstantBankPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePushConstantBankPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxGraphicsPushConstantBanks} field. */
    @NativeType("uint32_t")
    public int maxGraphicsPushConstantBanks() { return nmaxGraphicsPushConstantBanks(address()); }
    /** @return the value of the {@code maxComputePushConstantBanks} field. */
    @NativeType("uint32_t")
    public int maxComputePushConstantBanks() { return nmaxComputePushConstantBanks(address()); }
    /** @return the value of the {@code maxGraphicsPushDataBanks} field. */
    @NativeType("uint32_t")
    public int maxGraphicsPushDataBanks() { return nmaxGraphicsPushDataBanks(address()); }
    /** @return the value of the {@code maxComputePushDataBanks} field. */
    @NativeType("uint32_t")
    public int maxComputePushDataBanks() { return nmaxComputePushDataBanks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePushConstantBankPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePushConstantBankPropertiesNV sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePushConstantBankPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePushConstantBankPropertiesNV set(
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
    public VkPhysicalDevicePushConstantBankPropertiesNV set(VkPhysicalDevicePushConstantBankPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushConstantBankPropertiesNV malloc() {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushConstantBankPropertiesNV calloc() {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePushConstantBankPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushConstantBankPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePushConstantBankPropertiesNV create(long address) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePushConstantBankPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePushConstantBankPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePushConstantBankPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushConstantBankPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePushConstantBankPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxGraphicsPushConstantBanks}. */
    public static int nmaxGraphicsPushConstantBanks(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.MAXGRAPHICSPUSHCONSTANTBANKS); }
    /** Unsafe version of {@link #maxComputePushConstantBanks}. */
    public static int nmaxComputePushConstantBanks(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.MAXCOMPUTEPUSHCONSTANTBANKS); }
    /** Unsafe version of {@link #maxGraphicsPushDataBanks}. */
    public static int nmaxGraphicsPushDataBanks(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.MAXGRAPHICSPUSHDATABANKS); }
    /** Unsafe version of {@link #maxComputePushDataBanks}. */
    public static int nmaxComputePushDataBanks(long struct) { return memGetInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.MAXCOMPUTEPUSHDATABANKS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePushConstantBankPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePushConstantBankPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePushConstantBankPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushConstantBankPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePushConstantBankPropertiesNV ELEMENT_FACTORY = VkPhysicalDevicePushConstantBankPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePushConstantBankPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePushConstantBankPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePushConstantBankPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePushConstantBankPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePushConstantBankPropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxGraphicsPushConstantBanks} field. */
        @NativeType("uint32_t")
        public int maxGraphicsPushConstantBanks() { return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxGraphicsPushConstantBanks(address()); }
        /** @return the value of the {@code maxComputePushConstantBanks} field. */
        @NativeType("uint32_t")
        public int maxComputePushConstantBanks() { return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxComputePushConstantBanks(address()); }
        /** @return the value of the {@code maxGraphicsPushDataBanks} field. */
        @NativeType("uint32_t")
        public int maxGraphicsPushDataBanks() { return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxGraphicsPushDataBanks(address()); }
        /** @return the value of the {@code maxComputePushDataBanks} field. */
        @NativeType("uint32_t")
        public int maxComputePushDataBanks() { return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxComputePushDataBanks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePushConstantBankPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePushConstantBankPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPushConstantBank#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePushConstantBankPropertiesNV.Buffer sType$Default() { return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePushConstantBankPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePushConstantBankPropertiesNV.npNext(address(), value); return this; }

    }

}