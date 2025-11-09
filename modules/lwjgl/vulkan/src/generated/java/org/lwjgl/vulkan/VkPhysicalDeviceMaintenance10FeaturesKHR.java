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
 * struct VkPhysicalDeviceMaintenance10FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 maintenance10;
 * }}</pre>
 */
public class VkPhysicalDeviceMaintenance10FeaturesKHR extends Struct<VkPhysicalDeviceMaintenance10FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAINTENANCE10;

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
        MAINTENANCE10 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMaintenance10FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance10FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance10FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code maintenance10} field. */
    @NativeType("VkBool32")
    public boolean maintenance10() { return nmaintenance10(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance10FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance10FeaturesKHR sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMaintenance10FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maintenance10} field. */
    public VkPhysicalDeviceMaintenance10FeaturesKHR maintenance10(@NativeType("VkBool32") boolean value) { nmaintenance10(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance10FeaturesKHR set(
        int sType,
        long pNext,
        boolean maintenance10
    ) {
        sType(sType);
        pNext(pNext);
        maintenance10(maintenance10);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance10FeaturesKHR set(VkPhysicalDeviceMaintenance10FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance10FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance10FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance10FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #maintenance10}. */
    public static int nmaintenance10(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.MAINTENANCE10); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #maintenance10(boolean) maintenance10}. */
    public static void nmaintenance10(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance10FeaturesKHR.MAINTENANCE10, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance10FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance10FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance10FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance10FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance10FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance10FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance10FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance10FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code maintenance10} field. */
        @NativeType("VkBool32")
        public boolean maintenance10() { return VkPhysicalDeviceMaintenance10FeaturesKHR.nmaintenance10(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance10FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_10_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance10FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maintenance10} field. */
        public VkPhysicalDeviceMaintenance10FeaturesKHR.Buffer maintenance10(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMaintenance10FeaturesKHR.nmaintenance10(address(), value ? 1 : 0); return this; }

    }

}