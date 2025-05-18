/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_text {
 *     char keyword[80];
 *     int type;
 *     size_t length;
 *     char * text;
 *     uint8_t compression_flag;
 *     uint8_t compression_method;
 *     char * language_tag;
 *     char * translated_keyword;
 * }}</pre>
 */
@NativeType("struct spng_text")
public class spng_text extends Struct<spng_text> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KEYWORD,
        TYPE,
        LENGTH,
        TEXT,
        COMPRESSION_FLAG,
        COMPRESSION_METHOD,
        LANGUAGE_TAG,
        TRANSLATED_KEYWORD;

    static {
        Layout layout = __struct(
            __array(1, 80),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KEYWORD = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        LENGTH = layout.offsetof(2);
        TEXT = layout.offsetof(3);
        COMPRESSION_FLAG = layout.offsetof(4);
        COMPRESSION_METHOD = layout.offsetof(5);
        LANGUAGE_TAG = layout.offsetof(6);
        TRANSLATED_KEYWORD = layout.offsetof(7);
    }

    protected spng_text(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_text create(long address, @Nullable ByteBuffer container) {
        return new spng_text(address, container);
    }

    /**
     * Creates a {@code spng_text} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_text(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code keyword} field. */
    @NativeType("char[80]")
    public ByteBuffer keyword() { return nkeyword(address()); }
    /** @return the null-terminated string stored in the {@code keyword} field. */
    @NativeType("char[80]")
    public String keywordString() { return nkeywordString(address()); }
    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char *")
    public ByteBuffer text() { return ntext(address()); }
    /** @return the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char *")
    public String textString() { return ntextString(address()); }
    /** @return the value of the {@code compression_flag} field. */
    @NativeType("uint8_t")
    public byte compression_flag() { return ncompression_flag(address()); }
    /** @return the value of the {@code compression_method} field. */
    @NativeType("uint8_t")
    public byte compression_method() { return ncompression_method(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code language_tag} field. */
    @NativeType("char *")
    public ByteBuffer language_tag() { return nlanguage_tag(address()); }
    /** @return the null-terminated string pointed to by the {@code language_tag} field. */
    @NativeType("char *")
    public String language_tagString() { return nlanguage_tagString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code translated_keyword} field. */
    @NativeType("char *")
    public ByteBuffer translated_keyword() { return ntranslated_keyword(address()); }
    /** @return the null-terminated string pointed to by the {@code translated_keyword} field. */
    @NativeType("char *")
    public String translated_keywordString() { return ntranslated_keywordString(address()); }

    /** Copies the specified encoded string to the {@code keyword} field. */
    public spng_text keyword(@NativeType("char[80]") ByteBuffer value) { nkeyword(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public spng_text type(int value) { ntype(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code text} field. */
    public spng_text text(@NativeType("char *") ByteBuffer value) { ntext(address(), value); return this; }
    /** Sets the specified value to the {@code compression_flag} field. */
    public spng_text compression_flag(@NativeType("uint8_t") byte value) { ncompression_flag(address(), value); return this; }
    /** Sets the specified value to the {@code compression_method} field. */
    public spng_text compression_method(@NativeType("uint8_t") byte value) { ncompression_method(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code language_tag} field. */
    public spng_text language_tag(@NativeType("char *") ByteBuffer value) { nlanguage_tag(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code translated_keyword} field. */
    public spng_text translated_keyword(@NativeType("char *") ByteBuffer value) { ntranslated_keyword(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_text set(
        ByteBuffer keyword,
        int type,
        ByteBuffer text,
        byte compression_flag,
        byte compression_method,
        ByteBuffer language_tag,
        ByteBuffer translated_keyword
    ) {
        keyword(keyword);
        type(type);
        text(text);
        compression_flag(compression_flag);
        compression_method(compression_method);
        language_tag(language_tag);
        translated_keyword(translated_keyword);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_text set(spng_text src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_text} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_text malloc() {
        return new spng_text(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_text} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_text calloc() {
        return new spng_text(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_text} instance allocated with {@link BufferUtils}. */
    public static spng_text create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_text(memAddress(container), container);
    }

    /** Returns a new {@code spng_text} instance for the specified memory address. */
    public static spng_text create(long address) {
        return new spng_text(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_text createSafe(long address) {
        return address == NULL ? null : new spng_text(address, null);
    }

    /**
     * Returns a new {@link spng_text.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_text.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_text.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_text.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_text.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_text} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_text malloc(MemoryStack stack) {
        return new spng_text(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_text} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_text calloc(MemoryStack stack) {
        return new spng_text(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_text.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_text.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_text.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #keyword}. */
    public static ByteBuffer nkeyword(long struct) { return memByteBuffer(struct + spng_text.KEYWORD, 80); }
    /** Unsafe version of {@link #keywordString}. */
    public static String nkeywordString(long struct) { return memASCII(struct + spng_text.KEYWORD); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + spng_text.TYPE); }
    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + spng_text.LENGTH); }
    /** Unsafe version of {@link #text}. */
    public static ByteBuffer ntext(long struct) { return memByteBufferNT1(memGetAddress(struct + spng_text.TEXT)); }
    /** Unsafe version of {@link #textString}. */
    public static String ntextString(long struct) { return memASCII(memGetAddress(struct + spng_text.TEXT)); }
    /** Unsafe version of {@link #compression_flag}. */
    public static byte ncompression_flag(long struct) { return memGetByte(struct + spng_text.COMPRESSION_FLAG); }
    /** Unsafe version of {@link #compression_method}. */
    public static byte ncompression_method(long struct) { return memGetByte(struct + spng_text.COMPRESSION_METHOD); }
    /** Unsafe version of {@link #language_tag}. */
    public static ByteBuffer nlanguage_tag(long struct) { return memByteBufferNT1(memGetAddress(struct + spng_text.LANGUAGE_TAG)); }
    /** Unsafe version of {@link #language_tagString}. */
    public static String nlanguage_tagString(long struct) { return memASCII(memGetAddress(struct + spng_text.LANGUAGE_TAG)); }
    /** Unsafe version of {@link #translated_keyword}. */
    public static ByteBuffer ntranslated_keyword(long struct) { return memByteBufferNT1(memGetAddress(struct + spng_text.TRANSLATED_KEYWORD)); }
    /** Unsafe version of {@link #translated_keywordString}. */
    public static String ntranslated_keywordString(long struct) { return memASCII(memGetAddress(struct + spng_text.TRANSLATED_KEYWORD)); }

    /** Unsafe version of {@link #keyword(ByteBuffer) keyword}. */
    public static void nkeyword(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 80);
        }
        memCopy(memAddress(value), struct + spng_text.KEYWORD, value.remaining());
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + spng_text.TYPE, value); }
    /** Sets the specified value to the {@code length} field of the specified {@code struct}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + spng_text.LENGTH, value); }
    /** Unsafe version of {@link #text(ByteBuffer) text}. */
    public static void ntext(long struct, ByteBuffer value) {
        memPutAddress(struct + spng_text.TEXT, memAddress(value));
        nlength(struct, value.remaining());
    }
    /** Unsafe version of {@link #compression_flag(byte) compression_flag}. */
    public static void ncompression_flag(long struct, byte value) { memPutByte(struct + spng_text.COMPRESSION_FLAG, value); }
    /** Unsafe version of {@link #compression_method(byte) compression_method}. */
    public static void ncompression_method(long struct, byte value) { memPutByte(struct + spng_text.COMPRESSION_METHOD, value); }
    /** Unsafe version of {@link #language_tag(ByteBuffer) language_tag}. */
    public static void nlanguage_tag(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + spng_text.LANGUAGE_TAG, memAddress(value));
    }
    /** Unsafe version of {@link #translated_keyword(ByteBuffer) translated_keyword}. */
    public static void ntranslated_keyword(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + spng_text.TRANSLATED_KEYWORD, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + spng_text.TEXT));
        check(memGetAddress(struct + spng_text.LANGUAGE_TAG));
        check(memGetAddress(struct + spng_text.TRANSLATED_KEYWORD));
    }

    // -----------------------------------

    /** An array of {@link spng_text} structs. */
    public static class Buffer extends StructBuffer<spng_text, Buffer> implements NativeResource {

        private static final spng_text ELEMENT_FACTORY = spng_text.create(-1L);

        /**
         * Creates a new {@code spng_text.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_text#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_text getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code keyword} field. */
        @NativeType("char[80]")
        public ByteBuffer keyword() { return spng_text.nkeyword(address()); }
        /** @return the null-terminated string stored in the {@code keyword} field. */
        @NativeType("char[80]")
        public String keywordString() { return spng_text.nkeywordString(address()); }
        /** @return the value of the {@code type} field. */
        public int type() { return spng_text.ntype(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return spng_text.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char *")
        public ByteBuffer text() { return spng_text.ntext(address()); }
        /** @return the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char *")
        public String textString() { return spng_text.ntextString(address()); }
        /** @return the value of the {@code compression_flag} field. */
        @NativeType("uint8_t")
        public byte compression_flag() { return spng_text.ncompression_flag(address()); }
        /** @return the value of the {@code compression_method} field. */
        @NativeType("uint8_t")
        public byte compression_method() { return spng_text.ncompression_method(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code language_tag} field. */
        @NativeType("char *")
        public ByteBuffer language_tag() { return spng_text.nlanguage_tag(address()); }
        /** @return the null-terminated string pointed to by the {@code language_tag} field. */
        @NativeType("char *")
        public String language_tagString() { return spng_text.nlanguage_tagString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code translated_keyword} field. */
        @NativeType("char *")
        public ByteBuffer translated_keyword() { return spng_text.ntranslated_keyword(address()); }
        /** @return the null-terminated string pointed to by the {@code translated_keyword} field. */
        @NativeType("char *")
        public String translated_keywordString() { return spng_text.ntranslated_keywordString(address()); }

        /** Copies the specified encoded string to the {@code keyword} field. */
        public spng_text.Buffer keyword(@NativeType("char[80]") ByteBuffer value) { spng_text.nkeyword(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public spng_text.Buffer type(int value) { spng_text.ntype(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code text} field. */
        public spng_text.Buffer text(@NativeType("char *") ByteBuffer value) { spng_text.ntext(address(), value); return this; }
        /** Sets the specified value to the {@code compression_flag} field. */
        public spng_text.Buffer compression_flag(@NativeType("uint8_t") byte value) { spng_text.ncompression_flag(address(), value); return this; }
        /** Sets the specified value to the {@code compression_method} field. */
        public spng_text.Buffer compression_method(@NativeType("uint8_t") byte value) { spng_text.ncompression_method(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code language_tag} field. */
        public spng_text.Buffer language_tag(@NativeType("char *") ByteBuffer value) { spng_text.nlanguage_tag(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code translated_keyword} field. */
        public spng_text.Buffer translated_keyword(@NativeType("char *") ByteBuffer value) { spng_text.ntranslated_keyword(address(), value); return this; }

    }

}