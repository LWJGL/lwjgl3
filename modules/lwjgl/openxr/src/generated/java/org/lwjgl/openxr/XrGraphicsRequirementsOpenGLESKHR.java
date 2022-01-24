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
 * OpenGL ES API version requirements.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrGraphicsRequirementsOpenGLESKHR} is populated by {@link KHROpenGLESEnable#xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR} with the runtime’s OpenGL ES API version requirements.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHROpenGLESEnable XR_KHR_opengl_es_enable} extension <b>must</b> be enabled prior to using {@link XrGraphicsRequirementsOpenGLESKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHROpenGLESEnable#xrGetOpenGLESGraphicsRequirementsKHR GetOpenGLESGraphicsRequirementsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrGraphicsRequirementsOpenGLESKHR {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrVersion {@link #minApiVersionSupported};
 *     XrVersion {@link #maxApiVersionSupported};
 * }</code></pre>
 */
public class XrGraphicsRequirementsOpenGLESKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MINAPIVERSIONSUPPORTED,
        MAXAPIVERSIONSUPPORTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MINAPIVERSIONSUPPORTED = layout.offsetof(2);
        MAXAPIVERSIONSUPPORTED = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrGraphicsRequirementsOpenGLESKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsRequirementsOpenGLESKHR(ByteBuffer container) {
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
    /** the minimum version of OpenGL ES that the runtime supports. Uses {@link XR10#XR_MAKE_VERSION} on major and minor API version, ignoring any patch version component. */
    @NativeType("XrVersion")
    public long minApiVersionSupported() { return nminApiVersionSupported(address()); }
    /** the maximum version of OpenGL ES that the runtime has been tested on and is known to support. Newer OpenGL ES versions might work if they are compatible. Uses {@link XR10#XR_MAKE_VERSION} on major and minor API version, ignoring any patch version component. */
    @NativeType("XrVersion")
    public long maxApiVersionSupported() { return nmaxApiVersionSupported(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrGraphicsRequirementsOpenGLESKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR} value to the {@link #type} field. */
    public XrGraphicsRequirementsOpenGLESKHR type$Default() { return type(KHROpenGLESEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrGraphicsRequirementsOpenGLESKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #minApiVersionSupported} field. */
    public XrGraphicsRequirementsOpenGLESKHR minApiVersionSupported(@NativeType("XrVersion") long value) { nminApiVersionSupported(address(), value); return this; }
    /** Sets the specified value to the {@link #maxApiVersionSupported} field. */
    public XrGraphicsRequirementsOpenGLESKHR maxApiVersionSupported(@NativeType("XrVersion") long value) { nmaxApiVersionSupported(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsRequirementsOpenGLESKHR set(
        int type,
        long next,
        long minApiVersionSupported,
        long maxApiVersionSupported
    ) {
        type(type);
        next(next);
        minApiVersionSupported(minApiVersionSupported);
        maxApiVersionSupported(maxApiVersionSupported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsRequirementsOpenGLESKHR set(XrGraphicsRequirementsOpenGLESKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsRequirementsOpenGLESKHR malloc() {
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsRequirementsOpenGLESKHR calloc() {
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsRequirementsOpenGLESKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance for the specified memory address. */
    public static XrGraphicsRequirementsOpenGLESKHR create(long address) {
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsRequirementsOpenGLESKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrGraphicsRequirementsOpenGLESKHR.class, address);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsRequirementsOpenGLESKHR malloc(MemoryStack stack) {
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrGraphicsRequirementsOpenGLESKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsRequirementsOpenGLESKHR calloc(MemoryStack stack) {
        return wrap(XrGraphicsRequirementsOpenGLESKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsOpenGLESKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrGraphicsRequirementsOpenGLESKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsRequirementsOpenGLESKHR.NEXT); }
    /** Unsafe version of {@link #minApiVersionSupported}. */
    public static long nminApiVersionSupported(long struct) { return UNSAFE.getLong(null, struct + XrGraphicsRequirementsOpenGLESKHR.MINAPIVERSIONSUPPORTED); }
    /** Unsafe version of {@link #maxApiVersionSupported}. */
    public static long nmaxApiVersionSupported(long struct) { return UNSAFE.getLong(null, struct + XrGraphicsRequirementsOpenGLESKHR.MAXAPIVERSIONSUPPORTED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrGraphicsRequirementsOpenGLESKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsRequirementsOpenGLESKHR.NEXT, value); }
    /** Unsafe version of {@link #minApiVersionSupported(long) minApiVersionSupported}. */
    public static void nminApiVersionSupported(long struct, long value) { UNSAFE.putLong(null, struct + XrGraphicsRequirementsOpenGLESKHR.MINAPIVERSIONSUPPORTED, value); }
    /** Unsafe version of {@link #maxApiVersionSupported(long) maxApiVersionSupported}. */
    public static void nmaxApiVersionSupported(long struct, long value) { UNSAFE.putLong(null, struct + XrGraphicsRequirementsOpenGLESKHR.MAXAPIVERSIONSUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link XrGraphicsRequirementsOpenGLESKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsRequirementsOpenGLESKHR, Buffer> implements NativeResource {

        private static final XrGraphicsRequirementsOpenGLESKHR ELEMENT_FACTORY = XrGraphicsRequirementsOpenGLESKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsRequirementsOpenGLESKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsRequirementsOpenGLESKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrGraphicsRequirementsOpenGLESKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrGraphicsRequirementsOpenGLESKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsRequirementsOpenGLESKHR.ntype(address()); }
        /** @return the value of the {@link XrGraphicsRequirementsOpenGLESKHR#next} field. */
        @NativeType("void *")
        public long next() { return XrGraphicsRequirementsOpenGLESKHR.nnext(address()); }
        /** @return the value of the {@link XrGraphicsRequirementsOpenGLESKHR#minApiVersionSupported} field. */
        @NativeType("XrVersion")
        public long minApiVersionSupported() { return XrGraphicsRequirementsOpenGLESKHR.nminApiVersionSupported(address()); }
        /** @return the value of the {@link XrGraphicsRequirementsOpenGLESKHR#maxApiVersionSupported} field. */
        @NativeType("XrVersion")
        public long maxApiVersionSupported() { return XrGraphicsRequirementsOpenGLESKHR.nmaxApiVersionSupported(address()); }

        /** Sets the specified value to the {@link XrGraphicsRequirementsOpenGLESKHR#type} field. */
        public XrGraphicsRequirementsOpenGLESKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsRequirementsOpenGLESKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLESEnable#XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR} value to the {@link XrGraphicsRequirementsOpenGLESKHR#type} field. */
        public XrGraphicsRequirementsOpenGLESKHR.Buffer type$Default() { return type(KHROpenGLESEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_OPENGL_ES_KHR); }
        /** Sets the specified value to the {@link XrGraphicsRequirementsOpenGLESKHR#next} field. */
        public XrGraphicsRequirementsOpenGLESKHR.Buffer next(@NativeType("void *") long value) { XrGraphicsRequirementsOpenGLESKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsRequirementsOpenGLESKHR#minApiVersionSupported} field. */
        public XrGraphicsRequirementsOpenGLESKHR.Buffer minApiVersionSupported(@NativeType("XrVersion") long value) { XrGraphicsRequirementsOpenGLESKHR.nminApiVersionSupported(address(), value); return this; }
        /** Sets the specified value to the {@link XrGraphicsRequirementsOpenGLESKHR#maxApiVersionSupported} field. */
        public XrGraphicsRequirementsOpenGLESKHR.Buffer maxApiVersionSupported(@NativeType("XrVersion") long value) { XrGraphicsRequirementsOpenGLESKHR.nmaxApiVersionSupported(address(), value); return this; }

    }

}