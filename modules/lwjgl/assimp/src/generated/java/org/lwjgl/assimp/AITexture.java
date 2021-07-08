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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiTexture {
 *     unsigned int {@link #mWidth};
 *     unsigned int {@link #mHeight};
 *     char {@link #achFormatHint}[9];
 *     {@link AITexel struct aiTexel} * {@link #pcData};
 *     {@link AIString struct aiString} {@link #mFilename};
 * }</code></pre>
 */
@NativeType("struct aiTexture")
public class AITexture extends Struct {

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

    /**
     * Width of the texture, in pixels. If {@code mHeight} is zero the texture is compressed in a format like JPEG. In this case {@code mWidth} specifies the
     * size of the memory area {@code pcData} is pointing to, in bytes.
     */
    @NativeType("unsigned int")
    public int mWidth() { return nmWidth(address()); }
    /** Height of the texture, in pixels. If this value is zero, {@code pcData} points to an compressed texture in any format (e.g. JPEG). */
    @NativeType("unsigned int")
    public int mHeight() { return nmHeight(address()); }
    /**
     * A hint from the loader to make it easier for applications to determine the type of embedded textures.
     * 
     * <p>If {@code mHeight != 0} this member is show how data is packed. Hint will consist of two parts: channel order and channel bitness (count of the bits
     * for every color channel). For simple parsing by the viewer it's better to not omit absent color channel and just use 0 for bitness. For example:</p>
     * 
     * <ol>
     * <li>Image contain RGBA and 8 bit per channel, {@code achFormatHint == "rgba8888";}</li>
     * <li>Image contain ARGB and 8 bit per channel, {@code achFormatHint == "argb8888";}</li>
     * <li>Image contain RGB and 5 bit for R and B channels and 6 bit for G channel, {@code achFormatHint == "rgba5650";}</li>
     * <li>One color image with B channel and 1 bit for it, {@code achFormatHint == "rgba0010";}</li>
     * </ol>
     * 
     * <p>If {@code mHeight == 0} then {@code achFormatHint} is set set to '\0\0\0\0' if the loader has no additional information about the texture file format
     * used OR the file extension of the format without a trailing dot. If there are multiple file extensions for a format, the shortest extension is chosen
     * (JPEG maps to 'jpg', not to 'jpeg'). E.g. 'dds\0', 'pcx\0', 'jpg\0'. All characters are lower-case. The fourth character will always be '\0'.</p>
     */
    @NativeType("char[9]")
    public ByteBuffer achFormatHint() { return nachFormatHint(address()); }
    /**
     * A hint from the loader to make it easier for applications to determine the type of embedded textures.
     * 
     * <p>If {@code mHeight != 0} this member is show how data is packed. Hint will consist of two parts: channel order and channel bitness (count of the bits
     * for every color channel). For simple parsing by the viewer it's better to not omit absent color channel and just use 0 for bitness. For example:</p>
     * 
     * <ol>
     * <li>Image contain RGBA and 8 bit per channel, {@code achFormatHint == "rgba8888";}</li>
     * <li>Image contain ARGB and 8 bit per channel, {@code achFormatHint == "argb8888";}</li>
     * <li>Image contain RGB and 5 bit for R and B channels and 6 bit for G channel, {@code achFormatHint == "rgba5650";}</li>
     * <li>One color image with B channel and 1 bit for it, {@code achFormatHint == "rgba0010";}</li>
     * </ol>
     * 
     * <p>If {@code mHeight == 0} then {@code achFormatHint} is set set to '\0\0\0\0' if the loader has no additional information about the texture file format
     * used OR the file extension of the format without a trailing dot. If there are multiple file extensions for a format, the shortest extension is chosen
     * (JPEG maps to 'jpg', not to 'jpeg'). E.g. 'dds\0', 'pcx\0', 'jpg\0'. All characters are lower-case. The fourth character will always be '\0'.</p>
     */
    @NativeType("char[9]")
    public String achFormatHintString() { return nachFormatHintString(address()); }
    /**
     * Data of the texture.
     * 
     * <p>Points to an array of {@code mWidth * mHeight} {@link AITexel}'s. The format of the texture data is always ARGB8888 to make the implementation for user of
     * the library as easy as possible. If {@code mHeight = 0} this is a pointer to a memory buffer of size {@code mWidth} containing the compressed texture
     * data. Good luck, have fun!</p>
     */
    @NativeType("struct aiTexel *")
    public AITexel.Buffer pcData() { return npcData(address()); }
    /** texture original filename. Used to get the texture reference. */
    @NativeType("struct aiString")
    public AIString mFilename() { return nmFilename(address()); }

    // -----------------------------------

    /** Returns a new {@code AITexture} instance for the specified memory address. */
    public static AITexture create(long address) {
        return wrap(AITexture.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AITexture createSafe(long address) {
        return address == NULL ? null : wrap(AITexture.class, address);
    }

    /**
     * Create a {@link AITexture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AITexture.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AITexture.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mWidth}. */
    public static int nmWidth(long struct) { return UNSAFE.getInt(null, struct + AITexture.MWIDTH); }
    /** Unsafe version of {@link #mHeight}. */
    public static int nmHeight(long struct) { return UNSAFE.getInt(null, struct + AITexture.MHEIGHT); }
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
        protected AITexture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AITexture#mWidth} field. */
        @NativeType("unsigned int")
        public int mWidth() { return AITexture.nmWidth(address()); }
        /** @return the value of the {@link AITexture#mHeight} field. */
        @NativeType("unsigned int")
        public int mHeight() { return AITexture.nmHeight(address()); }
        /** @return a {@link ByteBuffer} view of the {@link AITexture#achFormatHint} field. */
        @NativeType("char[9]")
        public ByteBuffer achFormatHint() { return AITexture.nachFormatHint(address()); }
        /** @return the null-terminated string stored in the {@link AITexture#achFormatHint} field. */
        @NativeType("char[9]")
        public String achFormatHintString() { return AITexture.nachFormatHintString(address()); }
        /** @return a {@link AITexel.Buffer} view of the struct array pointed to by the {@link AITexture#pcData} field. */
        @NativeType("struct aiTexel *")
        public AITexel.Buffer pcData() { return AITexture.npcData(address()); }
        /** @return a {@link AIString} view of the {@link AITexture#mFilename} field. */
        @NativeType("struct aiString")
        public AIString mFilename() { return AITexture.nmFilename(address()); }

        /** Returns a {@code char *} view of the array pointed to by the {@code pcData} field. */
        @NativeType("char *")
        public ByteBuffer pcDataCompressed() { return npcDataCompressed(address()); }

    }

}