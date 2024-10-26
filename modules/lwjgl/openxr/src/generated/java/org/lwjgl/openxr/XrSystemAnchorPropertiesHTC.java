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
 * System property for anchor.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>can</b> inspect whether the system is capable of anchor functionality by chaining an {@link XrSystemAnchorPropertiesHTC} structure to the {@link XrSystemProperties} when calling {@link XR10#xrGetSystemProperties GetSystemProperties}. The runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if {@link XrSystemAnchorPropertiesHTC}{@code ::supportsAnchor} was {@link XR10#XR_FALSE FALSE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCAnchor XR_HTC_anchor} extension <b>must</b> be enabled prior to using {@link XrSystemAnchorPropertiesHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCAnchor#XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemAnchorPropertiesHTC {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsAnchor};
 * }</code></pre>
 */
public class XrSystemAnchorPropertiesHTC extends Struct<XrSystemAnchorPropertiesHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSANCHOR;

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
        SUPPORTSANCHOR = layout.offsetof(2);
    }

    protected XrSystemAnchorPropertiesHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemAnchorPropertiesHTC create(long address, @Nullable ByteBuffer container) {
        return new XrSystemAnchorPropertiesHTC(address, container);
    }

    /**
     * Creates a {@code XrSystemAnchorPropertiesHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemAnchorPropertiesHTC(ByteBuffer container) {
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
    /** indicates if current system is capable of anchor functionality. */
    @NativeType("XrBool32")
    public boolean supportsAnchor() { return nsupportsAnchor(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemAnchorPropertiesHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCAnchor#XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC} value to the {@link #type} field. */
    public XrSystemAnchorPropertiesHTC type$Default() { return type(HTCAnchor.XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemAnchorPropertiesHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemAnchorPropertiesHTC set(
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
    public XrSystemAnchorPropertiesHTC set(XrSystemAnchorPropertiesHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemAnchorPropertiesHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemAnchorPropertiesHTC malloc() {
        return new XrSystemAnchorPropertiesHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemAnchorPropertiesHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemAnchorPropertiesHTC calloc() {
        return new XrSystemAnchorPropertiesHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemAnchorPropertiesHTC} instance allocated with {@link BufferUtils}. */
    public static XrSystemAnchorPropertiesHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemAnchorPropertiesHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemAnchorPropertiesHTC} instance for the specified memory address. */
    public static XrSystemAnchorPropertiesHTC create(long address) {
        return new XrSystemAnchorPropertiesHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemAnchorPropertiesHTC createSafe(long address) {
        return address == NULL ? null : new XrSystemAnchorPropertiesHTC(address, null);
    }

    /**
     * Returns a new {@link XrSystemAnchorPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemAnchorPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemAnchorPropertiesHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemAnchorPropertiesHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemAnchorPropertiesHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemAnchorPropertiesHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemAnchorPropertiesHTC malloc(MemoryStack stack) {
        return new XrSystemAnchorPropertiesHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemAnchorPropertiesHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemAnchorPropertiesHTC calloc(MemoryStack stack) {
        return new XrSystemAnchorPropertiesHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemAnchorPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemAnchorPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemAnchorPropertiesHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemAnchorPropertiesHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemAnchorPropertiesHTC.NEXT); }
    /** Unsafe version of {@link #supportsAnchor}. */
    public static int nsupportsAnchor(long struct) { return UNSAFE.getInt(null, struct + XrSystemAnchorPropertiesHTC.SUPPORTSANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemAnchorPropertiesHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemAnchorPropertiesHTC.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemAnchorPropertiesHTC} structs. */
    public static class Buffer extends StructBuffer<XrSystemAnchorPropertiesHTC, Buffer> implements NativeResource {

        private static final XrSystemAnchorPropertiesHTC ELEMENT_FACTORY = XrSystemAnchorPropertiesHTC.create(-1L);

        /**
         * Creates a new {@code XrSystemAnchorPropertiesHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemAnchorPropertiesHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemAnchorPropertiesHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemAnchorPropertiesHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemAnchorPropertiesHTC.ntype(address()); }
        /** @return the value of the {@link XrSystemAnchorPropertiesHTC#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemAnchorPropertiesHTC.nnext(address()); }
        /** @return the value of the {@link XrSystemAnchorPropertiesHTC#supportsAnchor} field. */
        @NativeType("XrBool32")
        public boolean supportsAnchor() { return XrSystemAnchorPropertiesHTC.nsupportsAnchor(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemAnchorPropertiesHTC#type} field. */
        public XrSystemAnchorPropertiesHTC.Buffer type(@NativeType("XrStructureType") int value) { XrSystemAnchorPropertiesHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCAnchor#XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC} value to the {@link XrSystemAnchorPropertiesHTC#type} field. */
        public XrSystemAnchorPropertiesHTC.Buffer type$Default() { return type(HTCAnchor.XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC); }
        /** Sets the specified value to the {@link XrSystemAnchorPropertiesHTC#next} field. */
        public XrSystemAnchorPropertiesHTC.Buffer next(@NativeType("void *") long value) { XrSystemAnchorPropertiesHTC.nnext(address(), value); return this; }

    }

}