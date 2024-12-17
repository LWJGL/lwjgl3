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
 * struct XrBindingModificationsKHR {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t bindingModificationCount;
 *     {@link XrBindingModificationBaseHeaderKHR XrBindingModificationBaseHeaderKHR} const * const * bindingModifications;
 * }}</pre>
 */
public class XrBindingModificationsKHR extends Struct<XrBindingModificationsKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BINDINGMODIFICATIONCOUNT,
        BINDINGMODIFICATIONS;

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
        BINDINGMODIFICATIONCOUNT = layout.offsetof(2);
        BINDINGMODIFICATIONS = layout.offsetof(3);
    }

    protected XrBindingModificationsKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBindingModificationsKHR create(long address, @Nullable ByteBuffer container) {
        return new XrBindingModificationsKHR(address, container);
    }

    /**
     * Creates a {@code XrBindingModificationsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBindingModificationsKHR(ByteBuffer container) {
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
    /** @return the value of the {@code bindingModificationCount} field. */
    @NativeType("uint32_t")
    public int bindingModificationCount() { return nbindingModificationCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code bindingModifications} field. */
    @NativeType("XrBindingModificationBaseHeaderKHR const * const *")
    public @Nullable PointerBuffer bindingModifications() { return nbindingModifications(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBindingModificationsKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRBindingModification#XR_TYPE_BINDING_MODIFICATIONS_KHR TYPE_BINDING_MODIFICATIONS_KHR} value to the {@code type} field. */
    public XrBindingModificationsKHR type$Default() { return type(KHRBindingModification.XR_TYPE_BINDING_MODIFICATIONS_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrBindingModificationsKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bindingModificationCount} field. */
    public XrBindingModificationsKHR bindingModificationCount(@NativeType("uint32_t") int value) { nbindingModificationCount(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code bindingModifications} field. */
    public XrBindingModificationsKHR bindingModifications(@Nullable @NativeType("XrBindingModificationBaseHeaderKHR const * const *") PointerBuffer value) { nbindingModifications(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBindingModificationsKHR set(
        int type,
        long next,
        int bindingModificationCount,
        @Nullable PointerBuffer bindingModifications
    ) {
        type(type);
        next(next);
        bindingModificationCount(bindingModificationCount);
        bindingModifications(bindingModifications);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBindingModificationsKHR set(XrBindingModificationsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBindingModificationsKHR malloc() {
        return new XrBindingModificationsKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBindingModificationsKHR calloc() {
        return new XrBindingModificationsKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance allocated with {@link BufferUtils}. */
    public static XrBindingModificationsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBindingModificationsKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrBindingModificationsKHR} instance for the specified memory address. */
    public static XrBindingModificationsKHR create(long address) {
        return new XrBindingModificationsKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBindingModificationsKHR createSafe(long address) {
        return address == NULL ? null : new XrBindingModificationsKHR(address, null);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBindingModificationsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBindingModificationsKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBindingModificationsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationsKHR malloc(MemoryStack stack) {
        return new XrBindingModificationsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBindingModificationsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationsKHR calloc(MemoryStack stack) {
        return new XrBindingModificationsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBindingModificationsKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBindingModificationsKHR.NEXT); }
    /** Unsafe version of {@link #bindingModificationCount}. */
    public static int nbindingModificationCount(long struct) { return memGetInt(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONCOUNT); }
    /** Unsafe version of {@link #bindingModifications() bindingModifications}. */
    public static @Nullable PointerBuffer nbindingModifications(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONS), nbindingModificationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBindingModificationsKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBindingModificationsKHR.NEXT, value); }
    /** Sets the specified value to the {@code bindingModificationCount} field of the specified {@code struct}. */
    public static void nbindingModificationCount(long struct, int value) { memPutInt(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONCOUNT, value); }
    /** Unsafe version of {@link #bindingModifications(PointerBuffer) bindingModifications}. */
    public static void nbindingModifications(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrBindingModificationsKHR.BINDINGMODIFICATIONS, memAddressSafe(value)); if (value != null) { nbindingModificationCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrBindingModificationsKHR} structs. */
    public static class Buffer extends StructBuffer<XrBindingModificationsKHR, Buffer> implements NativeResource {

        private static final XrBindingModificationsKHR ELEMENT_FACTORY = XrBindingModificationsKHR.create(-1L);

        /**
         * Creates a new {@code XrBindingModificationsKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBindingModificationsKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBindingModificationsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBindingModificationsKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBindingModificationsKHR.nnext(address()); }
        /** @return the value of the {@code bindingModificationCount} field. */
        @NativeType("uint32_t")
        public int bindingModificationCount() { return XrBindingModificationsKHR.nbindingModificationCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code bindingModifications} field. */
        @NativeType("XrBindingModificationBaseHeaderKHR const * const *")
        public @Nullable PointerBuffer bindingModifications() { return XrBindingModificationsKHR.nbindingModifications(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBindingModificationsKHR.Buffer type(@NativeType("XrStructureType") int value) { XrBindingModificationsKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRBindingModification#XR_TYPE_BINDING_MODIFICATIONS_KHR TYPE_BINDING_MODIFICATIONS_KHR} value to the {@code type} field. */
        public XrBindingModificationsKHR.Buffer type$Default() { return type(KHRBindingModification.XR_TYPE_BINDING_MODIFICATIONS_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrBindingModificationsKHR.Buffer next(@NativeType("void const *") long value) { XrBindingModificationsKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bindingModificationCount} field. */
        public XrBindingModificationsKHR.Buffer bindingModificationCount(@NativeType("uint32_t") int value) { XrBindingModificationsKHR.nbindingModificationCount(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code bindingModifications} field. */
        public XrBindingModificationsKHR.Buffer bindingModifications(@Nullable @NativeType("XrBindingModificationBaseHeaderKHR const * const *") PointerBuffer value) { XrBindingModificationsKHR.nbindingModifications(address(), value); return this; }

    }

}