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
 * Information about the current system support for eye tracked foveation.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>can</b> inspect whether the system is capable of eye tracked foveation by extending the {@link XrSystemProperties} with {@link XrSystemFoveationEyeTrackedPropertiesMETA} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using {@link XrSystemFoveationEyeTrackedPropertiesMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAFoveationEyeTracked#XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemFoveationEyeTrackedPropertiesMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsFoveationEyeTracked};
 * }</code></pre>
 */
public class XrSystemFoveationEyeTrackedPropertiesMETA extends Struct<XrSystemFoveationEyeTrackedPropertiesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSFOVEATIONEYETRACKED;

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
        SUPPORTSFOVEATIONEYETRACKED = layout.offsetof(2);
    }

    protected XrSystemFoveationEyeTrackedPropertiesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemFoveationEyeTrackedPropertiesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(address, container);
    }

    /**
     * Creates a {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemFoveationEyeTrackedPropertiesMETA(ByteBuffer container) {
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
    /** indicates if the current system is capable of eye tracked foveation. */
    @NativeType("XrBool32")
    public boolean supportsFoveationEyeTracked() { return nsupportsFoveationEyeTracked(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemFoveationEyeTrackedPropertiesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META} value to the {@link #type} field. */
    public XrSystemFoveationEyeTrackedPropertiesMETA type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemFoveationEyeTrackedPropertiesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemFoveationEyeTrackedPropertiesMETA set(
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
    public XrSystemFoveationEyeTrackedPropertiesMETA set(XrSystemFoveationEyeTrackedPropertiesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemFoveationEyeTrackedPropertiesMETA malloc() {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemFoveationEyeTrackedPropertiesMETA calloc() {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance allocated with {@link BufferUtils}. */
    public static XrSystemFoveationEyeTrackedPropertiesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemFoveationEyeTrackedPropertiesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance for the specified memory address. */
    public static XrSystemFoveationEyeTrackedPropertiesMETA create(long address) {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemFoveationEyeTrackedPropertiesMETA createSafe(long address) {
        return address == NULL ? null : new XrSystemFoveationEyeTrackedPropertiesMETA(address, null);
    }

    /**
     * Returns a new {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA malloc(MemoryStack stack) {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemFoveationEyeTrackedPropertiesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA calloc(MemoryStack stack) {
        return new XrSystemFoveationEyeTrackedPropertiesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemFoveationEyeTrackedPropertiesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemFoveationEyeTrackedPropertiesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemFoveationEyeTrackedPropertiesMETA.NEXT); }
    /** Unsafe version of {@link #supportsFoveationEyeTracked}. */
    public static int nsupportsFoveationEyeTracked(long struct) { return UNSAFE.getInt(null, struct + XrSystemFoveationEyeTrackedPropertiesMETA.SUPPORTSFOVEATIONEYETRACKED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemFoveationEyeTrackedPropertiesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemFoveationEyeTrackedPropertiesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemFoveationEyeTrackedPropertiesMETA} structs. */
    public static class Buffer extends StructBuffer<XrSystemFoveationEyeTrackedPropertiesMETA, Buffer> implements NativeResource {

        private static final XrSystemFoveationEyeTrackedPropertiesMETA ELEMENT_FACTORY = XrSystemFoveationEyeTrackedPropertiesMETA.create(-1L);

        /**
         * Creates a new {@code XrSystemFoveationEyeTrackedPropertiesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemFoveationEyeTrackedPropertiesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemFoveationEyeTrackedPropertiesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemFoveationEyeTrackedPropertiesMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemFoveationEyeTrackedPropertiesMETA.ntype(address()); }
        /** @return the value of the {@link XrSystemFoveationEyeTrackedPropertiesMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemFoveationEyeTrackedPropertiesMETA.nnext(address()); }
        /** @return the value of the {@link XrSystemFoveationEyeTrackedPropertiesMETA#supportsFoveationEyeTracked} field. */
        @NativeType("XrBool32")
        public boolean supportsFoveationEyeTracked() { return XrSystemFoveationEyeTrackedPropertiesMETA.nsupportsFoveationEyeTracked(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemFoveationEyeTrackedPropertiesMETA#type} field. */
        public XrSystemFoveationEyeTrackedPropertiesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSystemFoveationEyeTrackedPropertiesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META} value to the {@link XrSystemFoveationEyeTrackedPropertiesMETA#type} field. */
        public XrSystemFoveationEyeTrackedPropertiesMETA.Buffer type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_SYSTEM_FOVEATION_EYE_TRACKED_PROPERTIES_META); }
        /** Sets the specified value to the {@link XrSystemFoveationEyeTrackedPropertiesMETA#next} field. */
        public XrSystemFoveationEyeTrackedPropertiesMETA.Buffer next(@NativeType("void *") long value) { XrSystemFoveationEyeTrackedPropertiesMETA.nnext(address(), value); return this; }

    }

}