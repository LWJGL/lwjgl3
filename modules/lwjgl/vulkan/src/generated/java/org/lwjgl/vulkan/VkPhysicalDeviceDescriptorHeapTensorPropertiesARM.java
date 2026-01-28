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
 * struct VkPhysicalDeviceDescriptorHeapTensorPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize tensorDescriptorSize;
 *     VkDeviceSize tensorDescriptorAlignment;
 *     size_t tensorCaptureReplayOpaqueDataSize;
 * }}</pre>
 */
public class VkPhysicalDeviceDescriptorHeapTensorPropertiesARM extends Struct<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORDESCRIPTORSIZE,
        TENSORDESCRIPTORALIGNMENT,
        TENSORCAPTUREREPLAYOPAQUEDATASIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORDESCRIPTORSIZE = layout.offsetof(2);
        TENSORDESCRIPTORALIGNMENT = layout.offsetof(3);
        TENSORCAPTUREREPLAYOPAQUEDATASIZE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorDescriptorSize} field. */
    @NativeType("VkDeviceSize")
    public long tensorDescriptorSize() { return ntensorDescriptorSize(address()); }
    /** @return the value of the {@code tensorDescriptorAlignment} field. */
    @NativeType("VkDeviceSize")
    public long tensorDescriptorAlignment() { return ntensorDescriptorAlignment(address()); }
    /** @return the value of the {@code tensorCaptureReplayOpaqueDataSize} field. */
    @NativeType("size_t")
    public long tensorCaptureReplayOpaqueDataSize() { return ntensorCaptureReplayOpaqueDataSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(VkPhysicalDeviceDescriptorHeapTensorPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDescriptorHeapTensorPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #tensorDescriptorSize}. */
    public static long ntensorDescriptorSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.TENSORDESCRIPTORSIZE); }
    /** Unsafe version of {@link #tensorDescriptorAlignment}. */
    public static long ntensorDescriptorAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.TENSORDESCRIPTORALIGNMENT); }
    /** Unsafe version of {@link #tensorCaptureReplayOpaqueDataSize}. */
    public static long ntensorCaptureReplayOpaqueDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.TENSORCAPTUREREPLAYOPAQUEDATASIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorHeapTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorHeapTensorPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorHeapTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.npNext(address()); }
        /** @return the value of the {@code tensorDescriptorSize} field. */
        @NativeType("VkDeviceSize")
        public long tensorDescriptorSize() { return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorDescriptorSize(address()); }
        /** @return the value of the {@code tensorDescriptorAlignment} field. */
        @NativeType("VkDeviceSize")
        public long tensorDescriptorAlignment() { return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorDescriptorAlignment(address()); }
        /** @return the value of the {@code tensorCaptureReplayOpaqueDataSize} field. */
        @NativeType("size_t")
        public long tensorCaptureReplayOpaqueDataSize() { return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorCaptureReplayOpaqueDataSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.npNext(address(), value); return this; }

    }

}