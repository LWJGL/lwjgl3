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
 * Structure describing display plane properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code currentDisplay} &ndash; the handle of the display the plane is currently associated with. If the plane is not currently attached to any displays, this will be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</li>
 * <li>{@code currentStackIndex} &ndash; the current z-order of the plane. This will be between 0 and the value returned by {@code vkGetPhysicalDeviceDisplayPlanePropertiesKHR} in {@code pPropertyCount}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPlanePropertiesKHR {
 *     VkDisplayKHR currentDisplay;
 *     uint32_t currentStackIndex;
 * }</code></pre>
 */
public class VkDisplayPlanePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CURRENTDISPLAY,
        CURRENTSTACKINDEX;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CURRENTDISPLAY = layout.offsetof(0);
        CURRENTSTACKINDEX = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkDisplayPlanePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPlanePropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code currentDisplay} field. */
    @NativeType("VkDisplayKHR")
    public long currentDisplay() { return ncurrentDisplay(address()); }
    /** Returns the value of the {@code currentStackIndex} field. */
    @NativeType("uint32_t")
    public int currentStackIndex() { return ncurrentStackIndex(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPlanePropertiesKHR malloc() {
        return wrap(VkDisplayPlanePropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPlanePropertiesKHR calloc() {
        return wrap(VkDisplayPlanePropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPlanePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayPlanePropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance for the specified memory address. */
    public static VkDisplayPlanePropertiesKHR create(long address) {
        return wrap(VkDisplayPlanePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlanePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayPlanePropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayPlanePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayPlanePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayPlanePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayPlanePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlanePropertiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplayPlanePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayPlanePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlanePropertiesKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplayPlanePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlanePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlanePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #currentDisplay}. */
    public static long ncurrentDisplay(long struct) { return UNSAFE.getLong(null, struct + VkDisplayPlanePropertiesKHR.CURRENTDISPLAY); }
    /** Unsafe version of {@link #currentStackIndex}. */
    public static int ncurrentStackIndex(long struct) { return UNSAFE.getInt(null, struct + VkDisplayPlanePropertiesKHR.CURRENTSTACKINDEX); }

    // -----------------------------------

    /** An array of {@link VkDisplayPlanePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPlanePropertiesKHR, Buffer> implements NativeResource {

        private static final VkDisplayPlanePropertiesKHR ELEMENT_FACTORY = VkDisplayPlanePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPlanePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPlanePropertiesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkDisplayPlanePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code currentDisplay} field. */
        @NativeType("VkDisplayKHR")
        public long currentDisplay() { return VkDisplayPlanePropertiesKHR.ncurrentDisplay(address()); }
        /** Returns the value of the {@code currentStackIndex} field. */
        @NativeType("uint32_t")
        public int currentStackIndex() { return VkDisplayPlanePropertiesKHR.ncurrentStackIndex(address()); }

    }

}