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
 * Structure describing display parameters associated with a display mode.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For example, a 60Hz display mode would report a {@code refreshRate} of 60,000.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code width} member of {@code visibleRegion} <b>must</b> be greater than 0</li>
 * <li>The {@code height} member of {@code visibleRegion} <b>must</b> be greater than 0</li>
 * <li>{@code refreshRate} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayModeCreateInfoKHR}, {@link VkDisplayModePropertiesKHR}, {@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code visibleRegion} &ndash; the 2D extents of the visible region.</li>
 * <li>{@code refreshRate} &ndash; a {@code uint32_t} that is the number of times the display is refreshed each second multiplied by 1000.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayModeParametersKHR {
 *     {@link VkExtent2D VkExtent2D} visibleRegion;
 *     uint32_t refreshRate;
 * }</code></pre>
 */
public class VkDisplayModeParametersKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VISIBLEREGION,
        REFRESHRATE;

    static {
        Layout layout = __struct(
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VISIBLEREGION = layout.offsetof(0);
        REFRESHRATE = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkDisplayModeParametersKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModeParametersKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkExtent2D} view of the {@code visibleRegion} field. */
    public VkExtent2D visibleRegion() { return nvisibleRegion(address()); }
    /** Returns the value of the {@code refreshRate} field. */
    @NativeType("uint32_t")
    public int refreshRate() { return nrefreshRate(address()); }

    /** Copies the specified {@link VkExtent2D} to the {@code visibleRegion} field. */
    public VkDisplayModeParametersKHR visibleRegion(VkExtent2D value) { nvisibleRegion(address(), value); return this; }
    /** Passes the {@code visibleRegion} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayModeParametersKHR visibleRegion(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(visibleRegion()); return this; }
    /** Sets the specified value to the {@code refreshRate} field. */
    public VkDisplayModeParametersKHR refreshRate(@NativeType("uint32_t") int value) { nrefreshRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayModeParametersKHR set(
        VkExtent2D visibleRegion,
        int refreshRate
    ) {
        visibleRegion(visibleRegion);
        refreshRate(refreshRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayModeParametersKHR set(VkDisplayModeParametersKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeParametersKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModeParametersKHR malloc() {
        return wrap(VkDisplayModeParametersKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeParametersKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModeParametersKHR calloc() {
        return wrap(VkDisplayModeParametersKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayModeParametersKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModeParametersKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayModeParametersKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModeParametersKHR} instance for the specified memory address. */
    public static VkDisplayModeParametersKHR create(long address) {
        return wrap(VkDisplayModeParametersKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeParametersKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayModeParametersKHR.class, address);
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayModeParametersKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayModeParametersKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeParametersKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayModeParametersKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayModeParametersKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayModeParametersKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayModeParametersKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeParametersKHR mallocStack(MemoryStack stack) {
        return wrap(VkDisplayModeParametersKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayModeParametersKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeParametersKHR callocStack(MemoryStack stack) {
        return wrap(VkDisplayModeParametersKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeParametersKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeParametersKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #visibleRegion}. */
    public static VkExtent2D nvisibleRegion(long struct) { return VkExtent2D.create(struct + VkDisplayModeParametersKHR.VISIBLEREGION); }
    /** Unsafe version of {@link #refreshRate}. */
    public static int nrefreshRate(long struct) { return UNSAFE.getInt(null, struct + VkDisplayModeParametersKHR.REFRESHRATE); }

    /** Unsafe version of {@link #visibleRegion(VkExtent2D) visibleRegion}. */
    public static void nvisibleRegion(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplayModeParametersKHR.VISIBLEREGION, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #refreshRate(int) refreshRate}. */
    public static void nrefreshRate(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayModeParametersKHR.REFRESHRATE, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayModeParametersKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModeParametersKHR, Buffer> implements NativeResource {

        private static final VkDisplayModeParametersKHR ELEMENT_FACTORY = VkDisplayModeParametersKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayModeParametersKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModeParametersKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayModeParametersKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link VkExtent2D} view of the {@code visibleRegion} field. */
        public VkExtent2D visibleRegion() { return VkDisplayModeParametersKHR.nvisibleRegion(address()); }
        /** Returns the value of the {@code refreshRate} field. */
        @NativeType("uint32_t")
        public int refreshRate() { return VkDisplayModeParametersKHR.nrefreshRate(address()); }

        /** Copies the specified {@link VkExtent2D} to the {@code visibleRegion} field. */
        public VkDisplayModeParametersKHR.Buffer visibleRegion(VkExtent2D value) { VkDisplayModeParametersKHR.nvisibleRegion(address(), value); return this; }
        /** Passes the {@code visibleRegion} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayModeParametersKHR.Buffer visibleRegion(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(visibleRegion()); return this; }
        /** Sets the specified value to the {@code refreshRate} field. */
        public VkDisplayModeParametersKHR.Buffer refreshRate(@NativeType("uint32_t") int value) { VkDisplayModeParametersKHR.nrefreshRate(address(), value); return this; }

    }

}