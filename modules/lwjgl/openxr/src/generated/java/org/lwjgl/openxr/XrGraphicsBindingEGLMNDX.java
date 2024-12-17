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

import org.lwjgl.egl.*;

/**
 * <pre>{@code
 * struct XrGraphicsBindingEGLMNDX {
 *     XrStructureType type;
 *     void const * next;
 *     PFN_xrEglGetProcAddressMNDX getProcAddress;
 *     EGLDisplay display;
 *     EGLConfig config;
 *     EGLContext context;
 * }}</pre>
 */
public class XrGraphicsBindingEGLMNDX extends Struct<XrGraphicsBindingEGLMNDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GETPROCADDRESS,
        DISPLAY,
        CONFIG,
        CONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GETPROCADDRESS = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        CONFIG = layout.offsetof(4);
        CONTEXT = layout.offsetof(5);
    }

    protected XrGraphicsBindingEGLMNDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsBindingEGLMNDX create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsBindingEGLMNDX(address, container);
    }

    /**
     * Creates a {@code XrGraphicsBindingEGLMNDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingEGLMNDX(ByteBuffer container) {
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
    /** @return the value of the {@code getProcAddress} field. */
    @NativeType("PFN_xrEglGetProcAddressMNDX")
    public long getProcAddress() { return ngetProcAddress(address()); }
    /** @return the value of the {@code display} field. */
    @NativeType("EGLDisplay")
    public long display() { return ndisplay(address()); }
    /** @return the value of the {@code config} field. */
    @NativeType("EGLConfig")
    public long config() { return nconfig(address()); }
    /** @return the value of the {@code context} field. */
    @NativeType("EGLContext")
    public long context() { return ncontext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingEGLMNDX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MNDXEGLEnable#XR_TYPE_GRAPHICS_BINDING_EGL_MNDX TYPE_GRAPHICS_BINDING_EGL_MNDX} value to the {@code type} field. */
    public XrGraphicsBindingEGLMNDX type$Default() { return type(MNDXEGLEnable.XR_TYPE_GRAPHICS_BINDING_EGL_MNDX); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingEGLMNDX next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code getProcAddress} field. */
    public XrGraphicsBindingEGLMNDX getProcAddress(@NativeType("PFN_xrEglGetProcAddressMNDX") long value) { ngetProcAddress(address(), value); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XrGraphicsBindingEGLMNDX display(@NativeType("EGLDisplay") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code config} field. */
    public XrGraphicsBindingEGLMNDX config(@NativeType("EGLConfig") long value) { nconfig(address(), value); return this; }
    /** Sets the specified value to the {@code context} field. */
    public XrGraphicsBindingEGLMNDX context(@NativeType("EGLContext") long value) { ncontext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingEGLMNDX set(
        int type,
        long next,
        long getProcAddress,
        long display,
        long config,
        long context
    ) {
        type(type);
        next(next);
        getProcAddress(getProcAddress);
        display(display);
        config(config);
        context(context);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsBindingEGLMNDX set(XrGraphicsBindingEGLMNDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingEGLMNDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingEGLMNDX malloc() {
        return new XrGraphicsBindingEGLMNDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingEGLMNDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingEGLMNDX calloc() {
        return new XrGraphicsBindingEGLMNDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsBindingEGLMNDX} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingEGLMNDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsBindingEGLMNDX(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingEGLMNDX} instance for the specified memory address. */
    public static XrGraphicsBindingEGLMNDX create(long address) {
        return new XrGraphicsBindingEGLMNDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsBindingEGLMNDX createSafe(long address) {
        return address == NULL ? null : new XrGraphicsBindingEGLMNDX(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingEGLMNDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingEGLMNDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingEGLMNDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsBindingEGLMNDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsBindingEGLMNDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsBindingEGLMNDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingEGLMNDX malloc(MemoryStack stack) {
        return new XrGraphicsBindingEGLMNDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsBindingEGLMNDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingEGLMNDX calloc(MemoryStack stack) {
        return new XrGraphicsBindingEGLMNDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsBindingEGLMNDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingEGLMNDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingEGLMNDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsBindingEGLMNDX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingEGLMNDX.NEXT); }
    /** Unsafe version of {@link #getProcAddress}. */
    public static long ngetProcAddress(long struct) { return memGetAddress(struct + XrGraphicsBindingEGLMNDX.GETPROCADDRESS); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XrGraphicsBindingEGLMNDX.DISPLAY); }
    /** Unsafe version of {@link #config}. */
    public static long nconfig(long struct) { return memGetAddress(struct + XrGraphicsBindingEGLMNDX.CONFIG); }
    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + XrGraphicsBindingEGLMNDX.CONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsBindingEGLMNDX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingEGLMNDX.NEXT, value); }
    /** Unsafe version of {@link #getProcAddress(long) getProcAddress}. */
    public static void ngetProcAddress(long struct, long value) { memPutAddress(struct + XrGraphicsBindingEGLMNDX.GETPROCADDRESS, check(value)); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XrGraphicsBindingEGLMNDX.DISPLAY, check(value)); }
    /** Unsafe version of {@link #config(long) config}. */
    public static void nconfig(long struct, long value) { memPutAddress(struct + XrGraphicsBindingEGLMNDX.CONFIG, check(value)); }
    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingEGLMNDX.CONTEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingEGLMNDX.GETPROCADDRESS));
        check(memGetAddress(struct + XrGraphicsBindingEGLMNDX.DISPLAY));
        check(memGetAddress(struct + XrGraphicsBindingEGLMNDX.CONFIG));
        check(memGetAddress(struct + XrGraphicsBindingEGLMNDX.CONTEXT));
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingEGLMNDX} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingEGLMNDX, Buffer> implements NativeResource {

        private static final XrGraphicsBindingEGLMNDX ELEMENT_FACTORY = XrGraphicsBindingEGLMNDX.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingEGLMNDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingEGLMNDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsBindingEGLMNDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingEGLMNDX.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingEGLMNDX.nnext(address()); }
        /** @return the value of the {@code getProcAddress} field. */
        @NativeType("PFN_xrEglGetProcAddressMNDX")
        public long getProcAddress() { return XrGraphicsBindingEGLMNDX.ngetProcAddress(address()); }
        /** @return the value of the {@code display} field. */
        @NativeType("EGLDisplay")
        public long display() { return XrGraphicsBindingEGLMNDX.ndisplay(address()); }
        /** @return the value of the {@code config} field. */
        @NativeType("EGLConfig")
        public long config() { return XrGraphicsBindingEGLMNDX.nconfig(address()); }
        /** @return the value of the {@code context} field. */
        @NativeType("EGLContext")
        public long context() { return XrGraphicsBindingEGLMNDX.ncontext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingEGLMNDX.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingEGLMNDX.ntype(address(), value); return this; }
        /** Sets the {@link MNDXEGLEnable#XR_TYPE_GRAPHICS_BINDING_EGL_MNDX TYPE_GRAPHICS_BINDING_EGL_MNDX} value to the {@code type} field. */
        public XrGraphicsBindingEGLMNDX.Buffer type$Default() { return type(MNDXEGLEnable.XR_TYPE_GRAPHICS_BINDING_EGL_MNDX); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingEGLMNDX.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingEGLMNDX.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code getProcAddress} field. */
        public XrGraphicsBindingEGLMNDX.Buffer getProcAddress(@NativeType("PFN_xrEglGetProcAddressMNDX") long value) { XrGraphicsBindingEGLMNDX.ngetProcAddress(address(), value); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XrGraphicsBindingEGLMNDX.Buffer display(@NativeType("EGLDisplay") long value) { XrGraphicsBindingEGLMNDX.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code config} field. */
        public XrGraphicsBindingEGLMNDX.Buffer config(@NativeType("EGLConfig") long value) { XrGraphicsBindingEGLMNDX.nconfig(address(), value); return this; }
        /** Sets the specified value to the {@code context} field. */
        public XrGraphicsBindingEGLMNDX.Buffer context(@NativeType("EGLContext") long value) { XrGraphicsBindingEGLMNDX.ncontext(address(), value); return this; }

    }

}