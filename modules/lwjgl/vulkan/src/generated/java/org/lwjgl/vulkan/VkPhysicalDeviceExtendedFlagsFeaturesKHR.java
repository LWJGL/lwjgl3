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
 * struct VkPhysicalDeviceExtendedFlagsFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 extendedFlags;
 * }}</pre>
 */
public class VkPhysicalDeviceExtendedFlagsFeaturesKHR extends Struct<VkPhysicalDeviceExtendedFlagsFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDFLAGS;

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
        EXTENDEDFLAGS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedFlagsFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedFlagsFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code extendedFlags} field. */
    @NativeType("VkBool32")
    public boolean extendedFlags() { return nextendedFlags(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code extendedFlags} field. */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR extendedFlags(@NativeType("VkBool32") boolean value) { nextendedFlags(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR set(
        int sType,
        long pNext,
        boolean extendedFlags
    ) {
        sType(sType);
        pNext(pNext);
        extendedFlags(extendedFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedFlagsFeaturesKHR set(VkPhysicalDeviceExtendedFlagsFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR malloc() {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR calloc() {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR create(long address) {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExtendedFlagsFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedFlagsFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedFlagsFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #extendedFlags}. */
    public static int nextendedFlags(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.EXTENDEDFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #extendedFlags(boolean) extendedFlags}. */
    public static void nextendedFlags(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedFlagsFeaturesKHR.EXTENDEDFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedFlagsFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedFlagsFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceExtendedFlagsFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedFlagsFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedFlagsFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedFlagsFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedFlagsFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code extendedFlags} field. */
        @NativeType("VkBool32")
        public boolean extendedFlags() { return VkPhysicalDeviceExtendedFlagsFeaturesKHR.nextendedFlags(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedFlagsFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_FLAGS_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedFlagsFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code extendedFlags} field. */
        public VkPhysicalDeviceExtendedFlagsFeaturesKHR.Buffer extendedFlags(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedFlagsFeaturesKHR.nextendedFlags(address(), value ? 1 : 0); return this; }

    }

}