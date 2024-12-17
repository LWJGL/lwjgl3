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
 * <pre>{@code
 * struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t layeredApiCount;
 *     {@link VkPhysicalDeviceLayeredApiPropertiesKHR VkPhysicalDeviceLayeredApiPropertiesKHR} * pLayeredApis;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code layeredApiCount} field. */
    @NativeType("uint32_t")
    public int layeredApiCount() { return nlayeredApiCount(address()); }
    /** @return a {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} view of the struct array pointed to by the {@code pLayeredApis} field. */
    @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
    public VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer pLayeredApis() { return npLayeredApis(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code layeredApiCount} field. */
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(@NativeType("uint32_t") int value) { nlayeredApiCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} to the {@code pLayeredApis} field. */
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

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address()); }
        /** @return the value of the {@code layeredApiCount} field. */
        @NativeType("uint32_t")
        public int layeredApiCount() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address()); }
        /** @return a {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} view of the struct array pointed to by the {@code pLayeredApis} field. */
        @NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *")
        public VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer pLayeredApis() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code layeredApiCount} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer layeredApiCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.nlayeredApiCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} to the {@code pLayeredApis} field. */
        public VkPhysicalDeviceLayeredApiPropertiesListKHR.Buffer pLayeredApis(@NativeType("VkPhysicalDeviceLayeredApiPropertiesKHR *") VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.npLayeredApis(address(), value); return this; }

    }

}