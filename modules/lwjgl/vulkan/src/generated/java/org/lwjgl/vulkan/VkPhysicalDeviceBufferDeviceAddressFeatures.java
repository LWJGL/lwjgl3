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
 * Structure describing buffer address features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@code bufferDeviceAddressMultiDevice} exists to allow certain legacy platforms to be able to support {@code bufferDeviceAddress} without needing to support shared GPU virtual addresses for multi-device configurations.</p>
 * </div>
 * 
 * <p>See {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress} for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceBufferDeviceAddressFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceBufferDeviceAddressFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceBufferDeviceAddressFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #bufferDeviceAddress};
 *     VkBool32 {@link #bufferDeviceAddressCaptureReplay};
 *     VkBool32 {@link #bufferDeviceAddressMultiDevice};
 * }</code></pre>
 */
public class VkPhysicalDeviceBufferDeviceAddressFeatures extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports accessing buffer memory in shaders as storage buffers via an address queried from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddress() { return nbufferDeviceAddress(address()) != 0; }
    /** indicates that the implementation supports saving and reusing buffer and device addresses, e.g. for trace capture and replay. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() { return nbufferDeviceAddressCaptureReplay(address()) != 0; }
    /** indicates that the implementation supports the {@code bufferDeviceAddress} , {@code rayTracingPipeline} and {@code rayQuery} features for logical devices created with multiple physical devices. If this feature is not supported, buffer and acceleration structure addresses <b>must</b> not be queried on a logical device created with more than one physical device. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() { return nbufferDeviceAddressMultiDevice(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddress} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddressCaptureReplay} field. */
    public VkPhysicalDeviceBufferDeviceAddressFeatures bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bufferDeviceAddressMultiDevice} field. */
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
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc() {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures create(long address) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferDeviceAddressFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT); }
    /** Unsafe version of {@link #bufferDeviceAddress}. */
    public static int nbufferDeviceAddress(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay}. */
    public static int nbufferDeviceAddressCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice}. */
    public static int nbufferDeviceAddressMultiDevice(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBufferDeviceAddressFeatures.PNEXT, value); }
    /** Unsafe version of {@link #bufferDeviceAddress(boolean) bufferDeviceAddress}. */
    public static void nbufferDeviceAddress(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESS, value); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay(boolean) bufferDeviceAddressCaptureReplay}. */
    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice(boolean) bufferDeviceAddressMultiDevice}. */
    public static void nbufferDeviceAddressMultiDevice(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceBufferDeviceAddressFeatures.BUFFERDEVICEADDRESSMULTIDEVICE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBufferDeviceAddressFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBufferDeviceAddressFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBufferDeviceAddressFeatures ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBufferDeviceAddressFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceBufferDeviceAddressFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddress} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddressCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddressMultiDevice} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#sType} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#pNext} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBufferDeviceAddressFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddress} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddressCaptureReplay} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceBufferDeviceAddressFeatures#bufferDeviceAddressMultiDevice} field. */
        public VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeatures.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    }

}