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
 * struct VkPhysicalDeviceMapMemoryPlacedFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 memoryMapPlaced;
 *     VkBool32 memoryMapRangePlaced;
 *     VkBool32 memoryUnmapReserve;
 * }}</pre>
 */
public class VkPhysicalDeviceMapMemoryPlacedFeaturesEXT extends Struct<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYMAPPLACED,
        MEMORYMAPRANGEPLACED,
        MEMORYUNMAPRESERVE;

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
        MEMORYMAPPLACED = layout.offsetof(2);
        MEMORYMAPRANGEPLACED = layout.offsetof(3);
        MEMORYUNMAPRESERVE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code memoryMapPlaced} field. */
    @NativeType("VkBool32")
    public boolean memoryMapPlaced() { return nmemoryMapPlaced(address()) != 0; }
    /** @return the value of the {@code memoryMapRangePlaced} field. */
    @NativeType("VkBool32")
    public boolean memoryMapRangePlaced() { return nmemoryMapRangePlaced(address()) != 0; }
    /** @return the value of the {@code memoryUnmapReserve} field. */
    @NativeType("VkBool32")
    public boolean memoryUnmapReserve() { return nmemoryUnmapReserve(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memoryMapPlaced} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapPlaced(@NativeType("VkBool32") boolean value) { nmemoryMapPlaced(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code memoryMapRangePlaced} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryMapRangePlaced(@NativeType("VkBool32") boolean value) { nmemoryMapRangePlaced(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code memoryUnmapReserve} field. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT memoryUnmapReserve(@NativeType("VkBool32") boolean value) { nmemoryUnmapReserve(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(
        int sType,
        long pNext,
        boolean memoryMapPlaced,
        boolean memoryMapRangePlaced,
        boolean memoryUnmapReserve
    ) {
        sType(sType);
        pNext(pNext);
        memoryMapPlaced(memoryMapPlaced);
        memoryMapRangePlaced(memoryMapRangePlaced);
        memoryUnmapReserve(memoryUnmapReserve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT set(VkPhysicalDeviceMapMemoryPlacedFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT malloc() {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT calloc() {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMapMemoryPlacedFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMapMemoryPlacedFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #memoryMapPlaced}. */
    public static int nmemoryMapPlaced(long struct) { return memGetInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYMAPPLACED); }
    /** Unsafe version of {@link #memoryMapRangePlaced}. */
    public static int nmemoryMapRangePlaced(long struct) { return memGetInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYMAPRANGEPLACED); }
    /** Unsafe version of {@link #memoryUnmapReserve}. */
    public static int nmemoryUnmapReserve(long struct) { return memGetInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYUNMAPRESERVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #memoryMapPlaced(boolean) memoryMapPlaced}. */
    public static void nmemoryMapPlaced(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYMAPPLACED, value); }
    /** Unsafe version of {@link #memoryMapRangePlaced(boolean) memoryMapRangePlaced}. */
    public static void nmemoryMapRangePlaced(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYMAPRANGEPLACED, value); }
    /** Unsafe version of {@link #memoryUnmapReserve(boolean) memoryUnmapReserve}. */
    public static void nmemoryUnmapReserve(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.MEMORYUNMAPRESERVE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMapMemoryPlacedFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMapMemoryPlacedFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMapMemoryPlacedFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMapMemoryPlacedFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code memoryMapPlaced} field. */
        @NativeType("VkBool32")
        public boolean memoryMapPlaced() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapPlaced(address()) != 0; }
        /** @return the value of the {@code memoryMapRangePlaced} field. */
        @NativeType("VkBool32")
        public boolean memoryMapRangePlaced() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapRangePlaced(address()) != 0; }
        /** @return the value of the {@code memoryUnmapReserve} field. */
        @NativeType("VkBool32")
        public boolean memoryUnmapReserve() { return VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryUnmapReserve(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMapMemoryPlaced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer sType$Default() { return sType(EXTMapMemoryPlaced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAP_MEMORY_PLACED_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memoryMapPlaced} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer memoryMapPlaced(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapPlaced(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code memoryMapRangePlaced} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer memoryMapRangePlaced(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryMapRangePlaced(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code memoryUnmapReserve} field. */
        public VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.Buffer memoryUnmapReserve(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMapMemoryPlacedFeaturesEXT.nmemoryUnmapReserve(address(), value ? 1 : 0); return this; }

    }

}