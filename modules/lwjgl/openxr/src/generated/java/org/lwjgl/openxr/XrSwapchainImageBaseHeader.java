/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image base header for a swapchain image.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSwapchainImageBaseHeader} is a base structure that can be overridden by a graphics API-specific stext:XrSwapchainImage* child structure.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be one of the following XrStructureType values: {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR}, {@link KHROpenGLEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR}, {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageBaseHeader {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 * }</code></pre>
 */
public class XrSwapchainImageBaseHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrSwapchainImageBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageBaseHeader next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageBaseHeader set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageBaseHeader set(XrSwapchainImageBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageBaseHeader malloc() {
        return wrap(XrSwapchainImageBaseHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageBaseHeader calloc() {
        return wrap(XrSwapchainImageBaseHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageBaseHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageBaseHeader} instance for the specified memory address. */
    public static XrSwapchainImageBaseHeader create(long address) {
        return wrap(XrSwapchainImageBaseHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageBaseHeader createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageBaseHeader.class, address);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLKHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageOpenGLKHR value) {
        return wrap(XrSwapchainImageBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLESKHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageOpenGLESKHR value) {
        return wrap(XrSwapchainImageBaseHeader.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkanKHR} instance to {@code XrSwapchainImageBaseHeader}. */
    public static XrSwapchainImageBaseHeader create(XrSwapchainImageVulkanKHR value) {
        return wrap(XrSwapchainImageBaseHeader.class, value);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageBaseHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLKHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageOpenGLKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainImageOpenGLESKHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageOpenGLESKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /** Upcasts the specified {@code XrSwapchainImageVulkanKHR.Buffer} instance to {@code XrSwapchainImageBaseHeader.Buffer}. */
    public static XrSwapchainImageBaseHeader.Buffer create(XrSwapchainImageVulkanKHR.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrSwapchainImageBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageBaseHeader malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageBaseHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageBaseHeader calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageBaseHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageBaseHeader.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageBaseHeader.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageBaseHeader, Buffer> implements NativeResource {

        private static final XrSwapchainImageBaseHeader ELEMENT_FACTORY = XrSwapchainImageBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageBaseHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageBaseHeader#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageBaseHeader#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageBaseHeader.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageBaseHeader#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageBaseHeader.nnext(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageBaseHeader#type} field. */
        public XrSwapchainImageBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainImageBaseHeader#next} field. */
        public XrSwapchainImageBaseHeader.Buffer next(@NativeType("void *") long value) { XrSwapchainImageBaseHeader.nnext(address(), value); return this; }

    }

}