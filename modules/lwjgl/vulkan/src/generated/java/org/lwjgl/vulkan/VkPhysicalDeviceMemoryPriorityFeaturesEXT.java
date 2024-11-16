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
 * Structure describing memory priority features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryPriorityFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #memoryPriority};
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryPriorityFeaturesEXT extends Struct<VkPhysicalDeviceMemoryPriorityFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYPRIORITY;

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
        MEMORYPRIORITY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMemoryPriorityFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMemoryPriorityFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports memory priorities specified at memory allocation time via {@link VkMemoryPriorityAllocateInfoEXT}. */
    @NativeType("VkBool32")
    public boolean memoryPriority() { return nmemoryPriority(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType$Default() { return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryPriority} field. */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriority(@NativeType("VkBool32") boolean value) { nmemoryPriority(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT set(
        int sType,
        long pNext,
        boolean memoryPriority
    ) {
        sType(sType);
        pNext(pNext);
        memoryPriority(memoryPriority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT set(VkPhysicalDeviceMemoryPriorityFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT malloc() {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT calloc() {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMemoryPriorityFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #memoryPriority}. */
    public static int nmemoryPriority(long struct) { return memGetInt(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.MEMORYPRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #memoryPriority(boolean) memoryPriority}. */
    public static void nmemoryPriority(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMemoryPriorityFeaturesEXT.MEMORYPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryPriorityFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryPriorityFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMemoryPriorityFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMemoryPriorityFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryPriorityFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryPriorityFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#memoryPriority} field. */
        @NativeType("VkBool32")
        public boolean memoryPriority() { return VkPhysicalDeviceMemoryPriorityFeaturesEXT.nmemoryPriority(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryPriorityFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMemoryPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT} value to the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer sType$Default() { return sType(EXTMemoryPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryPriorityFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryPriorityFeaturesEXT#memoryPriority} field. */
        public VkPhysicalDeviceMemoryPriorityFeaturesEXT.Buffer memoryPriority(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMemoryPriorityFeaturesEXT.nmemoryPriority(address(), value ? 1 : 0); return this; }

    }

}