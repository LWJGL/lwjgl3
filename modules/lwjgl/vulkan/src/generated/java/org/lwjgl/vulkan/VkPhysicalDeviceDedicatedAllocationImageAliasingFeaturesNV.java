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
 * struct VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dedicatedAllocationImageAliasing;
 * }}</pre>
 */
public class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends Struct<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEDICATEDALLOCATIONIMAGEALIASING;

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
        DEDICATEDALLOCATIONIMAGEALIASING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code dedicatedAllocationImageAliasing} field. */
    @NativeType("VkBool32")
    public boolean dedicatedAllocationImageAliasing() { return ndedicatedAllocationImageAliasing(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDedicatedAllocationImageAliasing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType$Default() { return sType(NVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dedicatedAllocationImageAliasing} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) { ndedicatedAllocationImageAliasing(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(
        int sType,
        long pNext,
        boolean dedicatedAllocationImageAliasing
    ) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocationImageAliasing(dedicatedAllocationImageAliasing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV malloc() {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV calloc() {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(long address) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #dedicatedAllocationImageAliasing}. */
    public static int ndedicatedAllocationImageAliasing(long struct) { return memGetInt(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.DEDICATEDALLOCATIONIMAGEALIASING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #dedicatedAllocationImageAliasing(boolean) dedicatedAllocationImageAliasing}. */
    public static void ndedicatedAllocationImageAliasing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.DEDICATEDALLOCATIONIMAGEALIASING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address()); }
        /** @return the value of the {@code dedicatedAllocationImageAliasing} field. */
        @NativeType("VkBool32")
        public boolean dedicatedAllocationImageAliasing() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDedicatedAllocationImageAliasing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer sType$Default() { return sType(NVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dedicatedAllocationImageAliasing} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address(), value ? 1 : 0); return this; }

    }

}