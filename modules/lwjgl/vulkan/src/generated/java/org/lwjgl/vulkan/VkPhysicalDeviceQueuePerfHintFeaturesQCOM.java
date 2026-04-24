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
 * struct VkPhysicalDeviceQueuePerfHintFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 queuePerfHint;
 * }}</pre>
 */
public class VkPhysicalDeviceQueuePerfHintFeaturesQCOM extends Struct<VkPhysicalDeviceQueuePerfHintFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEPERFHINT;

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
        QUEUEPERFHINT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceQueuePerfHintFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceQueuePerfHintFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code queuePerfHint} field. */
    @NativeType("VkBool32")
    public boolean queuePerfHint() { return nqueuePerfHint(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code queuePerfHint} field. */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM queuePerfHint(@NativeType("VkBool32") boolean value) { nqueuePerfHint(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM set(
        int sType,
        long pNext,
        boolean queuePerfHint
    ) {
        sType(sType);
        pNext(pNext);
        queuePerfHint(queuePerfHint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceQueuePerfHintFeaturesQCOM set(VkPhysicalDeviceQueuePerfHintFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM malloc() {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM calloc() {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceQueuePerfHintFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueuePerfHintFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #queuePerfHint}. */
    public static int nqueuePerfHint(long struct) { return memGetInt(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.QUEUEPERFHINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #queuePerfHint(boolean) queuePerfHint}. */
    public static void nqueuePerfHint(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueuePerfHintFeaturesQCOM.QUEUEPERFHINT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceQueuePerfHintFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceQueuePerfHintFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceQueuePerfHintFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceQueuePerfHintFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceQueuePerfHintFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceQueuePerfHintFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceQueuePerfHintFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code queuePerfHint} field. */
        @NativeType("VkBool32")
        public boolean queuePerfHint() { return VkPhysicalDeviceQueuePerfHintFeaturesQCOM.nqueuePerfHint(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceQueuePerfHintFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMQueuePerfHint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer sType$Default() { return sType(QCOMQueuePerfHint.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceQueuePerfHintFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code queuePerfHint} field. */
        public VkPhysicalDeviceQueuePerfHintFeaturesQCOM.Buffer queuePerfHint(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceQueuePerfHintFeaturesQCOM.nqueuePerfHint(address(), value ? 1 : 0); return this; }

    }

}