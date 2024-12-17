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
 * struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentDensityMap;
 *     VkBool32 fragmentDensityMapDynamic;
 *     VkBool32 fragmentDensityMapNonSubsampledImages;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends Struct<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAP,
        FRAGMENTDENSITYMAPDYNAMIC,
        FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES;

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
        FRAGMENTDENSITYMAP = layout.offsetof(2);
        FRAGMENTDENSITYMAPDYNAMIC = layout.offsetof(3);
        FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentDensityMapFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMapFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentDensityMap} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMap() { return nfragmentDensityMap(address()) != 0; }
    /** @return the value of the {@code fragmentDensityMapDynamic} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapDynamic() { return nfragmentDensityMapDynamic(address()) != 0; }
    /** @return the value of the {@code fragmentDensityMapNonSubsampledImages} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapNonSubsampledImages() { return nfragmentDensityMapNonSubsampledImages(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentDensityMap} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(@NativeType("VkBool32") boolean value) { nfragmentDensityMap(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapDynamic} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(@NativeType("VkBool32") boolean value) { nfragmentDensityMapDynamic(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapNonSubsampledImages} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(@NativeType("VkBool32") boolean value) { nfragmentDensityMapNonSubsampledImages(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT set(
        int sType,
        long pNext,
        boolean fragmentDensityMap,
        boolean fragmentDensityMapDynamic,
        boolean fragmentDensityMapNonSubsampledImages
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMap(fragmentDensityMap);
        fragmentDensityMapDynamic(fragmentDensityMapDynamic);
        fragmentDensityMapNonSubsampledImages(fragmentDensityMapNonSubsampledImages);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT set(VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMapFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMap}. */
    public static int nfragmentDensityMap(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAP); }
    /** Unsafe version of {@link #fragmentDensityMapDynamic}. */
    public static int nfragmentDensityMapDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPDYNAMIC); }
    /** Unsafe version of {@link #fragmentDensityMapNonSubsampledImages}. */
    public static int nfragmentDensityMapNonSubsampledImages(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMap(boolean) fragmentDensityMap}. */
    public static void nfragmentDensityMap(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAP, value); }
    /** Unsafe version of {@link #fragmentDensityMapDynamic(boolean) fragmentDensityMapDynamic}. */
    public static void nfragmentDensityMapDynamic(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPDYNAMIC, value); }
    /** Unsafe version of {@link #fragmentDensityMapNonSubsampledImages(boolean) fragmentDensityMapNonSubsampledImages}. */
    public static void nfragmentDensityMapNonSubsampledImages(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentDensityMapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code fragmentDensityMap} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMap() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMap(address()) != 0; }
        /** @return the value of the {@code fragmentDensityMapDynamic} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapDynamic() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapDynamic(address()) != 0; }
        /** @return the value of the {@code fragmentDensityMapNonSubsampledImages} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapNonSubsampledImages() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapNonSubsampledImages(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentDensityMap} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMap(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapDynamic} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMapDynamic(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapDynamic(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapNonSubsampledImages} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMapNonSubsampledImages(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapNonSubsampledImages(address(), value ? 1 : 0); return this; }

    }

}