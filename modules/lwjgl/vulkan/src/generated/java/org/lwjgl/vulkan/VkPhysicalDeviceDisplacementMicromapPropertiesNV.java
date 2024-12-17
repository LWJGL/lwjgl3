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
 * struct VkPhysicalDeviceDisplacementMicromapPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxDisplacementMicromapSubdivisionLevel;
 * }}</pre>
 */
public class VkPhysicalDeviceDisplacementMicromapPropertiesNV extends Struct<VkPhysicalDeviceDisplacementMicromapPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXDISPLACEMENTMICROMAPSUBDIVISIONLEVEL;

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
        MAXDISPLACEMENTMICROMAPSUBDIVISIONLEVEL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDisplacementMicromapPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDisplacementMicromapPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxDisplacementMicromapSubdivisionLevel} field. */
    @NativeType("uint32_t")
    public int maxDisplacementMicromapSubdivisionLevel() { return nmaxDisplacementMicromapSubdivisionLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDisplacementMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sType$Default() { return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV set(
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
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV set(VkPhysicalDeviceDisplacementMicromapPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV malloc() {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV calloc() {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV create(long address) {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDisplacementMicromapPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDisplacementMicromapPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDisplacementMicromapPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxDisplacementMicromapSubdivisionLevel}. */
    public static int nmaxDisplacementMicromapSubdivisionLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceDisplacementMicromapPropertiesNV.MAXDISPLACEMENTMICROMAPSUBDIVISIONLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDisplacementMicromapPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDisplacementMicromapPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDisplacementMicromapPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDisplacementMicromapPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceDisplacementMicromapPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDisplacementMicromapPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.npNext(address()); }
        /** @return the value of the {@code maxDisplacementMicromapSubdivisionLevel} field. */
        @NativeType("uint32_t")
        public int maxDisplacementMicromapSubdivisionLevel() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.nmaxDisplacementMicromapSubdivisionLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDisplacementMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer sType$Default() { return sType(NVDisplacementMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDisplacementMicromapPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.npNext(address(), value); return this; }

    }

}