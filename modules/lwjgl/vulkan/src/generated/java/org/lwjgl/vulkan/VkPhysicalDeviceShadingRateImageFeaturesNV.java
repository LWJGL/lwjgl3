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
 * Structure describing shading rate image features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-shading-rate-image">Shading Rate Image</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceShadingRateImageFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShadingRateImageFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShadingRateImageFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shadingRateImage};
 *     VkBool32 {@link #shadingRateCoarseSampleOrder};
 * }</code></pre>
 */
public class VkPhysicalDeviceShadingRateImageFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADINGRATEIMAGE,
        SHADINGRATECOARSESAMPLEORDER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATEIMAGE = layout.offsetof(2);
        SHADINGRATECOARSESAMPLEORDER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShadingRateImageFeaturesNV(ByteBuffer container) {
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
    /** indicates that the implementation supports the use of a shading rate image to derive an effective shading rate for fragment processing. It also indicates that the implementation supports the {@code ShadingRateNV} SPIR-V execution mode. */
    @NativeType("VkBool32")
    public boolean shadingRateImage() { return nshadingRateImage(address()) != 0; }
    /** indicates that the implementation supports a user-configurable ordering of coverage samples in fragments larger than one pixel. */
    @NativeType("VkBool32")
    public boolean shadingRateCoarseSampleOrder() { return nshadingRateCoarseSampleOrder(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shadingRateImage} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(@NativeType("VkBool32") boolean value) { nshadingRateImage(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shadingRateCoarseSampleOrder} field. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) { nshadingRateCoarseSampleOrder(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(
        int sType,
        long pNext,
        boolean shadingRateImage,
        boolean shadingRateCoarseSampleOrder
    ) {
        sType(sType);
        pNext(pNext);
        shadingRateImage(shadingRateImage);
        shadingRateCoarseSampleOrder(shadingRateCoarseSampleOrder);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(VkPhysicalDeviceShadingRateImageFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImageFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShadingRateImageFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #shadingRateImage}. */
    public static int nshadingRateImage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATEIMAGE); }
    /** Unsafe version of {@link #shadingRateCoarseSampleOrder}. */
    public static int nshadingRateCoarseSampleOrder(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATECOARSESAMPLEORDER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShadingRateImageFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #shadingRateImage(boolean) shadingRateImage}. */
    public static void nshadingRateImage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATEIMAGE, value); }
    /** Unsafe version of {@link #shadingRateCoarseSampleOrder(boolean) shadingRateCoarseSampleOrder}. */
    public static void nshadingRateCoarseSampleOrder(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShadingRateImageFeaturesNV.SHADINGRATECOARSESAMPLEORDER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShadingRateImageFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImageFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShadingRateImageFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShadingRateImageFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShadingRateImageFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShadingRateImageFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#shadingRateImage} field. */
        @NativeType("VkBool32")
        public boolean shadingRateImage() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#shadingRateCoarseSampleOrder} field. */
        @NativeType("VkBool32")
        public boolean shadingRateCoarseSampleOrder() { return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#sType} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShadingRateImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV} value to the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#sType} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer sType$Default() { return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#pNext} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#shadingRateImage} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer shadingRateImage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShadingRateImageFeaturesNV#shadingRateCoarseSampleOrder} field. */
        public VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address(), value ? 1 : 0); return this; }

    }

}