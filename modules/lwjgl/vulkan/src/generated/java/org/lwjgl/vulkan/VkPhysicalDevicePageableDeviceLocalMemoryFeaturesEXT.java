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
 * Structure describing whether the implementation supports pageable device-local memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPageableDeviceLocalMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pageableDeviceLocalMemory};
 * }</code></pre>
 */
public class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PAGEABLEDEVICELOCALMEMORY;

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
        PAGEABLEDEVICELOCALMEMORY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports pageable device-local memory and <b>may</b> transparently move device-local memory allocations to host-local memory to better share device-local memory with other applications. */
    @NativeType("VkBool32")
    public boolean pageableDeviceLocalMemory() { return npageableDeviceLocalMemory(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPageableDeviceLocalMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType$Default() { return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pageableDeviceLocalMemory} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pageableDeviceLocalMemory(@NativeType("VkBool32") boolean value) { npageableDeviceLocalMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(
        int sType,
        long pNext,
        boolean pageableDeviceLocalMemory
    ) {
        sType(sType);
        pNext(pNext);
        pageableDeviceLocalMemory(pageableDeviceLocalMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT set(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT malloc() {
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc() {
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(long address) {
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pageableDeviceLocalMemory}. */
    public static int npageableDeviceLocalMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PAGEABLEDEVICELOCALMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pageableDeviceLocalMemory(boolean) pageableDeviceLocalMemory}. */
    public static void npageableDeviceLocalMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PAGEABLEDEVICELOCALMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#pageableDeviceLocalMemory} field. */
        @NativeType("VkBool32")
        public boolean pageableDeviceLocalMemory() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#sType} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPageableDeviceLocalMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT} value to the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#sType} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer sType$Default() { return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#pNext} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#pageableDeviceLocalMemory} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer pageableDeviceLocalMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address(), value ? 1 : 0); return this; }

    }

}