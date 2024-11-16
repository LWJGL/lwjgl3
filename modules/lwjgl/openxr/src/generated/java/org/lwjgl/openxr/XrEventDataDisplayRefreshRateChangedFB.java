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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event representing display refresh rate change.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBDisplayRefreshRate XR_FB_display_refresh_rate} extension <b>must</b> be enabled prior to using {@link XrEventDataDisplayRefreshRateChangedFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBDisplayRefreshRate#XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBDisplayRefreshRate#xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataDisplayRefreshRateChangedFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     float {@link #fromDisplayRefreshRate};
 *     float {@link #toDisplayRefreshRate};
 * }</code></pre>
 */
public class XrEventDataDisplayRefreshRateChangedFB extends Struct<XrEventDataDisplayRefreshRateChangedFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FROMDISPLAYREFRESHRATE,
        TODISPLAYREFRESHRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FROMDISPLAYREFRESHRATE = layout.offsetof(2);
        TODISPLAYREFRESHRATE = layout.offsetof(3);
    }

    protected XrEventDataDisplayRefreshRateChangedFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataDisplayRefreshRateChangedFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataDisplayRefreshRateChangedFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataDisplayRefreshRateChangedFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataDisplayRefreshRateChangedFB(ByteBuffer container) {
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
    /** the previous display refresh rate. */
    public float fromDisplayRefreshRate() { return nfromDisplayRefreshRate(address()); }
    /** the new display refresh rate. */
    public float toDisplayRefreshRate() { return ntoDisplayRefreshRate(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataDisplayRefreshRateChangedFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBDisplayRefreshRate#XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB} value to the {@link #type} field. */
    public XrEventDataDisplayRefreshRateChangedFB type$Default() { return type(FBDisplayRefreshRate.XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataDisplayRefreshRateChangedFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataDisplayRefreshRateChangedFB set(
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
    public XrEventDataDisplayRefreshRateChangedFB set(XrEventDataDisplayRefreshRateChangedFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataDisplayRefreshRateChangedFB malloc() {
        return new XrEventDataDisplayRefreshRateChangedFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataDisplayRefreshRateChangedFB calloc() {
        return new XrEventDataDisplayRefreshRateChangedFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataDisplayRefreshRateChangedFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataDisplayRefreshRateChangedFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance for the specified memory address. */
    public static XrEventDataDisplayRefreshRateChangedFB create(long address) {
        return new XrEventDataDisplayRefreshRateChangedFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataDisplayRefreshRateChangedFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataDisplayRefreshRateChangedFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataDisplayRefreshRateChangedFB}. */
    public static XrEventDataDisplayRefreshRateChangedFB create(XrEventDataBaseHeader value) {
        return new XrEventDataDisplayRefreshRateChangedFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataDisplayRefreshRateChangedFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataDisplayRefreshRateChangedFB.Buffer}. */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataDisplayRefreshRateChangedFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataDisplayRefreshRateChangedFB malloc(MemoryStack stack) {
        return new XrEventDataDisplayRefreshRateChangedFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataDisplayRefreshRateChangedFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataDisplayRefreshRateChangedFB calloc(MemoryStack stack) {
        return new XrEventDataDisplayRefreshRateChangedFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataDisplayRefreshRateChangedFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataDisplayRefreshRateChangedFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataDisplayRefreshRateChangedFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataDisplayRefreshRateChangedFB.NEXT); }
    /** Unsafe version of {@link #fromDisplayRefreshRate}. */
    public static float nfromDisplayRefreshRate(long struct) { return memGetFloat(struct + XrEventDataDisplayRefreshRateChangedFB.FROMDISPLAYREFRESHRATE); }
    /** Unsafe version of {@link #toDisplayRefreshRate}. */
    public static float ntoDisplayRefreshRate(long struct) { return memGetFloat(struct + XrEventDataDisplayRefreshRateChangedFB.TODISPLAYREFRESHRATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataDisplayRefreshRateChangedFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataDisplayRefreshRateChangedFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataDisplayRefreshRateChangedFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataDisplayRefreshRateChangedFB, Buffer> implements NativeResource {

        private static final XrEventDataDisplayRefreshRateChangedFB ELEMENT_FACTORY = XrEventDataDisplayRefreshRateChangedFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataDisplayRefreshRateChangedFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataDisplayRefreshRateChangedFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataDisplayRefreshRateChangedFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataDisplayRefreshRateChangedFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataDisplayRefreshRateChangedFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataDisplayRefreshRateChangedFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataDisplayRefreshRateChangedFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataDisplayRefreshRateChangedFB#fromDisplayRefreshRate} field. */
        public float fromDisplayRefreshRate() { return XrEventDataDisplayRefreshRateChangedFB.nfromDisplayRefreshRate(address()); }
        /** @return the value of the {@link XrEventDataDisplayRefreshRateChangedFB#toDisplayRefreshRate} field. */
        public float toDisplayRefreshRate() { return XrEventDataDisplayRefreshRateChangedFB.ntoDisplayRefreshRate(address()); }

        /** Sets the specified value to the {@link XrEventDataDisplayRefreshRateChangedFB#type} field. */
        public XrEventDataDisplayRefreshRateChangedFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataDisplayRefreshRateChangedFB.ntype(address(), value); return this; }
        /** Sets the {@link FBDisplayRefreshRate#XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB} value to the {@link XrEventDataDisplayRefreshRateChangedFB#type} field. */
        public XrEventDataDisplayRefreshRateChangedFB.Buffer type$Default() { return type(FBDisplayRefreshRate.XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB); }
        /** Sets the specified value to the {@link XrEventDataDisplayRefreshRateChangedFB#next} field. */
        public XrEventDataDisplayRefreshRateChangedFB.Buffer next(@NativeType("void const *") long value) { XrEventDataDisplayRefreshRateChangedFB.nnext(address(), value); return this; }

    }

}