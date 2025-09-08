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
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkExtent2D VkExtent2D} minFragmentDensityTexelSize;
 *     {@link VkExtent2D VkExtent2D} maxFragmentDensityTexelSize;
 *     VkBool32 fragmentDensityInvocations;
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends Struct<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINFRAGMENTDENSITYTEXELSIZE,
        MAXFRAGMENTDENSITYTEXELSIZE,
        FRAGMENTDENSITYINVOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINFRAGMENTDENSITYTEXELSIZE = layout.offsetof(2);
        MAXFRAGMENTDENSITYTEXELSIZE = layout.offsetof(3);
        FRAGMENTDENSITYINVOCATIONS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentDensityMapPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMapPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(ByteBuffer container) {
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
    /** @return a {@link VkExtent2D} view of the {@code minFragmentDensityTexelSize} field. */
    public VkExtent2D minFragmentDensityTexelSize() { return nminFragmentDensityTexelSize(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxFragmentDensityTexelSize} field. */
    public VkExtent2D maxFragmentDensityTexelSize() { return nmaxFragmentDensityTexelSize(address()); }
    /** @return the value of the {@code fragmentDensityInvocations} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityInvocations() { return nfragmentDensityInvocations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(
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
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT set(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMapPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #minFragmentDensityTexelSize}. */
    public static VkExtent2D nminFragmentDensityTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.MINFRAGMENTDENSITYTEXELSIZE); }
    /** Unsafe version of {@link #maxFragmentDensityTexelSize}. */
    public static VkExtent2D nmaxFragmentDensityTexelSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.MAXFRAGMENTDENSITYTEXELSIZE); }
    /** Unsafe version of {@link #fragmentDensityInvocations}. */
    public static int nfragmentDensityInvocations(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.FRAGMENTDENSITYINVOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentDensityMapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@code minFragmentDensityTexelSize} field. */
        public VkExtent2D minFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nminFragmentDensityTexelSize(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxFragmentDensityTexelSize} field. */
        public VkExtent2D maxFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nmaxFragmentDensityTexelSize(address()); }
        /** @return the value of the {@code fragmentDensityInvocations} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityInvocations() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nfragmentDensityInvocations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.npNext(address(), value); return this; }

    }

}