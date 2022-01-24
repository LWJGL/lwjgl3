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
 * Structure describing subpass shading properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubpassShadingPropertiesHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxSubpassShadingWorkgroupSizeAspectRatio};
 * }</code></pre>
 */
public class VkPhysicalDeviceSubpassShadingPropertiesHUAWEI extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXSUBPASSSHADINGWORKGROUPSIZEASPECTRATIO;

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
        MAXSUBPASSSHADINGWORKGROUPSIZEASPECTRATIO = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI(ByteBuffer container) {
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
    /** indicates the maximum ratio between the width and height of the portion of the subpass shading shader workgroup size. {@code maxSubpassShadingWorkgroupSizeAspectRatio} <b>must</b> be a power-of-two value, and <b>must</b> be less than or equal to max({@code WorkgroupSize.x} / {@code WorkgroupSize.y}, {@code WorkgroupSize.y} / {@code WorkgroupSize.x}). */
    @NativeType("uint32_t")
    public int maxSubpassShadingWorkgroupSizeAspectRatio() { return nmaxSubpassShadingWorkgroupSizeAspectRatio(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI} value to the {@link #sType} field. */
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI set(
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
    public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI set(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI malloc() {
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI calloc() {
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI create(long address) {
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #maxSubpassShadingWorkgroupSizeAspectRatio}. */
    public static int nmaxSubpassShadingWorkgroupSizeAspectRatio(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.MAXSUBPASSSHADINGWORKGROUPSIZEASPECTRATIO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubpassShadingPropertiesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubpassShadingPropertiesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubpassShadingPropertiesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#maxSubpassShadingWorkgroupSizeAspectRatio} field. */
        @NativeType("uint32_t")
        public int maxSubpassShadingWorkgroupSizeAspectRatio() { return VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.nmaxSubpassShadingWorkgroupSizeAspectRatio(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#sType} field. */
        public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI} value to the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#sType} field. */
        public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_SHADING_PROPERTIES_HUAWEI); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubpassShadingPropertiesHUAWEI#pNext} field. */
        public VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubpassShadingPropertiesHUAWEI.npNext(address(), value); return this; }

    }

}