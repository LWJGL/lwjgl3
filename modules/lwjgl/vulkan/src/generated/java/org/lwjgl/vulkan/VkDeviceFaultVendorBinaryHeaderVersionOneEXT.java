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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
 *     uint32_t headerSize;
 *     VkDeviceFaultVendorBinaryHeaderVersionKHR headerVersion;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     uint32_t driverVersion;
 *     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
 *     uint32_t applicationNameOffset;
 *     uint32_t applicationVersion;
 *     uint32_t engineNameOffset;
 *     uint32_t engineVersion;
 *     uint32_t apiVersion;
 * }}</pre>
 */
public class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends VkDeviceFaultVendorBinaryHeaderVersionOneKHR {

    protected VkDeviceFaultVendorBinaryHeaderVersionOneEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code headerSize} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(@NativeType("uint32_t") int value) { nheaderSize(address(), value); return this; }
    /** Sets the specified value to the {@code headerVersion} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR") int value) { nheaderVersion(address(), value); return this; }
    /** Sets the specified value to the {@code vendorID} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(@NativeType("uint32_t") int value) { nvendorID(address(), value); return this; }
    /** Sets the specified value to the {@code deviceID} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(@NativeType("uint32_t") int value) { ndeviceID(address(), value); return this; }
    /** Sets the specified value to the {@code driverVersion} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(@NativeType("uint32_t") int value) { ndriverVersion(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { npipelineCacheUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { npipelineCacheUUID(address(), index, value); return this; }
    /** Sets the specified value to the {@code applicationNameOffset} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(@NativeType("uint32_t") int value) { napplicationNameOffset(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVersion} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Sets the specified value to the {@code engineNameOffset} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(@NativeType("uint32_t") int value) { nengineNameOffset(address(), value); return this; }
    /** Sets the specified value to the {@code engineVersion} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@code apiVersion} field. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(@NativeType("uint32_t") int value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(
        int headerSize,
        int headerVersion,
        int vendorID,
        int deviceID,
        int driverVersion,
        ByteBuffer pipelineCacheUUID,
        int applicationNameOffset,
        int applicationVersion,
        int engineNameOffset,
        int engineVersion,
        int apiVersion
    ) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        driverVersion(driverVersion);
        pipelineCacheUUID(pipelineCacheUUID);
        applicationNameOffset(applicationNameOffset);
        applicationVersion(applicationVersion);
        engineNameOffset(engineNameOffset);
        engineVersion(engineVersion);
        apiVersion(apiVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance for the specified memory address. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long address) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultVendorBinaryHeaderVersionOneEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT} structs. */
    public static class Buffer extends VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer {

        private static final VkDeviceFaultVendorBinaryHeaderVersionOneEXT ELEMENT_FACTORY = VkDeviceFaultVendorBinaryHeaderVersionOneEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultVendorBinaryHeaderVersionOneEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkDeviceFaultVendorBinaryHeaderVersionOneEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code headerSize} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer headerSize(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderSize(address(), value); return this; }
        /** Sets the specified value to the {@code headerVersion} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderVersion(address(), value); return this; }
        /** Sets the specified value to the {@code vendorID} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer vendorID(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nvendorID(address(), value); return this; }
        /** Sets the specified value to the {@code deviceID} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer deviceID(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndeviceID(address(), value); return this; }
        /** Sets the specified value to the {@code driverVersion} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer driverVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndriverVersion(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address(), index, value); return this; }
        /** Sets the specified value to the {@code applicationNameOffset} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer applicationNameOffset(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationNameOffset(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVersion} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer applicationVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationVersion(address(), value); return this; }
        /** Sets the specified value to the {@code engineNameOffset} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer engineNameOffset(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineNameOffset(address(), value); return this; }
        /** Sets the specified value to the {@code engineVersion} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer engineVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@code apiVersion} field. */
        @Override
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT.Buffer apiVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napiVersion(address(), value); return this; }

    }

}