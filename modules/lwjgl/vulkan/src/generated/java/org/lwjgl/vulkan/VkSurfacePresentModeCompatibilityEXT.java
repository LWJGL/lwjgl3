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
 * struct VkSurfacePresentModeCompatibilityEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t presentModeCount;
 *     VkPresentModeKHR * pPresentModes;
 * }}</pre>
 */
public class VkSurfacePresentModeCompatibilityEXT extends VkSurfacePresentModeCompatibilityKHR {

    protected VkSurfacePresentModeCompatibilityEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeCompatibilityEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeCompatibilityEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeCompatibilityEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeCompatibilityEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR} value to the {@code sType} field. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentModeCount} field. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT presentModeCount(@NativeType("uint32_t") int value) { npresentModeCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSurfacePresentModeCompatibilityEXT set(
        int sType,
        long pNext,
        int presentModeCount,
        @Nullable IntBuffer pPresentModes
    ) {
        sType(sType);
        pNext(pNext);
        presentModeCount(presentModeCount);
        pPresentModes(pPresentModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentModeCompatibilityEXT set(VkSurfacePresentModeCompatibilityEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityEXT malloc() {
        return new VkSurfacePresentModeCompatibilityEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeCompatibilityEXT calloc() {
        return new VkSurfacePresentModeCompatibilityEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeCompatibilityEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeCompatibilityEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance for the specified memory address. */
    public static VkSurfacePresentModeCompatibilityEXT create(long address) {
        return new VkSurfacePresentModeCompatibilityEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentModeCompatibilityEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeCompatibilityEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentModeCompatibilityEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeCompatibilityEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeCompatibilityEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeCompatibilityEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeCompatibilityEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeCompatibilityEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeCompatibilityEXT} structs. */
    public static class Buffer extends VkSurfacePresentModeCompatibilityKHR.Buffer {

        private static final VkSurfacePresentModeCompatibilityEXT ELEMENT_FACTORY = VkSurfacePresentModeCompatibilityEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeCompatibilityEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeCompatibilityEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentModeCompatibilityEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSurfacePresentModeCompatibilityEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeCompatibilityEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR} value to the {@code sType} field. */
        @Override
        public VkSurfacePresentModeCompatibilityEXT.Buffer sType$Default() { return sType(KHRSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSurfacePresentModeCompatibilityEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeCompatibilityEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentModeCount} field. */
        @Override
        public VkSurfacePresentModeCompatibilityEXT.Buffer presentModeCount(@NativeType("uint32_t") int value) { VkSurfacePresentModeCompatibilityEXT.npresentModeCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
        @Override
        public VkSurfacePresentModeCompatibilityEXT.Buffer pPresentModes(@Nullable @NativeType("VkPresentModeKHR *") IntBuffer value) { VkSurfacePresentModeCompatibilityEXT.npPresentModes(address(), value); return this; }

    }

}