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
 * struct VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkSampleCountFlagBits maxFragmentShadingRateInvocationCount;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV extends Struct<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT;

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
        MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxFragmentShadingRateInvocationCount} field. */
    @NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateInvocationCount() { return nmaxFragmentShadingRateInvocationCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV malloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV calloc() {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create(long address) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxFragmentShadingRateInvocationCount}. */
    public static int nmaxFragmentShadingRateInvocationCount(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxFragmentShadingRateInvocationCount} field. */
        @NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateInvocationCount() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nmaxFragmentShadingRateInvocationCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.npNext(address(), value); return this; }

    }

}