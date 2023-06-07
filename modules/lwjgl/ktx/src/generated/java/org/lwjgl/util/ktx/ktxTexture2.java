/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Class representing a KTX version 2 format texture.
 * 
 * <p>{@code ktxTextures} should be created only by one of the {@code ktxTexture_Create*} functions and these fields should be considered read-only.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxTexture2 {
 *     class_id {@link #classId};
 *     {@link ktxTexture_vtbl struct ktxTexture_vtbl} * {@link #vtbl};
 *     struct ktxTexture_vvtbl * {@link #vvtbl};
 *     struct ktxTexture_protected * {@link #_protected};
 *     ktx_bool_t {@link #isArray};
 *     ktx_bool_t {@link #isCubemap};
 *     ktx_bool_t {@link #isCompressed};
 *     ktx_bool_t {@link #generateMipmaps};
 *     ktx_uint32_t {@link #baseWidth};
 *     ktx_uint32_t {@link #baseHeight};
 *     ktx_uint32_t {@link #baseDepth};
 *     ktx_uint32_t {@link #numDimensions};
 *     ktx_uint32_t {@link #numLevels};
 *     ktx_uint32_t {@link #numLayers};
 *     ktx_uint32_t {@link #numFaces};
 *     {@link ktxOrientation struct ktxOrientation} {@link #orientation};
 *     ktxHashList {@link #kvDataHead};
 *     ktx_uint32_t {@link #kvDataLen};
 *     ktx_uint8_t * {@link #kvData};
 *     ktx_size_t {@link #dataSize};
 *     ktx_uint8_t * {@link #pData};
 *     ktx_uint32_t vkFormat;
 *     ktx_uint32_t * pDfd;
 *     ktxSupercmpScheme supercompressionScheme;
 *     ktx_bool_t isVideo;
 *     ktx_uint32_t duration;
 *     ktx_uint32_t timescale;
 *     ktx_uint32_t loopcount;
 *     struct ktxTexture2_private * _private;
 * }</code></pre>
 */
public class ktxTexture2 extends Struct<ktxTexture2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLASSID,
        VTBL,
        VVTBL,
        _PROTECTED,
        ISARRAY,
        ISCUBEMAP,
        ISCOMPRESSED,
        GENERATEMIPMAPS,
        BASEWIDTH,
        BASEHEIGHT,
        BASEDEPTH,
        NUMDIMENSIONS,
        NUMLEVELS,
        NUMLAYERS,
        NUMFACES,
        ORIENTATION,
        KVDATAHEAD,
        KVDATALEN,
        KVDATA,
        DATASIZE,
        PDATA,
        VKFORMAT,
        PDFD,
        SUPERCOMPRESSIONSCHEME,
        ISVIDEO,
        DURATION,
        TIMESCALE,
        LOOPCOUNT,
        _PRIVATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(ktxOrientation.SIZEOF, ktxOrientation.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLASSID = layout.offsetof(0);
        VTBL = layout.offsetof(1);
        VVTBL = layout.offsetof(2);
        _PROTECTED = layout.offsetof(3);
        ISARRAY = layout.offsetof(4);
        ISCUBEMAP = layout.offsetof(5);
        ISCOMPRESSED = layout.offsetof(6);
        GENERATEMIPMAPS = layout.offsetof(7);
        BASEWIDTH = layout.offsetof(8);
        BASEHEIGHT = layout.offsetof(9);
        BASEDEPTH = layout.offsetof(10);
        NUMDIMENSIONS = layout.offsetof(11);
        NUMLEVELS = layout.offsetof(12);
        NUMLAYERS = layout.offsetof(13);
        NUMFACES = layout.offsetof(14);
        ORIENTATION = layout.offsetof(15);
        KVDATAHEAD = layout.offsetof(16);
        KVDATALEN = layout.offsetof(17);
        KVDATA = layout.offsetof(18);
        DATASIZE = layout.offsetof(19);
        PDATA = layout.offsetof(20);
        VKFORMAT = layout.offsetof(21);
        PDFD = layout.offsetof(22);
        SUPERCOMPRESSIONSCHEME = layout.offsetof(23);
        ISVIDEO = layout.offsetof(24);
        DURATION = layout.offsetof(25);
        TIMESCALE = layout.offsetof(26);
        LOOPCOUNT = layout.offsetof(27);
        _PRIVATE = layout.offsetof(28);
    }

    protected ktxTexture2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxTexture2 create(long address, @Nullable ByteBuffer container) {
        return new ktxTexture2(address, container);
    }

    /**
     * Creates a {@code ktxTexture2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxTexture2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** must be:<br><table><tr><td>{@link KTX#ktxTexture2_c}</td></tr></table> */
    @NativeType("class_id")
    public int classId() { return nclassId(address()); }
    /** pointer to the class's vtble */
    @NativeType("struct ktxTexture_vtbl *")
    public ktxTexture_vtbl vtbl() { return nvtbl(address()); }
    /** pointer to the class's vtble for Vulkan functions */
    @NativeType("struct ktxTexture_vvtbl *")
    public long vvtbl() { return nvvtbl(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return opaque pointer to the class's protected variables
     */
    @NativeType("struct ktxTexture_protected *")
    public PointerBuffer _protected(int capacity) { return n_protected(address(), capacity); }
    /** {@link KTX#KTX_TRUE TRUE} if the texture is an array texture, i.e, a {@code GL_TEXTURE*_ARRAY} target is to be used */
    @NativeType("ktx_bool_t")
    public boolean isArray() { return nisArray(address()); }
    /** {@link KTX#KTX_TRUE TRUE} if the texture is a cubemap or cubemap array */
    @NativeType("ktx_bool_t")
    public boolean isCubemap() { return nisCubemap(address()); }
    /** {@link KTX#KTX_TRUE TRUE} if the texture's format is a block compressed format */
    @NativeType("ktx_bool_t")
    public boolean isCompressed() { return nisCompressed(address()); }
    /** {@link KTX#KTX_TRUE TRUE} if mipmaps should be generated for the texture by {@link KTX#ktxTexture_GLUpload Texture_GLUpload} or {@link KTXVulkan#ktxTexture_VkUpload Texture_VkUpload} */
    @NativeType("ktx_bool_t")
    public boolean generateMipmaps() { return ngenerateMipmaps(address()); }
    /** width of the texture's base level */
    @NativeType("ktx_uint32_t")
    public int baseWidth() { return nbaseWidth(address()); }
    /** height of the texture's base level */
    @NativeType("ktx_uint32_t")
    public int baseHeight() { return nbaseHeight(address()); }
    /** depth of the texture's base level */
    @NativeType("ktx_uint32_t")
    public int baseDepth() { return nbaseDepth(address()); }
    /** number of dimensions in the texture: 1, 2 or 3. */
    @NativeType("ktx_uint32_t")
    public int numDimensions() { return nnumDimensions(address()); }
    /**
     * number of mip levels in the texture.
     * 
     * <p>Must be 1, if {@code generateMipmaps} is {@link KTX#KTX_TRUE TRUE}. Can be less than a full pyramid but always starts at the base level.</p>
     */
    @NativeType("ktx_uint32_t")
    public int numLevels() { return nnumLevels(address()); }
    /** number of array layers in the texture */
    @NativeType("ktx_uint32_t")
    public int numLayers() { return nnumLayers(address()); }
    /** number of faces: 6 for cube maps, 1 otherwise */
    @NativeType("ktx_uint32_t")
    public int numFaces() { return nnumFaces(address()); }
    /** describes the logical orientation of the images in each dimension */
    @NativeType("struct ktxOrientation")
    public ktxOrientation orientation() { return norientation(address()); }
    /** head of the hash list of metadata */
    @NativeType("ktxHashList")
    public long kvDataHead() { return nkvDataHead(address()); }
    /** length of the metadata, if it has been extracted in its raw form, otherwise 0 */
    @NativeType("ktx_uint32_t")
    public int kvDataLen() { return nkvDataLen(address()); }
    /** pointer to the metadata, if it has been extracted in its raw form, otherwise {@code NULL} */
    @Nullable
    @NativeType("ktx_uint8_t *")
    public ByteBuffer kvData() { return nkvData(address()); }
    /** byte length of the texture's uncompressed image data */
    @NativeType("ktx_size_t")
    public long dataSize() { return ndataSize(address()); }
    /** pointer to the start of the image data */
    @NativeType("ktx_uint8_t *")
    public ByteBuffer pData() { return npData(address()); }
    /** @return the value of the {@code vkFormat} field. */
    @NativeType("ktx_uint32_t")
    public int vkFormat() { return nvkFormat(address()); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code pDfd} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("ktx_uint32_t *")
    public IntBuffer pDfd(int capacity) { return npDfd(address(), capacity); }
    /** @return the value of the {@code supercompressionScheme} field. */
    @NativeType("ktxSupercmpScheme")
    public int supercompressionScheme() { return nsupercompressionScheme(address()); }
    /** @return the value of the {@code isVideo} field. */
    @NativeType("ktx_bool_t")
    public boolean isVideo() { return nisVideo(address()); }
    /** @return the value of the {@code duration} field. */
    @NativeType("ktx_uint32_t")
    public int duration() { return nduration(address()); }
    /** @return the value of the {@code timescale} field. */
    @NativeType("ktx_uint32_t")
    public int timescale() { return ntimescale(address()); }
    /** @return the value of the {@code loopcount} field. */
    @NativeType("ktx_uint32_t")
    public int loopcount() { return nloopcount(address()); }

    // -----------------------------------

    /** Returns a new {@code ktxTexture2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxTexture2 malloc() {
        return new ktxTexture2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxTexture2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxTexture2 calloc() {
        return new ktxTexture2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxTexture2} instance allocated with {@link BufferUtils}. */
    public static ktxTexture2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxTexture2(memAddress(container), container);
    }

    /** Returns a new {@code ktxTexture2} instance for the specified memory address. */
    public static ktxTexture2 create(long address) {
        return new ktxTexture2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture2 createSafe(long address) {
        return address == NULL ? null : new ktxTexture2(address, null);
    }

    /**
     * Returns a new {@link ktxTexture2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxTexture2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxTexture2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxTexture2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTexture2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxTexture2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxTexture2 malloc(MemoryStack stack) {
        return new ktxTexture2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxTexture2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxTexture2 calloc(MemoryStack stack) {
        return new ktxTexture2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxTexture2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxTexture2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxTexture2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #classId}. */
    public static int nclassId(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.CLASSID); }
    /** Unsafe version of {@link #vtbl}. */
    public static ktxTexture_vtbl nvtbl(long struct) { return ktxTexture_vtbl.create(memGetAddress(struct + ktxTexture2.VTBL)); }
    /** Unsafe version of {@link #vvtbl}. */
    public static long nvvtbl(long struct) { return memGetAddress(struct + ktxTexture2.VVTBL); }
    /** Unsafe version of {@link #_protected(int) _protected}. */
    public static PointerBuffer n_protected(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ktxTexture2._PROTECTED), capacity); }
    /** Unsafe version of {@link #isArray}. */
    public static boolean nisArray(long struct) { return UNSAFE.getByte(null, struct + ktxTexture2.ISARRAY) != 0; }
    /** Unsafe version of {@link #isCubemap}. */
    public static boolean nisCubemap(long struct) { return UNSAFE.getByte(null, struct + ktxTexture2.ISCUBEMAP) != 0; }
    /** Unsafe version of {@link #isCompressed}. */
    public static boolean nisCompressed(long struct) { return UNSAFE.getByte(null, struct + ktxTexture2.ISCOMPRESSED) != 0; }
    /** Unsafe version of {@link #generateMipmaps}. */
    public static boolean ngenerateMipmaps(long struct) { return UNSAFE.getByte(null, struct + ktxTexture2.GENERATEMIPMAPS) != 0; }
    /** Unsafe version of {@link #baseWidth}. */
    public static int nbaseWidth(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.BASEWIDTH); }
    /** Unsafe version of {@link #baseHeight}. */
    public static int nbaseHeight(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.BASEHEIGHT); }
    /** Unsafe version of {@link #baseDepth}. */
    public static int nbaseDepth(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.BASEDEPTH); }
    /** Unsafe version of {@link #numDimensions}. */
    public static int nnumDimensions(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.NUMDIMENSIONS); }
    /** Unsafe version of {@link #numLevels}. */
    public static int nnumLevels(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.NUMLEVELS); }
    /** Unsafe version of {@link #numLayers}. */
    public static int nnumLayers(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.NUMLAYERS); }
    /** Unsafe version of {@link #numFaces}. */
    public static int nnumFaces(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.NUMFACES); }
    /** Unsafe version of {@link #orientation}. */
    public static ktxOrientation norientation(long struct) { return ktxOrientation.create(struct + ktxTexture2.ORIENTATION); }
    /** Unsafe version of {@link #kvDataHead}. */
    public static long nkvDataHead(long struct) { return memGetAddress(struct + ktxTexture2.KVDATAHEAD); }
    /** Unsafe version of {@link #kvDataLen}. */
    public static int nkvDataLen(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.KVDATALEN); }
    /** Unsafe version of {@link #kvData() kvData}. */
    @Nullable public static ByteBuffer nkvData(long struct) { return memByteBufferSafe(memGetAddress(struct + ktxTexture2.KVDATA), nkvDataLen(struct)); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + ktxTexture2.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static ByteBuffer npData(long struct) { return memByteBuffer(memGetAddress(struct + ktxTexture2.PDATA), (int)ndataSize(struct)); }
    /** Unsafe version of {@link #vkFormat}. */
    public static int nvkFormat(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.VKFORMAT); }
    /** Unsafe version of {@link #pDfd(int) pDfd}. */
    @Nullable public static IntBuffer npDfd(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + ktxTexture2.PDFD), capacity); }
    /** Unsafe version of {@link #supercompressionScheme}. */
    public static int nsupercompressionScheme(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.SUPERCOMPRESSIONSCHEME); }
    /** Unsafe version of {@link #isVideo}. */
    public static boolean nisVideo(long struct) { return UNSAFE.getByte(null, struct + ktxTexture2.ISVIDEO) != 0; }
    /** Unsafe version of {@link #duration}. */
    public static int nduration(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.DURATION); }
    /** Unsafe version of {@link #timescale}. */
    public static int ntimescale(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.TIMESCALE); }
    /** Unsafe version of {@link #loopcount}. */
    public static int nloopcount(long struct) { return UNSAFE.getInt(null, struct + ktxTexture2.LOOPCOUNT); }
    public static PointerBuffer n_private(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + ktxTexture2._PRIVATE), capacity); }

    // -----------------------------------

    /** An array of {@link ktxTexture2} structs. */
    public static class Buffer extends StructBuffer<ktxTexture2, Buffer> implements NativeResource {

        private static final ktxTexture2 ELEMENT_FACTORY = ktxTexture2.create(-1L);

        /**
         * Creates a new {@code ktxTexture2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxTexture2#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxTexture2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxTexture2#classId} field. */
        @NativeType("class_id")
        public int classId() { return ktxTexture2.nclassId(address()); }
        /** @return a {@link ktxTexture_vtbl} view of the struct pointed to by the {@link ktxTexture2#vtbl} field. */
        @NativeType("struct ktxTexture_vtbl *")
        public ktxTexture_vtbl vtbl() { return ktxTexture2.nvtbl(address()); }
        /** @return the value of the {@link ktxTexture2#vvtbl} field. */
        @NativeType("struct ktxTexture_vvtbl *")
        public long vvtbl() { return ktxTexture2.nvvtbl(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@link ktxTexture2#_protected} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("struct ktxTexture_protected *")
        public PointerBuffer _protected(int capacity) { return ktxTexture2.n_protected(address(), capacity); }
        /** @return the value of the {@link ktxTexture2#isArray} field. */
        @NativeType("ktx_bool_t")
        public boolean isArray() { return ktxTexture2.nisArray(address()); }
        /** @return the value of the {@link ktxTexture2#isCubemap} field. */
        @NativeType("ktx_bool_t")
        public boolean isCubemap() { return ktxTexture2.nisCubemap(address()); }
        /** @return the value of the {@link ktxTexture2#isCompressed} field. */
        @NativeType("ktx_bool_t")
        public boolean isCompressed() { return ktxTexture2.nisCompressed(address()); }
        /** @return the value of the {@link ktxTexture2#generateMipmaps} field. */
        @NativeType("ktx_bool_t")
        public boolean generateMipmaps() { return ktxTexture2.ngenerateMipmaps(address()); }
        /** @return the value of the {@link ktxTexture2#baseWidth} field. */
        @NativeType("ktx_uint32_t")
        public int baseWidth() { return ktxTexture2.nbaseWidth(address()); }
        /** @return the value of the {@link ktxTexture2#baseHeight} field. */
        @NativeType("ktx_uint32_t")
        public int baseHeight() { return ktxTexture2.nbaseHeight(address()); }
        /** @return the value of the {@link ktxTexture2#baseDepth} field. */
        @NativeType("ktx_uint32_t")
        public int baseDepth() { return ktxTexture2.nbaseDepth(address()); }
        /** @return the value of the {@link ktxTexture2#numDimensions} field. */
        @NativeType("ktx_uint32_t")
        public int numDimensions() { return ktxTexture2.nnumDimensions(address()); }
        /** @return the value of the {@link ktxTexture2#numLevels} field. */
        @NativeType("ktx_uint32_t")
        public int numLevels() { return ktxTexture2.nnumLevels(address()); }
        /** @return the value of the {@link ktxTexture2#numLayers} field. */
        @NativeType("ktx_uint32_t")
        public int numLayers() { return ktxTexture2.nnumLayers(address()); }
        /** @return the value of the {@link ktxTexture2#numFaces} field. */
        @NativeType("ktx_uint32_t")
        public int numFaces() { return ktxTexture2.nnumFaces(address()); }
        /** @return a {@link ktxOrientation} view of the {@link ktxTexture2#orientation} field. */
        @NativeType("struct ktxOrientation")
        public ktxOrientation orientation() { return ktxTexture2.norientation(address()); }
        /** @return the value of the {@link ktxTexture2#kvDataHead} field. */
        @NativeType("ktxHashList")
        public long kvDataHead() { return ktxTexture2.nkvDataHead(address()); }
        /** @return the value of the {@link ktxTexture2#kvDataLen} field. */
        @NativeType("ktx_uint32_t")
        public int kvDataLen() { return ktxTexture2.nkvDataLen(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link ktxTexture2#kvData} field. */
        @Nullable
        @NativeType("ktx_uint8_t *")
        public ByteBuffer kvData() { return ktxTexture2.nkvData(address()); }
        /** @return the value of the {@link ktxTexture2#dataSize} field. */
        @NativeType("ktx_size_t")
        public long dataSize() { return ktxTexture2.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link ktxTexture2#pData} field. */
        @NativeType("ktx_uint8_t *")
        public ByteBuffer pData() { return ktxTexture2.npData(address()); }
        /** @return the value of the {@code vkFormat} field. */
        @NativeType("ktx_uint32_t")
        public int vkFormat() { return ktxTexture2.nvkFormat(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code pDfd} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("ktx_uint32_t *")
        public IntBuffer pDfd(int capacity) { return ktxTexture2.npDfd(address(), capacity); }
        /** @return the value of the {@code supercompressionScheme} field. */
        @NativeType("ktxSupercmpScheme")
        public int supercompressionScheme() { return ktxTexture2.nsupercompressionScheme(address()); }
        /** @return the value of the {@code isVideo} field. */
        @NativeType("ktx_bool_t")
        public boolean isVideo() { return ktxTexture2.nisVideo(address()); }
        /** @return the value of the {@code duration} field. */
        @NativeType("ktx_uint32_t")
        public int duration() { return ktxTexture2.nduration(address()); }
        /** @return the value of the {@code timescale} field. */
        @NativeType("ktx_uint32_t")
        public int timescale() { return ktxTexture2.ntimescale(address()); }
        /** @return the value of the {@code loopcount} field. */
        @NativeType("ktx_uint32_t")
        public int loopcount() { return ktxTexture2.nloopcount(address()); }

    }

}