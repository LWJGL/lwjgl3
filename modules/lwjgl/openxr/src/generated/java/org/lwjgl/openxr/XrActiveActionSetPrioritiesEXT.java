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
 * <pre>{@code
 * struct XrActiveActionSetPrioritiesEXT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t actionSetPriorityCount;
 *     {@link XrActiveActionSetPriorityEXT XrActiveActionSetPriorityEXT} const * actionSetPriorities;
 * }}</pre>
 */
public class XrActiveActionSetPrioritiesEXT extends Struct<XrActiveActionSetPrioritiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ACTIONSETPRIORITYCOUNT,
        ACTIONSETPRIORITIES;

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
        ACTIONSETPRIORITYCOUNT = layout.offsetof(2);
        ACTIONSETPRIORITIES = layout.offsetof(3);
    }

    protected XrActiveActionSetPrioritiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActiveActionSetPrioritiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrActiveActionSetPrioritiesEXT(address, container);
    }

    /**
     * Creates a {@code XrActiveActionSetPrioritiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActiveActionSetPrioritiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code actionSetPriorityCount} field. */
    @NativeType("uint32_t")
    public int actionSetPriorityCount() { return nactionSetPriorityCount(address()); }
    /** @return a {@link XrActiveActionSetPriorityEXT.Buffer} view of the struct array pointed to by the {@code actionSetPriorities} field. */
    @NativeType("XrActiveActionSetPriorityEXT const *")
    public XrActiveActionSetPriorityEXT.Buffer actionSetPriorities() { return nactionSetPriorities(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrActiveActionSetPrioritiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTActiveActionSetPriority#XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT} value to the {@code type} field. */
    public XrActiveActionSetPrioritiesEXT type$Default() { return type(EXTActiveActionSetPriority.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrActiveActionSetPrioritiesEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrActiveActionSetPriorityEXT.Buffer} to the {@code actionSetPriorities} field. */
    public XrActiveActionSetPrioritiesEXT actionSetPriorities(@NativeType("XrActiveActionSetPriorityEXT const *") XrActiveActionSetPriorityEXT.Buffer value) { nactionSetPriorities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActiveActionSetPrioritiesEXT set(
        int type,
        long next,
        XrActiveActionSetPriorityEXT.Buffer actionSetPriorities
    ) {
        type(type);
        next(next);
        actionSetPriorities(actionSetPriorities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActiveActionSetPrioritiesEXT set(XrActiveActionSetPrioritiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPrioritiesEXT malloc() {
        return new XrActiveActionSetPrioritiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPrioritiesEXT calloc() {
        return new XrActiveActionSetPrioritiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrActiveActionSetPrioritiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActiveActionSetPrioritiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrActiveActionSetPrioritiesEXT} instance for the specified memory address. */
    public static XrActiveActionSetPrioritiesEXT create(long address) {
        return new XrActiveActionSetPrioritiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrActiveActionSetPrioritiesEXT createSafe(long address) {
        return address == NULL ? null : new XrActiveActionSetPrioritiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActiveActionSetPrioritiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrActiveActionSetPrioritiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPrioritiesEXT malloc(MemoryStack stack) {
        return new XrActiveActionSetPrioritiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActiveActionSetPrioritiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPrioritiesEXT calloc(MemoryStack stack) {
        return new XrActiveActionSetPrioritiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPrioritiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPrioritiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrActiveActionSetPrioritiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrActiveActionSetPrioritiesEXT.NEXT); }
    /** Unsafe version of {@link #actionSetPriorityCount}. */
    public static int nactionSetPriorityCount(long struct) { return memGetInt(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITYCOUNT); }
    /** Unsafe version of {@link #actionSetPriorities}. */
    public static XrActiveActionSetPriorityEXT.Buffer nactionSetPriorities(long struct) { return XrActiveActionSetPriorityEXT.create(memGetAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES), nactionSetPriorityCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrActiveActionSetPrioritiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrActiveActionSetPrioritiesEXT.NEXT, value); }
    /** Sets the specified value to the {@code actionSetPriorityCount} field of the specified {@code struct}. */
    public static void nactionSetPriorityCount(long struct, int value) { memPutInt(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITYCOUNT, value); }
    /** Unsafe version of {@link #actionSetPriorities(XrActiveActionSetPriorityEXT.Buffer) actionSetPriorities}. */
    public static void nactionSetPriorities(long struct, XrActiveActionSetPriorityEXT.Buffer value) { memPutAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES, value.address()); nactionSetPriorityCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int actionSetPriorityCount = nactionSetPriorityCount(struct);
        long actionSetPriorities = memGetAddress(struct + XrActiveActionSetPrioritiesEXT.ACTIONSETPRIORITIES);
        check(actionSetPriorities);
        validate(actionSetPriorities, actionSetPriorityCount, XrActiveActionSetPriorityEXT.SIZEOF, XrActiveActionSetPriorityEXT::validate);
    }

    // -----------------------------------

    /** An array of {@link XrActiveActionSetPrioritiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrActiveActionSetPrioritiesEXT, Buffer> implements NativeResource {

        private static final XrActiveActionSetPrioritiesEXT ELEMENT_FACTORY = XrActiveActionSetPrioritiesEXT.create(-1L);

        /**
         * Creates a new {@code XrActiveActionSetPrioritiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActiveActionSetPrioritiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActiveActionSetPrioritiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrActiveActionSetPrioritiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrActiveActionSetPrioritiesEXT.nnext(address()); }
        /** @return the value of the {@code actionSetPriorityCount} field. */
        @NativeType("uint32_t")
        public int actionSetPriorityCount() { return XrActiveActionSetPrioritiesEXT.nactionSetPriorityCount(address()); }
        /** @return a {@link XrActiveActionSetPriorityEXT.Buffer} view of the struct array pointed to by the {@code actionSetPriorities} field. */
        @NativeType("XrActiveActionSetPriorityEXT const *")
        public XrActiveActionSetPriorityEXT.Buffer actionSetPriorities() { return XrActiveActionSetPrioritiesEXT.nactionSetPriorities(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrActiveActionSetPrioritiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTActiveActionSetPriority#XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT} value to the {@code type} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer type$Default() { return type(EXTActiveActionSetPriority.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer next(@NativeType("void const *") long value) { XrActiveActionSetPrioritiesEXT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrActiveActionSetPriorityEXT.Buffer} to the {@code actionSetPriorities} field. */
        public XrActiveActionSetPrioritiesEXT.Buffer actionSetPriorities(@NativeType("XrActiveActionSetPriorityEXT const *") XrActiveActionSetPriorityEXT.Buffer value) { XrActiveActionSetPrioritiesEXT.nactionSetPriorities(address(), value); return this; }

    }

}