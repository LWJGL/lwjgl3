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
 * Structure for passing texture information to {@link KTX#ktxTexture1_Create Texture1_Create} and {@link KTX#ktxTexture2_Create Texture2_Create}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxTextureCreateInfo {
 *     ktx_uint32_t {@link #glInternalformat};
 *     ktx_uint32_t {@link #vkFormat};
 *     ktx_uint32_t * {@link #pDfd};
 *     ktx_uint32_t {@link #baseWidth};
 *     ktx_uint32_t {@link #baseHeight};
 *     ktx_uint32_t {@link #baseDepth};
 *     ktx_uint32_t {@link #numDimensions};
 *     ktx_uint32_t {@link #numLevels};
 *     ktx_uint32_t {@link #numLayers};
 *     ktx_uint32_t {@link #numFaces};
 *     ktx_bool_t {@link #isArray};
 *     ktx_bool_t {@link #generateMipmaps};
 * }</code></pre>
 */
public class ktxTextureCreateInfo extends Struct<ktxTextureCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLINTERNALFORMAT,
        VKFORMAT,
        PDFD,
        BASEWIDTH,
        BASEHEIGHT,
        BASEDEPTH,
        NUMDIMENSIONS,
        NUMLEVELS,
        NUMLAYERS,
        NUMFACES,
        ISARRAY,
        GENERATEMIPMAPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLINTERNALFORMAT = layout.offsetof(0);
        VKFORMAT = layout.offsetof(1);
        PDFD = layout.offsetof(2);
        BASEWIDTH = layout.offsetof(3);
        BASEHEIGHT = layout.offsetof(4);
        BASEDEPTH = layout.offsetof(5);
        NUMDIMENSIONS = layout.offsetof(6);
        NUMLEVELS = layout.offsetof(7);
        NUMLAYERS = layout.offsetof(8);
        NUMFACES = layout.offsetof(9);
        ISARRAY = layout.offsetof(10);
        GENERATEMIPMAPS = layout.offsetof(11);
    }

    protected ktxTextureCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxTextureCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ktxTextureCreateInfo(address, container);
    }

    /**
     * Creates a {@code ktxTextureCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxTextureCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** internal format for the texture, e.g., {@code GL_RGB8}. Ignored when creating a {@code ktxTexture2}. */
    @NativeType("ktx_uint32_t")
    public int glInternalformat() { return nglInternalformat(address()); }
    /** {@code vkFormat} for texture. Ignored when creating a {@code ktxTexture1}. */
    @NativeType("ktx_uint32_t")
    public int vkFormat() { return nvkFormat(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return pointer to DFD. Used only when creating a {@code ktxTexture2} and only if {@code vkFormat} is {@code VK_FORMAT_UNDEFINED}.
     */
    @Nullable
    @NativeType("ktx_uint32_t *")
    public IntBuffer pDfd(int capacity) { return npDfd(address(), capacity); }
    /** width of the base level of the texture */
    @NativeType("ktx_uint32_t")
    public int baseWidth() { return nbaseWidth(address()); }
    /** height of the base level of the texture */
    @NativeType("ktx_uint32_t")
    public int baseHeight() { return nbaseHeight(address()); }
    /** depth of the base level of the texture */
    @NativeType("ktx_uint32_t")
    public int baseDepth() { return nbaseDepth(address()); }
    /** number of dimensions in the texture, 1, 2 or 3 */
    @NativeType("ktx_uint32_t")
    public int numDimensions() { return nnumDimensions(address()); }
    /** number of mip levels in the texture. Should be 1 if {@code generateMipmaps} is {@link KTX#KTX_TRUE TRUE}. */
    @NativeType("ktx_uint32_t")
    public int numLevels() { return nnumLevels(address()); }
    /** number of array layers in the texture */
    @NativeType("ktx_uint32_t")
    public int numLayers() { return nnumLayers(address()); }
    /** number of faces: 6 for cube maps, 1 otherwise */
    @NativeType("ktx_uint32_t")
    public int numFaces() { return nnumFaces(address()); }
    /** set to {@link KTX#KTX_TRUE TRUE} if the texture is to be an array texture. Means OpenGL will use a {@code GL_TEXTURE_*_ARRAY} target. */
    @NativeType("ktx_bool_t")
    public boolean isArray() { return nisArray(address()); }
    /** set to {@link KTX#KTX_TRUE TRUE} if mipmaps should be generated for the texture when loading into a 3D API */
    @NativeType("ktx_bool_t")
    public boolean generateMipmaps() { return ngenerateMipmaps(address()); }

    /** Sets the specified value to the {@link #glInternalformat} field. */
    public ktxTextureCreateInfo glInternalformat(@NativeType("ktx_uint32_t") int value) { nglInternalformat(address(), value); return this; }
    /** Sets the specified value to the {@link #vkFormat} field. */
    public ktxTextureCreateInfo vkFormat(@NativeType("ktx_uint32_t") int value) { nvkFormat(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDfd} field. */
    public ktxTextureCreateInfo pDfd(@Nullable @NativeType("ktx_uint32_t *") IntBuffer value) { npDfd(address(), value); return this; }
    /** Sets the specified value to the {@link #baseWidth} field. */
    public ktxTextureCreateInfo baseWidth(@NativeType("ktx_uint32_t") int value) { nbaseWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #baseHeight} field. */
    public ktxTextureCreateInfo baseHeight(@NativeType("ktx_uint32_t") int value) { nbaseHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #baseDepth} field. */
    public ktxTextureCreateInfo baseDepth(@NativeType("ktx_uint32_t") int value) { nbaseDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #numDimensions} field. */
    public ktxTextureCreateInfo numDimensions(@NativeType("ktx_uint32_t") int value) { nnumDimensions(address(), value); return this; }
    /** Sets the specified value to the {@link #numLevels} field. */
    public ktxTextureCreateInfo numLevels(@NativeType("ktx_uint32_t") int value) { nnumLevels(address(), value); return this; }
    /** Sets the specified value to the {@link #numLayers} field. */
    public ktxTextureCreateInfo numLayers(@NativeType("ktx_uint32_t") int value) { nnumLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #numFaces} field. */
    public ktxTextureCreateInfo numFaces(@NativeType("ktx_uint32_t") int value) { nnumFaces(address(), value); return this; }
    /** Sets the specified value to the {@link #isArray} field. */
    public ktxTextureCreateInfo isArray(@NativeType("ktx_bool_t") boolean value) { nisArray(address(), value); return this; }
    /** Sets the specified value to the {@link #generateMipmaps} field. */
    public ktxTextureCreateInfo generateMipmaps(@NativeType("ktx_bool_t") boolean value) { ngenerateMipmaps(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxTextureCreateInfo set(
        int glInternalformat,
        int vkFormat,
        @Nullable IntBuffer pDfd,
        int baseWidth,
        int baseHeight,
        int baseDepth,
        int numDimensions,
        int numLevels,
        int numLayers,
        int numFaces,
        boolean isArray,
        boolean generateMipmaps
    ) {
        glInternalformat(glInternalformat);
        vkFormat(vkFormat);
        pDfd(pDfd);
        baseWidth(baseWidth);
        baseHeight(baseHeight);
        baseDepth(baseDepth);
        numDimensions(numDimensions);
        numLevels(numLevels);
        numLayers(numLayers);
        numFaces(numFaces);
        isArray(isArray);
        generateMipmaps(generateMipmaps);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxTextureCreateInfo set(ktxTextureCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxTextureCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxTextureCreateInfo malloc() {
        return new ktxTextureCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxTextureCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxTextureCreateInfo calloc() {
        return new ktxTextureCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxTextureCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ktxTextureCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxTextureCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ktxTextureCreateInfo} instance for the specified memory address. */
    public static ktxTextureCreateInfo create(long address) {
        return new ktxTextureCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTextureCreateInfo createSafe(long address) {
        return address == NULL ? null : new ktxTextureCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ktxTextureCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxTextureCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxTextureCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxTextureCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxTextureCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxTextureCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxTextureCreateInfo malloc(MemoryStack stack) {
        return new ktxTextureCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxTextureCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxTextureCreateInfo calloc(MemoryStack stack) {
        return new ktxTextureCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxTextureCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxTextureCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxTextureCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glInternalformat}. */
    public static int nglInternalformat(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.GLINTERNALFORMAT); }
    /** Unsafe version of {@link #vkFormat}. */
    public static int nvkFormat(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.VKFORMAT); }
    /** Unsafe version of {@link #pDfd(int) pDfd}. */
    @Nullable public static IntBuffer npDfd(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + ktxTextureCreateInfo.PDFD), capacity); }
    /** Unsafe version of {@link #baseWidth}. */
    public static int nbaseWidth(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.BASEWIDTH); }
    /** Unsafe version of {@link #baseHeight}. */
    public static int nbaseHeight(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.BASEHEIGHT); }
    /** Unsafe version of {@link #baseDepth}. */
    public static int nbaseDepth(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.BASEDEPTH); }
    /** Unsafe version of {@link #numDimensions}. */
    public static int nnumDimensions(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.NUMDIMENSIONS); }
    /** Unsafe version of {@link #numLevels}. */
    public static int nnumLevels(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.NUMLEVELS); }
    /** Unsafe version of {@link #numLayers}. */
    public static int nnumLayers(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.NUMLAYERS); }
    /** Unsafe version of {@link #numFaces}. */
    public static int nnumFaces(long struct) { return UNSAFE.getInt(null, struct + ktxTextureCreateInfo.NUMFACES); }
    /** Unsafe version of {@link #isArray}. */
    public static boolean nisArray(long struct) { return UNSAFE.getByte(null, struct + ktxTextureCreateInfo.ISARRAY) != 0; }
    /** Unsafe version of {@link #generateMipmaps}. */
    public static boolean ngenerateMipmaps(long struct) { return UNSAFE.getByte(null, struct + ktxTextureCreateInfo.GENERATEMIPMAPS) != 0; }

    /** Unsafe version of {@link #glInternalformat(int) glInternalformat}. */
    public static void nglInternalformat(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.GLINTERNALFORMAT, value); }
    /** Unsafe version of {@link #vkFormat(int) vkFormat}. */
    public static void nvkFormat(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.VKFORMAT, value); }
    /** Unsafe version of {@link #pDfd(IntBuffer) pDfd}. */
    public static void npDfd(long struct, @Nullable IntBuffer value) { memPutAddress(struct + ktxTextureCreateInfo.PDFD, memAddressSafe(value)); }
    /** Unsafe version of {@link #baseWidth(int) baseWidth}. */
    public static void nbaseWidth(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.BASEWIDTH, value); }
    /** Unsafe version of {@link #baseHeight(int) baseHeight}. */
    public static void nbaseHeight(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.BASEHEIGHT, value); }
    /** Unsafe version of {@link #baseDepth(int) baseDepth}. */
    public static void nbaseDepth(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.BASEDEPTH, value); }
    /** Unsafe version of {@link #numDimensions(int) numDimensions}. */
    public static void nnumDimensions(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.NUMDIMENSIONS, value); }
    /** Unsafe version of {@link #numLevels(int) numLevels}. */
    public static void nnumLevels(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.NUMLEVELS, value); }
    /** Unsafe version of {@link #numLayers(int) numLayers}. */
    public static void nnumLayers(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.NUMLAYERS, value); }
    /** Unsafe version of {@link #numFaces(int) numFaces}. */
    public static void nnumFaces(long struct, int value) { UNSAFE.putInt(null, struct + ktxTextureCreateInfo.NUMFACES, value); }
    /** Unsafe version of {@link #isArray(boolean) isArray}. */
    public static void nisArray(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxTextureCreateInfo.ISARRAY, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #generateMipmaps(boolean) generateMipmaps}. */
    public static void ngenerateMipmaps(long struct, boolean value) { UNSAFE.putByte(null, struct + ktxTextureCreateInfo.GENERATEMIPMAPS, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link ktxTextureCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ktxTextureCreateInfo, Buffer> implements NativeResource {

        private static final ktxTextureCreateInfo ELEMENT_FACTORY = ktxTextureCreateInfo.create(-1L);

        /**
         * Creates a new {@code ktxTextureCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxTextureCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxTextureCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxTextureCreateInfo#glInternalformat} field. */
        @NativeType("ktx_uint32_t")
        public int glInternalformat() { return ktxTextureCreateInfo.nglInternalformat(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#vkFormat} field. */
        @NativeType("ktx_uint32_t")
        public int vkFormat() { return ktxTextureCreateInfo.nvkFormat(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link ktxTextureCreateInfo#pDfd} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("ktx_uint32_t *")
        public IntBuffer pDfd(int capacity) { return ktxTextureCreateInfo.npDfd(address(), capacity); }
        /** @return the value of the {@link ktxTextureCreateInfo#baseWidth} field. */
        @NativeType("ktx_uint32_t")
        public int baseWidth() { return ktxTextureCreateInfo.nbaseWidth(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#baseHeight} field. */
        @NativeType("ktx_uint32_t")
        public int baseHeight() { return ktxTextureCreateInfo.nbaseHeight(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#baseDepth} field. */
        @NativeType("ktx_uint32_t")
        public int baseDepth() { return ktxTextureCreateInfo.nbaseDepth(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#numDimensions} field. */
        @NativeType("ktx_uint32_t")
        public int numDimensions() { return ktxTextureCreateInfo.nnumDimensions(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#numLevels} field. */
        @NativeType("ktx_uint32_t")
        public int numLevels() { return ktxTextureCreateInfo.nnumLevels(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#numLayers} field. */
        @NativeType("ktx_uint32_t")
        public int numLayers() { return ktxTextureCreateInfo.nnumLayers(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#numFaces} field. */
        @NativeType("ktx_uint32_t")
        public int numFaces() { return ktxTextureCreateInfo.nnumFaces(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#isArray} field. */
        @NativeType("ktx_bool_t")
        public boolean isArray() { return ktxTextureCreateInfo.nisArray(address()); }
        /** @return the value of the {@link ktxTextureCreateInfo#generateMipmaps} field. */
        @NativeType("ktx_bool_t")
        public boolean generateMipmaps() { return ktxTextureCreateInfo.ngenerateMipmaps(address()); }

        /** Sets the specified value to the {@link ktxTextureCreateInfo#glInternalformat} field. */
        public ktxTextureCreateInfo.Buffer glInternalformat(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nglInternalformat(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#vkFormat} field. */
        public ktxTextureCreateInfo.Buffer vkFormat(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nvkFormat(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link ktxTextureCreateInfo#pDfd} field. */
        public ktxTextureCreateInfo.Buffer pDfd(@Nullable @NativeType("ktx_uint32_t *") IntBuffer value) { ktxTextureCreateInfo.npDfd(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#baseWidth} field. */
        public ktxTextureCreateInfo.Buffer baseWidth(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nbaseWidth(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#baseHeight} field. */
        public ktxTextureCreateInfo.Buffer baseHeight(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nbaseHeight(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#baseDepth} field. */
        public ktxTextureCreateInfo.Buffer baseDepth(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nbaseDepth(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#numDimensions} field. */
        public ktxTextureCreateInfo.Buffer numDimensions(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nnumDimensions(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#numLevels} field. */
        public ktxTextureCreateInfo.Buffer numLevels(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nnumLevels(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#numLayers} field. */
        public ktxTextureCreateInfo.Buffer numLayers(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nnumLayers(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#numFaces} field. */
        public ktxTextureCreateInfo.Buffer numFaces(@NativeType("ktx_uint32_t") int value) { ktxTextureCreateInfo.nnumFaces(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#isArray} field. */
        public ktxTextureCreateInfo.Buffer isArray(@NativeType("ktx_bool_t") boolean value) { ktxTextureCreateInfo.nisArray(address(), value); return this; }
        /** Sets the specified value to the {@link ktxTextureCreateInfo#generateMipmaps} field. */
        public ktxTextureCreateInfo.Buffer generateMipmaps(@NativeType("ktx_bool_t") boolean value) { ktxTextureCreateInfo.ngenerateMipmaps(address(), value); return this; }

    }

}