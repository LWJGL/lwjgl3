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
 * The information to create a eye tracked foveation profile.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrFoveationEyeTrackedProfileCreateInfoMETA} <b>can</b> be added to the {@code next} chain of {@link XrFoveationLevelProfileCreateInfoFB} in order to enable eye tracked foveation. The runtime <b>must</b> apply an eye tracked foveation pattern according to the parameters defined in the {@link XrFoveationLevelProfileCreateInfoFB}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using {@link XrFoveationEyeTrackedProfileCreateInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationEyeTrackedProfileCreateInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrFoveationEyeTrackedProfileCreateFlagsMETA {@link #flags};
 * }</code></pre>
 */
public class XrFoveationEyeTrackedProfileCreateInfoMETA extends Struct<XrFoveationEyeTrackedProfileCreateInfoMETA> implements NativeResource {

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

    protected XrFoveationEyeTrackedProfileCreateInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationEyeTrackedProfileCreateInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationEyeTrackedProfileCreateInfoMETA(ByteBuffer container) {
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
    /** a bitmask of {@code XrFoveationEyeTrackedProfileCreateFlagBitsMETA} which indicate various characteristics for how eye tracked foveation is enabled on the swapchain. */
    @NativeType("XrFoveationEyeTrackedProfileCreateFlagsMETA")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationEyeTrackedProfileCreateInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META} value to the {@link #type} field. */
    public XrFoveationEyeTrackedProfileCreateInfoMETA type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationEyeTrackedProfileCreateInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrFoveationEyeTrackedProfileCreateInfoMETA flags(@NativeType("XrFoveationEyeTrackedProfileCreateFlagsMETA") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationEyeTrackedProfileCreateInfoMETA set(
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
    public XrFoveationEyeTrackedProfileCreateInfoMETA set(XrFoveationEyeTrackedProfileCreateInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA malloc() {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA calloc() {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance for the specified memory address. */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA create(long address) {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationEyeTrackedProfileCreateInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrFoveationEyeTrackedProfileCreateInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA malloc(MemoryStack stack) {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA calloc(MemoryStack stack) {
        return new XrFoveationEyeTrackedProfileCreateInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationEyeTrackedProfileCreateInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationEyeTrackedProfileCreateInfoMETA.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrFoveationEyeTrackedProfileCreateInfoMETA.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationEyeTrackedProfileCreateInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationEyeTrackedProfileCreateInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrFoveationEyeTrackedProfileCreateInfoMETA.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrFoveationEyeTrackedProfileCreateInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrFoveationEyeTrackedProfileCreateInfoMETA, Buffer> implements NativeResource {

        private static final XrFoveationEyeTrackedProfileCreateInfoMETA ELEMENT_FACTORY = XrFoveationEyeTrackedProfileCreateInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationEyeTrackedProfileCreateInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationEyeTrackedProfileCreateInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationEyeTrackedProfileCreateInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrFoveationEyeTrackedProfileCreateInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#flags} field. */
        @NativeType("XrFoveationEyeTrackedProfileCreateFlagsMETA")
        public long flags() { return XrFoveationEyeTrackedProfileCreateInfoMETA.nflags(address()); }

        /** Sets the specified value to the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#type} field. */
        public XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationEyeTrackedProfileCreateInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META} value to the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#type} field. */
        public XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_FOVEATION_EYE_TRACKED_PROFILE_CREATE_INFO_META); }
        /** Sets the specified value to the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#next} field. */
        public XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer next(@NativeType("void const *") long value) { XrFoveationEyeTrackedProfileCreateInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationEyeTrackedProfileCreateInfoMETA#flags} field. */
        public XrFoveationEyeTrackedProfileCreateInfoMETA.Buffer flags(@NativeType("XrFoveationEyeTrackedProfileCreateFlagsMETA") long value) { XrFoveationEyeTrackedProfileCreateInfoMETA.nflags(address(), value); return this; }

    }

}