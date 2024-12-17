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
 * struct VkPhysicalDeviceLayeredDriverPropertiesMSFT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkLayeredDriverUnderlyingApiMSFT underlyingAPI;
 * }}</pre>
 */
public class VkPhysicalDeviceLayeredDriverPropertiesMSFT extends Struct<VkPhysicalDeviceLayeredDriverPropertiesMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        UNDERLYINGAPI;

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
        UNDERLYINGAPI = layout.offsetof(2);
    }

    protected VkPhysicalDeviceLayeredDriverPropertiesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLayeredDriverPropertiesMSFT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code underlyingAPI} field. */
    @NativeType("VkLayeredDriverUnderlyingApiMSFT")
    public int underlyingAPI() { return nunderlyingAPI(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link MSFTLayeredDriver#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT} value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType$Default() { return sType(MSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(
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
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT set(VkPhysicalDeviceLayeredDriverPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT malloc() {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT calloc() {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance for the specified memory address. */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT create(long address) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLayeredDriverPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredDriverPropertiesMSFT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLayeredDriverPropertiesMSFT.PNEXT); }
    /** Unsafe version of {@link #underlyingAPI}. */
    public static int nunderlyingAPI(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredDriverPropertiesMSFT.UNDERLYINGAPI); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLayeredDriverPropertiesMSFT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLayeredDriverPropertiesMSFT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredDriverPropertiesMSFT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLayeredDriverPropertiesMSFT ELEMENT_FACTORY = VkPhysicalDeviceLayeredDriverPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLayeredDriverPropertiesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLayeredDriverPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.npNext(address()); }
        /** @return the value of the {@code underlyingAPI} field. */
        @NativeType("VkLayeredDriverUnderlyingApiMSFT")
        public int underlyingAPI() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.nunderlyingAPI(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.nsType(address(), value); return this; }
        /** Sets the {@link MSFTLayeredDriver#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT} value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer sType$Default() { return sType(MSFTLayeredDriver.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_DRIVER_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.npNext(address(), value); return this; }

    }

}