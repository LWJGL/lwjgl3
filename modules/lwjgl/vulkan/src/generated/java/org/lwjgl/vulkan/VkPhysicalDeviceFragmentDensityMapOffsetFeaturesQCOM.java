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
 * struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentDensityMapOffset;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends Struct<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAPOFFSET;

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
        FRAGMENTDENSITYMAPOFFSET = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentDensityMapOffset} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapOffset() { return nfragmentDensityMapOffset(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(
        int sType,
        long pNext,
        boolean fragmentDensityMapOffset
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapOffset(fragmentDensityMapOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc() {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMapOffset}. */
    public static int nfragmentDensityMapOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.FRAGMENTDENSITYMAPOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMapOffset(boolean) fragmentDensityMapOffset}. */
    public static void nfragmentDensityMapOffset(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.FRAGMENTDENSITYMAPOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code fragmentDensityMapOffset} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapOffset() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    }

}