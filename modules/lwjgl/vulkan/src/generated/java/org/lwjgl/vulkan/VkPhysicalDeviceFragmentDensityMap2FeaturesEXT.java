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
 * Structure describing additional fragment density map features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMap2FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentDensityMapDeferred};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMap2FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAPDEFERRED;

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
        FRAGMENTDENSITYMAPDEFERRED = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(ByteBuffer container) {
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
    /** specifies whether the implementation supports deferred reads of fragment density map image views. If this feature is not enabled, {@link EXTFragmentDensityMap2#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT} <b>must</b> not be included in {@link VkImageViewCreateInfo}{@code ::flags}. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapDeferred() { return nfragmentDensityMapDeferred(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentDensityMapDeferred} field. */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT fragmentDensityMapDeferred(@NativeType("VkBool32") boolean value) { nfragmentDensityMapDeferred(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT set(
        int sType,
        long pNext,
        boolean fragmentDensityMapDeferred
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapDeferred(fragmentDensityMapDeferred);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT set(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMapDeferred}. */
    public static int nfragmentDensityMapDeferred(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.FRAGMENTDENSITYMAPDEFERRED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMapDeferred(boolean) fragmentDensityMapDeferred}. */
    public static void nfragmentDensityMapDeferred(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.FRAGMENTDENSITYMAPDEFERRED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMap2FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMap2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMap2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#fragmentDensityMapDeferred} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapDeferred() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.nfragmentDensityMapDeferred(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT} value to the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMap2FeaturesEXT#fragmentDensityMapDeferred} field. */
        public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer fragmentDensityMapDeferred(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.nfragmentDensityMapDeferred(address(), value ? 1 : 0); return this; }

    }

}