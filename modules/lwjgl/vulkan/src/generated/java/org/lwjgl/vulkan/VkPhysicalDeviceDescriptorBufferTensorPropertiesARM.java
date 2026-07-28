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
 * struct VkPhysicalDeviceDescriptorBufferTensorPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     size_t tensorCaptureReplayDescriptorDataSize;
 *     size_t tensorViewCaptureReplayDescriptorDataSize;
 *     size_t tensorDescriptorSize;
 * }}</pre>
 */
public class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM extends Struct<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORCAPTUREREPLAYDESCRIPTORDATASIZE,
        TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE,
        TENSORDESCRIPTORSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(2);
        TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(3);
        TENSORDESCRIPTORSIZE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long tensorCaptureReplayDescriptorDataSize() { return ntensorCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code tensorViewCaptureReplayDescriptorDataSize} field. */
    @NativeType("size_t")
    public long tensorViewCaptureReplayDescriptorDataSize() { return ntensorViewCaptureReplayDescriptorDataSize(address()); }
    /** @return the value of the {@code tensorDescriptorSize} field. */
    @NativeType("size_t")
    public long tensorDescriptorSize() { return ntensorDescriptorSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensorCaptureReplayDescriptorDataSize} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) { ntensorCaptureReplayDescriptorDataSize(address(), value); return this; }
    /** Sets the specified value to the {@code tensorViewCaptureReplayDescriptorDataSize} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) { ntensorViewCaptureReplayDescriptorDataSize(address(), value); return this; }
    /** Sets the specified value to the {@code tensorDescriptorSize} field. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(@NativeType("size_t") long value) { ntensorDescriptorSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(
        int sType,
        long pNext,
        long tensorCaptureReplayDescriptorDataSize,
        long tensorViewCaptureReplayDescriptorDataSize,
        long tensorDescriptorSize
    ) {
        sType(sType);
        pNext(pNext);
        tensorCaptureReplayDescriptorDataSize(tensorCaptureReplayDescriptorDataSize);
        tensorViewCaptureReplayDescriptorDataSize(tensorViewCaptureReplayDescriptorDataSize);
        tensorDescriptorSize(tensorDescriptorSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDescriptorBufferTensorPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #tensorCaptureReplayDescriptorDataSize}. */
    public static long ntensorCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORCAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #tensorViewCaptureReplayDescriptorDataSize}. */
    public static long ntensorViewCaptureReplayDescriptorDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE); }
    /** Unsafe version of {@link #tensorDescriptorSize}. */
    public static long ntensorDescriptorSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORDESCRIPTORSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.PNEXT, value); }
    /** Unsafe version of {@link #tensorCaptureReplayDescriptorDataSize(long) tensorCaptureReplayDescriptorDataSize}. */
    public static void ntensorCaptureReplayDescriptorDataSize(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORCAPTUREREPLAYDESCRIPTORDATASIZE, value); }
    /** Unsafe version of {@link #tensorViewCaptureReplayDescriptorDataSize(long) tensorViewCaptureReplayDescriptorDataSize}. */
    public static void ntensorViewCaptureReplayDescriptorDataSize(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE, value); }
    /** Unsafe version of {@link #tensorDescriptorSize(long) tensorDescriptorSize}. */
    public static void ntensorDescriptorSize(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORDESCRIPTORSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorBufferTensorPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorBufferTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(address()); }
        /** @return the value of the {@code tensorCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long tensorCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code tensorViewCaptureReplayDescriptorDataSize} field. */
        @NativeType("size_t")
        public long tensorViewCaptureReplayDescriptorDataSize() { return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(address()); }
        /** @return the value of the {@code tensorDescriptorSize} field. */
        @NativeType("size_t")
        public long tensorDescriptorSize() { return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensorCaptureReplayDescriptorDataSize} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) { VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(address(), value); return this; }
        /** Sets the specified value to the {@code tensorViewCaptureReplayDescriptorDataSize} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorViewCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) { VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(address(), value); return this; }
        /** Sets the specified value to the {@code tensorDescriptorSize} field. */
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorDescriptorSize(@NativeType("size_t") long value) { VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(address(), value); return this; }

    }

}