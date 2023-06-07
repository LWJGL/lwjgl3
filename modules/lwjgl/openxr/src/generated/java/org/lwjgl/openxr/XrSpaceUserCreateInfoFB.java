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
 * Describes a user.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceUserCreateInfoFB} structure describes a user with which the application <b>can</b> interact.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityUser XR_FB_spatial_entity_user} extension <b>must</b> be enabled prior to using {@link XrSpaceUserCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityUser#XR_TYPE_SPACE_USER_CREATE_INFO_FB TYPE_SPACE_USER_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntityUser#xrCreateSpaceUserFB CreateSpaceUserFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceUserCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpaceUserIdFB {@link #userId};
 * }</code></pre>
 */
public class XrSpaceUserCreateInfoFB extends Struct<XrSpaceUserCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        USERID;

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
        USERID = layout.offsetof(2);
    }

    protected XrSpaceUserCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceUserCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceUserCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceUserCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceUserCreateInfoFB(ByteBuffer container) {
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
    /** the user ID with which the application can reference. */
    @NativeType("XrSpaceUserIdFB")
    public long userId() { return nuserId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceUserCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityUser#XR_TYPE_SPACE_USER_CREATE_INFO_FB TYPE_SPACE_USER_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrSpaceUserCreateInfoFB type$Default() { return type(FBSpatialEntityUser.XR_TYPE_SPACE_USER_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceUserCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #userId} field. */
    public XrSpaceUserCreateInfoFB userId(@NativeType("XrSpaceUserIdFB") long value) { nuserId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceUserCreateInfoFB set(
        int type,
        long next,
        long userId
    ) {
        type(type);
        next(next);
        userId(userId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceUserCreateInfoFB set(XrSpaceUserCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceUserCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceUserCreateInfoFB malloc() {
        return new XrSpaceUserCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceUserCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceUserCreateInfoFB calloc() {
        return new XrSpaceUserCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceUserCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceUserCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceUserCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceUserCreateInfoFB} instance for the specified memory address. */
    public static XrSpaceUserCreateInfoFB create(long address) {
        return new XrSpaceUserCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceUserCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceUserCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceUserCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUserCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUserCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceUserCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceUserCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceUserCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceUserCreateInfoFB malloc(MemoryStack stack) {
        return new XrSpaceUserCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceUserCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceUserCreateInfoFB calloc(MemoryStack stack) {
        return new XrSpaceUserCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceUserCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceUserCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceUserCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceUserCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceUserCreateInfoFB.NEXT); }
    /** Unsafe version of {@link #userId}. */
    public static long nuserId(long struct) { return UNSAFE.getLong(null, struct + XrSpaceUserCreateInfoFB.USERID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceUserCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceUserCreateInfoFB.NEXT, value); }
    /** Unsafe version of {@link #userId(long) userId}. */
    public static void nuserId(long struct, long value) { UNSAFE.putLong(null, struct + XrSpaceUserCreateInfoFB.USERID, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceUserCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceUserCreateInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceUserCreateInfoFB ELEMENT_FACTORY = XrSpaceUserCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceUserCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceUserCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceUserCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceUserCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceUserCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceUserCreateInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceUserCreateInfoFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceUserCreateInfoFB#userId} field. */
        @NativeType("XrSpaceUserIdFB")
        public long userId() { return XrSpaceUserCreateInfoFB.nuserId(address()); }

        /** Sets the specified value to the {@link XrSpaceUserCreateInfoFB#type} field. */
        public XrSpaceUserCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceUserCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityUser#XR_TYPE_SPACE_USER_CREATE_INFO_FB TYPE_SPACE_USER_CREATE_INFO_FB} value to the {@link XrSpaceUserCreateInfoFB#type} field. */
        public XrSpaceUserCreateInfoFB.Buffer type$Default() { return type(FBSpatialEntityUser.XR_TYPE_SPACE_USER_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceUserCreateInfoFB#next} field. */
        public XrSpaceUserCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceUserCreateInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSpaceUserCreateInfoFB#userId} field. */
        public XrSpaceUserCreateInfoFB.Buffer userId(@NativeType("XrSpaceUserIdFB") long value) { XrSpaceUserCreateInfoFB.nuserId(address(), value); return this; }

    }

}