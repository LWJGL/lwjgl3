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
 * struct VkPhysicalDeviceTileMemoryHeapPropertiesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 queueSubmitBoundary;
 *     VkBool32 tileBufferTransfers;
 * }}</pre>
 */
public class VkPhysicalDeviceTileMemoryHeapPropertiesQCOM extends Struct<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUESUBMITBOUNDARY,
        TILEBUFFERTRANSFERS;

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
        QUEUESUBMITBOUNDARY = layout.offsetof(2);
        TILEBUFFERTRANSFERS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code queueSubmitBoundary} field. */
    @NativeType("VkBool32")
    public boolean queueSubmitBoundary() { return nqueueSubmitBoundary(address()) != 0; }
    /** @return the value of the {@code tileBufferTransfers} field. */
    @NativeType("VkBool32")
    public boolean tileBufferTransfers() { return ntileBufferTransfers(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code queueSubmitBoundary} field. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundary(@NativeType("VkBool32") boolean value) { nqueueSubmitBoundary(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tileBufferTransfers} field. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfers(@NativeType("VkBool32") boolean value) { ntileBufferTransfers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(
        int sType,
        long pNext,
        boolean queueSubmitBoundary,
        boolean tileBufferTransfers
    ) {
        sType(sType);
        pNext(pNext);
        queueSubmitBoundary(queueSubmitBoundary);
        tileBufferTransfers(tileBufferTransfers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM malloc() {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM calloc() {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTileMemoryHeapPropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #queueSubmitBoundary}. */
    public static int nqueueSubmitBoundary(long struct) { return memGetInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.QUEUESUBMITBOUNDARY); }
    /** Unsafe version of {@link #tileBufferTransfers}. */
    public static int ntileBufferTransfers(long struct) { return memGetInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.TILEBUFFERTRANSFERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #queueSubmitBoundary(boolean) queueSubmitBoundary}. */
    public static void nqueueSubmitBoundary(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.QUEUESUBMITBOUNDARY, value); }
    /** Unsafe version of {@link #tileBufferTransfers(boolean) tileBufferTransfers}. */
    public static void ntileBufferTransfers(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.TILEBUFFERTRANSFERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTileMemoryHeapPropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTileMemoryHeapPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.npNext(address()); }
        /** @return the value of the {@code queueSubmitBoundary} field. */
        @NativeType("VkBool32")
        public boolean queueSubmitBoundary() { return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nqueueSubmitBoundary(address()) != 0; }
        /** @return the value of the {@code tileBufferTransfers} field. */
        @NativeType("VkBool32")
        public boolean tileBufferTransfers() { return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.ntileBufferTransfers(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileMemoryHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer sType$Default() { return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code queueSubmitBoundary} field. */
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer queueSubmitBoundary(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nqueueSubmitBoundary(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tileBufferTransfers} field. */
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.Buffer tileBufferTransfers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.ntileBufferTransfers(address(), value ? 1 : 0); return this; }

    }

}