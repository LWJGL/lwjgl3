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
 * Convenience type for iterating (read only).
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrBaseInStructure} can be used to facilitate iterating through a read-only structure pointer chain.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrBaseInStructure}, {@link XrBaseOutStructure}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrBaseInStructure {
 *     XrStructureType {@link #type};
 *     {@link XrBaseInStructure XrBaseInStructure} const * {@link #next};
 * }</code></pre>
 */
public class XrBaseInStructure extends Struct implements NativeResource {

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

    /**
     * Creates a {@code XrBaseInStructure} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBaseInStructure(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("XrBaseInStructure const *")
    public XrBaseInStructure next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrBaseInStructure type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link XrBaseInStructure} to the {@link #next} field. */
    public XrBaseInStructure next(@NativeType("XrBaseInStructure const *") XrBaseInStructure value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBaseInStructure set(
        int type,
        XrBaseInStructure next
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
    public XrBaseInStructure set(XrBaseInStructure src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBaseInStructure} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBaseInStructure malloc() {
        return wrap(XrBaseInStructure.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrBaseInStructure} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBaseInStructure calloc() {
        return wrap(XrBaseInStructure.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrBaseInStructure} instance allocated with {@link BufferUtils}. */
    public static XrBaseInStructure create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrBaseInStructure.class, memAddress(container), container);
    }

    /** Returns a new {@code XrBaseInStructure} instance for the specified memory address. */
    public static XrBaseInStructure create(long address) {
        return wrap(XrBaseInStructure.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBaseInStructure createSafe(long address) {
        return address == NULL ? null : wrap(XrBaseInStructure.class, address);
    }

    /**
     * Returns a new {@link XrBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBaseInStructure.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBaseInStructure.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrBaseInStructure.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrBaseInStructure.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrBaseInStructure} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBaseInStructure malloc(MemoryStack stack) {
        return wrap(XrBaseInStructure.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrBaseInStructure} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBaseInStructure calloc(MemoryStack stack) {
        return wrap(XrBaseInStructure.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBaseInStructure.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBaseInStructure.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrBaseInStructure.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static XrBaseInStructure nnext(long struct) { return XrBaseInStructure.create(memGetAddress(struct + XrBaseInStructure.NEXT)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrBaseInStructure.TYPE, value); }
    /** Unsafe version of {@link #next(XrBaseInStructure) next}. */
    public static void nnext(long struct, XrBaseInStructure value) { memPutAddress(struct + XrBaseInStructure.NEXT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBaseInStructure.NEXT));
    }

    // -----------------------------------

    /** An array of {@link XrBaseInStructure} structs. */
    public static class Buffer extends StructBuffer<XrBaseInStructure, Buffer> implements NativeResource {

        private static final XrBaseInStructure ELEMENT_FACTORY = XrBaseInStructure.create(-1L);

        /**
         * Creates a new {@code XrBaseInStructure.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBaseInStructure#SIZEOF}, and its mark will be undefined.
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
        protected XrBaseInStructure getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrBaseInStructure#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBaseInStructure.ntype(address()); }
        /** @return a {@link XrBaseInStructure} view of the struct pointed to by the {@link XrBaseInStructure#next} field. */
        @NativeType("XrBaseInStructure const *")
        public XrBaseInStructure next() { return XrBaseInStructure.nnext(address()); }

        /** Sets the specified value to the {@link XrBaseInStructure#type} field. */
        public XrBaseInStructure.Buffer type(@NativeType("XrStructureType") int value) { XrBaseInStructure.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link XrBaseInStructure} to the {@link XrBaseInStructure#next} field. */
        public XrBaseInStructure.Buffer next(@NativeType("XrBaseInStructure const *") XrBaseInStructure value) { XrBaseInStructure.nnext(address(), value); return this; }

    }

}