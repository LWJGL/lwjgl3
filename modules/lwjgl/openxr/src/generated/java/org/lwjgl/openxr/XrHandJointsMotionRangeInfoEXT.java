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
 * Chains to XrHandJointsLocateInfoEXT to specify final hand tracking grip pose.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTHandJointsMotionRange XR_EXT_hand_joints_motion_range} extension <b>must</b> be enabled prior to using {@link XrHandJointsMotionRangeInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTHandJointsMotionRange#XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code handJointsMotionRange} <b>must</b> be a valid {@code XrHandJointsMotionRangeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandJointsLocateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandJointsMotionRangeInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrHandJointsMotionRangeEXT {@link #handJointsMotionRange};
 * }</code></pre>
 */
public class XrHandJointsMotionRangeInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HANDJOINTSMOTIONRANGE;

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
        HANDJOINTSMOTIONRANGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrHandJointsMotionRangeInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointsMotionRangeInfoEXT(ByteBuffer container) {
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
    /** an {@code XrHandJointsMotionRangeEXT} that defines the hand joint range of motion the application wants. */
    @NativeType("XrHandJointsMotionRangeEXT")
    public int handJointsMotionRange() { return nhandJointsMotionRange(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHandJointsMotionRangeInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandJointsMotionRange#XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT} value to the {@link #type} field. */
    public XrHandJointsMotionRangeInfoEXT type$Default() { return type(EXTHandJointsMotionRange.XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrHandJointsMotionRangeInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #handJointsMotionRange} field. */
    public XrHandJointsMotionRangeInfoEXT handJointsMotionRange(@NativeType("XrHandJointsMotionRangeEXT") int value) { nhandJointsMotionRange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointsMotionRangeInfoEXT set(
        int type,
        long next,
        int handJointsMotionRange
    ) {
        type(type);
        next(next);
        handJointsMotionRange(handJointsMotionRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointsMotionRangeInfoEXT set(XrHandJointsMotionRangeInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointsMotionRangeInfoEXT malloc() {
        return wrap(XrHandJointsMotionRangeInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointsMotionRangeInfoEXT calloc() {
        return wrap(XrHandJointsMotionRangeInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointsMotionRangeInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandJointsMotionRangeInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance for the specified memory address. */
    public static XrHandJointsMotionRangeInfoEXT create(long address) {
        return wrap(XrHandJointsMotionRangeInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointsMotionRangeInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandJointsMotionRangeInfoEXT.class, address);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandJointsMotionRangeInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsMotionRangeInfoEXT malloc(MemoryStack stack) {
        return wrap(XrHandJointsMotionRangeInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsMotionRangeInfoEXT calloc(MemoryStack stack) {
        return wrap(XrHandJointsMotionRangeInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandJointsMotionRangeInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointsMotionRangeInfoEXT.NEXT); }
    /** Unsafe version of {@link #handJointsMotionRange}. */
    public static int nhandJointsMotionRange(long struct) { return UNSAFE.getInt(null, struct + XrHandJointsMotionRangeInfoEXT.HANDJOINTSMOTIONRANGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointsMotionRangeInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointsMotionRangeInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #handJointsMotionRange(int) handJointsMotionRange}. */
    public static void nhandJointsMotionRange(long struct, int value) { UNSAFE.putInt(null, struct + XrHandJointsMotionRangeInfoEXT.HANDJOINTSMOTIONRANGE, value); }

    // -----------------------------------

    /** An array of {@link XrHandJointsMotionRangeInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointsMotionRangeInfoEXT, Buffer> implements NativeResource {

        private static final XrHandJointsMotionRangeInfoEXT ELEMENT_FACTORY = XrHandJointsMotionRangeInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointsMotionRangeInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointsMotionRangeInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandJointsMotionRangeInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHandJointsMotionRangeInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointsMotionRangeInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrHandJointsMotionRangeInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrHandJointsMotionRangeInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrHandJointsMotionRangeInfoEXT#handJointsMotionRange} field. */
        @NativeType("XrHandJointsMotionRangeEXT")
        public int handJointsMotionRange() { return XrHandJointsMotionRangeInfoEXT.nhandJointsMotionRange(address()); }

        /** Sets the specified value to the {@link XrHandJointsMotionRangeInfoEXT#type} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointsMotionRangeInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandJointsMotionRange#XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT} value to the {@link XrHandJointsMotionRangeInfoEXT#type} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer type$Default() { return type(EXTHandJointsMotionRange.XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT); }
        /** Sets the specified value to the {@link XrHandJointsMotionRangeInfoEXT#next} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandJointsMotionRangeInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrHandJointsMotionRangeInfoEXT#handJointsMotionRange} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer handJointsMotionRange(@NativeType("XrHandJointsMotionRangeEXT") int value) { XrHandJointsMotionRangeInfoEXT.nhandJointsMotionRange(address(), value); return this; }

    }

}