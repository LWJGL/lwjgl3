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
 * struct VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t queueFamilyIndex;
 *     VkPhysicalDeviceDataGraphProcessingEngineTypeARM engineType;
 * }}</pre>
 */
public class VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM extends Struct<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEFAMILYINDEX,
        ENGINETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        ENGINETYPE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** @return the value of the {@code engineType} field. */
    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
    public int engineType() { return nengineType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code engineType} field. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineType(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) { nengineType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(
        int sType,
        long pNext,
        int queueFamilyIndex,
        int engineType
    ) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        engineType(engineType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM malloc() {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM calloc() {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance for the specified memory address. */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create(long address) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.PNEXT); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #engineType}. */
    public static int nengineType(long struct) { return memGetInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.ENGINETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #engineType(int) engineType}. */
    public static void nengineType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.ENGINETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ELEMENT_FACTORY = VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.npNext(address()); }
        /** @return the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nqueueFamilyIndex(address()); }
        /** @return the value of the {@code engineType} field. */
        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
        public int engineType() { return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nengineType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code engineType} field. */
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.Buffer engineType(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) { VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nengineType(address(), value); return this; }

    }

}