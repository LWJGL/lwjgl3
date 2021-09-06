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
 * See {@link VkConformanceVersion}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkConformanceVersionKHR {
 *     uint8_t major;
 *     uint8_t minor;
 *     uint8_t subminor;
 *     uint8_t patch;
 * }</code></pre>
 */
public class VkConformanceVersionKHR extends VkConformanceVersion {

    /**
     * Creates a {@code VkConformanceVersionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkConformanceVersionKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code major} field. */
    @Override
    public VkConformanceVersionKHR major(@NativeType("uint8_t") byte value) { nmajor(address(), value); return this; }
    /** Sets the specified value to the {@code minor} field. */
    @Override
    public VkConformanceVersionKHR minor(@NativeType("uint8_t") byte value) { nminor(address(), value); return this; }
    /** Sets the specified value to the {@code subminor} field. */
    @Override
    public VkConformanceVersionKHR subminor(@NativeType("uint8_t") byte value) { nsubminor(address(), value); return this; }
    /** Sets the specified value to the {@code patch} field. */
    @Override
    public VkConformanceVersionKHR patch(@NativeType("uint8_t") byte value) { npatch(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkConformanceVersionKHR set(
        byte major,
        byte minor,
        byte subminor,
        byte patch
    ) {
        major(major);
        minor(minor);
        subminor(subminor);
        patch(patch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkConformanceVersionKHR set(VkConformanceVersionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkConformanceVersionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkConformanceVersionKHR malloc() {
        return wrap(VkConformanceVersionKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkConformanceVersionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkConformanceVersionKHR calloc() {
        return wrap(VkConformanceVersionKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkConformanceVersionKHR} instance allocated with {@link BufferUtils}. */
    public static VkConformanceVersionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkConformanceVersionKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkConformanceVersionKHR} instance for the specified memory address. */
    public static VkConformanceVersionKHR create(long address) {
        return wrap(VkConformanceVersionKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersionKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkConformanceVersionKHR.class, address);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkConformanceVersionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkConformanceVersionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkConformanceVersionKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkConformanceVersionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersionKHR malloc(MemoryStack stack) {
        return wrap(VkConformanceVersionKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkConformanceVersionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConformanceVersionKHR calloc(MemoryStack stack) {
        return wrap(VkConformanceVersionKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConformanceVersionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConformanceVersionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkConformanceVersionKHR} structs. */
    public static class Buffer extends VkConformanceVersion.Buffer {

        private static final VkConformanceVersionKHR ELEMENT_FACTORY = VkConformanceVersionKHR.create(-1L);

        /**
         * Creates a new {@code VkConformanceVersionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkConformanceVersionKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkConformanceVersionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code major} field. */
        @Override
        public VkConformanceVersionKHR.Buffer major(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nmajor(address(), value); return this; }
        /** Sets the specified value to the {@code minor} field. */
        @Override
        public VkConformanceVersionKHR.Buffer minor(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nminor(address(), value); return this; }
        /** Sets the specified value to the {@code subminor} field. */
        @Override
        public VkConformanceVersionKHR.Buffer subminor(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.nsubminor(address(), value); return this; }
        /** Sets the specified value to the {@code patch} field. */
        @Override
        public VkConformanceVersionKHR.Buffer patch(@NativeType("uint8_t") byte value) { VkConformanceVersionKHR.npatch(address(), value); return this; }

    }

}