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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpatialAnchorSpaceCreateInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialAnchorMSFT anchor;
 *     {@link XrPosef XrPosef} poseInAnchorSpace;
 * }</code></pre>
 */
public class XrSpatialAnchorSpaceCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHOR,
        POSEINANCHORSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANCHOR = layout.offsetof(2);
        POSEINANCHORSPACE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorSpaceCreateInfoMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code anchor} field. */
    @NativeType("XrSpatialAnchorMSFT")
    public long anchor() { return nanchor(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInAnchorSpace} field. */
    public XrPosef poseInAnchorSpace() { return nposeInAnchorSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorSpaceCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorSpaceCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrSpatialAnchorSpaceCreateInfoMSFT anchor(XrSpatialAnchorMSFT value) { nanchor(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInAnchorSpace} field. */
    public XrSpatialAnchorSpaceCreateInfoMSFT poseInAnchorSpace(XrPosef value) { nposeInAnchorSpace(address(), value); return this; }
    /** Passes the {@code poseInAnchorSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorSpaceCreateInfoMSFT poseInAnchorSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInAnchorSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorSpaceCreateInfoMSFT set(
        int type,
        long next,
        XrSpatialAnchorMSFT anchor,
        XrPosef poseInAnchorSpace
    ) {
        type(type);
        next(next);
        anchor(anchor);
        poseInAnchorSpace(poseInAnchorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorSpaceCreateInfoMSFT set(XrSpatialAnchorSpaceCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT malloc() {
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT calloc() {
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance for the specified memory address. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT create(long address) {
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorSpaceCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrSpatialAnchorSpaceCreateInfoMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT mallocStack(MemoryStack stack) {
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSpatialAnchorSpaceCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT callocStack(MemoryStack stack) {
        return wrap(XrSpatialAnchorSpaceCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceCreateInfoMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSpatialAnchorSpaceCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorSpaceCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrSpatialAnchorSpaceCreateInfoMSFT.ANCHOR); }
    /** Unsafe version of {@link #poseInAnchorSpace}. */
    public static XrPosef nposeInAnchorSpace(long struct) { return XrPosef.create(struct + XrSpatialAnchorSpaceCreateInfoMSFT.POSEINANCHORSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSpatialAnchorSpaceCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorSpaceCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #anchor(XrSpatialAnchorMSFT) anchor}. */
    public static void nanchor(long struct, XrSpatialAnchorMSFT value) { memPutAddress(struct + XrSpatialAnchorSpaceCreateInfoMSFT.ANCHOR, value.address()); }
    /** Unsafe version of {@link #poseInAnchorSpace(XrPosef) poseInAnchorSpace}. */
    public static void nposeInAnchorSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorSpaceCreateInfoMSFT.POSEINANCHORSPACE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorSpaceCreateInfoMSFT.ANCHOR));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorSpaceCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorSpaceCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorSpaceCreateInfoMSFT ELEMENT_FACTORY = XrSpatialAnchorSpaceCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorSpaceCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorSpaceCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSpatialAnchorSpaceCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorSpaceCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorSpaceCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrSpatialAnchorMSFT")
        public long anchor() { return XrSpatialAnchorSpaceCreateInfoMSFT.nanchor(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInAnchorSpace} field. */
        public XrPosef poseInAnchorSpace() { return XrSpatialAnchorSpaceCreateInfoMSFT.nposeInAnchorSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorSpaceCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorSpaceCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorSpaceCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorSpaceCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrSpatialAnchorSpaceCreateInfoMSFT.Buffer anchor(XrSpatialAnchorMSFT value) { XrSpatialAnchorSpaceCreateInfoMSFT.nanchor(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInAnchorSpace} field. */
        public XrSpatialAnchorSpaceCreateInfoMSFT.Buffer poseInAnchorSpace(XrPosef value) { XrSpatialAnchorSpaceCreateInfoMSFT.nposeInAnchorSpace(address(), value); return this; }
        /** Passes the {@code poseInAnchorSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorSpaceCreateInfoMSFT.Buffer poseInAnchorSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInAnchorSpace()); return this; }

    }

}