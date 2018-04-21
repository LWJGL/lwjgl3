/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper structure to describe an embedded texture.
 * 
 * <p>Normally textures are contained in external files but some file formats embed them directly in the model file. There are two types of embedded
 * textures:</p>
 * 
 * <ul>
 * <li>Uncompressed textures. The color data is given in an uncompressed format.</li>
 * <li>Compressed textures stored in a file format like png or jpg.</li>
 * </ul>
 * 
 * <p>The raw file bytes are given so the application must utilize an image decoder (e.g. DevIL) to get access to the actual color data.</p>
 * 
 * <p>Embedded textures are referenced from materials using strings like "*0", "*1", etc. as the texture paths (a single asterisk character followed by the
 * zero-based index of the texture in the {@link AIScene}{@code ::mTextures} array).</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mWidth} &ndash; 
 * Width of the texture, in pixels. If {@code mHeight} is zero the texture is compressed in a format like JPEG. In this case {@code mWidth} specifies the
 * size of the memory area {@code pcData} is pointing to, in bytes.</li>
 * <li>{@code mHeight} &ndash; Height of the texture, in pixels. If this value is zero, {@code pcData} points to an compressed texture in any format (e.g. JPEG).</li>
 * <li>{@code achFormatHint} &ndash; 
 * A hint from the loader to make it easier for applications to determine the type of embedded compressed textures. If {@code mHeight != 0} this member is
 * undefined. Otherwise it is set set to '\0\0\0\0' if the loader has no additional information about the texture file format used OR the file extension
 * of the format without a trailing dot. If there are multiple file extensions for a format, the shortest extension is chosen (JPEG maps to 'jpg', not to
 * 'jpeg'). E.g. 'dds\0', 'pcx\0', 'jpg\0'. All characters are lower-case. The fourth character will always be '\0'.</li>
 * <li>{@code pcData} &ndash; 
 * Data of the texture. Points to an array of {@code mWidth * mHeight} {@link AITexel}'s. The format of the texture data is always ARGB8888 to make the
 * implementation for user of the library as easy as possible. If {@code mHeight = 0} this is a pointer to a memory buffer of size mWidth containing the
 * compressed texture data. Good luck, have fun!</li>
 * <li>{@code mFilename} &ndash; texture original filename. Used to get the texture reference.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct aiTexture {
 *     unsigned int mWidth;
 *     unsigned int mHeight;
 *     char achFormatHint[4];
 *     {@link AITexel struct aiTexel} * pcData;
 *     {@link AIString struct aiString} mFilename;
 * }</pre></code>
 */
@NativeType("struct aiTexture")
public class AITexture extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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
            __array(1, 4),
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

    AITexture(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link AITexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AITexture(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mWidth} field. */
    @NativeType("unsigned int")
    public int mWidth() { return nmWidth(address()); }
    /** Returns the value of the {@code mHeight} field. */
    @NativeType("unsigned int")
    public int mHeight() { return nmHeight(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code achFormatHint} field. */
    @NativeType("char[4]")
    public ByteBuffer achFormatHint() { return nachFormatHint(address()); }
    /** Decodes the null-terminated string stored in the {@code achFormatHint} field. */
    @NativeType("char[4]")
    public String achFormatHintString() { return nachFormatHintString(address()); }
    /**
     * Returns a {@link AITexel.Buffer} view of the struct array pointed to by the {@code pcData} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("struct aiTexel *")
    public AITexel.Buffer pcData(int capacity) { return npcData(address(), capacity); }
    /** Returns a {@link AIString} view of the {@code mFilename} field. */
    @NativeType("struct aiString")
    public AIString mFilename() { return nmFilename(address()); }

    // -----------------------------------

    /** Returns a new {@link AITexture} instance for the specified memory address. */
    public static AITexture create(long address) {
        return new AITexture(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AITexture createSafe(long address) {
        return address == NULL ? null : create(address);
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
    @Nullable
    public static AITexture.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mWidth}. */
    public static int nmWidth(long struct) { return memGetInt(struct + AITexture.MWIDTH); }
    /** Unsafe version of {@link #mHeight}. */
    public static int nmHeight(long struct) { return memGetInt(struct + AITexture.MHEIGHT); }
    /** Unsafe version of {@link #achFormatHint}. */
    public static ByteBuffer nachFormatHint(long struct) { return memByteBuffer(struct + AITexture.ACHFORMATHINT, 4); }
    /** Unsafe version of {@link #achFormatHintString}. */
    public static String nachFormatHintString(long struct) { return memASCII(struct + AITexture.ACHFORMATHINT); }
    /** Unsafe version of {@link #pcData}. */
    public static AITexel.Buffer npcData(long struct, int capacity) { return AITexel.create(memGetAddress(struct + AITexture.PCDATA), capacity); }
    /** Unsafe version of {@link #mFilename}. */
    public static AIString nmFilename(long struct) { return AIString.create(struct + AITexture.MFILENAME); }

    // -----------------------------------

    /** An array of {@link AITexture} structs. */
    public static class Buffer extends StructBuffer<AITexture, Buffer> {

        /**
         * Creates a new {@link AITexture.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AITexture#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected AITexture newInstance(long address) {
            return new AITexture(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mWidth} field. */
        @NativeType("unsigned int")
        public int mWidth() { return AITexture.nmWidth(address()); }
        /** Returns the value of the {@code mHeight} field. */
        @NativeType("unsigned int")
        public int mHeight() { return AITexture.nmHeight(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code achFormatHint} field. */
        @NativeType("char[4]")
        public ByteBuffer achFormatHint() { return AITexture.nachFormatHint(address()); }
        /** Decodes the null-terminated string stored in the {@code achFormatHint} field. */
        @NativeType("char[4]")
        public String achFormatHintString() { return AITexture.nachFormatHintString(address()); }
        /**
         * Returns a {@link AITexel.Buffer} view of the struct array pointed to by the {@code pcData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("struct aiTexel *")
        public AITexel.Buffer pcData(int capacity) { return AITexture.npcData(address(), capacity); }
        /** Returns a {@link AIString} view of the {@code mFilename} field. */
        @NativeType("struct aiString")
        public AIString mFilename() { return AITexture.nmFilename(address()); }

    }

}