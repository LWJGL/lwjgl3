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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying device fault information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDeviceFault#vkGetDeviceFaultInfoEXT GetDeviceFaultInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceFaultCountsEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #addressInfoCount};
 *     uint32_t {@link #vendorInfoCount};
 *     VkDeviceSize {@link #vendorBinarySize};
 * }</code></pre>
 */
public class VkDeviceFaultCountsEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESSINFOCOUNT,
        VENDORINFOCOUNT,
        VENDORBINARYSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESSINFOCOUNT = layout.offsetof(2);
        VENDORINFOCOUNT = layout.offsetof(3);
        VENDORBINARYSIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDeviceFaultCountsEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultCountsEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of {@link VkDeviceFaultAddressInfoEXT} structures describing either memory accesses which <b>may</b> have caused a page fault, or the addresses of active instructions at the time of the fault. */
    @NativeType("uint32_t")
    public int addressInfoCount() { return naddressInfoCount(address()); }
    /** the number of {@link VkDeviceFaultVendorInfoEXT} structures describing vendor-specific fault information. */
    @NativeType("uint32_t")
    public int vendorInfoCount() { return nvendorInfoCount(address()); }
    /** the size in bytes of a vendor-specific binary crash dump, which may provide additional information when imported into external tools. */
    @NativeType("VkDeviceSize")
    public long vendorBinarySize() { return nvendorBinarySize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceFaultCountsEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT} value to the {@link #sType} field. */
    public VkDeviceFaultCountsEXT sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceFaultCountsEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #addressInfoCount} field. */
    public VkDeviceFaultCountsEXT addressInfoCount(@NativeType("uint32_t") int value) { naddressInfoCount(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorInfoCount} field. */
    public VkDeviceFaultCountsEXT vendorInfoCount(@NativeType("uint32_t") int value) { nvendorInfoCount(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorBinarySize} field. */
    public VkDeviceFaultCountsEXT vendorBinarySize(@NativeType("VkDeviceSize") long value) { nvendorBinarySize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultCountsEXT set(
        int sType,
        long pNext,
        int addressInfoCount,
        int vendorInfoCount,
        long vendorBinarySize
    ) {
        sType(sType);
        pNext(pNext);
        addressInfoCount(addressInfoCount);
        vendorInfoCount(vendorInfoCount);
        vendorBinarySize(vendorBinarySize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultCountsEXT set(VkDeviceFaultCountsEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultCountsEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultCountsEXT malloc() {
        return wrap(VkDeviceFaultCountsEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceFaultCountsEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultCountsEXT calloc() {
        return wrap(VkDeviceFaultCountsEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceFaultCountsEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultCountsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceFaultCountsEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultCountsEXT} instance for the specified memory address. */
    public static VkDeviceFaultCountsEXT create(long address) {
        return wrap(VkDeviceFaultCountsEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultCountsEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceFaultCountsEXT.class, address);
    }

    /**
     * Returns a new {@link VkDeviceFaultCountsEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultCountsEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultCountsEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceFaultCountsEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultCountsEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultCountsEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultCountsEXT malloc(MemoryStack stack) {
        return wrap(VkDeviceFaultCountsEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceFaultCountsEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultCountsEXT calloc(MemoryStack stack) {
        return wrap(VkDeviceFaultCountsEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceFaultCountsEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultCountsEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultCountsEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceFaultCountsEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceFaultCountsEXT.PNEXT); }
    /** Unsafe version of {@link #addressInfoCount}. */
    public static int naddressInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceFaultCountsEXT.ADDRESSINFOCOUNT); }
    /** Unsafe version of {@link #vendorInfoCount}. */
    public static int nvendorInfoCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceFaultCountsEXT.VENDORINFOCOUNT); }
    /** Unsafe version of {@link #vendorBinarySize}. */
    public static long nvendorBinarySize(long struct) { return UNSAFE.getLong(null, struct + VkDeviceFaultCountsEXT.VENDORBINARYSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceFaultCountsEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceFaultCountsEXT.PNEXT, value); }
    /** Unsafe version of {@link #addressInfoCount(int) addressInfoCount}. */
    public static void naddressInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceFaultCountsEXT.ADDRESSINFOCOUNT, value); }
    /** Unsafe version of {@link #vendorInfoCount(int) vendorInfoCount}. */
    public static void nvendorInfoCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceFaultCountsEXT.VENDORINFOCOUNT, value); }
    /** Unsafe version of {@link #vendorBinarySize(long) vendorBinarySize}. */
    public static void nvendorBinarySize(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceFaultCountsEXT.VENDORBINARYSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultCountsEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultCountsEXT, Buffer> implements NativeResource {

        private static final VkDeviceFaultCountsEXT ELEMENT_FACTORY = VkDeviceFaultCountsEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultCountsEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultCountsEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceFaultCountsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceFaultCountsEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceFaultCountsEXT.nsType(address()); }
        /** @return the value of the {@link VkDeviceFaultCountsEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceFaultCountsEXT.npNext(address()); }
        /** @return the value of the {@link VkDeviceFaultCountsEXT#addressInfoCount} field. */
        @NativeType("uint32_t")
        public int addressInfoCount() { return VkDeviceFaultCountsEXT.naddressInfoCount(address()); }
        /** @return the value of the {@link VkDeviceFaultCountsEXT#vendorInfoCount} field. */
        @NativeType("uint32_t")
        public int vendorInfoCount() { return VkDeviceFaultCountsEXT.nvendorInfoCount(address()); }
        /** @return the value of the {@link VkDeviceFaultCountsEXT#vendorBinarySize} field. */
        @NativeType("VkDeviceSize")
        public long vendorBinarySize() { return VkDeviceFaultCountsEXT.nvendorBinarySize(address()); }

        /** Sets the specified value to the {@link VkDeviceFaultCountsEXT#sType} field. */
        public VkDeviceFaultCountsEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceFaultCountsEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT} value to the {@link VkDeviceFaultCountsEXT#sType} field. */
        public VkDeviceFaultCountsEXT.Buffer sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT); }
        /** Sets the specified value to the {@link VkDeviceFaultCountsEXT#pNext} field. */
        public VkDeviceFaultCountsEXT.Buffer pNext(@NativeType("void *") long value) { VkDeviceFaultCountsEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultCountsEXT#addressInfoCount} field. */
        public VkDeviceFaultCountsEXT.Buffer addressInfoCount(@NativeType("uint32_t") int value) { VkDeviceFaultCountsEXT.naddressInfoCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultCountsEXT#vendorInfoCount} field. */
        public VkDeviceFaultCountsEXT.Buffer vendorInfoCount(@NativeType("uint32_t") int value) { VkDeviceFaultCountsEXT.nvendorInfoCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultCountsEXT#vendorBinarySize} field. */
        public VkDeviceFaultCountsEXT.Buffer vendorBinarySize(@NativeType("VkDeviceSize") long value) { VkDeviceFaultCountsEXT.nvendorBinarySize(address(), value); return this; }

    }

}