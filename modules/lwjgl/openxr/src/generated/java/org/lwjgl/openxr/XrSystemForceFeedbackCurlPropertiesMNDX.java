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
 * System property for force feedback curl.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>may</b> inspect whether the system is capable of force feedback by chaining an {@link XrSystemForceFeedbackCurlPropertiesMNDX} structure to the {@link XrSystemProperties} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <p>The runtime <b>should</b> return {@link XR10#XR_TRUE TRUE} for {@code supportsForceFeedback} when force feedback is available in the system, otherwise {@link XR10#XR_FALSE FALSE}. Force feedback calls <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if force feedback is not available in the system.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to using {@link XrSystemForceFeedbackCurlPropertiesMNDX}</li>
 * <li>{@code type} <b>must</b> be {@link MNDXForceFeedbackCurl#XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemForceFeedbackCurlPropertiesMNDX {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsForceFeedbackCurl};
 * }</code></pre>
 */
public class XrSystemForceFeedbackCurlPropertiesMNDX extends Struct<XrSystemForceFeedbackCurlPropertiesMNDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSFORCEFEEDBACKCURL;

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
        SUPPORTSFORCEFEEDBACKCURL = layout.offsetof(2);
    }

    protected XrSystemForceFeedbackCurlPropertiesMNDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemForceFeedbackCurlPropertiesMNDX create(long address, @Nullable ByteBuffer container) {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(address, container);
    }

    /**
     * Creates a {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemForceFeedbackCurlPropertiesMNDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32}, indicating if the current system is capable of performing force feedback. */
    @NativeType("XrBool32")
    public boolean supportsForceFeedbackCurl() { return nsupportsForceFeedbackCurl(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemForceFeedbackCurlPropertiesMNDX type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MNDXForceFeedbackCurl#XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX} value to the {@link #type} field. */
    public XrSystemForceFeedbackCurlPropertiesMNDX type$Default() { return type(MNDXForceFeedbackCurl.XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemForceFeedbackCurlPropertiesMNDX next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemForceFeedbackCurlPropertiesMNDX set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemForceFeedbackCurlPropertiesMNDX set(XrSystemForceFeedbackCurlPropertiesMNDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemForceFeedbackCurlPropertiesMNDX malloc() {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemForceFeedbackCurlPropertiesMNDX calloc() {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance allocated with {@link BufferUtils}. */
    public static XrSystemForceFeedbackCurlPropertiesMNDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemForceFeedbackCurlPropertiesMNDX(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance for the specified memory address. */
    public static XrSystemForceFeedbackCurlPropertiesMNDX create(long address) {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemForceFeedbackCurlPropertiesMNDX createSafe(long address) {
        return address == NULL ? null : new XrSystemForceFeedbackCurlPropertiesMNDX(address, null);
    }

    /**
     * Returns a new {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX malloc(MemoryStack stack) {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemForceFeedbackCurlPropertiesMNDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX calloc(MemoryStack stack) {
        return new XrSystemForceFeedbackCurlPropertiesMNDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemForceFeedbackCurlPropertiesMNDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemForceFeedbackCurlPropertiesMNDX.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemForceFeedbackCurlPropertiesMNDX.NEXT); }
    /** Unsafe version of {@link #supportsForceFeedbackCurl}. */
    public static int nsupportsForceFeedbackCurl(long struct) { return UNSAFE.getInt(null, struct + XrSystemForceFeedbackCurlPropertiesMNDX.SUPPORTSFORCEFEEDBACKCURL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemForceFeedbackCurlPropertiesMNDX.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemForceFeedbackCurlPropertiesMNDX.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemForceFeedbackCurlPropertiesMNDX} structs. */
    public static class Buffer extends StructBuffer<XrSystemForceFeedbackCurlPropertiesMNDX, Buffer> implements NativeResource {

        private static final XrSystemForceFeedbackCurlPropertiesMNDX ELEMENT_FACTORY = XrSystemForceFeedbackCurlPropertiesMNDX.create(-1L);

        /**
         * Creates a new {@code XrSystemForceFeedbackCurlPropertiesMNDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemForceFeedbackCurlPropertiesMNDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemForceFeedbackCurlPropertiesMNDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemForceFeedbackCurlPropertiesMNDX#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemForceFeedbackCurlPropertiesMNDX.ntype(address()); }
        /** @return the value of the {@link XrSystemForceFeedbackCurlPropertiesMNDX#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemForceFeedbackCurlPropertiesMNDX.nnext(address()); }
        /** @return the value of the {@link XrSystemForceFeedbackCurlPropertiesMNDX#supportsForceFeedbackCurl} field. */
        @NativeType("XrBool32")
        public boolean supportsForceFeedbackCurl() { return XrSystemForceFeedbackCurlPropertiesMNDX.nsupportsForceFeedbackCurl(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemForceFeedbackCurlPropertiesMNDX#type} field. */
        public XrSystemForceFeedbackCurlPropertiesMNDX.Buffer type(@NativeType("XrStructureType") int value) { XrSystemForceFeedbackCurlPropertiesMNDX.ntype(address(), value); return this; }
        /** Sets the {@link MNDXForceFeedbackCurl#XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX} value to the {@link XrSystemForceFeedbackCurlPropertiesMNDX#type} field. */
        public XrSystemForceFeedbackCurlPropertiesMNDX.Buffer type$Default() { return type(MNDXForceFeedbackCurl.XR_TYPE_SYSTEM_FORCE_FEEDBACK_CURL_PROPERTIES_MNDX); }
        /** Sets the specified value to the {@link XrSystemForceFeedbackCurlPropertiesMNDX#next} field. */
        public XrSystemForceFeedbackCurlPropertiesMNDX.Buffer next(@NativeType("void *") long value) { XrSystemForceFeedbackCurlPropertiesMNDX.nnext(address(), value); return this; }

    }

}