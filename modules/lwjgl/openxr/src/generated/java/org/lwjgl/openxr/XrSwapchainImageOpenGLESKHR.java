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
 * OpenGL ES-specific swapchain image structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a given session was created with a stext:XrGraphicsBindingOpenGLES*KHR, the following conditions <b>must</b> apply.</p>
 * 
 * <ul>
 * <li>Calls to {@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages} on an {@code XrSwapchain} in that session <b>must</b> return an array of {@link XrSwapchainImageOpenGLESKHR} structures.</li>
 * <li>Whenever an OpenXR function accepts an {@link XrSwapchainImageBaseHeader} pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an {@link XrSwapchainImageOpenGLESKHR} structure.</li>
 * </ul>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the bottom-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.</p>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing up, near Z plane at -1, and far Z plane at 1.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to using {@link XrSwapchainImageOpenGLESKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR}</li>
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
 * struct XrSwapchainImageOpenGLESKHR {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #image};
 * }</code></pre>
 */
public class XrSwapchainImageOpenGLESKHR extends Struct implements NativeResource {

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
     * Creates a {@code XrSwapchainImageOpenGLESKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageOpenGLESKHR(ByteBuffer container) {
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
    /** an index indicating the current OpenGL ES swapchain image to use. */
    @NativeType("uint32_t")
    public int image() { return nimage(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageOpenGLESKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR} value to the {@link #type} field. */
    public XrSwapchainImageOpenGLESKHR type$Default() { return type(KHROpenGLESEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageOpenGLESKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public XrSwapchainImageOpenGLESKHR image(@NativeType("uint32_t") int value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageOpenGLESKHR set(
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
    public XrSwapchainImageOpenGLESKHR set(XrSwapchainImageOpenGLESKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLESKHR malloc() {
        return wrap(XrSwapchainImageOpenGLESKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLESKHR calloc() {
        return wrap(XrSwapchainImageOpenGLESKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageOpenGLESKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageOpenGLESKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance for the specified memory address. */
    public static XrSwapchainImageOpenGLESKHR create(long address) {
        return wrap(XrSwapchainImageOpenGLESKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageOpenGLESKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageOpenGLESKHR.class, address);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader} instance to {@code XrSwapchainImageOpenGLESKHR}. */
    public static XrSwapchainImageOpenGLESKHR create(XrSwapchainImageBaseHeader value) {
        return wrap(XrSwapchainImageOpenGLESKHR.class, value);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageOpenGLESKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageOpenGLESKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader.Buffer} instance to {@code XrSwapchainImageOpenGLESKHR.Buffer}. */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(XrSwapchainImageBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLESKHR malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageOpenGLESKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLESKHR calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageOpenGLESKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageOpenGLESKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageOpenGLESKHR.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageOpenGLESKHR.IMAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageOpenGLESKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageOpenGLESKHR.NEXT, value); }
    /** Unsafe version of {@link #image(int) image}. */
    public static void nimage(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageOpenGLESKHR.IMAGE, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageOpenGLESKHR} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageOpenGLESKHR, Buffer> implements NativeResource {

        private static final XrSwapchainImageOpenGLESKHR ELEMENT_FACTORY = XrSwapchainImageOpenGLESKHR.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageOpenGLESKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageOpenGLESKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageOpenGLESKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageOpenGLESKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageOpenGLESKHR.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageOpenGLESKHR#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageOpenGLESKHR.nnext(address()); }
        /** @return the value of the {@link XrSwapchainImageOpenGLESKHR#image} field. */
        @NativeType("uint32_t")
        public int image() { return XrSwapchainImageOpenGLESKHR.nimage(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageOpenGLESKHR#type} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageOpenGLESKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR} value to the {@link XrSwapchainImageOpenGLESKHR#type} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer type$Default() { return type(KHROpenGLESEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR); }
        /** Sets the specified value to the {@link XrSwapchainImageOpenGLESKHR#next} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer next(@NativeType("void *") long value) { XrSwapchainImageOpenGLESKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainImageOpenGLESKHR#image} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer image(@NativeType("uint32_t") int value) { XrSwapchainImageOpenGLESKHR.nimage(address(), value); return this; }

    }

}