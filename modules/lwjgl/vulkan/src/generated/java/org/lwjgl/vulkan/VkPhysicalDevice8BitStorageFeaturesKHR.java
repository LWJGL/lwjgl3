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
 * See {@link VkPhysicalDevice8BitStorageFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevice8BitStorageFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 storageBuffer8BitAccess;
 *     VkBool32 uniformAndStorageBuffer8BitAccess;
 *     VkBool32 storagePushConstant8;
 * }</code></pre>
 */
public class VkPhysicalDevice8BitStorageFeaturesKHR extends VkPhysicalDevice8BitStorageFeatures {

    /**
     * Creates a {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice8BitStorageFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant8} field. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8(@NativeType("VkBool32") boolean value) { nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevice8BitStorageFeaturesKHR set(
        int sType,
        long pNext,
        boolean storageBuffer8BitAccess,
        boolean uniformAndStorageBuffer8BitAccess,
        boolean storagePushConstant8
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice8BitStorageFeaturesKHR set(VkPhysicalDevice8BitStorageFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR malloc() {
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR calloc() {
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevice8BitStorageFeaturesKHR create(long address) {
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevice8BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevice8BitStorageFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice8BitStorageFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice8BitStorageFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDevice8BitStorageFeatures.Buffer {

        private static final VkPhysicalDevice8BitStorageFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevice8BitStorageFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice8BitStorageFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice8BitStorageFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevice8BitStorageFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice8BitStorageFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice8BitStorageFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant8} field. */
        @Override
        public VkPhysicalDevice8BitStorageFeaturesKHR.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDevice8BitStorageFeaturesKHR.nstoragePushConstant8(address(), value ? 1 : 0); return this; }

    }

}