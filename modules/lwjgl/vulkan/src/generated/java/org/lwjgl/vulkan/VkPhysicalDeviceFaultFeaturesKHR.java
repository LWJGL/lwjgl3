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
 * struct VkPhysicalDeviceFaultFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 deviceFault;
 *     VkBool32 deviceFaultVendorBinary;
 *     VkBool32 deviceFaultReportMasked;
 *     VkBool32 deviceFaultDeviceLostOnMasked;
 * }}</pre>
 */
public class VkPhysicalDeviceFaultFeaturesKHR extends Struct<VkPhysicalDeviceFaultFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEFAULT,
        DEVICEFAULTVENDORBINARY,
        DEVICEFAULTREPORTMASKED,
        DEVICEFAULTDEVICELOSTONMASKED;

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
        DEVICEFAULT = layout.offsetof(2);
        DEVICEFAULTVENDORBINARY = layout.offsetof(3);
        DEVICEFAULTREPORTMASKED = layout.offsetof(4);
        DEVICEFAULTDEVICELOSTONMASKED = layout.offsetof(5);
    }

    protected VkPhysicalDeviceFaultFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFaultFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFaultFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFaultFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFaultFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code deviceFault} field. */
    @NativeType("VkBool32")
    public boolean deviceFault() { return ndeviceFault(address()) != 0; }
    /** @return the value of the {@code deviceFaultVendorBinary} field. */
    @NativeType("VkBool32")
    public boolean deviceFaultVendorBinary() { return ndeviceFaultVendorBinary(address()) != 0; }
    /** @return the value of the {@code deviceFaultReportMasked} field. */
    @NativeType("VkBool32")
    public boolean deviceFaultReportMasked() { return ndeviceFaultReportMasked(address()) != 0; }
    /** @return the value of the {@code deviceFaultDeviceLostOnMasked} field. */
    @NativeType("VkBool32")
    public boolean deviceFaultDeviceLostOnMasked() { return ndeviceFaultDeviceLostOnMasked(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFaultFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceFaultFeaturesKHR sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFaultFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceFault} field. */
    public VkPhysicalDeviceFaultFeaturesKHR deviceFault(@NativeType("VkBool32") boolean value) { ndeviceFault(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deviceFaultVendorBinary} field. */
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) { ndeviceFaultVendorBinary(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deviceFaultReportMasked} field. */
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultReportMasked(@NativeType("VkBool32") boolean value) { ndeviceFaultReportMasked(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deviceFaultDeviceLostOnMasked} field. */
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultDeviceLostOnMasked(@NativeType("VkBool32") boolean value) { ndeviceFaultDeviceLostOnMasked(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFaultFeaturesKHR set(
        int sType,
        long pNext,
        boolean deviceFault,
        boolean deviceFaultVendorBinary,
        boolean deviceFaultReportMasked,
        boolean deviceFaultDeviceLostOnMasked
    ) {
        sType(sType);
        pNext(pNext);
        deviceFault(deviceFault);
        deviceFaultVendorBinary(deviceFaultVendorBinary);
        deviceFaultReportMasked(deviceFaultReportMasked);
        deviceFaultDeviceLostOnMasked(deviceFaultDeviceLostOnMasked);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFaultFeaturesKHR set(VkPhysicalDeviceFaultFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFaultFeaturesKHR malloc() {
        return new VkPhysicalDeviceFaultFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFaultFeaturesKHR calloc() {
        return new VkPhysicalDeviceFaultFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFaultFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFaultFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFaultFeaturesKHR create(long address) {
        return new VkPhysicalDeviceFaultFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFaultFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFaultFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFaultFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFaultFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFaultFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFaultFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFaultFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFaultFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #deviceFault}. */
    public static int ndeviceFault(long struct) { return memGetInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULT); }
    /** Unsafe version of {@link #deviceFaultVendorBinary}. */
    public static int ndeviceFaultVendorBinary(long struct) { return memGetInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTVENDORBINARY); }
    /** Unsafe version of {@link #deviceFaultReportMasked}. */
    public static int ndeviceFaultReportMasked(long struct) { return memGetInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTREPORTMASKED); }
    /** Unsafe version of {@link #deviceFaultDeviceLostOnMasked}. */
    public static int ndeviceFaultDeviceLostOnMasked(long struct) { return memGetInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTDEVICELOSTONMASKED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFaultFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFaultFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #deviceFault(boolean) deviceFault}. */
    public static void ndeviceFault(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULT, value); }
    /** Unsafe version of {@link #deviceFaultVendorBinary(boolean) deviceFaultVendorBinary}. */
    public static void ndeviceFaultVendorBinary(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTVENDORBINARY, value); }
    /** Unsafe version of {@link #deviceFaultReportMasked(boolean) deviceFaultReportMasked}. */
    public static void ndeviceFaultReportMasked(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTREPORTMASKED, value); }
    /** Unsafe version of {@link #deviceFaultDeviceLostOnMasked(boolean) deviceFaultDeviceLostOnMasked}. */
    public static void ndeviceFaultDeviceLostOnMasked(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFaultFeaturesKHR.DEVICEFAULTDEVICELOSTONMASKED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFaultFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFaultFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFaultFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFaultFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFaultFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFaultFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFaultFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFaultFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFaultFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code deviceFault} field. */
        @NativeType("VkBool32")
        public boolean deviceFault() { return VkPhysicalDeviceFaultFeaturesKHR.ndeviceFault(address()) != 0; }
        /** @return the value of the {@code deviceFaultVendorBinary} field. */
        @NativeType("VkBool32")
        public boolean deviceFaultVendorBinary() { return VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultVendorBinary(address()) != 0; }
        /** @return the value of the {@code deviceFaultReportMasked} field. */
        @NativeType("VkBool32")
        public boolean deviceFaultReportMasked() { return VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultReportMasked(address()) != 0; }
        /** @return the value of the {@code deviceFaultDeviceLostOnMasked} field. */
        @NativeType("VkBool32")
        public boolean deviceFaultDeviceLostOnMasked() { return VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultDeviceLostOnMasked(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFaultFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceFault#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer sType$Default() { return sType(KHRDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFaultFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceFault} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer deviceFault(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesKHR.ndeviceFault(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deviceFaultVendorBinary} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultVendorBinary(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deviceFaultReportMasked} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer deviceFaultReportMasked(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultReportMasked(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deviceFaultDeviceLostOnMasked} field. */
        public VkPhysicalDeviceFaultFeaturesKHR.Buffer deviceFaultDeviceLostOnMasked(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesKHR.ndeviceFaultDeviceLostOnMasked(address(), value ? 1 : 0); return this; }

    }

}