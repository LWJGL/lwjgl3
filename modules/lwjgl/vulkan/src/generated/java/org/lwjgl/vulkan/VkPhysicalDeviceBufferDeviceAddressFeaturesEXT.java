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
 * struct VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 bufferDeviceAddress;
 *     VkBool32 bufferDeviceAddressCaptureReplay;
 *     VkBool32 bufferDeviceAddressMultiDevice;
 * }}</pre>
 */
public class VkPhysicalDeviceBufferDeviceAddressFeaturesEXT extends Struct<VkPhysicalDeviceBufferDeviceAddressFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFERDEVICEADDRESS,
        BUFFERDEVICEADDRESSCAPTUREREPLAY,
        BUFFERDEVICEADDRESSMULTIDEVICE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFERDEVICEADDRESS = layout.offsetof(2);
        BUFFERDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(3);
        BUFFERDEVICEADDRESSMULTIDEVICE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code bufferDeviceAddress} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddress() { return nbufferDeviceAddress(address()) != 0; }
    /** @return the value of the {@code bufferDeviceAddressCaptureReplay} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() { return nbufferDeviceAddressCaptureReplay(address()) != 0; }
    /** @return the value of the {@code bufferDeviceAddressMultiDevice} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() { return nbufferDeviceAddressMultiDevice(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBufferDeviceAddress#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT sType$Default() { return sType(EXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddress} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT set(
        int sType,
        long pNext,
        boolean bufferDeviceAddress,
        boolean bufferDeviceAddressCaptureReplay,
        boolean bufferDeviceAddressMultiDevice
    ) {
        sType(sType);
        pNext(pNext);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT set(VkPhysicalDeviceBufferDeviceAddressFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT malloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT calloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceBufferDeviceAddressFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #bufferDeviceAddress}. */
    public static int nbufferDeviceAddress(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESS); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay}. */
    public static int nbufferDeviceAddressCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESSCAPTUREREPLAY); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice}. */
    public static int nbufferDeviceAddressMultiDevice(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESSMULTIDEVICE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #bufferDeviceAddress(boolean) bufferDeviceAddress}. */
    public static void nbufferDeviceAddress(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESS, value); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay(boolean) bufferDeviceAddressCaptureReplay}. */
    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESSCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice(boolean) bufferDeviceAddressMultiDevice}. */
    public static void nbufferDeviceAddressMultiDevice(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.BUFFERDEVICEADDRESSMULTIDEVICE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBufferDeviceAddressFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBufferDeviceAddressFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceBufferDeviceAddressFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code bufferDeviceAddress} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddress(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressMultiDevice} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBufferDeviceAddress#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer sType$Default() { return sType(EXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddress} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    }

}