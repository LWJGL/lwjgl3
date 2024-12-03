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
 * Information about the share spaces recipient.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrShareSpacesRecipientGroupsMETA} implements the {@link XrShareSpacesRecipientBaseHeaderMETA} base type. Where {@link METASpatialEntitySharing#xrShareSpacesMETA ShareSpacesMETA} specifies that a valid structure based on {@link XrShareSpacesRecipientBaseHeaderMETA} is to be passed, a valid {@link XrShareSpacesRecipientGroupsMETA} structure <b>may</b> be passed.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METASpatialEntityGroupSharing XR_META_spatial_entity_group_sharing} extension <b>must</b> be enabled prior to using {@link XrShareSpacesRecipientGroupsMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METASpatialEntityGroupSharing#XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code groups} <b>must</b> be a pointer to an array of {@code groupCount} {@link XrUuid} structures</li>
 * <li>The {@code groupCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrUuid}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrShareSpacesRecipientGroupsMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #groupCount};
 *     {@link XrUuid XrUuid} * {@link #groups};
 * }</code></pre>
 */
public class XrShareSpacesRecipientGroupsMETA extends Struct<XrShareSpacesRecipientGroupsMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GROUPCOUNT,
        GROUPS;

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
        GROUPCOUNT = layout.offsetof(2);
        GROUPS = layout.offsetof(3);
    }

    protected XrShareSpacesRecipientGroupsMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrShareSpacesRecipientGroupsMETA create(long address, @Nullable ByteBuffer container) {
        return new XrShareSpacesRecipientGroupsMETA(address, container);
    }

    /**
     * Creates a {@code XrShareSpacesRecipientGroupsMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrShareSpacesRecipientGroupsMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of elements in the {@code groups} list. The maximum supported count in a single request is 16. */
    @NativeType("uint32_t")
    public int groupCount() { return ngroupCount(address()); }
    /** a list of {@link XrUuid} defined by the application, which the spaces will be shared with. */
    @NativeType("XrUuid *")
    public XrUuid.Buffer groups() { return ngroups(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrShareSpacesRecipientGroupsMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META} value to the {@link #type} field. */
    public XrShareSpacesRecipientGroupsMETA type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrShareSpacesRecipientGroupsMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuid.Buffer} to the {@link #groups} field. */
    public XrShareSpacesRecipientGroupsMETA groups(@NativeType("XrUuid *") XrUuid.Buffer value) { ngroups(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrShareSpacesRecipientGroupsMETA set(
        int type,
        long next,
        XrUuid.Buffer groups
    ) {
        type(type);
        next(next);
        groups(groups);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrShareSpacesRecipientGroupsMETA set(XrShareSpacesRecipientGroupsMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrShareSpacesRecipientGroupsMETA malloc() {
        return new XrShareSpacesRecipientGroupsMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrShareSpacesRecipientGroupsMETA calloc() {
        return new XrShareSpacesRecipientGroupsMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance allocated with {@link BufferUtils}. */
    public static XrShareSpacesRecipientGroupsMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrShareSpacesRecipientGroupsMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance for the specified memory address. */
    public static XrShareSpacesRecipientGroupsMETA create(long address) {
        return new XrShareSpacesRecipientGroupsMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrShareSpacesRecipientGroupsMETA createSafe(long address) {
        return address == NULL ? null : new XrShareSpacesRecipientGroupsMETA(address, null);
    }

    /** Downcasts the specified {@code XrShareSpacesRecipientBaseHeaderMETA} instance to {@code XrShareSpacesRecipientGroupsMETA}. */
    public static XrShareSpacesRecipientGroupsMETA create(XrShareSpacesRecipientBaseHeaderMETA value) {
        return new XrShareSpacesRecipientGroupsMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrShareSpacesRecipientGroupsMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrShareSpacesRecipientBaseHeaderMETA.Buffer} instance to {@code XrShareSpacesRecipientGroupsMETA.Buffer}. */
    public static XrShareSpacesRecipientGroupsMETA.Buffer create(XrShareSpacesRecipientBaseHeaderMETA.Buffer value) {
        return new XrShareSpacesRecipientGroupsMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrShareSpacesRecipientGroupsMETA malloc(MemoryStack stack) {
        return new XrShareSpacesRecipientGroupsMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrShareSpacesRecipientGroupsMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrShareSpacesRecipientGroupsMETA calloc(MemoryStack stack) {
        return new XrShareSpacesRecipientGroupsMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrShareSpacesRecipientGroupsMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrShareSpacesRecipientGroupsMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrShareSpacesRecipientGroupsMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrShareSpacesRecipientGroupsMETA.NEXT); }
    /** Unsafe version of {@link #groupCount}. */
    public static int ngroupCount(long struct) { return memGetInt(struct + XrShareSpacesRecipientGroupsMETA.GROUPCOUNT); }
    /** Unsafe version of {@link #groups}. */
    public static XrUuid.Buffer ngroups(long struct) { return XrUuid.create(memGetAddress(struct + XrShareSpacesRecipientGroupsMETA.GROUPS), ngroupCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrShareSpacesRecipientGroupsMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrShareSpacesRecipientGroupsMETA.NEXT, value); }
    /** Sets the specified value to the {@code groupCount} field of the specified {@code struct}. */
    public static void ngroupCount(long struct, int value) { memPutInt(struct + XrShareSpacesRecipientGroupsMETA.GROUPCOUNT, value); }
    /** Unsafe version of {@link #groups(XrUuid.Buffer) groups}. */
    public static void ngroups(long struct, XrUuid.Buffer value) { memPutAddress(struct + XrShareSpacesRecipientGroupsMETA.GROUPS, value.address()); ngroupCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrShareSpacesRecipientGroupsMETA.GROUPS));
    }

    // -----------------------------------

    /** An array of {@link XrShareSpacesRecipientGroupsMETA} structs. */
    public static class Buffer extends StructBuffer<XrShareSpacesRecipientGroupsMETA, Buffer> implements NativeResource {

        private static final XrShareSpacesRecipientGroupsMETA ELEMENT_FACTORY = XrShareSpacesRecipientGroupsMETA.create(-1L);

        /**
         * Creates a new {@code XrShareSpacesRecipientGroupsMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrShareSpacesRecipientGroupsMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrShareSpacesRecipientGroupsMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrShareSpacesRecipientGroupsMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrShareSpacesRecipientGroupsMETA.ntype(address()); }
        /** @return the value of the {@link XrShareSpacesRecipientGroupsMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrShareSpacesRecipientGroupsMETA.nnext(address()); }
        /** @return the value of the {@link XrShareSpacesRecipientGroupsMETA#groupCount} field. */
        @NativeType("uint32_t")
        public int groupCount() { return XrShareSpacesRecipientGroupsMETA.ngroupCount(address()); }
        /** @return a {@link XrUuid.Buffer} view of the struct array pointed to by the {@link XrShareSpacesRecipientGroupsMETA#groups} field. */
        @NativeType("XrUuid *")
        public XrUuid.Buffer groups() { return XrShareSpacesRecipientGroupsMETA.ngroups(address()); }

        /** Sets the specified value to the {@link XrShareSpacesRecipientGroupsMETA#type} field. */
        public XrShareSpacesRecipientGroupsMETA.Buffer type(@NativeType("XrStructureType") int value) { XrShareSpacesRecipientGroupsMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityGroupSharing#XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META} value to the {@link XrShareSpacesRecipientGroupsMETA#type} field. */
        public XrShareSpacesRecipientGroupsMETA.Buffer type$Default() { return type(METASpatialEntityGroupSharing.XR_TYPE_SHARE_SPACES_RECIPIENT_GROUPS_META); }
        /** Sets the specified value to the {@link XrShareSpacesRecipientGroupsMETA#next} field. */
        public XrShareSpacesRecipientGroupsMETA.Buffer next(@NativeType("void const *") long value) { XrShareSpacesRecipientGroupsMETA.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuid.Buffer} to the {@link XrShareSpacesRecipientGroupsMETA#groups} field. */
        public XrShareSpacesRecipientGroupsMETA.Buffer groups(@NativeType("XrUuid *") XrUuid.Buffer value) { XrShareSpacesRecipientGroupsMETA.ngroups(address(), value); return this; }

    }

}