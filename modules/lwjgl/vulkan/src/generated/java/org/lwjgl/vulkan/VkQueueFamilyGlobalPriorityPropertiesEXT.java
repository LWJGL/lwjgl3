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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.EXTGlobalPriorityQuery.*;

/**
 * Return structure for queue family global priority information query.
 * 
 * <h5>Description</h5>
 * 
 * <p>The valid elements of {@code priorities} <b>must</b> not contain any duplicate values.</p>
 * 
 * <p>The valid elements of {@code priorities} <b>must</b> be a continuous sequence of {@code VkQueueGlobalPriorityEXT} enums in the ascending order.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For example, returning {@code priorityCount} as 3 with supported {@code priorities} as {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT QUEUE_GLOBAL_PRIORITY_LOW_EXT}, {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT} and {@link EXTGlobalPriority#VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT QUEUE_GLOBAL_PRIORITY_REALTIME_EXT} is not allowed.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT}</li>
 * <li>Any given element of {@code priorities} <b>must</b> be a valid {@code VkQueueGlobalPriorityEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyGlobalPriorityPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #priorityCount};
 *     VkQueueGlobalPriorityEXT {@link #priorities}[VK_MAX_GLOBAL_PRIORITY_SIZE_EXT];
 * }</code></pre>
 */
public class VkQueueFamilyGlobalPriorityPropertiesEXT extends Struct implements NativeResource {

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
            __array(4, VK_MAX_GLOBAL_PRIORITY_SIZE_EXT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIORITYCOUNT = layout.offsetof(2);
        PRIORITIES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyGlobalPriorityPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of supported global queue priorities in this queue family, and it <b>must</b> be greater than 0. */
    @NativeType("uint32_t")
    public int priorityCount() { return npriorityCount(address()); }
    /** an array of {@link EXTGlobalPriorityQuery#VK_MAX_GLOBAL_PRIORITY_SIZE_EXT MAX_GLOBAL_PRIORITY_SIZE_EXT} {@code VkQueueGlobalPriorityEXT} enums representing all supported global queue priorities in this queue family. The first {@code priorityCount} elements of the array will be valid. */
    @NativeType("VkQueueGlobalPriorityEXT[VK_MAX_GLOBAL_PRIORITY_SIZE_EXT]")
    public IntBuffer priorities() { return npriorities(address()); }
    /** an array of {@link EXTGlobalPriorityQuery#VK_MAX_GLOBAL_PRIORITY_SIZE_EXT MAX_GLOBAL_PRIORITY_SIZE_EXT} {@code VkQueueGlobalPriorityEXT} enums representing all supported global queue priorities in this queue family. The first {@code priorityCount} elements of the array will be valid. */
    @NativeType("VkQueueGlobalPriorityEXT")
    public int priorities(int index) { return npriorities(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT sType$Default() { return sType(EXTGlobalPriorityQuery.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #priorityCount} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorityCount(@NativeType("uint32_t") int value) { npriorityCount(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@link #priorities} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorities(@NativeType("VkQueueGlobalPriorityEXT[VK_MAX_GLOBAL_PRIORITY_SIZE_EXT]") IntBuffer value) { npriorities(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #priorities} field. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorities(int index, @NativeType("VkQueueGlobalPriorityEXT") int value) { npriorities(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyGlobalPriorityPropertiesEXT set(
        int sType,
        long pNext,
        int priorityCount,
        IntBuffer priorities
    ) {
        sType(sType);
        pNext(pNext);
        priorityCount(priorityCount);
        priorities(priorities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyGlobalPriorityPropertiesEXT set(VkQueueFamilyGlobalPriorityPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT malloc() {
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT calloc() {
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance for the specified memory address. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT create(long address) {
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyGlobalPriorityPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkQueueFamilyGlobalPriorityPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #priorityCount}. */
    public static int npriorityCount(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITYCOUNT); }
    /** Unsafe version of {@link #priorities}. */
    public static IntBuffer npriorities(long struct) { return memIntBuffer(struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITIES, VK_MAX_GLOBAL_PRIORITY_SIZE_EXT); }
    /** Unsafe version of {@link #priorities(int) priorities}. */
    public static int npriorities(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITIES + check(index, VK_MAX_GLOBAL_PRIORITY_SIZE_EXT) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #priorityCount(int) priorityCount}. */
    public static void npriorityCount(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITYCOUNT, value); }
    /** Unsafe version of {@link #priorities(IntBuffer) priorities}. */
    public static void npriorities(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_GLOBAL_PRIORITY_SIZE_EXT); }
        memCopy(memAddress(value), struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITIES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #priorities(int, int) priorities}. */
    public static void npriorities(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + VkQueueFamilyGlobalPriorityPropertiesEXT.PRIORITIES + check(index, VK_MAX_GLOBAL_PRIORITY_SIZE_EXT) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyGlobalPriorityPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyGlobalPriorityPropertiesEXT, Buffer> implements NativeResource {

        private static final VkQueueFamilyGlobalPriorityPropertiesEXT ELEMENT_FACTORY = VkQueueFamilyGlobalPriorityPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyGlobalPriorityPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyGlobalPriorityPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyGlobalPriorityPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyGlobalPriorityPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorityCount} field. */
        @NativeType("uint32_t")
        public int priorityCount() { return VkQueueFamilyGlobalPriorityPropertiesEXT.npriorityCount(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorities} field. */
        @NativeType("VkQueueGlobalPriorityEXT[VK_MAX_GLOBAL_PRIORITY_SIZE_EXT]")
        public IntBuffer priorities() { return VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address()); }
        /** @return the value at the specified index of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorities} field. */
        @NativeType("VkQueueGlobalPriorityEXT")
        public int priorities(int index) { return VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address(), index); }

        /** Sets the specified value to the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#sType} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGlobalPriorityQuery#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT} value to the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#sType} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType$Default() { return sType(EXTGlobalPriorityQuery.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#pNext} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorityCount} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorityCount(@NativeType("uint32_t") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorityCount(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorities} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(@NativeType("VkQueueGlobalPriorityEXT[VK_MAX_GLOBAL_PRIORITY_SIZE_EXT]") IntBuffer value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkQueueFamilyGlobalPriorityPropertiesEXT#priorities} field. */
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(int index, @NativeType("VkQueueGlobalPriorityEXT") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address(), index, value); return this; }

    }

}