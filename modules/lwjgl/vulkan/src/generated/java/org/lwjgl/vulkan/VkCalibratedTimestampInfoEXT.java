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
 * struct VkCalibratedTimestampInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTimeDomainKHR timeDomain;
 * }}</pre>
 */
public class VkCalibratedTimestampInfoEXT extends VkCalibratedTimestampInfoKHR {

    protected VkCalibratedTimestampInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCalibratedTimestampInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCalibratedTimestampInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCalibratedTimestampInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCalibratedTimestampInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCalibratedTimestampInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR} value to the {@code sType} field. */
    @Override
    public VkCalibratedTimestampInfoEXT sType$Default() { return sType(KHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCalibratedTimestampInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code timeDomain} field. */
    @Override
    public VkCalibratedTimestampInfoEXT timeDomain(@NativeType("VkTimeDomainKHR") int value) { ntimeDomain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCalibratedTimestampInfoEXT set(
        int sType,
        long pNext,
        int timeDomain
    ) {
        sType(sType);
        pNext(pNext);
        timeDomain(timeDomain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCalibratedTimestampInfoEXT set(VkCalibratedTimestampInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoEXT malloc() {
        return new VkCalibratedTimestampInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCalibratedTimestampInfoEXT calloc() {
        return new VkCalibratedTimestampInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCalibratedTimestampInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCalibratedTimestampInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCalibratedTimestampInfoEXT} instance for the specified memory address. */
    public static VkCalibratedTimestampInfoEXT create(long address) {
        return new VkCalibratedTimestampInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCalibratedTimestampInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCalibratedTimestampInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCalibratedTimestampInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCalibratedTimestampInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCalibratedTimestampInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoEXT malloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCalibratedTimestampInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCalibratedTimestampInfoEXT calloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCalibratedTimestampInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCalibratedTimestampInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCalibratedTimestampInfoEXT} structs. */
    public static class Buffer extends VkCalibratedTimestampInfoKHR.Buffer {

        private static final VkCalibratedTimestampInfoEXT ELEMENT_FACTORY = VkCalibratedTimestampInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCalibratedTimestampInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCalibratedTimestampInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCalibratedTimestampInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCalibratedTimestampInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCalibratedTimestampInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRCalibratedTimestamps#VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR} value to the {@code sType} field. */
        @Override
        public VkCalibratedTimestampInfoEXT.Buffer sType$Default() { return sType(KHRCalibratedTimestamps.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCalibratedTimestampInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCalibratedTimestampInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code timeDomain} field. */
        @Override
        public VkCalibratedTimestampInfoEXT.Buffer timeDomain(@NativeType("VkTimeDomainKHR") int value) { VkCalibratedTimestampInfoEXT.ntimeDomain(address(), value); return this; }

    }

}