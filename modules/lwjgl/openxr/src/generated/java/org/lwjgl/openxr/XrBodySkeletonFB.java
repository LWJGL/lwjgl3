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
 * Returns the body skeleton hierarchy.
 * 
 * <h5>Description</h5>
 * 
 * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE} if {@code jointCount} does not equal to the number of joints defined by the {@code XrBodyJointSetFB} used to create the {@code XrBodyTrackerFB}.</p>
 * 
 * <p>The runtime <b>must</b> return {@code joints} representing the default pose of the current estimation regarding the user’s skeleton.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBBodyTracking XR_FB_body_tracking} extension <b>must</b> be enabled prior to using {@link XrBodySkeletonFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBBodyTracking#XR_TYPE_BODY_SKELETON_FB TYPE_BODY_SKELETON_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code joints} <b>must</b> be a pointer to an array of {@code jointCount} {@link XrBodySkeletonJointFB} structures</li>
 * <li>The {@code jointCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBodySkeletonJointFB}, {@link FBBodyTracking#xrGetBodySkeletonFB GetBodySkeletonFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBodySkeletonFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #jointCount};
 *     {@link XrBodySkeletonJointFB XrBodySkeletonJointFB} * {@link #joints};
 * }</code></pre>
 */
public class XrBodySkeletonFB extends Struct<XrBodySkeletonFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCOUNT,
        JOINTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        JOINTCOUNT = layout.offsetof(2);
        JOINTS = layout.offsetof(3);
    }

    protected XrBodySkeletonFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodySkeletonFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodySkeletonFB(address, container);
    }

    /**
     * Creates a {@code XrBodySkeletonFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodySkeletonFB(ByteBuffer container) {
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
    /** an {@code uint32_t} describing the count of elements in {@code joints} array. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** an application-allocated array of {@link XrBodySkeletonJointFB} that will be filled with skeleton joint elements. */
    @NativeType("XrBodySkeletonJointFB *")
    public XrBodySkeletonJointFB.Buffer joints() { return njoints(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBodySkeletonFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_SKELETON_FB TYPE_BODY_SKELETON_FB} value to the {@link #type} field. */
    public XrBodySkeletonFB type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_SKELETON_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrBodySkeletonFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodySkeletonJointFB.Buffer} to the {@link #joints} field. */
    public XrBodySkeletonFB joints(@NativeType("XrBodySkeletonJointFB *") XrBodySkeletonJointFB.Buffer value) { njoints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodySkeletonFB set(
        int type,
        long next,
        XrBodySkeletonJointFB.Buffer joints
    ) {
        type(type);
        next(next);
        joints(joints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodySkeletonFB set(XrBodySkeletonFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodySkeletonFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonFB malloc() {
        return new XrBodySkeletonFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodySkeletonFB calloc() {
        return new XrBodySkeletonFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodySkeletonFB} instance allocated with {@link BufferUtils}. */
    public static XrBodySkeletonFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodySkeletonFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodySkeletonFB} instance for the specified memory address. */
    public static XrBodySkeletonFB create(long address) {
        return new XrBodySkeletonFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodySkeletonFB createSafe(long address) {
        return address == NULL ? null : new XrBodySkeletonFB(address, null);
    }

    /**
     * Returns a new {@link XrBodySkeletonFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodySkeletonFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBodySkeletonFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodySkeletonFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonFB malloc(MemoryStack stack) {
        return new XrBodySkeletonFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodySkeletonFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodySkeletonFB calloc(MemoryStack stack) {
        return new XrBodySkeletonFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodySkeletonFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodySkeletonFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodySkeletonFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBodySkeletonFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodySkeletonFB.NEXT); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return UNSAFE.getInt(null, struct + XrBodySkeletonFB.JOINTCOUNT); }
    /** Unsafe version of {@link #joints}. */
    public static XrBodySkeletonJointFB.Buffer njoints(long struct) { return XrBodySkeletonJointFB.create(memGetAddress(struct + XrBodySkeletonFB.JOINTS), njointCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBodySkeletonFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodySkeletonFB.NEXT, value); }
    /** Sets the specified value to the {@code jointCount} field of the specified {@code struct}. */
    public static void njointCount(long struct, int value) { UNSAFE.putInt(null, struct + XrBodySkeletonFB.JOINTCOUNT, value); }
    /** Unsafe version of {@link #joints(XrBodySkeletonJointFB.Buffer) joints}. */
    public static void njoints(long struct, XrBodySkeletonJointFB.Buffer value) { memPutAddress(struct + XrBodySkeletonFB.JOINTS, value.address()); njointCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodySkeletonFB.JOINTS));
    }

    // -----------------------------------

    /** An array of {@link XrBodySkeletonFB} structs. */
    public static class Buffer extends StructBuffer<XrBodySkeletonFB, Buffer> implements NativeResource {

        private static final XrBodySkeletonFB ELEMENT_FACTORY = XrBodySkeletonFB.create(-1L);

        /**
         * Creates a new {@code XrBodySkeletonFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodySkeletonFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodySkeletonFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBodySkeletonFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodySkeletonFB.ntype(address()); }
        /** @return the value of the {@link XrBodySkeletonFB#next} field. */
        @NativeType("void *")
        public long next() { return XrBodySkeletonFB.nnext(address()); }
        /** @return the value of the {@link XrBodySkeletonFB#jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrBodySkeletonFB.njointCount(address()); }
        /** @return a {@link XrBodySkeletonJointFB.Buffer} view of the struct array pointed to by the {@link XrBodySkeletonFB#joints} field. */
        @NativeType("XrBodySkeletonJointFB *")
        public XrBodySkeletonJointFB.Buffer joints() { return XrBodySkeletonFB.njoints(address()); }

        /** Sets the specified value to the {@link XrBodySkeletonFB#type} field. */
        public XrBodySkeletonFB.Buffer type(@NativeType("XrStructureType") int value) { XrBodySkeletonFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_SKELETON_FB TYPE_BODY_SKELETON_FB} value to the {@link XrBodySkeletonFB#type} field. */
        public XrBodySkeletonFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_SKELETON_FB); }
        /** Sets the specified value to the {@link XrBodySkeletonFB#next} field. */
        public XrBodySkeletonFB.Buffer next(@NativeType("void *") long value) { XrBodySkeletonFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodySkeletonJointFB.Buffer} to the {@link XrBodySkeletonFB#joints} field. */
        public XrBodySkeletonFB.Buffer joints(@NativeType("XrBodySkeletonJointFB *") XrBodySkeletonJointFB.Buffer value) { XrBodySkeletonFB.njoints(address(), value); return this; }

    }

}