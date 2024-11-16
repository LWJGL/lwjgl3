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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The information to create a foveation profile.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFoveation XR_FB_foveation} extension <b>must</b> be enabled prior to using {@link XrFoveationProfileCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFoveation#XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_PROFILE_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrFoveationLevelProfileCreateInfoFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBFoveation#xrCreateFoveationProfileFB CreateFoveationProfileFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationProfileCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 * }</code></pre>
 */
public class XrFoveationProfileCreateInfoFB extends Struct<XrFoveationProfileCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrFoveationProfileCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationProfileCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationProfileCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrFoveationProfileCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationProfileCreateInfoFB(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationProfileCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFoveation#XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_PROFILE_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrFoveationProfileCreateInfoFB type$Default() { return type(FBFoveation.XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationProfileCreateInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFoveationLevelProfileCreateInfoFB} value to the {@code next} chain. */
    public XrFoveationProfileCreateInfoFB next(XrFoveationLevelProfileCreateInfoFB value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrFoveationProfileCreateInfoFB set(
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
    public XrFoveationProfileCreateInfoFB set(XrFoveationProfileCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationProfileCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationProfileCreateInfoFB malloc() {
        return new XrFoveationProfileCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationProfileCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationProfileCreateInfoFB calloc() {
        return new XrFoveationProfileCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationProfileCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrFoveationProfileCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationProfileCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationProfileCreateInfoFB} instance for the specified memory address. */
    public static XrFoveationProfileCreateInfoFB create(long address) {
        return new XrFoveationProfileCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFoveationProfileCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrFoveationProfileCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrFoveationProfileCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationProfileCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationProfileCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationProfileCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFoveationProfileCreateInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationProfileCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationProfileCreateInfoFB malloc(MemoryStack stack) {
        return new XrFoveationProfileCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationProfileCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationProfileCreateInfoFB calloc(MemoryStack stack) {
        return new XrFoveationProfileCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationProfileCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationProfileCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationProfileCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFoveationProfileCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationProfileCreateInfoFB.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFoveationProfileCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationProfileCreateInfoFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrFoveationProfileCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrFoveationProfileCreateInfoFB, Buffer> implements NativeResource {

        private static final XrFoveationProfileCreateInfoFB ELEMENT_FACTORY = XrFoveationProfileCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrFoveationProfileCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationProfileCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationProfileCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationProfileCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationProfileCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrFoveationProfileCreateInfoFB#next} field. */
        @NativeType("void *")
        public long next() { return XrFoveationProfileCreateInfoFB.nnext(address()); }

        /** Sets the specified value to the {@link XrFoveationProfileCreateInfoFB#type} field. */
        public XrFoveationProfileCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationProfileCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFoveation#XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB TYPE_FOVEATION_PROFILE_CREATE_INFO_FB} value to the {@link XrFoveationProfileCreateInfoFB#type} field. */
        public XrFoveationProfileCreateInfoFB.Buffer type$Default() { return type(FBFoveation.XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrFoveationProfileCreateInfoFB#next} field. */
        public XrFoveationProfileCreateInfoFB.Buffer next(@NativeType("void *") long value) { XrFoveationProfileCreateInfoFB.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFoveationLevelProfileCreateInfoFB} value to the {@code next} chain. */
        public XrFoveationProfileCreateInfoFB.Buffer next(XrFoveationLevelProfileCreateInfoFB value) { return this.next(value.next(this.next()).address()); }

    }

}