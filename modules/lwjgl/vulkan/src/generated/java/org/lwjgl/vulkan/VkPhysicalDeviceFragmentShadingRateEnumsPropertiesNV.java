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
 * Structure describing fragment shading rate limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These properties are related to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate">fragment shading rates</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV}</li>
 * <li>{@code maxFragmentShadingRateInvocationCount} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkSampleCountFlagBits {@link #maxFragmentShadingRateInvocationCount};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT;

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
        MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV(ByteBuffer container) {
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
    /** a {@code VkSampleCountFlagBits} value indicating the maximum number of fragment shader invocations per fragment supported in pipeline, primitive, and attachment fragment shading rates. */
    @NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateInvocationCount() { return nmaxFragmentShadingRateInvocationCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxFragmentShadingRateInvocationCount} field. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV maxFragmentShadingRateInvocationCount(@NativeType("VkSampleCountFlagBits") int value) { nmaxFragmentShadingRateInvocationCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(
        int sType,
        long pNext,
        int maxFragmentShadingRateInvocationCount
    ) {
        sType(sType);
        pNext(pNext);
        maxFragmentShadingRateInvocationCount(maxFragmentShadingRateInvocationCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV set(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV malloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #maxFragmentShadingRateInvocationCount}. */
    public static int nmaxFragmentShadingRateInvocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.PNEXT, value); }
    /** Unsafe version of {@link #maxFragmentShadingRateInvocationCount(int) maxFragmentShadingRateInvocationCount}. */
    public static void nmaxFragmentShadingRateInvocationCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.MAXFRAGMENTSHADINGRATEINVOCATIONCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#maxFragmentShadingRateInvocationCount} field. */
        @NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateInvocationCount() { return VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nmaxFragmentShadingRateInvocationCount(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShadingRateEnums#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV} value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer sType$Default() { return sType(NVFragmentShadingRateEnums.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV#maxFragmentShadingRateInvocationCount} field. */
        public VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.Buffer maxFragmentShadingRateInvocationCount(@NativeType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV.nmaxFragmentShadingRateInvocationCount(address(), value); return this; }

    }

}