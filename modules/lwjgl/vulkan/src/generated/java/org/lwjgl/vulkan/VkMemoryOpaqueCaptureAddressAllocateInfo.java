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
 * struct VkMemoryOpaqueCaptureAddressAllocateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t opaqueCaptureAddress;
 * }}</pre>
 */
public class VkMemoryOpaqueCaptureAddressAllocateInfo extends Struct<VkMemoryOpaqueCaptureAddressAllocateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPAQUECAPTUREADDRESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPAQUECAPTUREADDRESS = layout.offsetof(2);
    }

    protected VkMemoryOpaqueCaptureAddressAllocateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryOpaqueCaptureAddressAllocateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(address, container);
    }

    /**
     * Creates a {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryOpaqueCaptureAddressAllocateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code opaqueCaptureAddress} field. */
    @NativeType("uint64_t")
    public long opaqueCaptureAddress() { return nopaqueCaptureAddress(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO} value to the {@code sType} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
    public VkMemoryOpaqueCaptureAddressAllocateInfo opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryOpaqueCaptureAddressAllocateInfo set(
        int sType,
        long pNext,
        long opaqueCaptureAddress
    ) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryOpaqueCaptureAddressAllocateInfo set(VkMemoryOpaqueCaptureAddressAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo malloc() {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo calloc() {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance for the specified memory address. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo create(long address) {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryOpaqueCaptureAddressAllocateInfo createSafe(long address) {
        return address == NULL ? null : new VkMemoryOpaqueCaptureAddressAllocateInfo(address, null);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo malloc(MemoryStack stack) {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo calloc(MemoryStack stack) {
        return new VkMemoryOpaqueCaptureAddressAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #opaqueCaptureAddress}. */
    public static long nopaqueCaptureAddress(long struct) { return memGetLong(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.OPAQUECAPTUREADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #opaqueCaptureAddress(long) opaqueCaptureAddress}. */
    public static void nopaqueCaptureAddress(long struct, long value) { memPutLong(struct + VkMemoryOpaqueCaptureAddressAllocateInfo.OPAQUECAPTUREADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryOpaqueCaptureAddressAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryOpaqueCaptureAddressAllocateInfo, Buffer> implements NativeResource {

        private static final VkMemoryOpaqueCaptureAddressAllocateInfo ELEMENT_FACTORY = VkMemoryOpaqueCaptureAddressAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryOpaqueCaptureAddressAllocateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryOpaqueCaptureAddressAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryOpaqueCaptureAddressAllocateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryOpaqueCaptureAddressAllocateInfo.npNext(address()); }
        /** @return the value of the {@code opaqueCaptureAddress} field. */
        @NativeType("uint64_t")
        public long opaqueCaptureAddress() { return VkMemoryOpaqueCaptureAddressAllocateInfo.nopaqueCaptureAddress(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO} value to the {@code sType} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryOpaqueCaptureAddressAllocateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
        public VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfo.nopaqueCaptureAddress(address(), value); return this; }

    }

}