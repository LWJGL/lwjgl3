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
 * Describes the information to locate body joints.
 * 
 * <h5>Description</h5>
 * 
 * <p>Callers <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to support body tracking at this time.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodyJointsLocateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB TYPE_BODY_JOINTS_LOCATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBBodyTracking#xrLocateBodyJointsFB LocateBodyJointsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodyJointsLocateInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrBodyJointsLocateInfoFB extends Struct<XrBodyJointsLocateInfoFB> implements NativeResource {

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

    protected XrBodyJointsLocateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointsLocateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointsLocateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrBodyJointsLocateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointsLocateInfoFB(ByteBuffer container) {
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
    public XrBodyJointsLocateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB TYPE_BODY_JOINTS_LOCATE_INFO_FB} value to the {@link #type} field. */
    public XrBodyJointsLocateInfoFB type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodyJointsLocateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrBodyJointsLocateInfoFB baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrBodyJointsLocateInfoFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointsLocateInfoFB set(
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
    public XrBodyJointsLocateInfoFB set(XrBodyJointsLocateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointsLocateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointsLocateInfoFB malloc() {
        return new XrBodyJointsLocateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointsLocateInfoFB calloc() {
        return new XrBodyJointsLocateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointsLocateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointsLocateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointsLocateInfoFB} instance for the specified memory address. */
    public static XrBodyJointsLocateInfoFB create(long address) {
        return new XrBodyJointsLocateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointsLocateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrBodyJointsLocateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointsLocateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodyJointsLocateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointsLocateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointsLocateInfoFB malloc(MemoryStack stack) {
        return new XrBodyJointsLocateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointsLocateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointsLocateInfoFB calloc(MemoryStack stack) {
        return new XrBodyJointsLocateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointsLocateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointsLocateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBodyJointsLocateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointsLocateInfoFB.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrBodyJointsLocateInfoFB.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrBodyJointsLocateInfoFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBodyJointsLocateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointsLocateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrBodyJointsLocateInfoFB.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrBodyJointsLocateInfoFB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointsLocateInfoFB.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointsLocateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointsLocateInfoFB, Buffer> implements NativeResource {

        private static final XrBodyJointsLocateInfoFB ELEMENT_FACTORY = XrBodyJointsLocateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrBodyJointsLocateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointsLocateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointsLocateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodyJointsLocateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointsLocateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyJointsLocateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoFB#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrBodyJointsLocateInfoFB.nbaseSpace(address()); }
        /** @return the value of the {@link XrBodyJointsLocateInfoFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrBodyJointsLocateInfoFB.ntime(address()); }

        /** Sets the specified value to the {@link XrBodyJointsLocateInfoFB#type} field. */
        public XrBodyJointsLocateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointsLocateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB TYPE_BODY_JOINTS_LOCATE_INFO_FB} value to the {@link XrBodyJointsLocateInfoFB#type} field. */
        public XrBodyJointsLocateInfoFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINTS_LOCATE_INFO_FB); }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoFB#next} field. */
        public XrBodyJointsLocateInfoFB.Buffer next(@NativeType("void const *") long value) { XrBodyJointsLocateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoFB#baseSpace} field. */
        public XrBodyJointsLocateInfoFB.Buffer baseSpace(XrSpace value) { XrBodyJointsLocateInfoFB.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrBodyJointsLocateInfoFB#time} field. */
        public XrBodyJointsLocateInfoFB.Buffer time(@NativeType("XrTime") long value) { XrBodyJointsLocateInfoFB.ntime(address(), value); return this; }

    }

}