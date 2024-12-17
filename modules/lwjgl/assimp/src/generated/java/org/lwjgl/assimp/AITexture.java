/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct aiTexture {
 *     unsigned int mWidth;
 *     unsigned int mHeight;
 *     char achFormatHint[9];
 *     {@link AITexel struct aiTexel} * pcData;
 *     {@link AIString struct aiString} mFilename;
 * }}</pre>
 */
@NativeType("struct aiTexture")
public class AITexture extends Struct<AITexture> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MWIDTH,
        MHEIGHT,
        ACHFORMATHINT,
        PCDATA,
        MFILENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(1, 9),
            __member(POINTER_SIZE),
            __member(AIString.SIZEOF, AIString.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MWIDTH = layout.offsetof(0);
        MHEIGHT = layout.offsetof(1);
        ACHFORMATHINT = layout.offsetof(2);
        PCDATA = layout.offsetof(3);
        MFILENAME = layout.offsetof(4);
    }

    protected AITexture(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AITexture create(long address, @Nullable ByteBuffer container) {
        return new AITexture(address, container);
    }

    /**
     * Creates a {@code AITexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AITexture(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mWidth} field. */
    @NativeType("unsigned int")
    public int mWidth() { return nmWidth(address()); }
    /** @return the value of the {@code mHeight} field. */
    @NativeType("unsigned int")
    public int mHeight() { return nmHeight(address()); }
    /** @return a {@link ByteBuffer} view of the {@code achFormatHint} field. */
    @NativeType("char[9]")
    public ByteBuffer achFormatHint() { return nachFormatHint(address()); }
    /** @return the null-terminated string stored in the {@code achFormatHint} field. */
    @NativeType("char[9]")
    public String achFormatHintString() { return nachFormatHintString(address()); }
    /** @return a {@link AITexel.Buffer} view of the struct array pointed to by the {@code pcData} field. */
    @NativeType("struct aiTexel *")
    public AITexel.Buffer pcData() { return npcData(address()); }
    /** @return a {@link AIString} view of the {@code mFilename} field. */
    @NativeType("struct aiString")
    public AIString mFilename() { return nmFilename(address()); }

    // -----------------------------------

    /** Returns a new {@code AITexture} instance for the specified memory address. */
    public static AITexture create(long address) {
        return new AITexture(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AITexture createSafe(long address) {
        return address == NULL ? null : new AITexture(address, null);
    }

    /**
     * Create a {@link AITexture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AITexture.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AITexture.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mWidth}. */
    public static int nmWidth(long struct) { return memGetInt(struct + AITexture.MWIDTH); }
    /** Unsafe version of {@link #mHeight}. */
    public static int nmHeight(long struct) { return memGetInt(struct + AITexture.MHEIGHT); }
    /** Unsafe version of {@link #achFormatHint}. */
    public static ByteBuffer nachFormatHint(long struct) { return memByteBuffer(struct + AITexture.ACHFORMATHINT, 9); }
    /** Unsafe version of {@link #achFormatHintString}. */
    public static String nachFormatHintString(long struct) { return memASCII(struct + AITexture.ACHFORMATHINT); }
    /** Unsafe version of {@link #pcData}. */
    public static AITexel.Buffer npcData(long struct) { return AITexel.create(memGetAddress(struct + AITexture.PCDATA), nmWidth(struct) * nmHeight(struct)); }
    /** Unsafe version of {@link #mFilename}. */
    public static AIString nmFilename(long struct) { return AIString.create(struct + AITexture.MFILENAME); }

    /** Returns a {@code char *} view of the array pointed to by the {@code pcData} field. */
    @NativeType("char *")
    public ByteBuffer pcDataCompressed() { return npcDataCompressed(address()); }

    /** Unsafe version of {@link #pcDataCompressed}. */
    public static ByteBuffer npcDataCompressed(long struct) { return memByteBuffer(memGetAddress(struct + AITexture.PCDATA), nmWidth(struct)); }

    // -----------------------------------

    /** An array of {@link AITexture} structs. */
    public static class Buffer extends StructBuffer<AITexture, Buffer> {

        private static final AITexture ELEMENT_FACTORY = AITexture.create(-1L);

        /**
         * Creates a new {@code AITexture.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AITexture#SIZEOF}, and its mark will be undefined.</p>
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
        protected AITexture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mWidth} field. */
        @NativeType("unsigned int")
        public int mWidth() { return AITexture.nmWidth(address()); }
        /** @return the value of the {@code mHeight} field. */
        @NativeType("unsigned int")
        public int mHeight() { return AITexture.nmHeight(address()); }
        /** @return a {@link ByteBuffer} view of the {@code achFormatHint} field. */
        @NativeType("char[9]")
        public ByteBuffer achFormatHint() { return AITexture.nachFormatHint(address()); }
        /** @return the null-terminated string stored in the {@code achFormatHint} field. */
        @NativeType("char[9]")
        public String achFormatHintString() { return AITexture.nachFormatHintString(address()); }
        /** @return a {@link AITexel.Buffer} view of the struct array pointed to by the {@code pcData} field. */
        @NativeType("struct aiTexel *")
        public AITexel.Buffer pcData() { return AITexture.npcData(address()); }
        /** @return a {@link AIString} view of the {@code mFilename} field. */
        @NativeType("struct aiString")
        public AIString mFilename() { return AITexture.nmFilename(address()); }

        /** Returns a {@code char *} view of the array pointed to by the {@code pcData} field. */
        @NativeType("char *")
        public ByteBuffer pcDataCompressed() { return npcDataCompressed(address()); }

    }

}