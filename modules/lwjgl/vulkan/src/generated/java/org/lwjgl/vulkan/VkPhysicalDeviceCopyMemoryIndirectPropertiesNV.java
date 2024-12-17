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
 * struct VkPhysicalDeviceCopyMemoryIndirectPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkQueueFlags supportedQueues;
 * }}</pre>
 */
public class VkPhysicalDeviceCopyMemoryIndirectPropertiesNV extends Struct<VkPhysicalDeviceCopyMemoryIndirectPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDQUEUES;

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
        SUPPORTEDQUEUES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code supportedQueues} field. */
    @NativeType("VkQueueFlags")
    public int supportedQueues() { return nsupportedQueues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV sType$Default() { return sType(NVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV set(
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
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV set(VkPhysicalDeviceCopyMemoryIndirectPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCopyMemoryIndirectPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #supportedQueues}. */
    public static int nsupportedQueues(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.SUPPORTEDQUEUES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCopyMemoryIndirectPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCopyMemoryIndirectPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCopyMemoryIndirectPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.npNext(address()); }
        /** @return the value of the {@code supportedQueues} field. */
        @NativeType("VkQueueFlags")
        public int supportedQueues() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.nsupportedQueues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer sType$Default() { return sType(NVCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.npNext(address(), value); return this; }

    }

}