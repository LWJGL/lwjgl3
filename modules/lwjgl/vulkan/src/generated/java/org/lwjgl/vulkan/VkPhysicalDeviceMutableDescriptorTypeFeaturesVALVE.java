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
 * See {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 mutableDescriptorType;
 * }</code></pre>
 */
public class VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE extends VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT {

    protected VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code mutableDescriptorType} field. */
    @Override
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE mutableDescriptorType(@NativeType("VkBool32") boolean value) { nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(
        int sType,
        long pNext,
        boolean mutableDescriptorType
    ) {
        sType(sType);
        pNext(pNext);
        mutableDescriptorType(mutableDescriptorType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance for the specified memory address. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} structs. */
    public static class Buffer extends VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer {

        private static final VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code mutableDescriptorType} field. */
        @Override
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer mutableDescriptorType(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    }

}