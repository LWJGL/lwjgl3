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
 * Information to create a body tracker handle.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrBodyTrackerCreateInfoHTC} structure describes the information to create an {@code XrBodyTrackerHTC} handle. If the supplied {@code bodyJointSet} is not valid, the runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}. .Valid Usage (Implicit)</p>
 * 
 * <ul>
 * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyTrackerCreateInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code bodyJointSet} <b>must</b> be a valid {@code XrBodyJointSetHTC} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link HTCBodyTracking#xrCreateBodyTrackerHTC CreateBodyTrackerHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyTrackerCreateInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBodyJointSetHTC {@link #bodyJointSet};
 * }</code></pre>
 */
public class XrBodyTrackerCreateInfoHTC extends Struct<XrBodyTrackerCreateInfoHTC> implements NativeResource {

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

    protected XrBodyTrackerCreateInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackerCreateInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackerCreateInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackerCreateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackerCreateInfoHTC(ByteBuffer container) {
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
    /** an {@code XrBodyJointSetHTC} value that describes the set of body joints to retrieve. */
    @NativeType("XrBodyJointSetHTC")
    public int bodyJointSet() { return nbodyJointSet(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodyTrackerCreateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC} value to the {@link #type} field. */
    public XrBodyTrackerCreateInfoHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyTrackerCreateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #bodyJointSet} field. */
    public XrBodyTrackerCreateInfoHTC bodyJointSet(@NativeType("XrBodyJointSetHTC") int value) { nbodyJointSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackerCreateInfoHTC set(
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
    public XrBodyTrackerCreateInfoHTC set(XrBodyTrackerCreateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoHTC malloc() {
        return new XrBodyTrackerCreateInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoHTC calloc() {
        return new XrBodyTrackerCreateInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackerCreateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackerCreateInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance for the specified memory address. */
    public static XrBodyTrackerCreateInfoHTC create(long address) {
        return new XrBodyTrackerCreateInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyTrackerCreateInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackerCreateInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackerCreateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyTrackerCreateInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoHTC malloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoHTC calloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackerCreateInfoHTC.NEXT); }
    /** Unsafe version of {@link #bodyJointSet}. */
    public static int nbodyJointSet(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoHTC.BODYJOINTSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackerCreateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #bodyJointSet(int) bodyJointSet}. */
    public static void nbodyJointSet(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoHTC.BODYJOINTSET, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackerCreateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackerCreateInfoHTC, Buffer> implements NativeResource {

        private static final XrBodyTrackerCreateInfoHTC ELEMENT_FACTORY = XrBodyTrackerCreateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackerCreateInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackerCreateInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackerCreateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyTrackerCreateInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackerCreateInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrBodyTrackerCreateInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyTrackerCreateInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrBodyTrackerCreateInfoHTC#bodyJointSet} field. */
        @NativeType("XrBodyJointSetHTC")
        public int bodyJointSet() { return XrBodyTrackerCreateInfoHTC.nbodyJointSet(address()); }

        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoHTC#type} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackerCreateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC} value to the {@link XrBodyTrackerCreateInfoHTC#type} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC); }
        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoHTC#next} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrBodyTrackerCreateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyTrackerCreateInfoHTC#bodyJointSet} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer bodyJointSet(@NativeType("XrBodyJointSetHTC") int value) { XrBodyTrackerCreateInfoHTC.nbodyJointSet(address(), value); return this; }

    }

}