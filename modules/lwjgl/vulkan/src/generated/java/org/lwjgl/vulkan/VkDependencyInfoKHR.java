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

/**
 * See {@link VkDependencyInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDependencyInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDependencyFlags dependencyFlags;
 *     uint32_t memoryBarrierCount;
 *     {@link VkMemoryBarrier2 VkMemoryBarrier2} const * pMemoryBarriers;
 *     uint32_t bufferMemoryBarrierCount;
 *     {@link VkBufferMemoryBarrier2 VkBufferMemoryBarrier2} const * pBufferMemoryBarriers;
 *     uint32_t imageMemoryBarrierCount;
 *     {@link VkImageMemoryBarrier2 VkImageMemoryBarrier2} const * pImageMemoryBarriers;
 * }</code></pre>
 */
public class VkDependencyInfoKHR extends VkDependencyInfo {

    protected VkDependencyInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDependencyInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDependencyInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDependencyInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDependencyInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDependencyInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@code sType} field. */
    @Override
    public VkDependencyInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDependencyInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dependencyFlags} field. */
    @Override
    public VkDependencyInfoKHR dependencyFlags(@NativeType("VkDependencyFlags") int value) { ndependencyFlags(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@code pMemoryBarriers} field. */
    @Override
    public VkDependencyInfoKHR pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.@Nullable Buffer value) { npMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@code pBufferMemoryBarriers} field. */
    @Override
    public VkDependencyInfoKHR pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.@Nullable Buffer value) { npBufferMemoryBarriers(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@code pImageMemoryBarriers} field. */
    @Override
    public VkDependencyInfoKHR pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.@Nullable Buffer value) { npImageMemoryBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDependencyInfoKHR set(
        int sType,
        long pNext,
        int dependencyFlags,
        VkMemoryBarrier2.@Nullable Buffer pMemoryBarriers,
        VkBufferMemoryBarrier2.@Nullable Buffer pBufferMemoryBarriers,
        VkImageMemoryBarrier2.@Nullable Buffer pImageMemoryBarriers
    ) {
        sType(sType);
        pNext(pNext);
        dependencyFlags(dependencyFlags);
        pMemoryBarriers(pMemoryBarriers);
        pBufferMemoryBarriers(pBufferMemoryBarriers);
        pImageMemoryBarriers(pImageMemoryBarriers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDependencyInfoKHR set(VkDependencyInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDependencyInfoKHR malloc() {
        return new VkDependencyInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDependencyInfoKHR calloc() {
        return new VkDependencyInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDependencyInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDependencyInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDependencyInfoKHR} instance for the specified memory address. */
    public static VkDependencyInfoKHR create(long address) {
        return new VkDependencyInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDependencyInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDependencyInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDependencyInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDependencyInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDependencyInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfoKHR malloc(MemoryStack stack) {
        return new VkDependencyInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDependencyInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDependencyInfoKHR calloc(MemoryStack stack) {
        return new VkDependencyInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDependencyInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDependencyInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDependencyInfoKHR} structs. */
    public static class Buffer extends VkDependencyInfo.Buffer {

        private static final VkDependencyInfoKHR ELEMENT_FACTORY = VkDependencyInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDependencyInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDependencyInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDependencyInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDependencyInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDependencyInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEPENDENCY_INFO STRUCTURE_TYPE_DEPENDENCY_INFO} value to the {@code sType} field. */
        @Override
        public VkDependencyInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEPENDENCY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDependencyInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDependencyInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dependencyFlags} field. */
        @Override
        public VkDependencyInfoKHR.Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) { VkDependencyInfoKHR.ndependencyFlags(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryBarrier2.Buffer} to the {@code pMemoryBarriers} field. */
        @Override
        public VkDependencyInfoKHR.Buffer pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfoKHR.npMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferMemoryBarrier2.Buffer} to the {@code pBufferMemoryBarriers} field. */
        @Override
        public VkDependencyInfoKHR.Buffer pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfoKHR.npBufferMemoryBarriers(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageMemoryBarrier2.Buffer} to the {@code pImageMemoryBarriers} field. */
        @Override
        public VkDependencyInfoKHR.Buffer pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.@Nullable Buffer value) { VkDependencyInfoKHR.npImageMemoryBarriers(address(), value); return this; }

    }

}