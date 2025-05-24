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
public class SpngText extends Struct<SpngText> implements NativeResource {

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

    protected SpngText(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngText create(long address, @Nullable ByteBuffer container) {
        return new SpngText(address, container);
    }

    /**
     * Creates a {@code SpngText} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngText(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code keyword} field. */
    @NativeType("char[80]")
    public ByteBuffer keyword() { return nkeyword(address()); }
    /** @return the value at the specified index of the {@code keyword} field. */
    @NativeType("char")
    public byte keyword(int index) { return nkeyword(address(), index); }
    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("size_t")
    public long length() { return nlength(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code text} field. */
    @NativeType("char *")
    public ByteBuffer text(int capacity) { return ntext(address(), capacity); }
    /** @return the value of the {@code compression_flag} field. */
    @NativeType("uint8_t")
    public byte compression_flag() { return ncompression_flag(address()); }
    /** @return the value of the {@code compression_method} field. */
    @NativeType("uint8_t")
    public byte compression_method() { return ncompression_method(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code language_tag} field. */
    @NativeType("char *")
    public ByteBuffer language_tag(int capacity) { return nlanguage_tag(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code translated_keyword} field. */
    @NativeType("char *")
    public ByteBuffer translated_keyword(int capacity) { return ntranslated_keyword(address(), capacity); }

    /** Copies the specified {@link ByteBuffer} to the {@code keyword} field. */
    public SpngText keyword(@NativeType("char[80]") ByteBuffer value) { nkeyword(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code keyword} field. */
    public SpngText keyword(int index, @NativeType("char") byte value) { nkeyword(address(), index, value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public SpngText type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SpngText length(@NativeType("size_t") long value) { nlength(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code text} field. */
    public SpngText text(@NativeType("char *") ByteBuffer value) { ntext(address(), value); return this; }
    /** Sets the specified value to the {@code compression_flag} field. */
    public SpngText compression_flag(@NativeType("uint8_t") byte value) { ncompression_flag(address(), value); return this; }
    /** Sets the specified value to the {@code compression_method} field. */
    public SpngText compression_method(@NativeType("uint8_t") byte value) { ncompression_method(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code language_tag} field. */
    public SpngText language_tag(@NativeType("char *") ByteBuffer value) { nlanguage_tag(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code translated_keyword} field. */
    public SpngText translated_keyword(@NativeType("char *") ByteBuffer value) { ntranslated_keyword(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngText set(
        ByteBuffer keyword,
        int type,
        long length,
        ByteBuffer text,
        byte compression_flag,
        byte compression_method,
        ByteBuffer language_tag,
        ByteBuffer translated_keyword
    ) {
        keyword(keyword);
        type(type);
        length(length);
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
    public SpngText set(SpngText src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngText} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngText malloc() {
        return new SpngText(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngText} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngText calloc() {
        return new SpngText(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngText} instance allocated with {@link BufferUtils}. */
    public static SpngText create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngText(memAddress(container), container);
    }

    /** Returns a new {@code SpngText} instance for the specified memory address. */
    public static SpngText create(long address) {
        return new SpngText(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngText createSafe(long address) {
        return address == NULL ? null : new SpngText(address, null);
    }

    /**
     * Returns a new {@link SpngText.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngText.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngText.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngText.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngText.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngText} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngText malloc(MemoryStack stack) {
        return new SpngText(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngText} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngText calloc(MemoryStack stack) {
        return new SpngText(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngText.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngText.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngText.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #keyword}. */
    public static ByteBuffer nkeyword(long struct) { return memByteBuffer(struct + SpngText.KEYWORD, 80); }
    /** Unsafe version of {@link #keyword(int) keyword}. */
    public static byte nkeyword(long struct, int index) {
        return memGetByte(struct + SpngText.KEYWORD + check(index, 80) * 1);
    }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SpngText.TYPE); }
    /** Unsafe version of {@link #length}. */
    public static long nlength(long struct) { return memGetAddress(struct + SpngText.LENGTH); }
    /** Unsafe version of {@link #text(int) text}. */
    public static ByteBuffer ntext(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngText.TEXT), capacity); }
    /** Unsafe version of {@link #compression_flag}. */
    public static byte ncompression_flag(long struct) { return memGetByte(struct + SpngText.COMPRESSION_FLAG); }
    /** Unsafe version of {@link #compression_method}. */
    public static byte ncompression_method(long struct) { return memGetByte(struct + SpngText.COMPRESSION_METHOD); }
    /** Unsafe version of {@link #language_tag(int) language_tag}. */
    public static ByteBuffer nlanguage_tag(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngText.LANGUAGE_TAG), capacity); }
    /** Unsafe version of {@link #translated_keyword(int) translated_keyword}. */
    public static ByteBuffer ntranslated_keyword(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SpngText.TRANSLATED_KEYWORD), capacity); }

    /** Unsafe version of {@link #keyword(ByteBuffer) keyword}. */
    public static void nkeyword(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 80); }
        memCopy(memAddress(value), struct + SpngText.KEYWORD, value.remaining() * 1);
    }
    /** Unsafe version of {@link #keyword(int, byte) keyword}. */
    public static void nkeyword(long struct, int index, byte value) {
        memPutByte(struct + SpngText.KEYWORD + check(index, 80) * 1, value);
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SpngText.TYPE, value); }
    /** Unsafe version of {@link #length(long) length}. */
    public static void nlength(long struct, long value) { memPutAddress(struct + SpngText.LENGTH, value); }
    /** Unsafe version of {@link #text(ByteBuffer) text}. */
    public static void ntext(long struct, ByteBuffer value) { memPutAddress(struct + SpngText.TEXT, memAddress(value)); }
    /** Unsafe version of {@link #compression_flag(byte) compression_flag}. */
    public static void ncompression_flag(long struct, byte value) { memPutByte(struct + SpngText.COMPRESSION_FLAG, value); }
    /** Unsafe version of {@link #compression_method(byte) compression_method}. */
    public static void ncompression_method(long struct, byte value) { memPutByte(struct + SpngText.COMPRESSION_METHOD, value); }
    /** Unsafe version of {@link #language_tag(ByteBuffer) language_tag}. */
    public static void nlanguage_tag(long struct, ByteBuffer value) { memPutAddress(struct + SpngText.LANGUAGE_TAG, memAddress(value)); }
    /** Unsafe version of {@link #translated_keyword(ByteBuffer) translated_keyword}. */
    public static void ntranslated_keyword(long struct, ByteBuffer value) { memPutAddress(struct + SpngText.TRANSLATED_KEYWORD, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngText.TEXT));
        check(memGetAddress(struct + SpngText.LANGUAGE_TAG));
        check(memGetAddress(struct + SpngText.TRANSLATED_KEYWORD));
    }

    // -----------------------------------

    /** An array of {@link SpngText} structs. */
    public static class Buffer extends StructBuffer<SpngText, Buffer> implements NativeResource {

        private static final SpngText ELEMENT_FACTORY = SpngText.create(-1L);

        /**
         * Creates a new {@code SpngText.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngText#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngText getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code keyword} field. */
        @NativeType("char[80]")
        public ByteBuffer keyword() { return SpngText.nkeyword(address()); }
        /** @return the value at the specified index of the {@code keyword} field. */
        @NativeType("char")
        public byte keyword(int index) { return SpngText.nkeyword(address(), index); }
        /** @return the value of the {@code type} field. */
        public int type() { return SpngText.ntype(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("size_t")
        public long length() { return SpngText.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code text} field. */
        @NativeType("char *")
        public ByteBuffer text(int capacity) { return SpngText.ntext(address(), capacity); }
        /** @return the value of the {@code compression_flag} field. */
        @NativeType("uint8_t")
        public byte compression_flag() { return SpngText.ncompression_flag(address()); }
        /** @return the value of the {@code compression_method} field. */
        @NativeType("uint8_t")
        public byte compression_method() { return SpngText.ncompression_method(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code language_tag} field. */
        @NativeType("char *")
        public ByteBuffer language_tag(int capacity) { return SpngText.nlanguage_tag(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code translated_keyword} field. */
        @NativeType("char *")
        public ByteBuffer translated_keyword(int capacity) { return SpngText.ntranslated_keyword(address(), capacity); }

        /** Copies the specified {@link ByteBuffer} to the {@code keyword} field. */
        public SpngText.Buffer keyword(@NativeType("char[80]") ByteBuffer value) { SpngText.nkeyword(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code keyword} field. */
        public SpngText.Buffer keyword(int index, @NativeType("char") byte value) { SpngText.nkeyword(address(), index, value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public SpngText.Buffer type(int value) { SpngText.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SpngText.Buffer length(@NativeType("size_t") long value) { SpngText.nlength(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code text} field. */
        public SpngText.Buffer text(@NativeType("char *") ByteBuffer value) { SpngText.ntext(address(), value); return this; }
        /** Sets the specified value to the {@code compression_flag} field. */
        public SpngText.Buffer compression_flag(@NativeType("uint8_t") byte value) { SpngText.ncompression_flag(address(), value); return this; }
        /** Sets the specified value to the {@code compression_method} field. */
        public SpngText.Buffer compression_method(@NativeType("uint8_t") byte value) { SpngText.ncompression_method(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code language_tag} field. */
        public SpngText.Buffer language_tag(@NativeType("char *") ByteBuffer value) { SpngText.nlanguage_tag(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code translated_keyword} field. */
        public SpngText.Buffer translated_keyword(@NativeType("char *") ByteBuffer value) { SpngText.ntranslated_keyword(address(), value); return this; }

    }

}