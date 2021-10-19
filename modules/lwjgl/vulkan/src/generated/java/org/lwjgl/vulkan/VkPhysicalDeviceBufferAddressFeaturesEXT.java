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
 * See {@link VkPhysicalDeviceBufferDeviceAddressFeaturesEXT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceBufferAddressFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 bufferDeviceAddress;
 *     VkBool32 bufferDeviceAddressCaptureReplay;
 *     VkBool32 bufferDeviceAddressMultiDevice;
 * }</code></pre>
 */
public class VkPhysicalDeviceBufferAddressFeaturesEXT extends VkPhysicalDeviceBufferDeviceAddressFeaturesEXT {

    /**
     * Creates a {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBufferAddressFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBufferDeviceAddress#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT sType$Default() { return sType(EXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddress} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceBufferAddressFeaturesEXT set(
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
    public VkPhysicalDeviceBufferAddressFeaturesEXT set(VkPhysicalDeviceBufferAddressFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferAddressFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceBufferAddressFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBufferAddressFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceBufferDeviceAddressFeaturesEXT.Buffer {

        private static final VkPhysicalDeviceBufferAddressFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBufferAddressFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBufferAddressFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceBufferAddressFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBufferAddressFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBufferDeviceAddress#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer sType$Default() { return sType(EXTBufferDeviceAddress.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBufferAddressFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddress} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
        @Override
        public VkPhysicalDeviceBufferAddressFeaturesEXT.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBufferAddressFeaturesEXT.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }

    }

}