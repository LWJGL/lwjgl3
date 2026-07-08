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
 * <pre>{@code
 * struct XrSystemDynamicObjectMousePropertiesBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsDynamicObjectMouse;
 * }}</pre>
 */
public class XrSystemDynamicObjectMousePropertiesBD extends Struct<XrSystemDynamicObjectMousePropertiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSDYNAMICOBJECTMOUSE;

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
        SUPPORTSDYNAMICOBJECTMOUSE = layout.offsetof(2);
    }

    protected XrSystemDynamicObjectMousePropertiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemDynamicObjectMousePropertiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrSystemDynamicObjectMousePropertiesBD(address, container);
    }

    /**
     * Creates a {@code XrSystemDynamicObjectMousePropertiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemDynamicObjectMousePropertiesBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsDynamicObjectMouse} field. */
    @NativeType("XrBool32")
    public boolean supportsDynamicObjectMouse() { return nsupportsDynamicObjectMouse(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemDynamicObjectMousePropertiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDDynamicObjectMouse#XR_TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD} value to the {@code type} field. */
    public XrSystemDynamicObjectMousePropertiesBD type$Default() { return type(BDDynamicObjectMouse.XR_TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemDynamicObjectMousePropertiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemDynamicObjectMousePropertiesBD set(
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
    public XrSystemDynamicObjectMousePropertiesBD set(XrSystemDynamicObjectMousePropertiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemDynamicObjectMousePropertiesBD malloc() {
        return new XrSystemDynamicObjectMousePropertiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemDynamicObjectMousePropertiesBD calloc() {
        return new XrSystemDynamicObjectMousePropertiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance allocated with {@link BufferUtils}. */
    public static XrSystemDynamicObjectMousePropertiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemDynamicObjectMousePropertiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance for the specified memory address. */
    public static XrSystemDynamicObjectMousePropertiesBD create(long address) {
        return new XrSystemDynamicObjectMousePropertiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemDynamicObjectMousePropertiesBD createSafe(long address) {
        return address == NULL ? null : new XrSystemDynamicObjectMousePropertiesBD(address, null);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemDynamicObjectMousePropertiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDynamicObjectMousePropertiesBD malloc(MemoryStack stack) {
        return new XrSystemDynamicObjectMousePropertiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemDynamicObjectMousePropertiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDynamicObjectMousePropertiesBD calloc(MemoryStack stack) {
        return new XrSystemDynamicObjectMousePropertiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectMousePropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectMousePropertiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemDynamicObjectMousePropertiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemDynamicObjectMousePropertiesBD.NEXT); }
    /** Unsafe version of {@link #supportsDynamicObjectMouse}. */
    public static int nsupportsDynamicObjectMouse(long struct) { return memGetInt(struct + XrSystemDynamicObjectMousePropertiesBD.SUPPORTSDYNAMICOBJECTMOUSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemDynamicObjectMousePropertiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemDynamicObjectMousePropertiesBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemDynamicObjectMousePropertiesBD} structs. */
    public static class Buffer extends StructBuffer<XrSystemDynamicObjectMousePropertiesBD, Buffer> implements NativeResource {

        private static final XrSystemDynamicObjectMousePropertiesBD ELEMENT_FACTORY = XrSystemDynamicObjectMousePropertiesBD.create(-1L);

        /**
         * Creates a new {@code XrSystemDynamicObjectMousePropertiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemDynamicObjectMousePropertiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemDynamicObjectMousePropertiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemDynamicObjectMousePropertiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemDynamicObjectMousePropertiesBD.nnext(address()); }
        /** @return the value of the {@code supportsDynamicObjectMouse} field. */
        @NativeType("XrBool32")
        public boolean supportsDynamicObjectMouse() { return XrSystemDynamicObjectMousePropertiesBD.nsupportsDynamicObjectMouse(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemDynamicObjectMousePropertiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrSystemDynamicObjectMousePropertiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDDynamicObjectMouse#XR_TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD} value to the {@code type} field. */
        public XrSystemDynamicObjectMousePropertiesBD.Buffer type$Default() { return type(BDDynamicObjectMouse.XR_TYPE_SYSTEM_DYNAMIC_OBJECT_MOUSE_PROPERTIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemDynamicObjectMousePropertiesBD.Buffer next(@NativeType("void *") long value) { XrSystemDynamicObjectMousePropertiesBD.nnext(address(), value); return this; }

    }

}