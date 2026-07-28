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

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkDeviceFaultVendorInfoKHR {
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     uint64_t vendorFaultCode;
 *     uint64_t vendorFaultData;
 * }}</pre>
 */
public class VkDeviceFaultVendorInfoKHR extends Struct<VkDeviceFaultVendorInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DESCRIPTION,
        VENDORFAULTCODE,
        VENDORFAULTDATA;

    static {
        Layout layout = __struct(
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DESCRIPTION = layout.offsetof(0);
        VENDORFAULTCODE = layout.offsetof(1);
        VENDORFAULTDATA = layout.offsetof(2);
    }

    protected VkDeviceFaultVendorInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultVendorInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultVendorInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultVendorInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultVendorInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** @return the value of the {@code vendorFaultCode} field. */
    @NativeType("uint64_t")
    public long vendorFaultCode() { return nvendorFaultCode(address()); }
    /** @return the value of the {@code vendorFaultData} field. */
    @NativeType("uint64_t")
    public long vendorFaultData() { return nvendorFaultData(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultVendorInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorInfoKHR malloc() {
        return new VkDeviceFaultVendorInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorInfoKHR calloc() {
        return new VkDeviceFaultVendorInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultVendorInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultVendorInfoKHR} instance for the specified memory address. */
    public static VkDeviceFaultVendorInfoKHR create(long address) {
        return new VkDeviceFaultVendorInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultVendorInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultVendorInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultVendorInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultVendorInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkDeviceFaultVendorInfoKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkDeviceFaultVendorInfoKHR.DESCRIPTION); }
    /** Unsafe version of {@link #vendorFaultCode}. */
    public static long nvendorFaultCode(long struct) { return memGetLong(struct + VkDeviceFaultVendorInfoKHR.VENDORFAULTCODE); }
    /** Unsafe version of {@link #vendorFaultData}. */
    public static long nvendorFaultData(long struct) { return memGetLong(struct + VkDeviceFaultVendorInfoKHR.VENDORFAULTDATA); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultVendorInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultVendorInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultVendorInfoKHR ELEMENT_FACTORY = VkDeviceFaultVendorInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultVendorInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultVendorInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultVendorInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkDeviceFaultVendorInfoKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkDeviceFaultVendorInfoKHR.ndescriptionString(address()); }
        /** @return the value of the {@code vendorFaultCode} field. */
        @NativeType("uint64_t")
        public long vendorFaultCode() { return VkDeviceFaultVendorInfoKHR.nvendorFaultCode(address()); }
        /** @return the value of the {@code vendorFaultData} field. */
        @NativeType("uint64_t")
        public long vendorFaultData() { return VkDeviceFaultVendorInfoKHR.nvendorFaultData(address()); }

    }

}