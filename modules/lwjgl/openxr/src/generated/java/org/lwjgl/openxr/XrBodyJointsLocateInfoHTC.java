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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the information to locate body joints.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrBodyJointsLocateInfoHTC} structure describes the information to locate individual body joints.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyJointsLocateInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC TYPE_BODY_JOINTS_LOCATE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link HTCBodyTracking#xrLocateBodyJointsHTC LocateBodyJointsHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyJointsLocateInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrBodyJointsLocateInfoHTC extends Struct<XrBodyJointsLocateInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME;

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
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    protected XrBodyJointsLocateInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointsLocateInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointsLocateInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyJointsLocateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointsLocateInfoHTC(ByteBuffer container) {
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
    /** an {@code XrSpace} within which the returned body joint locations will be represented. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** an {@code XrTime} at which to locate the body joints. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodyJointsLocateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC TYPE_BODY_JOINTS_LOCATE_INFO_HTC} value to the {@link #type} field. */
    public XrBodyJointsLocateInfoHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyJointsLocateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrBodyJointsLocateInfoHTC baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrBodyJointsLocateInfoHTC time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointsLocateInfoHTC set(
        int type,
        long next,
        XrSpace baseSpace,
        long time
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointsLocateInfoHTC set(XrBodyJointsLocateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointsLocateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointsLocateInfoHTC malloc() {
        return new XrBodyJointsLocateInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointsLocateInfoHTC calloc() {
        return new XrBodyJointsLocateInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointsLocateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointsLocateInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoHTC} instance for the specified memory address. */
    public static XrBodyJointsLocateInfoHTC create(long address) {
        return new XrBodyJointsLocateInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointsLocateInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyJointsLocateInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointsLocateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointsLocateInfoHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointsLocateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointsLocateInfoHTC malloc(MemoryStack stack) {
        return new XrBodyJointsLocateInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointsLocateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointsLocateInfoHTC calloc(MemoryStack stack) {
        return new XrBodyJointsLocateInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointsLocateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointsLocateInfoHTC.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrBodyJointsLocateInfoHTC.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrBodyJointsLocateInfoHTC.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointsLocateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointsLocateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrBodyJointsLocateInfoHTC.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrBodyJointsLocateInfoHTC.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointsLocateInfoHTC.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointsLocateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointsLocateInfoHTC, Buffer> implements NativeResource {

        private static final XrBodyJointsLocateInfoHTC ELEMENT_FACTORY = XrBodyJointsLocateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyJointsLocateInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointsLocateInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointsLocateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyJointsLocateInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointsLocateInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyJointsLocateInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoHTC#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrBodyJointsLocateInfoHTC.nbaseSpace(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoHTC#time} field. */
        @NativeType("XrTime")
        public long time() { return XrBodyJointsLocateInfoHTC.ntime(address()); }

        /** Sets the specified value to the {@link XrBodyJointsLocateInfoHTC#type} field. */
        public XrBodyJointsLocateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointsLocateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC TYPE_BODY_JOINTS_LOCATE_INFO_HTC} value to the {@link XrBodyJointsLocateInfoHTC#type} field. */
        public XrBodyJointsLocateInfoHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINTS_LOCATE_INFO_HTC); }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoHTC#next} field. */
        public XrBodyJointsLocateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrBodyJointsLocateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoHTC#baseSpace} field. */
        public XrBodyJointsLocateInfoHTC.Buffer baseSpace(XrSpace value) { XrBodyJointsLocateInfoHTC.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoHTC#time} field. */
        public XrBodyJointsLocateInfoHTC.Buffer time(@NativeType("XrTime") long value) { XrBodyJointsLocateInfoHTC.ntime(address(), value); return this; }

    }

}