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

/**
 * The graphics binding structure to be passed at session creation to use OpenGL on X11 via XCB.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating an OpenGL-backed {@code XrSession} on any Linux/Unix platform that utilizes X11 and GLX, via the Xlib library, the application will provide a pointer to an {@link XrGraphicsBindingOpenGLXcbKHR} in the {@code next} chain of the {@link XrSessionCreateInfo}.</p>
 * 
 * <p>The required window system configuration define to expose this structure type is {@link XR10#XR_USE_PLATFORM_XCB USE_PLATFORM_XCB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using {@link XrGraphicsBindingOpenGLXcbKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code connection} <b>must</b> be a pointer to an {@code xcb_connection_t} value</li>
 * <li>{@code fbconfigid} <b>must</b> be a valid {@code xcb_glx_fbconfig_t} value</li>
 * <li>{@code visualid} <b>must</b> be a valid {@code xcb_visualid_t} value</li>
 * <li>{@code glxDrawable} <b>must</b> be a valid {@code xcb_glx_drawable_t} value</li>
 * <li>{@code glxContext} <b>must</b> be a valid {@code xcb_glx_context_t} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLXcbKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     xcb_connection_t * {@link #connection};
 *     uint32_t {@link #screenNumber};
 *     xcb_glx_fbconfig_t {@link #fbconfigid};
 *     xcb_visualid_t {@link #visualid};
 *     xcb_glx_drawable_t {@link #glxDrawable};
 *     xcb_glx_context_t {@link #glxContext};
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLXcbKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CONNECTION,
        SCREENNUMBER,
        FBCONFIGID,
        VISUALID,
        GLXDRAWABLE,
        GLXCONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CONNECTION = layout.offsetof(2);
        SCREENNUMBER = layout.offsetof(3);
        FBCONFIGID = layout.offsetof(4);
        VISUALID = layout.offsetof(5);
        GLXDRAWABLE = layout.offsetof(6);
        GLXCONTEXT = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLXcbKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLXcbKHR(ByteBuffer container) {
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
    /** a valid {@code xcb_connection_t}. */
    @NativeType("xcb_connection_t *")
    public long connection() { return nconnection(address()); }
    /** an index indicating which screen should be used for rendering. */
    @NativeType("uint32_t")
    public int screenNumber() { return nscreenNumber(address()); }
    /** a valid XCB OpenGL GLX {@code xcb_glx_fbconfig_t}. */
    @NativeType("xcb_glx_fbconfig_t")
    public int fbconfigid() { return nfbconfigid(address()); }
    /** a valid XCB OpenGL GLX {@code xcb_visualid_t}. */
    @NativeType("xcb_visualid_t")
    public int visualid() { return nvisualid(address()); }
    /** a valid XCB OpenGL GLX {@code xcb_glx_drawable_t}. */
    @NativeType("xcb_glx_drawable_t")
    public int glxDrawable() { return nglxDrawable(address()); }
    /** a valid XCB OpenGL GLX {@code xcb_glx_context_t}. */
    @NativeType("xcb_glx_context_t")
    public int glxContext() { return nglxContext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLXcbKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR} value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLXcbKHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrGraphicsBindingOpenGLXcbKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #connection} field. */
    public XrGraphicsBindingOpenGLXcbKHR connection(@NativeType("xcb_connection_t *") long value) { nconnection(address(), value); return this; }
    /** Sets the specified value to the {@link #screenNumber} field. */
    public XrGraphicsBindingOpenGLXcbKHR screenNumber(@NativeType("uint32_t") int value) { nscreenNumber(address(), value); return this; }
    /** Sets the specified value to the {@link #fbconfigid} field. */
    public XrGraphicsBindingOpenGLXcbKHR fbconfigid(@NativeType("xcb_glx_fbconfig_t") int value) { nfbconfigid(address(), value); return this; }
    /** Sets the specified value to the {@link #visualid} field. */
    public XrGraphicsBindingOpenGLXcbKHR visualid(@NativeType("xcb_visualid_t") int value) { nvisualid(address(), value); return this; }
    /** Sets the specified value to the {@link #glxDrawable} field. */
    public XrGraphicsBindingOpenGLXcbKHR glxDrawable(@NativeType("xcb_glx_drawable_t") int value) { nglxDrawable(address(), value); return this; }
    /** Sets the specified value to the {@link #glxContext} field. */
    public XrGraphicsBindingOpenGLXcbKHR glxContext(@NativeType("xcb_glx_context_t") int value) { nglxContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLXcbKHR set(
        int type,
        long next,
        long connection,
        int screenNumber,
        int fbconfigid,
        int visualid,
        int glxDrawable,
        int glxContext
    ) {
        type(type);
        next(next);
        connection(connection);
        screenNumber(screenNumber);
        fbconfigid(fbconfigid);
        visualid(visualid);
        glxDrawable(glxDrawable);
        glxContext(glxContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingOpenGLXcbKHR set(XrGraphicsBindingOpenGLXcbKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLXcbKHR malloc() {
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLXcbKHR calloc() {
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLXcbKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLXcbKHR create(long address) {
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLXcbKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsBindingOpenGLXcbKHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXcbKHR malloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXcbKHR calloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLXcbKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXcbKHR.NEXT); }
    /** Unsafe version of {@link #connection}. */
    public static long nconnection(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXcbKHR.CONNECTION); }
    /** Unsafe version of {@link #screenNumber}. */
    public static int nscreenNumber(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.SCREENNUMBER); }
    /** Unsafe version of {@link #fbconfigid}. */
    public static int nfbconfigid(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.FBCONFIGID); }
    /** Unsafe version of {@link #visualid}. */
    public static int nvisualid(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.VISUALID); }
    /** Unsafe version of {@link #glxDrawable}. */
    public static int nglxDrawable(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.GLXDRAWABLE); }
    /** Unsafe version of {@link #glxContext}. */
    public static int nglxContext(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.GLXCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXcbKHR.NEXT, value); }
    /** Unsafe version of {@link #connection(long) connection}. */
    public static void nconnection(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXcbKHR.CONNECTION, check(value)); }
    /** Unsafe version of {@link #screenNumber(int) screenNumber}. */
    public static void nscreenNumber(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.SCREENNUMBER, value); }
    /** Unsafe version of {@link #fbconfigid(int) fbconfigid}. */
    public static void nfbconfigid(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.FBCONFIGID, value); }
    /** Unsafe version of {@link #visualid(int) visualid}. */
    public static void nvisualid(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.VISUALID, value); }
    /** Unsafe version of {@link #glxDrawable(int) glxDrawable}. */
    public static void nglxDrawable(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.GLXDRAWABLE, value); }
    /** Unsafe version of {@link #glxContext(int) glxContext}. */
    public static void nglxContext(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXcbKHR.GLXCONTEXT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLXcbKHR.CONNECTION));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingOpenGLXcbKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLXcbKHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLXcbKHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLXcbKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLXcbKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLXcbKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsBindingOpenGLXcbKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLXcbKHR.ntype(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLXcbKHR.nnext(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#connection} field. */
        @NativeType("xcb_connection_t *")
        public long connection() { return XrGraphicsBindingOpenGLXcbKHR.nconnection(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#screenNumber} field. */
        @NativeType("uint32_t")
        public int screenNumber() { return XrGraphicsBindingOpenGLXcbKHR.nscreenNumber(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#fbconfigid} field. */
        @NativeType("xcb_glx_fbconfig_t")
        public int fbconfigid() { return XrGraphicsBindingOpenGLXcbKHR.nfbconfigid(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#visualid} field. */
        @NativeType("xcb_visualid_t")
        public int visualid() { return XrGraphicsBindingOpenGLXcbKHR.nvisualid(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#glxDrawable} field. */
        @NativeType("xcb_glx_drawable_t")
        public int glxDrawable() { return XrGraphicsBindingOpenGLXcbKHR.nglxDrawable(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLXcbKHR#glxContext} field. */
        @NativeType("xcb_glx_context_t")
        public int glxContext() { return XrGraphicsBindingOpenGLXcbKHR.nglxContext(address()); }

        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#type} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLXcbKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR} value to the {@link XrGraphicsBindingOpenGLXcbKHR#type} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR); }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#next} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLXcbKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#connection} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer connection(@NativeType("xcb_connection_t *") long value) { XrGraphicsBindingOpenGLXcbKHR.nconnection(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#screenNumber} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer screenNumber(@NativeType("uint32_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nscreenNumber(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#fbconfigid} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer fbconfigid(@NativeType("xcb_glx_fbconfig_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nfbconfigid(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#visualid} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer visualid(@NativeType("xcb_visualid_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nvisualid(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#glxDrawable} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer glxDrawable(@NativeType("xcb_glx_drawable_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nglxDrawable(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLXcbKHR#glxContext} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer glxContext(@NativeType("xcb_glx_context_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nglxContext(address(), value); return this; }

    }

}