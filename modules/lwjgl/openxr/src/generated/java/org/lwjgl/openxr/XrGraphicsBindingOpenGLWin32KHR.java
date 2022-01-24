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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.system.windows.*;

/**
 * The graphics binding structure to be passed at session creation to use OpenGL on Windows.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating an OpenGL-backed {@code XrSession} on Microsoft Windows, the application will provide a pointer to an {@link XrGraphicsBindingOpenGLWin32KHR} in the {@code next} chain of the {@link XrSessionCreateInfo}. As no standardized way exists for OpenGL to create the graphics context on a specific GPU, the runtime <b>must</b> assume that the application uses the operating systems default GPU. If the GPU used by the runtime does not match the GPU on which the OpenGL context of the application got created, {@link XR10#xrCreateSession CreateSession} <b>must</b> return {@link XR10#XR_ERROR_GRAPHICS_DEVICE_INVALID ERROR_GRAPHICS_DEVICE_INVALID}.</p>
 * 
 * <p>The required window system configuration define to expose this structure type is {@link XR10#XR_USE_PLATFORM_WIN32 USE_PLATFORM_WIN32}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using {@link XrGraphicsBindingOpenGLWin32KHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code hDC} <b>must</b> be a valid {@code HDC} value</li>
 * <li>{@code hGLRC} <b>must</b> be a valid {@code HGLRC} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLWin32KHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     HDC {@link #hDC};
 *     HGLRC {@link #hGLRC};
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLWin32KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HDC,
        HGLRC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HDC = layout.offsetof(2);
        HGLRC = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLWin32KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLWin32KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a valid Windows HW device context handle. */
    @NativeType("HDC")
    public long hDC() { return nhDC(address()); }
    /** a valid Windows OpenGL rendering context handle. */
    @NativeType("HGLRC")
    public long hGLRC() { return nhGLRC(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLWin32KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR} value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLWin32KHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrGraphicsBindingOpenGLWin32KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #hDC} field. */
    public XrGraphicsBindingOpenGLWin32KHR hDC(@NativeType("HDC") long value) { nhDC(address(), value); return this; }
    /** Sets the specified value to the {@link #hGLRC} field. */
    public XrGraphicsBindingOpenGLWin32KHR hGLRC(@NativeType("HGLRC") long value) { nhGLRC(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLWin32KHR set(
        int type,
        long next,
        long hDC,
        long hGLRC
    ) {
        type(type);
        next(next);
        hDC(hDC);
        hGLRC(hGLRC);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingOpenGLWin32KHR set(XrGraphicsBindingOpenGLWin32KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWin32KHR malloc() {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWin32KHR calloc() {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLWin32KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLWin32KHR create(long address) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWin32KHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsBindingOpenGLWin32KHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR malloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR calloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWin32KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLWin32KHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT); }
    /** Unsafe version of {@link #hDC}. */
    public static long nhDC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC); }
    /** Unsafe version of {@link #hGLRC}. */
    public static long nhGLRC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLWin32KHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT, value); }
    /** Unsafe version of {@link #hDC(long) hDC}. */
    public static void nhDC(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC, check(value)); }
    /** Unsafe version of {@link #hGLRC(long) hGLRC}. */
    public static void nhGLRC(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingOpenGLWin32KHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLWin32KHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLWin32KHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLWin32KHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLWin32KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLWin32KHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsBindingOpenGLWin32KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrGraphicsBindingOpenGLWin32KHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLWin32KHR.ntype(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLWin32KHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLWin32KHR.nnext(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLWin32KHR#hDC} field. */
        @NativeType("HDC")
        public long hDC() { return XrGraphicsBindingOpenGLWin32KHR.nhDC(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLWin32KHR#hGLRC} field. */
        @NativeType("HGLRC")
        public long hGLRC() { return XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address()); }

        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWin32KHR#type} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLWin32KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR} value to the {@link XrGraphicsBindingOpenGLWin32KHR#type} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR); }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWin32KHR#next} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLWin32KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWin32KHR#hDC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hDC(@NativeType("HDC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhDC(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWin32KHR#hGLRC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hGLRC(@NativeType("HGLRC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address(), value); return this; }

    }

}