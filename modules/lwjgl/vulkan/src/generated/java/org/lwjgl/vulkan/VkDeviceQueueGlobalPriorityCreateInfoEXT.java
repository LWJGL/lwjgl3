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
 * <p>A queue created without specifying {@link VkDeviceQueueGlobalPriorityCreateInfoEXT} will default to {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT}</li>
 * <li>{@code globalPriority} <b>must</b> be a valid {@code VkQueueGlobalPriorityEXT} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code globalPriority} &ndash; the system-wide priority associated to this queue as specified by {@code VkQueueGlobalPriorityEXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceQueueGlobalPriorityCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueueGlobalPriorityEXT globalPriority;
 * }</code></pre>
 */
public class VkDeviceQueueGlobalPriorityCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code globalPriority} field. */
    @NativeType("VkQueueGlobalPriorityEXT")
    public int globalPriority() { return nglobalPriority(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriority} field. */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT globalPriority(@NativeType("VkQueueGlobalPriorityEXT") int value) { nglobalPriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT set(
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
    public VkDeviceQueueGlobalPriorityCreateInfoEXT set(VkDeviceQueueGlobalPriorityCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT malloc() {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT calloc() {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance for the specified memory address. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT create(long address) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkDeviceQueueGlobalPriorityCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #globalPriority}. */
    public static int nglobalPriority(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.GLOBALPRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #globalPriority(int) globalPriority}. */
    public static void nglobalPriority(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueGlobalPriorityCreateInfoEXT.GLOBALPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueGlobalPriorityCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueGlobalPriorityCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceQueueGlobalPriorityCreateInfoEXT ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueGlobalPriorityCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceQueueGlobalPriorityCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueGlobalPriorityCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueGlobalPriorityCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code globalPriority} field. */
        @NativeType("VkQueueGlobalPriorityEXT")
        public int globalPriority() { return VkDeviceQueueGlobalPriorityCreateInfoEXT.nglobalPriority(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriority} field. */
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer globalPriority(@NativeType("VkQueueGlobalPriorityEXT") int value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.nglobalPriority(address(), value); return this; }

    }

}