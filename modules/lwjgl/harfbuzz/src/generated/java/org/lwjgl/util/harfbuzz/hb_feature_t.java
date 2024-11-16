/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The structure that holds information about requested feature application.
 * 
 * <p>The feature will be applied with the given value to all  glyphs which are in clusters between start (inclusive) and end (exclusive). Setting start to
 * {@link HarfBuzz#HB_FEATURE_GLOBAL_START FEATURE_GLOBAL_START} and end to {@link HarfBuzz#HB_FEATURE_GLOBAL_END FEATURE_GLOBAL_END} specifies that the feature always applies to the entire buffer.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_feature_t {
 *     hb_tag_t {@link #tag};
 *     uint32_t {@link #value};
 *     unsigned int {@link #start};
 *     unsigned int {@link #end};
 * }</code></pre>
 */
public class hb_feature_t extends Struct<hb_feature_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TAG,
        VALUE,
        START,
        END;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TAG = layout.offsetof(0);
        VALUE = layout.offsetof(1);
        START = layout.offsetof(2);
        END = layout.offsetof(3);
    }

    protected hb_feature_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_feature_t create(long address, @Nullable ByteBuffer container) {
        return new hb_feature_t(address, container);
    }

    /**
     * Creates a {@code hb_feature_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_feature_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code hb_tag_t} tag of the feature */
    @NativeType("hb_tag_t")
    public int tag() { return ntag(address()); }
    /**
     * The value of the feature.
     * 
     * <p>0 disables the feature, non-zero (usually 1) enables the feature. For features implemented as lookup type 3 (like 'salt') the value is a one based
     * index into the alternates.</p>
     */
    @NativeType("uint32_t")
    public int value() { return nvalue(address()); }
    /** the cluster to start applying this feature setting (inclusive) */
    @NativeType("unsigned int")
    public int start() { return nstart(address()); }
    /** the cluster to end applying this feature setting (exclusive). */
    @NativeType("unsigned int")
    public int end() { return nend(address()); }

    /** Sets the specified value to the {@link #tag} field. */
    public hb_feature_t tag(@NativeType("hb_tag_t") int value) { ntag(address(), value); return this; }
    /** Sets the specified value to the {@link #value} field. */
    public hb_feature_t value(@NativeType("uint32_t") int value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@link #start} field. */
    public hb_feature_t start(@NativeType("unsigned int") int value) { nstart(address(), value); return this; }
    /** Sets the specified value to the {@link #end} field. */
    public hb_feature_t end(@NativeType("unsigned int") int value) { nend(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_feature_t set(
        int tag,
        int value,
        int start,
        int end
    ) {
        tag(tag);
        value(value);
        start(start);
        end(end);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_feature_t set(hb_feature_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_feature_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_feature_t malloc() {
        return new hb_feature_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_feature_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_feature_t calloc() {
        return new hb_feature_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_feature_t} instance allocated with {@link BufferUtils}. */
    public static hb_feature_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_feature_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_feature_t} instance for the specified memory address. */
    public static hb_feature_t create(long address) {
        return new hb_feature_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable hb_feature_t createSafe(long address) {
        return address == NULL ? null : new hb_feature_t(address, null);
    }

    /**
     * Returns a new {@link hb_feature_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_feature_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_feature_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_feature_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static hb_feature_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_feature_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_feature_t malloc(MemoryStack stack) {
        return new hb_feature_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_feature_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_feature_t calloc(MemoryStack stack) {
        return new hb_feature_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_feature_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_feature_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_feature_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tag}. */
    public static int ntag(long struct) { return memGetInt(struct + hb_feature_t.TAG); }
    /** Unsafe version of {@link #value}. */
    public static int nvalue(long struct) { return memGetInt(struct + hb_feature_t.VALUE); }
    /** Unsafe version of {@link #start}. */
    public static int nstart(long struct) { return memGetInt(struct + hb_feature_t.START); }
    /** Unsafe version of {@link #end}. */
    public static int nend(long struct) { return memGetInt(struct + hb_feature_t.END); }

    /** Unsafe version of {@link #tag(int) tag}. */
    public static void ntag(long struct, int value) { memPutInt(struct + hb_feature_t.TAG, value); }
    /** Unsafe version of {@link #value(int) value}. */
    public static void nvalue(long struct, int value) { memPutInt(struct + hb_feature_t.VALUE, value); }
    /** Unsafe version of {@link #start(int) start}. */
    public static void nstart(long struct, int value) { memPutInt(struct + hb_feature_t.START, value); }
    /** Unsafe version of {@link #end(int) end}. */
    public static void nend(long struct, int value) { memPutInt(struct + hb_feature_t.END, value); }

    // -----------------------------------

    /** An array of {@link hb_feature_t} structs. */
    public static class Buffer extends StructBuffer<hb_feature_t, Buffer> implements NativeResource {

        private static final hb_feature_t ELEMENT_FACTORY = hb_feature_t.create(-1L);

        /**
         * Creates a new {@code hb_feature_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_feature_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_feature_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_feature_t#tag} field. */
        @NativeType("hb_tag_t")
        public int tag() { return hb_feature_t.ntag(address()); }
        /** @return the value of the {@link hb_feature_t#value} field. */
        @NativeType("uint32_t")
        public int value() { return hb_feature_t.nvalue(address()); }
        /** @return the value of the {@link hb_feature_t#start} field. */
        @NativeType("unsigned int")
        public int start() { return hb_feature_t.nstart(address()); }
        /** @return the value of the {@link hb_feature_t#end} field. */
        @NativeType("unsigned int")
        public int end() { return hb_feature_t.nend(address()); }

        /** Sets the specified value to the {@link hb_feature_t#tag} field. */
        public hb_feature_t.Buffer tag(@NativeType("hb_tag_t") int value) { hb_feature_t.ntag(address(), value); return this; }
        /** Sets the specified value to the {@link hb_feature_t#value} field. */
        public hb_feature_t.Buffer value(@NativeType("uint32_t") int value) { hb_feature_t.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@link hb_feature_t#start} field. */
        public hb_feature_t.Buffer start(@NativeType("unsigned int") int value) { hb_feature_t.nstart(address(), value); return this; }
        /** Sets the specified value to the {@link hb_feature_t#end} field. */
        public hb_feature_t.Buffer end(@NativeType("unsigned int") int value) { hb_feature_t.nend(address(), value); return this; }

    }

}