/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrGraphicsBindingOpenGLWaylandKHR {
 *     XrStructureType type;
 *     void const * next;
 *     struct wl_display * display;
 * }}</pre>
 */
public class XrGraphicsBindingOpenGLWaylandKHR extends Struct<XrGraphicsBindingOpenGLWaylandKHR> implements NativeResource {

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

    protected XrGraphicsBindingOpenGLWaylandKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingOpenGLWaylandKHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingOpenGLWaylandKHR(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code display} field. */
    @NativeType("struct wl_display *")
    public long display() { return ndisplay(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingOpenGLWaylandKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR} value to the {@code type} field. */
    public XrGraphicsBindingOpenGLWaylandKHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingOpenGLWaylandKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code display} field. */
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
        return new XrGraphicsBindingOpenGLWaylandKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWaylandKHR calloc() {
        return new XrGraphicsBindingOpenGLWaylandKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLWaylandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingOpenGLWaylandKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLWaylandKHR create(long address) {
        return new XrGraphicsBindingOpenGLWaylandKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingOpenGLWaylandKHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingOpenGLWaylandKHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingOpenGLWaylandKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWaylandKHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLWaylandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWaylandKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWaylandKHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLWaylandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWaylandKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWaylandKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLWaylandKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.NEXT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWaylandKHR.DISPLAY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLWaylandKHR.TYPE, value); }
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLWaylandKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrGraphicsBindingOpenGLWaylandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLWaylandKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLWaylandKHR.nnext(address()); }
        /** @return the value of the {@code display} field. */
        @NativeType("struct wl_display *")
        public long display() { return XrGraphicsBindingOpenGLWaylandKHR.ndisplay(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLWaylandKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR} value to the {@code type} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WAYLAND_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLWaylandKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XrGraphicsBindingOpenGLWaylandKHR.Buffer display(@NativeType("struct wl_display *") long value) { XrGraphicsBindingOpenGLWaylandKHR.ndisplay(address(), value); return this; }

    }

}