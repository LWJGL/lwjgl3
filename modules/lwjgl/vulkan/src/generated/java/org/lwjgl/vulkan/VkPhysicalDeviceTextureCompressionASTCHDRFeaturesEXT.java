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
 * See {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 textureCompressionASTC_HDR;
 * }</code></pre>
 */
public class VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT extends VkPhysicalDeviceTextureCompressionASTCHDRFeatures {

    /**
     * Creates a {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
    @Override
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT set(
        int sType,
        long pNext,
        boolean textureCompressionASTC_HDR
    ) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT set(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer {

        private static final VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
        @Override
        public VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT.ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }

    }

}