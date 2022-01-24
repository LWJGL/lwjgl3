/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines MSL characteristics of a vertex attribute at a particular location.
 * 
 * <p>After compilation, it is possible to query whether or not this location was used.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_msl_vertex_attribute {
 *     unsigned int location;
 *     unsigned int {@link #msl_buffer};
 *     unsigned int {@link #msl_offset};
 *     unsigned int {@link #msl_stride};
 *     spvc_bool {@link #per_instance};
 *     spvc_msl_vertex_format format;
 *     SpvBuiltIn builtin;
 * }</code></pre>
 */
@NativeType("struct spvc_msl_vertex_attribute")
public class SpvcMslVertexAttribute extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        MSL_BUFFER,
        MSL_OFFSET,
        MSL_STRIDE,
        PER_INSTANCE,
        FORMAT,
        BUILTIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        MSL_BUFFER = layout.offsetof(1);
        MSL_OFFSET = layout.offsetof(2);
        MSL_STRIDE = layout.offsetof(3);
        PER_INSTANCE = layout.offsetof(4);
        FORMAT = layout.offsetof(5);
        BUILTIN = layout.offsetof(6);
    }

    /**
     * Creates a {@code SpvcMslVertexAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslVertexAttribute(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code location} field. */
    @NativeType("unsigned int")
    public int location() { return nlocation(address()); }
    /** Obsolete, do not use. Only lingers on for ABI compatibility. */
    @NativeType("unsigned int")
    public int msl_buffer() { return nmsl_buffer(address()); }
    /** Obsolete, do not use. Only lingers on for ABI compatibility. */
    @NativeType("unsigned int")
    public int msl_offset() { return nmsl_offset(address()); }
    /** Obsolete, do not use. Only lingers on for ABI compatibility. */
    @NativeType("unsigned int")
    public int msl_stride() { return nmsl_stride(address()); }
    /** Obsolete, do not use. Only lingers on for ABI compatibility. */
    @NativeType("spvc_bool")
    public boolean per_instance() { return nper_instance(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("spvc_msl_vertex_format")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code builtin} field. */
    @NativeType("SpvBuiltIn")
    public int builtin() { return nbuiltin(address()); }

    /** Sets the specified value to the {@code location} field. */
    public SpvcMslVertexAttribute location(@NativeType("unsigned int") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@link #msl_buffer} field. */
    public SpvcMslVertexAttribute msl_buffer(@NativeType("unsigned int") int value) { nmsl_buffer(address(), value); return this; }
    /** Sets the specified value to the {@link #msl_offset} field. */
    public SpvcMslVertexAttribute msl_offset(@NativeType("unsigned int") int value) { nmsl_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #msl_stride} field. */
    public SpvcMslVertexAttribute msl_stride(@NativeType("unsigned int") int value) { nmsl_stride(address(), value); return this; }
    /** Sets the specified value to the {@link #per_instance} field. */
    public SpvcMslVertexAttribute per_instance(@NativeType("spvc_bool") boolean value) { nper_instance(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SpvcMslVertexAttribute format(@NativeType("spvc_msl_vertex_format") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code builtin} field. */
    public SpvcMslVertexAttribute builtin(@NativeType("SpvBuiltIn") int value) { nbuiltin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslVertexAttribute set(
        int location,
        int msl_buffer,
        int msl_offset,
        int msl_stride,
        boolean per_instance,
        int format,
        int builtin
    ) {
        location(location);
        msl_buffer(msl_buffer);
        msl_offset(msl_offset);
        msl_stride(msl_stride);
        per_instance(per_instance);
        format(format);
        builtin(builtin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslVertexAttribute set(SpvcMslVertexAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslVertexAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslVertexAttribute malloc() {
        return wrap(SpvcMslVertexAttribute.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcMslVertexAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslVertexAttribute calloc() {
        return wrap(SpvcMslVertexAttribute.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcMslVertexAttribute} instance allocated with {@link BufferUtils}. */
    public static SpvcMslVertexAttribute create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcMslVertexAttribute.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslVertexAttribute} instance for the specified memory address. */
    public static SpvcMslVertexAttribute create(long address) {
        return wrap(SpvcMslVertexAttribute.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslVertexAttribute createSafe(long address) {
        return address == NULL ? null : wrap(SpvcMslVertexAttribute.class, address);
    }

    /**
     * Returns a new {@link SpvcMslVertexAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslVertexAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslVertexAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcMslVertexAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcMslVertexAttribute.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslVertexAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslVertexAttribute malloc(MemoryStack stack) {
        return wrap(SpvcMslVertexAttribute.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcMslVertexAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslVertexAttribute calloc(MemoryStack stack) {
        return wrap(SpvcMslVertexAttribute.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcMslVertexAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslVertexAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslVertexAttribute.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.LOCATION); }
    /** Unsafe version of {@link #msl_buffer}. */
    public static int nmsl_buffer(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.MSL_BUFFER); }
    /** Unsafe version of {@link #msl_offset}. */
    public static int nmsl_offset(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.MSL_OFFSET); }
    /** Unsafe version of {@link #msl_stride}. */
    public static int nmsl_stride(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.MSL_STRIDE); }
    /** Unsafe version of {@link #per_instance}. */
    public static boolean nper_instance(long struct) { return UNSAFE.getByte(null, struct + SpvcMslVertexAttribute.PER_INSTANCE) != 0; }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.FORMAT); }
    /** Unsafe version of {@link #builtin}. */
    public static int nbuiltin(long struct) { return UNSAFE.getInt(null, struct + SpvcMslVertexAttribute.BUILTIN); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.LOCATION, value); }
    /** Unsafe version of {@link #msl_buffer(int) msl_buffer}. */
    public static void nmsl_buffer(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.MSL_BUFFER, value); }
    /** Unsafe version of {@link #msl_offset(int) msl_offset}. */
    public static void nmsl_offset(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.MSL_OFFSET, value); }
    /** Unsafe version of {@link #msl_stride(int) msl_stride}. */
    public static void nmsl_stride(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.MSL_STRIDE, value); }
    /** Unsafe version of {@link #per_instance(boolean) per_instance}. */
    public static void nper_instance(long struct, boolean value) { UNSAFE.putByte(null, struct + SpvcMslVertexAttribute.PER_INSTANCE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.FORMAT, value); }
    /** Unsafe version of {@link #builtin(int) builtin}. */
    public static void nbuiltin(long struct, int value) { UNSAFE.putInt(null, struct + SpvcMslVertexAttribute.BUILTIN, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslVertexAttribute} structs. */
    public static class Buffer extends StructBuffer<SpvcMslVertexAttribute, Buffer> implements NativeResource {

        private static final SpvcMslVertexAttribute ELEMENT_FACTORY = SpvcMslVertexAttribute.create(-1L);

        /**
         * Creates a new {@code SpvcMslVertexAttribute.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslVertexAttribute#SIZEOF}, and its mark will be undefined.
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
        protected SpvcMslVertexAttribute getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code location} field. */
        @NativeType("unsigned int")
        public int location() { return SpvcMslVertexAttribute.nlocation(address()); }
        /** @return the value of the {@link SpvcMslVertexAttribute#msl_buffer} field. */
        @NativeType("unsigned int")
        public int msl_buffer() { return SpvcMslVertexAttribute.nmsl_buffer(address()); }
        /** @return the value of the {@link SpvcMslVertexAttribute#msl_offset} field. */
        @NativeType("unsigned int")
        public int msl_offset() { return SpvcMslVertexAttribute.nmsl_offset(address()); }
        /** @return the value of the {@link SpvcMslVertexAttribute#msl_stride} field. */
        @NativeType("unsigned int")
        public int msl_stride() { return SpvcMslVertexAttribute.nmsl_stride(address()); }
        /** @return the value of the {@link SpvcMslVertexAttribute#per_instance} field. */
        @NativeType("spvc_bool")
        public boolean per_instance() { return SpvcMslVertexAttribute.nper_instance(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("spvc_msl_vertex_format")
        public int format() { return SpvcMslVertexAttribute.nformat(address()); }
        /** @return the value of the {@code builtin} field. */
        @NativeType("SpvBuiltIn")
        public int builtin() { return SpvcMslVertexAttribute.nbuiltin(address()); }

        /** Sets the specified value to the {@code location} field. */
        public SpvcMslVertexAttribute.Buffer location(@NativeType("unsigned int") int value) { SpvcMslVertexAttribute.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcMslVertexAttribute#msl_buffer} field. */
        public SpvcMslVertexAttribute.Buffer msl_buffer(@NativeType("unsigned int") int value) { SpvcMslVertexAttribute.nmsl_buffer(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcMslVertexAttribute#msl_offset} field. */
        public SpvcMslVertexAttribute.Buffer msl_offset(@NativeType("unsigned int") int value) { SpvcMslVertexAttribute.nmsl_offset(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcMslVertexAttribute#msl_stride} field. */
        public SpvcMslVertexAttribute.Buffer msl_stride(@NativeType("unsigned int") int value) { SpvcMslVertexAttribute.nmsl_stride(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcMslVertexAttribute#per_instance} field. */
        public SpvcMslVertexAttribute.Buffer per_instance(@NativeType("spvc_bool") boolean value) { SpvcMslVertexAttribute.nper_instance(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SpvcMslVertexAttribute.Buffer format(@NativeType("spvc_msl_vertex_format") int value) { SpvcMslVertexAttribute.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code builtin} field. */
        public SpvcMslVertexAttribute.Buffer builtin(@NativeType("SpvBuiltIn") int value) { SpvcMslVertexAttribute.nbuiltin(address(), value); return this; }

    }

}