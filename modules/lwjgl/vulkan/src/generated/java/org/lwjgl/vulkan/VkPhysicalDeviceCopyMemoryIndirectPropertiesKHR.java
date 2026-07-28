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
 * struct VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkQueueFlags supportedQueues;
 * }}</pre>
 */
public class VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR extends Struct<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR> implements NativeResource {

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

    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(ByteBuffer container) {
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
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR set(
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
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR set(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #supportedQueues}. */
    public static int nsupportedQueues(long struct) { return memGetInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.SUPPORTEDQUEUES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code supportedQueues} field. */
        @NativeType("VkQueueFlags")
        public int supportedQueues() { return VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsupportedQueues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR.npNext(address(), value); return this; }

    }

}