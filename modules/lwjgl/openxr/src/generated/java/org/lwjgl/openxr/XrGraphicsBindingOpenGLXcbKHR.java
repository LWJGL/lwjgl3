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
 * struct XrGraphicsBindingOpenGLXcbKHR {
 *     XrStructureType type;
 *     void const * next;
 *     xcb_connection_t * connection;
 *     uint32_t screenNumber;
 *     xcb_glx_fbconfig_t fbconfigid;
 *     xcb_visualid_t visualid;
 *     xcb_glx_drawable_t glxDrawable;
 *     xcb_glx_context_t glxContext;
 * }}</pre>
 */
public class XrGraphicsBindingOpenGLXcbKHR extends Struct<XrGraphicsBindingOpenGLXcbKHR> implements NativeResource {

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

    protected XrGraphicsBindingOpenGLXcbKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingOpenGLXcbKHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingOpenGLXcbKHR(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code connection} field. */
    @NativeType("xcb_connection_t *")
    public long connection() { return nconnection(address()); }
    /** @return the value of the {@code screenNumber} field. */
    @NativeType("uint32_t")
    public int screenNumber() { return nscreenNumber(address()); }
    /** @return the value of the {@code fbconfigid} field. */
    @NativeType("xcb_glx_fbconfig_t")
    public int fbconfigid() { return nfbconfigid(address()); }
    /** @return the value of the {@code visualid} field. */
    @NativeType("xcb_visualid_t")
    public int visualid() { return nvisualid(address()); }
    /** @return the value of the {@code glxDrawable} field. */
    @NativeType("xcb_glx_drawable_t")
    public int glxDrawable() { return nglxDrawable(address()); }
    /** @return the value of the {@code glxContext} field. */
    @NativeType("xcb_glx_context_t")
    public int glxContext() { return nglxContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingOpenGLXcbKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR} value to the {@code type} field. */
    public XrGraphicsBindingOpenGLXcbKHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingOpenGLXcbKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code connection} field. */
    public XrGraphicsBindingOpenGLXcbKHR connection(@NativeType("xcb_connection_t *") long value) { nconnection(address(), value); return this; }
    /** Sets the specified value to the {@code screenNumber} field. */
    public XrGraphicsBindingOpenGLXcbKHR screenNumber(@NativeType("uint32_t") int value) { nscreenNumber(address(), value); return this; }
    /** Sets the specified value to the {@code fbconfigid} field. */
    public XrGraphicsBindingOpenGLXcbKHR fbconfigid(@NativeType("xcb_glx_fbconfig_t") int value) { nfbconfigid(address(), value); return this; }
    /** Sets the specified value to the {@code visualid} field. */
    public XrGraphicsBindingOpenGLXcbKHR visualid(@NativeType("xcb_visualid_t") int value) { nvisualid(address(), value); return this; }
    /** Sets the specified value to the {@code glxDrawable} field. */
    public XrGraphicsBindingOpenGLXcbKHR glxDrawable(@NativeType("xcb_glx_drawable_t") int value) { nglxDrawable(address(), value); return this; }
    /** Sets the specified value to the {@code glxContext} field. */
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
        return new XrGraphicsBindingOpenGLXcbKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLXcbKHR calloc() {
        return new XrGraphicsBindingOpenGLXcbKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLXcbKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingOpenGLXcbKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLXcbKHR create(long address) {
        return new XrGraphicsBindingOpenGLXcbKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingOpenGLXcbKHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingOpenGLXcbKHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingOpenGLXcbKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXcbKHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLXcbKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXcbKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXcbKHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLXcbKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXcbKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXcbKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXcbKHR.NEXT); }
    /** Unsafe version of {@link #connection}. */
    public static long nconnection(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXcbKHR.CONNECTION); }
    /** Unsafe version of {@link #screenNumber}. */
    public static int nscreenNumber(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.SCREENNUMBER); }
    /** Unsafe version of {@link #fbconfigid}. */
    public static int nfbconfigid(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.FBCONFIGID); }
    /** Unsafe version of {@link #visualid}. */
    public static int nvisualid(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.VISUALID); }
    /** Unsafe version of {@link #glxDrawable}. */
    public static int nglxDrawable(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.GLXDRAWABLE); }
    /** Unsafe version of {@link #glxContext}. */
    public static int nglxContext(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLXcbKHR.GLXCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXcbKHR.NEXT, value); }
    /** Unsafe version of {@link #connection(long) connection}. */
    public static void nconnection(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXcbKHR.CONNECTION, check(value)); }
    /** Unsafe version of {@link #screenNumber(int) screenNumber}. */
    public static void nscreenNumber(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.SCREENNUMBER, value); }
    /** Unsafe version of {@link #fbconfigid(int) fbconfigid}. */
    public static void nfbconfigid(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.FBCONFIGID, value); }
    /** Unsafe version of {@link #visualid(int) visualid}. */
    public static void nvisualid(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.VISUALID, value); }
    /** Unsafe version of {@link #glxDrawable(int) glxDrawable}. */
    public static void nglxDrawable(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.GLXDRAWABLE, value); }
    /** Unsafe version of {@link #glxContext(int) glxContext}. */
    public static void nglxContext(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLXcbKHR.GLXCONTEXT, value); }

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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLXcbKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsBindingOpenGLXcbKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLXcbKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLXcbKHR.nnext(address()); }
        /** @return the value of the {@code connection} field. */
        @NativeType("xcb_connection_t *")
        public long connection() { return XrGraphicsBindingOpenGLXcbKHR.nconnection(address()); }
        /** @return the value of the {@code screenNumber} field. */
        @NativeType("uint32_t")
        public int screenNumber() { return XrGraphicsBindingOpenGLXcbKHR.nscreenNumber(address()); }
        /** @return the value of the {@code fbconfigid} field. */
        @NativeType("xcb_glx_fbconfig_t")
        public int fbconfigid() { return XrGraphicsBindingOpenGLXcbKHR.nfbconfigid(address()); }
        /** @return the value of the {@code visualid} field. */
        @NativeType("xcb_visualid_t")
        public int visualid() { return XrGraphicsBindingOpenGLXcbKHR.nvisualid(address()); }
        /** @return the value of the {@code glxDrawable} field. */
        @NativeType("xcb_glx_drawable_t")
        public int glxDrawable() { return XrGraphicsBindingOpenGLXcbKHR.nglxDrawable(address()); }
        /** @return the value of the {@code glxContext} field. */
        @NativeType("xcb_glx_context_t")
        public int glxContext() { return XrGraphicsBindingOpenGLXcbKHR.nglxContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLXcbKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR} value to the {@code type} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_XCB_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLXcbKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code connection} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer connection(@NativeType("xcb_connection_t *") long value) { XrGraphicsBindingOpenGLXcbKHR.nconnection(address(), value); return this; }
        /** Sets the specified value to the {@code screenNumber} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer screenNumber(@NativeType("uint32_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nscreenNumber(address(), value); return this; }
        /** Sets the specified value to the {@code fbconfigid} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer fbconfigid(@NativeType("xcb_glx_fbconfig_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nfbconfigid(address(), value); return this; }
        /** Sets the specified value to the {@code visualid} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer visualid(@NativeType("xcb_visualid_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nvisualid(address(), value); return this; }
        /** Sets the specified value to the {@code glxDrawable} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer glxDrawable(@NativeType("xcb_glx_drawable_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nglxDrawable(address(), value); return this; }
        /** Sets the specified value to the {@code glxContext} field. */
        public XrGraphicsBindingOpenGLXcbKHR.Buffer glxContext(@NativeType("xcb_glx_context_t") int value) { XrGraphicsBindingOpenGLXcbKHR.nglxContext(address(), value); return this; }

    }

}