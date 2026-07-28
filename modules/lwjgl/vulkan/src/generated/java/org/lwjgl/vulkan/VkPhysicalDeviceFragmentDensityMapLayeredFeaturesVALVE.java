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
 * struct VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 fragmentDensityMapLayered;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE extends Struct<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAPLAYERED;

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
        FRAGMENTDENSITYMAPLAYERED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentDensityMapLayered} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapLayered() { return nfragmentDensityMapLayered(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEFragmentDensityMapLayered#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType$Default() { return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapLayered} field. */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayered(@NativeType("VkBool32") boolean value) { nfragmentDensityMapLayered(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE set(
        int sType,
        long pNext,
        boolean fragmentDensityMapLayered
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapLayered(fragmentDensityMapLayered);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE set(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE malloc() {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE calloc() {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMapLayered}. */
    public static int nfragmentDensityMapLayered(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.FRAGMENTDENSITYMAPLAYERED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMapLayered(boolean) fragmentDensityMapLayered}. */
    public static void nfragmentDensityMapLayered(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.FRAGMENTDENSITYMAPLAYERED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.npNext(address()); }
        /** @return the value of the {@code fragmentDensityMapLayered} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapLayered() { return VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nfragmentDensityMapLayered(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEFragmentDensityMapLayered#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer sType$Default() { return sType(VALVEFragmentDensityMapLayered.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapLayered} field. */
        public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.Buffer fragmentDensityMapLayered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE.nfragmentDensityMapLayered(address(), value ? 1 : 0); return this; }

    }

}