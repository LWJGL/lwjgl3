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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.KHRGlobalPriority.*;

/**
 * Return structure for queue family global priority information query.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkQueueFamilyGlobalPriorityPropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkQueueFamilyProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}, it is filled in with the list of supported global queue priorities for the indicated family.</p>
 * 
 * <p>The valid elements of {@code priorities} <b>must</b> not contain any duplicate values.</p>
 * 
 * <p>The valid elements of {@code priorities} <b>must</b> be a continuous sequence of {@code VkQueueGlobalPriorityKHR} enums in the ascending order.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For example, returning {@code priorityCount} as 3 with supported {@code priorities} as {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR QUEUE_GLOBAL_PRIORITY_LOW_KHR}, {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR} and {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR QUEUE_GLOBAL_PRIORITY_REALTIME_KHR} is not allowed.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyGlobalPriorityPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #priorityCount};
 *     VkQueueGlobalPriorityKHR {@link #priorities}[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR];
 * }</code></pre>
 */
public class VkQueueFamilyGlobalPriorityPropertiesKHR extends Struct<VkQueueFamilyGlobalPriorityPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIORITYCOUNT,
        PRIORITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(4, VK_MAX_GLOBAL_PRIORITY_SIZE_KHR)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIORITYCOUNT = layout.offsetof(2);
        PRIORITIES = layout.offsetof(3);
    }

    protected VkQueueFamilyGlobalPriorityPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyGlobalPriorityPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyGlobalPriorityPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of supported global queue priorities in this queue family, and it <b>must</b> be greater than 0. */
    @NativeType("uint32_t")
    public int priorityCount() { return npriorityCount(address()); }
    /** an array of {@link KHRGlobalPriority#VK_MAX_GLOBAL_PRIORITY_SIZE_KHR MAX_GLOBAL_PRIORITY_SIZE_KHR} {@code VkQueueGlobalPriorityKHR} enums representing all supported global queue priorities in this queue family. The first {@code priorityCount} elements of the array will be valid. */
    @NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]")
    public IntBuffer priorities() { return npriorities(address()); }
    /** an array of {@link KHRGlobalPriority#VK_MAX_GLOBAL_PRIORITY_SIZE_KHR MAX_GLOBAL_PRIORITY_SIZE_KHR} {@code VkQueueGlobalPriorityKHR} enums representing all supported global queue priorities in this queue family. The first {@code priorityCount} elements of the array will be valid. */
    @NativeType("VkQueueGlobalPriorityKHR")
    public int priorities(int index) { return npriorities(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyGlobalPriorityPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkQueueFamilyGlobalPriorityPropertiesKHR sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyGlobalPriorityPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyGlobalPriorityPropertiesKHR set(
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
    public VkQueueFamilyGlobalPriorityPropertiesKHR set(VkQueueFamilyGlobalPriorityPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR malloc() {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR calloc() {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance for the specified memory address. */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR create(long address) {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyGlobalPriorityPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyGlobalPriorityPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR malloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR calloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #priorityCount}. */
    public static int npriorityCount(long struct) { return memGetInt(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.PRIORITYCOUNT); }
    /** Unsafe version of {@link #priorities}. */
    public static IntBuffer npriorities(long struct) { return memIntBuffer(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.PRIORITIES, npriorityCount(struct)); }
    /** Unsafe version of {@link #priorities(int) priorities}. */
    public static int npriorities(long struct, int index) {
        return memGetInt(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.PRIORITIES + check(index, VK_MAX_GLOBAL_PRIORITY_SIZE_KHR) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyGlobalPriorityPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyGlobalPriorityPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyGlobalPriorityPropertiesKHR, Buffer> implements NativeResource {

        private static final VkQueueFamilyGlobalPriorityPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyGlobalPriorityPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyGlobalPriorityPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyGlobalPriorityPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyGlobalPriorityPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyGlobalPriorityPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#priorityCount} field. */
        @NativeType("uint32_t")
        public int priorityCount() { return VkQueueFamilyGlobalPriorityPropertiesKHR.npriorityCount(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#priorities} field. */
        @NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]")
        public IntBuffer priorities() { return VkQueueFamilyGlobalPriorityPropertiesKHR.npriorities(address()); }
        /** @return the value at the specified index of the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#priorities} field. */
        @NativeType("VkQueueGlobalPriorityKHR")
        public int priorities(int index) { return VkQueueFamilyGlobalPriorityPropertiesKHR.npriorities(address(), index); }

        /** Sets the specified value to the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#sType} field. */
        public VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR} value to the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#sType} field. */
        public VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkQueueFamilyGlobalPriorityPropertiesKHR#pNext} field. */
        public VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyGlobalPriorityPropertiesKHR.npNext(address(), value); return this; }

    }

}