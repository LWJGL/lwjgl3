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
 * Input data needed by the system to start tracking a keyboard.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrKeyboardSpaceCreateInfoFB} describes a request for the system needed to create a trackable {@code XrSpace} associated with the keyboard.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBKeyboardTracking XR_FB_keyboard_tracking} extension <b>must</b> be enabled prior to using {@link XrKeyboardSpaceCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB TYPE_KEYBOARD_SPACE_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBKeyboardTracking#xrCreateKeyboardSpaceFB CreateKeyboardSpaceFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrKeyboardSpaceCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint64_t {@link #trackedKeyboardId};
 * }</code></pre>
 */
public class XrKeyboardSpaceCreateInfoFB extends Struct<XrKeyboardSpaceCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKEDKEYBOARDID;

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
        TRACKEDKEYBOARDID = layout.offsetof(2);
    }

    protected XrKeyboardSpaceCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrKeyboardSpaceCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrKeyboardSpaceCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrKeyboardSpaceCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrKeyboardSpaceCreateInfoFB(ByteBuffer container) {
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
    /** abstract identifier describing the type of keyboard to track. */
    @NativeType("uint64_t")
    public long trackedKeyboardId() { return ntrackedKeyboardId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrKeyboardSpaceCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB TYPE_KEYBOARD_SPACE_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrKeyboardSpaceCreateInfoFB type$Default() { return type(FBKeyboardTracking.XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrKeyboardSpaceCreateInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #trackedKeyboardId} field. */
    public XrKeyboardSpaceCreateInfoFB trackedKeyboardId(@NativeType("uint64_t") long value) { ntrackedKeyboardId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrKeyboardSpaceCreateInfoFB set(
        int type,
        long next,
        long trackedKeyboardId
    ) {
        type(type);
        next(next);
        trackedKeyboardId(trackedKeyboardId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrKeyboardSpaceCreateInfoFB set(XrKeyboardSpaceCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrKeyboardSpaceCreateInfoFB malloc() {
        return new XrKeyboardSpaceCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrKeyboardSpaceCreateInfoFB calloc() {
        return new XrKeyboardSpaceCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrKeyboardSpaceCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrKeyboardSpaceCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance for the specified memory address. */
    public static XrKeyboardSpaceCreateInfoFB create(long address) {
        return new XrKeyboardSpaceCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrKeyboardSpaceCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrKeyboardSpaceCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrKeyboardSpaceCreateInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardSpaceCreateInfoFB malloc(MemoryStack stack) {
        return new XrKeyboardSpaceCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrKeyboardSpaceCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrKeyboardSpaceCreateInfoFB calloc(MemoryStack stack) {
        return new XrKeyboardSpaceCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrKeyboardSpaceCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrKeyboardSpaceCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrKeyboardSpaceCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrKeyboardSpaceCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #trackedKeyboardId}. */
    public static long ntrackedKeyboardId(long struct) { return memGetLong(struct + XrKeyboardSpaceCreateInfoFB.TRACKEDKEYBOARDID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrKeyboardSpaceCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrKeyboardSpaceCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #trackedKeyboardId(long) trackedKeyboardId}. */
    public static void ntrackedKeyboardId(long struct, long value) { memPutLong(struct + XrKeyboardSpaceCreateInfoFB.TRACKEDKEYBOARDID, value); }

    // -----------------------------------

    /** An array of {@link XrKeyboardSpaceCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrKeyboardSpaceCreateInfoFB, Buffer> implements NativeResource {

        private static final XrKeyboardSpaceCreateInfoFB ELEMENT_FACTORY = XrKeyboardSpaceCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrKeyboardSpaceCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrKeyboardSpaceCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrKeyboardSpaceCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrKeyboardSpaceCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrKeyboardSpaceCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrKeyboardSpaceCreateInfoFB#next} field. */
        @NativeType("void *")
        public long next() { return XrKeyboardSpaceCreateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrKeyboardSpaceCreateInfoFB#trackedKeyboardId} field. */
        @NativeType("uint64_t")
        public long trackedKeyboardId() { return XrKeyboardSpaceCreateInfoFB.ntrackedKeyboardId(address()); }

        /** Sets the specified value to the {@link XrKeyboardSpaceCreateInfoFB#type} field. */
        public XrKeyboardSpaceCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrKeyboardSpaceCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBKeyboardTracking#XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB TYPE_KEYBOARD_SPACE_CREATE_INFO_FB} value to the {@link XrKeyboardSpaceCreateInfoFB#type} field. */
        public XrKeyboardSpaceCreateInfoFB.Buffer type$Default() { return type(FBKeyboardTracking.XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrKeyboardSpaceCreateInfoFB#next} field. */
        public XrKeyboardSpaceCreateInfoFB.Buffer next(@NativeType("void *") long value) { XrKeyboardSpaceCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrKeyboardSpaceCreateInfoFB#trackedKeyboardId} field. */
        public XrKeyboardSpaceCreateInfoFB.Buffer trackedKeyboardId(@NativeType("uint64_t") long value) { XrKeyboardSpaceCreateInfoFB.ntrackedKeyboardId(address(), value); return this; }

    }

}