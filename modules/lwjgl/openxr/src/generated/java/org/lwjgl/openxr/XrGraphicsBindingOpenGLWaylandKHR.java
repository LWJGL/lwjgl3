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
 * The graphics binding structure to be passed at session creation to use OpenGL on Wayland.
 * 
 * <h5>Description</h5>
 * 
 * <p>When creating an OpenGL-backed {@code XrSession} on any Linux/Unix platform that utilizes the Wayland protocol with its compositor, the application will provide a pointer to an {@link XrGraphicsBindingOpenGLWaylandKHR} in the {@code next} chain of the {@link XrSessionCreateInfo}.</p>
 * 
 * <p>The required window system configuration define to expose this structure type is {@link XR10#XR_USE_PLATFORM_WAYLAND USE_PLATFORM_WAYLAND}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLEnable XR_KHR_opengl_enable} extension <b>must</b> be enabled prior to using {@link XrGraphicsBindingOpenGLWaylandKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code display} <b>must</b> be a pointer to a {@code wl_display} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLWaylandKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     struct wl_display * {@link #display};
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLWaylandKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISPLAY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISPLAY = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLWaylandKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLWaylandKHR(ByteBuffer container) {
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
    /** a valid Wayland {@code wl_display}. */
    @NativeType("struct wl_display *")
    public long display() { return ndisplay(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLWaylandKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR} value to the {@link #type} field. */
    public XrGraphicsBindingOpenGLWaylandKHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrGraphicsBindingOpenGLWaylandKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XrGraphicsBindingOpenGLWaylandKHR display(@NativeType("struct wl_display *") long value) { ndisplay(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLWaylandKHR set(
        int type,
        long next,
        long display
    ) {
        type(type);
        next(next);
        display(display);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingOpenGLWaylandKHR set(XrGraphicsBindingOpenGLWaylandKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWaylandKHR malloc() {
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWaylandKHR calloc() {
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLWaylandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLWaylandKHR create(long address) {
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWaylandKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsBindingOpenGLWaylandKHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWaylandKHR malloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWaylandKHR calloc(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLWaylandKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLWaylandKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.NEXT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.DISPLAY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLWaylandKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.NEXT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.DISPLAY, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingOpenGLWaylandKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLWaylandKHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLWaylandKHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLWaylandKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLWaylandKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsBindingOpenGLWaylandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrGraphicsBindingOpenGLWaylandKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLWaylandKHR.ntype(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLWaylandKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLWaylandKHR.nnext(address()); }
        /** @return the value of the {@link XrGraphicsBindingOpenGLWaylandKHR#display} field. */
        @NativeType("struct wl_display *")
        public long display() { return XrGraphicsBindingOpenGLWaylandKHR.ndisplay(address()); }

        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWaylandKHR#type} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLWaylandKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR} value to the {@link XrGraphicsBindingOpenGLWaylandKHR#type} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR); }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWaylandKHR#next} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLWaylandKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsBindingOpenGLWaylandKHR#display} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer display(@NativeType("struct wl_display *") long value) { XrGraphicsBindingOpenGLWaylandKHR.ndisplay(address(), value); return this; }

    }

}