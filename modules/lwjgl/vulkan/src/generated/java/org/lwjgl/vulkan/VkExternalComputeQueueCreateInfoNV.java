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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkExternalComputeQueueCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueue preferredQueue;
 * }}</pre>
 */
public class VkExternalComputeQueueCreateInfoNV extends Struct<VkExternalComputeQueueCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERREDQUEUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDQUEUE = layout.offsetof(2);
    }

    protected VkExternalComputeQueueCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalComputeQueueCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkExternalComputeQueueCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkExternalComputeQueueCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalComputeQueueCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code preferredQueue} field. */
    @NativeType("VkQueue")
    public long preferredQueue() { return npreferredQueue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalComputeQueueCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExternalComputeQueue#VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkExternalComputeQueueCreateInfoNV sType$Default() { return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalComputeQueueCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code preferredQueue} field. */
    public VkExternalComputeQueueCreateInfoNV preferredQueue(VkQueue value) { npreferredQueue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalComputeQueueCreateInfoNV set(
        int sType,
        long pNext,
        VkQueue preferredQueue
    ) {
        sType(sType);
        pNext(pNext);
        preferredQueue(preferredQueue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalComputeQueueCreateInfoNV set(VkExternalComputeQueueCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalComputeQueueCreateInfoNV malloc() {
        return new VkExternalComputeQueueCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalComputeQueueCreateInfoNV calloc() {
        return new VkExternalComputeQueueCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkExternalComputeQueueCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalComputeQueueCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance for the specified memory address. */
    public static VkExternalComputeQueueCreateInfoNV create(long address) {
        return new VkExternalComputeQueueCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalComputeQueueCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkExternalComputeQueueCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalComputeQueueCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalComputeQueueCreateInfoNV malloc(MemoryStack stack) {
        return new VkExternalComputeQueueCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalComputeQueueCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalComputeQueueCreateInfoNV calloc(MemoryStack stack) {
        return new VkExternalComputeQueueCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalComputeQueueCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalComputeQueueCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExternalComputeQueueCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalComputeQueueCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #preferredQueue}. */
    public static long npreferredQueue(long struct) { return memGetAddress(struct + VkExternalComputeQueueCreateInfoNV.PREFERREDQUEUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExternalComputeQueueCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalComputeQueueCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #preferredQueue(VkQueue) preferredQueue}. */
    public static void npreferredQueue(long struct, VkQueue value) { memPutAddress(struct + VkExternalComputeQueueCreateInfoNV.PREFERREDQUEUE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExternalComputeQueueCreateInfoNV.PREFERREDQUEUE));
    }

    // -----------------------------------

    /** An array of {@link VkExternalComputeQueueCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkExternalComputeQueueCreateInfoNV, Buffer> implements NativeResource {

        private static final VkExternalComputeQueueCreateInfoNV ELEMENT_FACTORY = VkExternalComputeQueueCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkExternalComputeQueueCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalComputeQueueCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalComputeQueueCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalComputeQueueCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExternalComputeQueueCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code preferredQueue} field. */
        @NativeType("VkQueue")
        public long preferredQueue() { return VkExternalComputeQueueCreateInfoNV.npreferredQueue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalComputeQueueCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalComputeQueueCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExternalComputeQueue#VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkExternalComputeQueueCreateInfoNV.Buffer sType$Default() { return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalComputeQueueCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkExternalComputeQueueCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code preferredQueue} field. */
        public VkExternalComputeQueueCreateInfoNV.Buffer preferredQueue(VkQueue value) { VkExternalComputeQueueCreateInfoNV.npreferredQueue(address(), value); return this; }

    }

}