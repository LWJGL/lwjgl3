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
 * Structure describing fragment density map offet features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 fragmentDensityMapOffset;
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYMAPOFFSET;

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
        FRAGMENTDENSITYMAPOFFSET = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code fragmentDensityMapOffset} field. */
    @NativeType("VkBool32")
    public boolean fragmentDensityMapOffset() { return nfragmentDensityMapOffset(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(
        int sType,
        long pNext,
        boolean fragmentDensityMapOffset
    ) {
        sType(sType);
        pNext(pNext);
        fragmentDensityMapOffset(fragmentDensityMapOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityMapOffset}. */
    public static int nfragmentDensityMapOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.FRAGMENTDENSITYMAPOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #fragmentDensityMapOffset(boolean) fragmentDensityMapOffset}. */
    public static void nfragmentDensityMapOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.FRAGMENTDENSITYMAPOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code fragmentDensityMapOffset} field. */
        @NativeType("VkBool32")
        public boolean fragmentDensityMapOffset() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM} value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM#pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code fragmentDensityMapOffset} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.Buffer fragmentDensityMapOffset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.nfragmentDensityMapOffset(address(), value ? 1 : 0); return this; }

    }

}