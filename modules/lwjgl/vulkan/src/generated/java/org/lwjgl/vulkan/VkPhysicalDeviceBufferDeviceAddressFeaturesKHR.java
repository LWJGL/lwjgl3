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
 * See {@link VkPhysicalDeviceBufferDeviceAddressFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceBufferDeviceAddressFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 bufferDeviceAddress;
 *     VkBool32 bufferDeviceAddressCaptureReplay;
 *     VkBool32 bufferDeviceAddressMultiDevice;
 * }</code></pre>
 */
public class VkPhysicalDeviceBufferDeviceAddressFeaturesKHR extends VkPhysicalDeviceBufferDeviceAddressFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddress} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(
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
    public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR set(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceBufferDeviceAddressFeatures.Buffer {

        private static final VkPhysicalDeviceBufferDeviceAddressFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBufferDeviceAddressFeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPhysicalDeviceBufferDeviceAddressFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddress} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
        @Override
        public VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferDeviceAddressFeaturesKHR.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    }

}