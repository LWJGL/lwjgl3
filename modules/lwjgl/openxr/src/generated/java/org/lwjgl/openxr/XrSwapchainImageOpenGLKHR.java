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
 * OpenGL-specific swapchain image structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a given session was created with a stext:XrGraphicsBindingOpenGL*KHR, the following conditions <b>must</b> apply.</p>
 * 
 * <ul>
 * <li>Calls to {@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages} on an {@code XrSwapchain} in that session <b>must</b> return an array of {@link XrSwapchainImageOpenGLKHR} structures.</li>
 * <li>Whenever an OpenXR function accepts an {@link XrSwapchainImageBaseHeader} pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an {@link XrSwapchainImageOpenGLKHR}.</li>
 * </ul>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the bottom-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.</p>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing up, near Z plane at -1, and far Z plane at 1.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using {@link XrSwapchainImageOpenGLKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSwapchainImageBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageOpenGLKHR {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #image};
 * }</code></pre>
 */
public class XrSwapchainImageOpenGLKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSwapchainImageOpenGLKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageOpenGLKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the OpenGL texture handle associated with this swapchain image. */
    @NativeType("uint32_t")
    public int image() { return nimage(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageOpenGLKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR} value to the {@link #type} field. */
    public XrSwapchainImageOpenGLKHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageOpenGLKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public XrSwapchainImageOpenGLKHR image(@NativeType("uint32_t") int value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageOpenGLKHR set(
        int type,
        long next,
        int image
    ) {
        type(type);
        next(next);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageOpenGLKHR set(XrSwapchainImageOpenGLKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageOpenGLKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLKHR malloc() {
        return wrap(XrSwapchainImageOpenGLKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageOpenGLKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLKHR calloc() {
        return wrap(XrSwapchainImageOpenGLKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageOpenGLKHR} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageOpenGLKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageOpenGLKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageOpenGLKHR} instance for the specified memory address. */
    public static XrSwapchainImageOpenGLKHR create(long address) {
        return wrap(XrSwapchainImageOpenGLKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageOpenGLKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageOpenGLKHR.class, address);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader} instance to {@code XrSwapchainImageOpenGLKHR}. */
    public static XrSwapchainImageOpenGLKHR create(XrSwapchainImageBaseHeader value) {
        return wrap(XrSwapchainImageOpenGLKHR.class, value);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageOpenGLKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageOpenGLKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader.Buffer} instance to {@code XrSwapchainImageOpenGLKHR.Buffer}. */
    public static XrSwapchainImageOpenGLKHR.Buffer create(XrSwapchainImageBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLKHR malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageOpenGLKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLKHR calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageOpenGLKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageOpenGLKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageOpenGLKHR.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageOpenGLKHR.IMAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageOpenGLKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageOpenGLKHR.NEXT, value); }
    /** Unsafe version of {@link #image(int) image}. */
    public static void nimage(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageOpenGLKHR.IMAGE, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageOpenGLKHR} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageOpenGLKHR, Buffer> implements NativeResource {

        private static final XrSwapchainImageOpenGLKHR ELEMENT_FACTORY = XrSwapchainImageOpenGLKHR.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageOpenGLKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageOpenGLKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageOpenGLKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageOpenGLKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageOpenGLKHR.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageOpenGLKHR#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageOpenGLKHR.nnext(address()); }
        /** @return the value of the {@link XrSwapchainImageOpenGLKHR#image} field. */
        @NativeType("uint32_t")
        public int image() { return XrSwapchainImageOpenGLKHR.nimage(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageOpenGLKHR#type} field. */
        public XrSwapchainImageOpenGLKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageOpenGLKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR} value to the {@link XrSwapchainImageOpenGLKHR#type} field. */
        public XrSwapchainImageOpenGLKHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_KHR); }
        /** Sets the specified value to the {@link XrSwapchainImageOpenGLKHR#next} field. */
        public XrSwapchainImageOpenGLKHR.Buffer next(@NativeType("void *") long value) { XrSwapchainImageOpenGLKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainImageOpenGLKHR#image} field. */
        public XrSwapchainImageOpenGLKHR.Buffer image(@NativeType("uint32_t") int value) { XrSwapchainImageOpenGLKHR.nimage(address(), value); return this; }

    }

}