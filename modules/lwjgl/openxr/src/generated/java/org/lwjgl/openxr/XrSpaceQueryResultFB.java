/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Query result.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrSpaceQueryResultFB} structure is a query result returned in the {@code results} output parameter of the {@link FBSpatialEntityQuery#xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} function.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrSpaceQueryResultFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSpaceQueryResultsFB}, {@link XrUuidEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSpaceQueryResultFB {
 *     XrSpace {@link #space};
 *     {@link XrUuidEXT XrUuidEXT} {@link #uuid};
 * }</code></pre>
 */
public class XrSpaceQueryResultFB extends Struct<XrSpaceQueryResultFB> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SPACE,
        UUID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SPACE = layout.offsetof(0);
        UUID = layout.offsetof(1);
    }

    protected XrSpaceQueryResultFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceQueryResultFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceQueryResultFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceQueryResultFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceQueryResultFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrSpace} handle to the spatial entity found by the query. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** the UUID that identifies the entity. */
    public XrUuidEXT uuid() { return nuuid(address()); }

    // -----------------------------------

    /** Returns a new {@code XrSpaceQueryResultFB} instance for the specified memory address. */
    public static XrSpaceQueryResultFB create(long address) {
        return new XrSpaceQueryResultFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryResultFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceQueryResultFB(address, null);
    }

    /**
     * Create a {@link XrSpaceQueryResultFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryResultFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSpaceQueryResultFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpaceQueryResultFB.SPACE); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrSpaceQueryResultFB.UUID); }

    // -----------------------------------

    /** An array of {@link XrSpaceQueryResultFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceQueryResultFB, Buffer> {

        private static final XrSpaceQueryResultFB ELEMENT_FACTORY = XrSpaceQueryResultFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceQueryResultFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceQueryResultFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceQueryResultFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSpaceQueryResultFB#space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpaceQueryResultFB.nspace(address()); }
        /** @return a {@link XrUuidEXT} view of the {@link XrSpaceQueryResultFB#uuid} field. */
        public XrUuidEXT uuid() { return XrSpaceQueryResultFB.nuuid(address()); }

    }

}