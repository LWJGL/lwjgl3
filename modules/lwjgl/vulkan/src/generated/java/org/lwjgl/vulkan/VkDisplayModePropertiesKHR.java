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
 * Structure describing display mode properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code displayMode} &ndash; a handle to the display mode described in this structure. This handle will be valid for the lifetime of the Vulkan instance.</li>
 * <li>{@code parameters} &ndash; a {@link VkDisplayModeParametersKHR} structure describing the display parameters associated with {@code displayMode}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayModePropertiesKHR {
 *     VkDisplayModeKHR displayMode;
 *     {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
 * }</code></pre>
 */
public class VkDisplayModePropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DISPLAYMODE,
        PARAMETERS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DISPLAYMODE = layout.offsetof(0);
        PARAMETERS = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkDisplayModePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModePropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code displayMode} field. */
    @NativeType("VkDisplayModeKHR")
    public long displayMode() { return ndisplayMode(address()); }
    /** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
    public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModePropertiesKHR malloc() {
        return wrap(VkDisplayModePropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModePropertiesKHR calloc() {
        return wrap(VkDisplayModePropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayModePropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance for the specified memory address. */
    public static VkDisplayModePropertiesKHR create(long address) {
        return wrap(VkDisplayModePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayModePropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayModePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayModePropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayModePropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayModePropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayModePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModePropertiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplayModePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayModePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModePropertiesKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplayModePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModePropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #displayMode}. */
    public static long ndisplayMode(long struct) { return UNSAFE.getLong(null, struct + VkDisplayModePropertiesKHR.DISPLAYMODE); }
    /** Unsafe version of {@link #parameters}. */
    public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModePropertiesKHR.PARAMETERS); }

    // -----------------------------------

    /** An array of {@link VkDisplayModePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModePropertiesKHR, Buffer> implements NativeResource {

        private static final VkDisplayModePropertiesKHR ELEMENT_FACTORY = VkDisplayModePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayModePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayModePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code displayMode} field. */
        @NativeType("VkDisplayModeKHR")
        public long displayMode() { return VkDisplayModePropertiesKHR.ndisplayMode(address()); }
        /** Returns a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
        public VkDisplayModeParametersKHR parameters() { return VkDisplayModePropertiesKHR.nparameters(address()); }

    }

}