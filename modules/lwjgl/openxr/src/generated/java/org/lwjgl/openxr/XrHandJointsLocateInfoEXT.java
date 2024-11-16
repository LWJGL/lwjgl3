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
 * Describes the information to locate hand joints.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandTracking XR_EXT_hand_tracking} extension <b>must</b> be enabled prior to using {@link XrHandJointsLocateInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandTracking#XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT TYPE_HAND_JOINTS_LOCATE_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrHandJointsMotionRangeInfoEXT}</li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTHandTracking#xrLocateHandJointsEXT LocateHandJointsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointsLocateInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrHandJointsLocateInfoEXT extends Struct<XrHandJointsLocateInfoEXT> implements NativeResource {

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

    protected XrHandJointsLocateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandJointsLocateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandJointsLocateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrHandJointsLocateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointsLocateInfoEXT(ByteBuffer container) {
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
    /** an {@code XrSpace} within which the returned hand joint locations will be represented. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** an {@code XrTime} at which to locate the hand joints. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandJointsLocateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT TYPE_HAND_JOINTS_LOCATE_INFO_EXT} value to the {@link #type} field. */
    public XrHandJointsLocateInfoEXT type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandJointsLocateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrHandJointsMotionRangeInfoEXT} value to the {@code next} chain. */
    public XrHandJointsLocateInfoEXT next(XrHandJointsMotionRangeInfoEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrHandJointsLocateInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrHandJointsLocateInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointsLocateInfoEXT set(
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
    public XrHandJointsLocateInfoEXT set(XrHandJointsLocateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointsLocateInfoEXT malloc() {
        return new XrHandJointsLocateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointsLocateInfoEXT calloc() {
        return new XrHandJointsLocateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointsLocateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandJointsLocateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointsLocateInfoEXT} instance for the specified memory address. */
    public static XrHandJointsLocateInfoEXT create(long address) {
        return new XrHandJointsLocateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandJointsLocateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrHandJointsLocateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandJointsLocateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandJointsLocateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsLocateInfoEXT malloc(MemoryStack stack) {
        return new XrHandJointsLocateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandJointsLocateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsLocateInfoEXT calloc(MemoryStack stack) {
        return new XrHandJointsLocateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsLocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsLocateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandJointsLocateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointsLocateInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrHandJointsLocateInfoEXT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandJointsLocateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointsLocateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrHandJointsLocateInfoEXT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandJointsLocateInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrHandJointsLocateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointsLocateInfoEXT, Buffer> implements NativeResource {

        private static final XrHandJointsLocateInfoEXT ELEMENT_FACTORY = XrHandJointsLocateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointsLocateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointsLocateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandJointsLocateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointsLocateInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointsLocateInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrHandJointsLocateInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHandJointsLocateInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrHandJointsLocateInfoEXT#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrHandJointsLocateInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@link XrHandJointsLocateInfoEXT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrHandJointsLocateInfoEXT.ntime(address()); }

        /** Sets the specified value to the {@link XrHandJointsLocateInfoEXT#type} field. */
        public XrHandJointsLocateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointsLocateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandTracking#XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT TYPE_HAND_JOINTS_LOCATE_INFO_EXT} value to the {@link XrHandJointsLocateInfoEXT#type} field. */
        public XrHandJointsLocateInfoEXT.Buffer type$Default() { return type(EXTHandTracking.XR_TYPE_HAND_JOINTS_LOCATE_INFO_EXT); }
        /** Sets the specified value to the {@link XrHandJointsLocateInfoEXT#next} field. */
        public XrHandJointsLocateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandJointsLocateInfoEXT.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrHandJointsMotionRangeInfoEXT} value to the {@code next} chain. */
        public XrHandJointsLocateInfoEXT.Buffer next(XrHandJointsMotionRangeInfoEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrHandJointsLocateInfoEXT#baseSpace} field. */
        public XrHandJointsLocateInfoEXT.Buffer baseSpace(XrSpace value) { XrHandJointsLocateInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandJointsLocateInfoEXT#time} field. */
        public XrHandJointsLocateInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrHandJointsLocateInfoEXT.ntime(address(), value); return this; }

    }

}