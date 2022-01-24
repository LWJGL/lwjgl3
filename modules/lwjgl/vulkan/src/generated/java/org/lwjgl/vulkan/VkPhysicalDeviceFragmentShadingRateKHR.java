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
 * Structure returning information about sample count specific additional multisampling capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link KHRFragmentShadingRate#vkGetPhysicalDeviceFragmentShadingRatesKHR GetPhysicalDeviceFragmentShadingRatesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShadingRateKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkSampleCountFlags {@link #sampleCounts};
 *     {@link VkExtent2D VkExtent2D} {@link #fragmentSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShadingRateKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLECOUNTS,
        FRAGMENTSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLECOUNTS = layout.offsetof(2);
        FRAGMENTSIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateKHR(ByteBuffer container) {
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
    /** a bitmask of sample counts for which the shading rate described by {@code fragmentSize} is supported. */
    @NativeType("VkSampleCountFlags")
    public int sampleCounts() { return nsampleCounts(address()); }
    /** a {@link VkExtent2D} describing the width and height of a supported shading rate. */
    public VkExtent2D fragmentSize() { return nfragmentSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateKHR set(
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
    public VkPhysicalDeviceFragmentShadingRateKHR set(VkPhysicalDeviceFragmentShadingRateKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateKHR malloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateKHR calloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateKHR create(long address) {
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateKHR.PNEXT); }
    /** Unsafe version of {@link #sampleCounts}. */
    public static int nsampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateKHR.SAMPLECOUNTS); }
    /** Unsafe version of {@link #fragmentSize}. */
    public static VkExtent2D nfragmentSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentShadingRateKHR.FRAGMENTSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShadingRateKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateKHR#sampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleCounts() { return VkPhysicalDeviceFragmentShadingRateKHR.nsampleCounts(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceFragmentShadingRateKHR#fragmentSize} field. */
        public VkExtent2D fragmentSize() { return VkPhysicalDeviceFragmentShadingRateKHR.nfragmentSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateKHR#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR} value to the {@link VkPhysicalDeviceFragmentShadingRateKHR#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateKHR#pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateKHR.npNext(address(), value); return this; }

    }

}