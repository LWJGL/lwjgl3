/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The metadata from an Ogg Opus stream.
 * 
 * <p>This structure holds the in-stream metadata corresponding to the 'comment' header packet of an Ogg Opus stream. The comment header is meant to be used
 * much like someone jotting a quick note on the label of a CD. It should be a short, to the point text note that can be more than a couple words, but not
 * more than a short paragraph.</p>
 * 
 * <p>The metadata is stored as a series of (tag, value) pairs, in length-encoded string vectors, using the same format as Vorbis (without the final "framing
 * bit"), Theora, and Speex, except for the packet header. The first occurrence of the '=' character delimits the tag and value. A particular tag may
 * occur more than once, and order is significant. The character set encoding for the strings is always UTF-8, but the tag names are limited to ASCII, and
 * treated as case-insensitive. See <a target="_blank" href="https://www.xiph.org/vorbis/doc/v-comment.html">the Vorbis comment header specification</a> for details.</p>
 * 
 * <p>In filling in this structure, libopusfile will null-terminate the {@code #user_comments} strings for safety. However, the bitstream format itself
 * treats them as 8-bit clean vectors, possibly containing {@code NUL} characters, so the {@code #comment_lengths} array should be treated as their
 * authoritative length.</p>
 * 
 * <p>This structure is binary and source-compatible with a {@code vorbis_comment}, and pointers to it may be freely cast to {@code vorbis_comment} pointers,
 * and vice versa. It is provided as a separate type to avoid introducing a compile-time dependency on the libvorbis headers.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct OpusTags {
 *     char ** {@link #user_comments};
 *     int * {@link #comment_lengths};
 *     int {@link #comments};
 *     char * {@link #vendor};
 * }</code></pre>
 */
public class OpusTags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_COMMENTS,
        COMMENT_LENGTHS,
        COMMENTS,
        VENDOR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_COMMENTS = layout.offsetof(0);
        COMMENT_LENGTHS = layout.offsetof(1);
        COMMENTS = layout.offsetof(2);
        VENDOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code OpusTags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusTags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the array of comment string vectors */
    @NativeType("char **")
    public PointerBuffer user_comments() { return nuser_comments(address()); }
    /** an array of the corresponding length of each vector, in bytes */
    @NativeType("int *")
    public IntBuffer comment_lengths() { return ncomment_lengths(address()); }
    /** the total number of comment streams */
    public int comments() { return ncomments(address()); }
    /** the null-terminated vendor string. This identifies the software used to encode the stream. */
    @NativeType("char *")
    public ByteBuffer vendor() { return nvendor(address()); }
    /** the null-terminated vendor string. This identifies the software used to encode the stream. */
    @NativeType("char *")
    public String vendorString() { return nvendorString(address()); }

    // -----------------------------------

    /** Returns a new {@code OpusTags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusTags malloc() {
        return wrap(OpusTags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OpusTags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusTags calloc() {
        return wrap(OpusTags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OpusTags} instance allocated with {@link BufferUtils}. */
    public static OpusTags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OpusTags.class, memAddress(container), container);
    }

    /** Returns a new {@code OpusTags} instance for the specified memory address. */
    public static OpusTags create(long address) {
        return wrap(OpusTags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusTags createSafe(long address) {
        return address == NULL ? null : wrap(OpusTags.class, address);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OpusTags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusTags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code OpusTags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusTags malloc(MemoryStack stack) {
        return wrap(OpusTags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OpusTags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusTags calloc(MemoryStack stack) {
        return wrap(OpusTags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_comments() user_comments}. */
    public static PointerBuffer nuser_comments(long struct) { return memPointerBuffer(memGetAddress(struct + OpusTags.USER_COMMENTS), ncomments(struct)); }
    /** Unsafe version of {@link #comment_lengths() comment_lengths}. */
    public static IntBuffer ncomment_lengths(long struct) { return memIntBuffer(memGetAddress(struct + OpusTags.COMMENT_LENGTHS), ncomments(struct)); }
    /** Unsafe version of {@link #comments}. */
    public static int ncomments(long struct) { return UNSAFE.getInt(null, struct + OpusTags.COMMENTS); }
    /** Unsafe version of {@link #vendor}. */
    public static ByteBuffer nvendor(long struct) { return memByteBufferNT1(memGetAddress(struct + OpusTags.VENDOR)); }
    /** Unsafe version of {@link #vendorString}. */
    public static String nvendorString(long struct) { return memUTF8(memGetAddress(struct + OpusTags.VENDOR)); }

    // -----------------------------------

    /** An array of {@link OpusTags} structs. */
    public static class Buffer extends StructBuffer<OpusTags, Buffer> implements NativeResource {

        private static final OpusTags ELEMENT_FACTORY = OpusTags.create(-1L);

        /**
         * Creates a new {@code OpusTags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusTags#SIZEOF}, and its mark will be undefined.
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
        protected OpusTags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link OpusTags#user_comments} field. */
        @NativeType("char **")
        public PointerBuffer user_comments() { return OpusTags.nuser_comments(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link OpusTags#comment_lengths} field. */
        @NativeType("int *")
        public IntBuffer comment_lengths() { return OpusTags.ncomment_lengths(address()); }
        /** @return the value of the {@link OpusTags#comments} field. */
        public int comments() { return OpusTags.ncomments(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link OpusTags#vendor} field. */
        @NativeType("char *")
        public ByteBuffer vendor() { return OpusTags.nvendor(address()); }
        /** @return the null-terminated string pointed to by the {@link OpusTags#vendor} field. */
        @NativeType("char *")
        public String vendorString() { return OpusTags.nvendorString(address()); }

    }

}