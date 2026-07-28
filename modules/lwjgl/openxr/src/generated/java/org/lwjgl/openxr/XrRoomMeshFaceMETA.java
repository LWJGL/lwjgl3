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
 * <pre><code>
 * struct XrRoomMeshFaceMETA {
 *     {@link XrUuid XrUuid} uuid;
 *     {@link XrUuid XrUuid} parentUuid;
 *     XrSemanticLabelMETA semanticLabel;
 * }</code></pre>
 */
public class XrRoomMeshFaceMETA extends Struct<XrRoomMeshFaceMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UUID,
        PARENTUUID,
        SEMANTICLABEL;

    static {
        XrUuid.createSafe(NULL);

        Layout layout = __struct(
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UUID = layout.offsetof(0);
        PARENTUUID = layout.offsetof(1);
        SEMANTICLABEL = layout.offsetof(2);
    }

    protected XrRoomMeshFaceMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRoomMeshFaceMETA create(long address, @Nullable ByteBuffer container) {
        return new XrRoomMeshFaceMETA(address, container);
    }

    /**
     * Creates a {@code XrRoomMeshFaceMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRoomMeshFaceMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link XrUuid} view of the {@code uuid} field. */
    public XrUuid uuid() { return nuuid(address()); }
    /** @return a {@link XrUuid} view of the {@code parentUuid} field. */
    public XrUuid parentUuid() { return nparentUuid(address()); }
    /** @return the value of the {@code semanticLabel} field. */
    @NativeType("XrSemanticLabelMETA")
    public int semanticLabel() { return nsemanticLabel(address()); }

    /** Copies the specified {@link XrUuid} to the {@code uuid} field. */
    public XrRoomMeshFaceMETA uuid(XrUuid value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomMeshFaceMETA uuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(uuid()); return this; }
    /** Copies the specified {@link XrUuid} to the {@code parentUuid} field. */
    public XrRoomMeshFaceMETA parentUuid(XrUuid value) { nparentUuid(address(), value); return this; }
    /** Passes the {@code parentUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRoomMeshFaceMETA parentUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(parentUuid()); return this; }
    /** Sets the specified value to the {@code semanticLabel} field. */
    public XrRoomMeshFaceMETA semanticLabel(@NativeType("XrSemanticLabelMETA") int value) { nsemanticLabel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRoomMeshFaceMETA set(
        XrUuid uuid,
        XrUuid parentUuid,
        int semanticLabel
    ) {
        uuid(uuid);
        parentUuid(parentUuid);
        semanticLabel(semanticLabel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRoomMeshFaceMETA set(XrRoomMeshFaceMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRoomMeshFaceMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRoomMeshFaceMETA malloc() {
        return new XrRoomMeshFaceMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshFaceMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRoomMeshFaceMETA calloc() {
        return new XrRoomMeshFaceMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRoomMeshFaceMETA} instance allocated with {@link BufferUtils}. */
    public static XrRoomMeshFaceMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRoomMeshFaceMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrRoomMeshFaceMETA} instance for the specified memory address. */
    public static XrRoomMeshFaceMETA create(long address) {
        return new XrRoomMeshFaceMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRoomMeshFaceMETA createSafe(long address) {
        return address == NULL ? null : new XrRoomMeshFaceMETA(address, null);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRoomMeshFaceMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRoomMeshFaceMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRoomMeshFaceMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshFaceMETA malloc(MemoryStack stack) {
        return new XrRoomMeshFaceMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRoomMeshFaceMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRoomMeshFaceMETA calloc(MemoryStack stack) {
        return new XrRoomMeshFaceMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRoomMeshFaceMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRoomMeshFaceMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #uuid}. */
    public static XrUuid nuuid(long struct) { return XrUuid.create(struct + XrRoomMeshFaceMETA.UUID); }
    /** Unsafe version of {@link #parentUuid}. */
    public static XrUuid nparentUuid(long struct) { return XrUuid.create(struct + XrRoomMeshFaceMETA.PARENTUUID); }
    /** Unsafe version of {@link #semanticLabel}. */
    public static int nsemanticLabel(long struct) { return memGetInt(struct + XrRoomMeshFaceMETA.SEMANTICLABEL); }

    /** Unsafe version of {@link #uuid(XrUuid) uuid}. */
    public static void nuuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrRoomMeshFaceMETA.UUID, XrUuid.SIZEOF); }
    /** Unsafe version of {@link #parentUuid(XrUuid) parentUuid}. */
    public static void nparentUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrRoomMeshFaceMETA.PARENTUUID, XrUuid.SIZEOF); }
    /** Unsafe version of {@link #semanticLabel(int) semanticLabel}. */
    public static void nsemanticLabel(long struct, int value) { memPutInt(struct + XrRoomMeshFaceMETA.SEMANTICLABEL, value); }

    // -----------------------------------

    /** An array of {@link XrRoomMeshFaceMETA} structs. */
    public static class Buffer extends StructBuffer<XrRoomMeshFaceMETA, Buffer> implements NativeResource {

        private static final XrRoomMeshFaceMETA ELEMENT_FACTORY = XrRoomMeshFaceMETA.create(-1L);

        /**
         * Creates a new {@code XrRoomMeshFaceMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRoomMeshFaceMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRoomMeshFaceMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link XrUuid} view of the {@code uuid} field. */
        public XrUuid uuid() { return XrRoomMeshFaceMETA.nuuid(address()); }
        /** @return a {@link XrUuid} view of the {@code parentUuid} field. */
        public XrUuid parentUuid() { return XrRoomMeshFaceMETA.nparentUuid(address()); }
        /** @return the value of the {@code semanticLabel} field. */
        @NativeType("XrSemanticLabelMETA")
        public int semanticLabel() { return XrRoomMeshFaceMETA.nsemanticLabel(address()); }

        /** Copies the specified {@link XrUuid} to the {@code uuid} field. */
        public XrRoomMeshFaceMETA.Buffer uuid(XrUuid value) { XrRoomMeshFaceMETA.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomMeshFaceMETA.Buffer uuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(uuid()); return this; }
        /** Copies the specified {@link XrUuid} to the {@code parentUuid} field. */
        public XrRoomMeshFaceMETA.Buffer parentUuid(XrUuid value) { XrRoomMeshFaceMETA.nparentUuid(address(), value); return this; }
        /** Passes the {@code parentUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRoomMeshFaceMETA.Buffer parentUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(parentUuid()); return this; }
        /** Sets the specified value to the {@code semanticLabel} field. */
        public XrRoomMeshFaceMETA.Buffer semanticLabel(@NativeType("XrSemanticLabelMETA") int value) { XrRoomMeshFaceMETA.nsemanticLabel(address(), value); return this; }

    }

}