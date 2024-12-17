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
 * struct VkPhysicalDeviceImageAlignmentControlFeaturesMESA {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageAlignmentControl;
 * }}</pre>
 */
public class VkPhysicalDeviceImageAlignmentControlFeaturesMESA extends Struct<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEALIGNMENTCONTROL;

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
        IMAGEALIGNMENTCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageAlignmentControlFeaturesMESA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageAlignmentControlFeaturesMESA create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA(ByteBuffer container) {
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
    /** @return the value of the {@code imageAlignmentControl} field. */
    @NativeType("VkBool32")
    public boolean imageAlignmentControl() { return nimageAlignmentControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA} value to the {@code sType} field. */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageAlignmentControl} field. */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA imageAlignmentControl(@NativeType("VkBool32") boolean value) { nimageAlignmentControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(
        int sType,
        long pNext,
        boolean imageAlignmentControl
    ) {
        sType(sType);
        pNext(pNext);
        imageAlignmentControl(imageAlignmentControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(VkPhysicalDeviceImageAlignmentControlFeaturesMESA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA malloc() {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA calloc() {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance for the specified memory address. */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA create(long address) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageAlignmentControlFeaturesMESA createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.PNEXT); }
    /** Unsafe version of {@link #imageAlignmentControl}. */
    public static int nimageAlignmentControl(long struct) { return memGetInt(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.IMAGEALIGNMENTCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.PNEXT, value); }
    /** Unsafe version of {@link #imageAlignmentControl(boolean) imageAlignmentControl}. */
    public static void nimageAlignmentControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageAlignmentControlFeaturesMESA.IMAGEALIGNMENTCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageAlignmentControlFeaturesMESA, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageAlignmentControlFeaturesMESA ELEMENT_FACTORY = VkPhysicalDeviceImageAlignmentControlFeaturesMESA.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageAlignmentControlFeaturesMESA#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageAlignmentControlFeaturesMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.npNext(address()); }
        /** @return the value of the {@code imageAlignmentControl} field. */
        @NativeType("VkBool32")
        public boolean imageAlignmentControl() { return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nimageAlignmentControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nsType(address(), value); return this; }
        /** Sets the {@link MESAImageAlignmentControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA} value to the {@code sType} field. */
        public VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer sType$Default() { return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageAlignmentControlFeaturesMESA.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageAlignmentControl} field. */
        public VkPhysicalDeviceImageAlignmentControlFeaturesMESA.Buffer imageAlignmentControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nimageAlignmentControl(address(), value ? 1 : 0); return this; }

    }

}