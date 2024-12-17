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
 * struct VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 extendedSparseAddressSpace;
 * }}</pre>
 */
public class VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extends Struct<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXTENDEDSPARSEADDRESSSPACE;

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
        EXTENDEDSPARSEADDRESSSPACE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code extendedSparseAddressSpace} field. */
    @NativeType("VkBool32")
    public boolean extendedSparseAddressSpace() { return nextendedSparseAddressSpace(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVExtendedSparseAddressSpace#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType$Default() { return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code extendedSparseAddressSpace} field. */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpace(@NativeType("VkBool32") boolean value) { nextendedSparseAddressSpace(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV set(
        int sType,
        long pNext,
        boolean extendedSparseAddressSpace
    ) {
        sType(sType);
        pNext(pNext);
        extendedSparseAddressSpace(extendedSparseAddressSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV set(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV malloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV calloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create(long address) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #extendedSparseAddressSpace}. */
    public static int nextendedSparseAddressSpace(long struct) { return memGetInt(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.EXTENDEDSPARSEADDRESSSPACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #extendedSparseAddressSpace(boolean) extendedSparseAddressSpace}. */
    public static void nextendedSparseAddressSpace(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.EXTENDEDSPARSEADDRESSSPACE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.npNext(address()); }
        /** @return the value of the {@code extendedSparseAddressSpace} field. */
        @NativeType("VkBool32")
        public boolean extendedSparseAddressSpace() { return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nextendedSparseAddressSpace(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVExtendedSparseAddressSpace#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer sType$Default() { return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code extendedSparseAddressSpace} field. */
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.Buffer extendedSparseAddressSpace(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nextendedSparseAddressSpace(address(), value ? 1 : 0); return this; }

    }

}