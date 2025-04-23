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
 * struct VkPhysicalDeviceImageAlignmentControlPropertiesMESA {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t supportedImageAlignmentMask;
 * }}</pre>
 */
public class VkPhysicalDeviceImageAlignmentControlPropertiesMESA extends Struct<VkPhysicalDeviceImageAlignmentControlPropertiesMESA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDIMAGEALIGNMENTMASK;

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
        SUPPORTEDIMAGEALIGNMENTMASK = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageAlignmentControlPropertiesMESA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageAlignmentControlPropertiesMESA create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA(ByteBuffer container) {
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
    /** @return the value of the {@code supportedImageAlignmentMask} field. */
    @NativeType("uint32_t")
    public int supportedImageAlignmentMask() { return nsupportedImageAlignmentMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA} value to the {@code sType} field. */
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA set(
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
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA set(VkPhysicalDeviceImageAlignmentControlPropertiesMESA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA malloc() {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA calloc() {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance for the specified memory address. */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA create(long address) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageAlignmentControlPropertiesMESA createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageAlignmentControlPropertiesMESA.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageAlignmentControlPropertiesMESA.PNEXT); }
    /** Unsafe version of {@link #supportedImageAlignmentMask}. */
    public static int nsupportedImageAlignmentMask(long struct) { return memGetInt(struct + VkPhysicalDeviceImageAlignmentControlPropertiesMESA.SUPPORTEDIMAGEALIGNMENTMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageAlignmentControlPropertiesMESA.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageAlignmentControlPropertiesMESA.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageAlignmentControlPropertiesMESA, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageAlignmentControlPropertiesMESA ELEMENT_FACTORY = VkPhysicalDeviceImageAlignmentControlPropertiesMESA.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageAlignmentControlPropertiesMESA#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageAlignmentControlPropertiesMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.npNext(address()); }
        /** @return the value of the {@code supportedImageAlignmentMask} field. */
        @NativeType("uint32_t")
        public int supportedImageAlignmentMask() { return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsupportedImageAlignmentMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsType(address(), value); return this; }
        /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA} value to the {@code sType} field. */
        public VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageAlignmentControlPropertiesMESA.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageAlignmentControlPropertiesMESA.npNext(address(), value); return this; }

    }

}