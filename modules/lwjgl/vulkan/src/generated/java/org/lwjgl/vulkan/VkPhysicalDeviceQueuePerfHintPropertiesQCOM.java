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
 * struct VkPhysicalDeviceQueuePerfHintPropertiesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkQueueFlags supportedQueues;
 * }}</pre>
 */
public class VkPhysicalDeviceQueuePerfHintPropertiesQCOM extends Struct<VkPhysicalDeviceQueuePerfHintPropertiesQCOM> implements NativeResource {

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

    protected VkPhysicalDeviceQueuePerfHintPropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceQueuePerfHintPropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM(ByteBuffer container) {
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
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM set(
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
    public VkPhysicalDeviceQueuePerfHintPropertiesQCOM set(VkPhysicalDeviceQueuePerfHintPropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM malloc() {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM calloc() {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceQueuePerfHintPropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueuePerfHintPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceQueuePerfHintPropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceQueuePerfHintPropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #supportedQueues}. */
    public static int nsupportedQueues(long struct) { return memGetInt(struct + VkPhysicalDeviceQueuePerfHintPropertiesQCOM.SUPPORTEDQUEUES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueuePerfHintPropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceQueuePerfHintPropertiesQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceQueuePerfHintPropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceQueuePerfHintPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceQueuePerfHintPropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceQueuePerfHintPropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceQueuePerfHintPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceQueuePerfHintPropertiesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceQueuePerfHintPropertiesQCOM.npNext(address()); }
        /** @return the value of the {@code supportedQueues} field. */
        @NativeType("VkQueueFlags")
        public int supportedQueues() { return VkPhysicalDeviceQueuePerfHintPropertiesQCOM.nsupportedQueues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceQueuePerfHintPropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceQueuePerfHintPropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceQueuePerfHintPropertiesQCOM.npNext(address(), value); return this; }

    }

}