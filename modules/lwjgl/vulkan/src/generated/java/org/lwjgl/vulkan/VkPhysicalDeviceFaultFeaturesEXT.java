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
 * Structure indicating support for device fault reporting.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFaultFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFaultFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceFault#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFaultFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #deviceFault};
 *     VkBool32 {@link #deviceFaultVendorBinary};
 * }</code></pre>
 */
public class VkPhysicalDeviceFaultFeaturesEXT extends Struct<VkPhysicalDeviceFaultFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEFAULT,
        DEVICEFAULTVENDORBINARY;

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
        DEVICEFAULT = layout.offsetof(2);
        DEVICEFAULTVENDORBINARY = layout.offsetof(3);
    }

    protected VkPhysicalDeviceFaultFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFaultFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFaultFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFaultFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFaultFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports the reporting of device fault information. */
    @NativeType("VkBool32")
    public boolean deviceFault() { return ndeviceFault(address()) != 0; }
    /** indicates that the implementation supports the generation of vendor-specific binary crash dumps. These may provide additional information when imported into vendor-specific external tools. */
    @NativeType("VkBool32")
    public boolean deviceFaultVendorBinary() { return ndeviceFaultVendorBinary(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFaultFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceFaultFeaturesEXT sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFaultFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceFault} field. */
    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(@NativeType("VkBool32") boolean value) { ndeviceFault(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #deviceFaultVendorBinary} field. */
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) { ndeviceFaultVendorBinary(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFaultFeaturesEXT set(
        int sType,
        long pNext,
        boolean deviceFault,
        boolean deviceFaultVendorBinary
    ) {
        sType(sType);
        pNext(pNext);
        deviceFault(deviceFault);
        deviceFaultVendorBinary(deviceFaultVendorBinary);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFaultFeaturesEXT set(VkPhysicalDeviceFaultFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFaultFeaturesEXT malloc() {
        return new VkPhysicalDeviceFaultFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFaultFeaturesEXT calloc() {
        return new VkPhysicalDeviceFaultFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFaultFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFaultFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFaultFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFaultFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFaultFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFaultFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFaultFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFaultFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFaultFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFaultFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFaultFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #deviceFault}. */
    public static int ndeviceFault(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.DEVICEFAULT); }
    /** Unsafe version of {@link #deviceFaultVendorBinary}. */
    public static int ndeviceFaultVendorBinary(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.DEVICEFAULTVENDORBINARY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFaultFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #deviceFault(boolean) deviceFault}. */
    public static void ndeviceFault(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.DEVICEFAULT, value); }
    /** Unsafe version of {@link #deviceFaultVendorBinary(boolean) deviceFaultVendorBinary}. */
    public static void ndeviceFaultVendorBinary(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFaultFeaturesEXT.DEVICEFAULTVENDORBINARY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFaultFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFaultFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFaultFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFaultFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFaultFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFaultFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFaultFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFaultFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFaultFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFaultFeaturesEXT#deviceFault} field. */
        @NativeType("VkBool32")
        public boolean deviceFault() { return VkPhysicalDeviceFaultFeaturesEXT.ndeviceFault(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFaultFeaturesEXT#deviceFaultVendorBinary} field. */
        @NativeType("VkBool32")
        public boolean deviceFaultVendorBinary() { return VkPhysicalDeviceFaultFeaturesEXT.ndeviceFaultVendorBinary(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFaultFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFaultFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceFaultFeaturesEXT.Buffer sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFaultFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFaultFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFaultFeaturesEXT#deviceFault} field. */
        public VkPhysicalDeviceFaultFeaturesEXT.Buffer deviceFault(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesEXT.ndeviceFault(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFaultFeaturesEXT#deviceFaultVendorBinary} field. */
        public VkPhysicalDeviceFaultFeaturesEXT.Buffer deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFaultFeaturesEXT.ndeviceFaultVendorBinary(address(), value ? 1 : 0); return this; }

    }

}