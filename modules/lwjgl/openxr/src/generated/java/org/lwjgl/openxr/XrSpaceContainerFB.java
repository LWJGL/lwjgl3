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
 * struct XrSpaceContainerFB {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t uuidCapacityInput;
 *     uint32_t uuidCountOutput;
 *     {@link XrUuidEXT XrUuidEXT} * uuids;
 * }}</pre>
 */
public class XrSpaceContainerFB extends Struct<XrSpaceContainerFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUIDCAPACITYINPUT,
        UUIDCOUNTOUTPUT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        UUIDCAPACITYINPUT = layout.offsetof(2);
        UUIDCOUNTOUTPUT = layout.offsetof(3);
        UUIDS = layout.offsetof(4);
    }

    protected XrSpaceContainerFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceContainerFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceContainerFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceContainerFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceContainerFB(ByteBuffer container) {
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
    /** @return the value of the {@code uuidCapacityInput} field. */
    @NativeType("uint32_t")
    public int uuidCapacityInput() { return nuuidCapacityInput(address()); }
    /** @return the value of the {@code uuidCountOutput} field. */
    @NativeType("uint32_t")
    public int uuidCountOutput() { return nuuidCountOutput(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.@Nullable Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceContainerFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityContainer#XR_TYPE_SPACE_CONTAINER_FB TYPE_SPACE_CONTAINER_FB} value to the {@code type} field. */
    public XrSpaceContainerFB type$Default() { return type(FBSpatialEntityContainer.XR_TYPE_SPACE_CONTAINER_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceContainerFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code uuidCapacityInput} field. */
    public XrSpaceContainerFB uuidCapacityInput(@NativeType("uint32_t") int value) { nuuidCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code uuidCountOutput} field. */
    public XrSpaceContainerFB uuidCountOutput(@NativeType("uint32_t") int value) { nuuidCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpaceContainerFB uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceContainerFB set(
        int type,
        long next,
        int uuidCapacityInput,
        int uuidCountOutput,
        XrUuidEXT.@Nullable Buffer uuids
    ) {
        type(type);
        next(next);
        uuidCapacityInput(uuidCapacityInput);
        uuidCountOutput(uuidCountOutput);
        uuids(uuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceContainerFB set(XrSpaceContainerFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceContainerFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceContainerFB malloc() {
        return new XrSpaceContainerFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceContainerFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceContainerFB calloc() {
        return new XrSpaceContainerFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceContainerFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceContainerFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceContainerFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceContainerFB} instance for the specified memory address. */
    public static XrSpaceContainerFB create(long address) {
        return new XrSpaceContainerFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceContainerFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceContainerFB(address, null);
    }

    /**
     * Returns a new {@link XrSpaceContainerFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceContainerFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceContainerFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceContainerFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceContainerFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceContainerFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceContainerFB malloc(MemoryStack stack) {
        return new XrSpaceContainerFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceContainerFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceContainerFB calloc(MemoryStack stack) {
        return new XrSpaceContainerFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceContainerFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceContainerFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceContainerFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceContainerFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceContainerFB.NEXT); }
    /** Unsafe version of {@link #uuidCapacityInput}. */
    public static int nuuidCapacityInput(long struct) { return memGetInt(struct + XrSpaceContainerFB.UUIDCAPACITYINPUT); }
    /** Unsafe version of {@link #uuidCountOutput}. */
    public static int nuuidCountOutput(long struct) { return memGetInt(struct + XrSpaceContainerFB.UUIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.@Nullable Buffer nuuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrSpaceContainerFB.UUIDS), nuuidCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceContainerFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceContainerFB.NEXT, value); }
    /** Sets the specified value to the {@code uuidCapacityInput} field of the specified {@code struct}. */
    public static void nuuidCapacityInput(long struct, int value) { memPutInt(struct + XrSpaceContainerFB.UUIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #uuidCountOutput(int) uuidCountOutput}. */
    public static void nuuidCountOutput(long struct, int value) { memPutInt(struct + XrSpaceContainerFB.UUIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.@Nullable Buffer value) { memPutAddress(struct + XrSpaceContainerFB.UUIDS, memAddressSafe(value)); if (value != null) { nuuidCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpaceContainerFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceContainerFB, Buffer> implements NativeResource {

        private static final XrSpaceContainerFB ELEMENT_FACTORY = XrSpaceContainerFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceContainerFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceContainerFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceContainerFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceContainerFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceContainerFB.nnext(address()); }
        /** @return the value of the {@code uuidCapacityInput} field. */
        @NativeType("uint32_t")
        public int uuidCapacityInput() { return XrSpaceContainerFB.nuuidCapacityInput(address()); }
        /** @return the value of the {@code uuidCountOutput} field. */
        @NativeType("uint32_t")
        public int uuidCountOutput() { return XrSpaceContainerFB.nuuidCountOutput(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.@Nullable Buffer uuids() { return XrSpaceContainerFB.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceContainerFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceContainerFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityContainer#XR_TYPE_SPACE_CONTAINER_FB TYPE_SPACE_CONTAINER_FB} value to the {@code type} field. */
        public XrSpaceContainerFB.Buffer type$Default() { return type(FBSpatialEntityContainer.XR_TYPE_SPACE_CONTAINER_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceContainerFB.Buffer next(@NativeType("void const *") long value) { XrSpaceContainerFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code uuidCapacityInput} field. */
        public XrSpaceContainerFB.Buffer uuidCapacityInput(@NativeType("uint32_t") int value) { XrSpaceContainerFB.nuuidCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code uuidCountOutput} field. */
        public XrSpaceContainerFB.Buffer uuidCountOutput(@NativeType("uint32_t") int value) { XrSpaceContainerFB.nuuidCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpaceContainerFB.Buffer uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { XrSpaceContainerFB.nuuids(address(), value); return this; }

    }

}