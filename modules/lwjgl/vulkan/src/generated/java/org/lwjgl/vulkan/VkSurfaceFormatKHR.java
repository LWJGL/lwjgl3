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
 * Structure describing a supported swapchain format-color space pair.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; a {@code VkFormat} that is compatible with the specified surface.</li>
 * <li>{@code colorSpace} &ndash; a presentation {@code VkColorSpaceKHR} that is compatible with the surface.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceFormatKHR {
 *     VkFormat format;
 *     VkColorSpaceKHR colorSpace;
 * }</code></pre>
 */
public class VkSurfaceFormatKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        COLORSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        COLORSPACE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkSurfaceFormatKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceFormatKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code colorSpace} field. */
    @NativeType("VkColorSpaceKHR")
    public int colorSpace() { return ncolorSpace(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceFormatKHR malloc() {
        return wrap(VkSurfaceFormatKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFormatKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceFormatKHR calloc() {
        return wrap(VkSurfaceFormatKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceFormatKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceFormatKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceFormatKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceFormatKHR} instance for the specified memory address. */
    public static VkSurfaceFormatKHR create(long address) {
        return wrap(VkSurfaceFormatKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFormatKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceFormatKHR.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceFormatKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceFormatKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSurfaceFormatKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSurfaceFormatKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSurfaceFormatKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFormatKHR mallocStack(MemoryStack stack) {
        return wrap(VkSurfaceFormatKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceFormatKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceFormatKHR callocStack(MemoryStack stack) {
        return wrap(VkSurfaceFormatKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceFormatKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceFormatKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceFormatKHR.FORMAT); }
    /** Unsafe version of {@link #colorSpace}. */
    public static int ncolorSpace(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceFormatKHR.COLORSPACE); }

    // -----------------------------------

    /** An array of {@link VkSurfaceFormatKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceFormatKHR, Buffer> implements NativeResource {

        private static final VkSurfaceFormatKHR ELEMENT_FACTORY = VkSurfaceFormatKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceFormatKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceFormatKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceFormatKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSurfaceFormatKHR.nformat(address()); }
        /** Returns the value of the {@code colorSpace} field. */
        @NativeType("VkColorSpaceKHR")
        public int colorSpace() { return VkSurfaceFormatKHR.ncolorSpace(address()); }

    }

}