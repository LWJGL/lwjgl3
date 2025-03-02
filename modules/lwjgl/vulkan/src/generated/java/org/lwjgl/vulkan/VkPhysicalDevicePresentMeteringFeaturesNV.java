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
 * struct VkPhysicalDevicePresentMeteringFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentMetering;
 * }}</pre>
 */
public class VkPhysicalDevicePresentMeteringFeaturesNV extends Struct<VkPhysicalDevicePresentMeteringFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMETERING;

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
        PRESENTMETERING = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentMeteringFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePresentMeteringFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentMeteringFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code presentMetering} field. */
    @NativeType("VkBool32")
    public boolean presentMetering() { return npresentMetering(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePresentMeteringFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPresentMetering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDevicePresentMeteringFeaturesNV sType$Default() { return sType(NVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePresentMeteringFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentMetering} field. */
    public VkPhysicalDevicePresentMeteringFeaturesNV presentMetering(@NativeType("VkBool32") boolean value) { npresentMetering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentMeteringFeaturesNV set(
        int sType,
        long pNext,
        boolean presentMetering
    ) {
        sType(sType);
        pNext(pNext);
        presentMetering(presentMetering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentMeteringFeaturesNV set(VkPhysicalDevicePresentMeteringFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentMeteringFeaturesNV malloc() {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentMeteringFeaturesNV calloc() {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentMeteringFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentMeteringFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDevicePresentMeteringFeaturesNV create(long address) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePresentMeteringFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePresentMeteringFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentMeteringFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentMeteringFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePresentMeteringFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentMeteringFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #presentMetering}. */
    public static int npresentMetering(long struct) { return memGetInt(struct + VkPhysicalDevicePresentMeteringFeaturesNV.PRESENTMETERING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentMeteringFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentMeteringFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #presentMetering(boolean) presentMetering}. */
    public static void npresentMetering(long struct, int value) { memPutInt(struct + VkPhysicalDevicePresentMeteringFeaturesNV.PRESENTMETERING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentMeteringFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentMeteringFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentMeteringFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePresentMeteringFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentMeteringFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentMeteringFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePresentMeteringFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentMeteringFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentMeteringFeaturesNV.npNext(address()); }
        /** @return the value of the {@code presentMetering} field. */
        @NativeType("VkBool32")
        public boolean presentMetering() { return VkPhysicalDevicePresentMeteringFeaturesNV.npresentMetering(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePresentMeteringFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentMeteringFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPresentMetering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDevicePresentMeteringFeaturesNV.Buffer sType$Default() { return sType(NVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePresentMeteringFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentMeteringFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentMetering} field. */
        public VkPhysicalDevicePresentMeteringFeaturesNV.Buffer presentMetering(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentMeteringFeaturesNV.npresentMetering(address(), value ? 1 : 0); return this; }

    }

}