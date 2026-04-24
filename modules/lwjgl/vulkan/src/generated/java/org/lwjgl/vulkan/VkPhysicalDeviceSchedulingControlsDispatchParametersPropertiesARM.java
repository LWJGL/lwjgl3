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
 * struct VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t schedulingControlsMaxWarpsCount;
 *     uint32_t schedulingControlsMaxQueuedBatchesCount;
 *     uint32_t schedulingControlsMaxWorkGroupBatchSize;
 * }}</pre>
 */
public class VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM extends Struct<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCHEDULINGCONTROLSMAXWARPSCOUNT,
        SCHEDULINGCONTROLSMAXQUEUEDBATCHESCOUNT,
        SCHEDULINGCONTROLSMAXWORKGROUPBATCHSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCHEDULINGCONTROLSMAXWARPSCOUNT = layout.offsetof(2);
        SCHEDULINGCONTROLSMAXQUEUEDBATCHESCOUNT = layout.offsetof(3);
        SCHEDULINGCONTROLSMAXWORKGROUPBATCHSIZE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code schedulingControlsMaxWarpsCount} field. */
    @NativeType("uint32_t")
    public int schedulingControlsMaxWarpsCount() { return nschedulingControlsMaxWarpsCount(address()); }
    /** @return the value of the {@code schedulingControlsMaxQueuedBatchesCount} field. */
    @NativeType("uint32_t")
    public int schedulingControlsMaxQueuedBatchesCount() { return nschedulingControlsMaxQueuedBatchesCount(address()); }
    /** @return the value of the {@code schedulingControlsMaxWorkGroupBatchSize} field. */
    @NativeType("uint32_t")
    public int schedulingControlsMaxWorkGroupBatchSize() { return nschedulingControlsMaxWorkGroupBatchSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM set(
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
    public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM set(VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM malloc() {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM calloc() {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM create(long address) {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #schedulingControlsMaxWarpsCount}. */
    public static int nschedulingControlsMaxWarpsCount(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.SCHEDULINGCONTROLSMAXWARPSCOUNT); }
    /** Unsafe version of {@link #schedulingControlsMaxQueuedBatchesCount}. */
    public static int nschedulingControlsMaxQueuedBatchesCount(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.SCHEDULINGCONTROLSMAXQUEUEDBATCHESCOUNT); }
    /** Unsafe version of {@link #schedulingControlsMaxWorkGroupBatchSize}. */
    public static int nschedulingControlsMaxWorkGroupBatchSize(long struct) { return memGetInt(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.SCHEDULINGCONTROLSMAXWORKGROUPBATCHSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.npNext(address()); }
        /** @return the value of the {@code schedulingControlsMaxWarpsCount} field. */
        @NativeType("uint32_t")
        public int schedulingControlsMaxWarpsCount() { return VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.nschedulingControlsMaxWarpsCount(address()); }
        /** @return the value of the {@code schedulingControlsMaxQueuedBatchesCount} field. */
        @NativeType("uint32_t")
        public int schedulingControlsMaxQueuedBatchesCount() { return VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.nschedulingControlsMaxQueuedBatchesCount(address()); }
        /** @return the value of the {@code schedulingControlsMaxWorkGroupBatchSize} field. */
        @NativeType("uint32_t")
        public int schedulingControlsMaxWorkGroupBatchSize() { return VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.nschedulingControlsMaxWorkGroupBatchSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSchedulingControlsDispatchParametersPropertiesARM.npNext(address(), value); return this; }

    }

}