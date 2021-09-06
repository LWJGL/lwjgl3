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
 * Structure specifying a viewport.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineViewportWScalingStateCreateInfoNV}, {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkViewportWScalingNV {
 *     float {@link #xcoeff};
 *     float {@link #ycoeff};
 * }</code></pre>
 */
public class VkViewportWScalingNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XCOEFF,
        YCOEFF;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XCOEFF = layout.offsetof(0);
        YCOEFF = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkViewportWScalingNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkViewportWScalingNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** {@code xcoeff} and {@code ycoeff} are the viewport’s W scaling factor for x and y respectively. */
    public float xcoeff() { return nxcoeff(address()); }
    /** see {@code xcoeff} */
    public float ycoeff() { return nycoeff(address()); }

    /** Sets the specified value to the {@link #xcoeff} field. */
    public VkViewportWScalingNV xcoeff(float value) { nxcoeff(address(), value); return this; }
    /** Sets the specified value to the {@link #ycoeff} field. */
    public VkViewportWScalingNV ycoeff(float value) { nycoeff(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkViewportWScalingNV set(
        float xcoeff,
        float ycoeff
    ) {
        xcoeff(xcoeff);
        ycoeff(ycoeff);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkViewportWScalingNV set(VkViewportWScalingNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkViewportWScalingNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkViewportWScalingNV malloc() {
        return wrap(VkViewportWScalingNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkViewportWScalingNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkViewportWScalingNV calloc() {
        return wrap(VkViewportWScalingNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkViewportWScalingNV} instance allocated with {@link BufferUtils}. */
    public static VkViewportWScalingNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkViewportWScalingNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkViewportWScalingNV} instance for the specified memory address. */
    public static VkViewportWScalingNV create(long address) {
        return wrap(VkViewportWScalingNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewportWScalingNV createSafe(long address) {
        return address == NULL ? null : wrap(VkViewportWScalingNV.class, address);
    }

    /**
     * Returns a new {@link VkViewportWScalingNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkViewportWScalingNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportWScalingNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkViewportWScalingNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkViewportWScalingNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewportWScalingNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkViewportWScalingNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportWScalingNV malloc(MemoryStack stack) {
        return wrap(VkViewportWScalingNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkViewportWScalingNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewportWScalingNV calloc(MemoryStack stack) {
        return wrap(VkViewportWScalingNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkViewportWScalingNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewportWScalingNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewportWScalingNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xcoeff}. */
    public static float nxcoeff(long struct) { return UNSAFE.getFloat(null, struct + VkViewportWScalingNV.XCOEFF); }
    /** Unsafe version of {@link #ycoeff}. */
    public static float nycoeff(long struct) { return UNSAFE.getFloat(null, struct + VkViewportWScalingNV.YCOEFF); }

    /** Unsafe version of {@link #xcoeff(float) xcoeff}. */
    public static void nxcoeff(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewportWScalingNV.XCOEFF, value); }
    /** Unsafe version of {@link #ycoeff(float) ycoeff}. */
    public static void nycoeff(long struct, float value) { UNSAFE.putFloat(null, struct + VkViewportWScalingNV.YCOEFF, value); }

    // -----------------------------------

    /** An array of {@link VkViewportWScalingNV} structs. */
    public static class Buffer extends StructBuffer<VkViewportWScalingNV, Buffer> implements NativeResource {

        private static final VkViewportWScalingNV ELEMENT_FACTORY = VkViewportWScalingNV.create(-1L);

        /**
         * Creates a new {@code VkViewportWScalingNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkViewportWScalingNV#SIZEOF}, and its mark will be undefined.
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
        protected VkViewportWScalingNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkViewportWScalingNV#xcoeff} field. */
        public float xcoeff() { return VkViewportWScalingNV.nxcoeff(address()); }
        /** @return the value of the {@link VkViewportWScalingNV#ycoeff} field. */
        public float ycoeff() { return VkViewportWScalingNV.nycoeff(address()); }

        /** Sets the specified value to the {@link VkViewportWScalingNV#xcoeff} field. */
        public VkViewportWScalingNV.Buffer xcoeff(float value) { VkViewportWScalingNV.nxcoeff(address(), value); return this; }
        /** Sets the specified value to the {@link VkViewportWScalingNV#ycoeff} field. */
        public VkViewportWScalingNV.Buffer ycoeff(float value) { VkViewportWScalingNV.nycoeff(address(), value); return this; }

    }

}