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
 *     {@link PFNKTEXDESTROYI PFNKTEXDESTROY} Destroy;
 *     {@link PFNKTEXGETIMAGEOFFSETI PFNKTEXGETIMAGEOFFSET} GetImageOffset;
 *     {@link PFNKTEXGETDATASIZEUNCOMPRESSEDI PFNKTEXGETDATASIZEUNCOMPRESSED} GetDataSizeUncompressed;
 *     {@link PFNKTEXGETIMAGESIZEI PFNKTEXGETIMAGESIZE} GetImageSize;
 *     {@link PFNKTEXITERATELEVELSI PFNKTEXITERATELEVELS} IterateLevels;
 *     {@link PFNKTEXITERATELOADLEVELFACESI PFNKTEXITERATELOADLEVELFACES} IterateLoadLevelFaces;
 *     {@link PFNKTEXNEEDSTRANSCODINGI PFNKTEXNEEDSTRANSCODING} NeedsTranscoding;
 *     {@link PFNKTEXLOADIMAGEDATAI PFNKTEXLOADIMAGEDATA} LoadImageData;
 *     {@link PFNKTEXSETIMAGEFROMMEMORYI PFNKTEXSETIMAGEFROMMEMORY} SetImageFromMemory;
 *     PFNKTEXSETIMAGEFROMSTDIOSTREAM * SetImageFromStdioStream;
 *     PFNKTEXWRITETOSTDIOSTREAM * WriteToStdioStream;
 *     {@link PFNKTEXWRITETONAMEDFILEI PFNKTEXWRITETONAMEDFILE} WriteToNamedFile;
 *     {@link PFNKTEXWRITETOMEMORYI PFNKTEXWRITETOMEMORY} WriteToMemory;
 *     {@link PFNKTEXWRITETOSTREAMI PFNKTEXWRITETOSTREAM} WriteToStream;
 * }</code></pre>
 */
@NativeType("struct ktxTexture_vtbl")
public class ktxTexture_vtbl extends Struct {

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
    public PFNKTEXDESTROY Destroy() { return nDestroy(address()); }
    /** @return the value of the {@code GetImageOffset} field. */
    public PFNKTEXGETIMAGEOFFSET GetImageOffset() { return nGetImageOffset(address()); }
    /** @return the value of the {@code GetDataSizeUncompressed} field. */
    public PFNKTEXGETDATASIZEUNCOMPRESSED GetDataSizeUncompressed() { return nGetDataSizeUncompressed(address()); }
    /** @return the value of the {@code GetImageSize} field. */
    public PFNKTEXGETIMAGESIZE GetImageSize() { return nGetImageSize(address()); }
    /** @return the value of the {@code IterateLevels} field. */
    public PFNKTEXITERATELEVELS IterateLevels() { return nIterateLevels(address()); }
    /** @return the value of the {@code IterateLoadLevelFaces} field. */
    public PFNKTEXITERATELOADLEVELFACES IterateLoadLevelFaces() { return nIterateLoadLevelFaces(address()); }
    /** @return the value of the {@code NeedsTranscoding} field. */
    public PFNKTEXNEEDSTRANSCODING NeedsTranscoding() { return nNeedsTranscoding(address()); }
    /** @return the value of the {@code LoadImageData} field. */
    public PFNKTEXLOADIMAGEDATA LoadImageData() { return nLoadImageData(address()); }
    /** @return the value of the {@code SetImageFromMemory} field. */
    public PFNKTEXSETIMAGEFROMMEMORY SetImageFromMemory() { return nSetImageFromMemory(address()); }
    /** @return the value of the {@code SetImageFromStdioStream} field. */
    @NativeType("PFNKTEXSETIMAGEFROMSTDIOSTREAM *")
    public long SetImageFromStdioStream() { return nSetImageFromStdioStream(address()); }
    /** @return the value of the {@code WriteToStdioStream} field. */
    @NativeType("PFNKTEXWRITETOSTDIOSTREAM *")
    public long WriteToStdioStream() { return nWriteToStdioStream(address()); }
    /** @return the value of the {@code WriteToNamedFile} field. */
    public PFNKTEXWRITETONAMEDFILE WriteToNamedFile() { return nWriteToNamedFile(address()); }
    /** @return the value of the {@code WriteToMemory} field. */
    public PFNKTEXWRITETOMEMORY WriteToMemory() { return nWriteToMemory(address()); }
    /** @return the value of the {@code WriteToStream} field. */
    public PFNKTEXWRITETOSTREAM WriteToStream() { return nWriteToStream(address()); }

