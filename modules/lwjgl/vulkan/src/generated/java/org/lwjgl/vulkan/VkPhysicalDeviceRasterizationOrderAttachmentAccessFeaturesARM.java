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
 * See {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rasterizationOrderColorAttachmentAccess;
 *     VkBool32 rasterizationOrderDepthAttachmentAccess;
 *     VkBool32 rasterizationOrderStencilAttachmentAccess;
 * }</code></pre>
 */
public class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {

    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType$Default() { return sType(EXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rasterizationOrderColorAttachmentAccess} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rasterizationOrderDepthAttachmentAccess} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rasterizationOrderStencilAttachmentAccess} field. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(
        int sType,
        long pNext,
        boolean rasterizationOrderColorAttachmentAccess,
        boolean rasterizationOrderDepthAttachmentAccess,
        boolean rasterizationOrderStencilAttachmentAccess
    ) {
        sType(sType);
        pNext(pNext);
        rasterizationOrderColorAttachmentAccess(rasterizationOrderColorAttachmentAccess);
        rasterizationOrderDepthAttachmentAccess(rasterizationOrderDepthAttachmentAccess);
        rasterizationOrderStencilAttachmentAccess(rasterizationOrderStencilAttachmentAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM set(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc() {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM create(long address) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM} structs. */
    public static class Buffer extends VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.Buffer {

        private static final VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link EXTRasterizationOrderAttachmentAccess#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer sType$Default() { return sType(EXTRasterizationOrderAttachmentAccess.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rasterizationOrderColorAttachmentAccess} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderColorAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderColorAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rasterizationOrderDepthAttachmentAccess} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderDepthAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderDepthAttachmentAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rasterizationOrderStencilAttachmentAccess} field. */
        @Override
        public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.Buffer rasterizationOrderStencilAttachmentAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM.nrasterizationOrderStencilAttachmentAccess(address(), value ? 1 : 0); return this; }

    }

}