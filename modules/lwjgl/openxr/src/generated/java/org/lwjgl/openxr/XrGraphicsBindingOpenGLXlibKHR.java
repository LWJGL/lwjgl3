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

import org.lwjgl.system.linux.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsBindingOpenGLXlibKHR {
 *     XrStructureType type;
 *     void const * next;
 *     Display * xDisplay;
 *     uint32_t visualid;
 *     GLXFBConfig glxFBConfig;
 *     GLXDrawable glxDrawable;
 *     GLXContext glxContext;
 * }</code></pre>
 */
public class XrGraphicsBindingOpenGLXlibKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        XDISPLAY,
        VISUALID,
        GLXFBCONFIG,
        GLXDRAWABLE,
        GLXCONTEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        XDISPLAY = layout.offsetof(2);
        VISUALID = layout.offsetof(3);
        GLXFBCONFIG = layout.offsetof(4);
        GLXDRAWABLE = layout.offsetof(5);
        GLXCONTEXT = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrGraphicsBindingOpenGLXlibKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsBindingOpenGLXlibKHR(ByteBuffer container) {
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
    /** @return the value of the {@code xDisplay} field. */
    @NativeType("Display *")
    public long xDisplay() { return nxDisplay(address()); }
    /** @return the value of the {@code visualid} field. */
    @NativeType("uint32_t")
    public int visualid() { return nvisualid(address()); }
    /** @return the value of the {@code glxFBConfig} field. */
    @NativeType("GLXFBConfig")
    public long glxFBConfig() { return nglxFBConfig(address()); }
    /** @return the value of the {@code glxDrawable} field. */
    @NativeType("GLXDrawable")
    public long glxDrawable() { return nglxDrawable(address()); }
    /** @return the value of the {@code glxContext} field. */
    @NativeType("GLXContext")
    public long glxContext() { return nglxContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsBindingOpenGLXlibKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsBindingOpenGLXlibKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code xDisplay} field. */
    public XrGraphicsBindingOpenGLXlibKHR xDisplay(@NativeType("Display *") long value) { nxDisplay(address(), value); return this; }
    /** Sets the specified value to the {@code visualid} field. */
    public XrGraphicsBindingOpenGLXlibKHR visualid(@NativeType("uint32_t") int value) { nvisualid(address(), value); return this; }
    /** Sets the specified value to the {@code glxFBConfig} field. */
    public XrGraphicsBindingOpenGLXlibKHR glxFBConfig(@NativeType("GLXFBConfig") long value) { nglxFBConfig(address(), value); return this; }
    /** Sets the specified value to the {@code glxDrawable} field. */
    public XrGraphicsBindingOpenGLXlibKHR glxDrawable(@NativeType("GLXDrawable") long value) { nglxDrawable(address(), value); return this; }
    /** Sets the specified value to the {@code glxContext} field. */
    public XrGraphicsBindingOpenGLXlibKHR glxContext(@NativeType("GLXContext") long value) { nglxContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsBindingOpenGLXlibKHR set(
        int type,
        long next,
        long xDisplay,
        int visualid,
        long glxFBConfig,
        long glxDrawable,
        long glxContext
    ) {
        type(type);
        next(next);
        xDisplay(xDisplay);
        visualid(visualid);
        glxFBConfig(glxFBConfig);
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
    public XrGraphicsBindingOpenGLXlibKHR set(XrGraphicsBindingOpenGLXlibKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLXlibKHR malloc() {
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsBindingOpenGLXlibKHR calloc() {
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsBindingOpenGLXlibKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance for the specified memory address. */
    public static XrGraphicsBindingOpenGLXlibKHR create(long address) {
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLXlibKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsBindingOpenGLXlibKHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrGraphicsBindingOpenGLXlibKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrGraphicsBindingOpenGLXlibKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXlibKHR mallocStack(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsBindingOpenGLXlibKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsBindingOpenGLXlibKHR callocStack(MemoryStack stack) {
        return wrap(XrGraphicsBindingOpenGLXlibKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsBindingOpenGLXlibKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsBindingOpenGLXlibKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXlibKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.NEXT); }
    /** Unsafe version of {@link #xDisplay}. */
    public static long nxDisplay(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.XDISPLAY); }
    /** Unsafe version of {@link #visualid}. */
    public static int nvisualid(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsBindingOpenGLXlibKHR.VISUALID); }
    /** Unsafe version of {@link #glxFBConfig}. */
    public static long nglxFBConfig(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXFBCONFIG); }
    /** Unsafe version of {@link #glxDrawable}. */
    public static long nglxDrawable(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXDRAWABLE); }
    /** Unsafe version of {@link #glxContext}. */
    public static long nglxContext(long struct) { return memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXlibKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXlibKHR.NEXT, value); }
    /** Unsafe version of {@link #xDisplay(long) xDisplay}. */
    public static void nxDisplay(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXlibKHR.XDISPLAY, check(value)); }
    /** Unsafe version of {@link #visualid(int) visualid}. */
    public static void nvisualid(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsBindingOpenGLXlibKHR.VISUALID, value); }
    /** Unsafe version of {@link #glxFBConfig(long) glxFBConfig}. */
    public static void nglxFBConfig(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXFBCONFIG, check(value)); }
    /** Unsafe version of {@link #glxDrawable(long) glxDrawable}. */
    public static void nglxDrawable(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXDRAWABLE, check(value)); }
    /** Unsafe version of {@link #glxContext(long) glxContext}. */
    public static void nglxContext(long struct, long value) { memPutAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXCONTEXT, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.XDISPLAY));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXFBCONFIG));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXDRAWABLE));
        check(memGetAddress(struct + XrGraphicsBindingOpenGLXlibKHR.GLXCONTEXT));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrGraphicsBindingOpenGLXlibKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsBindingOpenGLXlibKHR, Buffer> implements NativeResource {

        private static final XrGraphicsBindingOpenGLXlibKHR ELEMENT_FACTORY = XrGraphicsBindingOpenGLXlibKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsBindingOpenGLXlibKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsBindingOpenGLXlibKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsBindingOpenGLXlibKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsBindingOpenGLXlibKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGraphicsBindingOpenGLXlibKHR.nnext(address()); }
        /** @return the value of the {@code xDisplay} field. */
        @NativeType("Display *")
        public long xDisplay() { return XrGraphicsBindingOpenGLXlibKHR.nxDisplay(address()); }
        /** @return the value of the {@code visualid} field. */
        @NativeType("uint32_t")
        public int visualid() { return XrGraphicsBindingOpenGLXlibKHR.nvisualid(address()); }
        /** @return the value of the {@code glxFBConfig} field. */
        @NativeType("GLXFBConfig")
        public long glxFBConfig() { return XrGraphicsBindingOpenGLXlibKHR.nglxFBConfig(address()); }
        /** @return the value of the {@code glxDrawable} field. */
        @NativeType("GLXDrawable")
        public long glxDrawable() { return XrGraphicsBindingOpenGLXlibKHR.nglxDrawable(address()); }
        /** @return the value of the {@code glxContext} field. */
        @NativeType("GLXContext")
        public long glxContext() { return XrGraphicsBindingOpenGLXlibKHR.nglxContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsBindingOpenGLXlibKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer next(@NativeType("void const *") long value) { XrGraphicsBindingOpenGLXlibKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code xDisplay} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer xDisplay(@NativeType("Display *") long value) { XrGraphicsBindingOpenGLXlibKHR.nxDisplay(address(), value); return this; }
        /** Sets the specified value to the {@code visualid} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer visualid(@NativeType("uint32_t") int value) { XrGraphicsBindingOpenGLXlibKHR.nvisualid(address(), value); return this; }
        /** Sets the specified value to the {@code glxFBConfig} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer glxFBConfig(@NativeType("GLXFBConfig") long value) { XrGraphicsBindingOpenGLXlibKHR.nglxFBConfig(address(), value); return this; }
        /** Sets the specified value to the {@code glxDrawable} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer glxDrawable(@NativeType("GLXDrawable") long value) { XrGraphicsBindingOpenGLXlibKHR.nglxDrawable(address(), value); return this; }
        /** Sets the specified value to the {@code glxContext} field. */
        public XrGraphicsBindingOpenGLXlibKHR.Buffer glxContext(@NativeType("GLXContext") long value) { XrGraphicsBindingOpenGLXlibKHR.nglxContext(address(), value); return this; }

    }

}