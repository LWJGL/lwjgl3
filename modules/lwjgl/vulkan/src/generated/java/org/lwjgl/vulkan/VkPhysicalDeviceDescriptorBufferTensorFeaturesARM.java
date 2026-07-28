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
 * struct VkPhysicalDeviceDescriptorBufferTensorFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 descriptorBufferTensorDescriptors;
 * }}</pre>
 */
public class VkPhysicalDeviceDescriptorBufferTensorFeaturesARM extends Struct<VkPhysicalDeviceDescriptorBufferTensorFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORBUFFERTENSORDESCRIPTORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORBUFFERTENSORDESCRIPTORS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorBufferTensorDescriptors} field. */
    @NativeType("VkBool32")
    public boolean descriptorBufferTensorDescriptors() { return ndescriptorBufferTensorDescriptors(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorBufferTensorDescriptors} field. */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM descriptorBufferTensorDescriptors(@NativeType("VkBool32") boolean value) { ndescriptorBufferTensorDescriptors(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM set(
        int sType,
        long pNext,
        boolean descriptorBufferTensorDescriptors
    ) {
        sType(sType);
        pNext(pNext);
        descriptorBufferTensorDescriptors(descriptorBufferTensorDescriptors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM set(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM malloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM calloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create(long address) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDescriptorBufferTensorFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #descriptorBufferTensorDescriptors}. */
    public static int ndescriptorBufferTensorDescriptors(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.DESCRIPTORBUFFERTENSORDESCRIPTORS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #descriptorBufferTensorDescriptors(boolean) descriptorBufferTensorDescriptors}. */
    public static void ndescriptorBufferTensorDescriptors(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.DESCRIPTORBUFFERTENSORDESCRIPTORS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferTensorFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorBufferTensorFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorBufferTensorFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorBufferTensorFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.npNext(address()); }
        /** @return the value of the {@code descriptorBufferTensorDescriptors} field. */
        @NativeType("VkBool32")
        public boolean descriptorBufferTensorDescriptors() { return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.ndescriptorBufferTensorDescriptors(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorBufferTensorDescriptors} field. */
        public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.Buffer descriptorBufferTensorDescriptors(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.ndescriptorBufferTensorDescriptors(address(), value ? 1 : 0); return this; }

    }

}