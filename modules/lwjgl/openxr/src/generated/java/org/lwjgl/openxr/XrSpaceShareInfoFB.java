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
 * Describes a request to share some number of spatial entities.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceShareInfoFB} structure describes a request to share one or more spatial entities with one or more users.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntitySharing XR_FB_spatial_entity_sharing} extension <b>must</b> be enabled prior to using {@link XrSpaceShareInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntitySharing#XR_TYPE_SPACE_SHARE_INFO_FB TYPE_SPACE_SHARE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code spaces} <b>must</b> be a pointer to an array of {@code spaceCount} {@code XrSpace} handles</li>
 * <li>{@code users} <b>must</b> be a pointer to an array of {@code userCount} {@code XrSpaceUserFB} handles</li>
 * <li>The {@code spaceCount} parameter <b>must</b> be greater than 0</li>
 * <li>The {@code userCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntitySharing#xrShareSpacesFB ShareSpacesFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceShareInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t spaceCount;
 *     XrSpace * spaces;
 *     uint32_t userCount;
 *     XrSpaceUserFB * users;
 * }</code></pre>
 */
public class XrSpaceShareInfoFB extends Struct<XrSpaceShareInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACECOUNT,
        SPACES,
        USERCOUNT,
        USERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACECOUNT = layout.offsetof(2);
        SPACES = layout.offsetof(3);
        USERCOUNT = layout.offsetof(4);
        USERS = layout.offsetof(5);
    }

    protected XrSpaceShareInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceShareInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceShareInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceShareInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceShareInfoFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. {@code spaceCount} is the number of elements in the {@code spaces} list. {@code spaces} is a list containing all spatial entities to be shared. {@code userCount} is the number of elements in the {@code users} list. {@code users} is a list of the users with which the {@code spaces} will: be shared. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code spaceCount} field. */
    @NativeType("uint32_t")
    public int spaceCount() { return nspaceCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
    @NativeType("XrSpace *")
    public PointerBuffer spaces() { return nspaces(address()); }
    /** @return the value of the {@code userCount} field. */
    @NativeType("uint32_t")
    public int userCount() { return nuserCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code users} field. */
    @NativeType("XrSpaceUserFB *")
    public PointerBuffer users() { return nusers(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceShareInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntitySharing#XR_TYPE_SPACE_SHARE_INFO_FB TYPE_SPACE_SHARE_INFO_FB} value to the {@link #type} field. */
    public XrSpaceShareInfoFB type$Default() { return type(FBSpatialEntitySharing.XR_TYPE_SPACE_SHARE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceShareInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
    public XrSpaceShareInfoFB spaces(@NativeType("XrSpace *") PointerBuffer value) { nspaces(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code users} field. */
    public XrSpaceShareInfoFB users(@NativeType("XrSpaceUserFB *") PointerBuffer value) { nusers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceShareInfoFB set(
        int type,
        long next,
        PointerBuffer spaces,
        PointerBuffer users
    ) {
        type(type);
        next(next);
        spaces(spaces);
        users(users);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceShareInfoFB set(XrSpaceShareInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceShareInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceShareInfoFB malloc() {
        return new XrSpaceShareInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceShareInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceShareInfoFB calloc() {
        return new XrSpaceShareInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceShareInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceShareInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceShareInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceShareInfoFB} instance for the specified memory address. */
    public static XrSpaceShareInfoFB create(long address) {
        return new XrSpaceShareInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceShareInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceShareInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceShareInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceShareInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceShareInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceShareInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceShareInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceShareInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceShareInfoFB malloc(MemoryStack stack) {
        return new XrSpaceShareInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceShareInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceShareInfoFB calloc(MemoryStack stack) {
        return new XrSpaceShareInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceShareInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceShareInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceShareInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceShareInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceShareInfoFB.NEXT); }
    /** Unsafe version of {@link #spaceCount}. */
    public static int nspaceCount(long struct) { return UNSAFE.getInt(null, struct + XrSpaceShareInfoFB.SPACECOUNT); }
    /** Unsafe version of {@link #spaces() spaces}. */
    public static PointerBuffer nspaces(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpaceShareInfoFB.SPACES), nspaceCount(struct)); }
    /** Unsafe version of {@link #userCount}. */
    public static int nuserCount(long struct) { return UNSAFE.getInt(null, struct + XrSpaceShareInfoFB.USERCOUNT); }
    /** Unsafe version of {@link #users() users}. */
    public static PointerBuffer nusers(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpaceShareInfoFB.USERS), nuserCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceShareInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceShareInfoFB.NEXT, value); }
    /** Sets the specified value to the {@code spaceCount} field of the specified {@code struct}. */
    public static void nspaceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceShareInfoFB.SPACECOUNT, value); }
    /** Unsafe version of {@link #spaces(PointerBuffer) spaces}. */
    public static void nspaces(long struct, PointerBuffer value) { memPutAddress(struct + XrSpaceShareInfoFB.SPACES, memAddress(value)); nspaceCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code userCount} field of the specified {@code struct}. */
    public static void nuserCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceShareInfoFB.USERCOUNT, value); }
    /** Unsafe version of {@link #users(PointerBuffer) users}. */
    public static void nusers(long struct, PointerBuffer value) { memPutAddress(struct + XrSpaceShareInfoFB.USERS, memAddress(value)); nuserCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpaceShareInfoFB.SPACES));
        check(memGetAddress(struct + XrSpaceShareInfoFB.USERS));
    }

    // -----------------------------------

    /** An array of {@link XrSpaceShareInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceShareInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceShareInfoFB ELEMENT_FACTORY = XrSpaceShareInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceShareInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceShareInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceShareInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceShareInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceShareInfoFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceShareInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceShareInfoFB.nnext(address()); }
        /** @return the value of the {@code spaceCount} field. */
        @NativeType("uint32_t")
        public int spaceCount() { return XrSpaceShareInfoFB.nspaceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code spaces} field. */
        @NativeType("XrSpace *")
        public PointerBuffer spaces() { return XrSpaceShareInfoFB.nspaces(address()); }
        /** @return the value of the {@code userCount} field. */
        @NativeType("uint32_t")
        public int userCount() { return XrSpaceShareInfoFB.nuserCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code users} field. */
        @NativeType("XrSpaceUserFB *")
        public PointerBuffer users() { return XrSpaceShareInfoFB.nusers(address()); }

        /** Sets the specified value to the {@link XrSpaceShareInfoFB#type} field. */
        public XrSpaceShareInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceShareInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntitySharing#XR_TYPE_SPACE_SHARE_INFO_FB TYPE_SPACE_SHARE_INFO_FB} value to the {@link XrSpaceShareInfoFB#type} field. */
        public XrSpaceShareInfoFB.Buffer type$Default() { return type(FBSpatialEntitySharing.XR_TYPE_SPACE_SHARE_INFO_FB); }
        /** Sets the specified value to the {@link XrSpaceShareInfoFB#next} field. */
        public XrSpaceShareInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceShareInfoFB.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code spaces} field. */
        public XrSpaceShareInfoFB.Buffer spaces(@NativeType("XrSpace *") PointerBuffer value) { XrSpaceShareInfoFB.nspaces(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code users} field. */
        public XrSpaceShareInfoFB.Buffer users(@NativeType("XrSpaceUserFB *") PointerBuffer value) { XrSpaceShareInfoFB.nusers(address(), value); return this; }

    }

}