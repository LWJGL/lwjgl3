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
 * Structure describing layered implementations underneath the Vulkan physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code pLayeredApis} is {@code NULL}, then the number of layered implementations that are underneath the top-most Vulkan physical device (i.e. the one returned by {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}) is returned in {@code layeredApiCount}. Otherwise, {@code layeredApiCount} <b>must</b> be set by the application to the number of elements in the {@code pLayeredApis} array, and on return the variable is overwritten with the number of values actually written to {@code pLayeredApis}. If the value of {@code layeredApiCount} is less than the number of layered implementations underneath the Vulkan physical device, at most {@code layeredApiCount} values will be written to {@code pLayeredApis}. An implementation that is not a layer will return 0 in {@code layeredApiCount}.</p>
 * 
 * <p>In the presence of multiple layered implementations, each element of {@code pLayeredApis} corresponds to an API implementation that is implemented on top of the API at the previous index. If there are layered implementations underneath a non-Vulkan implementation, they may not be visible in this query as the corresponding APIs may lack such a query.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR}</li>
 * <li>If {@code layeredApiCount} is not 0, and {@code pLayeredApis} is not {@code NULL}, {@code pLayeredApis} <b>must</b> be a valid pointer to an array of {@code layeredApiCount} {@link VkPhysicalDeviceLayeredApiPropertiesKHR} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceLayeredApiPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #layeredApiCount};
 *     {@link VkPhysicalDeviceLayeredApiPropertiesKHR VkPhysicalDeviceLayeredApiPropertiesKHR} * {@link #pLayeredApis};
 * }</code></pre>
 */
public class VkPhysicalDeviceLayeredApiPropertiesListKHR extends Struct<VkPhysicalDeviceLayeredApiPropertiesListKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LAYEREDAPICOUNT,
        PLAYEREDAPIS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LAYEREDAPICOUNT = layout.offsetof(2);
        PLAYEREDAPIS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceLayeredApiPropertiesListKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLayeredApiPropertiesListKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an integer related to the number of layered implementations underneath the Vulkan physical device, as described below. */
    @NativeType("uint32_t")
    public int layeredApiCount() { return nlayeredApiCount(address()); }
    /** a pointer to an array of {@link VkPhysicalDeviceLayeredApiPropertiesKHR} in which information regarding the layered implementations underneath the Vulkan physical device are returned. */
    @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
    public VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer pLayeredApis() { return npLayeredApis(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #layeredApiCount} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(@NativeType("uint32_t") int value) { nlayeredApiCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} to the {@link #pLayeredApis} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(@NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *") VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer value) { npLayeredApis(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(
        int sType,
        long pNext,
        int layeredApiCount,
        VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer pLayeredApis
    ) {
        sType(sType);
        pNext(pNext);
        layeredApiCount(layeredApiCount);
        pLayeredApis(pLayeredApis);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR set(VkPhysicalDeviceLayeredApiPropertiesListKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR malloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR calloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR create(long address) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLayeredApiPropertiesListKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesListKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.PNEXT); }
    /** Unsafe version of {@link #layeredApiCount}. */
    public static int nlayeredApiCount(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.LAYEREDAPICOUNT); }
    /** Unsafe version of {@link #pLayeredApis}. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer npLayeredApis(long struct) { return VkPhysicalDeviceLayeredApiPropertiesKHR.createSafe(memGetAddress(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.PLAYEREDAPIS), nlayeredApiCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.PNEXT, value); }
    /** Sets the specified value to the {@code layeredApiCount} field of the specified {@code struct}. */
    public static void nlayeredApiCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.LAYEREDAPICOUNT, value); }
    /** Unsafe version of {@link #pLayeredApis(VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer) pLayeredApis}. */
    public static void npLayeredApis(long struct, VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer value) { memPutAddress(struct + VkPhysicalDeviceLayeredApiPropertiesListKHR.PLAYEREDAPIS, memAddressSafe(value)); if (value != null) { nlayeredApiCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLayeredApiPropertiesListKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredApiPropertiesListKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLayeredApiPropertiesListKHR ELEMENT_FACTORY = VkPhysicalDeviceLayeredApiPropertiesListKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLayeredApiPropertiesListKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#layeredApiCount} field. */
        @NativeType("uint32_t")
        public int layeredApiCount() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address()); }
        /** @return a {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} view of the struct array pointed to by the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#pLayeredApis} field. */
        @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
        public VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer pLayeredApis() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR} value to the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#pNext} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#layeredApiCount} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer layeredApiCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} to the {@link VkPhysicalDeviceLayeredApiPropertiesListKHR#pLayeredApis} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer pLayeredApis(@NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *") VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address(), value); return this; }

    }

}