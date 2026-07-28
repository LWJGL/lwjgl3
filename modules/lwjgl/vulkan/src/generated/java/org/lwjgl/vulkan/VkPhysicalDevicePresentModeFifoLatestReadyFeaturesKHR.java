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
 * struct VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentModeFifoLatestReady;
 * }}</pre>
 */
public class VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR extends Struct<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODEFIFOLATESTREADY;

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
        PRESENTMODEFIFOLATESTREADY = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code presentModeFifoLatestReady} field. */
    @NativeType("VkBool32")
    public boolean presentModeFifoLatestReady() { return npresentModeFifoLatestReady(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentModeFifoLatestReady#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType$Default() { return sType(KHRPresentModeFifoLatestReady.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentModeFifoLatestReady} field. */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) { npresentModeFifoLatestReady(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(
        int sType,
        long pNext,
        boolean presentModeFifoLatestReady
    ) {
        sType(sType);
        pNext(pNext);
        presentModeFifoLatestReady(presentModeFifoLatestReady);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR malloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR calloc() {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR create(long address) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #presentModeFifoLatestReady}. */
    public static int npresentModeFifoLatestReady(long struct) { return memGetInt(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.PRESENTMODEFIFOLATESTREADY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentModeFifoLatestReady(boolean) presentModeFifoLatestReady}. */
    public static void npresentModeFifoLatestReady(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.PRESENTMODEFIFOLATESTREADY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code presentModeFifoLatestReady} field. */
        @NativeType("VkBool32")
        public boolean presentModeFifoLatestReady() { return VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npresentModeFifoLatestReady(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentModeFifoLatestReady#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer sType$Default() { return sType(KHRPresentModeFifoLatestReady.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentModeFifoLatestReady} field. */
        public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.Buffer presentModeFifoLatestReady(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR.npresentModeFifoLatestReady(address(), value ? 1 : 0); return this; }

    }

}