    // -----------------------------------

    /** Returns a new {@code ktxTexture_vtbl} instance for the specified memory address. */
    public static ktxTexture_vtbl create(long address) {
        return wrap(ktxTexture_vtbl.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture_vtbl createSafe(long address) {
        return address == NULL ? null : wrap(ktxTexture_vtbl.class, address);
    }

    /**
     * Create a {@link ktxTexture_vtbl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxTexture_vtbl.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture_vtbl.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Destroy}. */
    public static PFNKTEXDESTROY nDestroy(long struct) { return PFNKTEXDESTROY.create(memGetAddress(struct + ktxTexture_vtbl.DESTROY)); }
    /** Unsafe version of {@link #GetImageOffset}. */
    public static PFNKTEXGETIMAGEOFFSET nGetImageOffset(long struct) { return PFNKTEXGETIMAGEOFFSET.create(memGetAddress(struct + ktxTexture_vtbl.GETIMAGEOFFSET)); }
    /** Unsafe version of {@link #GetDataSizeUncompressed}. */
    public static PFNKTEXGETDATASIZEUNCOMPRESSED nGetDataSizeUncompressed(long struct) { return PFNKTEXGETDATASIZEUNCOMPRESSED.create(memGetAddress(struct + ktxTexture_vtbl.GETDATASIZEUNCOMPRESSED)); }
    /** Unsafe version of {@link #GetImageSize}. */
    public static PFNKTEXGETIMAGESIZE nGetImageSize(long struct) { return PFNKTEXGETIMAGESIZE.create(memGetAddress(struct + ktxTexture_vtbl.GETIMAGESIZE)); }
    /** Unsafe version of {@link #IterateLevels}. */
    public static PFNKTEXITERATELEVELS nIterateLevels(long struct) { return PFNKTEXITERATELEVELS.create(memGetAddress(struct + ktxTexture_vtbl.ITERATELEVELS)); }
    /** Unsafe version of {@link #IterateLoadLevelFaces}. */
    public static PFNKTEXITERATELOADLEVELFACES nIterateLoadLevelFaces(long struct) { return PFNKTEXITERATELOADLEVELFACES.create(memGetAddress(struct + ktxTexture_vtbl.ITERATELOADLEVELFACES)); }
    /** Unsafe version of {@link #NeedsTranscoding}. */
    public static PFNKTEXNEEDSTRANSCODING nNeedsTranscoding(long struct) { return PFNKTEXNEEDSTRANSCODING.create(memGetAddress(struct + ktxTexture_vtbl.NEEDSTRANSCODING)); }
    /** Unsafe version of {@link #LoadImageData}. */
    public static PFNKTEXLOADIMAGEDATA nLoadImageData(long struct) { return PFNKTEXLOADIMAGEDATA.create(memGetAddress(struct + ktxTexture_vtbl.LOADIMAGEDATA)); }
    /** Unsafe version of {@link #SetImageFromMemory}. */
    public static PFNKTEXSETIMAGEFROMMEMORY nSetImageFromMemory(long struct) { return PFNKTEXSETIMAGEFROMMEMORY.create(memGetAddress(struct + ktxTexture_vtbl.SETIMAGEFROMMEMORY)); }
    /** Unsafe version of {@link #SetImageFromStdioStream}. */
    public static long nSetImageFromStdioStream(long struct) { return memGetAddress(struct + ktxTexture_vtbl.SETIMAGEFROMSTDIOSTREAM); }
    /** Unsafe version of {@link #WriteToStdioStream}. */
    public static long nWriteToStdioStream(long struct) { return memGetAddress(struct + ktxTexture_vtbl.WRITETOSTDIOSTREAM); }
    /** Unsafe version of {@link #WriteToNamedFile}. */
    public static PFNKTEXWRITETONAMEDFILE nWriteToNamedFile(long struct) { return PFNKTEXWRITETONAMEDFILE.create(memGetAddress(struct + ktxTexture_vtbl.WRITETONAMEDFILE)); }
    /** Unsafe version of {@link #WriteToMemory}. */
    public static PFNKTEXWRITETOMEMORY nWriteToMemory(long struct) { return PFNKTEXWRITETOMEMORY.create(memGetAddress(struct + ktxTexture_vtbl.WRITETOMEMORY)); }
    /** Unsafe version of {@link #WriteToStream}. */
    public static PFNKTEXWRITETOSTREAM nWriteToStream(long struct) { return PFNKTEXWRITETOSTREAM.create(memGetAddress(struct + ktxTexture_vtbl.WRITETOSTREAM)); }

    // -----------------------------------

    /** An array of {@link ktxTexture_vtbl} structs. */
    public static class Buffer extends StructBuffer<ktxTexture_vtbl, Buffer> {

        private static final ktxTexture_vtbl ELEMENT_FACTORY = ktxTexture_vtbl.create(-1L);

        /**
         * Creates a new {@code ktxTexture_vtbl.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxTexture_vtbl#SIZEOF}, and its mark will be undefined.
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
        public PFNKTEXDESTROY Destroy() { return ktxTexture_vtbl.nDestroy(address()); }
        /** @return the value of the {@code GetImageOffset} field. */
        public PFNKTEXGETIMAGEOFFSET GetImageOffset() { return ktxTexture_vtbl.nGetImageOffset(address()); }
        /** @return the value of the {@code GetDataSizeUncompressed} field. */
        public PFNKTEXGETDATASIZEUNCOMPRESSED GetDataSizeUncompressed() { return ktxTexture_vtbl.nGetDataSizeUncompressed(address()); }
        /** @return the value of the {@code GetImageSize} field. */
        public PFNKTEXGETIMAGESIZE GetImageSize() { return ktxTexture_vtbl.nGetImageSize(address()); }
        /** @return the value of the {@code IterateLevels} field. */
        public PFNKTEXITERATELEVELS IterateLevels() { return ktxTexture_vtbl.nIterateLevels(address()); }
        /** @return the value of the {@code IterateLoadLevelFaces} field. */
        public PFNKTEXITERATELOADLEVELFACES IterateLoadLevelFaces() { return ktxTexture_vtbl.nIterateLoadLevelFaces(address()); }
        /** @return the value of the {@code NeedsTranscoding} field. */
        public PFNKTEXNEEDSTRANSCODING NeedsTranscoding() { return ktxTexture_vtbl.nNeedsTranscoding(address()); }
        /** @return the value of the {@code LoadImageData} field. */
        public PFNKTEXLOADIMAGEDATA LoadImageData() { return ktxTexture_vtbl.nLoadImageData(address()); }
        /** @return the value of the {@code SetImageFromMemory} field. */
        public PFNKTEXSETIMAGEFROMMEMORY SetImageFromMemory() { return ktxTexture_vtbl.nSetImageFromMemory(address()); }
        /** @return the value of the {@code SetImageFromStdioStream} field. */
        @NativeType("PFNKTEXSETIMAGEFROMSTDIOSTREAM *")
        public long SetImageFromStdioStream() { return ktxTexture_vtbl.nSetImageFromStdioStream(address()); }
        /** @return the value of the {@code WriteToStdioStream} field. */
        @NativeType("PFNKTEXWRITETOSTDIOSTREAM *")
        public long WriteToStdioStream() { return ktxTexture_vtbl.nWriteToStdioStream(address()); }
        /** @return the value of the {@code WriteToNamedFile} field. */
        public PFNKTEXWRITETONAMEDFILE WriteToNamedFile() { return ktxTexture_vtbl.nWriteToNamedFile(address()); }
        /** @return the value of the {@code WriteToMemory} field. */
        public PFNKTEXWRITETOMEMORY WriteToMemory() { return ktxTexture_vtbl.nWriteToMemory(address()); }
        /** @return the value of the {@code WriteToStream} field. */
        public PFNKTEXWRITETOSTREAM WriteToStream() { return ktxTexture_vtbl.nWriteToStream(address()); }

    }

}