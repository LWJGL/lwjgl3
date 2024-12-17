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
 * struct VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pageableDeviceLocalMemory;
 * }}</pre>
 */
public class VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT extends Struct<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT> implements NativeResource {

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

    protected VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code pageableDeviceLocalMemory} field. */
    @NativeType("VkBool32")
    public boolean pageableDeviceLocalMemory() { return npageableDeviceLocalMemory(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPageableDeviceLocalMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT sType$Default() { return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pageableDeviceLocalMemory} field. */
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
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc() {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT create(long address) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pageableDeviceLocalMemory}. */
    public static int npageableDeviceLocalMemory(long struct) { return memGetInt(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PAGEABLEDEVICELOCALMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pageableDeviceLocalMemory(boolean) pageableDeviceLocalMemory}. */
    public static void npageableDeviceLocalMemory(long struct, int value) { memPutInt(struct + VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.PAGEABLEDEVICELOCALMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code pageableDeviceLocalMemory} field. */
        @NativeType("VkBool32")
        public boolean pageableDeviceLocalMemory() { return VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPageableDeviceLocalMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer sType$Default() { return sType(EXTPageableDeviceLocalMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PAGEABLE_DEVICE_LOCAL_MEMORY_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pageableDeviceLocalMemory} field. */
        public VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.Buffer pageableDeviceLocalMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT.npageableDeviceLocalMemory(address(), value ? 1 : 0); return this; }

    }

}