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
 * struct VkDeviceQueueGlobalPriorityCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueueGlobalPriority globalPriority;
 * }}</pre>
 */
public class VkDeviceQueueGlobalPriorityCreateInfo extends Struct<VkDeviceQueueGlobalPriorityCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GLOBALPRIORITY;

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
        GLOBALPRIORITY = layout.offsetof(2);
    }

    protected VkDeviceQueueGlobalPriorityCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceQueueGlobalPriorityCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDeviceQueueGlobalPriorityCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueGlobalPriorityCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code globalPriority} field. */
    @NativeType("VkQueueGlobalPriority")
    public int globalPriority() { return nglobalPriority(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceQueueGlobalPriorityCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO} value to the {@code sType} field. */
    public VkDeviceQueueGlobalPriorityCreateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceQueueGlobalPriorityCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriority} field. */
    public VkDeviceQueueGlobalPriorityCreateInfo globalPriority(@NativeType("VkQueueGlobalPriority") int value) { nglobalPriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueGlobalPriorityCreateInfo set(
        int sType,
        long pNext,
        int globalPriority
    ) {
        sType(sType);
        pNext(pNext);
        globalPriority(globalPriority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceQueueGlobalPriorityCreateInfo set(VkDeviceQueueGlobalPriorityCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfo malloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfo calloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueGlobalPriorityCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueGlobalPriorityCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance for the specified memory address. */
    public static VkDeviceQueueGlobalPriorityCreateInfo create(long address) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceQueueGlobalPriorityCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceQueueGlobalPriorityCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceQueueGlobalPriorityCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceQueueGlobalPriorityCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueGlobalPriorityCreateInfo.PNEXT); }
    /** Unsafe version of {@link #globalPriority}. */
    public static int nglobalPriority(long struct) { return memGetInt(struct + VkDeviceQueueGlobalPriorityCreateInfo.GLOBALPRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceQueueGlobalPriorityCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueGlobalPriorityCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #globalPriority(int) globalPriority}. */
    public static void nglobalPriority(long struct, int value) { memPutInt(struct + VkDeviceQueueGlobalPriorityCreateInfo.GLOBALPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueGlobalPriorityCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueGlobalPriorityCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceQueueGlobalPriorityCreateInfo ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueGlobalPriorityCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueGlobalPriorityCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceQueueGlobalPriorityCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueGlobalPriorityCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueGlobalPriorityCreateInfo.npNext(address()); }
        /** @return the value of the {@code globalPriority} field. */
        @NativeType("VkQueueGlobalPriority")
        public int globalPriority() { return VkDeviceQueueGlobalPriorityCreateInfo.nglobalPriority(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceQueueGlobalPriorityCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO} value to the {@code sType} field. */
        public VkDeviceQueueGlobalPriorityCreateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceQueueGlobalPriorityCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueGlobalPriorityCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriority} field. */
        public VkDeviceQueueGlobalPriorityCreateInfo.Buffer globalPriority(@NativeType("VkQueueGlobalPriority") int value) { VkDeviceQueueGlobalPriorityCreateInfo.nglobalPriority(address(), value); return this; }

    }

}