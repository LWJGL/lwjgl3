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
 * Base structure for all query info structures.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrSpaceQueryInfoBaseHeaderFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_INFO_FB TYPE_SPACE_QUERY_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpaceQueryInfoFB}, {@link FBSpatialEntityQuery#xrQuerySpacesFB QuerySpacesFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceQueryInfoBaseHeaderFB {
 *     XrStructureType type;
 *     void const * next;
 * }</code></pre>
 */
public class XrSpaceQueryInfoBaseHeaderFB extends Struct<XrSpaceQueryInfoBaseHeaderFB> implements NativeResource {

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

    protected XrSpaceQueryInfoBaseHeaderFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceQueryInfoBaseHeaderFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceQueryInfoBaseHeaderFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceQueryInfoBaseHeaderFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceQueryInfoBaseHeaderFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceQueryInfoBaseHeaderFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceQueryInfoBaseHeaderFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceQueryInfoBaseHeaderFB set(
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
    public XrSpaceQueryInfoBaseHeaderFB set(XrSpaceQueryInfoBaseHeaderFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryInfoBaseHeaderFB malloc() {
        return new XrSpaceQueryInfoBaseHeaderFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryInfoBaseHeaderFB calloc() {
        return new XrSpaceQueryInfoBaseHeaderFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceQueryInfoBaseHeaderFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceQueryInfoBaseHeaderFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance for the specified memory address. */
    public static XrSpaceQueryInfoBaseHeaderFB create(long address) {
        return new XrSpaceQueryInfoBaseHeaderFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryInfoBaseHeaderFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceQueryInfoBaseHeaderFB(address, null);
    }

    /** Upcasts the specified {@code XrSpaceQueryInfoFB} instance to {@code XrSpaceQueryInfoBaseHeaderFB}. */
    public static XrSpaceQueryInfoBaseHeaderFB create(XrSpaceQueryInfoFB value) {
        return new XrSpaceQueryInfoBaseHeaderFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrSpaceQueryInfoFB.Buffer} instance to {@code XrSpaceQueryInfoBaseHeaderFB.Buffer}. */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer create(XrSpaceQueryInfoFB.Buffer value) {
        return new XrSpaceQueryInfoBaseHeaderFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryInfoBaseHeaderFB malloc(MemoryStack stack) {
        return new XrSpaceQueryInfoBaseHeaderFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceQueryInfoBaseHeaderFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryInfoBaseHeaderFB calloc(MemoryStack stack) {
        return new XrSpaceQueryInfoBaseHeaderFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoBaseHeaderFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoBaseHeaderFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceQueryInfoBaseHeaderFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceQueryInfoBaseHeaderFB.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceQueryInfoBaseHeaderFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceQueryInfoBaseHeaderFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceQueryInfoBaseHeaderFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceQueryInfoBaseHeaderFB, Buffer> implements NativeResource {

        private static final XrSpaceQueryInfoBaseHeaderFB ELEMENT_FACTORY = XrSpaceQueryInfoBaseHeaderFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceQueryInfoBaseHeaderFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceQueryInfoBaseHeaderFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceQueryInfoBaseHeaderFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceQueryInfoBaseHeaderFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceQueryInfoBaseHeaderFB.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceQueryInfoBaseHeaderFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceQueryInfoBaseHeaderFB.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceQueryInfoBaseHeaderFB.Buffer next(@NativeType("void const *") long value) { XrSpaceQueryInfoBaseHeaderFB.nnext(address(), value); return this; }

    }

}