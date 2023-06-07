/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Table of virtual {@code ktxTexture} methods.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxTexture_vtbl {
 *     PFNKTEXDESTROY Destroy;
 *     PFNKTEXGETIMAGEOFFSET GetImageOffset;
 *     PFNKTEXGETDATASIZEUNCOMPRESSED GetDataSizeUncompressed;
 *     PFNKTEXGETIMAGESIZE GetImageSize;
 *     PFNKTEXITERATELEVELS IterateLevels;
 *     PFNKTEXITERATELOADLEVELFACES IterateLoadLevelFaces;
 *     PFNKTEXNEEDSTRANSCODING NeedsTranscoding;
 *     PFNKTEXLOADIMAGEDATA LoadImageData;
 *     PFNKTEXSETIMAGEFROMMEMORY SetImageFromMemory;
 *     PFNKTEXSETIMAGEFROMSTDIOSTREAM SetImageFromStdioStream;
 *     PFNKTEXWRITETOSTDIOSTREAM WriteToStdioStream;
 *     PFNKTEXWRITETONAMEDFILE WriteToNamedFile;
 *     PFNKTEXWRITETOMEMORY WriteToMemory;
 *     PFNKTEXWRITETOSTREAM WriteToStream;
 * }</code></pre>
 */
@NativeType("struct ktxTexture_vtbl")
public class ktxTexture_vtbl extends Struct<ktxTexture_vtbl> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DESTROY,
        GETIMAGEOFFSET,
        GETDATASIZEUNCOMPRESSED,
        GETIMAGESIZE,
        ITERATELEVELS,
        ITERATELOADLEVELFACES,
        NEEDSTRANSCODING,
        LOADIMAGEDATA,
        SETIMAGEFROMMEMORY,
        SETIMAGEFROMSTDIOSTREAM,
        WRITETOSTDIOSTREAM,
        WRITETONAMEDFILE,
        WRITETOMEMORY,
        WRITETOSTREAM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DESTROY = layout.offsetof(0);
        GETIMAGEOFFSET = layout.offsetof(1);
        GETDATASIZEUNCOMPRESSED = layout.offsetof(2);
        GETIMAGESIZE = layout.offsetof(3);
        ITERATELEVELS = layout.offsetof(4);
        ITERATELOADLEVELFACES = layout.offsetof(5);
        NEEDSTRANSCODING = layout.offsetof(6);
        LOADIMAGEDATA = layout.offsetof(7);
        SETIMAGEFROMMEMORY = layout.offsetof(8);
        SETIMAGEFROMSTDIOSTREAM = layout.offsetof(9);
        WRITETOSTDIOSTREAM = layout.offsetof(10);
        WRITETONAMEDFILE = layout.offsetof(11);
        WRITETOMEMORY = layout.offsetof(12);
        WRITETOSTREAM = layout.offsetof(13);
    }

    protected ktxTexture_vtbl(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxTexture_vtbl create(long address, @Nullable ByteBuffer container) {
        return new ktxTexture_vtbl(address, container);
    }

    /**
     * Creates a {@code ktxTexture_vtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxTexture_vtbl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Destroy} field. */
    @NativeType("PFNKTEXDESTROY")
    public long Destroy() { return nDestroy(address()); }
    /** @return the value of the {@code GetImageOffset} field. */
    @NativeType("PFNKTEXGETIMAGEOFFSET")
    public long GetImageOffset() { return nGetImageOffset(address()); }
    /** @return the value of the {@code GetDataSizeUncompressed} field. */
    @NativeType("PFNKTEXGETDATASIZEUNCOMPRESSED")
    public long GetDataSizeUncompressed() { return nGetDataSizeUncompressed(address()); }
    /** @return the value of the {@code GetImageSize} field. */
    @NativeType("PFNKTEXGETIMAGESIZE")
    public long GetImageSize() { return nGetImageSize(address()); }
    /** @return the value of the {@code IterateLevels} field. */
    @NativeType("PFNKTEXITERATELEVELS")
    public long IterateLevels() { return nIterateLevels(address()); }
    /** @return the value of the {@code IterateLoadLevelFaces} field. */
    @NativeType("PFNKTEXITERATELOADLEVELFACES")
    public long IterateLoadLevelFaces() { return nIterateLoadLevelFaces(address()); }
    /** @return the value of the {@code NeedsTranscoding} field. */
    @NativeType("PFNKTEXNEEDSTRANSCODING")
    public long NeedsTranscoding() { return nNeedsTranscoding(address()); }
    /** @return the value of the {@code LoadImageData} field. */
    @NativeType("PFNKTEXLOADIMAGEDATA")
    public long LoadImageData() { return nLoadImageData(address()); }
    /** @return the value of the {@code SetImageFromMemory} field. */
    @NativeType("PFNKTEXSETIMAGEFROMMEMORY")
    public long SetImageFromMemory() { return nSetImageFromMemory(address()); }
    /** @return the value of the {@code SetImageFromStdioStream} field. */
    @NativeType("PFNKTEXSETIMAGEFROMSTDIOSTREAM")
    public long SetImageFromStdioStream() { return nSetImageFromStdioStream(address()); }
    /** @return the value of the {@code WriteToStdioStream} field. */
    @NativeType("PFNKTEXWRITETOSTDIOSTREAM")
    public long WriteToStdioStream() { return nWriteToStdioStream(address()); }
    /** @return the value of the {@code WriteToNamedFile} field. */
    @NativeType("PFNKTEXWRITETONAMEDFILE")
    public long WriteToNamedFile() { return nWriteToNamedFile(address()); }
    /** @return the value of the {@code WriteToMemory} field. */
    @NativeType("PFNKTEXWRITETOMEMORY")
    public long WriteToMemory() { return nWriteToMemory(address()); }
    /** @return the value of the {@code WriteToStream} field. */
    @NativeType("PFNKTEXWRITETOSTREAM")
    public long WriteToStream() { return nWriteToStream(address()); }

    // -----------------------------------

    /** Returns a new {@code ktxTexture_vtbl} instance for the specified memory address. */
    public static ktxTexture_vtbl create(long address) {
        return new ktxTexture_vtbl(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture_vtbl createSafe(long address) {
        return address == NULL ? null : new ktxTexture_vtbl(address, null);
    }

    /**
     * Create a {@link ktxTexture_vtbl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxTexture_vtbl.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture_vtbl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Destroy}. */
    public static long nDestroy(long struct) { return memGetAddress(struct + ktxTexture_vtbl.DESTROY); }
    /** Unsafe version of {@link #GetImageOffset}. */
    public static long nGetImageOffset(long struct) { return memGetAddress(struct + ktxTexture_vtbl.GETIMAGEOFFSET); }
    /** Unsafe version of {@link #GetDataSizeUncompressed}. */
    public static long nGetDataSizeUncompressed(long struct) { return memGetAddress(struct + ktxTexture_vtbl.GETDATASIZEUNCOMPRESSED); }
    /** Unsafe version of {@link #GetImageSize}. */
    public static long nGetImageSize(long struct) { return memGetAddress(struct + ktxTexture_vtbl.GETIMAGESIZE); }
    /** Unsafe version of {@link #IterateLevels}. */
    public static long nIterateLevels(long struct) { return memGetAddress(struct + ktxTexture_vtbl.ITERATELEVELS); }
    /** Unsafe version of {@link #IterateLoadLevelFaces}. */
    public static long nIterateLoadLevelFaces(long struct) { return memGetAddress(struct + ktxTexture_vtbl.ITERATELOADLEVELFACES); }
    /** Unsafe version of {@link #NeedsTranscoding}. */
    public static long nNeedsTranscoding(long struct) { return memGetAddress(struct + ktxTexture_vtbl.NEEDSTRANSCODING); }
    /** Unsafe version of {@link #LoadImageData}. */
    public static long nLoadImageData(long struct) { return memGetAddress(struct + ktxTexture_vtbl.LOADIMAGEDATA); }
    /** Unsafe version of {@link #SetImageFromMemory}. */
    public static long nSetImageFromMemory(long struct) { return memGetAddress(struct + ktxTexture_vtbl.SETIMAGEFROMMEMORY); }
    /** Unsafe version of {@link #SetImageFromStdioStream}. */
    public static long nSetImageFromStdioStream(long struct) { return memGetAddress(struct + ktxTexture_vtbl.SETIMAGEFROMSTDIOSTREAM); }
    /** Unsafe version of {@link #WriteToStdioStream}. */
    public static long nWriteToStdioStream(long struct) { return memGetAddress(struct + ktxTexture_vtbl.WRITETOSTDIOSTREAM); }
    /** Unsafe version of {@link #WriteToNamedFile}. */
    public static long nWriteToNamedFile(long struct) { return memGetAddress(struct + ktxTexture_vtbl.WRITETONAMEDFILE); }
    /** Unsafe version of {@link #WriteToMemory}. */
    public static long nWriteToMemory(long struct) { return memGetAddress(struct + ktxTexture_vtbl.WRITETOMEMORY); }
    /** Unsafe version of {@link #WriteToStream}. */
    public static long nWriteToStream(long struct) { return memGetAddress(struct + ktxTexture_vtbl.WRITETOSTREAM); }

    // -----------------------------------

    /** An array of {@link ktxTexture_vtbl} structs. */
    public static class Buffer extends StructBuffer<ktxTexture_vtbl, Buffer> {

        private static final ktxTexture_vtbl ELEMENT_FACTORY = ktxTexture_vtbl.create(-1L);

        /**
         * Creates a new {@code ktxTexture_vtbl.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxTexture_vtbl#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxTexture_vtbl getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Destroy} field. */
        @NativeType("PFNKTEXDESTROY")
        public long Destroy() { return ktxTexture_vtbl.nDestroy(address()); }
        /** @return the value of the {@code GetImageOffset} field. */
        @NativeType("PFNKTEXGETIMAGEOFFSET")
        public long GetImageOffset() { return ktxTexture_vtbl.nGetImageOffset(address()); }
        /** @return the value of the {@code GetDataSizeUncompressed} field. */
        @NativeType("PFNKTEXGETDATASIZEUNCOMPRESSED")
        public long GetDataSizeUncompressed() { return ktxTexture_vtbl.nGetDataSizeUncompressed(address()); }
        /** @return the value of the {@code GetImageSize} field. */
        @NativeType("PFNKTEXGETIMAGESIZE")
        public long GetImageSize() { return ktxTexture_vtbl.nGetImageSize(address()); }
        /** @return the value of the {@code IterateLevels} field. */
        @NativeType("PFNKTEXITERATELEVELS")
        public long IterateLevels() { return ktxTexture_vtbl.nIterateLevels(address()); }
        /** @return the value of the {@code IterateLoadLevelFaces} field. */
        @NativeType("PFNKTEXITERATELOADLEVELFACES")
        public long IterateLoadLevelFaces() { return ktxTexture_vtbl.nIterateLoadLevelFaces(address()); }
        /** @return the value of the {@code NeedsTranscoding} field. */
        @NativeType("PFNKTEXNEEDSTRANSCODING")
        public long NeedsTranscoding() { return ktxTexture_vtbl.nNeedsTranscoding(address()); }
        /** @return the value of the {@code LoadImageData} field. */
        @NativeType("PFNKTEXLOADIMAGEDATA")
        public long LoadImageData() { return ktxTexture_vtbl.nLoadImageData(address()); }
        /** @return the value of the {@code SetImageFromMemory} field. */
        @NativeType("PFNKTEXSETIMAGEFROMMEMORY")
        public long SetImageFromMemory() { return ktxTexture_vtbl.nSetImageFromMemory(address()); }
        /** @return the value of the {@code SetImageFromStdioStream} field. */
        @NativeType("PFNKTEXSETIMAGEFROMSTDIOSTREAM")
        public long SetImageFromStdioStream() { return ktxTexture_vtbl.nSetImageFromStdioStream(address()); }
        /** @return the value of the {@code WriteToStdioStream} field. */
        @NativeType("PFNKTEXWRITETOSTDIOSTREAM")
        public long WriteToStdioStream() { return ktxTexture_vtbl.nWriteToStdioStream(address()); }
        /** @return the value of the {@code WriteToNamedFile} field. */
        @NativeType("PFNKTEXWRITETONAMEDFILE")
        public long WriteToNamedFile() { return ktxTexture_vtbl.nWriteToNamedFile(address()); }
        /** @return the value of the {@code WriteToMemory} field. */
        @NativeType("PFNKTEXWRITETOMEMORY")
        public long WriteToMemory() { return ktxTexture_vtbl.nWriteToMemory(address()); }
        /** @return the value of the {@code WriteToStream} field. */
        @NativeType("PFNKTEXWRITETOSTREAM")
        public long WriteToStream() { return ktxTexture_vtbl.nWriteToStream(address()); }

    }

}