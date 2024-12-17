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

import org.lwjgl.system.windows.*;

/**
 * <pre>{@code
 * struct XrGraphicsBindingOpenGLWin32KHR {
 *     XrStructureType type;
 *     void const * next;
 *     HDC hDC;
 *     HGLRC hGLRC;
 * }}</pre>
 */
public class XrGraphicsBindingOpenGLWin32KHR extends Struct<XrGraphicsBindingOpenGLWin32KHR> implements NativeResource {

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

    protected XrGraphicsBindingOpenGLWin32KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingOpenGLWin32KHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingOpenGLWin32KHR(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code hDC} field. */
    @NativeType("HDC")
    public long hDC() { return nhDC(address()); }
    /** @return the value of the {@code hGLRC} field. */
    @NativeType("HGLRC")
    public long hGLRC() { return nhGLRC(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingOpenGLWin32KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR} value to the {@code type} field. */
    public XrGraphicsBindingOpenGLWin32KHR type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingOpenGLWin32KHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code hDC} field. */
    public XrGraphicsBindingOpenGLWin32KHR hDC(@NativeType("HDC") long value) { nhDC(address(), value); return this; }
    /** Sets the specified value to the {@code hGLRC} field. */
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
        return new XrGraphicsBindingOpenGLWin32KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLWin32KHR calloc() {
        return new XrGraphicsBindingOpenGLWin32KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLWin32KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingOpenGLWin32KHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLWin32KHR create(long address) {
        return new XrGraphicsBindingOpenGLWin32KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingOpenGLWin32KHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingOpenGLWin32KHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingOpenGLWin32KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR malloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLWin32KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLWin32KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLWin32KHR calloc(MemoryStack stack) {
        return new XrGraphicsBindingOpenGLWin32KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLWin32KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLWin32KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsBindingOpenGLWin32KHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.NEXT); }
    /** Unsafe version of {@link #hDC}. */
    public static long nhDC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HDC); }
    /** Unsafe version of {@link #hGLRC}. */
    public static long nhGLRC(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLWin32KHR.HGLRC); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsBindingOpenGLWin32KHR.TYPE, value); }
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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLWin32KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsBindingOpenGLWin32KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLWin32KHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLWin32KHR.nnext(address()); }
        /** @return the value of the {@code hDC} field. */
        @NativeType("HDC")
        public long hDC() { return XrGraphicsBindingOpenGLWin32KHR.nhDC(address()); }
        /** @return the value of the {@code hGLRC} field. */
        @NativeType("HGLRC")
        public long hGLRC() { return XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLWin32KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLEnable#XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR} value to the {@code type} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer type$Default() { return type(KHROpenGLEnable.XR_TYPE_GRAPHICS_BINDING_OPENGL_WIN32_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLWin32KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code hDC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hDC(@NativeType("HDC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhDC(address(), value); return this; }
        /** Sets the specified value to the {@code hGLRC} field. */
        public XrGraphicsBindingOpenGLWin32KHR.Buffer hGLRC(@NativeType("HGLRC") long value) { XrGraphicsBindingOpenGLWin32KHR.nhGLRC(address(), value); return this; }

    }

}