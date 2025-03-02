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
 * struct VkPhysicalDeviceSchedulingControlsPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPhysicalDeviceSchedulingControlsFlagsARM schedulingControlsFlags;
 * }}</pre>
 */
public class VkPhysicalDeviceSchedulingControlsPropertiesARM extends Struct<VkPhysicalDeviceSchedulingControlsPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCHEDULINGCONTROLSFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCHEDULINGCONTROLSFLAGS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSchedulingControlsPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSchedulingControlsPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSchedulingControlsPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code schedulingControlsFlags} field. */
    @NativeType("VkPhysicalDeviceSchedulingControlsFlagsARM")
    public long schedulingControlsFlags() { return nschedulingControlsFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsPropertiesARM sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSchedulingControlsPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSchedulingControlsPropertiesARM set(
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
    public VkPhysicalDeviceSchedulingControlsPropertiesARM set(VkPhysicalDeviceSchedulingControlsPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM malloc() {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM calloc() {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM create(long address) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSchedulingControlsPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSchedulingControlsPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #schedulingControlsFlags}. */
    public static long nschedulingControlsFlags(long struct) { return memGetLong(struct + VkPhysicalDeviceSchedulingControlsPropertiesARM.SCHEDULINGCONTROLSFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSchedulingControlsPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSchedulingControlsPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSchedulingControlsPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSchedulingControlsPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSchedulingControlsPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceSchedulingControlsPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSchedulingControlsPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSchedulingControlsPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.npNext(address()); }
        /** @return the value of the {@code schedulingControlsFlags} field. */
        @NativeType("VkPhysicalDeviceSchedulingControlsFlagsARM")
        public long schedulingControlsFlags() { return VkPhysicalDeviceSchedulingControlsPropertiesARM.nschedulingControlsFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSchedulingControlsPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSchedulingControlsPropertiesARM.npNext(address(), value); return this; }

    }

}