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
 * Structure describing whether subpass shading is enabled.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubpassShadingFeaturesHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #subpassShading};
 * }</code></pre>
 */
public class VkPhysicalDeviceSubpassShadingFeaturesHUAWEI extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSSHADING;

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
        SUBPASSSHADING = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI(ByteBuffer container) {
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
    /** specifies whether subpass shading is supported. */
    @NativeType("VkBool32")
    public boolean subpassShading() { return nsubpassShading(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI} value to the {@link #sType} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #subpassShading} field. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI subpassShading(@NativeType("VkBool32") boolean value) { nsubpassShading(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean subpassShading
    ) {
        sType(sType);
        pNext(pNext);
        subpassShading(subpassShading);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI set(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc() {
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc() {
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI create(long address) {
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #subpassShading}. */
    public static int nsubpassShading(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.SUBPASSSHADING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #subpassShading(boolean) subpassShading}. */
    public static void nsubpassShading(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.SUBPASSSHADING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubpassShadingFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubpassShadingFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubpassShadingFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#subpassShading} field. */
        @NativeType("VkBool32")
        public boolean subpassShading() { return VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI} value to the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#pNext} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubpassShadingFeaturesHUAWEI#subpassShading} field. */
        public VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.Buffer subpassShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubpassShadingFeaturesHUAWEI.nsubpassShading(address(), value ? 1 : 0); return this; }

    }

}