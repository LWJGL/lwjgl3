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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * XrEnvironmentDepthImageAcquireInfoMETA.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAEnvironmentDepth XR_META_environment_depth} extension <b>must</b> be enabled prior to using {@link XrEnvironmentDepthImageAcquireInfoMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link METAEnvironmentDepth#xrAcquireEnvironmentDepthImageMETA AcquireEnvironmentDepthImageMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEnvironmentDepthImageAcquireInfoMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #space};
 *     XrTime {@link #displayTime};
 * }</code></pre>
 */
public class XrEnvironmentDepthImageAcquireInfoMETA extends Struct<XrEnvironmentDepthImageAcquireInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        DISPLAYTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        DISPLAYTIME = layout.offsetof(3);
    }

    protected XrEnvironmentDepthImageAcquireInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentDepthImageAcquireInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentDepthImageAcquireInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentDepthImageAcquireInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentDepthImageAcquireInfoMETA(ByteBuffer container) {
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
    /** an {@code XrSpace} defining the reference frame of the returned pose in {@link XrEnvironmentDepthImageMETA}. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** an {@code XrTime} specifying the time used to compute the pose for the returned pose in {@link XrEnvironmentDepthImageMETA}. Clients <b>should</b> pass their predicted display time for the current frame. */
    @NativeType("XrTime")
    public long displayTime() { return ndisplayTime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEnvironmentDepthImageAcquireInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META} value to the {@link #type} field. */
    public XrEnvironmentDepthImageAcquireInfoMETA type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEnvironmentDepthImageAcquireInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #space} field. */
    public XrEnvironmentDepthImageAcquireInfoMETA space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@link #displayTime} field. */
    public XrEnvironmentDepthImageAcquireInfoMETA displayTime(@NativeType("XrTime") long value) { ndisplayTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentDepthImageAcquireInfoMETA set(
        int type,
        long next,
        XrSpace space,
        long displayTime
    ) {
        type(type);
        next(next);
        space(space);
        displayTime(displayTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentDepthImageAcquireInfoMETA set(XrEnvironmentDepthImageAcquireInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageAcquireInfoMETA malloc() {
        return new XrEnvironmentDepthImageAcquireInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentDepthImageAcquireInfoMETA calloc() {
        return new XrEnvironmentDepthImageAcquireInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentDepthImageAcquireInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentDepthImageAcquireInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance for the specified memory address. */
    public static XrEnvironmentDepthImageAcquireInfoMETA create(long address) {
        return new XrEnvironmentDepthImageAcquireInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEnvironmentDepthImageAcquireInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentDepthImageAcquireInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA malloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageAcquireInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentDepthImageAcquireInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA calloc(MemoryStack stack) {
        return new XrEnvironmentDepthImageAcquireInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentDepthImageAcquireInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEnvironmentDepthImageAcquireInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentDepthImageAcquireInfoMETA.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrEnvironmentDepthImageAcquireInfoMETA.SPACE); }
    /** Unsafe version of {@link #displayTime}. */
    public static long ndisplayTime(long struct) { return UNSAFE.getLong(null, struct + XrEnvironmentDepthImageAcquireInfoMETA.DISPLAYTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEnvironmentDepthImageAcquireInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentDepthImageAcquireInfoMETA.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrEnvironmentDepthImageAcquireInfoMETA.SPACE, value.address()); }
    /** Unsafe version of {@link #displayTime(long) displayTime}. */
    public static void ndisplayTime(long struct, long value) { UNSAFE.putLong(null, struct + XrEnvironmentDepthImageAcquireInfoMETA.DISPLAYTIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEnvironmentDepthImageAcquireInfoMETA.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrEnvironmentDepthImageAcquireInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentDepthImageAcquireInfoMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentDepthImageAcquireInfoMETA ELEMENT_FACTORY = XrEnvironmentDepthImageAcquireInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentDepthImageAcquireInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentDepthImageAcquireInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentDepthImageAcquireInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEnvironmentDepthImageAcquireInfoMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentDepthImageAcquireInfoMETA.ntype(address()); }
        /** @return the value of the {@link XrEnvironmentDepthImageAcquireInfoMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentDepthImageAcquireInfoMETA.nnext(address()); }
        /** @return the value of the {@link XrEnvironmentDepthImageAcquireInfoMETA#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrEnvironmentDepthImageAcquireInfoMETA.nspace(address()); }
        /** @return the value of the {@link XrEnvironmentDepthImageAcquireInfoMETA#displayTime} field. */
        @NativeType("XrTime")
        public long displayTime() { return XrEnvironmentDepthImageAcquireInfoMETA.ndisplayTime(address()); }

        /** Sets the specified value to the {@link XrEnvironmentDepthImageAcquireInfoMETA#type} field. */
        public XrEnvironmentDepthImageAcquireInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentDepthImageAcquireInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentDepth#XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META} value to the {@link XrEnvironmentDepthImageAcquireInfoMETA#type} field. */
        public XrEnvironmentDepthImageAcquireInfoMETA.Buffer type$Default() { return type(METAEnvironmentDepth.XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_ACQUIRE_INFO_META); }
        /** Sets the specified value to the {@link XrEnvironmentDepthImageAcquireInfoMETA#next} field. */
        public XrEnvironmentDepthImageAcquireInfoMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentDepthImageAcquireInfoMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEnvironmentDepthImageAcquireInfoMETA#space} field. */
        public XrEnvironmentDepthImageAcquireInfoMETA.Buffer space(XrSpace value) { XrEnvironmentDepthImageAcquireInfoMETA.nspace(address(), value); return this; }
        /** Sets the specified value to the {@link XrEnvironmentDepthImageAcquireInfoMETA#displayTime} field. */
        public XrEnvironmentDepthImageAcquireInfoMETA.Buffer displayTime(@NativeType("XrTime") long value) { XrEnvironmentDepthImageAcquireInfoMETA.ndisplayTime(address(), value); return this; }

    }

}