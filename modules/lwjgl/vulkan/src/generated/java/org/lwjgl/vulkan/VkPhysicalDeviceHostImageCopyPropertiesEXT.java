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
 * struct VkPhysicalDeviceHostImageCopyPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t copySrcLayoutCount;
 *     VkImageLayout * pCopySrcLayouts;
 *     uint32_t copyDstLayoutCount;
 *     VkImageLayout * pCopyDstLayouts;
 *     uint8_t optimalTilingLayoutUUID[VK_UUID_SIZE];
 *     VkBool32 identicalMemoryTypeRequirements;
 * }}</pre>
 */
public class VkPhysicalDeviceHostImageCopyPropertiesEXT extends VkPhysicalDeviceHostImageCopyProperties {

    protected VkPhysicalDeviceHostImageCopyPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code copySrcLayoutCount} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copySrcLayoutCount(@NativeType("uint32_t") int value) { ncopySrcLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCopySrcLayouts} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopySrcLayouts(address(), value); return this; }
    /** Sets the specified value to the {@code copyDstLayoutCount} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT copyDstLayoutCount(@NativeType("uint32_t") int value) { ncopyDstLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCopyDstLayouts} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { npCopyDstLayouts(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code optimalTilingLayoutUUID} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { noptimalTilingLayoutUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code optimalTilingLayoutUUID} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { noptimalTilingLayoutUUID(address(), index, value); return this; }
    /** Sets the specified value to the {@code identicalMemoryTypeRequirements} field. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(
        int sType,
        long pNext,
        int copySrcLayoutCount,
        @Nullable IntBuffer pCopySrcLayouts,
        int copyDstLayoutCount,
        @Nullable IntBuffer pCopyDstLayouts,
        ByteBuffer optimalTilingLayoutUUID,
        boolean identicalMemoryTypeRequirements
    ) {
        sType(sType);
        pNext(pNext);
        copySrcLayoutCount(copySrcLayoutCount);
        pCopySrcLayouts(pCopySrcLayouts);
        copyDstLayoutCount(copyDstLayoutCount);
        pCopyDstLayouts(pCopyDstLayouts);
        optimalTilingLayoutUUID(optimalTilingLayoutUUID);
        identicalMemoryTypeRequirements(identicalMemoryTypeRequirements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostImageCopyPropertiesEXT set(VkPhysicalDeviceHostImageCopyPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc() {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT create(long address) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceHostImageCopyPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHostImageCopyPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostImageCopyPropertiesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceHostImageCopyProperties.Buffer {

        private static final VkPhysicalDeviceHostImageCopyPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostImageCopyPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHostImageCopyPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code copySrcLayoutCount} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer copySrcLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopySrcLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCopySrcLayouts} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pCopySrcLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopySrcLayouts(address(), value); return this; }
        /** Sets the specified value to the {@code copyDstLayoutCount} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer copyDstLayoutCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.ncopyDstLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCopyDstLayouts} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer pCopyDstLayouts(@Nullable @NativeType("VkImageLayout *") IntBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.npCopyDstLayouts(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code optimalTilingLayoutUUID} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code optimalTilingLayoutUUID} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.noptimalTilingLayoutUUID(address(), index, value); return this; }
        /** Sets the specified value to the {@code identicalMemoryTypeRequirements} field. */
        @Override
        public VkPhysicalDeviceHostImageCopyPropertiesEXT.Buffer identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostImageCopyPropertiesEXT.nidenticalMemoryTypeRequirements(address(), value ? 1 : 0); return this; }

    }

}