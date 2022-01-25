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
 * Input data needed to determine which type of tracked keyboard to query for.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrKeyboardTrackingQueryFB} specifies input data needed to determine which type of tracked keyboard to query for.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using {@link XrKeyboardTrackingQueryFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_TRACKING_QUERY_FB TYPE_KEYBOARD_TRACKING_QUERY_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code XrKeyboardTrackingQueryFlagBitsFB} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBKeyboardTracking#xrQuerySystemTrackedKeyboardFB QuerySystemTrackedKeyboardFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrKeyboardTrackingQueryFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrKeyboardTrackingQueryFlagsFB {@link #flags};
 * }</code></pre>
 */
public class XrKeyboardTrackingQueryFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrKeyboardTrackingQueryFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrKeyboardTrackingQueryFB(ByteBuffer container) {
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
    /** a bitmask of {@code XrKeyboardTrackingQueryFlagsFB}. */
    @NativeType("XrKeyboardTrackingQueryFlagsFB")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrKeyboardTrackingQueryFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_TRACKING_QUERY_FB TYPE_KEYBOARD_TRACKING_QUERY_FB} value to the {@link #type} field. */
    public XrKeyboardTrackingQueryFB type$Default() { return type(FBKeyboardTracking.XR_TYPE_KEYBOARD_TRACKING_QUERY_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrKeyboardTrackingQueryFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrKeyboardTrackingQueryFB flags(@NativeType("XrKeyboardTrackingQueryFlagsFB") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrKeyboardTrackingQueryFB set(
        int type,
        long next,
        long flags
    ) {
        type(type);
        next(next);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrKeyboardTrackingQueryFB set(XrKeyboardTrackingQueryFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrKeyboardTrackingQueryFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrKeyboardTrackingQueryFB malloc() {
        return wrap(XrKeyboardTrackingQueryFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrKeyboardTrackingQueryFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrKeyboardTrackingQueryFB calloc() {
        return wrap(XrKeyboardTrackingQueryFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrKeyboardTrackingQueryFB} instance allocated with {@link BufferUtils}. */
    public static XrKeyboardTrackingQueryFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrKeyboardTrackingQueryFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrKeyboardTrackingQueryFB} instance for the specified memory address. */
    public static XrKeyboardTrackingQueryFB create(long address) {
        return wrap(XrKeyboardTrackingQueryFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrKeyboardTrackingQueryFB createSafe(long address) {
        return address == NULL ? null : wrap(XrKeyboardTrackingQueryFB.class, address);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingQueryFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingQueryFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingQueryFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrKeyboardTrackingQueryFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrKeyboardTrackingQueryFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrKeyboardTrackingQueryFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardTrackingQueryFB malloc(MemoryStack stack) {
        return wrap(XrKeyboardTrackingQueryFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrKeyboardTrackingQueryFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardTrackingQueryFB calloc(MemoryStack stack) {
        return wrap(XrKeyboardTrackingQueryFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrKeyboardTrackingQueryFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardTrackingQueryFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardTrackingQueryFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrKeyboardTrackingQueryFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrKeyboardTrackingQueryFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrKeyboardTrackingQueryFB.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrKeyboardTrackingQueryFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrKeyboardTrackingQueryFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrKeyboardTrackingQueryFB.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrKeyboardTrackingQueryFB} structs. */
    public static class Buffer extends StructBuffer<XrKeyboardTrackingQueryFB, Buffer> implements NativeResource {

        private static final XrKeyboardTrackingQueryFB ELEMENT_FACTORY = XrKeyboardTrackingQueryFB.create(-1L);

        /**
         * Creates a new {@code XrKeyboardTrackingQueryFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrKeyboardTrackingQueryFB#SIZEOF}, and its mark will be undefined.
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
        protected XrKeyboardTrackingQueryFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrKeyboardTrackingQueryFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrKeyboardTrackingQueryFB.ntype(address()); }
        /** @return the value of the {@link XrKeyboardTrackingQueryFB#next} field. */
        @NativeType("void *")
        public long next() { return XrKeyboardTrackingQueryFB.nnext(address()); }
        /** @return the value of the {@link XrKeyboardTrackingQueryFB#flags} field. */
        @NativeType("XrKeyboardTrackingQueryFlagsFB")
        public long flags() { return XrKeyboardTrackingQueryFB.nflags(address()); }

        /** Sets the specified value to the {@link XrKeyboardTrackingQueryFB#type} field. */
        public XrKeyboardTrackingQueryFB.Buffer type(@NativeType("XrStructureType") int value) { XrKeyboardTrackingQueryFB.ntype(address(), value); return this; }
        /** Sets the {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_TRACKING_QUERY_FB TYPE_KEYBOARD_TRACKING_QUERY_FB} value to the {@link XrKeyboardTrackingQueryFB#type} field. */
        public XrKeyboardTrackingQueryFB.Buffer type$Default() { return type(FBKeyboardTracking.XR_TYPE_KEYBOARD_TRACKING_QUERY_FB); }
        /** Sets the specified value to the {@link XrKeyboardTrackingQueryFB#next} field. */
        public XrKeyboardTrackingQueryFB.Buffer next(@NativeType("void *") long value) { XrKeyboardTrackingQueryFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrKeyboardTrackingQueryFB#flags} field. */
        public XrKeyboardTrackingQueryFB.Buffer flags(@NativeType("XrKeyboardTrackingQueryFlagsFB") long value) { XrKeyboardTrackingQueryFB.nflags(address(), value); return this; }

    }

}