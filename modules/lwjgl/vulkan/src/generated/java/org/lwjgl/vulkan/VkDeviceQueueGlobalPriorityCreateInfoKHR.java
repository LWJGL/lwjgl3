/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specify a system wide priority.
 * 
 * <h5>Description</h5>
 * 
 * <p>A queue created without specifying {@link VkDeviceQueueGlobalPriorityCreateInfoKHR} will default to {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR}</li>
 * <li>{@code globalPriority} <b>must</b> be a valid {@code VkQueueGlobalPriorityKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceQueueGlobalPriorityCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkQueueGlobalPriorityKHR {@link #globalPriority};
 * }</code></pre>
 */
public class VkDeviceQueueGlobalPriorityCreateInfoKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the system-wide priority associated to this queue as specified by {@code VkQueueGlobalPriorityEXT} */
    @NativeType("VkQueueGlobalPriorityKHR")
    public int globalPriority() { return nglobalPriority(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #globalPriority} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR globalPriority(@NativeType("VkQueueGlobalPriorityKHR") int value) { nglobalPriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueGlobalPriorityCreateInfoKHR set(
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
    public VkDeviceQueueGlobalPriorityCreateInfoKHR set(VkDeviceQueueGlobalPriorityCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR malloc() {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR calloc() {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance for the specified memory address. */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR create(long address) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #globalPriority}. */
    public static int nglobalPriority(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.GLOBALPRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #globalPriority(int) globalPriority}. */
    public static void nglobalPriority(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoKHR.GLOBALPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueGlobalPriorityCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueGlobalPriorityCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceQueueGlobalPriorityCreateInfoKHR ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceQueueGlobalPriorityCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueGlobalPriorityCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueGlobalPriorityCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#globalPriority} field. */
        @NativeType("VkQueueGlobalPriorityKHR")
        public int globalPriority() { return VkDeviceQueueGlobalPriorityCreateInfoKHR.nglobalPriority(address()); }

        /** Sets the specified value to the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#sType} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR} value to the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#sType} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#pNext} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueGlobalPriorityCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceQueueGlobalPriorityCreateInfoKHR#globalPriority} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer globalPriority(@NativeType("VkQueueGlobalPriorityKHR") int value) { VkDeviceQueueGlobalPriorityCreateInfoKHR.nglobalPriority(address(), value); return this; }

    }

}