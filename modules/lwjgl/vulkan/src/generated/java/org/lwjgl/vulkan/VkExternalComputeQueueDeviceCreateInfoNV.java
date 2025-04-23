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
 * struct VkExternalComputeQueueDeviceCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t reservedExternalQueues;
 * }}</pre>
 */
public class VkExternalComputeQueueDeviceCreateInfoNV extends Struct<VkExternalComputeQueueDeviceCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RESERVEDEXTERNALQUEUES;

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
        RESERVEDEXTERNALQUEUES = layout.offsetof(2);
    }

    protected VkExternalComputeQueueDeviceCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalComputeQueueDeviceCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkExternalComputeQueueDeviceCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalComputeQueueDeviceCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code reservedExternalQueues} field. */
    @NativeType("uint32_t")
    public int reservedExternalQueues() { return nreservedExternalQueues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalComputeQueueDeviceCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalComputeQueue#VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkExternalComputeQueueDeviceCreateInfoNV sType$Default() { return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalComputeQueueDeviceCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code reservedExternalQueues} field. */
    public VkExternalComputeQueueDeviceCreateInfoNV reservedExternalQueues(@NativeType("uint32_t") int value) { nreservedExternalQueues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalComputeQueueDeviceCreateInfoNV set(
        int sType,
        long pNext,
        int reservedExternalQueues
    ) {
        sType(sType);
        pNext(pNext);
        reservedExternalQueues(reservedExternalQueues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalComputeQueueDeviceCreateInfoNV set(VkExternalComputeQueueDeviceCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalComputeQueueDeviceCreateInfoNV malloc() {
        return new VkExternalComputeQueueDeviceCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalComputeQueueDeviceCreateInfoNV calloc() {
        return new VkExternalComputeQueueDeviceCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExternalComputeQueueDeviceCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalComputeQueueDeviceCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance for the specified memory address. */
    public static VkExternalComputeQueueDeviceCreateInfoNV create(long address) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalComputeQueueDeviceCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkExternalComputeQueueDeviceCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalComputeQueueDeviceCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV malloc(MemoryStack stack) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalComputeQueueDeviceCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV calloc(MemoryStack stack) {
        return new VkExternalComputeQueueDeviceCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueDeviceCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalComputeQueueDeviceCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalComputeQueueDeviceCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #reservedExternalQueues}. */
    public static int nreservedExternalQueues(long struct) { return memGetInt(struct + VkExternalComputeQueueDeviceCreateInfoNV.RESERVEDEXTERNALQUEUES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalComputeQueueDeviceCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalComputeQueueDeviceCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #reservedExternalQueues(int) reservedExternalQueues}. */
    public static void nreservedExternalQueues(long struct, int value) { memPutInt(struct + VkExternalComputeQueueDeviceCreateInfoNV.RESERVEDEXTERNALQUEUES, value); }

    // -----------------------------------

    /** An array of {@link VkExternalComputeQueueDeviceCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExternalComputeQueueDeviceCreateInfoNV, Buffer> implements NativeResource {

        private static final VkExternalComputeQueueDeviceCreateInfoNV ELEMENT_FACTORY = VkExternalComputeQueueDeviceCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkExternalComputeQueueDeviceCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalComputeQueueDeviceCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalComputeQueueDeviceCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalComputeQueueDeviceCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExternalComputeQueueDeviceCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code reservedExternalQueues} field. */
        @NativeType("uint32_t")
        public int reservedExternalQueues() { return VkExternalComputeQueueDeviceCreateInfoNV.nreservedExternalQueues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalComputeQueueDeviceCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalComputeQueueDeviceCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalComputeQueue#VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkExternalComputeQueueDeviceCreateInfoNV.Buffer sType$Default() { return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalComputeQueueDeviceCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkExternalComputeQueueDeviceCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code reservedExternalQueues} field. */
        public VkExternalComputeQueueDeviceCreateInfoNV.Buffer reservedExternalQueues(@NativeType("uint32_t") int value) { VkExternalComputeQueueDeviceCreateInfoNV.nreservedExternalQueues(address(), value); return this; }

    }

}