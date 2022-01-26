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
 * Structure describing fragment density map features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentDensityMap};
 *     VkBool32 {@link #fragmentDensityMapDynamic};
 *     VkBool32 {@link #fragmentDensityMapNonSubsampledImages};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether the implementation supports render passes with a fragment density map attachment. If this feature is not enabled and the {@code pNext} chain of {@link VkRenderPassCreateInfo} includes a {@link VkRenderPassFragmentDensityMapCreateInfoEXT} structure, {@code fragmentDensityMapAttachment} <b>must</b> be {@link VK10#VK_ATTACHMENT_UNUSED ATTACHMENT_UNUSED}. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMap() { return nfragmentDensityMap(address()) != 0; }
    /** specifies whether the implementation supports dynamic fragment density map image views. If this feature is not enabled, {@link EXTFragmentDensityMap#VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT} <b>must</b> not be included in {@link VkImageViewCreateInfo}{@code ::flags}. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapDynamic() { return nfragmentDensityMapDynamic(address()) != 0; }
    /** specifies whether the implementation supports regular non-subsampled image attachments with fragment density map render passes. If this feature is not enabled, render passes with a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> <b>must</b> only have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-subsamplesampler">subsampled attachments</a> bound. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapNonSubsampledImages() { return nfragmentDensityMapNonSubsampledImages(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentDensityMap} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(@NativeType("VkBool32") boolean value) { nfragmentDensityMap(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fragmentDensityMapDynamic} field. */
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(@NativeType("VkBool32") boolean value) { nfragmentDensityMapDynamic(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fragmentDensityMapNonSubsampledImages} field. */
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
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMap}. */
    public static int nfragmentDensityMap(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAP); }
    /** Unsafe version of {@link #fragmentDensityMapDynamic}. */
    public static int nfragmentDensityMapDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPDYNAMIC); }
    /** Unsafe version of {@link #fragmentDensityMapNonSubsampledImages}. */
    public static int nfragmentDensityMapNonSubsampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMap(boolean) fragmentDensityMap}. */
    public static void nfragmentDensityMap(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAP, value); }
    /** Unsafe version of {@link #fragmentDensityMapDynamic(boolean) fragmentDensityMapDynamic}. */
    public static void nfragmentDensityMapDynamic(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPDYNAMIC, value); }
    /** Unsafe version of {@link #fragmentDensityMapNonSubsampledImages(boolean) fragmentDensityMapNonSubsampledImages}. */
    public static void nfragmentDensityMapNonSubsampledImages(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapFeaturesEXT.FRAGMENTDENSITYMAPNONSUBSAMPLEDIMAGES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMap} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMap() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMap(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMapDynamic} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapDynamic() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapDynamic(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMapNonSubsampledImages} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapNonSubsampledImages() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapNonSubsampledImages(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT} value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMap} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMap(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMap(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMapDynamic} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMapDynamic(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapDynamic(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapFeaturesEXT#fragmentDensityMapNonSubsampledImages} field. */
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer fragmentDensityMapNonSubsampledImages(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.nfragmentDensityMapNonSubsampledImages(address(), value ? 1 : 0); return this; }

    }

}