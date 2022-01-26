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
 * Structure describing fragment density map offset properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #fragmentDensityOffsetGranularity};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTDENSITYOFFSETGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTDENSITYOFFSETGRANULARITY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(ByteBuffer container) {
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
    /** the granularity for <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-fragmentdensitymapoffsets">fragment density offsets</a>. */
    public VkExtent2D fragmentDensityOffsetGranularity() { return nfragmentDensityOffsetGranularity(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM set(
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
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM set(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM malloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #fragmentDensityOffsetGranularity}. */
    public static VkExtent2D nfragmentDensityOffsetGranularity(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.FRAGMENTDENSITYOFFSETGRANULARITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#fragmentDensityOffsetGranularity} field. */
        public VkExtent2D fragmentDensityOffsetGranularity() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.nfragmentDensityOffsetGranularity(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFragmentDensityMapOffset#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM} value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#sType} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer sType$Default() { return sType(QCOMFragmentDensityMapOffset.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM#pNext} field. */
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.npNext(address(), value); return this; }

    }

}