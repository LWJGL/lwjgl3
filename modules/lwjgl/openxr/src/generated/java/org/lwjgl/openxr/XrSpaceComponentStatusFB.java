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
 * Current status of an entity.
 * 
 * <h5>Description</h5>
 * 
 * <p>It holds information on the current state of a component.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntity XR_FB_spatial_entity} extension <b>must</b> be enabled prior to using {@link XrSpaceComponentStatusFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_FB TYPE_SPACE_COMPONENT_STATUS_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBSpatialEntity#xrGetSpaceComponentStatusFB GetSpaceComponentStatusFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceComponentStatusFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #enabled};
 *     XrBool32 {@link #changePending};
 * }</code></pre>
 */
public class XrSpaceComponentStatusFB extends Struct<XrSpaceComponentStatusFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED,
        CHANGEPENDING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
        CHANGEPENDING = layout.offsetof(3);
    }

    protected XrSpaceComponentStatusFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceComponentStatusFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceComponentStatusFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceComponentStatusFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceComponentStatusFB(ByteBuffer container) {
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
    /** a boolean value that determines if a component is currently enabled or disabled. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }
    /** a boolean value that determines if the component’s enabled state is about to change. */
    @NativeType("XrBool32")
    public boolean changePending() { return nchangePending(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSpaceComponentStatusFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_FB TYPE_SPACE_COMPONENT_STATUS_FB} value to the {@link #type} field. */
    public XrSpaceComponentStatusFB type$Default() { return type(FBSpatialEntity.XR_TYPE_SPACE_COMPONENT_STATUS_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSpaceComponentStatusFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceComponentStatusFB set(
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
    public XrSpaceComponentStatusFB set(XrSpaceComponentStatusFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceComponentStatusFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentStatusFB malloc() {
        return new XrSpaceComponentStatusFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceComponentStatusFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceComponentStatusFB calloc() {
        return new XrSpaceComponentStatusFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceComponentStatusFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceComponentStatusFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceComponentStatusFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceComponentStatusFB} instance for the specified memory address. */
    public static XrSpaceComponentStatusFB create(long address) {
        return new XrSpaceComponentStatusFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceComponentStatusFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceComponentStatusFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceComponentStatusFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceComponentStatusFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceComponentStatusFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentStatusFB malloc(MemoryStack stack) {
        return new XrSpaceComponentStatusFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceComponentStatusFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceComponentStatusFB calloc(MemoryStack stack) {
        return new XrSpaceComponentStatusFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceComponentStatusFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceComponentStatusFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceComponentStatusFB.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusFB.ENABLED); }
    /** Unsafe version of {@link #changePending}. */
    public static int nchangePending(long struct) { return UNSAFE.getInt(null, struct + XrSpaceComponentStatusFB.CHANGEPENDING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpaceComponentStatusFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceComponentStatusFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSpaceComponentStatusFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceComponentStatusFB, Buffer> implements NativeResource {

        private static final XrSpaceComponentStatusFB ELEMENT_FACTORY = XrSpaceComponentStatusFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceComponentStatusFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceComponentStatusFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceComponentStatusFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceComponentStatusFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceComponentStatusFB.ntype(address()); }
        /** @return the value of the {@link XrSpaceComponentStatusFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceComponentStatusFB.nnext(address()); }
        /** @return the value of the {@link XrSpaceComponentStatusFB#enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrSpaceComponentStatusFB.nenabled(address()) != 0; }
        /** @return the value of the {@link XrSpaceComponentStatusFB#changePending} field. */
        @NativeType("XrBool32")
        public boolean changePending() { return XrSpaceComponentStatusFB.nchangePending(address()) != 0; }

        /** Sets the specified value to the {@link XrSpaceComponentStatusFB#type} field. */
        public XrSpaceComponentStatusFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceComponentStatusFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntity#XR_TYPE_SPACE_COMPONENT_STATUS_FB TYPE_SPACE_COMPONENT_STATUS_FB} value to the {@link XrSpaceComponentStatusFB#type} field. */
        public XrSpaceComponentStatusFB.Buffer type$Default() { return type(FBSpatialEntity.XR_TYPE_SPACE_COMPONENT_STATUS_FB); }
        /** Sets the specified value to the {@link XrSpaceComponentStatusFB#next} field. */
        public XrSpaceComponentStatusFB.Buffer next(@NativeType("void *") long value) { XrSpaceComponentStatusFB.nnext(address(), value); return this; }

    }

}