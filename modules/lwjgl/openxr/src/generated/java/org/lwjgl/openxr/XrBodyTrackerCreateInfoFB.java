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
 * Information to create a body joints handle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyTrackerCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_FB TYPE_BODY_TRACKER_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code bodyJointSet} <b>must</b> be a valid {@code XrBodyJointSetFB} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBBodyTracking#xrCreateBodyTrackerFB CreateBodyTrackerFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyTrackerCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBodyJointSetFB {@link #bodyJointSet};
 * }</code></pre>
 */
public class XrBodyTrackerCreateInfoFB extends Struct<XrBodyTrackerCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BODYJOINTSET;

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
        BODYJOINTSET = layout.offsetof(2);
    }

    protected XrBodyTrackerCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackerCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackerCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackerCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackerCreateInfoFB(ByteBuffer container) {
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
    /** an {@code XrBodyJointSetFB} that describes the set of body joints to retrieve. */
    @NativeType("XrBodyJointSetFB")
    public int bodyJointSet() { return nbodyJointSet(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodyTrackerCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_FB TYPE_BODY_TRACKER_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrBodyTrackerCreateInfoFB type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyTrackerCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #bodyJointSet} field. */
    public XrBodyTrackerCreateInfoFB bodyJointSet(@NativeType("XrBodyJointSetFB") int value) { nbodyJointSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackerCreateInfoFB set(
        int type,
        long next,
        int bodyJointSet
    ) {
        type(type);
        next(next);
        bodyJointSet(bodyJointSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackerCreateInfoFB set(XrBodyTrackerCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoFB malloc() {
        return new XrBodyTrackerCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoFB calloc() {
        return new XrBodyTrackerCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackerCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackerCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoFB} instance for the specified memory address. */
    public static XrBodyTrackerCreateInfoFB create(long address) {
        return new XrBodyTrackerCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyTrackerCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackerCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackerCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyTrackerCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoFB malloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoFB calloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBodyTrackerCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackerCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #bodyJointSet}. */
    public static int nbodyJointSet(long struct) { return UNSAFE.getInt(null, struct + XrBodyTrackerCreateInfoFB.BODYJOINTSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyTrackerCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackerCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #bodyJointSet(int) bodyJointSet}. */
    public static void nbodyJointSet(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyTrackerCreateInfoFB.BODYJOINTSET, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackerCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackerCreateInfoFB, Buffer> implements NativeResource {

        private static final XrBodyTrackerCreateInfoFB ELEMENT_FACTORY = XrBodyTrackerCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackerCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackerCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackerCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyTrackerCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackerCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrBodyTrackerCreateInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyTrackerCreateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrBodyTrackerCreateInfoFB#bodyJointSet} field. */
        @NativeType("XrBodyJointSetFB")
        public int bodyJointSet() { return XrBodyTrackerCreateInfoFB.nbodyJointSet(address()); }

        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoFB#type} field. */
        public XrBodyTrackerCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackerCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_FB TYPE_BODY_TRACKER_CREATE_INFO_FB} value to the {@link XrBodyTrackerCreateInfoFB#type} field. */
        public XrBodyTrackerCreateInfoFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoFB#next} field. */
        public XrBodyTrackerCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrBodyTrackerCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoFB#bodyJointSet} field. */
        public XrBodyTrackerCreateInfoFB.Buffer bodyJointSet(@NativeType("XrBodyJointSetFB") int value) { XrBodyTrackerCreateInfoFB.nbodyJointSet(address(), value); return this; }

    }

}