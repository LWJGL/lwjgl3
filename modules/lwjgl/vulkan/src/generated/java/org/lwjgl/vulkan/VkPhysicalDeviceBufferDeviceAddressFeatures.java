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
 * struct VkPhysicalDeviceBufferDeviceAddressFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 bufferDeviceAddress;
 *     VkBool32 bufferDeviceAddressCaptureReplay;
 *     VkBool32 bufferDeviceAddressMultiDevice;
 * }}</pre>
 */
public class VkPhysicalDeviceBufferDeviceAddressFeatures extends Struct<VkPhysicalDeviceBufferDeviceAddressFeatures> implements NativeResource {

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

    protected VkPhysicalDeviceBufferDeviceAddressFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceBufferDeviceAddressFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBufferDeviceAddressFeatures(ByteBuffer container) {
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
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddress} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures set(
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
    public VkPhysicalDeviceBufferDeviceAddressFeatures set(VkPhysicalDeviceBufferDeviceAddressFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures malloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc() {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures create(long address) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceBufferDeviceAddressFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBufferDeviceAddressFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBufferDeviceAddressFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT); }
    /** Unsafe version of {@link #bufferDeviceAddress}. */
    public static int nbufferDeviceAddress(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay}. */
    public static int nbufferDeviceAddressCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice}. */
    public static int nbufferDeviceAddressMultiDevice(long struct) { return memGetInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT, value); }
    /** Unsafe version of {@link #bufferDeviceAddress(boolean) bufferDeviceAddress}. */
    public static void nbufferDeviceAddress(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS, value); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay(boolean) bufferDeviceAddressCaptureReplay}. */
    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice(boolean) bufferDeviceAddressMultiDevice}. */
    public static void nbufferDeviceAddressMultiDevice(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBufferDeviceAddressFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBufferDeviceAddressFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBufferDeviceAddressFeatures ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBufferDeviceAddressFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceBufferDeviceAddressFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address()); }
        /** @return the value of the {@code bufferDeviceAddress} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressMultiDevice} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddress} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    }

}