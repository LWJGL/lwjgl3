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
 * struct VkPhysicalDeviceSchedulingControlsFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 schedulingControls;
 * }}</pre>
 */
public class VkPhysicalDeviceSchedulingControlsFeaturesARM extends Struct<VkPhysicalDeviceSchedulingControlsFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCHEDULINGCONTROLS;

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
        SCHEDULINGCONTROLS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSchedulingControlsFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSchedulingControlsFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code schedulingControls} field. */
    @NativeType("VkBool32")
    public boolean schedulingControls() { return nschedulingControls(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code schedulingControls} field. */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControls(@NativeType("VkBool32") boolean value) { nschedulingControls(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(
        int sType,
        long pNext,
        boolean schedulingControls
    ) {
        sType(sType);
        pNext(pNext);
        schedulingControls(schedulingControls);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(VkPhysicalDeviceSchedulingControlsFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM malloc() {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM calloc() {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM create(long address) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSchedulingControlsFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #schedulingControls}. */
    public static int nschedulingControls(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.SCHEDULINGCONTROLS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #schedulingControls(boolean) schedulingControls}. */
    public static void nschedulingControls(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSchedulingControlsFeaturesARM.SCHEDULINGCONTROLS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSchedulingControlsFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSchedulingControlsFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSchedulingControlsFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceSchedulingControlsFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSchedulingControlsFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSchedulingControlsFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSchedulingControlsFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSchedulingControlsFeaturesARM.npNext(address()); }
        /** @return the value of the {@code schedulingControls} field. */
        @NativeType("VkBool32")
        public boolean schedulingControls() { return VkPhysicalDeviceSchedulingControlsFeaturesARM.nschedulingControls(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSchedulingControlsFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code schedulingControls} field. */
        public VkPhysicalDeviceSchedulingControlsFeaturesARM.Buffer schedulingControls(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSchedulingControlsFeaturesARM.nschedulingControls(address(), value ? 1 : 0); return this; }

    }

}