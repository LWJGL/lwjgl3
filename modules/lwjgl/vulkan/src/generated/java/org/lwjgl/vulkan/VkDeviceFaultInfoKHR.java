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

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre><code>
 * struct VkDeviceFaultInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceFaultFlagsKHR flags;
 *     uint64_t groupId;
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     {@link VkDeviceFaultAddressInfoKHR VkDeviceFaultAddressInfoKHR} faultAddressInfo;
 *     {@link VkDeviceFaultAddressInfoKHR VkDeviceFaultAddressInfoKHR} instructionAddressInfo;
 *     {@link VkDeviceFaultVendorInfoKHR VkDeviceFaultVendorInfoKHR} vendorInfo;
 * }</code></pre>
 */
public class VkDeviceFaultInfoKHR extends Struct<VkDeviceFaultInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        GROUPID,
        DESCRIPTION,
        FAULTADDRESSINFO,
        INSTRUCTIONADDRESSINFO,
        VENDORINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(VkDeviceFaultAddressInfoKHR.SIZEOF, VkDeviceFaultAddressInfoKHR.ALIGNOF),
            __member(VkDeviceFaultAddressInfoKHR.SIZEOF, VkDeviceFaultAddressInfoKHR.ALIGNOF),
            __member(VkDeviceFaultVendorInfoKHR.SIZEOF, VkDeviceFaultVendorInfoKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        GROUPID = layout.offsetof(3);
        DESCRIPTION = layout.offsetof(4);
        FAULTADDRESSINFO = layout.offsetof(5);
        INSTRUCTIONADDRESSINFO = layout.offsetof(6);
        VENDORINFO = layout.offsetof(7);
    }

    protected VkDeviceFaultInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceFaultFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code groupId} field. */
    @NativeType("uint64_t")
    public long groupId() { return ngroupId(address()); }
    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** @return a {@link VkDeviceFaultAddressInfoKHR} view of the {@code faultAddressInfo} field. */
    public VkDeviceFaultAddressInfoKHR faultAddressInfo() { return nfaultAddressInfo(address()); }
    /** @return a {@link VkDeviceFaultAddressInfoKHR} view of the {@code instructionAddressInfo} field. */
    public VkDeviceFaultAddressInfoKHR instructionAddressInfo() { return ninstructionAddressInfo(address()); }
    /** @return a {@link VkDeviceFaultVendorInfoKHR} view of the {@code vendorInfo} field. */
    public VkDeviceFaultVendorInfoKHR vendorInfo() { return nvendorInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceFaultInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR} value to the {@code sType} field. */
    public VkDeviceFaultInfoKHR sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceFaultInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultInfoKHR set(
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
    public VkDeviceFaultInfoKHR set(VkDeviceFaultInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultInfoKHR malloc() {
        return new VkDeviceFaultInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultInfoKHR calloc() {
        return new VkDeviceFaultInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultInfoKHR} instance for the specified memory address. */
    public static VkDeviceFaultInfoKHR create(long address) {
        return new VkDeviceFaultInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceFaultInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceFaultInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceFaultInfoKHR.FLAGS); }
    /** Unsafe version of {@link #groupId}. */
    public static long ngroupId(long struct) { return memGetLong(struct + VkDeviceFaultInfoKHR.GROUPID); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkDeviceFaultInfoKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkDeviceFaultInfoKHR.DESCRIPTION); }
    /** Unsafe version of {@link #faultAddressInfo}. */
    public static VkDeviceFaultAddressInfoKHR nfaultAddressInfo(long struct) { return VkDeviceFaultAddressInfoKHR.create(struct + VkDeviceFaultInfoKHR.FAULTADDRESSINFO); }
    /** Unsafe version of {@link #instructionAddressInfo}. */
    public static VkDeviceFaultAddressInfoKHR ninstructionAddressInfo(long struct) { return VkDeviceFaultAddressInfoKHR.create(struct + VkDeviceFaultInfoKHR.INSTRUCTIONADDRESSINFO); }
    /** Unsafe version of {@link #vendorInfo}. */
    public static VkDeviceFaultVendorInfoKHR nvendorInfo(long struct) { return VkDeviceFaultVendorInfoKHR.create(struct + VkDeviceFaultInfoKHR.VENDORINFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceFaultInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceFaultInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultInfoKHR ELEMENT_FACTORY = VkDeviceFaultInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceFaultInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceFaultInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceFaultFlagsKHR")
        public int flags() { return VkDeviceFaultInfoKHR.nflags(address()); }
        /** @return the value of the {@code groupId} field. */
        @NativeType("uint64_t")
        public long groupId() { return VkDeviceFaultInfoKHR.ngroupId(address()); }
        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkDeviceFaultInfoKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkDeviceFaultInfoKHR.ndescriptionString(address()); }
        /** @return a {@link VkDeviceFaultAddressInfoKHR} view of the {@code faultAddressInfo} field. */
        public VkDeviceFaultAddressInfoKHR faultAddressInfo() { return VkDeviceFaultInfoKHR.nfaultAddressInfo(address()); }
        /** @return a {@link VkDeviceFaultAddressInfoKHR} view of the {@code instructionAddressInfo} field. */
        public VkDeviceFaultAddressInfoKHR instructionAddressInfo() { return VkDeviceFaultInfoKHR.ninstructionAddressInfo(address()); }
        /** @return a {@link VkDeviceFaultVendorInfoKHR} view of the {@code vendorInfo} field. */
        public VkDeviceFaultVendorInfoKHR vendorInfo() { return VkDeviceFaultInfoKHR.nvendorInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceFaultInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceFaultInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR} value to the {@code sType} field. */
        public VkDeviceFaultInfoKHR.Buffer sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceFaultInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkDeviceFaultInfoKHR.npNext(address(), value); return this; }

    }

}